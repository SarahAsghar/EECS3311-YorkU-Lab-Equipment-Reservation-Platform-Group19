import controller.PaymentController;
import model.DatabaseManager;
import model.Reservation.Reservation;
import model.Reservation.ReservationState;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentControllerTest {

    private PaymentController controller;
    private DatabaseManager db;

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
                // do nothing
            }
        };
    }

    private Reservation makeReservation(String id) {
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = start.plusHours(2);

        return new Reservation(
                id,
                "EQ1",
                start,
                end,
                makeState()
        );
    }

    @BeforeEach
    void setUp() {
        controller = PaymentController.getInstance();
        db = DatabaseManager.getInstance();
    }

    @Test
    void getInstanceReturnsSameObject() {
        PaymentController c2 = PaymentController.getInstance();
        assertSame(controller, c2);
    }

    @Test
    void processPaymentReturnsFalseWhenDetailsNull() {
        Reservation reservation = makeReservation("R1");

        boolean result =
                controller.processPayment(
                        reservation,
                        50.0,
                        "Card",
                        null
                );

        assertFalse(result);
    }

    @Test
    void processPaymentReturnsFalseWhenDetailsEmpty() {
        Reservation reservation = makeReservation("R2");

        boolean result =
                controller.processPayment(
                        reservation,
                        50.0,
                        "Card",
                        ""
                );

        assertFalse(result);
    }

    @Test
    void processPaymentReturnsFalseWhenDetailsSpaces() {
        Reservation reservation = makeReservation("R3");

        boolean result =
                controller.processPayment(
                        reservation,
                        50.0,
                        "Card",
                        "   "
                );

        assertFalse(result);
    }

    @Test
    void processCardPaymentReturnsBoolean() {
        Reservation reservation = makeReservation("R4");

        boolean result =
                controller.processCardPayment(
                        reservation,
                        60.0,
                        "4111111111111111",
                        "Test User",
                        "12/30",
                        "123"
                );

        assertNotNull(result);
    }

    @Test
    void processInstitutionalPaymentReturnsBoolean() {
        Reservation reservation = makeReservation("R5");

        boolean result =
                controller.processInstitutionalPayment(
                        reservation,
                        90.0,
                        "ACC123",
                        "ROUTING1",
                        "York University",
                        "EECS"
                );

        assertNotNull(result);
    }

    @Test
    void processGrantPaymentReturnsBoolean() {
        Reservation reservation = makeReservation("R6");

        boolean result =
                controller.processGrantPayment(
                        reservation,
                        120.0,
                        "GRANT001",
                        "AI Research"
                );

        assertNotNull(result);
    }

    @Test
    void processPaymentHandlesExceptionSafely() {
        boolean result =
                controller.processPayment(
                        null,
                        50.0,
                        "Card",
                        "Card: 1234"
                );

        assertFalse(result);
    }

}