package model.Reservation;

import java.time.LocalDateTime;

public class PendingState implements ReservationState {

    @Override
    public void extend(Reservation reservation, LocalDateTime newEndTime) {
        throw new IllegalStateException("Pending reservation cannot be extended.");
    }

    @Override
    public void cancel(Reservation reservation) {
        reservation.setState(new CancelledState());
    }

    @Override
    public void checkArrival(Reservation reservation) {
        if (LocalDateTime.now().isAfter(reservation.getStartTime())) {
            reservation.setState(new ActiveState());
        }
    }
}
