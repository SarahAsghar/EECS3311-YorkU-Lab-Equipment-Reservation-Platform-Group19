package model.Reservation;

import java.time.LocalDateTime;

public class CompletedState implements ReservationState {

    @Override
    public void extend(Reservation reservation, LocalDateTime newEndTime) {
        throw new IllegalStateException("Completed reservation cannot be extended.");
    }

    @Override
    public void cancel(Reservation reservation) {
        throw new IllegalStateException("Completed reservation cannot be cancelled.");
    }

    @Override
    public void checkArrival(Reservation reservation) {
        // no action
    }
}
