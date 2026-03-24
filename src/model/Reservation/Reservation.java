package model.Reservation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import model.User.User;

public class Reservation {

	private String userId;
	private String EquipmentID;
	
	private String reservationId;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private LocalDateTime actualArrivalTime;
	private ReservationState currentState;
	private boolean depositPaid;
	private double price;
	
	public Reservation(String id, String equipID, LocalDateTime start, LocalDateTime end, ReservationState state) {
		this.reservationId = id;
		this.startTime = start;
		this.endTime = end;
		this.currentState = state;
		EquipmentID = equipID;
		depositPaid = false;
	}
	
	public void setState(ReservationState state) {
		this.currentState = state;
	}
	
	public void extendReservation(LocalDateTime extend) {
		this.endTime = extend;
	}
	
	public Reservation cancelReservation() {
		Reservation temp = this;
		this.reservationId = null;
		this.startTime = null;
		this.endTime = null;
		this.actualArrivalTime = null;
		this.currentState = null;
		
		return temp;
	}
	
	public String getReservationId() {
		// TODO Auto-generated method stub
		return reservationId;
	}

	public String getUserId() {
		// TODO Auto-generated method stub
		return userId;
	}

	public String getEquipmentID() {
		return EquipmentID;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public ReservationState getState() {
		// TODO Auto-generated method stub
		return currentState;
	}

	public double calculateHours() {
	    if (startTime != null && endTime != null) {
	        // Calculate the duration in hours
	        long minutes = java.time.Duration.between(startTime, endTime).toMinutes();
	        double hours = minutes / 60.0;
	        // Round to 2 decimal places
	        return Math.round(hours * 100.0) / 100.0;
	    }
	    return 0;
	}

	public double calculateTotalCost(User user) {
	    double hours = calculateHours();
	    if (user != null && user.getUserType() != null) {
	        return hours * user.getUserType().getHourlyFee();
	    }
	    return 0;
	}

	public void setStartTime(LocalDateTime newStartTime) {
		startTime = newStartTime;
	}

	public void setEndTime(LocalDateTime newEndTime) {
		endTime = newEndTime;
	}

	public void setDepositPaid(boolean b) {
		depositPaid = b;
		
	}

	public void setDepositAmount(double amount) {
		price = amount;
		
	}

	public void setUserID(String email) {
		userId = email;
		
	}
	


}
