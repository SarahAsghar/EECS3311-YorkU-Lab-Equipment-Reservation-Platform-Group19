package controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import model.DatabaseManager;
import model.Reservation.ConfirmedState;
import model.Reservation.PendingState;
import model.Reservation.Reservation;
import model.User.User;

public class ReservationController {
	/**
	 * Singular instance of class
	 */
    private static ReservationController instance;
    
    private ReservationController() {
    }

    /**
     * get instance of controller
     * @return ReservationController instance
     */
    public static ReservationController getInstance() {
        if(instance == null) {
            instance = new ReservationController();
        }
        return instance;
    }

    /**
     * Cancel reservation of user
     * @param reservationId: reservation to cancel
     * @return boolean if worked or not
     */
    public boolean cancelReservation(String reservationId) {
        DatabaseManager db = DatabaseManager.getInstance();
        ArrayList<Reservation> allReservations = db.loadReservations();
        
        for (Reservation r : allReservations) {
            if (r.getReservationId().equals(reservationId)) {
                if (r.getState() instanceof ConfirmedState) {
                	allReservations.remove(r);
                	db.saveReservation(allReservations);
                    return db.deleteReservation(reservationId);
                }
            }
        }
        return false;
    }

    /**
     * Update reservation times
     * @param reservationId: reservation to update
     * @param equipmentId: Equipment to update
     * @param newStartTime: new start time to update
     * @param newEndTime: new end time to update
     * @return boolean if worked or not
     */
    public boolean updateReservation(String reservationId, String equipmentId, 
            LocalDateTime newStartTime, LocalDateTime newEndTime) {
        DatabaseManager db = DatabaseManager.getInstance();
        ArrayList<Reservation> allReservations = db.loadReservations();
        
        for (Reservation r : allReservations) {
            if (!r.getReservationId().equals(reservationId) && 
                r.getEquipmentID().equals(equipmentId)) {
                if (isTimeOverlap(newStartTime, newEndTime, r.getStartTime(), r.getEndTime())) {
                    return false; 
                }
            }
        }
        
        for (Reservation r : allReservations) {
            if (r.getReservationId().equals(reservationId)) {
                r.setStartTime(newStartTime);
                r.setEndTime(newEndTime);
                return db.updateReservation(r);
            }
        }
        return false;
    }

    /**
     * Create new reservation, checks if time overlaps with anyone else with same id
     * @param equipID equipment id to be used in reservation
     * @param startTime start time of reservation
     * @param endTime end time of reservation
     * @return Reservation created
     */
    public Reservation createReservation(String equipID, LocalDateTime startTime, 
            LocalDateTime endTime) {
        User u = UserController.getLoggedInUser();
        DatabaseManager db = DatabaseManager.getInstance();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmm");
        String startStr = startTime.format(formatter);
        String endStr = endTime.format(formatter);
        String reservationId = equipID + "_" + startStr + "_" + endStr;
        
        ArrayList<Reservation> allReservations = db.loadReservations();
        
        //check if time slot is open
        for (Reservation r : allReservations) {
            if (r.getEquipmentID().equals(equipID)) {
                if (isTimeOverlap(startTime, endTime, r.getStartTime(), r.getEndTime())) {
                    System.out.println("Time slot already taken for equipment: " + equipID);
                    return null;
                }
            }
        }
        
        //check if valid time
        if (startTime.isBefore(LocalDateTime.now())) {
            System.out.println("Start time cannot be in the past");
            return null;
        }
        
        if (!endTime.isAfter(startTime)) {
            System.out.println("End time must be after start time");
            return null;
        }
        
        //place max time on time reservation
        LocalDateTime threeMonthsLater = LocalDateTime.now().plusMonths(3);
        if (startTime.isAfter(threeMonthsLater) || endTime.isAfter(threeMonthsLater)) {
            System.out.println("Reservation cannot be more than 3 months in advance");
            return null;
        }
        
        
        Reservation newReservation = new Reservation(reservationId, equipID, startTime, 
                endTime, new PendingState());
        newReservation.setUserID(u.getEmail());
        
        allReservations.add(newReservation);
        boolean saved = db.saveReservation(allReservations);
        
        if (saved) {
            return newReservation;
        }
        return null;
    }
    
    /**
     * Create reservation with given reservation
     * @param r: Reservation to copy
     * @return Reservation made
     */
    public Reservation createReservation(Reservation r) {
        return createReservation(r.getEquipmentID(), r.getStartTime(), r.getEndTime());
    }
    
    /**
     * checks if the time overlaps
     * @param start1: Start of Reservation1
     * @param end1: end of reservation 1
     * @param start2: start of reservation 2
     * @param end2: end of reservation 2
     * @return boolean: time is overlap or not
     */
    private boolean isTimeOverlap(LocalDateTime start1, LocalDateTime end1, 
                                   LocalDateTime start2, LocalDateTime end2) {
        return start1.isBefore(end2) && end1.isAfter(start2);
    }
    
    /**
     * Returns reservations of equipments
     * @param equipmentId: Equipment to find reservations of
     * @return ArrayList<Reservation> with the same equipments
     */
    public ArrayList<Reservation> getReservationsByEquipment(String equipmentId) {
        DatabaseManager db = DatabaseManager.getInstance();
        ArrayList<Reservation> allReservations = db.loadReservations();
        ArrayList<Reservation> equipmentReservations = new ArrayList<>();
        
        for (Reservation r : allReservations) {
            if (r.getEquipmentID().equals(equipmentId)) {
                equipmentReservations.add(r);
            }
        }
        return equipmentReservations;
    }
    
    /**
     * Get User reservations
     * @return ArrayList<Reservation> of user reservations
     */
    public ArrayList<Reservation> getMyReservations() {
        User currentUser = UserController.getLoggedInUser();
        if (currentUser == null) {
            return new ArrayList<>();
        }
        
        DatabaseManager db = DatabaseManager.getInstance();
        ArrayList<Reservation> allReservations = db.loadReservations();
        ArrayList<Reservation> myReservations = new ArrayList<>();
        
        for (Reservation r : allReservations) {
            if (r.getUserId() != null && 
                r.getUserId().equals(currentUser.getEmail())) {
                myReservations.add(r);
            }
        }
        return myReservations;
    }
    
    /**
     * Checks if time slot id available
     * @param equipmentId: equipment to check
     * @param startTime: start time of reservation
     * @param endTime: end time of reservation
     * @return boolean available or not
     */
    public boolean isTimeSlotAvailable(String equipmentId, LocalDateTime startTime, 
            LocalDateTime endTime) {
        DatabaseManager db = DatabaseManager.getInstance();
        ArrayList<Reservation> allReservations = db.loadReservations();
        
        for (Reservation r : allReservations) {
            if (r.getEquipmentID().equals(equipmentId)) {
                if (isTimeOverlap(startTime, endTime, r.getStartTime(), r.getEndTime())) {
                    return false;
                }
            }
        }
        return true;
    }
}