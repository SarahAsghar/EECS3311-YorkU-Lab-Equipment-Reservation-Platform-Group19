import model.Payment.CreditCardPaymentStrategy;
import model.Payment.DebitCardPaymentStrategy;
import model.Payment.InstitutionalAccountPaymentStrategy;
import model.Payment.Payment;
import model.Payment.PaymentMethod;
import model.Payment.PaymentStatus;
import model.Payment.ResearchGrantPaymentStrategy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentTest {

    @Test
    void creditCardConstructorStoresAmount() {
        Payment payment = new Payment(
                100.0,
                PaymentMethod.CREDIT_CARD,
                PaymentStatus.PENDING,
                new CreditCardPaymentStrategy()
        );

        assertEquals(100.0, payment.getAmount());
    }

    @Test
    void creditCardConstructorStoresMethod() {
        Payment payment = new Payment(
                100.0,
                PaymentMethod.CREDIT_CARD,
                PaymentStatus.PENDING,
                new CreditCardPaymentStrategy()
        );

        assertEquals(PaymentMethod.CREDIT_CARD, payment.getMethod());
    }

    @Test
    void creditCardConstructorStoresStatus() {
        Payment payment = new Payment(
                100.0,
                PaymentMethod.CREDIT_CARD,
                PaymentStatus.PENDING,
                new CreditCardPaymentStrategy()
        );

        assertEquals(PaymentStatus.PENDING, payment.getStatus());
    }

    @Test
    void creditCardConstructorCreatesPaymentId() {
        Payment payment = new Payment(
                100.0,
                PaymentMethod.CREDIT_CARD,
                PaymentStatus.PENDING,
                new CreditCardPaymentStrategy()
        );

        assertNotNull(payment.getPaymentId());
    }

    @Test
    void debitCardConstructorStoresAmount() {
        Payment payment = new Payment(
                55.5,
                PaymentMethod.DEBIT_CARD,
                PaymentStatus.PAID,
                new DebitCardPaymentStrategy()
        );

        assertEquals(55.5, payment.getAmount());
    }

    @Test
    void debitCardConstructorStoresMethod() {
        Payment payment = new Payment(
                55.5,
                PaymentMethod.DEBIT_CARD,
                PaymentStatus.PAID,
                new DebitCardPaymentStrategy()
        );

        assertEquals(PaymentMethod.DEBIT_CARD, payment.getMethod());
    }

    @Test
    void debitCardConstructorStoresStatus() {
        Payment payment = new Payment(
                55.5,
                PaymentMethod.DEBIT_CARD,
                PaymentStatus.PAID,
                new DebitCardPaymentStrategy()
        );

        assertEquals(PaymentStatus.PAID, payment.getStatus());
    }

    @Test
    void institutionalConstructorStoresAmount() {
        Payment payment = new Payment(
                200.0,
                PaymentMethod.INSTITUTIONAL_ACCOUNT,
                PaymentStatus.FAILED,
                new InstitutionalAccountPaymentStrategy()
        );

        assertEquals(200.0, payment.getAmount());
    }

    @Test
    void institutionalConstructorStoresMethod() {
        Payment payment = new Payment(
                200.0,
                PaymentMethod.INSTITUTIONAL_ACCOUNT,
                PaymentStatus.FAILED,
                new InstitutionalAccountPaymentStrategy()
        );

        assertEquals(PaymentMethod.INSTITUTIONAL_ACCOUNT, payment.getMethod());
    }

    @Test
    void institutionalConstructorStoresStatus() {
        Payment payment = new Payment(
                200.0,
                PaymentMethod.INSTITUTIONAL_ACCOUNT,
                PaymentStatus.FAILED,
                new InstitutionalAccountPaymentStrategy()
        );

        assertEquals(PaymentStatus.FAILED, payment.getStatus());
    }

    @Test
    void researchGrantConstructorStoresAmount() {
        Payment payment = new Payment(
                75.0,
                PaymentMethod.RESEARCH_GRANT,
                PaymentStatus.REFUNDED,
                new ResearchGrantPaymentStrategy()
        );

        assertEquals(75.0, payment.getAmount());
    }

    @Test
    void researchGrantConstructorStoresMethod() {
        Payment payment = new Payment(
                75.0,
                PaymentMethod.RESEARCH_GRANT,
                PaymentStatus.REFUNDED,
                new ResearchGrantPaymentStrategy()
        );

        assertEquals(PaymentMethod.RESEARCH_GRANT, payment.getMethod());
    }

    @Test
    void researchGrantConstructorStoresStatus() {
        Payment payment = new Payment(
                75.0,
                PaymentMethod.RESEARCH_GRANT,
                PaymentStatus.REFUNDED,
                new ResearchGrantPaymentStrategy()
        );

        assertEquals(PaymentStatus.REFUNDED, payment.getStatus());
    }

    @Test
    void setAmountUpdatesAmount() {
        Payment payment = new Payment(
                10.0,
                PaymentMethod.CREDIT_CARD,
                PaymentStatus.PENDING,
                new CreditCardPaymentStrategy()
        );

        payment.setAmount(999.99);

        assertEquals(999.99, payment.getAmount());
    }

    @Test
    void setAmountAllowsZero() {
        Payment payment = new Payment(
                10.0,
                PaymentMethod.CREDIT_CARD,
                PaymentStatus.PENDING,
                new CreditCardPaymentStrategy()
        );

        payment.setAmount(0.0);

        assertEquals(0.0, payment.getAmount());
    }

    @Test
    void setAmountAllowsNegativeValuesBecauseClassDoesNotValidate() {
        Payment payment = new Payment(
                10.0,
                PaymentMethod.CREDIT_CARD,
                PaymentStatus.PENDING,
                new CreditCardPaymentStrategy()
        );

        payment.setAmount(-50.0);

        assertEquals(-50.0, payment.getAmount());
    }

    @Test
    void setStatusUpdatesStatusToPaid() {
        Payment payment = new Payment(
                10.0,
                PaymentMethod.CREDIT_CARD,
                PaymentStatus.PENDING,
                new CreditCardPaymentStrategy()
        );

        payment.setStatus(PaymentStatus.PAID);

        assertEquals(PaymentStatus.PAID, payment.getStatus());
    }

    @Test
    void setStatusUpdatesStatusToForfeited() {
        Payment payment = new Payment(
                10.0,
                PaymentMethod.CREDIT_CARD,
                PaymentStatus.PENDING,
                new CreditCardPaymentStrategy()
        );

        payment.setStatus(PaymentStatus.FORFEITED);

        assertEquals(PaymentStatus.FORFEITED, payment.getStatus());
    }

    @Test
    void setStatusAllowsNullBecauseClassDoesNotValidate() {
        Payment payment = new Payment(
                10.0,
                PaymentMethod.CREDIT_CARD,
                PaymentStatus.PENDING,
                new CreditCardPaymentStrategy()
        );

        payment.setStatus(null);

        assertNull(payment.getStatus());
    }

    @Test
    void paymentIdIsUsuallyNotEmpty() {
        Payment payment = new Payment(
                12.0,
                PaymentMethod.DEBIT_CARD,
                PaymentStatus.PENDING,
                new DebitCardPaymentStrategy()
        );

        assertNotNull(payment.getPaymentId());
        assertFalse(payment.getPaymentId().isEmpty());
    }

    @Test
    void processPaymentDoesNotChangeAmount() {
        Payment payment = new Payment(
                88.0,
                PaymentMethod.CREDIT_CARD,
                PaymentStatus.PENDING,
                new CreditCardPaymentStrategy()
        );

        payment.processPayment();

        assertEquals(88.0, payment.getAmount());
    }

    @Test
    void processPaymentDoesNotChangeMethod() {
        Payment payment = new Payment(
                88.0,
                PaymentMethod.CREDIT_CARD,
                PaymentStatus.PENDING,
                new CreditCardPaymentStrategy()
        );

        payment.processPayment();

        assertEquals(PaymentMethod.CREDIT_CARD, payment.getMethod());
    }

    @Test
    void processPaymentDoesNotChangeStatusBecauseMethodIsEmpty() {
        Payment payment = new Payment(
                88.0,
                PaymentMethod.CREDIT_CARD,
                PaymentStatus.PENDING,
                new CreditCardPaymentStrategy()
        );

        payment.processPayment();

        assertEquals(PaymentStatus.PENDING, payment.getStatus());
    }

    @Test
    void differentConstructorsCanProduceDifferentMethods() {
        Payment credit = new Payment(
                10.0,
                PaymentMethod.CREDIT_CARD,
                PaymentStatus.PENDING,
                new CreditCardPaymentStrategy()
        );

        Payment debit = new Payment(
                10.0,
                PaymentMethod.DEBIT_CARD,
                PaymentStatus.PENDING,
                new DebitCardPaymentStrategy()
        );

        assertNotEquals(credit.getMethod(), debit.getMethod());
    }
}