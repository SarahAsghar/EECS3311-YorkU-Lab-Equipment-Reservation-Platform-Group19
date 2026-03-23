package model.Payment;

public class ResearchGrantPaymentStrategy implements PaymentStrategy {

    @Override
    public boolean processPayment(double amount) {
        if (amount <= 0) {
            return false;
        }
        System.out.println("Research grant processing:" + amount);
        return true;
    }

    @Override
    public String getPaymentType() {
        return "Research Grant";
    }
}
