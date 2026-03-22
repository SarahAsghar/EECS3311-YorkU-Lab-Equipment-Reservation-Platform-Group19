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
    private static ReservationController instance;
    
    private ReservationController() {
    }

    public static ReservationController getInstance() {
        if(instance == null) {
            instance = new ReservationController();
        }
        return instance;
    }

    public boolean cancelReservation(String reservationId) {
        DatabaseManager db = DatabaseManager.getInstance();
        ArrayList<Reservation> allReservations = db.loadReservations();
        
        for (Reservation r : allReservations) {
            if (r.getReservationId().equals(reservationId)) {
                if (r.getState() instanceof ConfirmedState) {
                    return db.deleteReservation(reservationId);
                }
            }
        }
        return false;
    }

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

    public Reservation createReservation(String equipID, LocalDateTime startTime, 
            LocalDateTime endTime) {
        User u = UserController.getLoggedInUser();
        DatabaseManager db = DatabaseManager.getInstance();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmm");
        String startStr = startTime.format(formatter);
        String endStr = endTime.format(formatter);
        String reservationId = equipID + "_" + startStr + "_" + endStr;
        
        ArrayList<Reservation> allReservations = db.loadReservations();
        
        for (Reservation r : allReservations) {
            if (r.getEquipmentID().equals(equipID)) {
                if (isTimeOverlap(startTime, endTime, r.getStartTime(), r.getEndTime())) {
                    System.out.println("Time slot already taken for equipment: " + equipID);
                    return null;
                }
            }
        }
        
        if (startTime.isBefore(LocalDateTime.now())) {
            System.out.println("Start time cannot be in the past");
            return null;
        }
        
        if (!endTime.isAfter(startTime)) {
            System.out.println("End time must be after start time");
            return null;
        }
        
        LocalDateTime threeMonthsLater = LocalDateTime.now().plusMonths(3);
        if (startTime.isAfter(threeMonthsLater) || endTime.isAfter(threeMonthsLater)) {
            System.out.println("Reservation cannot be more than 3 months in advance");
            return null;
        }
        
        Reservation newReservation = new Reservation(reservationId, equipID, startTime, 
                endTime, new PendingState());
        newReservation.setUserID(u.getEmail());
        
        boolean saved = db.saveReservation(newReservation);
        
        if (saved) {
            return newReservation;
        }
        return null;
    }
    
    public Reservation createReservation(Reservation r) {
        return createReservation(r.getEquipmentID(), r.getStartTime(), r.getEndTime());
    }
    
    private boolean isTimeOverlap(LocalDateTime start1, LocalDateTime end1, 
                                   LocalDateTime start2, LocalDateTime end2) {
        return start1.isBefore(end2) && end1.isAfter(start2);
    }
    
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