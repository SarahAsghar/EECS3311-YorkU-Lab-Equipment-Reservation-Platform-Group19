package model.Payment;

public class InstitutionalAccountPaymentStrategy implements PaymentStrategy {

    @Override
    public boolean processPayment(double amount) {
        if (amount <= 0) {
            return false;
        }
        System.out.println("institutional payment processing" + amount);
        return true;
    }

    @Override
    public String getPaymentType() {
        return "Institutional Account";
    }
}
