package model.Payment;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PaymentFactoryRegressionTest {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        model.Payment.PaymentFactory paymentFactory0 = new model.Payment.PaymentFactory();
        java.lang.Class<?> wildcardClass1 = paymentFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        model.Payment.PaymentFactory paymentFactory0 = new model.Payment.PaymentFactory();
        model.Payment.PaymentMethod paymentMethod1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Payment.Payment payment2 = paymentFactory0.createPayment(paymentMethod1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid Payment Method");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

