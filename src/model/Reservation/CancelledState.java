package model.Reservation;

import java.time.LocalDateTime;

public class CancelledState implements ReservationState {

    @Override
    public void extend(Reservation reservation, LocalDateTime newEndTime) {
        throw new IllegalStateException("Cancelled reservation cannot be extended.");
    }

    @Override
    public void cancel(Reservation reservation) {
        throw new IllegalStateException("Reservation is already cancelled.");
    }

    @Override
    public void checkArrival(Reservation reservation) {
        // no action
    }
}
