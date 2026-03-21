package model.Reservation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Reservation {

	private String userId;
	private String EquipmentID;
	
	private String reservationId;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private LocalDateTime actualArrivalTime;
	private ReservationState currentState;
	
	public Reservation(String id, LocalDateTime start, LocalDateTime end, LocalDateTime arrival, ReservationState state) {
		this.reservationId = id;
		this.startTime = start;
		this.endTime = end;
		this.actualArrivalTime = arrival;
		this.currentState = state;
	}
	
	public void setState(ReservationState state) {
		this.currentState = state;
	}
	
	public void extendReservation(LocalDateTime extend) {
		this.startTime = extend;
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
	

}
