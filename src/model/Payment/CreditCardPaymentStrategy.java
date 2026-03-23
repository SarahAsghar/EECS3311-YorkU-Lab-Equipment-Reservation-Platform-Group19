public class CreditCardPaymentStrategy implements PaymentStrategy {

    @Override
    public boolean processPayment(double amount) {
        if (amount <= 0) {
            return false;
        }
        System.out.println("credit card payment processing = " + amount);
        return true;
    }

    @Override
    public String getPaymentType() {
        return "Credit Card";
    }
}
