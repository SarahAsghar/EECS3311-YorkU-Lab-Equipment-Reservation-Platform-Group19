package model.Reservation;

import java.time.LocalDateTime;

public class ActiveState implements ReservationState {

    @Override
    public void extend(Reservation reservation, LocalDateTime newEndTime) {
        if (newEndTime == null) {
            throw new IllegalArgumentException("New end time cannot be null.");
        }

        if (!newEndTime.isAfter(reservation.getEndTime())) {
            throw new IllegalArgumentException("New end time must be after current end time.");
        }

        reservation.setEndTime(newEndTime);
    }

    @Override
    public void cancel(Reservation reservation) {
        throw new IllegalStateException("Active reservation cannot be cancelled.");
    }

    @Override
    public void checkArrival(Reservation reservation) {
        if (LocalDateTime.now().isAfter(reservation.getEndTime())) {
            reservation.setState(new CompletedState());
        }
    }
}
