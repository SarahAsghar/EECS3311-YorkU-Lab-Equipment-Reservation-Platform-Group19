package model.Payment;

public class DebitCardPaymentStrategy implements PaymentStrategy {

    @Override
    public boolean processPayment(double amount) {
        if (amount <= 0) {
            return false;
        }
        System.out.println("debit card payment processing = " + amount);
        return true;
    }

    @Override
    public String getPaymentType() {
        return "Debit Card";
    }
}
