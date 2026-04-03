import controller.ReservationController;
import controller.UserController;
import model.DatabaseManager;
import model.Reservation.ConfirmedState;
import model.Reservation.PendingState;
import model.Reservation.Reservation;
import model.User.User;
import model.User.UserType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ReservationControllerTest {

    private ReservationController controller;
    private DatabaseManager db;

    @BeforeEach
    void setUp() {
        controller = ReservationController.getInstance();
        db = DatabaseManager.getInstance();
        db.saveReservation(new ArrayList<>());
        UserController.setLoggedInUser(null);
    }

    @Test
    void getInstanceReturnsSameObject() {
        ReservationController c2 = ReservationController.getInstance();
        assertSame(controller, c2);
    }

    @Test
    void cancelReservationReturnsFalseWhenReservationMissing() {
        boolean result = controller.cancelReservation("NOPE");
        assertFalse(result);
    }

    @Test
    void cancelReservationReturnsFalseWhenReservationNotConfirmed() {
        LocalDateTime start = LocalDateTime.now().plusHours(1);
        LocalDateTime end = start.plusHours(2);

        Reservation reservation = new Reservation("R1", "EQ1", start, end, new PendingState());
        ArrayList<Reservation> reservations = new ArrayList<>();
        reservations.add(reservation);
        db.saveReservation(reservations);

        boolean result = controller.cancelReservation("R1");

        assertFalse(result);
    }

    @Test
    void cancelReservationReturnsTrueWhenReservationConfirmed() {
        LocalDateTime start = LocalDateTime.now().plusHours(1);
        LocalDateTime end = start.plusHours(2);

        Reservation reservation = new Reservation("R2", "EQ1", start, end, new ConfirmedState());
        ArrayList<Reservation> reservations = new ArrayList<>();
        reservations.add(reservation);
        db.saveReservation(reservations);

        boolean result = controller.cancelReservation("R2");

        assertTrue(result);
    }

    @Test
    void updateReservationReturnsFalseWhenOverlappingAnotherReservation() {
        LocalDateTime start1 = LocalDateTime.now().plusHours(1);
        LocalDateTime end1 = start1.plusHours(2);

        LocalDateTime start2 = start1.plusMinutes(30);
        LocalDateTime end2 = start2.plusHours(2);

        Reservation r1 = new Reservation("R1", "EQ1", start1, end1, new PendingState());
        Reservation r2 = new Reservation("R2", "EQ1", start2, end2, new PendingState());

        ArrayList<Reservation> reservations = new ArrayList<>();
        reservations.add(r1);
        reservations.add(r2);
        db.saveReservation(reservations);

        boolean result = controller.updateReservation("R1", "EQ1", start2, end2);

        assertFalse(result);
    }

    @Test
    void updateReservationReturnsTrueWhenNoOverlap() {
        LocalDateTime start1 = LocalDateTime.now().plusHours(1);
        LocalDateTime end1 = start1.plusHours(2);

        LocalDateTime start2 = end1.plusHours(1);
        LocalDateTime end2 = start2.plusHours(2);

        Reservation r1 = new Reservation("R1", "EQ1", start1, end1, new PendingState());

        ArrayList<Reservation> reservations = new ArrayList<>();
        reservations.add(r1);
        db.saveReservation(reservations);

        boolean result = controller.updateReservation("R1", "EQ1", start2, end2);

        assertTrue(result);
    }

    @Test
    void updateReservationActuallyChangesTimes() {
        LocalDateTime start1 = LocalDateTime.now().plusHours(1);
        LocalDateTime end1 = start1.plusHours(2);

        LocalDateTime newStart = end1.plusHours(1);
        LocalDateTime newEnd = newStart.plusHours(2);

        Reservation r1 = new Reservation("R1", "EQ1", start1, end1, new PendingState());

        ArrayList<Reservation> reservations = new ArrayList<>();
        reservations.add(r1);
        db.saveReservation(reservations);

        controller.updateReservation("R1", "EQ1", newStart, newEnd);

        ArrayList<Reservation> updated = db.loadReservations();
        assertEquals(newStart, updated.get(0).getStartTime());
        assertEquals(newEnd, updated.get(0).getEndTime());
    }

    @Test
    void createReservationThrowsWhenLoggedInUserMissing() {
        LocalDateTime start = LocalDateTime.now().plusHours(1);
        LocalDateTime end = start.plusHours(2);

        assertThrows(NullPointerException.class, () ->
                controller.createReservation("EQ1", start, end)
        );
    }

    @Test
    void createReservationReturnsNullWhenStartTimeInPast() {
        User user = new User("user@test.com", "Pass123!", UserType.STUDENT, "S1", "User");
        UserController.setLoggedInUser(user);

        LocalDateTime start = LocalDateTime.now().minusHours(1);
        LocalDateTime end = LocalDateTime.now().plusHours(1);

        Reservation result = controller.createReservation("EQ1", start, end);

        assertNull(result);
    }

    @Test
    void createReservationReturnsNullWhenEndNotAfterStart() {
        User user = new User("user@test.com", "Pass123!", UserType.STUDENT, "S1", "User");
        UserController.setLoggedInUser(user);

        LocalDateTime start = LocalDateTime.now().plusHours(2);
        LocalDateTime end = start;

        Reservation result = controller.createReservation("EQ1", start, end);

        assertNull(result);
    }

    @Test
    void createReservationReturnsNullWhenMoreThanThreeMonthsAhead() {
        User user = new User("user@test.com", "Pass123!", UserType.STUDENT, "S1", "User");
        UserController.setLoggedInUser(user);

        LocalDateTime start = LocalDateTime.now().plusMonths(4);
        LocalDateTime end = start.plusHours(2);

        Reservation result = controller.createReservation("EQ1", start, end);

        assertNull(result);
    }

    @Test
    void createReservationReturnsNullWhenTimeOverlapsExistingReservation() {
        User user = new User("user@test.com", "Pass123!", UserType.STUDENT, "S1", "User");
        UserController.setLoggedInUser(user);

        LocalDateTime start1 = LocalDateTime.now().plusHours(1);
        LocalDateTime end1 = start1.plusHours(2);

        Reservation existing = new Reservation("R_EXIST", "EQ1", start1, end1, new PendingState());
        ArrayList<Reservation> reservations = new ArrayList<>();
        reservations.add(existing);
        db.saveReservation(reservations);

        LocalDateTime start2 = start1.plusMinutes(30);
        LocalDateTime end2 = start2.plusHours(2);

        Reservation result = controller.createReservation("EQ1", start2, end2);

        assertNull(result);
    }

    @Test
    void createReservationReturnsReservationWhenValid() {
        User user = new User("user@test.com", "Pass123!", UserType.STUDENT, "S1", "User");
        UserController.setLoggedInUser(user);

        LocalDateTime start = LocalDateTime.now().plusHours(5);
        LocalDateTime end = start.plusHours(2);

        Reservation result = controller.createReservation("EQ1", start, end);

        assertNotNull(result);
    }

    @Test
    void createReservationSetsLoggedInUserEmailAsUserId() {
        User user = new User("user@test.com", "Pass123!", UserType.STUDENT, "S1", "User");
        UserController.setLoggedInUser(user);

        LocalDateTime start = LocalDateTime.now().plusHours(5);
        LocalDateTime end = start.plusHours(2);

        Reservation result = controller.createReservation("EQ1", start, end);

        assertNotNull(result);
        assertEquals("user@test.com", result.getUserId());
    }

    @Test
    void createReservationOverloadCopiesReservationFields() {
        User user = new User("user@test.com", "Pass123!", UserType.STUDENT, "S1", "User");
        UserController.setLoggedInUser(user);

        LocalDateTime start = LocalDateTime.now().plusHours(5);
        LocalDateTime end = start.plusHours(2);

        Reservation original = new Reservation("TEMP", "EQ1", start, end, new PendingState());

        Reservation result = controller.createReservation(original);

        assertNotNull(result);
        assertEquals("EQ1", result.getEquipmentID());
        assertEquals(start, result.getStartTime());
        assertEquals(end, result.getEndTime());
    }

    @Test
    void getReservationsByEquipmentReturnsOnlyMatchingEquipment() {
        LocalDateTime start = LocalDateTime.now().plusHours(1);
        LocalDateTime end = start.plusHours(2);

        Reservation r1 = new Reservation("R1", "EQ1", start, end, new PendingState());
        Reservation r2 = new Reservation("R2", "EQ2", start.plusHours(3), end.plusHours(3), new PendingState());
        Reservation r3 = new Reservation("R3", "EQ1", start.plusHours(6), end.plusHours(6), new PendingState());

        ArrayList<Reservation> reservations = new ArrayList<>();
        reservations.add(r1);
        reservations.add(r2);
        reservations.add(r3);
        db.saveReservation(reservations);

        ArrayList<Reservation> result = controller.getReservationsByEquipment("EQ1");

        assertEquals(2, result.size());
    }

    @Test
    void getMyReservationsReturnsEmptyWhenNoLoggedInUser() {
        UserController.setLoggedInUser(null);

        ArrayList<Reservation> result = controller.getMyReservations();

        assertTrue(result.isEmpty());
    }

    @Test
    void getMyReservationsReturnsOnlyCurrentUsersReservations() {
        User user = new User("mine@test.com", "Pass123!", UserType.STUDENT, "S1", "Mine");
        UserController.setLoggedInUser(user);

        LocalDateTime start = LocalDateTime.now().plusHours(1);
        LocalDateTime end = start.plusHours(2);

        Reservation r1 = new Reservation("R1", "EQ1", start, end, new PendingState());
        r1.setUserID("mine@test.com");

        Reservation r2 = new Reservation("R2", "EQ2", start.plusHours(3), end.plusHours(3), new PendingState());
        r2.setUserID("other@test.com");

        ArrayList<Reservation> reservations = new ArrayList<>();
        reservations.add(r1);
        reservations.add(r2);
        db.saveReservation(reservations);

        ArrayList<Reservation> result = controller.getMyReservations();

        assertEquals(1, result.size());
        assertEquals("mine@test.com", result.get(0).getUserId());
    }

    @Test
    void isTimeSlotAvailableReturnsFalseWhenOverlappingReservationExists() {
        LocalDateTime start1 = LocalDateTime.now().plusHours(1);
        LocalDateTime end1 = start1.plusHours(2);

        Reservation existing = new Reservation("R1", "EQ1", start1, end1, new PendingState());
        ArrayList<Reservation> reservations = new ArrayList<>();
        reservations.add(existing);
        db.saveReservation(reservations);

        boolean result = controller.isTimeSlotAvailable(
                "EQ1",
                start1.plusMinutes(30),
                end1.plusMinutes(30)
        );

        assertFalse(result);
    }

    @Test
    void isTimeSlotAvailableReturnsTrueWhenNoOverlap() {
        LocalDateTime start1 = LocalDateTime.now().plusHours(1);
        LocalDateTime end1 = start1.plusHours(2);

        Reservation existing = new Reservation("R1", "EQ1", start1, end1, new PendingState());
        ArrayList<Reservation> reservations = new ArrayList<>();
        reservations.add(existing);
        db.saveReservation(reservations);

        boolean result = controller.isTimeSlotAvailable(
                "EQ1",
                end1.plusHours(1),
                end1.plusHours(2)
        );

        assertTrue(result);
    }
}