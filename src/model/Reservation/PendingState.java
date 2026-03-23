package model.Reservation;

import java.util.Date;

public class PendingState implements ReservationState{

	public void extend(Reservation reservation, Date extension) {
		reservation.extendReservation(extension);
		
	}

	
	public void cancel(Reservation reservation) {
		reservation.cancelReservation();
		
	}

	
	public Date checkArrival(Reservation reservation) {
		return reservation.checkArrival();
		
	}
}
