package controller;

import model.Reservation.Reservation;
import model.DatabaseManager;
import model.Reservation.ConfirmedState;
import model.User.User;

public class PaymentController {
    
	/**
	 * Singular instance of this controller class
	 */
    private static PaymentController instance;
    
    
    private PaymentController() {}
    
    /**
     * Get the 1 instance of this class
     * @return PaymentController instance
     */
    public static PaymentController getInstance() {
        if (instance == null) {
            instance = new PaymentController();
        }
        return instance;
    }
    
    /**
     * Process payment for the reservation of equipment
     * @param reservation: Reservation of equipment
     * @param amount: Amount to be paid
     * @param paymentMethod: Method chosen
     * @param paymentDetails: Any extra details
     * @return boolean: If worked or not
     */
    public boolean processPayment(Reservation reservation, double amount, 
            String paymentMethod, String paymentDetails) {
        
        try {
            if (paymentDetails == null || paymentDetails.trim().isEmpty()) {
                System.out.println("Invalid payment details");
                return false;
            }
            
            // Simulate payment processing
            boolean paymentSuccess = true;
            
            if (paymentSuccess) {
                reservation.setDepositPaid(true);
                reservation.setDepositAmount(amount);
                reservation.setState(new ConfirmedState());
                
                boolean updated = DatabaseManager.getInstance().updateReservation(reservation);
                
                if (updated) {
                    System.out.println("Deposit payment processed successfully.");
                    return true;
                } else {
                    System.out.println("Failed to update reservation state.");
                    return false;
                }
            }
            return false;
        } catch (Exception e) {
            System.out.println("Payment processing failed: " + e.getMessage());
            return false;
        }
    }
    
    /**
     * Payment by card
     */
    public boolean processCardPayment(Reservation reservation, double amount, 
            String cardNumber, String cardHolder, String expiry, String cvv) {
        String paymentDetails = "Card: " + cardNumber;
        return processPayment(reservation, amount, "Credit/Debit Card", paymentDetails);
    }
    
    /**
     * Payment by Instituion
     */
    public boolean processInstitutionalPayment(Reservation reservation, double amount,
            String accountNumber, String routingNumber, String institution, String department) {
        String paymentDetails = "Institution: " + institution + ", Account: " + accountNumber;
        return processPayment(reservation, amount, "Institutional Account", paymentDetails);
    }
    
    /**
     * Payment by Grant
     */
    public boolean processGrantPayment(Reservation reservation, double amount,
            String grantNumber, String researchProject) {
        String paymentDetails = "Grant: " + grantNumber + ", Project: " + researchProject;
        return processPayment(reservation, amount, "Research Grant", paymentDetails);
    }
}