package model.controller;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ReservationControllerRegressionTest {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.lang.Class<?> wildcardClass1 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.lang.Class<?> wildcardClass3 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("hi!", localDateTime2, localDateTime3);
        model.Reservation.Reservation reservation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation6 = reservationController0.createReservation(reservation5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("hi!", localDateTime2, localDateTime3);
        java.lang.Class<?> wildcardClass5 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = reservationController0.updateReservation("hi!", "", localDateTime3, localDateTime4);
        java.lang.Class<?> wildcardClass6 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("hi!", localDateTime2, localDateTime3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = reservationController0.isTimeSlotAvailable("hi!", localDateTime6, localDateTime7);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation12 = reservationController0.createReservation("", localDateTime10, localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        model.Reservation.Reservation reservation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation8 = reservationController0.createReservation(reservation7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        model.Reservation.Reservation reservation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation6 = reservationController0.createReservation(reservation5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("hi!", localDateTime2, localDateTime3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = reservationController0.isTimeSlotAvailable("hi!", localDateTime6, localDateTime7);
        java.util.ArrayList<model.Reservation.Reservation> reservationList9 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation13 = reservationController0.createReservation("", localDateTime11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList9);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.isTimeSlotAvailable("", localDateTime15, localDateTime16);
        model.Reservation.Reservation reservation18 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation19 = reservationController0.createReservation(reservation18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("hi!", localDateTime2, localDateTime3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = reservationController0.isTimeSlotAvailable("hi!", localDateTime6, localDateTime7);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = reservationController0.isTimeSlotAvailable("hi!", localDateTime10, localDateTime11);
        model.Reservation.Reservation reservation13 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation14 = reservationController0.createReservation(reservation13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        boolean boolean2 = reservationController0.cancelReservation("");
        java.lang.Class<?> wildcardClass3 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        boolean boolean2 = reservationController0.cancelReservation("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation8 = reservationController0.createReservation("", localDateTime6, localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.isTimeSlotAvailable("", localDateTime15, localDateTime16);
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation23 = reservationController0.createReservation("hi!", localDateTime21, localDateTime22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation2 = reservationController0.createReservation(reservation1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.isTimeSlotAvailable("", localDateTime15, localDateTime16);
        java.lang.Class<?> wildcardClass18 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.lang.Class<?> wildcardClass7 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.isTimeSlotAvailable("", localDateTime15, localDateTime16);
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = reservationController0.updateReservation("hi!", "", localDateTime22, localDateTime23);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation28 = reservationController0.createReservation("", localDateTime26, localDateTime27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("hi!", localDateTime2, localDateTime3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = reservationController0.isTimeSlotAvailable("hi!", localDateTime6, localDateTime7);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = reservationController0.isTimeSlotAvailable("hi!", localDateTime10, localDateTime11);
        java.lang.Class<?> wildcardClass13 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation14 = reservationController0.createReservation("hi!", localDateTime12, localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("hi!", localDateTime2, localDateTime3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = reservationController0.isTimeSlotAvailable("hi!", localDateTime6, localDateTime7);
        boolean boolean10 = reservationController0.cancelReservation("hi!");
        java.lang.Class<?> wildcardClass11 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation4 = reservationController0.createReservation("", localDateTime2, localDateTime3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        java.lang.Class<?> wildcardClass6 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.updateReservation("", "hi!", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation14 = reservationController0.createReservation("", localDateTime12, localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        boolean boolean2 = reservationController0.cancelReservation("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        java.lang.Class<?> wildcardClass5 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.isTimeSlotAvailable("", localDateTime15, localDateTime16);
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = reservationController0.updateReservation("hi!", "", localDateTime22, localDateTime23);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation28 = reservationController0.createReservation("hi!", localDateTime26, localDateTime27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        java.util.ArrayList<model.Reservation.Reservation> reservationList13 = reservationController0.getReservationsByEquipment("hi!");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation17 = reservationController0.createReservation("", localDateTime15, localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList13);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("hi!", localDateTime2, localDateTime3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = reservationController0.isTimeSlotAvailable("hi!", localDateTime6, localDateTime7);
        boolean boolean10 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation14 = reservationController0.createReservation("", localDateTime12, localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        model.Reservation.Reservation reservation6 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation7 = reservationController0.createReservation(reservation6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("hi!", localDateTime2, localDateTime3);
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = reservationController0.updateReservation("", "", localDateTime7, localDateTime8);
        model.Reservation.Reservation reservation10 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation11 = reservationController0.createReservation(reservation10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList8 = reservationController0.getReservationsByEquipment("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation12 = reservationController0.createReservation("", localDateTime10, localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("hi!", localDateTime2, localDateTime3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = reservationController0.isTimeSlotAvailable("hi!", localDateTime6, localDateTime7);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = reservationController0.isTimeSlotAvailable("hi!", localDateTime10, localDateTime11);
        java.util.ArrayList<model.Reservation.Reservation> reservationList14 = reservationController0.getReservationsByEquipment("");
        model.Reservation.Reservation reservation15 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation16 = reservationController0.createReservation(reservation15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList14);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        java.util.ArrayList<model.Reservation.Reservation> reservationList13 = reservationController0.getReservationsByEquipment("hi!");
        java.lang.Class<?> wildcardClass14 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.updateReservation("", "hi!", localDateTime8, localDateTime9);
        java.util.ArrayList<model.Reservation.Reservation> reservationList12 = reservationController0.getReservationsByEquipment("");
        java.lang.Class<?> wildcardClass13 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("hi!", localDateTime2, localDateTime3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = reservationController0.isTimeSlotAvailable("hi!", localDateTime6, localDateTime7);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = reservationController0.isTimeSlotAvailable("hi!", localDateTime10, localDateTime11);
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation16 = reservationController0.createReservation("", localDateTime14, localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        model.Reservation.Reservation reservation6 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation7 = reservationController0.createReservation(reservation6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("hi!", "hi!", localDateTime9, localDateTime10);
        model.Reservation.Reservation reservation12 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation13 = reservationController0.createReservation(reservation12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("", localDateTime8, localDateTime9);
        java.lang.Class<?> wildcardClass11 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("");
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation10 = reservationController0.createReservation("hi!", localDateTime8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.util.ArrayList<model.Reservation.Reservation> reservationList8 = reservationController0.getReservationsByEquipment("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation12 = reservationController0.createReservation("", localDateTime10, localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("", localDateTime8, localDateTime9);
        model.Reservation.Reservation reservation11 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation12 = reservationController0.createReservation(reservation11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList8 = reservationController0.getReservationsByEquipment("");
        java.lang.Class<?> wildcardClass9 = reservationList8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.isTimeSlotAvailable("", localDateTime15, localDateTime16);
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getReservationsByEquipment("");
        model.Reservation.Reservation reservation20 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation21 = reservationController0.createReservation(reservation20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("hi!", "hi!", localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.isTimeSlotAvailable("hi!", localDateTime13, localDateTime14);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation19 = reservationController0.createReservation("", localDateTime17, localDateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList6 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("hi!", "hi!", localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.isTimeSlotAvailable("", localDateTime13, localDateTime14);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = reservationController0.updateReservation("hi!", "hi!", localDateTime18, localDateTime19);
        java.util.ArrayList<model.Reservation.Reservation> reservationList21 = reservationController0.getMyReservations();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList21);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = reservationController0.updateReservation("", "hi!", localDateTime14, localDateTime15);
        model.Reservation.Reservation reservation17 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation18 = reservationController0.createReservation(reservation17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList8 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList9 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList10 = reservationController0.getMyReservations();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList10);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList6 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("hi!", "hi!", localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation15 = reservationController0.createReservation("", localDateTime13, localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        model.Reservation.Reservation reservation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation8 = reservationController0.createReservation(reservation7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("");
        model.Reservation.Reservation reservation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation8 = reservationController0.createReservation(reservation7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("hi!", localDateTime2, localDateTime3);
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = reservationController0.updateReservation("", "", localDateTime7, localDateTime8);
        java.lang.Class<?> wildcardClass10 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.updateReservation("hi!", "hi!", localDateTime13, localDateTime14);
        java.util.ArrayList<model.Reservation.Reservation> reservationList17 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList18 = reservationController0.getMyReservations();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList18);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList6 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("hi!", "hi!", localDateTime9, localDateTime10);
        java.lang.Class<?> wildcardClass12 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = reservationController0.isTimeSlotAvailable("", localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = reservationController0.isTimeSlotAvailable("", localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation22 = reservationController0.createReservation("", localDateTime20, localDateTime21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = reservationController0.isTimeSlotAvailable("", localDateTime7, localDateTime8);
        java.util.ArrayList<model.Reservation.Reservation> reservationList10 = reservationController0.getMyReservations();
        model.Reservation.Reservation reservation11 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation12 = reservationController0.createReservation(reservation11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList10);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        boolean boolean2 = reservationController0.cancelReservation("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        model.Reservation.Reservation reservation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation8 = reservationController0.createReservation(reservation7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.updateReservation("hi!", "hi!", localDateTime13, localDateTime14);
        java.util.ArrayList<model.Reservation.Reservation> reservationList17 = reservationController0.getReservationsByEquipment("");
        java.lang.Class<?> wildcardClass18 = reservationList17.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        java.util.ArrayList<model.Reservation.Reservation> reservationList13 = reservationController0.getReservationsByEquipment("hi!");
        model.Reservation.Reservation reservation14 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation15 = reservationController0.createReservation(reservation14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList13);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = reservationController0.updateReservation("hi!", "", localDateTime3, localDateTime4);
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = reservationController0.isTimeSlotAvailable("hi!", localDateTime7, localDateTime8);
        java.util.ArrayList<model.Reservation.Reservation> reservationList10 = reservationController0.getMyReservations();
        model.Reservation.Reservation reservation11 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation12 = reservationController0.createReservation(reservation11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList10);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("hi!", localDateTime2, localDateTime3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = reservationController0.isTimeSlotAvailable("hi!", localDateTime6, localDateTime7);
        java.util.ArrayList<model.Reservation.Reservation> reservationList9 = reservationController0.getMyReservations();
        model.Reservation.Reservation reservation10 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation11 = reservationController0.createReservation(reservation10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList9);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = reservationController0.isTimeSlotAvailable("", localDateTime12, localDateTime13);
        model.Reservation.Reservation reservation15 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation16 = reservationController0.createReservation(reservation15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList6 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("hi!", "hi!", localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.isTimeSlotAvailable("", localDateTime13, localDateTime14);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = reservationController0.updateReservation("hi!", "hi!", localDateTime18, localDateTime19);
        java.lang.Class<?> wildcardClass21 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList8 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList9 = reservationController0.getMyReservations();
        boolean boolean11 = reservationController0.cancelReservation("");
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation10 = reservationController0.createReservation("", localDateTime8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = reservationController0.isTimeSlotAvailable("hi!", localDateTime6, localDateTime7);
        java.util.ArrayList<model.Reservation.Reservation> reservationList10 = reservationController0.getReservationsByEquipment("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList10);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = reservationController0.isTimeSlotAvailable("", localDateTime7, localDateTime8);
        java.util.ArrayList<model.Reservation.Reservation> reservationList11 = reservationController0.getReservationsByEquipment("");
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = reservationController0.updateReservation("hi!", "hi!", localDateTime16, localDateTime17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.isTimeSlotAvailable("", localDateTime15, localDateTime16);
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = reservationController0.isTimeSlotAvailable("", localDateTime21, localDateTime22);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = reservationController0.updateReservation("", "", localDateTime26, localDateTime27);
        java.util.ArrayList<model.Reservation.Reservation> reservationList30 = reservationController0.getReservationsByEquipment("hi!");
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation34 = reservationController0.createReservation("hi!", localDateTime32, localDateTime33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList30);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        java.util.ArrayList<model.Reservation.Reservation> reservationList13 = reservationController0.getReservationsByEquipment("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList14 = reservationController0.getMyReservations();
        boolean boolean16 = reservationController0.cancelReservation("hi!");
        java.lang.Class<?> wildcardClass17 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        java.lang.Class<?> wildcardClass6 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList8 = reservationController0.getReservationsByEquipment("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation12 = reservationController0.createReservation("", localDateTime10, localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.isTimeSlotAvailable("", localDateTime15, localDateTime16);
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = reservationController0.isTimeSlotAvailable("", localDateTime21, localDateTime22);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = reservationController0.updateReservation("", "", localDateTime26, localDateTime27);
        java.util.ArrayList<model.Reservation.Reservation> reservationList30 = reservationController0.getReservationsByEquipment("hi!");
        boolean boolean32 = reservationController0.cancelReservation("hi!");
        java.lang.Class<?> wildcardClass33 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = reservationController0.isTimeSlotAvailable("", localDateTime7, localDateTime8);
        java.util.ArrayList<model.Reservation.Reservation> reservationList11 = reservationController0.getReservationsByEquipment("");
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        model.Reservation.Reservation reservation14 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation15 = reservationController0.createReservation(reservation14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList8 = reservationController0.getReservationsByEquipment("hi!");
        java.lang.Class<?> wildcardClass9 = reservationList8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.isTimeSlotAvailable("", localDateTime15, localDateTime16);
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = reservationController0.isTimeSlotAvailable("", localDateTime21, localDateTime22);
        boolean boolean25 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList26 = reservationController0.getMyReservations();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList26);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = reservationController0.isTimeSlotAvailable("", localDateTime7, localDateTime8);
        java.util.ArrayList<model.Reservation.Reservation> reservationList10 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.updateReservation("hi!", "", localDateTime13, localDateTime14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList15 = reservationController0.getReservationsByEquipment("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList16 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList17 = reservationController0.getMyReservations();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList17);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = reservationController0.isTimeSlotAvailable("", localDateTime7, localDateTime8);
        java.util.ArrayList<model.Reservation.Reservation> reservationList11 = reservationController0.getReservationsByEquipment("");
        java.lang.Class<?> wildcardClass12 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        boolean boolean2 = reservationController0.cancelReservation("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("hi!", "hi!", localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = reservationController0.updateReservation("hi!", "", localDateTime14, localDateTime15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("");
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("hi!", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = reservationController0.isTimeSlotAvailable("", localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = reservationController0.updateReservation("", "", localDateTime17, localDateTime18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.isTimeSlotAvailable("", localDateTime15, localDateTime16);
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getReservationsByEquipment("");
        boolean boolean21 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList23 = reservationController0.getReservationsByEquipment("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList23);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.updateReservation("hi!", "hi!", localDateTime13, localDateTime14);
        boolean boolean17 = reservationController0.cancelReservation("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.isTimeSlotAvailable("", localDateTime15, localDateTime16);
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = reservationController0.isTimeSlotAvailable("", localDateTime21, localDateTime22);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = reservationController0.isTimeSlotAvailable("", localDateTime25, localDateTime26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.isTimeSlotAvailable("", localDateTime15, localDateTime16);
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = reservationController0.updateReservation("hi!", "", localDateTime22, localDateTime23);
        boolean boolean26 = reservationController0.cancelReservation("hi!");
        java.lang.Class<?> wildcardClass27 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.updateReservation("hi!", "hi!", localDateTime13, localDateTime14);
        java.util.ArrayList<model.Reservation.Reservation> reservationList17 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = reservationController0.updateReservation("", "hi!", localDateTime20, localDateTime21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList8 = reservationController0.getReservationsByEquipment("hi!");
        java.lang.Class<?> wildcardClass9 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = reservationController0.isTimeSlotAvailable("", localDateTime7, localDateTime8);
        java.util.ArrayList<model.Reservation.Reservation> reservationList10 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation14 = reservationController0.createReservation("hi!", localDateTime12, localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList10);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList14 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = reservationController0.isTimeSlotAvailable("", localDateTime16, localDateTime17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.updateReservation("", "hi!", localDateTime8, localDateTime9);
        java.util.ArrayList<model.Reservation.Reservation> reservationList12 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList13 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList14 = reservationController0.getMyReservations();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList14);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.updateReservation("hi!", "hi!", localDateTime13, localDateTime14);
        java.util.ArrayList<model.Reservation.Reservation> reservationList16 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = reservationController0.updateReservation("hi!", "", localDateTime19, localDateTime20);
        model.Reservation.Reservation reservation22 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation23 = reservationController0.createReservation(reservation22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.isTimeSlotAvailable("", localDateTime15, localDateTime16);
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = reservationController0.isTimeSlotAvailable("", localDateTime21, localDateTime22);
        boolean boolean25 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        boolean boolean30 = reservationController0.updateReservation("", "", localDateTime28, localDateTime29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.isTimeSlotAvailable("", localDateTime15, localDateTime16);
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = reservationController0.isTimeSlotAvailable("", localDateTime21, localDateTime22);
        java.util.ArrayList<model.Reservation.Reservation> reservationList24 = reservationController0.getMyReservations();
        java.lang.Class<?> wildcardClass25 = reservationList24.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        java.util.ArrayList<model.Reservation.Reservation> reservationList12 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList14 = reservationController0.getReservationsByEquipment("hi!");
        java.lang.Class<?> wildcardClass15 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation10 = reservationController0.createReservation("hi!", localDateTime8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList8 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList10 = reservationController0.getReservationsByEquipment("hi!");
        model.Reservation.Reservation reservation11 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation12 = reservationController0.createReservation(reservation11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList10);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        boolean boolean4 = reservationController0.cancelReservation("");
        model.Reservation.Reservation reservation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation6 = reservationController0.createReservation(reservation5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        boolean boolean7 = reservationController0.cancelReservation("");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation11 = reservationController0.createReservation("hi!", localDateTime9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.isTimeSlotAvailable("", localDateTime15, localDateTime16);
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = reservationController0.isTimeSlotAvailable("", localDateTime21, localDateTime22);
        boolean boolean25 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = reservationController0.isTimeSlotAvailable("", localDateTime27, localDateTime28);
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation33 = reservationController0.createReservation("", localDateTime31, localDateTime32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.isTimeSlotAvailable("", localDateTime15, localDateTime16);
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = reservationController0.isTimeSlotAvailable("", localDateTime21, localDateTime22);
        java.util.ArrayList<model.Reservation.Reservation> reservationList24 = reservationController0.getMyReservations();
        boolean boolean26 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation30 = reservationController0.createReservation("hi!", localDateTime28, localDateTime29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation10 = reservationController0.createReservation("hi!", localDateTime8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.updateReservation("hi!", "hi!", localDateTime13, localDateTime14);
        java.util.ArrayList<model.Reservation.Reservation> reservationList17 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getReservationsByEquipment("hi!");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = reservationController0.isTimeSlotAvailable("", localDateTime21, localDateTime22);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation27 = reservationController0.createReservation("hi!", localDateTime25, localDateTime26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("hi!", localDateTime2, localDateTime3);
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = reservationController0.updateReservation("", "", localDateTime7, localDateTime8);
        boolean boolean11 = reservationController0.cancelReservation("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList12 = reservationController0.getMyReservations();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList12);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList8 = reservationController0.getReservationsByEquipment("hi!");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = reservationController0.updateReservation("hi!", "", localDateTime11, localDateTime12);
        model.Reservation.Reservation reservation14 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation15 = reservationController0.createReservation(reservation14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList8 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList9 = reservationController0.getMyReservations();
        boolean boolean11 = reservationController0.cancelReservation("");
        model.Reservation.Reservation reservation12 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation13 = reservationController0.createReservation(reservation12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.updateReservation("hi!", "hi!", localDateTime13, localDateTime14);
        java.util.ArrayList<model.Reservation.Reservation> reservationList16 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = reservationController0.updateReservation("hi!", "", localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation25 = reservationController0.createReservation("", localDateTime23, localDateTime24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = reservationController0.isTimeSlotAvailable("", localDateTime7, localDateTime8);
        boolean boolean11 = reservationController0.cancelReservation("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.updateReservation("hi!", "hi!", localDateTime13, localDateTime14);
        java.util.ArrayList<model.Reservation.Reservation> reservationList16 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = reservationController0.updateReservation("hi!", "hi!", localDateTime19, localDateTime20);
        java.util.ArrayList<model.Reservation.Reservation> reservationList22 = reservationController0.getMyReservations();
        model.Reservation.Reservation reservation23 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation24 = reservationController0.createReservation(reservation23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList22);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.isTimeSlotAvailable("", localDateTime15, localDateTime16);
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getReservationsByEquipment("");
        boolean boolean21 = reservationController0.cancelReservation("hi!");
        java.lang.Class<?> wildcardClass22 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        java.util.ArrayList<model.Reservation.Reservation> reservationList13 = reservationController0.getReservationsByEquipment("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList14 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = reservationController0.updateReservation("", "", localDateTime17, localDateTime18);
        boolean boolean21 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = reservationController0.updateReservation("hi!", "hi!", localDateTime24, localDateTime25);
        model.Reservation.Reservation reservation27 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation28 = reservationController0.createReservation(reservation27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("hi!", localDateTime2, localDateTime3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = reservationController0.isTimeSlotAvailable("hi!", localDateTime6, localDateTime7);
        java.util.ArrayList<model.Reservation.Reservation> reservationList9 = reservationController0.getMyReservations();
        java.lang.Class<?> wildcardClass10 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        java.util.ArrayList<model.Reservation.Reservation> reservationList12 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.updateReservation("hi!", "hi!", localDateTime15, localDateTime16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.isTimeSlotAvailable("", localDateTime15, localDateTime16);
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = reservationController0.updateReservation("hi!", "", localDateTime22, localDateTime23);
        boolean boolean26 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList27 = reservationController0.getMyReservations();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList27);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        boolean boolean7 = reservationController0.cancelReservation("");
        java.lang.Class<?> wildcardClass8 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.updateReservation("hi!", "hi!", localDateTime13, localDateTime14);
        java.util.ArrayList<model.Reservation.Reservation> reservationList16 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = reservationController0.updateReservation("", "hi!", localDateTime19, localDateTime20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.isTimeSlotAvailable("", localDateTime15, localDateTime16);
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = reservationController0.isTimeSlotAvailable("", localDateTime21, localDateTime22);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = reservationController0.isTimeSlotAvailable("hi!", localDateTime25, localDateTime26);
        java.util.ArrayList<model.Reservation.Reservation> reservationList28 = reservationController0.getMyReservations();
        java.lang.Class<?> wildcardClass29 = reservationList28.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.isTimeSlotAvailable("", localDateTime15, localDateTime16);
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = reservationController0.isTimeSlotAvailable("", localDateTime21, localDateTime22);
        boolean boolean25 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        boolean boolean30 = reservationController0.updateReservation("hi!", "", localDateTime28, localDateTime29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList8 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList9 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = reservationController0.isTimeSlotAvailable("", localDateTime11, localDateTime12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = reservationController0.updateReservation("hi!", "hi!", localDateTime5, localDateTime6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList8 = reservationController0.getReservationsByEquipment("hi!");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = reservationController0.updateReservation("hi!", "", localDateTime11, localDateTime12);
        java.lang.Class<?> wildcardClass14 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList8 = reservationController0.getReservationsByEquipment("hi!");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = reservationController0.updateReservation("", "", localDateTime11, localDateTime12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        java.util.ArrayList<model.Reservation.Reservation> reservationList12 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList14 = reservationController0.getReservationsByEquipment("hi!");
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = reservationController0.updateReservation("hi!", "hi!", localDateTime17, localDateTime18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList6 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList8 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = reservationController0.isTimeSlotAvailable("", localDateTime10, localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList6 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("hi!", "hi!", localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.isTimeSlotAvailable("", localDateTime13, localDateTime14);
        java.util.ArrayList<model.Reservation.Reservation> reservationList16 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation20 = reservationController0.createReservation("", localDateTime18, localDateTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList16);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList8 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList9 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = reservationController0.updateReservation("hi!", "", localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation18 = reservationController0.createReservation("hi!", localDateTime16, localDateTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        boolean boolean2 = reservationController0.cancelReservation("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation8 = reservationController0.createReservation("hi!", localDateTime6, localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        java.util.ArrayList<model.Reservation.Reservation> reservationList13 = reservationController0.getReservationsByEquipment("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList14 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = reservationController0.updateReservation("", "", localDateTime17, localDateTime18);
        java.lang.Class<?> wildcardClass20 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.updateReservation("hi!", "hi!", localDateTime13, localDateTime14);
        java.util.ArrayList<model.Reservation.Reservation> reservationList17 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getReservationsByEquipment("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList20 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation24 = reservationController0.createReservation("hi!", localDateTime22, localDateTime23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList20);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.isTimeSlotAvailable("", localDateTime15, localDateTime16);
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = reservationController0.isTimeSlotAvailable("", localDateTime21, localDateTime22);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = reservationController0.updateReservation("", "", localDateTime26, localDateTime27);
        java.util.ArrayList<model.Reservation.Reservation> reservationList30 = reservationController0.getReservationsByEquipment("hi!");
        boolean boolean32 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList34 = reservationController0.getReservationsByEquipment("hi!");
        model.Reservation.Reservation reservation35 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation36 = reservationController0.createReservation(reservation35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList34);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation10 = reservationController0.createReservation("", localDateTime8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.updateReservation("hi!", "hi!", localDateTime13, localDateTime14);
        java.util.ArrayList<model.Reservation.Reservation> reservationList17 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getReservationsByEquipment("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList20 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = reservationController0.isTimeSlotAvailable("hi!", localDateTime22, localDateTime23);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = reservationController0.updateReservation("hi!", "hi!", localDateTime27, localDateTime28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        java.util.ArrayList<model.Reservation.Reservation> reservationList13 = reservationController0.getReservationsByEquipment("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList14 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = reservationController0.updateReservation("", "", localDateTime17, localDateTime18);
        boolean boolean21 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = reservationController0.updateReservation("", "hi!", localDateTime24, localDateTime25);
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation30 = reservationController0.createReservation("", localDateTime28, localDateTime29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.isTimeSlotAvailable("", localDateTime15, localDateTime16);
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = reservationController0.isTimeSlotAvailable("", localDateTime21, localDateTime22);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = reservationController0.updateReservation("", "", localDateTime26, localDateTime27);
        java.util.ArrayList<model.Reservation.Reservation> reservationList29 = reservationController0.getMyReservations();
        model.Reservation.Reservation reservation30 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation31 = reservationController0.createReservation(reservation30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList29);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = reservationController0.updateReservation("hi!", "", localDateTime3, localDateTime4);
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = reservationController0.isTimeSlotAvailable("", localDateTime7, localDateTime8);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = reservationController0.updateReservation("hi!", "hi!", localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = reservationController0.updateReservation("hi!", "hi!", localDateTime17, localDateTime18);
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = reservationController0.updateReservation("", "hi!", localDateTime22, localDateTime23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = reservationController0.updateReservation("hi!", "", localDateTime3, localDateTime4);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.updateReservation("", "", localDateTime8, localDateTime9);
        java.util.ArrayList<model.Reservation.Reservation> reservationList11 = reservationController0.getMyReservations();
        java.lang.Class<?> wildcardClass12 = reservationList11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = reservationController0.isTimeSlotAvailable("", localDateTime7, localDateTime8);
        java.util.ArrayList<model.Reservation.Reservation> reservationList11 = reservationController0.getReservationsByEquipment("");
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = reservationController0.updateReservation("hi!", "", localDateTime16, localDateTime17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList8 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList9 = reservationController0.getMyReservations();
        boolean boolean11 = reservationController0.cancelReservation("");
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = reservationController0.updateReservation("", "", localDateTime14, localDateTime15);
        java.lang.Class<?> wildcardClass17 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList8 = reservationController0.getReservationsByEquipment("");
        model.Reservation.Reservation reservation9 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation10 = reservationController0.createReservation(reservation9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.updateReservation("hi!", "hi!", localDateTime13, localDateTime14);
        java.util.ArrayList<model.Reservation.Reservation> reservationList16 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = reservationController0.updateReservation("hi!", "hi!", localDateTime19, localDateTime20);
        boolean boolean23 = reservationController0.cancelReservation("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList24 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = reservationController0.updateReservation("hi!", "hi!", localDateTime27, localDateTime28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.updateReservation("hi!", "", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.updateReservation("hi!", "hi!", localDateTime13, localDateTime14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        boolean boolean2 = reservationController0.cancelReservation("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        java.lang.Class<?> wildcardClass5 = reservationList4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList6 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("hi!", "hi!", localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.isTimeSlotAvailable("", localDateTime13, localDateTime14);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = reservationController0.updateReservation("hi!", "hi!", localDateTime18, localDateTime19);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = reservationController0.updateReservation("", "hi!", localDateTime23, localDateTime24);
        java.util.ArrayList<model.Reservation.Reservation> reservationList26 = reservationController0.getMyReservations();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList26);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = reservationController0.isTimeSlotAvailable("", localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = reservationController0.isTimeSlotAvailable("", localDateTime16, localDateTime17);
        model.Reservation.Reservation reservation19 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation20 = reservationController0.createReservation(reservation19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        java.util.ArrayList<model.Reservation.Reservation> reservationList12 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList14 = reservationController0.getReservationsByEquipment("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList15 = reservationController0.getMyReservations();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList15);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        boolean boolean2 = reservationController0.cancelReservation("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList8 = reservationController0.getReservationsByEquipment("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList9 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList11 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = reservationController0.updateReservation("", "", localDateTime14, localDateTime15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("hi!", "hi!", localDateTime9, localDateTime10);
        java.lang.Class<?> wildcardClass12 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        model.Reservation.Reservation reservation3 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation4 = reservationController0.createReservation(reservation3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("hi!", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = reservationController0.updateReservation("", "", localDateTime16, localDateTime17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList6 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("hi!", "hi!", localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.isTimeSlotAvailable("", localDateTime13, localDateTime14);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = reservationController0.updateReservation("hi!", "hi!", localDateTime18, localDateTime19);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = reservationController0.updateReservation("", "hi!", localDateTime23, localDateTime24);
        model.Reservation.Reservation reservation26 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation27 = reservationController0.createReservation(reservation26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList8 = reservationController0.getReservationsByEquipment("hi!");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = reservationController0.updateReservation("hi!", "", localDateTime11, localDateTime12);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = reservationController0.updateReservation("", "", localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation22 = reservationController0.createReservation("", localDateTime20, localDateTime21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList8 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList10 = reservationController0.getReservationsByEquipment("hi!");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.updateReservation("hi!", "hi!", localDateTime13, localDateTime14);
        model.Reservation.Reservation reservation16 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation17 = reservationController0.createReservation(reservation16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList8 = reservationController0.getReservationsByEquipment("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation12 = reservationController0.createReservation("hi!", localDateTime10, localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.updateReservation("hi!", "hi!", localDateTime13, localDateTime14);
        java.util.ArrayList<model.Reservation.Reservation> reservationList16 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = reservationController0.isTimeSlotAvailable("", localDateTime18, localDateTime19);
        model.Reservation.Reservation reservation21 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation22 = reservationController0.createReservation(reservation21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList6 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("hi!", "hi!", localDateTime9, localDateTime10);
        java.util.ArrayList<model.Reservation.Reservation> reservationList12 = reservationController0.getMyReservations();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList12);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList8 = reservationController0.getReservationsByEquipment("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation12 = reservationController0.createReservation("hi!", localDateTime10, localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.updateReservation("hi!", "hi!", localDateTime13, localDateTime14);
        java.util.ArrayList<model.Reservation.Reservation> reservationList16 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = reservationController0.isTimeSlotAvailable("", localDateTime18, localDateTime19);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = reservationController0.updateReservation("hi!", "", localDateTime23, localDateTime24);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = reservationController0.isTimeSlotAvailable("hi!", localDateTime27, localDateTime28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("hi!", localDateTime2, localDateTime3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = reservationController0.isTimeSlotAvailable("hi!", localDateTime6, localDateTime7);
        java.util.ArrayList<model.Reservation.Reservation> reservationList9 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = reservationController0.isTimeSlotAvailable("", localDateTime11, localDateTime12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.updateReservation("hi!", "hi!", localDateTime13, localDateTime14);
        java.util.ArrayList<model.Reservation.Reservation> reservationList16 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = reservationController0.isTimeSlotAvailable("hi!", localDateTime18, localDateTime19);
        java.lang.Class<?> wildcardClass21 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.updateReservation("hi!", "hi!", localDateTime13, localDateTime14);
        java.util.ArrayList<model.Reservation.Reservation> reservationList16 = reservationController0.getMyReservations();
        boolean boolean18 = reservationController0.cancelReservation("");
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = reservationController0.isTimeSlotAvailable("", localDateTime20, localDateTime21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        java.util.ArrayList<model.Reservation.Reservation> reservationList13 = reservationController0.getReservationsByEquipment("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList14 = reservationController0.getMyReservations();
        boolean boolean16 = reservationController0.cancelReservation("hi!");
        boolean boolean18 = reservationController0.cancelReservation("");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = reservationController0.updateReservation("", "", localDateTime21, localDateTime22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList8 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList10 = reservationController0.getReservationsByEquipment("hi!");
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation14 = reservationController0.createReservation("", localDateTime12, localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList10);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.updateReservation("hi!", "hi!", localDateTime13, localDateTime14);
        java.util.ArrayList<model.Reservation.Reservation> reservationList16 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = reservationController0.updateReservation("hi!", "hi!", localDateTime19, localDateTime20);
        boolean boolean23 = reservationController0.cancelReservation("");
        java.lang.Class<?> wildcardClass24 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.isTimeSlotAvailable("", localDateTime15, localDateTime16);
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = reservationController0.isTimeSlotAvailable("", localDateTime21, localDateTime22);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = reservationController0.isTimeSlotAvailable("hi!", localDateTime25, localDateTime26);
        java.util.ArrayList<model.Reservation.Reservation> reservationList28 = reservationController0.getMyReservations();
        java.lang.Class<?> wildcardClass29 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        boolean boolean2 = reservationController0.cancelReservation("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("hi!", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("hi!", localDateTime8, localDateTime9);
        java.util.ArrayList<model.Reservation.Reservation> reservationList11 = reservationController0.getMyReservations();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList11);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        java.util.ArrayList<model.Reservation.Reservation> reservationList12 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.updateReservation("", "", localDateTime15, localDateTime16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList3 = reservationController0.getMyReservations();
        java.lang.Class<?> wildcardClass4 = reservationList3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("hi!", "hi!", localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.isTimeSlotAvailable("hi!", localDateTime13, localDateTime14);
        boolean boolean17 = reservationController0.cancelReservation("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList18 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList20 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList22 = reservationController0.getReservationsByEquipment("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList22);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList8 = reservationController0.getReservationsByEquipment("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList10 = reservationController0.getReservationsByEquipment("hi!");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.updateReservation("hi!", "hi!", localDateTime13, localDateTime14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.isTimeSlotAvailable("", localDateTime15, localDateTime16);
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getReservationsByEquipment("");
        boolean boolean21 = reservationController0.cancelReservation("");
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = reservationController0.isTimeSlotAvailable("", localDateTime23, localDateTime24);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation29 = reservationController0.createReservation("", localDateTime27, localDateTime28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = reservationController0.isTimeSlotAvailable("hi!", localDateTime6, localDateTime7);
        model.Reservation.Reservation reservation9 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation10 = reservationController0.createReservation(reservation9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("hi!", localDateTime2, localDateTime3);
        boolean boolean6 = reservationController0.cancelReservation("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.updateReservation("hi!", "hi!", localDateTime13, localDateTime14);
        java.util.ArrayList<model.Reservation.Reservation> reservationList16 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = reservationController0.isTimeSlotAvailable("", localDateTime18, localDateTime19);
        java.lang.Class<?> wildcardClass21 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        java.util.ArrayList<model.Reservation.Reservation> reservationList13 = reservationController0.getReservationsByEquipment("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList14 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = reservationController0.updateReservation("", "", localDateTime17, localDateTime18);
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = reservationController0.updateReservation("hi!", "hi!", localDateTime22, localDateTime23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        java.util.ArrayList<model.Reservation.Reservation> reservationList12 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation16 = reservationController0.createReservation("hi!", localDateTime14, localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList12);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = reservationController0.isTimeSlotAvailable("", localDateTime7, localDateTime8);
        java.util.ArrayList<model.Reservation.Reservation> reservationList10 = reservationController0.getMyReservations();
        boolean boolean12 = reservationController0.cancelReservation("");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.updateReservation("", "", localDateTime15, localDateTime16);
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = reservationController0.updateReservation("hi!", "hi!", localDateTime20, localDateTime21);
        java.lang.Class<?> wildcardClass23 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList8 = reservationController0.getReservationsByEquipment("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList10 = reservationController0.getReservationsByEquipment("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList10);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        java.util.ArrayList<model.Reservation.Reservation> reservationList13 = reservationController0.getReservationsByEquipment("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList14 = reservationController0.getMyReservations();
        boolean boolean16 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = reservationController0.isTimeSlotAvailable("", localDateTime18, localDateTime19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        java.util.ArrayList<model.Reservation.Reservation> reservationList13 = reservationController0.getReservationsByEquipment("hi!");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.isTimeSlotAvailable("", localDateTime15, localDateTime16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        boolean boolean4 = reservationController0.cancelReservation("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.updateReservation("", "hi!", localDateTime8, localDateTime9);
        java.util.ArrayList<model.Reservation.Reservation> reservationList12 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList13 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.isTimeSlotAvailable("", localDateTime15, localDateTime16);
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getReservationsByEquipment("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList6 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("hi!", "hi!", localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.isTimeSlotAvailable("", localDateTime13, localDateTime14);
        java.util.ArrayList<model.Reservation.Reservation> reservationList16 = reservationController0.getMyReservations();
        java.lang.Class<?> wildcardClass17 = reservationList16.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        boolean boolean7 = reservationController0.cancelReservation("");
        model.Reservation.Reservation reservation8 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation9 = reservationController0.createReservation(reservation8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.updateReservation("hi!", "hi!", localDateTime13, localDateTime14);
        java.util.ArrayList<model.Reservation.Reservation> reservationList16 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = reservationController0.updateReservation("hi!", "hi!", localDateTime19, localDateTime20);
        boolean boolean23 = reservationController0.cancelReservation("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList24 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = reservationController0.updateReservation("", "", localDateTime27, localDateTime28);
        java.util.ArrayList<model.Reservation.Reservation> reservationList31 = reservationController0.getReservationsByEquipment("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList31);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("hi!", localDateTime2, localDateTime3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = reservationController0.isTimeSlotAvailable("hi!", localDateTime6, localDateTime7);
        java.util.ArrayList<model.Reservation.Reservation> reservationList9 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList11 = reservationController0.getReservationsByEquipment("");
        model.Reservation.Reservation reservation12 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation13 = reservationController0.createReservation(reservation12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList11);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("hi!", localDateTime2, localDateTime3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = reservationController0.isTimeSlotAvailable("hi!", localDateTime6, localDateTime7);
        boolean boolean10 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.updateReservation("hi!", "hi!", localDateTime13, localDateTime14);
        boolean boolean17 = reservationController0.cancelReservation("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList8 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = reservationController0.isTimeSlotAvailable("", localDateTime10, localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.isTimeSlotAvailable("", localDateTime15, localDateTime16);
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = reservationController0.isTimeSlotAvailable("", localDateTime21, localDateTime22);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = reservationController0.isTimeSlotAvailable("hi!", localDateTime25, localDateTime26);
        model.Reservation.Reservation reservation28 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation29 = reservationController0.createReservation(reservation28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("hi!", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        boolean boolean15 = reservationController0.cancelReservation("");
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = reservationController0.isTimeSlotAvailable("", localDateTime17, localDateTime18);
        boolean boolean21 = reservationController0.cancelReservation("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList15 = reservationController0.getReservationsByEquipment("hi!");
        boolean boolean17 = reservationController0.cancelReservation("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = reservationController0.updateReservation("hi!", "", localDateTime3, localDateTime4);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.updateReservation("", "", localDateTime8, localDateTime9);
        boolean boolean12 = reservationController0.cancelReservation("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("");
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("hi!", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = reservationController0.isTimeSlotAvailable("", localDateTime12, localDateTime13);
        java.util.ArrayList<model.Reservation.Reservation> reservationList16 = reservationController0.getReservationsByEquipment("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList18 = reservationController0.getReservationsByEquipment("hi!");
        java.lang.Class<?> wildcardClass19 = reservationList18.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList8 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList9 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation13 = reservationController0.createReservation("", localDateTime11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList9);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = reservationController0.isTimeSlotAvailable("", localDateTime7, localDateTime8);
        java.util.ArrayList<model.Reservation.Reservation> reservationList10 = reservationController0.getMyReservations();
        boolean boolean12 = reservationController0.cancelReservation("");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.updateReservation("", "", localDateTime15, localDateTime16);
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = reservationController0.updateReservation("", "hi!", localDateTime20, localDateTime21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("hi!", localDateTime2, localDateTime3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = reservationController0.isTimeSlotAvailable("hi!", localDateTime6, localDateTime7);
        java.util.ArrayList<model.Reservation.Reservation> reservationList9 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList10 = reservationController0.getMyReservations();
        boolean boolean12 = reservationController0.cancelReservation("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = reservationController0.isTimeSlotAvailable("", localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = reservationController0.isTimeSlotAvailable("hi!", localDateTime16, localDateTime17);
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getMyReservations();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        boolean boolean7 = reservationController0.cancelReservation("");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.isTimeSlotAvailable("", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = reservationController0.updateReservation("hi!", "", localDateTime3, localDateTime4);
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = reservationController0.isTimeSlotAvailable("", localDateTime7, localDateTime8);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = reservationController0.updateReservation("hi!", "hi!", localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = reservationController0.updateReservation("hi!", "hi!", localDateTime17, localDateTime18);
        java.util.ArrayList<model.Reservation.Reservation> reservationList21 = reservationController0.getReservationsByEquipment("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList21);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = reservationController0.isTimeSlotAvailable("", localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = reservationController0.isTimeSlotAvailable("", localDateTime16, localDateTime17);
        java.util.ArrayList<model.Reservation.Reservation> reservationList20 = reservationController0.getReservationsByEquipment("");
        java.lang.Class<?> wildcardClass21 = reservationList20.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.util.ArrayList<model.Reservation.Reservation> reservationList8 = reservationController0.getReservationsByEquipment("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = reservationController0.isTimeSlotAvailable("hi!", localDateTime10, localDateTime11);
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation16 = reservationController0.createReservation("hi!", localDateTime14, localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.updateReservation("hi!", "", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.updateReservation("", "hi!", localDateTime13, localDateTime14);
        java.lang.Class<?> wildcardClass16 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("hi!", localDateTime2, localDateTime3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = reservationController0.isTimeSlotAvailable("hi!", localDateTime6, localDateTime7);
        boolean boolean10 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.updateReservation("hi!", "hi!", localDateTime13, localDateTime14);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = reservationController0.isTimeSlotAvailable("", localDateTime17, localDateTime18);
        java.util.ArrayList<model.Reservation.Reservation> reservationList20 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = reservationController0.updateReservation("hi!", "", localDateTime23, localDateTime24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("hi!", "hi!", localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.isTimeSlotAvailable("hi!", localDateTime13, localDateTime14);
        boolean boolean17 = reservationController0.cancelReservation("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList18 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList20 = reservationController0.getMyReservations();
        model.Reservation.Reservation reservation21 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation22 = reservationController0.createReservation(reservation21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList20);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList6 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "", localDateTime9, localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.isTimeSlotAvailable("", localDateTime15, localDateTime16);
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = reservationController0.isTimeSlotAvailable("", localDateTime21, localDateTime22);
        boolean boolean25 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = reservationController0.isTimeSlotAvailable("", localDateTime27, localDateTime28);
        java.lang.Class<?> wildcardClass30 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = reservationController0.updateReservation("hi!", "", localDateTime3, localDateTime4);
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = reservationController0.isTimeSlotAvailable("", localDateTime7, localDateTime8);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = reservationController0.updateReservation("hi!", "hi!", localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = reservationController0.updateReservation("hi!", "hi!", localDateTime17, localDateTime18);
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation23 = reservationController0.createReservation("hi!", localDateTime21, localDateTime22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("hi!", localDateTime2, localDateTime3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = reservationController0.isTimeSlotAvailable("hi!", localDateTime6, localDateTime7);
        java.util.ArrayList<model.Reservation.Reservation> reservationList9 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList11 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList13 = reservationController0.getReservationsByEquipment("hi!");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation17 = reservationController0.createReservation("hi!", localDateTime15, localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList13);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("hi!", localDateTime2, localDateTime3);
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = reservationController0.updateReservation("", "", localDateTime7, localDateTime8);
        boolean boolean11 = reservationController0.cancelReservation("");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation15 = reservationController0.createReservation("hi!", localDateTime13, localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        boolean boolean2 = reservationController0.cancelReservation("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList8 = reservationController0.getReservationsByEquipment("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList9 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList11 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation15 = reservationController0.createReservation("", localDateTime13, localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList11);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("hi!", localDateTime2, localDateTime3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = reservationController0.isTimeSlotAvailable("hi!", localDateTime6, localDateTime7);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = reservationController0.isTimeSlotAvailable("hi!", localDateTime10, localDateTime11);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.updateReservation("", "", localDateTime15, localDateTime16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = reservationController0.updateReservation("", "", localDateTime16, localDateTime17);
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getMyReservations();
        java.lang.Class<?> wildcardClass20 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("");
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("hi!", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = reservationController0.isTimeSlotAvailable("", localDateTime12, localDateTime13);
        java.util.ArrayList<model.Reservation.Reservation> reservationList16 = reservationController0.getReservationsByEquipment("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList18 = reservationController0.getReservationsByEquipment("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = reservationController0.updateReservation("", "", localDateTime22, localDateTime23);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation28 = reservationController0.createReservation("hi!", localDateTime26, localDateTime27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("hi!", localDateTime2, localDateTime3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = reservationController0.isTimeSlotAvailable("hi!", localDateTime6, localDateTime7);
        java.util.ArrayList<model.Reservation.Reservation> reservationList9 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList10 = reservationController0.getMyReservations();
        boolean boolean12 = reservationController0.cancelReservation("hi!");
        model.Reservation.Reservation reservation13 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation14 = reservationController0.createReservation(reservation13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.isTimeSlotAvailable("", localDateTime15, localDateTime16);
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getReservationsByEquipment("");
        boolean boolean21 = reservationController0.cancelReservation("hi!");
        boolean boolean23 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = reservationController0.updateReservation("", "", localDateTime26, localDateTime27);
        model.Reservation.Reservation reservation29 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation30 = reservationController0.createReservation(reservation29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("hi!", localDateTime2, localDateTime3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = reservationController0.isTimeSlotAvailable("hi!", localDateTime6, localDateTime7);
        java.util.ArrayList<model.Reservation.Reservation> reservationList9 = reservationController0.getMyReservations();
        boolean boolean11 = reservationController0.cancelReservation("");
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = reservationController0.updateReservation("", "", localDateTime14, localDateTime15);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation20 = reservationController0.createReservation("", localDateTime18, localDateTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.isTimeSlotAvailable("", localDateTime15, localDateTime16);
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = reservationController0.isTimeSlotAvailable("", localDateTime21, localDateTime22);
        boolean boolean25 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = reservationController0.isTimeSlotAvailable("", localDateTime27, localDateTime28);
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        boolean boolean34 = reservationController0.updateReservation("", "hi!", localDateTime32, localDateTime33);
        java.util.ArrayList<model.Reservation.Reservation> reservationList35 = reservationController0.getMyReservations();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList35);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("hi!", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        boolean boolean15 = reservationController0.cancelReservation("");
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = reservationController0.isTimeSlotAvailable("", localDateTime17, localDateTime18);
        java.util.ArrayList<model.Reservation.Reservation> reservationList21 = reservationController0.getReservationsByEquipment("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList21);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        java.util.ArrayList<model.Reservation.Reservation> reservationList13 = reservationController0.getReservationsByEquipment("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList14 = reservationController0.getMyReservations();
        boolean boolean16 = reservationController0.cancelReservation("hi!");
        boolean boolean18 = reservationController0.cancelReservation("");
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = reservationController0.isTimeSlotAvailable("", localDateTime20, localDateTime21);
        model.Reservation.Reservation reservation23 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation24 = reservationController0.createReservation(reservation23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = reservationController0.updateReservation("", "", localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = reservationController0.updateReservation("hi!", "", localDateTime21, localDateTime22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        boolean boolean4 = reservationController0.cancelReservation("");
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = reservationController0.updateReservation("hi!", "", localDateTime7, localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("");
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("hi!", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = reservationController0.isTimeSlotAvailable("", localDateTime12, localDateTime13);
        java.util.ArrayList<model.Reservation.Reservation> reservationList16 = reservationController0.getReservationsByEquipment("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList18 = reservationController0.getReservationsByEquipment("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = reservationController0.updateReservation("", "", localDateTime22, localDateTime23);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = reservationController0.updateReservation("hi!", "hi!", localDateTime27, localDateTime28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.isTimeSlotAvailable("", localDateTime15, localDateTime16);
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = reservationController0.isTimeSlotAvailable("", localDateTime21, localDateTime22);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = reservationController0.updateReservation("", "", localDateTime26, localDateTime27);
        java.util.ArrayList<model.Reservation.Reservation> reservationList30 = reservationController0.getReservationsByEquipment("hi!");
        boolean boolean32 = reservationController0.cancelReservation("hi!");
        boolean boolean34 = reservationController0.cancelReservation("");
        model.Reservation.Reservation reservation35 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation36 = reservationController0.createReservation(reservation35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList15 = reservationController0.getReservationsByEquipment("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList16 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = reservationController0.isTimeSlotAvailable("hi!", localDateTime18, localDateTime19);
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = reservationController0.isTimeSlotAvailable("hi!", localDateTime22, localDateTime23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        model.Reservation.Reservation reservation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation8 = reservationController0.createReservation(reservation7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        java.util.ArrayList<model.Reservation.Reservation> reservationList12 = reservationController0.getMyReservations();
        model.Reservation.Reservation reservation13 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation14 = reservationController0.createReservation(reservation13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList12);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.util.ArrayList<model.Reservation.Reservation> reservationList8 = reservationController0.getReservationsByEquipment("hi!");
        model.Reservation.Reservation reservation9 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation10 = reservationController0.createReservation(reservation9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("hi!", localDateTime2, localDateTime3);
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = reservationController0.updateReservation("", "", localDateTime7, localDateTime8);
        boolean boolean11 = reservationController0.cancelReservation("");
        model.Reservation.Reservation reservation12 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation13 = reservationController0.createReservation(reservation12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.updateReservation("hi!", "hi!", localDateTime13, localDateTime14);
        java.util.ArrayList<model.Reservation.Reservation> reservationList16 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = reservationController0.isTimeSlotAvailable("hi!", localDateTime18, localDateTime19);
        model.Reservation.Reservation reservation21 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation22 = reservationController0.createReservation(reservation21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.isTimeSlotAvailable("", localDateTime15, localDateTime16);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = reservationController0.isTimeSlotAvailable("", localDateTime19, localDateTime20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList14 = reservationController0.getMyReservations();
        boolean boolean16 = reservationController0.cancelReservation("hi!");
        model.Reservation.Reservation reservation17 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation18 = reservationController0.createReservation(reservation17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList3 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = reservationController0.updateReservation("hi!", "", localDateTime6, localDateTime7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.util.ArrayList<model.Reservation.Reservation> reservationList8 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = reservationController0.updateReservation("", "hi!", localDateTime11, localDateTime12);
        java.util.ArrayList<model.Reservation.Reservation> reservationList15 = reservationController0.getReservationsByEquipment("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList15);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList6 = reservationController0.getMyReservations();
        boolean boolean8 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = reservationController0.updateReservation("", "hi!", localDateTime11, localDateTime12);
        java.util.ArrayList<model.Reservation.Reservation> reservationList14 = reservationController0.getMyReservations();
        model.Reservation.Reservation reservation15 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation16 = reservationController0.createReservation(reservation15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList14);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = reservationController0.isTimeSlotAvailable("", localDateTime12, localDateTime13);
        java.lang.Class<?> wildcardClass15 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("");
        boolean boolean8 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList10 = reservationController0.getReservationsByEquipment("hi!");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.updateReservation("hi!", "", localDateTime13, localDateTime14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.util.ArrayList<model.Reservation.Reservation> reservationList8 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = reservationController0.updateReservation("", "hi!", localDateTime11, localDateTime12);
        java.lang.Class<?> wildcardClass14 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.updateReservation("hi!", "hi!", localDateTime13, localDateTime14);
        java.util.ArrayList<model.Reservation.Reservation> reservationList16 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = reservationController0.updateReservation("hi!", "hi!", localDateTime19, localDateTime20);
        boolean boolean23 = reservationController0.cancelReservation("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList24 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList25 = reservationController0.getMyReservations();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList25);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.isTimeSlotAvailable("", localDateTime15, localDateTime16);
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = reservationController0.isTimeSlotAvailable("", localDateTime21, localDateTime22);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = reservationController0.updateReservation("", "", localDateTime26, localDateTime27);
        java.util.ArrayList<model.Reservation.Reservation> reservationList30 = reservationController0.getReservationsByEquipment("hi!");
        boolean boolean32 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        boolean boolean37 = reservationController0.updateReservation("", "", localDateTime35, localDateTime36);
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        boolean boolean41 = reservationController0.isTimeSlotAvailable("", localDateTime39, localDateTime40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList15 = reservationController0.getReservationsByEquipment("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList16 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = reservationController0.isTimeSlotAvailable("hi!", localDateTime18, localDateTime19);
        java.util.ArrayList<model.Reservation.Reservation> reservationList22 = reservationController0.getReservationsByEquipment("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList22);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        boolean boolean2 = reservationController0.cancelReservation("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("hi!", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("hi!", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = reservationController0.isTimeSlotAvailable("hi!", localDateTime12, localDateTime13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("");
        boolean boolean8 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList10 = reservationController0.getReservationsByEquipment("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList11 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = reservationController0.updateReservation("hi!", "", localDateTime14, localDateTime15);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation20 = reservationController0.createReservation("hi!", localDateTime18, localDateTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList6 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("hi!", "hi!", localDateTime9, localDateTime10);
        java.util.ArrayList<model.Reservation.Reservation> reservationList13 = reservationController0.getReservationsByEquipment("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList13);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.updateReservation("hi!", "hi!", localDateTime13, localDateTime14);
        java.util.ArrayList<model.Reservation.Reservation> reservationList16 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = reservationController0.updateReservation("hi!", "", localDateTime19, localDateTime20);
        boolean boolean23 = reservationController0.cancelReservation("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        java.util.ArrayList<model.Reservation.Reservation> reservationList13 = reservationController0.getReservationsByEquipment("hi!");
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = reservationController0.updateReservation("", "", localDateTime16, localDateTime17);
        java.lang.Class<?> wildcardClass19 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("hi!", "hi!", localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.isTimeSlotAvailable("hi!", localDateTime13, localDateTime14);
        boolean boolean17 = reservationController0.cancelReservation("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList18 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList20 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList21 = reservationController0.getMyReservations();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList21);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.util.ArrayList<model.Reservation.Reservation> reservationList8 = reservationController0.getReservationsByEquipment("hi!");
        boolean boolean10 = reservationController0.cancelReservation("");
        boolean boolean12 = reservationController0.cancelReservation("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("hi!");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation6 = reservationController0.createReservation("hi!", localDateTime4, localDateTime5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        boolean boolean8 = reservationController0.cancelReservation("");
        boolean boolean10 = reservationController0.cancelReservation("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.updateReservation("hi!", "hi!", localDateTime13, localDateTime14);
        model.Reservation.Reservation reservation16 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation17 = reservationController0.createReservation(reservation16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.Reservation.getEquipmentID()\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = reservationController0.isTimeSlotAvailable("", localDateTime7, localDateTime8);
        java.util.ArrayList<model.Reservation.Reservation> reservationList10 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList11 = reservationController0.getMyReservations();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList11);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("hi!", "hi!", localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.isTimeSlotAvailable("hi!", localDateTime13, localDateTime14);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation19 = reservationController0.createReservation("hi!", localDateTime17, localDateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = reservationController0.isTimeSlotAvailable("", localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = reservationController0.isTimeSlotAvailable("hi!", localDateTime16, localDateTime17);
        java.util.ArrayList<model.Reservation.Reservation> reservationList20 = reservationController0.getReservationsByEquipment("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList20);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("hi!", localDateTime2, localDateTime3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = reservationController0.isTimeSlotAvailable("hi!", localDateTime6, localDateTime7);
        java.util.ArrayList<model.Reservation.Reservation> reservationList9 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList11 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.isTimeSlotAvailable("hi!", localDateTime13, localDateTime14);
        java.util.ArrayList<model.Reservation.Reservation> reservationList16 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList18 = reservationController0.getReservationsByEquipment("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList18);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("hi!", "hi!", localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.isTimeSlotAvailable("hi!", localDateTime13, localDateTime14);
        boolean boolean17 = reservationController0.cancelReservation("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList18 = reservationController0.getMyReservations();
        java.lang.Class<?> wildcardClass19 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        boolean boolean2 = reservationController0.cancelReservation("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList8 = reservationController0.getReservationsByEquipment("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList9 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList11 = reservationController0.getReservationsByEquipment("");
        boolean boolean13 = reservationController0.cancelReservation("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList8 = reservationController0.getReservationsByEquipment("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = reservationController0.isTimeSlotAvailable("hi!", localDateTime10, localDateTime11);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.updateReservation("hi!", "hi!", localDateTime15, localDateTime16);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation21 = reservationController0.createReservation("", localDateTime19, localDateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("hi!", localDateTime2, localDateTime3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = reservationController0.isTimeSlotAvailable("hi!", localDateTime6, localDateTime7);
        java.util.ArrayList<model.Reservation.Reservation> reservationList9 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList10 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList11 = reservationController0.getMyReservations();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList11);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("hi!", "hi!", localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.isTimeSlotAvailable("hi!", localDateTime13, localDateTime14);
        boolean boolean17 = reservationController0.cancelReservation("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getReservationsByEquipment("hi!");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation23 = reservationController0.createReservation("", localDateTime21, localDateTime22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        boolean boolean2 = reservationController0.cancelReservation("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList8 = reservationController0.getReservationsByEquipment("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList9 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList11 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.isTimeSlotAvailable("hi!", localDateTime13, localDateTime14);
        java.util.ArrayList<model.Reservation.Reservation> reservationList16 = reservationController0.getMyReservations();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList16);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.isTimeSlotAvailable("", localDateTime15, localDateTime16);
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = reservationController0.isTimeSlotAvailable("", localDateTime21, localDateTime22);
        boolean boolean25 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = reservationController0.isTimeSlotAvailable("", localDateTime27, localDateTime28);
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        boolean boolean34 = reservationController0.updateReservation("", "hi!", localDateTime32, localDateTime33);
        java.util.ArrayList<model.Reservation.Reservation> reservationList36 = reservationController0.getReservationsByEquipment("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList38 = reservationController0.getReservationsByEquipment("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList38);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("");
        boolean boolean15 = reservationController0.cancelReservation("");
        java.lang.Class<?> wildcardClass16 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.updateReservation("hi!", "hi!", localDateTime13, localDateTime14);
        java.util.ArrayList<model.Reservation.Reservation> reservationList17 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = reservationController0.updateReservation("hi!", "hi!", localDateTime20, localDateTime21);
        java.lang.Class<?> wildcardClass23 = reservationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        boolean boolean2 = reservationController0.cancelReservation("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList8 = reservationController0.getReservationsByEquipment("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList10 = reservationController0.getReservationsByEquipment("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList10);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.isTimeSlotAvailable("", localDateTime15, localDateTime16);
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = reservationController0.isTimeSlotAvailable("", localDateTime21, localDateTime22);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = reservationController0.updateReservation("", "", localDateTime26, localDateTime27);
        java.util.ArrayList<model.Reservation.Reservation> reservationList30 = reservationController0.getReservationsByEquipment("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList31 = reservationController0.getMyReservations();
        boolean boolean33 = reservationController0.cancelReservation("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        java.util.ArrayList<model.Reservation.Reservation> reservationList13 = reservationController0.getReservationsByEquipment("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList14 = reservationController0.getMyReservations();
        boolean boolean16 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = reservationController0.updateReservation("", "", localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = reservationController0.isTimeSlotAvailable("", localDateTime23, localDateTime24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("hi!", localDateTime2, localDateTime3);
        java.util.ArrayList<model.Reservation.Reservation> reservationList6 = reservationController0.getReservationsByEquipment("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList6);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        boolean boolean13 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList14 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList15 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = reservationController0.isTimeSlotAvailable("", localDateTime17, localDateTime18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = reservationController0.isTimeSlotAvailable("", localDateTime12, localDateTime13);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = reservationController0.isTimeSlotAvailable("", localDateTime16, localDateTime17);
        java.util.ArrayList<model.Reservation.Reservation> reservationList20 = reservationController0.getReservationsByEquipment("");
        boolean boolean22 = reservationController0.cancelReservation("");
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation26 = reservationController0.createReservation("", localDateTime24, localDateTime25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("hi!", localDateTime2, localDateTime3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = reservationController0.isTimeSlotAvailable("hi!", localDateTime6, localDateTime7);
        java.util.ArrayList<model.Reservation.Reservation> reservationList9 = reservationController0.getMyReservations();
        boolean boolean11 = reservationController0.cancelReservation("");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.isTimeSlotAvailable("hi!", localDateTime13, localDateTime14);
        boolean boolean17 = reservationController0.cancelReservation("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("hi!");
        boolean boolean4 = reservationController0.cancelReservation("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        java.util.ArrayList<model.Reservation.Reservation> reservationList13 = reservationController0.getReservationsByEquipment("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList14 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = reservationController0.updateReservation("", "", localDateTime17, localDateTime18);
        java.util.ArrayList<model.Reservation.Reservation> reservationList20 = reservationController0.getMyReservations();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList20);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        java.util.ArrayList<model.Reservation.Reservation> reservationList13 = reservationController0.getReservationsByEquipment("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList14 = reservationController0.getMyReservations();
        boolean boolean16 = reservationController0.cancelReservation("hi!");
        boolean boolean18 = reservationController0.cancelReservation("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("hi!", localDateTime2, localDateTime3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = reservationController0.isTimeSlotAvailable("hi!", localDateTime6, localDateTime7);
        java.util.ArrayList<model.Reservation.Reservation> reservationList9 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList10 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation14 = reservationController0.createReservation("hi!", localDateTime12, localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList10);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList6 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("hi!", "hi!", localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.isTimeSlotAvailable("", localDateTime13, localDateTime14);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = reservationController0.updateReservation("hi!", "hi!", localDateTime18, localDateTime19);
        boolean boolean22 = reservationController0.cancelReservation("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList8 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList9 = reservationController0.getMyReservations();
        boolean boolean11 = reservationController0.cancelReservation("");
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = reservationController0.updateReservation("", "", localDateTime14, localDateTime15);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = reservationController0.isTimeSlotAvailable("", localDateTime18, localDateTime19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = reservationController0.updateReservation("hi!", "", localDateTime3, localDateTime4);
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = reservationController0.isTimeSlotAvailable("hi!", localDateTime7, localDateTime8);
        boolean boolean11 = reservationController0.cancelReservation("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.updateReservation("hi!", "hi!", localDateTime13, localDateTime14);
        java.util.ArrayList<model.Reservation.Reservation> reservationList17 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getReservationsByEquipment("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList20 = reservationController0.getMyReservations();
        boolean boolean22 = reservationController0.cancelReservation("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        boolean boolean2 = reservationController0.cancelReservation("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList8 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = reservationController0.isTimeSlotAvailable("", localDateTime10, localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("");
        boolean boolean8 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList10 = reservationController0.getReservationsByEquipment("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList11 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = reservationController0.updateReservation("hi!", "hi!", localDateTime14, localDateTime15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.updateReservation("hi!", "hi!", localDateTime13, localDateTime14);
        java.util.ArrayList<model.Reservation.Reservation> reservationList16 = reservationController0.getMyReservations();
        boolean boolean18 = reservationController0.cancelReservation("");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = reservationController0.updateReservation("", "hi!", localDateTime21, localDateTime22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        java.util.ArrayList<model.Reservation.Reservation> reservationList13 = reservationController0.getReservationsByEquipment("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList14 = reservationController0.getMyReservations();
        boolean boolean16 = reservationController0.cancelReservation("hi!");
        boolean boolean18 = reservationController0.cancelReservation("");
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = reservationController0.isTimeSlotAvailable("", localDateTime20, localDateTime21);
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = reservationController0.isTimeSlotAvailable("", localDateTime24, localDateTime25);
        boolean boolean28 = reservationController0.cancelReservation("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("");
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("hi!", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = reservationController0.isTimeSlotAvailable("", localDateTime12, localDateTime13);
        java.util.ArrayList<model.Reservation.Reservation> reservationList16 = reservationController0.getReservationsByEquipment("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList18 = reservationController0.getReservationsByEquipment("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = reservationController0.updateReservation("", "", localDateTime22, localDateTime23);
        java.util.ArrayList<model.Reservation.Reservation> reservationList25 = reservationController0.getMyReservations();
        boolean boolean27 = reservationController0.cancelReservation("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.updateReservation("", "hi!", localDateTime8, localDateTime9);
        java.util.ArrayList<model.Reservation.Reservation> reservationList12 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList13 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = reservationController0.updateReservation("", "", localDateTime16, localDateTime17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.updateReservation("hi!", "hi!", localDateTime13, localDateTime14);
        java.util.ArrayList<model.Reservation.Reservation> reservationList17 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList19 = reservationController0.getReservationsByEquipment("hi!");
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = reservationController0.updateReservation("", "", localDateTime22, localDateTime23);
        java.util.ArrayList<model.Reservation.Reservation> reservationList26 = reservationController0.getReservationsByEquipment("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList26);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("hi!", localDateTime2, localDateTime3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = reservationController0.isTimeSlotAvailable("hi!", localDateTime6, localDateTime7);
        java.util.ArrayList<model.Reservation.Reservation> reservationList9 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList10 = reservationController0.getMyReservations();
        boolean boolean12 = reservationController0.cancelReservation("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList13 = reservationController0.getMyReservations();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList13);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("hi!", localDateTime2, localDateTime3);
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = reservationController0.updateReservation("", "", localDateTime7, localDateTime8);
        java.util.ArrayList<model.Reservation.Reservation> reservationList10 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.updateReservation("", "", localDateTime13, localDateTime14);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = reservationController0.updateReservation("", "hi!", localDateTime18, localDateTime19);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = reservationController0.updateReservation("hi!", "hi!", localDateTime23, localDateTime24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("hi!");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("", "hi!", localDateTime9, localDateTime10);
        java.util.ArrayList<model.Reservation.Reservation> reservationList12 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList14 = reservationController0.getReservationsByEquipment("hi!");
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = reservationController0.isTimeSlotAvailable("", localDateTime16, localDateTime17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        boolean boolean7 = reservationController0.cancelReservation("");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = reservationController0.updateReservation("", "", localDateTime10, localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        boolean boolean6 = reservationController0.cancelReservation("");
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("hi!", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = reservationController0.isTimeSlotAvailable("", localDateTime12, localDateTime13);
        java.util.ArrayList<model.Reservation.Reservation> reservationList16 = reservationController0.getReservationsByEquipment("hi!");
        java.util.ArrayList<model.Reservation.Reservation> reservationList18 = reservationController0.getReservationsByEquipment("hi!");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = reservationController0.updateReservation("hi!", "", localDateTime21, localDateTime22);
        java.util.ArrayList<model.Reservation.Reservation> reservationList25 = reservationController0.getReservationsByEquipment("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList25);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = reservationController0.isTimeSlotAvailable("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.isTimeSlotAvailable("", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.updateReservation("hi!", "hi!", localDateTime13, localDateTime14);
        java.util.ArrayList<model.Reservation.Reservation> reservationList17 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = reservationController0.updateReservation("hi!", "hi!", localDateTime20, localDateTime21);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = reservationController0.updateReservation("hi!", "hi!", localDateTime25, localDateTime26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = reservationController0.updateReservation("hi!", "", localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Reservation.Reservation reservation11 = reservationController0.createReservation("", localDateTime9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        boolean boolean4 = reservationController0.cancelReservation("");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = reservationController0.isTimeSlotAvailable("", localDateTime6, localDateTime7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList2 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList4 = reservationController0.getReservationsByEquipment("");
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = reservationController0.updateReservation("", "hi!", localDateTime8, localDateTime9);
        java.util.ArrayList<model.Reservation.Reservation> reservationList12 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = reservationController0.updateReservation("", "", localDateTime15, localDateTime16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        controller.ReservationController reservationController0 = controller.ReservationController.getInstance();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = reservationController0.isTimeSlotAvailable("", localDateTime2, localDateTime3);
        java.util.ArrayList<model.Reservation.Reservation> reservationList5 = reservationController0.getMyReservations();
        java.util.ArrayList<model.Reservation.Reservation> reservationList6 = reservationController0.getMyReservations();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = reservationController0.updateReservation("hi!", "hi!", localDateTime9, localDateTime10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = reservationController0.isTimeSlotAvailable("", localDateTime13, localDateTime14);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = reservationController0.updateReservation("hi!", "hi!", localDateTime18, localDateTime19);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = reservationController0.updateReservation("", "hi!", localDateTime23, localDateTime24);
        java.util.ArrayList<model.Reservation.Reservation> reservationList27 = reservationController0.getReservationsByEquipment("");
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        boolean boolean32 = reservationController0.updateReservation("hi!", "hi!", localDateTime30, localDateTime31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }
}

