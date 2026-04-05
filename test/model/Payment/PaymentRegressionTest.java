package model.Payment;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PaymentRegressionTest {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        model.Payment.PaymentMethod paymentMethod1 = null;
        model.Payment.PaymentStatus paymentStatus2 = null;
        model.Payment.InstitutionalAccountPaymentStrategy institutionalAccountPaymentStrategy3 = null;
        model.Payment.Payment payment4 = new model.Payment.Payment((double) 'a', paymentMethod1, paymentStatus2, institutionalAccountPaymentStrategy3);
        payment4.processPayment();
        java.lang.String str6 = payment4.getPaymentId();
        model.Payment.DebitCardPaymentStrategy debitCardPaymentStrategy7 = null;
        payment4.setDebitStrategy(debitCardPaymentStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1030056435" + "'", str6.equals("-1030056435"));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        model.Payment.PaymentMethod paymentMethod1 = null;
        model.Payment.PaymentStatus paymentStatus2 = null;
        model.Payment.InstitutionalAccountPaymentStrategy institutionalAccountPaymentStrategy3 = null;
        model.Payment.Payment payment4 = new model.Payment.Payment((double) 'a', paymentMethod1, paymentStatus2, institutionalAccountPaymentStrategy3);
        model.Payment.PaymentMethod paymentMethod5 = payment4.getMethod();
        model.Payment.PaymentStatus paymentStatus6 = null;
        payment4.setStatus(paymentStatus6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(paymentMethod5);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        model.Payment.PaymentMethod paymentMethod1 = null;
        model.Payment.PaymentStatus paymentStatus2 = null;
        model.Payment.InstitutionalAccountPaymentStrategy institutionalAccountPaymentStrategy3 = null;
        model.Payment.Payment payment4 = new model.Payment.Payment((double) 'a', paymentMethod1, paymentStatus2, institutionalAccountPaymentStrategy3);
        payment4.processPayment();
        java.lang.String str6 = payment4.getPaymentId();
        model.Payment.ResearchGrantPaymentStrategy researchGrantPaymentStrategy7 = null;
        payment4.setRGPStrategy(researchGrantPaymentStrategy7);
        model.Payment.PaymentMethod paymentMethod9 = payment4.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1320157106" + "'", str6.equals("-1320157106"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(paymentMethod9);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        model.Payment.PaymentMethod paymentMethod1 = null;
        model.Payment.PaymentStatus paymentStatus2 = null;
        model.Payment.InstitutionalAccountPaymentStrategy institutionalAccountPaymentStrategy3 = null;
        model.Payment.Payment payment4 = new model.Payment.Payment((double) 'a', paymentMethod1, paymentStatus2, institutionalAccountPaymentStrategy3);
        model.Payment.DebitCardPaymentStrategy debitCardPaymentStrategy5 = null;
        payment4.setDebitStrategy(debitCardPaymentStrategy5);
        model.Payment.PaymentStatus paymentStatus7 = payment4.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(paymentStatus7);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        model.Payment.PaymentMethod paymentMethod1 = null;
        model.Payment.PaymentStatus paymentStatus2 = null;
        model.Payment.InstitutionalAccountPaymentStrategy institutionalAccountPaymentStrategy3 = null;
        model.Payment.Payment payment4 = new model.Payment.Payment((double) 'a', paymentMethod1, paymentStatus2, institutionalAccountPaymentStrategy3);
        model.Payment.PaymentStatus paymentStatus5 = null;
        payment4.setStatus(paymentStatus5);
        double double7 = payment4.getAmount();
        model.Payment.InstitutionalAccountPaymentStrategy institutionalAccountPaymentStrategy8 = payment4.getIAPStrategy();
        model.Payment.InstitutionalAccountPaymentStrategy institutionalAccountPaymentStrategy9 = payment4.getIAPStrategy();
        model.Payment.ResearchGrantPaymentStrategy researchGrantPaymentStrategy10 = payment4.getRGPStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(institutionalAccountPaymentStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(institutionalAccountPaymentStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(researchGrantPaymentStrategy10);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        model.Payment.PaymentMethod paymentMethod1 = null;
        model.Payment.PaymentStatus paymentStatus2 = null;
        model.Payment.InstitutionalAccountPaymentStrategy institutionalAccountPaymentStrategy3 = null;
        model.Payment.Payment payment4 = new model.Payment.Payment((double) 'a', paymentMethod1, paymentStatus2, institutionalAccountPaymentStrategy3);
        model.Payment.PaymentStatus paymentStatus5 = null;
        payment4.setStatus(paymentStatus5);
        payment4.processPayment();
        model.Payment.PaymentStatus paymentStatus8 = payment4.getStatus();
        model.Payment.ResearchGrantPaymentStrategy researchGrantPaymentStrategy9 = payment4.getRGPStrategy();
        model.Payment.DebitCardPaymentStrategy debitCardPaymentStrategy10 = payment4.getDebitStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(paymentStatus8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(researchGrantPaymentStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(debitCardPaymentStrategy10);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        model.Payment.PaymentMethod paymentMethod1 = null;
        model.Payment.PaymentStatus paymentStatus2 = null;
        model.Payment.InstitutionalAccountPaymentStrategy institutionalAccountPaymentStrategy3 = null;
        model.Payment.Payment payment4 = new model.Payment.Payment((double) 'a', paymentMethod1, paymentStatus2, institutionalAccountPaymentStrategy3);
        payment4.processPayment();
        java.lang.String str6 = payment4.getPaymentId();
        model.Payment.ResearchGrantPaymentStrategy researchGrantPaymentStrategy7 = null;
        payment4.setRGPStrategy(researchGrantPaymentStrategy7);
        model.Payment.CreditCardPaymentStrategy creditCardPaymentStrategy9 = null;
        payment4.setCreditStrategy(creditCardPaymentStrategy9);
        double double11 = payment4.getAmount();
        model.Payment.InstitutionalAccountPaymentStrategy institutionalAccountPaymentStrategy12 = payment4.getIAPStrategy();
        payment4.setAmount(100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1201269696" + "'", str6.equals("-1201269696"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(institutionalAccountPaymentStrategy12);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        model.Payment.PaymentMethod paymentMethod1 = null;
        model.Payment.PaymentStatus paymentStatus2 = null;
        model.Payment.InstitutionalAccountPaymentStrategy institutionalAccountPaymentStrategy3 = null;
        model.Payment.Payment payment4 = new model.Payment.Payment((double) 'a', paymentMethod1, paymentStatus2, institutionalAccountPaymentStrategy3);
        payment4.processPayment();
        java.lang.String str6 = payment4.getPaymentId();
        double double7 = payment4.getAmount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1229356365" + "'", str6.equals("-1229356365"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        model.Payment.PaymentMethod paymentMethod1 = null;
        model.Payment.PaymentStatus paymentStatus2 = null;
        model.Payment.InstitutionalAccountPaymentStrategy institutionalAccountPaymentStrategy3 = null;
        model.Payment.Payment payment4 = new model.Payment.Payment((double) 'a', paymentMethod1, paymentStatus2, institutionalAccountPaymentStrategy3);
        model.Payment.PaymentStatus paymentStatus5 = null;
        payment4.setStatus(paymentStatus5);
        double double7 = payment4.getAmount();
        model.Payment.InstitutionalAccountPaymentStrategy institutionalAccountPaymentStrategy8 = payment4.getIAPStrategy();
        model.Payment.InstitutionalAccountPaymentStrategy institutionalAccountPaymentStrategy9 = payment4.getIAPStrategy();
        payment4.setAmount((double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(institutionalAccountPaymentStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(institutionalAccountPaymentStrategy9);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        model.Payment.PaymentMethod paymentMethod1 = null;
        model.Payment.PaymentStatus paymentStatus2 = null;
        model.Payment.InstitutionalAccountPaymentStrategy institutionalAccountPaymentStrategy3 = null;
        model.Payment.Payment payment4 = new model.Payment.Payment((double) 0L, paymentMethod1, paymentStatus2, institutionalAccountPaymentStrategy3);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        model.Payment.PaymentMethod paymentMethod1 = null;
        model.Payment.PaymentStatus paymentStatus2 = null;
        model.Payment.DebitCardPaymentStrategy debitCardPaymentStrategy3 = null;
        model.Payment.Payment payment4 = new model.Payment.Payment((double) (short) 100, paymentMethod1, paymentStatus2, debitCardPaymentStrategy3);
        model.Payment.InstitutionalAccountPaymentStrategy institutionalAccountPaymentStrategy5 = null;
        payment4.setIAPStrategy(institutionalAccountPaymentStrategy5);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        model.Payment.PaymentMethod paymentMethod1 = null;
        model.Payment.PaymentStatus paymentStatus2 = null;
        model.Payment.InstitutionalAccountPaymentStrategy institutionalAccountPaymentStrategy3 = null;
        model.Payment.Payment payment4 = new model.Payment.Payment((double) 'a', paymentMethod1, paymentStatus2, institutionalAccountPaymentStrategy3);
        payment4.processPayment();
        java.lang.String str6 = payment4.getPaymentId();
        model.Payment.ResearchGrantPaymentStrategy researchGrantPaymentStrategy7 = null;
        payment4.setRGPStrategy(researchGrantPaymentStrategy7);
        model.Payment.CreditCardPaymentStrategy creditCardPaymentStrategy9 = null;
        payment4.setCreditStrategy(creditCardPaymentStrategy9);
        double double11 = payment4.getAmount();
        model.Payment.PaymentMethod paymentMethod12 = payment4.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1154330330" + "'", str6.equals("-1154330330"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(paymentMethod12);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        model.Payment.PaymentMethod paymentMethod1 = null;
        model.Payment.PaymentStatus paymentStatus2 = null;
        model.Payment.InstitutionalAccountPaymentStrategy institutionalAccountPaymentStrategy3 = null;
        model.Payment.Payment payment4 = new model.Payment.Payment((double) 'a', paymentMethod1, paymentStatus2, institutionalAccountPaymentStrategy3);
        model.Payment.PaymentStatus paymentStatus5 = null;
        payment4.setStatus(paymentStatus5);
        payment4.processPayment();
        model.Payment.PaymentStatus paymentStatus8 = payment4.getStatus();
        double double9 = payment4.getAmount();
        model.Payment.CreditCardPaymentStrategy creditCardPaymentStrategy10 = payment4.getCreditStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(paymentStatus8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(creditCardPaymentStrategy10);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        model.Payment.PaymentMethod paymentMethod1 = null;
        model.Payment.PaymentStatus paymentStatus2 = null;
        model.Payment.InstitutionalAccountPaymentStrategy institutionalAccountPaymentStrategy3 = null;
        model.Payment.Payment payment4 = new model.Payment.Payment((double) 'a', paymentMethod1, paymentStatus2, institutionalAccountPaymentStrategy3);
        model.Payment.PaymentStatus paymentStatus5 = null;
        payment4.setStatus(paymentStatus5);
        model.Payment.PaymentStatus paymentStatus7 = payment4.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(paymentStatus7);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        model.Payment.PaymentMethod paymentMethod1 = null;
        model.Payment.PaymentStatus paymentStatus2 = null;
        model.Payment.CreditCardPaymentStrategy creditCardPaymentStrategy3 = null;
        model.Payment.Payment payment4 = new model.Payment.Payment((double) (byte) 100, paymentMethod1, paymentStatus2, creditCardPaymentStrategy3);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        model.Payment.PaymentMethod paymentMethod1 = null;
        model.Payment.PaymentStatus paymentStatus2 = null;
        model.Payment.CreditCardPaymentStrategy creditCardPaymentStrategy3 = null;
        model.Payment.Payment payment4 = new model.Payment.Payment((double) 100L, paymentMethod1, paymentStatus2, creditCardPaymentStrategy3);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        model.Payment.PaymentMethod paymentMethod1 = null;
        model.Payment.PaymentStatus paymentStatus2 = null;
        model.Payment.CreditCardPaymentStrategy creditCardPaymentStrategy3 = null;
        model.Payment.Payment payment4 = new model.Payment.Payment((double) 1L, paymentMethod1, paymentStatus2, creditCardPaymentStrategy3);
        model.Payment.CreditCardPaymentStrategy creditCardPaymentStrategy5 = payment4.getCreditStrategy();
        model.Payment.DebitCardPaymentStrategy debitCardPaymentStrategy6 = null;
        payment4.setDebitStrategy(debitCardPaymentStrategy6);
        model.Payment.ResearchGrantPaymentStrategy researchGrantPaymentStrategy8 = payment4.getRGPStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(creditCardPaymentStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(researchGrantPaymentStrategy8);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        model.Payment.PaymentMethod paymentMethod1 = null;
        model.Payment.PaymentStatus paymentStatus2 = null;
        model.Payment.InstitutionalAccountPaymentStrategy institutionalAccountPaymentStrategy3 = null;
        model.Payment.Payment payment4 = new model.Payment.Payment((double) 'a', paymentMethod1, paymentStatus2, institutionalAccountPaymentStrategy3);
        payment4.processPayment();
        java.lang.String str6 = payment4.getPaymentId();
        java.lang.String str7 = payment4.getPaymentId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1106236717" + "'", str6.equals("-1106236717"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-1106236717" + "'", str7.equals("-1106236717"));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        model.Payment.PaymentMethod paymentMethod1 = null;
        model.Payment.PaymentStatus paymentStatus2 = null;
        model.Payment.ResearchGrantPaymentStrategy researchGrantPaymentStrategy3 = null;
        model.Payment.Payment payment4 = new model.Payment.Payment((-1.0d), paymentMethod1, paymentStatus2, researchGrantPaymentStrategy3);
        model.Payment.CreditCardPaymentStrategy creditCardPaymentStrategy5 = null;
        payment4.setCreditStrategy(creditCardPaymentStrategy5);
        model.Payment.DebitCardPaymentStrategy debitCardPaymentStrategy7 = null;
        payment4.setDebitStrategy(debitCardPaymentStrategy7);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        model.Payment.PaymentMethod paymentMethod1 = null;
        model.Payment.PaymentStatus paymentStatus2 = null;
        model.Payment.InstitutionalAccountPaymentStrategy institutionalAccountPaymentStrategy3 = null;
        model.Payment.Payment payment4 = new model.Payment.Payment((double) 'a', paymentMethod1, paymentStatus2, institutionalAccountPaymentStrategy3);
        model.Payment.PaymentStatus paymentStatus5 = null;
        payment4.setStatus(paymentStatus5);
        double double7 = payment4.getAmount();
        payment4.setAmount((double) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        model.Payment.PaymentMethod paymentMethod1 = null;
        model.Payment.PaymentStatus paymentStatus2 = null;
        model.Payment.InstitutionalAccountPaymentStrategy institutionalAccountPaymentStrategy3 = null;
        model.Payment.Payment payment4 = new model.Payment.Payment((double) 'a', paymentMethod1, paymentStatus2, institutionalAccountPaymentStrategy3);
        model.Payment.PaymentStatus paymentStatus5 = null;
        payment4.setStatus(paymentStatus5);
        payment4.processPayment();
        model.Payment.PaymentStatus paymentStatus8 = payment4.getStatus();
        model.Payment.PaymentMethod paymentMethod9 = payment4.getMethod();
        model.Payment.PaymentStatus paymentStatus10 = null;
        payment4.setStatus(paymentStatus10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(paymentStatus8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(paymentMethod9);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        model.Payment.PaymentMethod paymentMethod1 = null;
        model.Payment.PaymentStatus paymentStatus2 = null;
        model.Payment.InstitutionalAccountPaymentStrategy institutionalAccountPaymentStrategy3 = null;
        model.Payment.Payment payment4 = new model.Payment.Payment((double) 'a', paymentMethod1, paymentStatus2, institutionalAccountPaymentStrategy3);
        model.Payment.PaymentStatus paymentStatus5 = null;
        payment4.setStatus(paymentStatus5);
        payment4.processPayment();
        model.Payment.PaymentStatus paymentStatus8 = payment4.getStatus();
        payment4.processPayment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(paymentStatus8);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        model.Payment.PaymentMethod paymentMethod1 = null;
        model.Payment.PaymentStatus paymentStatus2 = null;
        model.Payment.InstitutionalAccountPaymentStrategy institutionalAccountPaymentStrategy3 = null;
        model.Payment.Payment payment4 = new model.Payment.Payment((double) 'a', paymentMethod1, paymentStatus2, institutionalAccountPaymentStrategy3);
        model.Payment.PaymentStatus paymentStatus5 = null;
        payment4.setStatus(paymentStatus5);
        double double7 = payment4.getAmount();
        model.Payment.InstitutionalAccountPaymentStrategy institutionalAccountPaymentStrategy8 = null;
        payment4.setIAPStrategy(institutionalAccountPaymentStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        model.Payment.PaymentMethod paymentMethod1 = null;
        model.Payment.PaymentStatus paymentStatus2 = null;
        model.Payment.InstitutionalAccountPaymentStrategy institutionalAccountPaymentStrategy3 = null;
        model.Payment.Payment payment4 = new model.Payment.Payment(0.0d, paymentMethod1, paymentStatus2, institutionalAccountPaymentStrategy3);
        java.lang.String str5 = payment4.getPaymentId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1129321651" + "'", str5.equals("-1129321651"));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        model.Payment.PaymentMethod paymentMethod1 = null;
        model.Payment.PaymentStatus paymentStatus2 = null;
        model.Payment.InstitutionalAccountPaymentStrategy institutionalAccountPaymentStrategy3 = null;
        model.Payment.Payment payment4 = new model.Payment.Payment((double) 'a', paymentMethod1, paymentStatus2, institutionalAccountPaymentStrategy3);
        model.Payment.PaymentStatus paymentStatus5 = null;
        payment4.setStatus(paymentStatus5);
        payment4.processPayment();
        model.Payment.PaymentStatus paymentStatus8 = payment4.getStatus();
        payment4.setAmount((double) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(paymentStatus8);
    }
}

