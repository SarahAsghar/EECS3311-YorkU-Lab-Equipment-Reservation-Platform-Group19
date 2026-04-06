package model.Reservation;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ReservationRegressionTest {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.setStartTime(localDateTime9);
        java.lang.Class<?> wildcardClass11 = reservation5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        reservation5.setDepositPaid(false);
        model.Reservation.ReservationState reservationState8 = null;
        reservation5.setState(reservationState8);
        java.lang.Class<?> wildcardClass10 = reservation5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.lang.Class<?> wildcardClass9 = reservation5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.lang.String str9 = reservation5.getEquipmentID();
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.extendReservation(localDateTime10);
        java.lang.Class<?> wildcardClass12 = reservation5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        double double7 = reservation5.calculateHours();
        java.lang.Class<?> wildcardClass8 = reservation5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        reservation5.setDepositPaid(false);
        model.Reservation.ReservationState reservationState8 = null;
        reservation5.setState(reservationState8);
        java.time.LocalDateTime localDateTime10 = reservation5.getStartTime();
        model.User.User user11 = null;
        double double12 = reservation5.calculateTotalCost(user11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation5.setStartTime(localDateTime8);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        reservation5.setDepositPaid(false);
        model.Reservation.ReservationState reservationState8 = null;
        reservation5.setState(reservationState8);
        java.time.LocalDateTime localDateTime10 = reservation5.getStartTime();
        reservation5.setUserID("");
        double double13 = reservation5.calculateHours();
        java.lang.Class<?> wildcardClass14 = reservation5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.User.User user6 = null;
        double double7 = reservation5.calculateTotalCost(user6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.setStartTime(localDateTime9);
        reservation5.setUserID("hi!");
        double double13 = reservation5.calculateHours();
        java.lang.Class<?> wildcardClass14 = reservation5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime8 = reservation5.getEndTime();
        model.Reservation.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        model.Reservation.ReservationState reservationState11 = reservation5.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState11);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.Reservation reservation6 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime7 = null;
        reservation6.setEndTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = null;
        reservation6.setEndTime(localDateTime9);
        java.time.LocalDateTime localDateTime11 = null;
        reservation6.setStartTime(localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        model.Reservation.Reservation reservation8 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.extendReservation(localDateTime9);
        java.time.LocalDateTime localDateTime11 = null;
        reservation5.setStartTime(localDateTime11);
        model.Reservation.ReservationState reservationState13 = reservation5.getState();
        reservation5.setUserID("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState13);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setEndTime(localDateTime8);
        model.Reservation.ReservationState reservationState10 = null;
        reservation7.setState(reservationState10);
        java.lang.String str12 = reservation7.getEquipmentID();
        java.time.LocalDateTime localDateTime13 = reservation7.getEndTime();
        java.time.LocalDateTime localDateTime14 = reservation7.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation5.setEndTime(localDateTime8);
        java.time.LocalDateTime localDateTime10 = reservation5.getEndTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = localDateTime10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setEndTime(localDateTime8);
        model.Reservation.ReservationState reservationState10 = null;
        reservation7.setState(reservationState10);
        java.lang.String str12 = reservation7.getEquipmentID();
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.extendReservation(localDateTime13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.lang.String str9 = reservation5.getEquipmentID();
        java.time.LocalDateTime localDateTime10 = reservation5.getStartTime();
        java.time.LocalDateTime localDateTime11 = null;
        reservation5.setStartTime(localDateTime11);
        double double13 = reservation5.calculateHours();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        reservation5.setDepositPaid(false);
        model.Reservation.Reservation reservation8 = reservation5.cancelReservation();
        reservation8.setDepositAmount((double) 10);
        reservation8.setDepositPaid(false);
        java.time.LocalDateTime localDateTime13 = reservation8.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "", localDateTime2, localDateTime3, reservationState4);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        reservation5.setDepositPaid(false);
        java.time.LocalDateTime localDateTime10 = reservation5.getEndTime();
        model.Reservation.ReservationState reservationState11 = null;
        reservation5.setState(reservationState11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        reservation5.setDepositPaid(false);
        java.lang.String str10 = reservation5.getUserId();
        java.time.LocalDateTime localDateTime11 = null;
        reservation5.setStartTime(localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.Reservation reservation6 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime7 = null;
        reservation5.extendReservation(localDateTime7);
        model.Reservation.Reservation reservation9 = reservation5.cancelReservation();
        reservation9.setDepositPaid(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation9);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        reservation5.setDepositPaid(false);
        double double8 = reservation5.calculateHours();
        java.lang.String str9 = reservation5.getEquipmentID();
        java.time.LocalDateTime localDateTime10 = reservation5.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        java.time.LocalDateTime localDateTime7 = reservation5.getStartTime();
        java.time.LocalDateTime localDateTime8 = reservation5.getEndTime();
        model.Reservation.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        java.lang.Class<?> wildcardClass11 = reservation5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation5.setEndTime(localDateTime8);
        java.time.LocalDateTime localDateTime10 = reservation5.getEndTime();
        java.lang.String str11 = reservation5.getUserId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime8 = reservation5.getStartTime();
        double double9 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState10 = reservation5.getState();
        java.time.LocalDateTime localDateTime11 = reservation5.getEndTime();
        java.time.LocalDateTime localDateTime12 = reservation5.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        reservation5.setDepositPaid(false);
        reservation5.setUserID("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.lang.String str9 = reservation5.getEquipmentID();
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.setStartTime(localDateTime10);
        java.time.LocalDateTime localDateTime12 = null;
        reservation5.extendReservation(localDateTime12);
        java.lang.Class<?> wildcardClass14 = reservation5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        model.Reservation.Reservation reservation8 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.extendReservation(localDateTime9);
        java.time.LocalDateTime localDateTime11 = null;
        reservation5.setStartTime(localDateTime11);
        reservation5.setDepositAmount((double) (byte) 0);
        java.time.LocalDateTime localDateTime15 = null;
        reservation5.extendReservation(localDateTime15);
        java.time.LocalDateTime localDateTime17 = null;
        reservation5.setEndTime(localDateTime17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation8);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        model.User.User user8 = null;
        double double9 = reservation5.calculateTotalCost(user8);
        model.User.User user10 = null;
        double double11 = reservation5.calculateTotalCost(user10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        java.time.LocalDateTime localDateTime8 = reservation5.getEndTime();
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.setStartTime(localDateTime9);
        java.time.LocalDateTime localDateTime11 = null;
        reservation5.setEndTime(localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        reservation5.setDepositPaid(false);
        java.time.LocalDateTime localDateTime10 = reservation5.getEndTime();
        java.time.LocalDateTime localDateTime11 = reservation5.getEndTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        double double7 = reservation5.calculateHours();
        java.time.LocalDateTime localDateTime8 = null;
        reservation5.setStartTime(localDateTime8);
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.extendReservation(localDateTime10);
        java.time.LocalDateTime localDateTime12 = null;
        reservation5.setStartTime(localDateTime12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        java.time.LocalDateTime localDateTime6 = reservation5.getEndTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime6);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.lang.String str9 = reservation5.getEquipmentID();
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.setStartTime(localDateTime10);
        double double12 = reservation5.calculateHours();
        java.time.LocalDateTime localDateTime13 = null;
        reservation5.extendReservation(localDateTime13);
        model.Reservation.Reservation reservation15 = reservation5.cancelReservation();
        model.User.User user16 = null;
        double double17 = reservation15.calculateTotalCost(user16);
        java.lang.Class<?> wildcardClass18 = reservation15.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        java.time.LocalDateTime localDateTime7 = reservation5.getStartTime();
        java.lang.String str8 = reservation5.getUserId();
        java.lang.String str9 = reservation5.getUserId();
        java.lang.String str10 = reservation5.getUserId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.lang.String str9 = reservation5.getEquipmentID();
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.setStartTime(localDateTime10);
        double double12 = reservation5.calculateHours();
        java.time.LocalDateTime localDateTime13 = null;
        reservation5.extendReservation(localDateTime13);
        model.Reservation.Reservation reservation15 = reservation5.cancelReservation();
        java.lang.String str16 = reservation15.getReservationId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.lang.String str9 = reservation5.getEquipmentID();
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.setStartTime(localDateTime10);
        double double12 = reservation5.calculateHours();
        java.lang.Class<?> wildcardClass13 = reservation5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        reservation5.setDepositPaid(false);
        model.Reservation.ReservationState reservationState8 = null;
        reservation5.setState(reservationState8);
        java.time.LocalDateTime localDateTime10 = reservation5.getStartTime();
        reservation5.setUserID("");
        java.time.LocalDateTime localDateTime13 = null;
        reservation5.extendReservation(localDateTime13);
        java.time.LocalDateTime localDateTime15 = reservation5.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        double double7 = reservation5.calculateHours();
        java.time.LocalDateTime localDateTime8 = null;
        reservation5.setStartTime(localDateTime8);
        java.lang.Class<?> wildcardClass10 = reservation5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        java.time.LocalDateTime localDateTime6 = reservation5.getStartTime();
        java.lang.String str7 = reservation5.getEquipmentID();
        java.lang.Class<?> wildcardClass8 = reservation5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        reservation5.setDepositPaid(false);
        model.Reservation.ReservationState reservationState8 = null;
        reservation5.setState(reservationState8);
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.extendReservation(localDateTime10);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.lang.String str9 = reservation5.getEquipmentID();
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.setStartTime(localDateTime10);
        java.time.LocalDateTime localDateTime12 = reservation5.getEndTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "", localDateTime2, localDateTime3, reservationState4);
        java.time.LocalDateTime localDateTime6 = null;
        reservation5.setEndTime(localDateTime6);
        java.lang.Class<?> wildcardClass8 = reservation5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        java.time.LocalDateTime localDateTime6 = reservation5.getStartTime();
        java.lang.String str7 = reservation5.getEquipmentID();
        double double8 = reservation5.calculateHours();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.lang.String str9 = reservation5.getEquipmentID();
        java.time.LocalDateTime localDateTime10 = reservation5.getStartTime();
        model.User.User user11 = null;
        double double12 = reservation5.calculateTotalCost(user11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        model.Reservation.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        java.lang.String str11 = reservation5.getUserId();
        reservation5.setUserID("");
        reservation5.setDepositPaid(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime8 = reservation5.getStartTime();
        double double9 = reservation5.calculateHours();
        double double10 = reservation5.calculateHours();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        double double7 = reservation5.calculateHours();
        java.time.LocalDateTime localDateTime8 = null;
        reservation5.setStartTime(localDateTime8);
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.extendReservation(localDateTime10);
        java.lang.String str12 = reservation5.getEquipmentID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.lang.String str9 = reservation5.getEquipmentID();
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.setStartTime(localDateTime10);
        double double12 = reservation5.calculateHours();
        java.time.LocalDateTime localDateTime13 = null;
        reservation5.extendReservation(localDateTime13);
        model.Reservation.Reservation reservation15 = reservation5.cancelReservation();
        java.lang.String str16 = reservation15.getUserId();
        model.User.User user17 = null;
        double double18 = reservation15.calculateTotalCost(user17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation5.setStartTime(localDateTime8);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = reservation5.getState();
        reservation5.setDepositAmount((-1.0d));
        java.lang.String str9 = reservation5.getReservationId();
        reservation5.setUserID("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.User.User user7 = null;
        double double8 = reservation5.calculateTotalCost(user7);
        reservation5.setUserID("hi!");
        model.User.User user11 = null;
        double double12 = reservation5.calculateTotalCost(user11);
        reservation5.setDepositPaid(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime8 = reservation5.getStartTime();
        double double9 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState10 = reservation5.getState();
        model.Reservation.ReservationState reservationState11 = reservation5.getState();
        java.time.LocalDateTime localDateTime12 = null;
        reservation5.setStartTime(localDateTime12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState11);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        reservation5.setDepositPaid(false);
        model.Reservation.ReservationState reservationState8 = null;
        reservation5.setState(reservationState8);
        java.time.LocalDateTime localDateTime10 = reservation5.getStartTime();
        java.lang.Class<?> wildcardClass11 = reservation5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime8 = reservation5.getEndTime();
        java.lang.Class<?> wildcardClass9 = reservation5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.User.User user7 = null;
        double double8 = reservation5.calculateTotalCost(user7);
        reservation5.setUserID("hi!");
        model.Reservation.ReservationState reservationState11 = null;
        reservation5.setState(reservationState11);
        java.time.LocalDateTime localDateTime13 = reservation5.getEndTime();
        java.time.LocalDateTime localDateTime14 = null;
        reservation5.setStartTime(localDateTime14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation5.setEndTime(localDateTime8);
        java.time.LocalDateTime localDateTime10 = reservation5.getEndTime();
        reservation5.setUserID("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime8 = reservation5.getEndTime();
        model.Reservation.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        double double11 = reservation5.calculateHours();
        java.time.LocalDateTime localDateTime12 = reservation5.getEndTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        java.lang.String str6 = reservation5.getEquipmentID();
        java.lang.String str7 = reservation5.getEquipmentID();
        model.Reservation.ReservationState reservationState8 = reservation5.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState8);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.lang.String str9 = reservation5.getEquipmentID();
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.setStartTime(localDateTime10);
        double double12 = reservation5.calculateHours();
        reservation5.setUserID("hi!");
        double double15 = reservation5.calculateHours();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        reservation5.setDepositPaid(false);
        java.lang.Class<?> wildcardClass10 = reservation5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.lang.String str9 = reservation5.getEquipmentID();
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.setStartTime(localDateTime10);
        reservation5.setUserID("hi!");
        model.User.User user14 = null;
        double double15 = reservation5.calculateTotalCost(user14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        reservation5.setDepositPaid(false);
        model.Reservation.ReservationState reservationState8 = null;
        reservation5.setState(reservationState8);
        java.time.LocalDateTime localDateTime10 = reservation5.getStartTime();
        reservation5.setUserID("");
        java.time.LocalDateTime localDateTime13 = null;
        reservation5.extendReservation(localDateTime13);
        java.time.LocalDateTime localDateTime15 = null;
        reservation5.setStartTime(localDateTime15);
        java.lang.Class<?> wildcardClass17 = reservation5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime8 = reservation5.getStartTime();
        double double9 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState10 = reservation5.getState();
        model.Reservation.ReservationState reservationState11 = null;
        reservation5.setState(reservationState11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState10);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime8 = reservation5.getStartTime();
        double double9 = reservation5.calculateHours();
        java.lang.Class<?> wildcardClass10 = reservation5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime8 = reservation5.getStartTime();
        double double9 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState10 = reservation5.getState();
        java.lang.String str11 = reservation5.getEquipmentID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.Reservation reservation6 = reservation5.cancelReservation();
        model.Reservation.ReservationState reservationState7 = reservation5.getState();
        reservation5.setUserID("");
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.extendReservation(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState7);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        double double7 = reservation5.calculateHours();
        java.time.LocalDateTime localDateTime8 = null;
        reservation5.setStartTime(localDateTime8);
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.extendReservation(localDateTime10);
        java.lang.String str12 = reservation5.getReservationId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        model.Reservation.Reservation reservation8 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.extendReservation(localDateTime9);
        java.time.LocalDateTime localDateTime11 = null;
        reservation5.setStartTime(localDateTime11);
        reservation5.setDepositAmount((double) (byte) 0);
        java.time.LocalDateTime localDateTime15 = null;
        reservation5.extendReservation(localDateTime15);
        java.lang.String str17 = reservation5.getReservationId();
        model.User.User user18 = null;
        double double19 = reservation5.calculateTotalCost(user18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.User.User user7 = null;
        double double8 = reservation5.calculateTotalCost(user7);
        reservation5.setDepositAmount((double) (short) 0);
        java.time.LocalDateTime localDateTime11 = null;
        reservation5.setEndTime(localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        java.time.LocalDateTime localDateTime7 = reservation5.getStartTime();
        java.time.LocalDateTime localDateTime8 = reservation5.getEndTime();
        model.Reservation.ReservationState reservationState9 = reservation5.getState();
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.extendReservation(localDateTime10);
        model.Reservation.ReservationState reservationState12 = null;
        reservation5.setState(reservationState12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState9);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        reservation5.setDepositPaid(false);
        model.Reservation.ReservationState reservationState8 = null;
        reservation5.setState(reservationState8);
        java.time.LocalDateTime localDateTime10 = reservation5.getStartTime();
        reservation5.setUserID("");
        java.time.LocalDateTime localDateTime13 = null;
        reservation5.extendReservation(localDateTime13);
        model.Reservation.ReservationState reservationState15 = null;
        reservation5.setState(reservationState15);
        java.lang.String str17 = reservation5.getEquipmentID();
        java.lang.Class<?> wildcardClass18 = reservation5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        model.Reservation.Reservation reservation8 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.extendReservation(localDateTime9);
        java.time.LocalDateTime localDateTime11 = null;
        reservation5.setStartTime(localDateTime11);
        reservation5.setDepositPaid(true);
        java.time.LocalDateTime localDateTime15 = null;
        reservation5.setStartTime(localDateTime15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation8);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        reservation5.setDepositPaid(false);
        model.Reservation.ReservationState reservationState8 = null;
        reservation5.setState(reservationState8);
        java.time.LocalDateTime localDateTime10 = reservation5.getStartTime();
        reservation5.setUserID("");
        java.time.LocalDateTime localDateTime13 = null;
        reservation5.extendReservation(localDateTime13);
        java.time.LocalDateTime localDateTime15 = reservation5.getEndTime();
        reservation5.setDepositPaid(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        java.lang.String str6 = reservation5.getEquipmentID();
        java.lang.String str7 = reservation5.getReservationId();
        model.User.User user8 = null;
        double double9 = reservation5.calculateTotalCost(user8);
        reservation5.setDepositAmount((double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        reservation5.setDepositPaid(false);
        reservation5.setUserID("hi!");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.setStartTime(localDateTime9);
        reservation5.setUserID("hi!");
        double double13 = reservation5.calculateHours();
        double double14 = reservation5.calculateHours();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        model.Reservation.Reservation reservation8 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.extendReservation(localDateTime9);
        reservation5.setDepositAmount(10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation8);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        reservation5.setDepositPaid(false);
        model.Reservation.ReservationState reservationState8 = null;
        reservation5.setState(reservationState8);
        java.lang.String str10 = reservation5.getEquipmentID();
        reservation5.setUserID("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.lang.String str9 = reservation5.getEquipmentID();
        java.time.LocalDateTime localDateTime10 = reservation5.getStartTime();
        java.time.LocalDateTime localDateTime11 = reservation5.getEndTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        model.Reservation.Reservation reservation8 = reservation5.cancelReservation();
        model.User.User user9 = null;
        double double10 = reservation5.calculateTotalCost(user9);
        java.time.LocalDateTime localDateTime11 = null;
        reservation5.extendReservation(localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        java.lang.String str6 = reservation5.getEquipmentID();
        java.lang.String str7 = reservation5.getReservationId();
        java.time.LocalDateTime localDateTime8 = null;
        reservation5.extendReservation(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.lang.String str9 = reservation5.getEquipmentID();
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.setStartTime(localDateTime10);
        double double12 = reservation5.calculateHours();
        java.time.LocalDateTime localDateTime13 = null;
        reservation5.extendReservation(localDateTime13);
        model.Reservation.Reservation reservation15 = reservation5.cancelReservation();
        model.Reservation.Reservation reservation16 = reservation5.cancelReservation();
        model.Reservation.ReservationState reservationState17 = reservation5.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState17);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.User.User user7 = null;
        double double8 = reservation5.calculateTotalCost(user7);
        java.lang.String str9 = reservation5.getEquipmentID();
        java.time.LocalDateTime localDateTime10 = reservation5.getEndTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        java.time.LocalDateTime localDateTime7 = reservation5.getStartTime();
        java.time.LocalDateTime localDateTime8 = reservation5.getEndTime();
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.setStartTime(localDateTime9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        java.lang.String str6 = reservation5.getEquipmentID();
        java.lang.String str7 = reservation5.getReservationId();
        model.User.User user8 = null;
        double double9 = reservation5.calculateTotalCost(user8);
        java.lang.String str10 = reservation5.getReservationId();
        model.Reservation.ReservationState reservationState11 = null;
        reservation5.setState(reservationState11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        reservation5.setDepositPaid(false);
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.setEndTime(localDateTime10);
        model.Reservation.ReservationState reservationState12 = null;
        reservation5.setState(reservationState12);
        java.lang.String str14 = reservation5.getReservationId();
        java.time.LocalDateTime localDateTime15 = reservation5.getEndTime();
        java.lang.Class<?> wildcardClass16 = reservation5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setEndTime(localDateTime8);
        reservation7.setUserID("hi!");
        java.lang.String str12 = reservation7.getReservationId();
        model.Reservation.ReservationState reservationState13 = null;
        reservation7.setState(reservationState13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        reservation5.setDepositPaid(false);
        model.Reservation.Reservation reservation8 = reservation5.cancelReservation();
        reservation8.setDepositAmount((double) 10);
        reservation8.setDepositPaid(false);
        model.Reservation.Reservation reservation13 = reservation8.cancelReservation();
        model.Reservation.Reservation reservation14 = reservation13.cancelReservation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation14);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        reservation5.setDepositPaid(false);
        model.Reservation.Reservation reservation8 = reservation5.cancelReservation();
        reservation8.setDepositAmount((double) 10);
        model.Reservation.Reservation reservation11 = reservation8.cancelReservation();
        java.time.LocalDateTime localDateTime12 = reservation11.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.lang.String str9 = reservation5.getEquipmentID();
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.setStartTime(localDateTime10);
        double double12 = reservation5.calculateHours();
        reservation5.setUserID("hi!");
        reservation5.setDepositPaid(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        model.Reservation.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        java.time.LocalDateTime localDateTime11 = null;
        reservation5.setStartTime(localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.Reservation reservation6 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime7 = null;
        reservation6.setEndTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = null;
        reservation6.setEndTime(localDateTime9);
        java.time.LocalDateTime localDateTime11 = null;
        reservation6.setEndTime(localDateTime11);
        reservation6.setDepositAmount((double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation6);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setEndTime(localDateTime8);
        model.Reservation.ReservationState reservationState10 = null;
        reservation7.setState(reservationState10);
        java.time.LocalDateTime localDateTime12 = reservation7.getStartTime();
        reservation7.setDepositAmount((double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        java.time.LocalDateTime localDateTime8 = reservation5.getEndTime();
        java.lang.String str9 = reservation5.getUserId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "", localDateTime2, localDateTime3, reservationState4);
        java.lang.String str6 = reservation5.getUserId();
        java.time.LocalDateTime localDateTime7 = null;
        reservation5.setStartTime(localDateTime7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        java.time.LocalDateTime localDateTime6 = null;
        reservation5.extendReservation(localDateTime6);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        java.lang.String str6 = reservation5.getEquipmentID();
        java.lang.String str7 = reservation5.getEquipmentID();
        reservation5.setDepositAmount((double) (short) 0);
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.setEndTime(localDateTime10);
        reservation5.setUserID("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        reservation5.setDepositPaid(false);
        model.Reservation.Reservation reservation8 = reservation5.cancelReservation();
        reservation8.setDepositAmount((double) 10);
        reservation8.setDepositPaid(false);
        model.Reservation.Reservation reservation13 = reservation8.cancelReservation();
        reservation8.setDepositPaid(false);
        java.time.LocalDateTime localDateTime16 = null;
        reservation8.setStartTime(localDateTime16);
        model.Reservation.ReservationState reservationState18 = null;
        reservation8.setState(reservationState18);
        java.lang.Class<?> wildcardClass20 = reservation8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.Reservation reservation6 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime7 = null;
        reservation6.setEndTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = null;
        reservation6.setEndTime(localDateTime9);
        java.time.LocalDateTime localDateTime11 = reservation6.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        java.time.LocalDateTime localDateTime8 = reservation5.getEndTime();
        reservation5.setDepositPaid(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        reservation5.setDepositPaid(false);
        java.lang.String str10 = reservation5.getUserId();
        double double11 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState12 = reservation5.getState();
        model.Reservation.Reservation reservation13 = reservation5.cancelReservation();
        reservation13.setDepositAmount(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation13);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        reservation5.setDepositPaid(false);
        model.Reservation.Reservation reservation8 = reservation5.cancelReservation();
        reservation8.setDepositAmount((double) 10);
        java.lang.Class<?> wildcardClass11 = reservation8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime8 = reservation5.getStartTime();
        double double9 = reservation5.calculateHours();
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.extendReservation(localDateTime10);
        java.time.LocalDateTime localDateTime12 = null;
        reservation5.extendReservation(localDateTime12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "", localDateTime2, localDateTime3, reservationState4);
        java.time.LocalDateTime localDateTime6 = null;
        reservation5.setEndTime(localDateTime6);
        reservation5.setDepositPaid(true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "", localDateTime2, localDateTime3, reservationState4);
        java.time.LocalDateTime localDateTime6 = null;
        reservation5.setEndTime(localDateTime6);
        java.time.LocalDateTime localDateTime8 = reservation5.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime8 = reservation5.getStartTime();
        double double9 = reservation5.calculateHours();
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.extendReservation(localDateTime10);
        java.time.LocalDateTime localDateTime12 = reservation5.getEndTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        model.Reservation.Reservation reservation8 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.extendReservation(localDateTime9);
        java.time.LocalDateTime localDateTime11 = null;
        reservation5.setStartTime(localDateTime11);
        model.Reservation.ReservationState reservationState13 = null;
        reservation5.setState(reservationState13);
        model.Reservation.ReservationState reservationState15 = null;
        reservation5.setState(reservationState15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation8);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.lang.String str9 = reservation5.getEquipmentID();
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.setStartTime(localDateTime10);
        double double12 = reservation5.calculateHours();
        reservation5.setUserID("hi!");
        model.Reservation.ReservationState reservationState15 = null;
        reservation5.setState(reservationState15);
        reservation5.setDepositPaid(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.Reservation reservation6 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime7 = reservation5.getStartTime();
        java.time.LocalDateTime localDateTime8 = null;
        reservation5.setEndTime(localDateTime8);
        model.Reservation.ReservationState reservationState10 = null;
        reservation5.setState(reservationState10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime7);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = reservation5.getState();
        java.time.LocalDateTime localDateTime7 = null;
        reservation5.extendReservation(localDateTime7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState6);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.lang.String str9 = reservation5.getEquipmentID();
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.setStartTime(localDateTime10);
        double double12 = reservation5.calculateHours();
        java.time.LocalDateTime localDateTime13 = null;
        reservation5.extendReservation(localDateTime13);
        model.Reservation.Reservation reservation15 = reservation5.cancelReservation();
        model.Reservation.Reservation reservation16 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime17 = reservation16.getEndTime();
        reservation16.setDepositAmount((double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.lang.String str9 = reservation5.getEquipmentID();
        reservation5.setDepositPaid(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.lang.String str9 = reservation5.getEquipmentID();
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.setStartTime(localDateTime10);
        double double12 = reservation5.calculateHours();
        java.time.LocalDateTime localDateTime13 = null;
        reservation5.extendReservation(localDateTime13);
        model.Reservation.Reservation reservation15 = reservation5.cancelReservation();
        model.Reservation.Reservation reservation16 = reservation5.cancelReservation();
        java.lang.Class<?> wildcardClass17 = reservation16.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        double double7 = reservation5.calculateHours();
        java.time.LocalDateTime localDateTime8 = null;
        reservation5.setStartTime(localDateTime8);
        java.time.LocalDateTime localDateTime10 = reservation5.getStartTime();
        reservation5.setDepositPaid(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        reservation5.setDepositPaid(false);
        java.lang.String str10 = reservation5.getReservationId();
        java.time.LocalDateTime localDateTime11 = null;
        reservation5.setEndTime(localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.lang.String str9 = reservation5.getEquipmentID();
        model.Reservation.ReservationState reservationState10 = null;
        reservation5.setState(reservationState10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        model.Reservation.Reservation reservation8 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.extendReservation(localDateTime9);
        java.time.LocalDateTime localDateTime11 = null;
        reservation5.setStartTime(localDateTime11);
        model.Reservation.ReservationState reservationState13 = reservation5.getState();
        java.time.LocalDateTime localDateTime14 = null;
        reservation5.setEndTime(localDateTime14);
        java.lang.String str16 = reservation5.getEquipmentID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        reservation5.setDepositPaid(false);
        model.Reservation.Reservation reservation8 = reservation5.cancelReservation();
        reservation8.setDepositAmount((double) 10);
        java.time.LocalDateTime localDateTime11 = null;
        reservation8.extendReservation(localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation8);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.lang.String str9 = reservation5.getEquipmentID();
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.setStartTime(localDateTime10);
        double double12 = reservation5.calculateHours();
        java.time.LocalDateTime localDateTime13 = null;
        reservation5.extendReservation(localDateTime13);
        model.Reservation.Reservation reservation15 = reservation5.cancelReservation();
        java.lang.String str16 = reservation15.getUserId();
        model.Reservation.ReservationState reservationState17 = null;
        reservation15.setState(reservationState17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        double double7 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState8 = reservation5.getState();
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.setStartTime(localDateTime9);
        model.Reservation.Reservation reservation11 = reservation5.cancelReservation();
        model.Reservation.Reservation reservation12 = reservation11.cancelReservation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation12);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = reservation5.getState();
        reservation5.setDepositAmount((-1.0d));
        reservation5.setUserID("");
        model.Reservation.Reservation reservation11 = reservation5.cancelReservation();
        reservation11.setDepositAmount((double) (byte) 1);
        java.lang.Class<?> wildcardClass14 = reservation11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        reservation5.setDepositPaid(false);
        model.Reservation.ReservationState reservationState8 = null;
        reservation5.setState(reservationState8);
        java.time.LocalDateTime localDateTime10 = reservation5.getStartTime();
        reservation5.setUserID("");
        java.time.LocalDateTime localDateTime13 = null;
        reservation5.extendReservation(localDateTime13);
        java.time.LocalDateTime localDateTime15 = reservation5.getEndTime();
        reservation5.setUserID("");
        reservation5.setDepositAmount((double) (byte) 1);
        reservation5.setUserID("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        model.Reservation.Reservation reservation8 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.extendReservation(localDateTime9);
        java.lang.String str11 = reservation5.getEquipmentID();
        java.time.LocalDateTime localDateTime12 = null;
        reservation5.setStartTime(localDateTime12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        reservation5.setDepositPaid(false);
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.setEndTime(localDateTime10);
        model.Reservation.ReservationState reservationState12 = null;
        reservation5.setState(reservationState12);
        java.time.LocalDateTime localDateTime14 = reservation5.getEndTime();
        java.time.LocalDateTime localDateTime15 = null;
        reservation5.setStartTime(localDateTime15);
        java.time.LocalDateTime localDateTime17 = reservation5.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setEndTime(localDateTime8);
        reservation7.setUserID("hi!");
        java.time.LocalDateTime localDateTime12 = reservation7.getEndTime();
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.extendReservation(localDateTime13);
        java.lang.String str15 = reservation7.getUserId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime8 = reservation5.getEndTime();
        model.Reservation.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        java.time.LocalDateTime localDateTime11 = reservation5.getEndTime();
        java.time.LocalDateTime localDateTime12 = null;
        reservation5.extendReservation(localDateTime12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.lang.String str9 = reservation5.getEquipmentID();
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.setStartTime(localDateTime10);
        double double12 = reservation5.calculateHours();
        reservation5.setUserID("hi!");
        model.User.User user15 = null;
        double double16 = reservation5.calculateTotalCost(user15);
        reservation5.setUserID("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        model.User.User user8 = null;
        double double9 = reservation5.calculateTotalCost(user8);
        model.Reservation.ReservationState reservationState10 = reservation5.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState10);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        java.time.LocalDateTime localDateTime7 = null;
        reservation5.extendReservation(localDateTime7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation5.setEndTime(localDateTime8);
        reservation5.setUserID("hi!");
        java.time.LocalDateTime localDateTime12 = null;
        reservation5.extendReservation(localDateTime12);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        model.Reservation.Reservation reservation8 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.extendReservation(localDateTime9);
        java.time.LocalDateTime localDateTime11 = null;
        reservation5.setStartTime(localDateTime11);
        reservation5.setDepositAmount((double) (byte) 0);
        java.time.LocalDateTime localDateTime15 = null;
        reservation5.extendReservation(localDateTime15);
        model.User.User user17 = null;
        double double18 = reservation5.calculateTotalCost(user17);
        java.time.LocalDateTime localDateTime19 = reservation5.getEndTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime19);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation5.setEndTime(localDateTime8);
        reservation5.setUserID("hi!");
        model.Reservation.ReservationState reservationState12 = reservation5.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState12);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        java.time.LocalDateTime localDateTime7 = reservation5.getStartTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = localDateTime7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime7);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        reservation5.setDepositPaid(false);
        reservation5.setUserID("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        reservation5.setDepositPaid(false);
        java.time.LocalDateTime localDateTime10 = reservation5.getEndTime();
        java.lang.String str11 = reservation5.getUserId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation5.setEndTime(localDateTime8);
        java.time.LocalDateTime localDateTime10 = reservation5.getEndTime();
        double double11 = reservation5.calculateHours();
        java.time.LocalDateTime localDateTime12 = null;
        reservation5.setStartTime(localDateTime12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        model.Reservation.Reservation reservation8 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime9 = reservation5.getEndTime();
        model.User.User user10 = null;
        double double11 = reservation5.calculateTotalCost(user10);
        model.Reservation.ReservationState reservationState12 = reservation5.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState12);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        java.time.LocalDateTime localDateTime8 = reservation5.getEndTime();
        double double9 = reservation5.calculateHours();
        reservation5.setDepositPaid(false);
        java.lang.String str12 = reservation5.getUserId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.lang.String str9 = reservation5.getEquipmentID();
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.setStartTime(localDateTime10);
        double double12 = reservation5.calculateHours();
        java.time.LocalDateTime localDateTime13 = null;
        reservation5.extendReservation(localDateTime13);
        model.Reservation.Reservation reservation15 = reservation5.cancelReservation();
        model.Reservation.Reservation reservation16 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime17 = reservation5.getEndTime();
        java.lang.String str18 = reservation5.getUserId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.Reservation reservation6 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime7 = null;
        reservation5.extendReservation(localDateTime7);
        model.Reservation.Reservation reservation9 = reservation5.cancelReservation();
        model.Reservation.ReservationState reservationState10 = reservation9.getState();
        java.time.LocalDateTime localDateTime11 = reservation9.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        java.lang.String str6 = reservation5.getEquipmentID();
        java.lang.String str7 = reservation5.getReservationId();
        model.User.User user8 = null;
        double double9 = reservation5.calculateTotalCost(user8);
        double double10 = reservation5.calculateHours();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        reservation5.setDepositPaid(false);
        model.Reservation.ReservationState reservationState8 = null;
        reservation5.setState(reservationState8);
        java.time.LocalDateTime localDateTime10 = reservation5.getStartTime();
        reservation5.setUserID("");
        java.time.LocalDateTime localDateTime13 = null;
        reservation5.extendReservation(localDateTime13);
        model.Reservation.ReservationState reservationState15 = null;
        reservation5.setState(reservationState15);
        java.lang.String str17 = reservation5.getEquipmentID();
        java.time.LocalDateTime localDateTime18 = reservation5.getEndTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime8 = reservation5.getEndTime();
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.extendReservation(localDateTime9);
        java.lang.String str11 = reservation5.getReservationId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        java.time.LocalDateTime localDateTime7 = reservation5.getStartTime();
        java.time.LocalDateTime localDateTime8 = reservation5.getEndTime();
        model.Reservation.ReservationState reservationState9 = reservation5.getState();
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.setEndTime(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState9);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.Reservation reservation6 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime7 = reservation5.getStartTime();
        java.time.LocalDateTime localDateTime8 = null;
        reservation5.setEndTime(localDateTime8);
        reservation5.setDepositPaid(true);
        java.time.LocalDateTime localDateTime12 = null;
        reservation5.setStartTime(localDateTime12);
        reservation5.setDepositPaid(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime7);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.lang.String str9 = reservation5.getEquipmentID();
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.setStartTime(localDateTime10);
        double double12 = reservation5.calculateHours();
        java.time.LocalDateTime localDateTime13 = null;
        reservation5.extendReservation(localDateTime13);
        model.Reservation.Reservation reservation15 = reservation5.cancelReservation();
        model.Reservation.Reservation reservation16 = reservation5.cancelReservation();
        model.Reservation.ReservationState reservationState17 = null;
        reservation16.setState(reservationState17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation16);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        model.Reservation.Reservation reservation8 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.extendReservation(localDateTime9);
        java.lang.String str11 = reservation5.getEquipmentID();
        java.time.LocalDateTime localDateTime12 = null;
        reservation5.extendReservation(localDateTime12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        java.time.LocalDateTime localDateTime8 = reservation5.getEndTime();
        model.Reservation.ReservationState reservationState9 = reservation5.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState9);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        reservation5.setDepositPaid(false);
        reservation5.setDepositAmount((double) ' ');
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.lang.String str9 = reservation5.getEquipmentID();
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.setStartTime(localDateTime10);
        double double12 = reservation5.calculateHours();
        java.time.LocalDateTime localDateTime13 = null;
        reservation5.extendReservation(localDateTime13);
        model.Reservation.Reservation reservation15 = reservation5.cancelReservation();
        reservation15.setDepositPaid(false);
        reservation15.setDepositPaid(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation15);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        java.time.LocalDateTime localDateTime8 = reservation5.getEndTime();
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.setStartTime(localDateTime9);
        java.lang.String str11 = reservation5.getEquipmentID();
        java.time.LocalDateTime localDateTime12 = reservation5.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = reservation5.getState();
        java.time.LocalDateTime localDateTime7 = null;
        reservation5.setStartTime(localDateTime7);
        model.Reservation.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState6);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        model.Reservation.Reservation reservation8 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.extendReservation(localDateTime9);
        java.time.LocalDateTime localDateTime11 = null;
        reservation5.setStartTime(localDateTime11);
        double double13 = reservation5.calculateHours();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        model.Reservation.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        java.time.LocalDateTime localDateTime11 = null;
        reservation5.extendReservation(localDateTime11);
        model.User.User user13 = null;
        double double14 = reservation5.calculateTotalCost(user13);
        double double15 = reservation5.calculateHours();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        java.lang.String str6 = reservation5.getEquipmentID();
        java.lang.String str7 = reservation5.getEquipmentID();
        reservation5.setDepositAmount((double) (short) 0);
        java.time.LocalDateTime localDateTime10 = reservation5.getStartTime();
        java.time.LocalDateTime localDateTime11 = reservation5.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        model.Reservation.Reservation reservation8 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.extendReservation(localDateTime9);
        java.time.LocalDateTime localDateTime11 = null;
        reservation5.setEndTime(localDateTime11);
        java.lang.String str13 = reservation5.getUserId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        reservation5.setDepositPaid(false);
        model.Reservation.ReservationState reservationState8 = null;
        reservation5.setState(reservationState8);
        java.time.LocalDateTime localDateTime10 = reservation5.getStartTime();
        reservation5.setUserID("");
        java.time.LocalDateTime localDateTime13 = null;
        reservation5.extendReservation(localDateTime13);
        java.time.LocalDateTime localDateTime15 = null;
        reservation5.setStartTime(localDateTime15);
        java.time.LocalDateTime localDateTime17 = null;
        reservation5.setEndTime(localDateTime17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        reservation5.setDepositPaid(false);
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.setEndTime(localDateTime10);
        model.Reservation.ReservationState reservationState12 = null;
        reservation5.setState(reservationState12);
        java.time.LocalDateTime localDateTime14 = null;
        reservation5.setStartTime(localDateTime14);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.Reservation reservation6 = reservation5.cancelReservation();
        model.Reservation.ReservationState reservationState7 = null;
        reservation6.setState(reservationState7);
        java.lang.Class<?> wildcardClass9 = reservation6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        reservation5.setDepositPaid(false);
        java.lang.String str10 = reservation5.getUserId();
        model.Reservation.ReservationState reservationState11 = null;
        reservation5.setState(reservationState11);
        java.lang.String str13 = reservation5.getUserId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        java.time.LocalDateTime localDateTime8 = reservation5.getEndTime();
        double double9 = reservation5.calculateHours();
        model.User.User user10 = null;
        double double11 = reservation5.calculateTotalCost(user10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        model.Reservation.Reservation reservation8 = reservation5.cancelReservation();
        model.User.User user9 = null;
        double double10 = reservation8.calculateTotalCost(user9);
        reservation8.setUserID("");
        reservation8.setDepositAmount((double) 100);
        model.Reservation.ReservationState reservationState15 = null;
        reservation8.setState(reservationState15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        reservation5.setDepositPaid(false);
        model.Reservation.ReservationState reservationState8 = null;
        reservation5.setState(reservationState8);
        java.time.LocalDateTime localDateTime10 = reservation5.getStartTime();
        reservation5.setUserID("");
        reservation5.setDepositAmount(100.0d);
        reservation5.setDepositAmount(100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        reservation5.setDepositPaid(false);
        java.lang.String str10 = reservation5.getUserId();
        double double11 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState12 = reservation5.getState();
        model.Reservation.Reservation reservation13 = reservation5.cancelReservation();
        double double14 = reservation5.calculateHours();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        model.Reservation.Reservation reservation8 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime9 = null;
        reservation8.extendReservation(localDateTime9);
        java.lang.String str11 = reservation8.getEquipmentID();
        java.lang.String str12 = reservation8.getUserId();
        reservation8.setDepositPaid(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setEndTime(localDateTime8);
        model.Reservation.ReservationState reservationState10 = null;
        reservation7.setState(reservationState10);
        double double12 = reservation7.calculateHours();
        reservation7.setDepositPaid(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        java.lang.String str6 = reservation5.getEquipmentID();
        java.lang.String str7 = reservation5.getReservationId();
        model.Reservation.ReservationState reservationState8 = reservation5.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState8);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        model.Reservation.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        java.lang.String str11 = reservation5.getUserId();
        model.User.User user12 = null;
        double double13 = reservation5.calculateTotalCost(user12);
        java.lang.String str14 = reservation5.getEquipmentID();
        java.lang.String str15 = reservation5.getReservationId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        reservation5.setDepositPaid(false);
        model.Reservation.ReservationState reservationState8 = null;
        reservation5.setState(reservationState8);
        java.time.LocalDateTime localDateTime10 = reservation5.getStartTime();
        reservation5.setUserID("");
        java.time.LocalDateTime localDateTime13 = null;
        reservation5.extendReservation(localDateTime13);
        model.Reservation.ReservationState reservationState15 = null;
        reservation5.setState(reservationState15);
        java.time.LocalDateTime localDateTime17 = reservation5.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        reservation5.setDepositPaid(false);
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.setEndTime(localDateTime10);
        model.Reservation.ReservationState reservationState12 = null;
        reservation5.setState(reservationState12);
        java.time.LocalDateTime localDateTime14 = reservation5.getEndTime();
        java.time.LocalDateTime localDateTime15 = reservation5.getEndTime();
        java.time.LocalDateTime localDateTime16 = reservation5.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.Reservation reservation6 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime7 = null;
        reservation6.setEndTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = reservation6.getEndTime();
        java.time.LocalDateTime localDateTime10 = null;
        reservation6.setStartTime(localDateTime10);
        java.time.LocalDateTime localDateTime12 = reservation6.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.Reservation reservation6 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime7 = null;
        reservation6.setEndTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = reservation6.getEndTime();
        java.time.LocalDateTime localDateTime10 = null;
        reservation6.setStartTime(localDateTime10);
        java.lang.Class<?> wildcardClass12 = reservation6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.User.User user7 = null;
        double double8 = reservation5.calculateTotalCost(user7);
        reservation5.setUserID("hi!");
        model.Reservation.Reservation reservation11 = reservation5.cancelReservation();
        java.lang.Class<?> wildcardClass12 = reservation5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.lang.String str9 = reservation5.getEquipmentID();
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.setStartTime(localDateTime10);
        double double12 = reservation5.calculateHours();
        java.time.LocalDateTime localDateTime13 = null;
        reservation5.extendReservation(localDateTime13);
        model.Reservation.Reservation reservation15 = reservation5.cancelReservation();
        model.Reservation.ReservationState reservationState16 = reservation15.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState16);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.lang.String str9 = reservation5.getEquipmentID();
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.setStartTime(localDateTime10);
        double double12 = reservation5.calculateHours();
        java.time.LocalDateTime localDateTime13 = null;
        reservation5.extendReservation(localDateTime13);
        model.Reservation.Reservation reservation15 = reservation5.cancelReservation();
        reservation15.setDepositPaid(false);
        reservation15.setDepositAmount((double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation15);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.Reservation reservation6 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime7 = null;
        reservation6.extendReservation(localDateTime7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation6);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        model.Reservation.Reservation reservation8 = reservation5.cancelReservation();
        reservation8.setDepositPaid(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation8);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.lang.String str9 = reservation5.getEquipmentID();
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.setStartTime(localDateTime10);
        double double12 = reservation5.calculateHours();
        java.time.LocalDateTime localDateTime13 = null;
        reservation5.extendReservation(localDateTime13);
        model.Reservation.Reservation reservation15 = reservation5.cancelReservation();
        model.Reservation.Reservation reservation16 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime17 = reservation16.getEndTime();
        model.Reservation.ReservationState reservationState18 = reservation16.getState();
        java.lang.String str19 = reservation16.getUserId();
        reservation16.setUserID("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        model.Reservation.Reservation reservation8 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.extendReservation(localDateTime9);
        java.time.LocalDateTime localDateTime11 = null;
        reservation5.setStartTime(localDateTime11);
        reservation5.setDepositAmount((double) (byte) 0);
        java.time.LocalDateTime localDateTime15 = null;
        reservation5.extendReservation(localDateTime15);
        java.lang.String str17 = reservation5.getReservationId();
        model.Reservation.ReservationState reservationState18 = reservation5.getState();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = reservationState18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState18);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.Reservation reservation6 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime7 = reservation5.getStartTime();
        model.Reservation.ReservationState reservationState8 = null;
        reservation5.setState(reservationState8);
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.extendReservation(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime7);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        reservation5.setDepositPaid(false);
        java.lang.String str10 = reservation5.getReservationId();
        model.Reservation.ReservationState reservationState11 = null;
        reservation5.setState(reservationState11);
        reservation5.setDepositAmount((double) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        java.lang.String str8 = reservation5.getReservationId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        model.Reservation.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        model.Reservation.Reservation reservation11 = reservation5.cancelReservation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation11);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        java.time.LocalDateTime localDateTime7 = reservation5.getStartTime();
        java.time.LocalDateTime localDateTime8 = reservation5.getEndTime();
        model.Reservation.ReservationState reservationState9 = reservation5.getState();
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.extendReservation(localDateTime10);
        java.lang.String str12 = reservation5.getReservationId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        java.time.LocalDateTime localDateTime7 = reservation5.getStartTime();
        java.time.LocalDateTime localDateTime8 = reservation5.getEndTime();
        model.Reservation.ReservationState reservationState9 = reservation5.getState();
        java.time.LocalDateTime localDateTime10 = reservation5.getEndTime();
        model.User.User user11 = null;
        double double12 = reservation5.calculateTotalCost(user11);
        java.time.LocalDateTime localDateTime13 = null;
        reservation5.extendReservation(localDateTime13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        reservation5.setDepositPaid(false);
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.setEndTime(localDateTime10);
        model.Reservation.ReservationState reservationState12 = null;
        reservation5.setState(reservationState12);
        java.time.LocalDateTime localDateTime14 = reservation5.getEndTime();
        model.Reservation.ReservationState reservationState15 = null;
        reservation5.setState(reservationState15);
        java.time.LocalDateTime localDateTime17 = reservation5.getEndTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.lang.String str9 = reservation5.getEquipmentID();
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.setStartTime(localDateTime10);
        double double12 = reservation5.calculateHours();
        reservation5.setDepositAmount((double) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime8 = reservation5.getEndTime();
        model.Reservation.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        java.time.LocalDateTime localDateTime11 = reservation5.getEndTime();
        model.Reservation.Reservation reservation12 = reservation5.cancelReservation();
        java.lang.Class<?> wildcardClass13 = reservation12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        reservation5.setDepositPaid(false);
        java.time.LocalDateTime localDateTime10 = reservation5.getEndTime();
        model.Reservation.ReservationState reservationState11 = reservation5.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState11);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation5.setEndTime(localDateTime8);
        java.time.LocalDateTime localDateTime10 = reservation5.getEndTime();
        double double11 = reservation5.calculateHours();
        java.lang.String str12 = reservation5.getReservationId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        model.Reservation.Reservation reservation8 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.extendReservation(localDateTime9);
        java.time.LocalDateTime localDateTime11 = null;
        reservation5.setStartTime(localDateTime11);
        reservation5.setDepositAmount((double) (byte) 0);
        java.time.LocalDateTime localDateTime15 = null;
        reservation5.extendReservation(localDateTime15);
        model.User.User user17 = null;
        double double18 = reservation5.calculateTotalCost(user17);
        double double19 = reservation5.calculateHours();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        reservation5.setDepositPaid(false);
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.setEndTime(localDateTime10);
        model.Reservation.ReservationState reservationState12 = null;
        reservation5.setState(reservationState12);
        java.time.LocalDateTime localDateTime14 = reservation5.getEndTime();
        reservation5.setDepositPaid(true);
        model.Reservation.Reservation reservation17 = reservation5.cancelReservation();
        model.Reservation.Reservation reservation18 = reservation5.cancelReservation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation18);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.lang.String str9 = reservation5.getEquipmentID();
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.setStartTime(localDateTime10);
        double double12 = reservation5.calculateHours();
        java.time.LocalDateTime localDateTime13 = null;
        reservation5.extendReservation(localDateTime13);
        model.Reservation.Reservation reservation15 = reservation5.cancelReservation();
        double double16 = reservation15.calculateHours();
        java.time.LocalDateTime localDateTime17 = null;
        reservation15.extendReservation(localDateTime17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        reservation5.setDepositPaid(false);
        model.Reservation.Reservation reservation8 = reservation5.cancelReservation();
        reservation8.setDepositAmount((double) 10);
        reservation8.setUserID("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation8);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        java.time.LocalDateTime localDateTime7 = reservation5.getStartTime();
        java.time.LocalDateTime localDateTime8 = reservation5.getEndTime();
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.setEndTime(localDateTime9);
        java.time.LocalDateTime localDateTime11 = null;
        reservation5.extendReservation(localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        java.time.LocalDateTime localDateTime8 = reservation5.getEndTime();
        double double9 = reservation5.calculateHours();
        double double10 = reservation5.calculateHours();
        java.time.LocalDateTime localDateTime11 = null;
        reservation5.extendReservation(localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setEndTime(localDateTime8);
        model.Reservation.ReservationState reservationState10 = null;
        reservation7.setState(reservationState10);
        double double12 = reservation7.calculateHours();
        java.time.LocalDateTime localDateTime13 = reservation7.getStartTime();
        java.time.LocalDateTime localDateTime14 = reservation7.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setEndTime(localDateTime8);
        model.Reservation.ReservationState reservationState10 = null;
        reservation7.setState(reservationState10);
        java.lang.String str12 = reservation7.getEquipmentID();
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.setEndTime(localDateTime13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setEndTime(localDateTime8);
        reservation7.setUserID("hi!");
        model.Reservation.ReservationState reservationState12 = reservation7.getState();
        reservation7.setUserID("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState12);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setEndTime(localDateTime8);
        reservation7.setUserID("hi!");
        java.time.LocalDateTime localDateTime12 = reservation7.getEndTime();
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.extendReservation(localDateTime13);
        java.lang.Class<?> wildcardClass15 = reservation7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        reservation5.setDepositPaid(false);
        model.Reservation.Reservation reservation8 = reservation5.cancelReservation();
        reservation8.setDepositAmount((double) 10);
        reservation8.setDepositPaid(false);
        java.lang.Class<?> wildcardClass13 = reservation8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        reservation5.setDepositPaid(false);
        model.Reservation.ReservationState reservationState8 = null;
        reservation5.setState(reservationState8);
        java.time.LocalDateTime localDateTime10 = reservation5.getStartTime();
        reservation5.setUserID("");
        double double13 = reservation5.calculateHours();
        java.time.LocalDateTime localDateTime14 = null;
        reservation5.setEndTime(localDateTime14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.lang.String str9 = reservation5.getEquipmentID();
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.setStartTime(localDateTime10);
        reservation5.setUserID("hi!");
        java.time.LocalDateTime localDateTime14 = reservation5.getStartTime();
        java.time.LocalDateTime localDateTime15 = reservation5.getEndTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation5.setEndTime(localDateTime8);
        java.time.LocalDateTime localDateTime10 = reservation5.getEndTime();
        model.Reservation.ReservationState reservationState11 = null;
        reservation5.setState(reservationState11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.setStartTime(localDateTime9);
        java.time.LocalDateTime localDateTime11 = null;
        reservation5.extendReservation(localDateTime11);
        java.time.LocalDateTime localDateTime13 = null;
        reservation5.setStartTime(localDateTime13);
        java.time.LocalDateTime localDateTime15 = null;
        reservation5.setStartTime(localDateTime15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        model.Reservation.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        java.lang.String str11 = reservation5.getUserId();
        model.User.User user12 = null;
        double double13 = reservation5.calculateTotalCost(user12);
        java.lang.String str14 = reservation5.getEquipmentID();
        model.Reservation.Reservation reservation15 = reservation5.cancelReservation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation15);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime8 = reservation5.getStartTime();
        java.lang.String str9 = reservation5.getEquipmentID();
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.extendReservation(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = reservation5.getState();
        reservation5.setDepositAmount((-1.0d));
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.extendReservation(localDateTime9);
        model.User.User user11 = null;
        double double12 = reservation5.calculateTotalCost(user11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.lang.String str9 = reservation5.getEquipmentID();
        java.lang.String str10 = reservation5.getEquipmentID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        double double7 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState8 = reservation5.getState();
        reservation5.setUserID("");
        reservation5.setDepositPaid(false);
        java.lang.Class<?> wildcardClass13 = reservation5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        model.Reservation.Reservation reservation8 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime9 = null;
        reservation8.extendReservation(localDateTime9);
        java.lang.String str11 = reservation8.getEquipmentID();
        java.lang.String str12 = reservation8.getUserId();
        java.lang.String str13 = reservation8.getUserId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.Reservation reservation6 = reservation5.cancelReservation();
        model.Reservation.ReservationState reservationState7 = reservation5.getState();
        model.Reservation.ReservationState reservationState8 = null;
        reservation5.setState(reservationState8);
        model.User.User user10 = null;
        double double11 = reservation5.calculateTotalCost(user10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime8 = reservation5.getEndTime();
        model.Reservation.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        java.time.LocalDateTime localDateTime11 = reservation5.getEndTime();
        model.Reservation.Reservation reservation12 = reservation5.cancelReservation();
        java.lang.String str13 = reservation12.getUserId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation5.setEndTime(localDateTime8);
        reservation5.setUserID("hi!");
        java.lang.String str12 = reservation5.getReservationId();
        reservation5.setUserID("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.User.User user7 = null;
        double double8 = reservation5.calculateTotalCost(user7);
        reservation5.setUserID("hi!");
        model.Reservation.ReservationState reservationState11 = null;
        reservation5.setState(reservationState11);
        java.time.LocalDateTime localDateTime13 = null;
        reservation5.setStartTime(localDateTime13);
        reservation5.setDepositAmount(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        model.Reservation.Reservation reservation8 = reservation5.cancelReservation();
        model.User.User user9 = null;
        double double10 = reservation8.calculateTotalCost(user9);
        reservation8.setUserID("");
        reservation8.setDepositAmount((double) 100);
        model.Reservation.Reservation reservation15 = reservation8.cancelReservation();
        reservation15.setDepositPaid(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation15);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        reservation5.setDepositPaid(false);
        java.lang.String str10 = reservation5.getUserId();
        double double11 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState12 = reservation5.getState();
        model.Reservation.Reservation reservation13 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime14 = null;
        reservation13.extendReservation(localDateTime14);
        java.time.LocalDateTime localDateTime16 = null;
        reservation13.extendReservation(localDateTime16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation13);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.Reservation reservation6 = reservation5.cancelReservation();
        reservation6.setUserID("hi!");
        reservation6.setDepositAmount((double) 0L);
        reservation6.setUserID("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation6);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        model.Reservation.Reservation reservation8 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.extendReservation(localDateTime9);
        java.time.LocalDateTime localDateTime11 = null;
        reservation5.setEndTime(localDateTime11);
        java.time.LocalDateTime localDateTime13 = null;
        reservation5.setStartTime(localDateTime13);
        model.Reservation.Reservation reservation15 = reservation5.cancelReservation();
        double double16 = reservation5.calculateHours();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = reservation5.getState();
        java.time.LocalDateTime localDateTime7 = null;
        reservation5.setStartTime(localDateTime7);
        model.Reservation.Reservation reservation9 = reservation5.cancelReservation();
        java.lang.String str10 = reservation9.getEquipmentID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        model.Reservation.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        java.lang.String str11 = reservation5.getUserId();
        model.User.User user12 = null;
        double double13 = reservation5.calculateTotalCost(user12);
        java.time.LocalDateTime localDateTime14 = reservation5.getEndTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        model.Reservation.Reservation reservation8 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.extendReservation(localDateTime9);
        java.time.LocalDateTime localDateTime11 = null;
        reservation5.setEndTime(localDateTime11);
        java.time.LocalDateTime localDateTime13 = null;
        reservation5.setStartTime(localDateTime13);
        reservation5.setDepositAmount((double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation8);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.lang.String str9 = reservation5.getEquipmentID();
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.setStartTime(localDateTime10);
        model.User.User user12 = null;
        double double13 = reservation5.calculateTotalCost(user12);
        model.User.User user14 = null;
        double double15 = reservation5.calculateTotalCost(user14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        reservation5.setDepositPaid(false);
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.extendReservation(localDateTime10);
        java.lang.String str12 = reservation5.getEquipmentID();
        java.lang.String str13 = reservation5.getUserId();
        model.Reservation.ReservationState reservationState14 = null;
        reservation5.setState(reservationState14);
        java.time.LocalDateTime localDateTime16 = reservation5.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        java.time.LocalDateTime localDateTime8 = reservation5.getEndTime();
        double double9 = reservation5.calculateHours();
        double double10 = reservation5.calculateHours();
        java.lang.String str11 = reservation5.getReservationId();
        java.lang.Class<?> wildcardClass12 = reservation5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime8 = reservation5.getEndTime();
        model.Reservation.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        java.time.LocalDateTime localDateTime11 = reservation5.getEndTime();
        reservation5.setDepositAmount((double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setEndTime(localDateTime8);
        java.lang.String str10 = reservation7.getReservationId();
        java.time.LocalDateTime localDateTime11 = reservation7.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.setStartTime(localDateTime9);
        reservation5.setUserID("hi!");
        double double13 = reservation5.calculateHours();
        reservation5.setDepositAmount((double) 10);
        java.lang.String str16 = reservation5.getEquipmentID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        reservation5.setDepositPaid(false);
        model.Reservation.ReservationState reservationState8 = null;
        reservation5.setState(reservationState8);
        java.time.LocalDateTime localDateTime10 = reservation5.getStartTime();
        java.time.LocalDateTime localDateTime11 = reservation5.getEndTime();
        java.time.LocalDateTime localDateTime12 = null;
        reservation5.setStartTime(localDateTime12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime8 = reservation5.getStartTime();
        double double9 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState10 = reservation5.getState();
        java.time.LocalDateTime localDateTime11 = reservation5.getEndTime();
        java.time.LocalDateTime localDateTime12 = null;
        reservation5.setStartTime(localDateTime12);
        java.time.LocalDateTime localDateTime14 = reservation5.getEndTime();
        reservation5.setUserID("");
        java.lang.Class<?> wildcardClass17 = reservation5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.Reservation reservation6 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime7 = null;
        reservation5.extendReservation(localDateTime7);
        model.Reservation.Reservation reservation9 = reservation5.cancelReservation();
        reservation5.setDepositAmount((double) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation9);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.lang.String str9 = reservation5.getEquipmentID();
        java.time.LocalDateTime localDateTime10 = reservation5.getStartTime();
        reservation5.setDepositAmount((double) (-1.0f));
        reservation5.setUserID("hi!");
        model.User.User user15 = null;
        double double16 = reservation5.calculateTotalCost(user15);
        java.time.LocalDateTime localDateTime17 = reservation5.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        java.time.LocalDateTime localDateTime7 = reservation5.getStartTime();
        java.time.LocalDateTime localDateTime8 = reservation5.getEndTime();
        model.Reservation.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        java.lang.String str11 = reservation5.getEquipmentID();
        java.time.LocalDateTime localDateTime12 = null;
        reservation5.extendReservation(localDateTime12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime8 = reservation5.getEndTime();
        model.Reservation.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        java.time.LocalDateTime localDateTime11 = null;
        reservation5.setStartTime(localDateTime11);
        model.Reservation.Reservation reservation13 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime14 = reservation5.getEndTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        reservation5.setDepositPaid(false);
        model.Reservation.Reservation reservation8 = reservation5.cancelReservation();
        reservation8.setDepositAmount((double) 10);
        reservation8.setDepositPaid(false);
        model.Reservation.Reservation reservation13 = reservation8.cancelReservation();
        reservation8.setDepositPaid(false);
        java.time.LocalDateTime localDateTime16 = null;
        reservation8.setStartTime(localDateTime16);
        reservation8.setUserID("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation13);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        reservation5.setDepositPaid(false);
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.extendReservation(localDateTime10);
        java.lang.String str12 = reservation5.getEquipmentID();
        java.lang.String str13 = reservation5.getUserId();
        model.Reservation.ReservationState reservationState14 = null;
        reservation5.setState(reservationState14);
        reservation5.setDepositAmount(100.0d);
        java.lang.String str18 = reservation5.getEquipmentID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.lang.String str9 = reservation5.getEquipmentID();
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.setStartTime(localDateTime10);
        double double12 = reservation5.calculateHours();
        java.time.LocalDateTime localDateTime13 = null;
        reservation5.extendReservation(localDateTime13);
        model.Reservation.Reservation reservation15 = reservation5.cancelReservation();
        model.Reservation.Reservation reservation16 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime17 = reservation16.getEndTime();
        model.Reservation.ReservationState reservationState18 = reservation16.getState();
        model.Reservation.ReservationState reservationState19 = reservation16.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState19);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        model.Reservation.Reservation reservation8 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.extendReservation(localDateTime9);
        java.time.LocalDateTime localDateTime11 = null;
        reservation5.setEndTime(localDateTime11);
        java.time.LocalDateTime localDateTime13 = null;
        reservation5.setStartTime(localDateTime13);
        model.Reservation.Reservation reservation15 = reservation5.cancelReservation();
        model.Reservation.Reservation reservation16 = reservation5.cancelReservation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation16);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "hi!", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        reservation5.setDepositPaid(false);
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.setEndTime(localDateTime10);
        model.Reservation.ReservationState reservationState12 = null;
        reservation5.setState(reservationState12);
        java.lang.String str14 = reservation5.getReservationId();
        java.time.LocalDateTime localDateTime15 = reservation5.getEndTime();
        java.time.LocalDateTime localDateTime16 = null;
        reservation5.extendReservation(localDateTime16);
        double double18 = reservation5.calculateHours();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        double double7 = reservation5.calculateHours();
        java.lang.String str8 = reservation5.getEquipmentID();
        java.lang.String str9 = reservation5.getUserId();
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.extendReservation(localDateTime10);
        java.time.LocalDateTime localDateTime12 = reservation5.getEndTime();
        double double13 = reservation5.calculateHours();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime8 = reservation5.getStartTime();
        double double9 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState10 = reservation5.getState();
        java.time.LocalDateTime localDateTime11 = reservation5.getEndTime();
        java.time.LocalDateTime localDateTime12 = null;
        reservation5.setStartTime(localDateTime12);
        java.time.LocalDateTime localDateTime14 = reservation5.getEndTime();
        reservation5.setUserID("");
        reservation5.setDepositPaid(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        reservation5.setDepositPaid(false);
        java.lang.String str10 = reservation5.getUserId();
        double double11 = reservation5.calculateHours();
        model.Reservation.ReservationState reservationState12 = reservation5.getState();
        model.Reservation.Reservation reservation13 = reservation5.cancelReservation();
        model.Reservation.Reservation reservation14 = reservation5.cancelReservation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(reservationState12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation14);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        java.time.LocalDateTime localDateTime8 = reservation5.getEndTime();
        model.Reservation.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        java.time.LocalDateTime localDateTime11 = null;
        reservation5.setStartTime(localDateTime11);
        model.Reservation.Reservation reservation13 = reservation5.cancelReservation();
        java.lang.String str14 = reservation5.getReservationId();
        java.time.LocalDateTime localDateTime15 = null;
        reservation5.setEndTime(localDateTime15);
        java.lang.String str17 = reservation5.getReservationId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        double double6 = reservation5.calculateHours();
        model.Reservation.Reservation reservation7 = reservation5.cancelReservation();
        reservation5.setDepositPaid(false);
        java.lang.String str10 = reservation5.getUserId();
        double double11 = reservation5.calculateHours();
        java.time.LocalDateTime localDateTime12 = reservation5.getEndTime();
        java.time.LocalDateTime localDateTime13 = null;
        reservation5.setEndTime(localDateTime13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservation7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("", "hi!", localDateTime2, localDateTime3, reservationState4);
        java.time.LocalDateTime localDateTime6 = reservation5.getStartTime();
        double double7 = reservation5.calculateHours();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Reservation.ReservationState reservationState4 = null;
        model.Reservation.Reservation reservation5 = new model.Reservation.Reservation("hi!", "", localDateTime2, localDateTime3, reservationState4);
        model.Reservation.ReservationState reservationState6 = null;
        reservation5.setState(reservationState6);
        java.time.LocalDateTime localDateTime8 = reservation5.getEndTime();
        double double9 = reservation5.calculateHours();
        double double10 = reservation5.calculateHours();
        model.User.User user11 = null;
        double double12 = reservation5.calculateTotalCost(user11);
        java.time.LocalDateTime localDateTime13 = reservation5.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime13);
    }
}

