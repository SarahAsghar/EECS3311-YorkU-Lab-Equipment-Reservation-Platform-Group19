package model.Reservation;

import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Reservation {

	private String reservationId;
	private String userId;
	private String EquipmentID;
	private Date startTime;
	private Date endTime;
	
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
	

}
