import model.Reservation.Reservation;
import model.Reservation.ReservationState;
import model.User.User;
import model.User.UserType;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class ReservationTest {

    private ReservationState makeState() {
        return new ReservationState() {
            @Override
            public void extend(Reservation reservation, LocalDateTime newEndTime) {
                reservation.setEndTime(newEndTime);
            }

            @Override
            public void cancel(Reservation reservation) {
                reservation.cancelReservation();
            }

            @Override
            public void checkArrival(Reservation reservation) {
                // no-op test stub
            }
        };
    }

    @Test
    void constructorStoresReservationId() {
        LocalDateTime start = LocalDateTime.of(2026, 4, 3, 10, 0);
        LocalDateTime end = LocalDateTime.of(2026, 4, 3, 12, 0);

        Reservation reservation = new Reservation("R1", "E1", start, end, makeState());

        assertEquals("R1", reservation.getReservationId());
    }

    @Test
    void constructorStoresEquipmentId() {
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = start.plusHours(2);

        Reservation reservation = new Reservation("R2", "EQ99", start, end, makeState());

        assertEquals("EQ99", reservation.getEquipmentID());
    }

    @Test
    void constructorStoresStartTime() {
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = start.plusHours(2);

        Reservation reservation = new Reservation("R3", "E1", start, end, makeState());

        assertEquals(start, reservation.getStartTime());
    }

    @Test
    void constructorStoresEndTime() {
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = start.plusHours(2);

        Reservation reservation = new Reservation("R4", "E1", start, end, makeState());

        assertEquals(end, reservation.getEndTime());
    }

    @Test
    void setUserIdUpdatesUserId() {
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = start.plusHours(2);

        Reservation reservation = new Reservation("R5", "E1", start, end, makeState());

        reservation.setUserID("user@test.com");

        assertEquals("user@test.com", reservation.getUserId());
    }

    @Test
    void setStateUpdatesReservationState() {
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = start.plusHours(2);

        Reservation reservation = new Reservation("R6", "E1", start, end, makeState());
        ReservationState newState = makeState();

        reservation.setState(newState);

        assertSame(newState, reservation.getState());
    }

    @Test
    void extendReservationUpdatesEndTime() {
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = start.plusHours(2);
        LocalDateTime extended = end.plusHours(1);

        Reservation reservation = new Reservation("R7", "E1", start, end, makeState());

        reservation.extendReservation(extended);

        assertEquals(extended, reservation.getEndTime());
    }

    @Test
    void setStartTimeUpdatesStartTime() {
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = start.plusHours(2);
        LocalDateTime newStart = start.minusHours(1);

        Reservation reservation = new Reservation("R8", "E1", start, end, makeState());

        reservation.setStartTime(newStart);

        assertEquals(newStart, reservation.getStartTime());
    }

    @Test
    void setEndTimeUpdatesEndTime() {
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = start.plusHours(2);
        LocalDateTime newEnd = end.plusHours(3);

        Reservation reservation = new Reservation("R9", "E1", start, end, makeState());

        reservation.setEndTime(newEnd);

        assertEquals(newEnd, reservation.getEndTime());
    }

    @Test
    void calculateHoursReturnsCorrectWholeHours() {
        LocalDateTime start = LocalDateTime.of(2026, 4, 3, 10, 0);
        LocalDateTime end = LocalDateTime.of(2026, 4, 3, 13, 0);

        Reservation reservation = new Reservation("R10", "E1", start, end, makeState());

        assertEquals(3.0, reservation.calculateHours());
    }

    @Test
    void calculateHoursReturnsFractionalHours() {
        LocalDateTime start = LocalDateTime.of(2026, 4, 3, 10, 0);
        LocalDateTime end = LocalDateTime.of(2026, 4, 3, 11, 30);

        Reservation reservation = new Reservation("R11", "E1", start, end, makeState());

        assertEquals(1.5, reservation.calculateHours());
    }

    @Test
    void calculateHoursReturnsZeroWhenStartTimeNull() {
        LocalDateTime end = LocalDateTime.now();

        Reservation reservation = new Reservation("R12", "E1", null, end, makeState());

        assertEquals(0.0, reservation.calculateHours());
    }

    @Test
    void calculateHoursReturnsZeroWhenEndTimeNull() {
        LocalDateTime start = LocalDateTime.now();

        Reservation reservation = new Reservation("R13", "E1", start, null, makeState());

        assertEquals(0.0, reservation.calculateHours());
    }

    @Test
    void calculateTotalCostUsesUserHourlyFee() {
        LocalDateTime start = LocalDateTime.of(2026, 4, 3, 10, 0);
        LocalDateTime end = LocalDateTime.of(2026, 4, 3, 12, 0);

        Reservation reservation = new Reservation("R14", "E1", start, end, makeState());
        User user = new User("student@test.com", "pass", UserType.STUDENT, "S1", "Student");

        assertEquals(20.0, reservation.calculateTotalCost(user));
    }

    @Test
    void calculateTotalCostReturnsZeroForNullUser() {
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = start.plusHours(2);

        Reservation reservation = new Reservation("R15", "E1", start, end, makeState());

        assertEquals(0.0, reservation.calculateTotalCost(null));
    }

    @Test
    void calculateTotalCostReturnsZeroWhenUserTypeIsNull() {
        LocalDateTime start = LocalDateTime.of(2026, 4, 3, 10, 0);
        LocalDateTime end = LocalDateTime.of(2026, 4, 3, 12, 0);

        Reservation reservation = new Reservation("R16", "E1", start, end, makeState());
        User user = new User("x@test.com", "pass", UserType.STUDENT, "S1", "Student");
        user.setUserType(null);

        assertEquals(0.0, reservation.calculateTotalCost(user));
    }

    @Test
    void cancelReservationReturnsSameObject() {
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = start.plusHours(2);

        Reservation reservation = new Reservation("R17", "E1", start, end, makeState());
        Reservation returned = reservation.cancelReservation();

        assertSame(reservation, returned);
    }

    @Test
    void cancelReservationClearsReservationId() {
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = start.plusHours(2);

        Reservation reservation = new Reservation("R18", "E1", start, end, makeState());

        reservation.cancelReservation();

        assertNull(reservation.getReservationId());
    }

    @Test
    void cancelReservationClearsTimes() {
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = start.plusHours(2);

        Reservation reservation = new Reservation("R19", "E1", start, end, makeState());

        reservation.cancelReservation();

        assertNull(reservation.getStartTime());
        assertNull(reservation.getEndTime());
    }

    @Test
    void cancelReservationClearsState() {
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = start.plusHours(2);

        Reservation reservation = new Reservation("R20", "E1", start, end, makeState());

        reservation.cancelReservation();

        assertNull(reservation.getState());
    }

    @Test
    void cancelReservationDoesNotClearEquipmentId() {
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = start.plusHours(2);

        Reservation reservation = new Reservation("R21", "EQ123", start, end, makeState());

        reservation.cancelReservation();

        assertEquals("EQ123", reservation.getEquipmentID());
    }

    @Test
    void cancelReservationDoesNotClearUserId() {
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = start.plusHours(2);

        Reservation reservation = new Reservation("R22", "EQ123", start, end, makeState());
        reservation.setUserID("user@test.com");

        reservation.cancelReservation();

        assertEquals("user@test.com", reservation.getUserId());
    }
}