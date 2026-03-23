package model.Reservation;

import java.time.LocalDateTime;

public interface ReservationState {
    void extend(Reservation reservation, LocalDateTime newEndTime);
    void cancel(Reservation reservation);
    void checkArrival(Reservation reservation);
}
