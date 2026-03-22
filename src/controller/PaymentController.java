package controller;

import model.Reservation.Reservation;
import model.DatabaseManager;
import model.Reservation.ConfirmedState;
import model.User.User;

public class PaymentController {
	
	private static PaymentController instance;
    
    private PaymentController() {
    }
    
    public static PaymentController getInstance() {
        if (instance == null) {
            instance = new PaymentController();
        }
        return instance;
    }
    
    public boolean processPayment(Reservation reservation, double amount, String paymentMethod, 
                                   String paymentDetails) {
        
        try {
            if (paymentDetails == null || paymentDetails.trim().isEmpty()) {
                System.out.println("Invalid payment details");
                return false;
            }
            
            boolean paymentSuccess = true;
            
            if (paymentSuccess) {
                reservation.setState(new ConfirmedState());
                
                boolean updated = DatabaseManager.getInstance().updateReservation(reservation);
                
                if (updated) {
                    System.out.println("Payment processed successfully. Reservation confirmed.");
                    return true;
                } else {
                    System.out.println("Failed to update reservation state in database.");
                    return false;
                }
            }
            
            return false;
        } catch (Exception e) {
            System.out.println("Payment processing failed: " + e.getMessage());
            return false;
        }
    }
    
    // Overloaded method for credit/debit card payments
    public boolean processCardPayment(Reservation reservation, double amount, 
                                      String cardNumber, String cardHolder, 
                                      String expiry, String cvv) {
        String paymentDetails = "Card: " + cardNumber.substring(cardNumber.length() - 4);
        return processPayment(reservation, amount, "Credit/Debit Card", paymentDetails);
    }
    
    // Overloaded method for institutional account payments
    public boolean processInstitutionalPayment(Reservation reservation, double amount,
                                               String accountNumber, String routingNumber,
                                               String institution, String department) {
        String paymentDetails = "Institution: " + institution + ", Account: " + accountNumber;
        return processPayment(reservation, amount, "Institutional Account", paymentDetails);
    }
    
    // Overloaded method for research grant payments
    public boolean processGrantPayment(Reservation reservation, double amount,
                                       String grantNumber, String researchProject) {
        String paymentDetails = "Grant: " + grantNumber + ", Project: " + researchProject;
        return processPayment(reservation, amount, "Research Grant", paymentDetails);
    }
}