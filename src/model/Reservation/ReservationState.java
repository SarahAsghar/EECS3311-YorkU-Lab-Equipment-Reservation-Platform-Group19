package model.Reservation;

import java.util.Date;

public interface ReservationState {

	public void extend(Reservation reservation, Date extension);
	
	public void cancel(Reservation reservation);
	
	public Date checkArrival(Reservation reservation);
}
