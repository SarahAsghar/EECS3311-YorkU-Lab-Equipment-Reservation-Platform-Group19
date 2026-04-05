package controller;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PaymentControllerRegressionTest {

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
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        java.lang.Class<?> wildcardClass8 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 'a', "", "hi!");
        java.lang.Class<?> wildcardClass20 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean5 = paymentController0.processGrantPayment(reservation1, 0.0d, "", "hi!");
        java.lang.Class<?> wildcardClass6 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 0.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, 100.0d, "", "", "", "hi!");
        java.lang.Class<?> wildcardClass27 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        java.lang.Class<?> wildcardClass15 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, 0.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean28 = paymentController0.processInstitutionalPayment(reservation22, (double) 100L, "hi!", "", "", "");
        java.lang.Class<?> wildcardClass29 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean12 = paymentController0.processGrantPayment(reservation8, 0.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation13 = null;
        boolean boolean17 = paymentController0.processGrantPayment(reservation13, (double) 100.0f, "", "");
        java.lang.Class<?> wildcardClass18 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 0.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, 100.0d, "", "", "", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) 100, "", "hi!");
        java.lang.Class<?> wildcardClass32 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) (byte) 0, "hi!", "", "hi!", "hi!");
        java.lang.Class<?> wildcardClass15 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 0.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processPayment(reservation20, (double) (byte) 100, "hi!", "hi!");
        java.lang.Class<?> wildcardClass25 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        java.lang.Class<?> wildcardClass15 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, 0.0d, "hi!", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, (double) '4', "hi!", "hi!", "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, (double) (byte) -1, "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) (byte) 0, "hi!", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, (double) (short) 100, "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, 100.0d, "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 'a', "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) 0.0f, "hi!", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processGrantPayment(reservation25, (double) (short) 0, "hi!", "");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean36 = paymentController0.processInstitutionalPayment(reservation30, (-1.0d), "", "", "", "hi!");
        java.lang.Class<?> wildcardClass37 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, (double) (byte) -1, "hi!", "", "hi!", "");
        java.lang.Class<?> wildcardClass22 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, (double) (-1.0f), "", "hi!");
        java.lang.Class<?> wildcardClass20 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 0.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, 100.0d, "", "", "", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processPayment(reservation27, 0.0d, "hi!", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean38 = paymentController0.processCardPayment(reservation32, (double) (-1L), "", "", "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, 0.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean28 = paymentController0.processInstitutionalPayment(reservation22, (double) 100L, "hi!", "", "", "");
        model.Reservation.Reservation reservation29 = null;
        boolean boolean35 = paymentController0.processCardPayment(reservation29, (double) 10, "hi!", "hi!", "", "hi!");
        model.Reservation.Reservation reservation36 = null;
        boolean boolean42 = paymentController0.processInstitutionalPayment(reservation36, (double) (short) 10, "", "hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass43 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 0.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, 100.0d, "", "", "", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) (short) 1, "hi!", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processPayment(reservation32, (double) (short) 0, "hi!", "");
        java.lang.Class<?> wildcardClass37 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean12 = paymentController0.processGrantPayment(reservation8, 0.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation13 = null;
        boolean boolean17 = paymentController0.processGrantPayment(reservation13, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation18 = null;
        boolean boolean24 = paymentController0.processCardPayment(reservation18, (double) (byte) 1, "hi!", "hi!", "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean5 = paymentController0.processPayment(reservation1, (double) 1L, "hi!", "hi!");
        java.lang.Class<?> wildcardClass6 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, 1.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) (short) 10, "hi!", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processGrantPayment(reservation25, (double) (short) 100, "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, 0.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean28 = paymentController0.processInstitutionalPayment(reservation22, (double) 100L, "hi!", "", "", "");
        model.Reservation.Reservation reservation29 = null;
        boolean boolean35 = paymentController0.processCardPayment(reservation29, (double) 10, "hi!", "hi!", "", "hi!");
        model.Reservation.Reservation reservation36 = null;
        boolean boolean42 = paymentController0.processInstitutionalPayment(reservation36, (double) 100L, "", "", "", "");
        model.Reservation.Reservation reservation43 = null;
        boolean boolean49 = paymentController0.processCardPayment(reservation43, (double) (byte) -1, "hi!", "", "", "");
        model.Reservation.Reservation reservation50 = null;
        boolean boolean56 = paymentController0.processCardPayment(reservation50, (double) 10L, "", "", "", "");
        model.Reservation.Reservation reservation57 = null;
        boolean boolean61 = paymentController0.processGrantPayment(reservation57, 100.0d, "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, 0.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean28 = paymentController0.processInstitutionalPayment(reservation22, (double) 100L, "hi!", "", "", "");
        model.Reservation.Reservation reservation29 = null;
        boolean boolean35 = paymentController0.processCardPayment(reservation29, (double) 10, "hi!", "hi!", "", "hi!");
        model.Reservation.Reservation reservation36 = null;
        boolean boolean42 = paymentController0.processInstitutionalPayment(reservation36, (double) 100L, "", "", "", "");
        model.Reservation.Reservation reservation43 = null;
        boolean boolean49 = paymentController0.processCardPayment(reservation43, (double) (byte) -1, "hi!", "", "", "");
        model.Reservation.Reservation reservation50 = null;
        boolean boolean56 = paymentController0.processCardPayment(reservation50, (double) 10L, "", "", "", "");
        java.lang.Class<?> wildcardClass57 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 0.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, 100.0d, "", "", "", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) (short) 1, "hi!", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processPayment(reservation32, (double) (byte) 1, "hi!", "hi!");
        java.lang.Class<?> wildcardClass37 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, 1.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) ' ', "hi!", "hi!", "", "");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean33 = paymentController0.processCardPayment(reservation27, (double) 100, "hi!", "hi!", "", "");
        java.lang.Class<?> wildcardClass34 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, 0.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean26 = paymentController0.processPayment(reservation22, (double) 10.0f, "", "hi!");
        java.lang.Class<?> wildcardClass27 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean12 = paymentController0.processGrantPayment(reservation8, 0.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation13 = null;
        boolean boolean17 = paymentController0.processGrantPayment(reservation13, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation18 = null;
        boolean boolean24 = paymentController0.processCardPayment(reservation18, 0.0d, "", "", "", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processGrantPayment(reservation25, (double) (short) 0, "", "hi!");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean34 = paymentController0.processGrantPayment(reservation30, (double) 10, "hi!", "hi!");
        java.lang.Class<?> wildcardClass35 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) '#', "", "hi!", "", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, (-1.0d), "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean26 = paymentController0.processGrantPayment(reservation22, (double) '4', "hi!", "");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processPayment(reservation32, (double) '4', "hi!", "hi!");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean41 = paymentController0.processGrantPayment(reservation37, (double) 100, "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, 100.0d, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) 0L, "hi!", "hi!");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processPayment(reservation25, (double) 0, "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) (byte) 0, "hi!", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, (double) (short) 100, "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processPayment(reservation20, 0.0d, "", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processPayment(reservation25, (double) 10, "hi!", "hi!");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean36 = paymentController0.processCardPayment(reservation30, (double) 0.0f, "hi!", "", "", "hi!");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean41 = paymentController0.processGrantPayment(reservation37, (double) 100.0f, "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 'a', "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) 0.0f, "hi!", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processPayment(reservation25, (double) (byte) 1, "hi!", "");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean34 = paymentController0.processGrantPayment(reservation30, (double) (-1.0f), "", "hi!");
        java.lang.Class<?> wildcardClass35 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean12 = paymentController0.processGrantPayment(reservation8, (double) '#', "hi!", "hi!");
        model.Reservation.Reservation reservation13 = null;
        boolean boolean17 = paymentController0.processPayment(reservation13, (double) (-1L), "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) '#', "", "hi!", "", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 10.0f, "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, 1.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) ' ', "hi!", "hi!", "", "");
        java.lang.Class<?> wildcardClass27 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, 1.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) (-1.0f), "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, 0.0d, "", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean38 = paymentController0.processCardPayment(reservation32, (double) 1L, "hi!", "hi!", "hi!", "hi!");
        model.Reservation.Reservation reservation39 = null;
        boolean boolean43 = paymentController0.processGrantPayment(reservation39, (-1.0d), "", "hi!");
        java.lang.Class<?> wildcardClass44 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, 0.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean28 = paymentController0.processInstitutionalPayment(reservation22, (double) 100L, "hi!", "", "", "");
        model.Reservation.Reservation reservation29 = null;
        boolean boolean35 = paymentController0.processCardPayment(reservation29, (double) 10, "hi!", "hi!", "", "hi!");
        model.Reservation.Reservation reservation36 = null;
        boolean boolean42 = paymentController0.processCardPayment(reservation36, (double) 0L, "hi!", "", "hi!", "hi!");
        java.lang.Class<?> wildcardClass43 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 'a', "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) 0.0f, "hi!", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processGrantPayment(reservation25, (double) (short) 0, "hi!", "");
        java.lang.Class<?> wildcardClass30 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 'a', "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) 0.0f, "hi!", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processGrantPayment(reservation25, (double) (-1.0f), "", "");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean36 = paymentController0.processCardPayment(reservation30, (double) (short) 0, "hi!", "hi!", "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 0.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, 100.0d, "", "", "", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) (short) 1, "hi!", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processPayment(reservation32, (double) (short) 0, "hi!", "");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean43 = paymentController0.processCardPayment(reservation37, 1.0d, "", "", "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean12 = paymentController0.processGrantPayment(reservation8, 0.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation13 = null;
        boolean boolean17 = paymentController0.processGrantPayment(reservation13, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation18 = null;
        boolean boolean24 = paymentController0.processInstitutionalPayment(reservation18, (double) 1.0f, "hi!", "hi!", "", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean31 = paymentController0.processCardPayment(reservation25, (double) (byte) -1, "", "hi!", "hi!", "");
        java.lang.Class<?> wildcardClass32 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 'a', "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) 0.0f, "hi!", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processPayment(reservation25, (double) (byte) 10, "hi!", "");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean36 = paymentController0.processInstitutionalPayment(reservation30, (double) 100L, "hi!", "", "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 0.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, 100.0d, "", "", "", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) (short) 1, "hi!", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processPayment(reservation32, (double) (short) 0, "hi!", "");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean43 = paymentController0.processCardPayment(reservation37, (double) (short) 0, "", "hi!", "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 0.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, 100.0d, "", "", "", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) (short) 1, "hi!", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processPayment(reservation32, (double) (byte) 1, "hi!", "hi!");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean43 = paymentController0.processCardPayment(reservation37, (double) 0.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation44 = null;
        boolean boolean48 = paymentController0.processPayment(reservation44, (double) 10.0f, "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) (byte) 10, "hi!", "hi!", "", "");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) 100, "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 0.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, 100.0d, "", "", "", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) (short) 1, "hi!", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processPayment(reservation32, (double) (short) 0, "hi!", "");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean41 = paymentController0.processGrantPayment(reservation37, (double) 1L, "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 0.0f, "", "");
        java.lang.Class<?> wildcardClass20 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, 100.0d, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) 0L, "hi!", "hi!");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean31 = paymentController0.processInstitutionalPayment(reservation25, (double) 10.0f, "", "hi!", "hi!", "hi!");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean38 = paymentController0.processCardPayment(reservation32, (double) '#', "", "", "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean12 = paymentController0.processGrantPayment(reservation8, (double) '#', "hi!", "hi!");
        model.Reservation.Reservation reservation13 = null;
        boolean boolean19 = paymentController0.processCardPayment(reservation13, (double) 'a', "hi!", "hi!", "hi!", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, 0.0d, "hi!", "", "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean12 = paymentController0.processGrantPayment(reservation8, 0.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation13 = null;
        boolean boolean17 = paymentController0.processGrantPayment(reservation13, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation18 = null;
        boolean boolean24 = paymentController0.processCardPayment(reservation18, 0.0d, "", "", "", "");
        java.lang.Class<?> wildcardClass25 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, 0.0d, "hi!", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) 100, "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) (byte) 10, "hi!", "hi!", "", "");
        java.lang.Class<?> wildcardClass27 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processInstitutionalPayment(reservation15, 1.0d, "hi!", "", "hi!", "hi!");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean26 = paymentController0.processGrantPayment(reservation22, (double) 'a', "", "");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processPayment(reservation27, 100.0d, "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, 100.0d, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) 0L, "hi!", "hi!");
        java.lang.Class<?> wildcardClass25 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, (double) (-1.0f), "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) ' ', "hi!", "hi!", "", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, 0.0d, "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, 1.0d, "hi!", "hi!");
        java.lang.Class<?> wildcardClass20 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, 0.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean28 = paymentController0.processInstitutionalPayment(reservation22, (double) 100L, "hi!", "", "", "");
        model.Reservation.Reservation reservation29 = null;
        boolean boolean35 = paymentController0.processCardPayment(reservation29, (double) 10, "hi!", "hi!", "", "hi!");
        model.Reservation.Reservation reservation36 = null;
        boolean boolean42 = paymentController0.processInstitutionalPayment(reservation36, (double) 100L, "", "", "", "");
        model.Reservation.Reservation reservation43 = null;
        boolean boolean49 = paymentController0.processCardPayment(reservation43, (double) (byte) -1, "hi!", "", "", "");
        model.Reservation.Reservation reservation50 = null;
        boolean boolean56 = paymentController0.processCardPayment(reservation50, (double) 10L, "", "", "", "");
        model.Reservation.Reservation reservation57 = null;
        boolean boolean61 = paymentController0.processPayment(reservation57, (-1.0d), "hi!", "");
        model.Reservation.Reservation reservation62 = null;
        boolean boolean68 = paymentController0.processInstitutionalPayment(reservation62, (double) 0, "hi!", "", "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, (double) (byte) 100, "", "", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processInstitutionalPayment(reservation15, (double) 10, "", "hi!", "", "");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean28 = paymentController0.processInstitutionalPayment(reservation22, (double) (-1.0f), "hi!", "hi!", "", "hi!");
        model.Reservation.Reservation reservation29 = null;
        boolean boolean35 = paymentController0.processCardPayment(reservation29, (double) 1L, "", "", "", "");
        model.Reservation.Reservation reservation36 = null;
        boolean boolean42 = paymentController0.processCardPayment(reservation36, (double) (-1L), "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation43 = null;
        boolean boolean49 = paymentController0.processCardPayment(reservation43, (double) ' ', "hi!", "", "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 'a', "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) 0.0f, "hi!", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processPayment(reservation25, (double) (short) 1, "", "");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean36 = paymentController0.processCardPayment(reservation30, (double) (short) -1, "hi!", "", "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, (double) (byte) 100, "", "", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, (-1.0d), "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean28 = paymentController0.processCardPayment(reservation22, (-1.0d), "", "", "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, 1.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) (-1.0f), "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) (short) 10, "hi!", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean38 = paymentController0.processInstitutionalPayment(reservation32, (double) (byte) 100, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation39 = null;
        boolean boolean43 = paymentController0.processGrantPayment(reservation39, (double) 0L, "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean12 = paymentController0.processGrantPayment(reservation8, 0.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation13 = null;
        boolean boolean17 = paymentController0.processGrantPayment(reservation13, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation18 = null;
        boolean boolean24 = paymentController0.processInstitutionalPayment(reservation18, (double) 1.0f, "hi!", "hi!", "", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processPayment(reservation25, (double) (byte) 0, "", "hi!");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean36 = paymentController0.processCardPayment(reservation30, (-1.0d), "", "hi!", "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) '#', "", "hi!", "", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, (-1.0d), "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean26 = paymentController0.processGrantPayment(reservation22, (double) '4', "hi!", "");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processGrantPayment(reservation32, (double) 1.0f, "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, 1.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) (-1.0f), "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean33 = paymentController0.processCardPayment(reservation27, (double) 0L, "", "", "hi!", "");
        model.Reservation.Reservation reservation34 = null;
        boolean boolean40 = paymentController0.processCardPayment(reservation34, (double) 1.0f, "", "hi!", "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processInstitutionalPayment(reservation15, (double) 0.0f, "hi!", "", "hi!", "hi!");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean26 = paymentController0.processPayment(reservation22, 1.0d, "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, 1.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) (-1.0f), "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean33 = paymentController0.processCardPayment(reservation27, (double) 'a', "", "hi!", "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, 1.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, (double) (short) 1, "hi!", "hi!", "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, 100.0d, "", "");
        java.lang.Class<?> wildcardClass20 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 0.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, 100.0d, "", "", "", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) (short) 1, "hi!", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processPayment(reservation32, (double) (byte) 1, "hi!", "hi!");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean43 = paymentController0.processInstitutionalPayment(reservation37, (double) (-1), "", "", "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 'a', "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) 0.0f, "hi!", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean31 = paymentController0.processInstitutionalPayment(reservation25, (double) (short) 10, "", "hi!", "", "hi!");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean38 = paymentController0.processInstitutionalPayment(reservation32, (double) 100, "", "", "", "");
        java.lang.Class<?> wildcardClass39 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean5 = paymentController0.processGrantPayment(reservation1, 0.0d, "", "hi!");
        model.Reservation.Reservation reservation6 = null;
        boolean boolean12 = paymentController0.processInstitutionalPayment(reservation6, (double) (byte) 10, "", "hi!", "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 'a', "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) 0.0f, "hi!", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processPayment(reservation25, (double) (byte) 10, "hi!", "");
        java.lang.Class<?> wildcardClass30 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean12 = paymentController0.processGrantPayment(reservation8, 0.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation13 = null;
        boolean boolean17 = paymentController0.processGrantPayment(reservation13, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation18 = null;
        boolean boolean24 = paymentController0.processCardPayment(reservation18, 0.0d, "", "", "", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processGrantPayment(reservation25, (double) (short) 0, "", "hi!");
        java.lang.Class<?> wildcardClass30 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean12 = paymentController0.processGrantPayment(reservation8, 0.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation13 = null;
        boolean boolean17 = paymentController0.processGrantPayment(reservation13, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation18 = null;
        boolean boolean24 = paymentController0.processCardPayment(reservation18, 0.0d, "", "", "", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processGrantPayment(reservation25, (double) (short) 0, "", "hi!");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean36 = paymentController0.processInstitutionalPayment(reservation30, (double) (byte) 100, "hi!", "", "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) '#', "", "hi!", "", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) (short) 1, "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 'a', "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) 0.0f, "hi!", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean31 = paymentController0.processInstitutionalPayment(reservation25, (double) (short) 10, "", "hi!", "", "hi!");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processGrantPayment(reservation32, 10.0d, "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 'a', "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) 0.0f, "hi!", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean31 = paymentController0.processInstitutionalPayment(reservation25, (double) (short) 10, "", "hi!", "", "hi!");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean38 = paymentController0.processInstitutionalPayment(reservation32, (double) 0.0f, "", "", "", "");
        model.Reservation.Reservation reservation39 = null;
        boolean boolean43 = paymentController0.processGrantPayment(reservation39, (double) 0L, "", "");
        java.lang.Class<?> wildcardClass44 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, (double) 'a', "", "hi!", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) (byte) 100, "hi!", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) (byte) 1, "", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processGrantPayment(reservation25, (double) (byte) 1, "hi!", "");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean34 = paymentController0.processPayment(reservation30, (double) '4', "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 'a', "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) 0.0f, "hi!", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processPayment(reservation25, (double) (short) 1, "", "");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean34 = paymentController0.processPayment(reservation30, (double) 1.0f, "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, 1.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) (-1.0f), "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processPayment(reservation27, (double) 0.0f, "", "hi!");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean38 = paymentController0.processCardPayment(reservation32, (double) (-1), "", "", "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 'a', "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) 0.0f, "hi!", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processGrantPayment(reservation25, (double) (short) 0, "hi!", "");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean36 = paymentController0.processInstitutionalPayment(reservation30, (-1.0d), "", "", "", "hi!");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean43 = paymentController0.processCardPayment(reservation37, (double) (-1L), "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation44 = null;
        boolean boolean48 = paymentController0.processGrantPayment(reservation44, (double) 'a', "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, (double) 1.0f, "hi!", "", "hi!", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processPayment(reservation27, 0.0d, "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 'a', "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) (-1L), "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) (byte) 1, "hi!", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean38 = paymentController0.processCardPayment(reservation32, (double) (short) -1, "", "", "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, (double) (byte) -1, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean28 = paymentController0.processCardPayment(reservation22, (double) (byte) 0, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation29 = null;
        boolean boolean33 = paymentController0.processPayment(reservation29, (double) 0L, "", "hi!");
        model.Reservation.Reservation reservation34 = null;
        boolean boolean38 = paymentController0.processPayment(reservation34, (double) (byte) 0, "hi!", "");
        java.lang.Class<?> wildcardClass39 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, (double) 'a', "", "hi!", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) (byte) 100, "hi!", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) (byte) 1, "", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processGrantPayment(reservation25, (double) (byte) 1, "hi!", "");
        java.lang.Class<?> wildcardClass30 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, (double) (byte) 100, "", "", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processInstitutionalPayment(reservation15, (double) 10, "", "hi!", "", "");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean28 = paymentController0.processInstitutionalPayment(reservation22, (double) (-1.0f), "hi!", "hi!", "", "hi!");
        model.Reservation.Reservation reservation29 = null;
        boolean boolean35 = paymentController0.processCardPayment(reservation29, (double) 1L, "", "", "", "");
        model.Reservation.Reservation reservation36 = null;
        boolean boolean40 = paymentController0.processGrantPayment(reservation36, (double) 0L, "", "");
        model.Reservation.Reservation reservation41 = null;
        boolean boolean47 = paymentController0.processCardPayment(reservation41, (double) 100L, "", "hi!", "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, 1.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) (-1.0f), "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean33 = paymentController0.processCardPayment(reservation27, (double) (short) -1, "", "", "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean12 = paymentController0.processGrantPayment(reservation8, 0.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation13 = null;
        boolean boolean17 = paymentController0.processGrantPayment(reservation13, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation18 = null;
        boolean boolean24 = paymentController0.processCardPayment(reservation18, 0.0d, "", "", "", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean31 = paymentController0.processInstitutionalPayment(reservation25, (double) 10L, "", "", "", "hi!");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean38 = paymentController0.processCardPayment(reservation32, (double) (byte) 1, "", "", "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, 1.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) ' ', "hi!", "hi!", "", "");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean33 = paymentController0.processInstitutionalPayment(reservation27, 1.0d, "", "hi!", "", "hi!");
        model.Reservation.Reservation reservation34 = null;
        boolean boolean40 = paymentController0.processInstitutionalPayment(reservation34, (double) (-1), "hi!", "hi!", "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) (byte) 0, "hi!", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processInstitutionalPayment(reservation15, 0.0d, "", "hi!", "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, (double) (byte) 100, "", "", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, 10.0d, "", "", "", "");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean28 = paymentController0.processInstitutionalPayment(reservation22, (double) (byte) -1, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation29 = null;
        boolean boolean35 = paymentController0.processCardPayment(reservation29, (double) 0L, "", "", "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 0.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, 100.0d, "", "", "", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) (short) 1, "hi!", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processPayment(reservation32, (double) (short) 0, "hi!", "");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean41 = paymentController0.processPayment(reservation37, (double) (short) 100, "hi!", "");
        model.Reservation.Reservation reservation42 = null;
        boolean boolean46 = paymentController0.processPayment(reservation42, (double) 0, "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, (double) 'a', "", "hi!", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) (byte) 100, "hi!", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) (byte) 1, "", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processPayment(reservation25, 100.0d, "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, (double) (byte) 100, "", "", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, (-1.0d), "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean26 = paymentController0.processGrantPayment(reservation22, (double) 100, "hi!", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processPayment(reservation27, (double) '4', "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean12 = paymentController0.processGrantPayment(reservation8, 0.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation13 = null;
        boolean boolean17 = paymentController0.processGrantPayment(reservation13, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation18 = null;
        boolean boolean24 = paymentController0.processCardPayment(reservation18, 0.0d, "", "", "", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processGrantPayment(reservation25, (double) (short) 0, "", "hi!");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean34 = paymentController0.processGrantPayment(reservation30, (double) 10, "hi!", "hi!");
        model.Reservation.Reservation reservation35 = null;
        boolean boolean39 = paymentController0.processGrantPayment(reservation35, (double) (-1L), "hi!", "hi!");
        model.Reservation.Reservation reservation40 = null;
        boolean boolean46 = paymentController0.processCardPayment(reservation40, 100.0d, "hi!", "", "", "");
        model.Reservation.Reservation reservation47 = null;
        boolean boolean51 = paymentController0.processGrantPayment(reservation47, (double) (-1.0f), "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processPayment(reservation20, (double) (short) 100, "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, (double) 1.0f, "hi!", "", "hi!", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processPayment(reservation27, (double) 1.0f, "hi!", "hi!");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processGrantPayment(reservation32, (double) (byte) 1, "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean12 = paymentController0.processGrantPayment(reservation8, (double) 100.0f, "hi!", "");
        model.Reservation.Reservation reservation13 = null;
        boolean boolean17 = paymentController0.processPayment(reservation13, (double) (byte) 10, "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, (double) 'a', "", "hi!", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) (byte) 100, "hi!", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean33 = paymentController0.processCardPayment(reservation27, (double) 0L, "hi!", "hi!", "hi!", "");
        java.lang.Class<?> wildcardClass34 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, 1.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) (short) 10, "hi!", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processPayment(reservation25, (double) (-1L), "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean12 = paymentController0.processGrantPayment(reservation8, 0.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation13 = null;
        boolean boolean17 = paymentController0.processGrantPayment(reservation13, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation18 = null;
        boolean boolean24 = paymentController0.processCardPayment(reservation18, 0.0d, "", "", "", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processGrantPayment(reservation25, (double) (short) 0, "", "hi!");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean34 = paymentController0.processGrantPayment(reservation30, (double) 10, "hi!", "hi!");
        model.Reservation.Reservation reservation35 = null;
        boolean boolean41 = paymentController0.processCardPayment(reservation35, (double) 1.0f, "", "hi!", "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, (double) (byte) 100, "", "", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processInstitutionalPayment(reservation15, (double) 10, "", "hi!", "", "");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean26 = paymentController0.processGrantPayment(reservation22, (double) '4', "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, 1.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) (-1.0f), "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, 0.0d, "", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processPayment(reservation32, (double) (byte) 100, "", "");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean41 = paymentController0.processPayment(reservation37, 1.0d, "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 'a', "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) (-1L), "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) (byte) 1, "hi!", "");
        java.lang.Class<?> wildcardClass32 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, (double) (byte) 100, "", "", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, 10.0d, "", "", "", "");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean26 = paymentController0.processGrantPayment(reservation22, (double) 'a', "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) '#', "", "hi!", "", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, (-1.0d), "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean26 = paymentController0.processGrantPayment(reservation22, (double) (short) 1, "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, 1.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) (-1.0f), "", "", "hi!", "hi!");
        java.lang.Class<?> wildcardClass27 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean12 = paymentController0.processGrantPayment(reservation8, (double) 100.0f, "hi!", "");
        java.lang.Class<?> wildcardClass13 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, 0.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean26 = paymentController0.processGrantPayment(reservation22, 0.0d, "hi!", "");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean33 = paymentController0.processCardPayment(reservation27, (double) (byte) -1, "", "hi!", "", "hi!");
        model.Reservation.Reservation reservation34 = null;
        boolean boolean38 = paymentController0.processPayment(reservation34, (double) 1, "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 'a', "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) 0.0f, "hi!", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processGrantPayment(reservation25, (double) (-1.0f), "", "");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean34 = paymentController0.processGrantPayment(reservation30, (double) (byte) 1, "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, 0.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean26 = paymentController0.processPayment(reservation22, (double) 10.0f, "", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (-1.0d), "", "hi!");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processGrantPayment(reservation32, (double) (-1.0f), "", "");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean43 = paymentController0.processInstitutionalPayment(reservation37, (double) 10, "", "", "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 0.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, 100.0d, "", "", "", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) (short) 1, "hi!", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processPayment(reservation32, (double) (short) 0, "hi!", "");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean43 = paymentController0.processInstitutionalPayment(reservation37, (double) (short) 0, "", "", "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 'a', "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) 0.0f, "hi!", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processPayment(reservation25, (double) (byte) 1, "hi!", "");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean34 = paymentController0.processGrantPayment(reservation30, (double) ' ', "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, (double) (byte) 100, "", "", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processInstitutionalPayment(reservation15, (double) 10, "", "hi!", "", "");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean28 = paymentController0.processInstitutionalPayment(reservation22, (double) (-1.0f), "hi!", "hi!", "", "hi!");
        model.Reservation.Reservation reservation29 = null;
        boolean boolean35 = paymentController0.processCardPayment(reservation29, (double) 1L, "", "", "", "");
        model.Reservation.Reservation reservation36 = null;
        boolean boolean42 = paymentController0.processCardPayment(reservation36, (double) (-1L), "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation43 = null;
        boolean boolean49 = paymentController0.processInstitutionalPayment(reservation43, (double) ' ', "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation50 = null;
        boolean boolean54 = paymentController0.processPayment(reservation50, (double) '4', "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processInstitutionalPayment(reservation15, (double) 0.0f, "hi!", "", "hi!", "hi!");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean28 = paymentController0.processCardPayment(reservation22, (double) (byte) 0, "hi!", "", "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, 0.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean26 = paymentController0.processGrantPayment(reservation22, 0.0d, "hi!", "");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean33 = paymentController0.processInstitutionalPayment(reservation27, (double) 10, "", "hi!", "", "");
        java.lang.Class<?> wildcardClass34 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, 1.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) (-1.0f), "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, 0.0d, "", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean38 = paymentController0.processCardPayment(reservation32, (double) 1L, "hi!", "hi!", "hi!", "hi!");
        model.Reservation.Reservation reservation39 = null;
        boolean boolean43 = paymentController0.processGrantPayment(reservation39, (-1.0d), "", "hi!");
        model.Reservation.Reservation reservation44 = null;
        boolean boolean48 = paymentController0.processGrantPayment(reservation44, 10.0d, "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean12 = paymentController0.processGrantPayment(reservation8, 0.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation13 = null;
        boolean boolean17 = paymentController0.processGrantPayment(reservation13, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation18 = null;
        boolean boolean24 = paymentController0.processCardPayment(reservation18, 0.0d, "", "", "", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processGrantPayment(reservation25, (double) (short) 0, "", "hi!");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean34 = paymentController0.processGrantPayment(reservation30, (double) 10, "hi!", "hi!");
        model.Reservation.Reservation reservation35 = null;
        boolean boolean39 = paymentController0.processGrantPayment(reservation35, (double) (-1L), "hi!", "hi!");
        model.Reservation.Reservation reservation40 = null;
        boolean boolean46 = paymentController0.processInstitutionalPayment(reservation40, (double) (byte) 0, "", "hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass47 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) (byte) 10, "hi!", "hi!", "", "");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean33 = paymentController0.processInstitutionalPayment(reservation27, (double) (short) 1, "hi!", "", "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, (double) (byte) -1, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean28 = paymentController0.processCardPayment(reservation22, (double) (byte) 0, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation29 = null;
        boolean boolean33 = paymentController0.processPayment(reservation29, (double) 0L, "", "hi!");
        model.Reservation.Reservation reservation34 = null;
        boolean boolean40 = paymentController0.processCardPayment(reservation34, (double) (byte) -1, "hi!", "hi!", "", "");
        model.Reservation.Reservation reservation41 = null;
        boolean boolean47 = paymentController0.processCardPayment(reservation41, 100.0d, "hi!", "", "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, (double) (byte) -1, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean28 = paymentController0.processCardPayment(reservation22, (double) (byte) 0, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation29 = null;
        boolean boolean35 = paymentController0.processInstitutionalPayment(reservation29, (double) (-1L), "hi!", "", "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, (double) (byte) 100, "", "", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, (-1.0d), "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean26 = paymentController0.processGrantPayment(reservation22, (double) 100, "hi!", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) (short) 10, "", "hi!");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processPayment(reservation32, (double) 10, "hi!", "hi!");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean41 = paymentController0.processGrantPayment(reservation37, (double) 10L, "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, (double) 'a', "", "hi!", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) (byte) 100, "hi!", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) (byte) 1, "", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processGrantPayment(reservation25, (double) (short) 0, "", "hi!");
        java.lang.Class<?> wildcardClass30 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, 1.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) (-1.0f), "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, 0.0d, "", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processPayment(reservation32, (double) (byte) 100, "", "");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean43 = paymentController0.processInstitutionalPayment(reservation37, (double) 100, "", "hi!", "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) (byte) 0, "hi!", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, (double) (short) 100, "", "hi!");
        java.lang.Class<?> wildcardClass20 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, 1.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) (-1.0f), "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, 0.0d, "", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean38 = paymentController0.processCardPayment(reservation32, (double) 1L, "hi!", "hi!", "hi!", "hi!");
        model.Reservation.Reservation reservation39 = null;
        boolean boolean45 = paymentController0.processCardPayment(reservation39, (double) 100, "hi!", "hi!", "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processPayment(reservation20, (double) (short) 1, "", "");
        java.lang.Class<?> wildcardClass25 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 0.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, 100.0d, "", "", "", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processPayment(reservation27, 0.0d, "hi!", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processPayment(reservation32, (double) 10L, "hi!", "");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean41 = paymentController0.processGrantPayment(reservation37, (double) (short) 10, "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean12 = paymentController0.processGrantPayment(reservation8, 0.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation13 = null;
        boolean boolean17 = paymentController0.processGrantPayment(reservation13, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation18 = null;
        boolean boolean24 = paymentController0.processCardPayment(reservation18, 0.0d, "", "", "", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processGrantPayment(reservation25, (double) (short) 0, "", "hi!");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean34 = paymentController0.processGrantPayment(reservation30, (double) 10, "hi!", "hi!");
        model.Reservation.Reservation reservation35 = null;
        boolean boolean39 = paymentController0.processGrantPayment(reservation35, (double) (-1L), "hi!", "hi!");
        model.Reservation.Reservation reservation40 = null;
        boolean boolean46 = paymentController0.processCardPayment(reservation40, 100.0d, "hi!", "", "", "");
        model.Reservation.Reservation reservation47 = null;
        boolean boolean53 = paymentController0.processInstitutionalPayment(reservation47, (double) 1, "hi!", "", "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, 1.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) (-1.0f), "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) (short) 10, "hi!", "");
        java.lang.Class<?> wildcardClass32 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, 1.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) (-1.0f), "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, 0.0d, "", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processGrantPayment(reservation32, (double) 1L, "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, 1.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) (-1.0f), "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, 0.0d, "", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processPayment(reservation32, (double) (byte) 100, "", "");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean43 = paymentController0.processCardPayment(reservation37, (double) (byte) 10, "hi!", "", "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, (double) 'a', "", "hi!", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) (byte) 100, "hi!", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) (byte) 100, "", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processPayment(reservation25, (double) (short) -1, "hi!", "hi!");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean34 = paymentController0.processPayment(reservation30, (double) (short) 1, "hi!", "");
        model.Reservation.Reservation reservation35 = null;
        boolean boolean39 = paymentController0.processGrantPayment(reservation35, (double) (byte) 100, "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) '#', "", "hi!", "", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, (-1.0d), "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean26 = paymentController0.processGrantPayment(reservation22, (double) '4', "hi!", "");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processGrantPayment(reservation32, (double) 100.0f, "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, (double) 0.0f, "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 'a', "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) 0.0f, "hi!", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processGrantPayment(reservation25, (double) (-1.0f), "", "");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean36 = paymentController0.processCardPayment(reservation30, 1.0d, "", "hi!", "", "hi!");
        java.lang.Class<?> wildcardClass37 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, 0.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean26 = paymentController0.processGrantPayment(reservation22, 0.0d, "hi!", "");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean33 = paymentController0.processCardPayment(reservation27, (double) (byte) -1, "", "hi!", "", "hi!");
        model.Reservation.Reservation reservation34 = null;
        boolean boolean40 = paymentController0.processInstitutionalPayment(reservation34, (double) 0, "", "hi!", "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, (double) (byte) 100, "", "", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processInstitutionalPayment(reservation15, (double) 10, "", "hi!", "", "");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean28 = paymentController0.processInstitutionalPayment(reservation22, (double) (-1.0f), "hi!", "hi!", "", "hi!");
        model.Reservation.Reservation reservation29 = null;
        boolean boolean35 = paymentController0.processCardPayment(reservation29, (double) 1L, "", "", "", "");
        model.Reservation.Reservation reservation36 = null;
        boolean boolean40 = paymentController0.processGrantPayment(reservation36, (double) 0L, "", "");
        model.Reservation.Reservation reservation41 = null;
        boolean boolean45 = paymentController0.processGrantPayment(reservation41, (double) 1L, "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) (byte) 0, "hi!", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, (double) (short) 100, "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processPayment(reservation20, 0.0d, "", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processGrantPayment(reservation25, (double) 0.0f, "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) '#', "", "hi!", "", "hi!");
        java.lang.Class<?> wildcardClass15 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, (double) 'a', "", "hi!", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) (byte) 100, "hi!", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) (byte) 100, "", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processPayment(reservation25, (double) (short) -1, "hi!", "hi!");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean36 = paymentController0.processCardPayment(reservation30, (double) 10, "", "", "", "");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean41 = paymentController0.processGrantPayment(reservation37, (double) (short) 10, "hi!", "hi!");
        model.Reservation.Reservation reservation42 = null;
        boolean boolean46 = paymentController0.processGrantPayment(reservation42, (double) 100L, "", "");
        java.lang.Class<?> wildcardClass47 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, 0.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean26 = paymentController0.processGrantPayment(reservation22, 0.0d, "hi!", "");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean33 = paymentController0.processInstitutionalPayment(reservation27, (double) 100L, "hi!", "hi!", "hi!", "hi!");
        model.Reservation.Reservation reservation34 = null;
        boolean boolean40 = paymentController0.processInstitutionalPayment(reservation34, (double) 1, "", "", "", "hi!");
        model.Reservation.Reservation reservation41 = null;
        boolean boolean45 = paymentController0.processGrantPayment(reservation41, (double) '4', "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 0.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, 100.0d, "", "", "", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processPayment(reservation27, 0.0d, "hi!", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processPayment(reservation32, (double) 100, "hi!", "hi!");
        java.lang.Class<?> wildcardClass37 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) (byte) 10, "hi!", "hi!", "", "");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean33 = paymentController0.processCardPayment(reservation27, (double) '4', "hi!", "hi!", "hi!", "hi!");
        model.Reservation.Reservation reservation34 = null;
        boolean boolean38 = paymentController0.processPayment(reservation34, (double) 0, "", "hi!");
        java.lang.Class<?> wildcardClass39 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, (double) 'a', "", "hi!", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) (byte) 100, "hi!", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) (byte) 1, "", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean31 = paymentController0.processCardPayment(reservation25, (double) (short) 0, "hi!", "", "", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean38 = paymentController0.processInstitutionalPayment(reservation32, (double) 100L, "hi!", "", "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean12 = paymentController0.processPayment(reservation8, (double) (-1), "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, (double) (byte) 100, "", "", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, 10.0d, "", "", "", "");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean28 = paymentController0.processCardPayment(reservation22, 0.0d, "hi!", "hi!", "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, 1.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) (-1.0f), "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, 0.0d, "", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processPayment(reservation32, (double) (byte) 100, "", "");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean43 = paymentController0.processInstitutionalPayment(reservation37, (double) 0, "hi!", "", "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean12 = paymentController0.processGrantPayment(reservation8, 0.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation13 = null;
        boolean boolean17 = paymentController0.processGrantPayment(reservation13, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation18 = null;
        boolean boolean24 = paymentController0.processInstitutionalPayment(reservation18, (double) 100L, "", "hi!", "hi!", "hi!");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processGrantPayment(reservation25, (double) 10L, "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, 0.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean26 = paymentController0.processPayment(reservation22, (double) (-1), "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) '#', "", "hi!", "", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, (-1.0d), "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean26 = paymentController0.processGrantPayment(reservation22, (double) '4', "hi!", "");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processGrantPayment(reservation32, (double) 0.0f, "hi!", "hi!");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean43 = paymentController0.processCardPayment(reservation37, 0.0d, "hi!", "hi!", "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 'a', "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) 0.0f, "hi!", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processPayment(reservation25, (double) (byte) 10, "hi!", "");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean34 = paymentController0.processGrantPayment(reservation30, (double) 100.0f, "hi!", "");
        model.Reservation.Reservation reservation35 = null;
        boolean boolean41 = paymentController0.processInstitutionalPayment(reservation35, (double) 1.0f, "", "", "", "");
        model.Reservation.Reservation reservation42 = null;
        boolean boolean48 = paymentController0.processInstitutionalPayment(reservation42, (double) (byte) 0, "", "hi!", "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, 100.0d, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) 0L, "hi!", "hi!");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processGrantPayment(reservation25, (double) 0, "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, 1.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) (-1.0f), "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processPayment(reservation27, (double) (short) -1, "", "hi!");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processPayment(reservation32, 0.0d, "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, (double) (byte) 100, "", "", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processInstitutionalPayment(reservation15, (double) 10, "", "hi!", "", "");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean28 = paymentController0.processInstitutionalPayment(reservation22, (double) (-1.0f), "hi!", "hi!", "", "hi!");
        model.Reservation.Reservation reservation29 = null;
        boolean boolean35 = paymentController0.processCardPayment(reservation29, (double) 1L, "", "", "", "");
        model.Reservation.Reservation reservation36 = null;
        boolean boolean40 = paymentController0.processGrantPayment(reservation36, (double) 0L, "", "");
        java.lang.Class<?> wildcardClass41 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, 1.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) (-1.0f), "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processPayment(reservation27, (double) 0.0f, "", "hi!");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean38 = paymentController0.processInstitutionalPayment(reservation32, 100.0d, "", "hi!", "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 0.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, 100.0d, "", "", "", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) (short) 1, "hi!", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processPayment(reservation32, (double) (short) 0, "hi!", "");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean43 = paymentController0.processInstitutionalPayment(reservation37, (double) (short) 0, "hi!", "", "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean12 = paymentController0.processGrantPayment(reservation8, (double) '#', "hi!", "hi!");
        model.Reservation.Reservation reservation13 = null;
        boolean boolean19 = paymentController0.processCardPayment(reservation13, (double) 'a', "hi!", "hi!", "hi!", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) (byte) 1, "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 'a', "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) 0.0f, "hi!", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processPayment(reservation25, (double) (byte) 1, "hi!", "");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean34 = paymentController0.processGrantPayment(reservation30, (double) (-1.0f), "", "hi!");
        model.Reservation.Reservation reservation35 = null;
        boolean boolean39 = paymentController0.processGrantPayment(reservation35, (double) 1L, "hi!", "");
        model.Reservation.Reservation reservation40 = null;
        boolean boolean46 = paymentController0.processInstitutionalPayment(reservation40, (double) '4', "", "hi!", "hi!", "");
        model.Reservation.Reservation reservation47 = null;
        boolean boolean51 = paymentController0.processPayment(reservation47, (double) (short) 1, "", "hi!");
        model.Reservation.Reservation reservation52 = null;
        boolean boolean56 = paymentController0.processPayment(reservation52, 1.0d, "hi!", "");
        model.Reservation.Reservation reservation57 = null;
        boolean boolean61 = paymentController0.processPayment(reservation57, (double) 0, "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, (double) (byte) 100, "", "", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, (-1.0d), "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean26 = paymentController0.processGrantPayment(reservation22, (double) 100, "hi!", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) (short) 10, "", "hi!");
        java.lang.Class<?> wildcardClass32 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, (double) (byte) -1, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean28 = paymentController0.processCardPayment(reservation22, (double) (byte) 0, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation29 = null;
        boolean boolean33 = paymentController0.processPayment(reservation29, (double) 0L, "", "hi!");
        model.Reservation.Reservation reservation34 = null;
        boolean boolean40 = paymentController0.processCardPayment(reservation34, (double) (byte) -1, "hi!", "hi!", "", "");
        model.Reservation.Reservation reservation41 = null;
        boolean boolean45 = paymentController0.processGrantPayment(reservation41, (double) (-1), "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, (double) 'a', "", "hi!", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) (byte) 100, "hi!", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) (byte) 1, "", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processGrantPayment(reservation25, (double) (short) 0, "", "hi!");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean34 = paymentController0.processGrantPayment(reservation30, (double) 1L, "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) (byte) 10, "hi!", "hi!", "", "");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) 10L, "", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processPayment(reservation32, 1.0d, "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 'a', "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) 0.0f, "hi!", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processPayment(reservation25, (double) (byte) 1, "hi!", "");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean34 = paymentController0.processGrantPayment(reservation30, (double) (-1.0f), "", "hi!");
        model.Reservation.Reservation reservation35 = null;
        boolean boolean39 = paymentController0.processGrantPayment(reservation35, (double) 1L, "hi!", "");
        model.Reservation.Reservation reservation40 = null;
        boolean boolean46 = paymentController0.processInstitutionalPayment(reservation40, (double) '4', "", "hi!", "hi!", "");
        model.Reservation.Reservation reservation47 = null;
        boolean boolean51 = paymentController0.processPayment(reservation47, (double) (short) 1, "", "hi!");
        model.Reservation.Reservation reservation52 = null;
        boolean boolean56 = paymentController0.processGrantPayment(reservation52, 0.0d, "", "");
        java.lang.Class<?> wildcardClass57 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean12 = paymentController0.processGrantPayment(reservation8, 0.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation13 = null;
        boolean boolean17 = paymentController0.processPayment(reservation13, (double) 1L, "", "hi!");
        model.Reservation.Reservation reservation18 = null;
        boolean boolean22 = paymentController0.processGrantPayment(reservation18, (double) (byte) 1, "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) '#', "", "hi!", "", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, (-1.0d), "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean26 = paymentController0.processGrantPayment(reservation22, (double) '4', "hi!", "");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processGrantPayment(reservation32, (double) (short) 100, "", "");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean41 = paymentController0.processGrantPayment(reservation37, 100.0d, "", "");
        model.Reservation.Reservation reservation42 = null;
        boolean boolean48 = paymentController0.processInstitutionalPayment(reservation42, (double) (-1.0f), "", "hi!", "", "");
        model.Reservation.Reservation reservation49 = null;
        boolean boolean55 = paymentController0.processInstitutionalPayment(reservation49, (double) (byte) -1, "", "hi!", "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) '#', "", "hi!", "", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, (-1.0d), "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean26 = paymentController0.processGrantPayment(reservation22, (double) '4', "hi!", "");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processGrantPayment(reservation32, (double) 0.0f, "hi!", "hi!");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean41 = paymentController0.processPayment(reservation37, (double) (short) 0, "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 0.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, 100.0d, "", "", "", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) (short) 1, "hi!", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processPayment(reservation32, (double) (byte) 1, "", "hi!");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean43 = paymentController0.processInstitutionalPayment(reservation37, (double) 100L, "", "hi!", "hi!", "");
        model.Reservation.Reservation reservation44 = null;
        boolean boolean48 = paymentController0.processGrantPayment(reservation44, (double) (byte) -1, "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) (byte) 10, "hi!", "hi!", "", "");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) 10L, "", "");
        java.lang.Class<?> wildcardClass32 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) '#', "", "hi!", "", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, (-1.0d), "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean26 = paymentController0.processGrantPayment(reservation22, (double) '4', "hi!", "");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processGrantPayment(reservation32, (double) (short) 100, "", "");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean41 = paymentController0.processGrantPayment(reservation37, 100.0d, "", "");
        java.lang.Class<?> wildcardClass42 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) (byte) 10, "hi!", "hi!", "", "");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean33 = paymentController0.processCardPayment(reservation27, (double) '4', "hi!", "hi!", "hi!", "hi!");
        model.Reservation.Reservation reservation34 = null;
        boolean boolean38 = paymentController0.processPayment(reservation34, (double) 0, "", "hi!");
        model.Reservation.Reservation reservation39 = null;
        boolean boolean45 = paymentController0.processCardPayment(reservation39, (double) (short) 0, "hi!", "", "hi!", "hi!");
        model.Reservation.Reservation reservation46 = null;
        boolean boolean50 = paymentController0.processGrantPayment(reservation46, (double) 1, "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, (double) (byte) 100, "", "", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processInstitutionalPayment(reservation15, (double) 10, "", "hi!", "", "");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean28 = paymentController0.processInstitutionalPayment(reservation22, (double) (-1.0f), "hi!", "hi!", "", "hi!");
        model.Reservation.Reservation reservation29 = null;
        boolean boolean35 = paymentController0.processCardPayment(reservation29, (double) 1L, "", "", "", "");
        model.Reservation.Reservation reservation36 = null;
        boolean boolean40 = paymentController0.processGrantPayment(reservation36, (double) 0L, "", "");
        model.Reservation.Reservation reservation41 = null;
        boolean boolean47 = paymentController0.processCardPayment(reservation41, (double) (short) 10, "", "hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass48 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, 1.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) ' ', "hi!", "hi!", "", "");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean33 = paymentController0.processInstitutionalPayment(reservation27, 1.0d, "", "hi!", "", "hi!");
        model.Reservation.Reservation reservation34 = null;
        boolean boolean40 = paymentController0.processCardPayment(reservation34, (double) (-1L), "hi!", "hi!", "", "");
        model.Reservation.Reservation reservation41 = null;
        boolean boolean47 = paymentController0.processInstitutionalPayment(reservation41, (-1.0d), "", "", "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, 0.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean26 = paymentController0.processPayment(reservation22, (double) 10.0f, "", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean33 = paymentController0.processCardPayment(reservation27, (double) 100.0f, "hi!", "", "", "");
        model.Reservation.Reservation reservation34 = null;
        boolean boolean38 = paymentController0.processGrantPayment(reservation34, (double) 1.0f, "", "");
        model.Reservation.Reservation reservation39 = null;
        boolean boolean43 = paymentController0.processGrantPayment(reservation39, (double) (byte) 10, "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 'a', "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, (double) (short) 0, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processPayment(reservation27, (double) 10L, "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, 0.0d, "hi!", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) (short) -1, "", "hi!");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processPayment(reservation25, 100.0d, "hi!", "");
        java.lang.Class<?> wildcardClass30 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) (byte) 10, "hi!", "hi!", "", "");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) 10L, "", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processGrantPayment(reservation32, (double) (byte) 100, "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, (double) (byte) 100, "", "", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processInstitutionalPayment(reservation15, (double) 10, "", "hi!", "", "");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean28 = paymentController0.processInstitutionalPayment(reservation22, (double) (-1.0f), "hi!", "hi!", "", "hi!");
        model.Reservation.Reservation reservation29 = null;
        boolean boolean35 = paymentController0.processCardPayment(reservation29, (double) 1L, "", "", "", "");
        model.Reservation.Reservation reservation36 = null;
        boolean boolean42 = paymentController0.processCardPayment(reservation36, (double) (-1L), "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation43 = null;
        boolean boolean49 = paymentController0.processInstitutionalPayment(reservation43, (-1.0d), "", "hi!", "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean12 = paymentController0.processGrantPayment(reservation8, 0.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation13 = null;
        boolean boolean17 = paymentController0.processGrantPayment(reservation13, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation18 = null;
        boolean boolean24 = paymentController0.processCardPayment(reservation18, 0.0d, "", "", "", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processGrantPayment(reservation25, (double) (short) 0, "", "hi!");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean34 = paymentController0.processGrantPayment(reservation30, (double) 10, "hi!", "hi!");
        model.Reservation.Reservation reservation35 = null;
        boolean boolean39 = paymentController0.processGrantPayment(reservation35, (double) (-1L), "hi!", "hi!");
        model.Reservation.Reservation reservation40 = null;
        boolean boolean46 = paymentController0.processCardPayment(reservation40, 100.0d, "hi!", "", "", "");
        model.Reservation.Reservation reservation47 = null;
        boolean boolean51 = paymentController0.processGrantPayment(reservation47, 10.0d, "", "");
        model.Reservation.Reservation reservation52 = null;
        boolean boolean58 = paymentController0.processInstitutionalPayment(reservation52, 1.0d, "hi!", "hi!", "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 'a', "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) 0.0f, "hi!", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean31 = paymentController0.processInstitutionalPayment(reservation25, (double) (short) 10, "", "hi!", "", "hi!");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean38 = paymentController0.processInstitutionalPayment(reservation32, (double) 0.0f, "", "", "", "");
        model.Reservation.Reservation reservation39 = null;
        boolean boolean43 = paymentController0.processPayment(reservation39, (double) (-1.0f), "", "");
        model.Reservation.Reservation reservation44 = null;
        boolean boolean48 = paymentController0.processPayment(reservation44, (double) (-1L), "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 0.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, 100.0d, "", "", "", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processPayment(reservation27, 0.0d, "hi!", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processPayment(reservation32, (double) 10L, "hi!", "");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean41 = paymentController0.processGrantPayment(reservation37, 10.0d, "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 0.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, 100.0d, "", "", "", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) 100, "", "hi!");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processGrantPayment(reservation32, (double) 0, "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) (byte) 10, "hi!", "hi!", "", "");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean33 = paymentController0.processCardPayment(reservation27, (double) '4', "hi!", "hi!", "hi!", "hi!");
        model.Reservation.Reservation reservation34 = null;
        boolean boolean40 = paymentController0.processInstitutionalPayment(reservation34, (double) 0, "hi!", "hi!", "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) (byte) 10, "hi!", "hi!", "", "");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processPayment(reservation27, (-1.0d), "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, (double) 100.0f, "", "");
        java.lang.Class<?> wildcardClass20 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 'a', "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, (double) (short) 0, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean33 = paymentController0.processCardPayment(reservation27, (double) 1.0f, "", "hi!", "hi!", "hi!");
        model.Reservation.Reservation reservation34 = null;
        boolean boolean38 = paymentController0.processGrantPayment(reservation34, (double) 1, "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 0.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, 100.0d, "", "", "", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) (short) 1, "hi!", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processPayment(reservation32, (double) (byte) 1, "hi!", "hi!");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean43 = paymentController0.processCardPayment(reservation37, (double) 0.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation44 = null;
        boolean boolean48 = paymentController0.processGrantPayment(reservation44, 0.0d, "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, 0.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean26 = paymentController0.processPayment(reservation22, (double) 10.0f, "", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean33 = paymentController0.processCardPayment(reservation27, (double) 100.0f, "hi!", "", "", "");
        model.Reservation.Reservation reservation34 = null;
        boolean boolean38 = paymentController0.processGrantPayment(reservation34, (double) 1.0f, "", "");
        model.Reservation.Reservation reservation39 = null;
        boolean boolean43 = paymentController0.processPayment(reservation39, (double) (short) 10, "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 'a', "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) 0.0f, "hi!", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processPayment(reservation25, (double) (byte) 1, "hi!", "");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean34 = paymentController0.processGrantPayment(reservation30, (double) (-1.0f), "", "hi!");
        model.Reservation.Reservation reservation35 = null;
        boolean boolean39 = paymentController0.processGrantPayment(reservation35, (double) 1L, "hi!", "");
        model.Reservation.Reservation reservation40 = null;
        boolean boolean46 = paymentController0.processCardPayment(reservation40, 0.0d, "", "hi!", "hi!", "hi!");
        model.Reservation.Reservation reservation47 = null;
        boolean boolean51 = paymentController0.processPayment(reservation47, (double) (short) 1, "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 'a', "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) 0.0f, "hi!", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processGrantPayment(reservation25, (double) (-1.0f), "", "");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean36 = paymentController0.processCardPayment(reservation30, 1.0d, "", "hi!", "", "hi!");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean41 = paymentController0.processGrantPayment(reservation37, (double) 100.0f, "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) (byte) 0, "hi!", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) (byte) 10, "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, (double) (byte) 100, "", "", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, (-1.0d), "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean28 = paymentController0.processInstitutionalPayment(reservation22, 10.0d, "", "hi!", "hi!", "");
        java.lang.Class<?> wildcardClass29 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, 1.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) (-1.0f), "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, 0.0d, "", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean38 = paymentController0.processCardPayment(reservation32, (double) 1L, "hi!", "hi!", "hi!", "hi!");
        model.Reservation.Reservation reservation39 = null;
        boolean boolean43 = paymentController0.processGrantPayment(reservation39, (-1.0d), "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 'a', "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) 0.0f, "hi!", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean31 = paymentController0.processInstitutionalPayment(reservation25, (double) (short) 10, "", "hi!", "", "hi!");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean38 = paymentController0.processInstitutionalPayment(reservation32, (double) 0.0f, "", "", "", "");
        model.Reservation.Reservation reservation39 = null;
        boolean boolean43 = paymentController0.processPayment(reservation39, (double) (-1.0f), "", "");
        model.Reservation.Reservation reservation44 = null;
        boolean boolean50 = paymentController0.processInstitutionalPayment(reservation44, 1.0d, "hi!", "hi!", "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean12 = paymentController0.processGrantPayment(reservation8, 0.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation13 = null;
        boolean boolean17 = paymentController0.processGrantPayment(reservation13, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation18 = null;
        boolean boolean24 = paymentController0.processCardPayment(reservation18, 0.0d, "", "", "", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean31 = paymentController0.processInstitutionalPayment(reservation25, (double) 10L, "", "", "", "hi!");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean38 = paymentController0.processInstitutionalPayment(reservation32, (double) (byte) -1, "", "hi!", "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 'a', "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) 0.0f, "hi!", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processPayment(reservation25, (double) (byte) 10, "hi!", "");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean36 = paymentController0.processCardPayment(reservation30, (double) (-1L), "", "hi!", "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 'a', "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) 0.0f, "hi!", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processPayment(reservation25, (double) (byte) 10, "hi!", "");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean34 = paymentController0.processGrantPayment(reservation30, (double) 100.0f, "hi!", "");
        model.Reservation.Reservation reservation35 = null;
        boolean boolean41 = paymentController0.processInstitutionalPayment(reservation35, (double) 1.0f, "", "", "", "");
        model.Reservation.Reservation reservation42 = null;
        boolean boolean46 = paymentController0.processGrantPayment(reservation42, 0.0d, "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 'a', "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) 0.0f, "hi!", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean31 = paymentController0.processInstitutionalPayment(reservation25, (double) (short) 10, "", "hi!", "", "hi!");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processGrantPayment(reservation32, (double) 0L, "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 0.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, 100.0d, "", "", "", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) (short) 1, "hi!", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processPayment(reservation32, (double) (short) 0, "hi!", "");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean41 = paymentController0.processPayment(reservation37, (double) (short) 100, "hi!", "");
        model.Reservation.Reservation reservation42 = null;
        boolean boolean48 = paymentController0.processCardPayment(reservation42, (double) ' ', "hi!", "", "", "hi!");
        model.Reservation.Reservation reservation49 = null;
        boolean boolean53 = paymentController0.processGrantPayment(reservation49, (double) ' ', "hi!", "hi!");
        java.lang.Class<?> wildcardClass54 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean12 = paymentController0.processGrantPayment(reservation8, 0.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation13 = null;
        boolean boolean19 = paymentController0.processCardPayment(reservation13, (double) 0L, "hi!", "", "hi!", "hi!");
        java.lang.Class<?> wildcardClass20 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, (double) (short) 100, "hi!", "", "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean12 = paymentController0.processGrantPayment(reservation8, 0.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation13 = null;
        boolean boolean17 = paymentController0.processGrantPayment(reservation13, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation18 = null;
        boolean boolean24 = paymentController0.processCardPayment(reservation18, 0.0d, "", "", "", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean31 = paymentController0.processCardPayment(reservation25, (double) '#', "", "", "", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean38 = paymentController0.processCardPayment(reservation32, (double) (byte) 1, "hi!", "hi!", "", "hi!");
        model.Reservation.Reservation reservation39 = null;
        boolean boolean45 = paymentController0.processCardPayment(reservation39, (double) 100, "hi!", "hi!", "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, 0.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean28 = paymentController0.processInstitutionalPayment(reservation22, (double) 100L, "hi!", "", "", "");
        model.Reservation.Reservation reservation29 = null;
        boolean boolean35 = paymentController0.processCardPayment(reservation29, (double) 10, "hi!", "hi!", "", "hi!");
        model.Reservation.Reservation reservation36 = null;
        boolean boolean42 = paymentController0.processInstitutionalPayment(reservation36, (double) 100L, "", "", "", "");
        model.Reservation.Reservation reservation43 = null;
        boolean boolean49 = paymentController0.processCardPayment(reservation43, (double) (byte) -1, "hi!", "", "", "");
        model.Reservation.Reservation reservation50 = null;
        boolean boolean56 = paymentController0.processCardPayment(reservation50, (double) 10L, "", "", "", "");
        model.Reservation.Reservation reservation57 = null;
        boolean boolean63 = paymentController0.processInstitutionalPayment(reservation57, (double) (short) -1, "", "", "hi!", "");
        model.Reservation.Reservation reservation64 = null;
        boolean boolean68 = paymentController0.processGrantPayment(reservation64, 0.0d, "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean12 = paymentController0.processGrantPayment(reservation8, 0.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation13 = null;
        boolean boolean17 = paymentController0.processGrantPayment(reservation13, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation18 = null;
        boolean boolean24 = paymentController0.processInstitutionalPayment(reservation18, (double) 1.0f, "hi!", "hi!", "", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean31 = paymentController0.processCardPayment(reservation25, (double) (byte) -1, "", "hi!", "hi!", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean38 = paymentController0.processCardPayment(reservation32, (double) (byte) 0, "", "hi!", "", "");
        model.Reservation.Reservation reservation39 = null;
        boolean boolean45 = paymentController0.processInstitutionalPayment(reservation39, (double) 10.0f, "", "", "", "");
        model.Reservation.Reservation reservation46 = null;
        boolean boolean52 = paymentController0.processCardPayment(reservation46, (double) (short) 0, "hi!", "hi!", "", "hi!");
        java.lang.Class<?> wildcardClass53 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 'a', "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) 0.0f, "hi!", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processGrantPayment(reservation25, (double) (-1.0f), "", "");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean36 = paymentController0.processCardPayment(reservation30, (double) 100L, "hi!", "hi!", "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, 100.0d, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, (double) 10, "", "", "hi!", "");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processPayment(reservation27, 10.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processGrantPayment(reservation32, 0.0d, "", "");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean41 = paymentController0.processGrantPayment(reservation37, (double) 100L, "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processInstitutionalPayment(reservation15, 1.0d, "hi!", "", "hi!", "hi!");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean26 = paymentController0.processPayment(reservation22, 0.0d, "", "");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, 0.0d, "", "hi!");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean38 = paymentController0.processInstitutionalPayment(reservation32, 0.0d, "", "", "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) '#', "", "hi!", "", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, (-1.0d), "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean26 = paymentController0.processPayment(reservation22, (double) (short) 100, "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 0.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, 100.0d, "", "", "", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processPayment(reservation27, 0.0d, "hi!", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processPayment(reservation32, (double) 100, "hi!", "hi!");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean43 = paymentController0.processCardPayment(reservation37, (double) (byte) -1, "", "", "", "hi!");
        model.Reservation.Reservation reservation44 = null;
        boolean boolean50 = paymentController0.processInstitutionalPayment(reservation44, 0.0d, "hi!", "hi!", "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 'a', "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) 0.0f, "hi!", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processPayment(reservation25, (double) (byte) 1, "hi!", "");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean34 = paymentController0.processGrantPayment(reservation30, (double) (-1.0f), "", "hi!");
        model.Reservation.Reservation reservation35 = null;
        boolean boolean39 = paymentController0.processGrantPayment(reservation35, (double) 1L, "hi!", "");
        model.Reservation.Reservation reservation40 = null;
        boolean boolean46 = paymentController0.processInstitutionalPayment(reservation40, (double) '4', "", "hi!", "hi!", "");
        model.Reservation.Reservation reservation47 = null;
        boolean boolean53 = paymentController0.processInstitutionalPayment(reservation47, 1.0d, "", "", "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, (double) 1.0f, "hi!", "", "hi!", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean33 = paymentController0.processCardPayment(reservation27, 10.0d, "", "hi!", "", "");
        model.Reservation.Reservation reservation34 = null;
        boolean boolean38 = paymentController0.processGrantPayment(reservation34, (double) (-1), "hi!", "hi!");
        java.lang.Class<?> wildcardClass39 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, 0.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean28 = paymentController0.processInstitutionalPayment(reservation22, (double) 100L, "hi!", "", "", "");
        model.Reservation.Reservation reservation29 = null;
        boolean boolean35 = paymentController0.processCardPayment(reservation29, (double) 10, "hi!", "hi!", "", "hi!");
        model.Reservation.Reservation reservation36 = null;
        boolean boolean42 = paymentController0.processInstitutionalPayment(reservation36, (double) 100L, "", "", "", "");
        model.Reservation.Reservation reservation43 = null;
        boolean boolean49 = paymentController0.processCardPayment(reservation43, (double) (byte) -1, "hi!", "", "", "");
        model.Reservation.Reservation reservation50 = null;
        boolean boolean56 = paymentController0.processCardPayment(reservation50, (double) 10L, "", "", "", "");
        model.Reservation.Reservation reservation57 = null;
        boolean boolean61 = paymentController0.processPayment(reservation57, (-1.0d), "hi!", "");
        model.Reservation.Reservation reservation62 = null;
        boolean boolean68 = paymentController0.processInstitutionalPayment(reservation62, (double) 10.0f, "", "hi!", "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean12 = paymentController0.processGrantPayment(reservation8, (double) 100.0f, "hi!", "");
        model.Reservation.Reservation reservation13 = null;
        boolean boolean17 = paymentController0.processGrantPayment(reservation13, (double) (short) 1, "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean12 = paymentController0.processGrantPayment(reservation8, 0.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation13 = null;
        boolean boolean17 = paymentController0.processGrantPayment(reservation13, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation18 = null;
        boolean boolean24 = paymentController0.processInstitutionalPayment(reservation18, (double) 1.0f, "hi!", "hi!", "", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean31 = paymentController0.processCardPayment(reservation25, (double) (byte) -1, "", "hi!", "hi!", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean38 = paymentController0.processCardPayment(reservation32, (double) (byte) 0, "", "hi!", "", "");
        model.Reservation.Reservation reservation39 = null;
        boolean boolean43 = paymentController0.processGrantPayment(reservation39, (double) 'a', "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, 0.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean28 = paymentController0.processInstitutionalPayment(reservation22, (double) 100L, "hi!", "", "", "");
        model.Reservation.Reservation reservation29 = null;
        boolean boolean35 = paymentController0.processCardPayment(reservation29, (double) 10, "hi!", "hi!", "", "hi!");
        model.Reservation.Reservation reservation36 = null;
        boolean boolean42 = paymentController0.processInstitutionalPayment(reservation36, (double) 100L, "", "", "", "");
        model.Reservation.Reservation reservation43 = null;
        boolean boolean49 = paymentController0.processCardPayment(reservation43, (double) (byte) -1, "hi!", "", "", "");
        model.Reservation.Reservation reservation50 = null;
        boolean boolean54 = paymentController0.processGrantPayment(reservation50, (double) (byte) -1, "", "");
        java.lang.Class<?> wildcardClass55 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, 1.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) (-1.0f), "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) (short) 10, "hi!", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean38 = paymentController0.processInstitutionalPayment(reservation32, (double) 10L, "hi!", "", "", "hi!");
        model.Reservation.Reservation reservation39 = null;
        boolean boolean45 = paymentController0.processCardPayment(reservation39, (double) 100L, "hi!", "hi!", "hi!", "hi!");
        model.Reservation.Reservation reservation46 = null;
        boolean boolean50 = paymentController0.processPayment(reservation46, (double) 10.0f, "hi!", "");
        java.lang.Class<?> wildcardClass51 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processPayment(reservation20, (double) (short) 1, "", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean31 = paymentController0.processInstitutionalPayment(reservation25, (double) (-1L), "hi!", "hi!", "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean12 = paymentController0.processGrantPayment(reservation8, 0.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation13 = null;
        boolean boolean17 = paymentController0.processGrantPayment(reservation13, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation18 = null;
        boolean boolean24 = paymentController0.processCardPayment(reservation18, (double) 0, "hi!", "", "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 0.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, 100.0d, "", "", "", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) (short) 1, "hi!", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processPayment(reservation32, (double) (byte) 1, "hi!", "hi!");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean43 = paymentController0.processCardPayment(reservation37, (double) 0.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation44 = null;
        boolean boolean48 = paymentController0.processPayment(reservation44, (double) (short) 10, "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processInstitutionalPayment(reservation15, 1.0d, "hi!", "", "hi!", "hi!");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean26 = paymentController0.processGrantPayment(reservation22, (double) 'a', "", "");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean33 = paymentController0.processInstitutionalPayment(reservation27, 1.0d, "", "hi!", "", "hi!");
        model.Reservation.Reservation reservation34 = null;
        boolean boolean40 = paymentController0.processCardPayment(reservation34, (double) (byte) -1, "", "", "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 0.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, 100.0d, "", "", "", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processPayment(reservation27, 0.0d, "hi!", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean38 = paymentController0.processInstitutionalPayment(reservation32, (double) (short) 10, "", "hi!", "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean12 = paymentController0.processGrantPayment(reservation8, 0.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation13 = null;
        boolean boolean17 = paymentController0.processGrantPayment(reservation13, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation18 = null;
        boolean boolean24 = paymentController0.processInstitutionalPayment(reservation18, (double) 1.0f, "hi!", "hi!", "", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean31 = paymentController0.processCardPayment(reservation25, (double) (byte) -1, "", "hi!", "hi!", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processPayment(reservation32, (double) 'a', "", "hi!");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean43 = paymentController0.processInstitutionalPayment(reservation37, 0.0d, "", "", "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, (double) 1.0f, "hi!", "", "hi!", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean33 = paymentController0.processCardPayment(reservation27, 10.0d, "", "hi!", "", "");
        model.Reservation.Reservation reservation34 = null;
        boolean boolean38 = paymentController0.processGrantPayment(reservation34, (double) (-1), "hi!", "hi!");
        model.Reservation.Reservation reservation39 = null;
        boolean boolean43 = paymentController0.processGrantPayment(reservation39, (double) (byte) 1, "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, (double) 100L, "hi!", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, 0.0d, "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, (double) (-1.0f), "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) ' ', "hi!", "hi!", "", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean33 = paymentController0.processInstitutionalPayment(reservation27, (double) (short) 100, "hi!", "hi!", "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 0.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, 100.0d, "", "", "", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) (short) 1, "hi!", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processPayment(reservation32, (double) (byte) 1, "hi!", "hi!");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean43 = paymentController0.processCardPayment(reservation37, (double) 0.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation44 = null;
        boolean boolean48 = paymentController0.processPayment(reservation44, 0.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation49 = null;
        boolean boolean53 = paymentController0.processGrantPayment(reservation49, 0.0d, "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean12 = paymentController0.processGrantPayment(reservation8, 0.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation13 = null;
        boolean boolean17 = paymentController0.processGrantPayment(reservation13, 0.0d, "", "");
        java.lang.Class<?> wildcardClass18 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 'a', "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) 0.0f, "hi!", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processPayment(reservation25, (double) (byte) 1, "hi!", "");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean34 = paymentController0.processGrantPayment(reservation30, (double) (-1.0f), "", "hi!");
        model.Reservation.Reservation reservation35 = null;
        boolean boolean41 = paymentController0.processInstitutionalPayment(reservation35, (double) (-1.0f), "", "hi!", "", "hi!");
        model.Reservation.Reservation reservation42 = null;
        boolean boolean46 = paymentController0.processGrantPayment(reservation42, (double) (-1.0f), "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean12 = paymentController0.processGrantPayment(reservation8, 0.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation13 = null;
        boolean boolean17 = paymentController0.processGrantPayment(reservation13, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation18 = null;
        boolean boolean24 = paymentController0.processInstitutionalPayment(reservation18, (double) 1.0f, "hi!", "hi!", "", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processPayment(reservation25, (double) (byte) 0, "", "hi!");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean34 = paymentController0.processGrantPayment(reservation30, (double) 100L, "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, (double) 'a', "", "hi!", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) (byte) 100, "hi!", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) (byte) 100, "", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processPayment(reservation25, (double) (short) -1, "hi!", "hi!");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean36 = paymentController0.processCardPayment(reservation30, (double) 10, "", "", "", "");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean41 = paymentController0.processGrantPayment(reservation37, (double) (short) 10, "hi!", "hi!");
        model.Reservation.Reservation reservation42 = null;
        boolean boolean46 = paymentController0.processGrantPayment(reservation42, (double) 100L, "", "");
        model.Reservation.Reservation reservation47 = null;
        boolean boolean53 = paymentController0.processCardPayment(reservation47, (double) (short) 100, "hi!", "hi!", "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, (double) (byte) 100, "", "", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processInstitutionalPayment(reservation15, (double) 10, "", "hi!", "", "");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean28 = paymentController0.processInstitutionalPayment(reservation22, (double) 10.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation29 = null;
        boolean boolean33 = paymentController0.processPayment(reservation29, (double) '#', "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, 100.0d, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, 0.0d, "hi!", "", "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 'a', "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) 0.0f, "hi!", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processPayment(reservation25, (double) (byte) 1, "hi!", "");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean34 = paymentController0.processGrantPayment(reservation30, (double) (-1.0f), "", "hi!");
        model.Reservation.Reservation reservation35 = null;
        boolean boolean41 = paymentController0.processCardPayment(reservation35, (double) (byte) 10, "hi!", "", "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, (double) (byte) -1, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean28 = paymentController0.processCardPayment(reservation22, (double) (byte) 0, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation29 = null;
        boolean boolean33 = paymentController0.processGrantPayment(reservation29, (double) (byte) 0, "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, (double) (byte) -1, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean28 = paymentController0.processCardPayment(reservation22, (double) (byte) 0, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation29 = null;
        boolean boolean33 = paymentController0.processPayment(reservation29, (double) 0L, "", "hi!");
        model.Reservation.Reservation reservation34 = null;
        boolean boolean38 = paymentController0.processPayment(reservation34, 0.0d, "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) (byte) 10, "hi!", "hi!", "", "");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean33 = paymentController0.processCardPayment(reservation27, (double) '4', "hi!", "hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass34 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, 100.0d, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, (double) 10, "", "", "hi!", "");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processPayment(reservation27, 10.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean38 = paymentController0.processInstitutionalPayment(reservation32, (double) 10L, "hi!", "", "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 'a', "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) 0.0f, "hi!", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processGrantPayment(reservation25, (double) (short) 0, "hi!", "");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean36 = paymentController0.processInstitutionalPayment(reservation30, (-1.0d), "", "", "", "hi!");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean43 = paymentController0.processCardPayment(reservation37, (double) (-1L), "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation44 = null;
        boolean boolean48 = paymentController0.processGrantPayment(reservation44, 100.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation49 = null;
        boolean boolean53 = paymentController0.processGrantPayment(reservation49, (double) '4', "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, 0.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean28 = paymentController0.processInstitutionalPayment(reservation22, (double) 100L, "hi!", "", "", "");
        model.Reservation.Reservation reservation29 = null;
        boolean boolean35 = paymentController0.processCardPayment(reservation29, (double) 10, "hi!", "hi!", "", "hi!");
        model.Reservation.Reservation reservation36 = null;
        boolean boolean42 = paymentController0.processInstitutionalPayment(reservation36, (double) 100L, "", "", "", "");
        model.Reservation.Reservation reservation43 = null;
        boolean boolean49 = paymentController0.processCardPayment(reservation43, (double) (byte) -1, "hi!", "", "", "");
        model.Reservation.Reservation reservation50 = null;
        boolean boolean56 = paymentController0.processCardPayment(reservation50, (double) 10L, "", "", "", "");
        model.Reservation.Reservation reservation57 = null;
        boolean boolean63 = paymentController0.processInstitutionalPayment(reservation57, (double) (short) -1, "", "", "hi!", "");
        model.Reservation.Reservation reservation64 = null;
        boolean boolean70 = paymentController0.processCardPayment(reservation64, (double) (byte) 1, "", "", "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 0.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, 100.0d, "", "", "", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) (short) 1, "hi!", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processPayment(reservation32, (double) (byte) 1, "", "hi!");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean43 = paymentController0.processInstitutionalPayment(reservation37, (double) (-1), "hi!", "hi!", "", "hi!");
        model.Reservation.Reservation reservation44 = null;
        boolean boolean48 = paymentController0.processGrantPayment(reservation44, (-1.0d), "", "");
        model.Reservation.Reservation reservation49 = null;
        boolean boolean55 = paymentController0.processInstitutionalPayment(reservation49, 0.0d, "hi!", "", "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, 1.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) (-1.0f), "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, 0.0d, "", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean38 = paymentController0.processCardPayment(reservation32, (double) 1L, "hi!", "hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass39 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processInstitutionalPayment(reservation15, 1.0d, "hi!", "", "hi!", "hi!");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean26 = paymentController0.processPayment(reservation22, 0.0d, "", "");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, 0.0d, "", "hi!");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processPayment(reservation32, (double) 0L, "hi!", "");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean43 = paymentController0.processCardPayment(reservation37, (double) (byte) -1, "hi!", "hi!", "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, 0.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean28 = paymentController0.processInstitutionalPayment(reservation22, (double) 100L, "hi!", "", "", "");
        model.Reservation.Reservation reservation29 = null;
        boolean boolean35 = paymentController0.processCardPayment(reservation29, (double) 10, "hi!", "hi!", "", "hi!");
        model.Reservation.Reservation reservation36 = null;
        boolean boolean42 = paymentController0.processInstitutionalPayment(reservation36, (double) 100L, "", "", "", "");
        model.Reservation.Reservation reservation43 = null;
        boolean boolean49 = paymentController0.processCardPayment(reservation43, (double) (byte) -1, "hi!", "", "", "");
        model.Reservation.Reservation reservation50 = null;
        boolean boolean56 = paymentController0.processCardPayment(reservation50, (double) 10L, "", "", "", "");
        model.Reservation.Reservation reservation57 = null;
        boolean boolean61 = paymentController0.processPayment(reservation57, (-1.0d), "hi!", "");
        model.Reservation.Reservation reservation62 = null;
        boolean boolean66 = paymentController0.processPayment(reservation62, (double) 1.0f, "hi!", "");
        model.Reservation.Reservation reservation67 = null;
        boolean boolean73 = paymentController0.processInstitutionalPayment(reservation67, (double) (-1), "", "hi!", "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 'a', "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) 0.0f, "hi!", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processGrantPayment(reservation25, (double) (short) 0, "hi!", "");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean36 = paymentController0.processInstitutionalPayment(reservation30, (-1.0d), "", "", "", "hi!");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean41 = paymentController0.processPayment(reservation37, (double) 10, "hi!", "hi!");
        model.Reservation.Reservation reservation42 = null;
        boolean boolean48 = paymentController0.processCardPayment(reservation42, (double) (byte) 100, "", "", "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean12 = paymentController0.processGrantPayment(reservation8, (double) '#', "hi!", "hi!");
        model.Reservation.Reservation reservation13 = null;
        boolean boolean19 = paymentController0.processInstitutionalPayment(reservation13, (double) 'a', "hi!", "", "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 0.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, 100.0d, "", "", "", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) (short) 1, "hi!", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processPayment(reservation32, (double) (byte) 1, "", "hi!");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean43 = paymentController0.processInstitutionalPayment(reservation37, (double) (-1), "hi!", "hi!", "", "hi!");
        model.Reservation.Reservation reservation44 = null;
        boolean boolean48 = paymentController0.processGrantPayment(reservation44, (-1.0d), "", "");
        model.Reservation.Reservation reservation49 = null;
        boolean boolean55 = paymentController0.processInstitutionalPayment(reservation49, (double) 1.0f, "hi!", "", "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, (double) 1.0f, "hi!", "", "hi!", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processPayment(reservation27, (double) 1.0f, "hi!", "hi!");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processGrantPayment(reservation32, 100.0d, "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 'a', "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) 0.0f, "hi!", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processPayment(reservation25, (double) (byte) 1, "hi!", "");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean36 = paymentController0.processInstitutionalPayment(reservation30, (double) 10, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean43 = paymentController0.processInstitutionalPayment(reservation37, (double) 100L, "hi!", "hi!", "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 0.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, 100.0d, "", "", "", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processPayment(reservation27, 0.0d, "hi!", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processPayment(reservation32, (double) 100, "hi!", "hi!");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean43 = paymentController0.processCardPayment(reservation37, (double) (byte) -1, "", "", "", "hi!");
        model.Reservation.Reservation reservation44 = null;
        boolean boolean50 = paymentController0.processCardPayment(reservation44, (-1.0d), "hi!", "", "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, (double) (byte) -1, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean28 = paymentController0.processCardPayment(reservation22, (double) (byte) 0, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation29 = null;
        boolean boolean33 = paymentController0.processPayment(reservation29, (double) 0L, "", "hi!");
        model.Reservation.Reservation reservation34 = null;
        boolean boolean38 = paymentController0.processPayment(reservation34, (double) (byte) 0, "hi!", "");
        model.Reservation.Reservation reservation39 = null;
        boolean boolean43 = paymentController0.processGrantPayment(reservation39, (double) 1L, "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, 0.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean26 = paymentController0.processGrantPayment(reservation22, 0.0d, "hi!", "");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean33 = paymentController0.processInstitutionalPayment(reservation27, (double) 100L, "hi!", "hi!", "hi!", "hi!");
        model.Reservation.Reservation reservation34 = null;
        boolean boolean38 = paymentController0.processPayment(reservation34, (double) 10L, "hi!", "");
        model.Reservation.Reservation reservation39 = null;
        boolean boolean45 = paymentController0.processCardPayment(reservation39, (double) (byte) 1, "hi!", "", "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processGrantPayment(reservation15, (double) (-1.0f), "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, (double) 0L, "", "", "", "");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean33 = paymentController0.processCardPayment(reservation27, (double) 10L, "hi!", "hi!", "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, 0.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean28 = paymentController0.processInstitutionalPayment(reservation22, (double) 100L, "hi!", "", "", "");
        model.Reservation.Reservation reservation29 = null;
        boolean boolean35 = paymentController0.processCardPayment(reservation29, (double) 10, "hi!", "hi!", "", "hi!");
        model.Reservation.Reservation reservation36 = null;
        boolean boolean42 = paymentController0.processInstitutionalPayment(reservation36, (double) 100L, "", "", "", "");
        model.Reservation.Reservation reservation43 = null;
        boolean boolean49 = paymentController0.processCardPayment(reservation43, (double) (byte) -1, "hi!", "", "", "");
        model.Reservation.Reservation reservation50 = null;
        boolean boolean56 = paymentController0.processCardPayment(reservation50, (double) 10L, "", "", "", "");
        model.Reservation.Reservation reservation57 = null;
        boolean boolean63 = paymentController0.processInstitutionalPayment(reservation57, (double) (short) -1, "", "", "hi!", "");
        model.Reservation.Reservation reservation64 = null;
        boolean boolean68 = paymentController0.processPayment(reservation64, 10.0d, "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean12 = paymentController0.processGrantPayment(reservation8, 0.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation13 = null;
        boolean boolean17 = paymentController0.processGrantPayment(reservation13, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation18 = null;
        boolean boolean24 = paymentController0.processInstitutionalPayment(reservation18, (double) 1.0f, "hi!", "hi!", "", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean31 = paymentController0.processCardPayment(reservation25, (double) 100, "hi!", "hi!", "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 0.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, 100.0d, "", "", "", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) (short) 1, "hi!", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processPayment(reservation32, (double) (short) 0, "hi!", "");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean41 = paymentController0.processPayment(reservation37, (double) (short) 100, "hi!", "");
        model.Reservation.Reservation reservation42 = null;
        boolean boolean48 = paymentController0.processInstitutionalPayment(reservation42, (-1.0d), "", "hi!", "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean12 = paymentController0.processGrantPayment(reservation8, 0.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation13 = null;
        boolean boolean17 = paymentController0.processGrantPayment(reservation13, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation18 = null;
        boolean boolean24 = paymentController0.processCardPayment(reservation18, 0.0d, "", "", "", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processPayment(reservation25, (double) (byte) 10, "", "");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean34 = paymentController0.processPayment(reservation30, 0.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation35 = null;
        boolean boolean39 = paymentController0.processPayment(reservation35, (double) 0L, "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 0.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, 100.0d, "", "", "", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) (short) 1, "hi!", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processPayment(reservation32, (double) (byte) 1, "", "hi!");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean43 = paymentController0.processInstitutionalPayment(reservation37, (double) (-1), "hi!", "hi!", "", "hi!");
        model.Reservation.Reservation reservation44 = null;
        boolean boolean48 = paymentController0.processGrantPayment(reservation44, (-1.0d), "", "");
        model.Reservation.Reservation reservation49 = null;
        boolean boolean55 = paymentController0.processCardPayment(reservation49, (double) 0, "hi!", "", "hi!", "hi!");
        model.Reservation.Reservation reservation56 = null;
        boolean boolean62 = paymentController0.processCardPayment(reservation56, 0.0d, "", "", "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, (double) 'a', "", "hi!", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) (byte) 100, "hi!", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processInstitutionalPayment(reservation20, (double) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean33 = paymentController0.processCardPayment(reservation27, (double) 0L, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation34 = null;
        boolean boolean38 = paymentController0.processPayment(reservation34, (double) (-1.0f), "", "hi!");
        java.lang.Class<?> wildcardClass39 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) '#', "", "hi!", "", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, (-1.0d), "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean26 = paymentController0.processGrantPayment(reservation22, (double) '4', "hi!", "");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processPayment(reservation32, (double) '4', "hi!", "hi!");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean41 = paymentController0.processPayment(reservation37, (double) 100L, "hi!", "hi!");
        model.Reservation.Reservation reservation42 = null;
        boolean boolean46 = paymentController0.processGrantPayment(reservation42, (double) (byte) -1, "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean12 = paymentController0.processGrantPayment(reservation8, 0.0d, "hi!", "hi!");
        model.Reservation.Reservation reservation13 = null;
        boolean boolean17 = paymentController0.processGrantPayment(reservation13, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation18 = null;
        boolean boolean22 = paymentController0.processPayment(reservation18, 100.0d, "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, (double) 'a', "", "hi!", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) (byte) 100, "hi!", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) (byte) 1, "", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processGrantPayment(reservation25, (double) (byte) 1, "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, (double) (byte) -1, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean26 = paymentController0.processGrantPayment(reservation22, (double) 'a', "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 'a', "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, (double) (short) 0, "hi!", "", "hi!", "");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean33 = paymentController0.processCardPayment(reservation27, (double) 1.0f, "", "hi!", "hi!", "hi!");
        model.Reservation.Reservation reservation34 = null;
        boolean boolean40 = paymentController0.processInstitutionalPayment(reservation34, (double) (byte) -1, "", "", "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, 100.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, 0.0d, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean28 = paymentController0.processInstitutionalPayment(reservation22, (double) 100L, "hi!", "", "", "");
        model.Reservation.Reservation reservation29 = null;
        boolean boolean35 = paymentController0.processCardPayment(reservation29, (double) 10, "hi!", "hi!", "", "hi!");
        model.Reservation.Reservation reservation36 = null;
        boolean boolean42 = paymentController0.processInstitutionalPayment(reservation36, (double) 100L, "", "", "", "");
        model.Reservation.Reservation reservation43 = null;
        boolean boolean49 = paymentController0.processCardPayment(reservation43, (double) (byte) -1, "hi!", "", "", "");
        java.lang.Class<?> wildcardClass50 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        java.lang.Class<?> wildcardClass8 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, (double) 'a', "", "hi!", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) (byte) 100, "hi!", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, (double) (byte) 0, "", "hi!", "", "");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processPayment(reservation27, (double) 10L, "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 0.0d, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processInstitutionalPayment(reservation15, (double) (byte) 100, "", "", "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 0.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, 100.0d, "", "", "", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processPayment(reservation27, 0.0d, "hi!", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processPayment(reservation32, (double) 100, "hi!", "hi!");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean43 = paymentController0.processCardPayment(reservation37, (double) (byte) -1, "", "", "", "hi!");
        model.Reservation.Reservation reservation44 = null;
        boolean boolean50 = paymentController0.processCardPayment(reservation44, (double) 100L, "hi!", "", "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, (double) 'a', "", "hi!", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) (byte) 100, "hi!", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, (double) 1.0f, "", "hi!", "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processCardPayment(reservation1, (double) (-1), "", "", "", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, (double) 'a', "", "hi!", "hi!", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) (byte) 100, "hi!", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, (double) (byte) 0, "", "hi!", "", "");
        java.lang.Class<?> wildcardClass27 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) '#', "", "hi!", "", "hi!");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, (-1.0d), "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean26 = paymentController0.processGrantPayment(reservation22, (double) '4', "hi!", "");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) 100.0f, "", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processGrantPayment(reservation32, (double) 0.0f, "hi!", "hi!");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean41 = paymentController0.processGrantPayment(reservation37, (double) 'a', "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processInstitutionalPayment(reservation8, (double) (byte) 100, "", "", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processInstitutionalPayment(reservation15, (double) 10, "", "hi!", "", "");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean28 = paymentController0.processInstitutionalPayment(reservation22, (double) 10.0f, "", "hi!", "", "");
        java.lang.Class<?> wildcardClass29 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, 100.0d, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) 0L, "hi!", "hi!");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean31 = paymentController0.processInstitutionalPayment(reservation25, (double) 10.0f, "", "hi!", "hi!", "hi!");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processGrantPayment(reservation32, (double) (-1.0f), "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processInstitutionalPayment(reservation15, 1.0d, "hi!", "", "hi!", "hi!");
        model.Reservation.Reservation reservation22 = null;
        boolean boolean26 = paymentController0.processPayment(reservation22, 0.0d, "", "");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, 0.0d, "", "hi!");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processPayment(reservation32, (double) (-1), "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 0.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, 100.0d, "", "", "", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processPayment(reservation27, 0.0d, "hi!", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processPayment(reservation32, (double) 100, "hi!", "hi!");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean43 = paymentController0.processInstitutionalPayment(reservation37, (double) (-1L), "hi!", "", "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 'a', "", "hi!");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean24 = paymentController0.processGrantPayment(reservation20, (double) 0.0f, "hi!", "");
        model.Reservation.Reservation reservation25 = null;
        boolean boolean29 = paymentController0.processPayment(reservation25, (double) (byte) 1, "hi!", "");
        model.Reservation.Reservation reservation30 = null;
        boolean boolean36 = paymentController0.processInstitutionalPayment(reservation30, (double) 10, "", "", "hi!", "hi!");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean43 = paymentController0.processInstitutionalPayment(reservation37, (double) (byte) 100, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation44 = null;
        boolean boolean48 = paymentController0.processGrantPayment(reservation44, (double) (byte) -1, "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, (double) 0.0f, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, 100.0d, "", "", "", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processGrantPayment(reservation27, (double) (short) 1, "hi!", "");
        model.Reservation.Reservation reservation32 = null;
        boolean boolean36 = paymentController0.processPayment(reservation32, (double) (byte) 1, "hi!", "hi!");
        model.Reservation.Reservation reservation37 = null;
        boolean boolean43 = paymentController0.processCardPayment(reservation37, (double) 0.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation44 = null;
        boolean boolean48 = paymentController0.processPayment(reservation44, 0.0d, "hi!", "hi!");
        java.lang.Class<?> wildcardClass49 = paymentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, (double) 100.0f, "", "hi!", "", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean19 = paymentController0.processPayment(reservation15, 100.0d, "", "");
        model.Reservation.Reservation reservation20 = null;
        boolean boolean26 = paymentController0.processCardPayment(reservation20, (double) 1, "hi!", "", "hi!", "hi!");
        model.Reservation.Reservation reservation27 = null;
        boolean boolean31 = paymentController0.processPayment(reservation27, (double) (byte) 1, "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean5 = paymentController0.processPayment(reservation1, (double) 1L, "hi!", "hi!");
        model.Reservation.Reservation reservation6 = null;
        boolean boolean10 = paymentController0.processGrantPayment(reservation6, (double) (short) -1, "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        controller.PaymentController paymentController0 = controller.PaymentController.getInstance();
        model.Reservation.Reservation reservation1 = null;
        boolean boolean7 = paymentController0.processInstitutionalPayment(reservation1, 1.0d, "", "", "hi!", "");
        model.Reservation.Reservation reservation8 = null;
        boolean boolean14 = paymentController0.processCardPayment(reservation8, 1.0d, "hi!", "hi!", "hi!", "");
        model.Reservation.Reservation reservation15 = null;
        boolean boolean21 = paymentController0.processCardPayment(reservation15, (double) 10, "hi!", "", "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }
}

