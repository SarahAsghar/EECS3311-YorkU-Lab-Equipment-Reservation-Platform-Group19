package model.Reservation;

import java.util.Date;
import java.util.Random;

public class Reservation {

	private String reservationId;
	private String userId;
	private String EquipmentID;
	private Date startTime;
	private Date endTime;
	private Date actualArrivalTime;
	private ReservationStatus status;
	
	public Reservation(String reserveID, String userID, String EquipmentID, Date start, Date end, Date arrival, ReservationStatus status) {
		this.reservationId = reserveID;
		this.userId = userID;
		this.EquipmentID = EquipmentID;
		this.startTime = start;
		this.endTime = end;
		this.actualArrivalTime = arrival;
		this.status = status;
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

	public Date getStartTime() {
		return startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public ReservationStatus getStatus() {
		return status;
	}

	public void setStatus(ReservationStatus status) {
		this.status = status;
	}

	public Date getActualArrivalTime() {
		return actualArrivalTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
	public void setEquipmentID(String equipmentID) {
		EquipmentID = equipmentID;
	}

	public void setActualArrivalTime(Date actualArrivalTime) {
		this.actualArrivalTime = actualArrivalTime;
	}

	public Reservation createReservation(String userID, String EquipmentID, Date start, Date end) {
		Random idNum = new Random(System.currentTimeMillis() % 1000);
		String id = Integer.toString(idNum.nextInt());
		Date arrival = null;
		ReservationStatus status = ReservationStatus.ACTIVE;
		return new Reservation(id, userID, EquipmentID, start, end, arrival, status);
	}
	
	public void modifyReservation(Reservation r, Date newStartTime, Date newEndTime, String newEquipmentID) {
		Reservation temp = r;
		temp.setStartTime(newStartTime);
		temp.setEndTime(newEndTime);
		temp.setEquipmentID(newEquipmentID);
		r = new Reservation(r.reservationId, r.userId, temp.EquipmentID, temp.startTime, temp.endTime, r.actualArrivalTime, r.status);
	}
	
	public void cancelReservation() {
		this.setStatus(ReservationStatus.CANCELLED);
	}

	public void extendReservation(Date newEndTime) {
		this.setEndTime(newEndTime);
	}
	
	public Date checkArrival() {
		return this.getActualArrivalTime();
	}
	
	public void setState(ReservationState s) {
		this.setState(s);
	}
	
}
