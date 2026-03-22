package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.format.DateTimeFormatter;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import controller.PaymentController;
import controller.ReservationController;
import model.Reservation.Reservation;
import model.User.User;
import model.User.UserType;
import controller.UserController;

public class PaymentView {
    private JPanel PaymentViewPanel;
    private JFrame frame = LoginView.getFrame();
    private ReservationView backView;
    private Reservation reservation;
    private double totalAmount;
    
    // Payment method specific fields
    private JTextField cardNumberField;
    private JTextField cardHolderField;
    private JTextField expiryField;
    private JTextField cvvField;
    private JTextField accountNumberField;
    private JTextField routingNumberField;
    private JTextField institutionField;
    private JTextField departmentField;
    private JTextField grantNumberField;
    private JTextField researchProjectField;
    
    private String selectedPaymentMethod = "Credit Card";

    public PaymentView(ReservationView backView, Reservation reservation) {
        this.backView = backView;
        this.reservation = reservation;
        
        // Calculate total amount
        User loggedInUser = UserController.getLoggedInUser();
        double hourlyFee = loggedInUser.getUserType().getHourlyFee();
        double hours = reservation.calculateHours();
        totalAmount = hourlyFee * hours;
        
        PaymentViewPanel = new JPanel();
        PaymentViewPanel.setBounds(0, 0, 800, 600);
        PaymentViewPanel.setLayout(null);
        frame.getContentPane().add(PaymentViewPanel);
        
        // Main panel
        JPanel mainPanel = new JPanel();
        mainPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
        mainPanel.setBackground(new Color(255, 255, 255));
        mainPanel.setBounds(100, 50, 600, 500);
        mainPanel.setLayout(null);
        PaymentViewPanel.add(mainPanel);
        
        // Reservation Details Section
        JPanel reservationPanel = new JPanel();
        reservationPanel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "RESERVATION DETAILS", 
                TitledBorder.LEFT, TitledBorder.TOP, new Font("Times New Roman", Font.BOLD, 14)));
        reservationPanel.setBackground(new Color(255, 255, 255));
        reservationPanel.setBounds(20, 20, 560, 180);
        reservationPanel.setLayout(null);
        mainPanel.add(reservationPanel);
        
        // Reservation details - Left side labels
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        emailLabel.setBounds(20, 30, 100, 25);
        reservationPanel.add(emailLabel);
        
        JLabel equipmentLabel = new JLabel("Equipment ID:");
        equipmentLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        equipmentLabel.setBounds(20, 60, 100, 25);
        reservationPanel.add(equipmentLabel);
        
        JLabel startTimeLabel = new JLabel("Start Time:");
        startTimeLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        startTimeLabel.setBounds(20, 90, 100, 25);
        reservationPanel.add(startTimeLabel);
        
        JLabel endTimeLabel = new JLabel("End Time:");
        endTimeLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        endTimeLabel.setBounds(20, 120, 100, 25);
        reservationPanel.add(endTimeLabel);
        
        JLabel hoursLabel = new JLabel("Number of Hours:");
        hoursLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        hoursLabel.setBounds(20, 150, 123, 25);
        reservationPanel.add(hoursLabel);
        
        // Reservation details - Right side values
        JLabel emailValue = new JLabel(UserController.getLoggedInUser().getEmail());
        emailValue.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        emailValue.setBounds(130, 30, 400, 25);
        reservationPanel.add(emailValue);
        
        JLabel equipmentValue = new JLabel(reservation.getEquipmentID());
        equipmentValue.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        equipmentValue.setBounds(130, 60, 400, 25);
        reservationPanel.add(equipmentValue);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        JLabel startTimeValue = new JLabel(reservation.getStartTime().format(formatter));
        startTimeValue.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        startTimeValue.setBounds(130, 90, 400, 25);
        reservationPanel.add(startTimeValue);
        
        JLabel endTimeValue = new JLabel(reservation.getEndTime().format(formatter));
        endTimeValue.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        endTimeValue.setBounds(130, 120, 400, 25);
        reservationPanel.add(endTimeValue);
        
        JLabel hoursValue = new JLabel(String.format("%.2f", reservation.calculateHours()));
        hoursValue.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        hoursValue.setBounds(154, 150, 400, 25);
        reservationPanel.add(hoursValue);
        
        // Total Amount Section
        JLabel totalLabel = new JLabel("Total:");
        totalLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
        totalLabel.setBounds(20, 210, 100, 30);
        mainPanel.add(totalLabel);
        
        JLabel totalValue = new JLabel(String.format("$%.2f (%.2f hours x $%.2f/hour)", 
                totalAmount, reservation.calculateHours(), 
                UserController.getLoggedInUser().getUserType().getHourlyFee()));
        totalValue.setFont(new Font("Times New Roman", Font.BOLD, 16));
        totalValue.setForeground(new Color(0, 100, 0));
        totalValue.setBounds(130, 210, 400, 30);
        mainPanel.add(totalValue);
        
        // Payment Method Section
        JPanel paymentMethodPanel = new JPanel();
        paymentMethodPanel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "PAYMENT METHOD", 
                TitledBorder.LEFT, TitledBorder.TOP, new Font("Times New Roman", Font.BOLD, 14)));
        paymentMethodPanel.setBackground(new Color(255, 255, 255));
        paymentMethodPanel.setBounds(20, 250, 560, 180);
        paymentMethodPanel.setLayout(null);
        mainPanel.add(paymentMethodPanel);
        
        // Radio buttons for payment methods
        ButtonGroup paymentGroup = new ButtonGroup();
        
        JRadioButton creditRadio = new JRadioButton("Credit Card");
        creditRadio.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        creditRadio.setBounds(20, 30, 120, 25);
        creditRadio.setBackground(Color.WHITE);
        paymentGroup.add(creditRadio);
        paymentMethodPanel.add(creditRadio);
        
        JRadioButton debitRadio = new JRadioButton("Debit Card");
        debitRadio.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        debitRadio.setBounds(150, 30, 100, 25);
        debitRadio.setBackground(Color.WHITE);
        paymentGroup.add(debitRadio);
        paymentMethodPanel.add(debitRadio);
        
        JRadioButton institutionalRadio = new JRadioButton("Institutional Account");
        institutionalRadio.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        institutionalRadio.setBounds(260, 30, 140, 25);
        institutionalRadio.setBackground(Color.WHITE);
        paymentGroup.add(institutionalRadio);
        paymentMethodPanel.add(institutionalRadio);
        
        JRadioButton grantRadio = new JRadioButton("Research Grant");
        grantRadio.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        grantRadio.setBounds(410, 30, 120, 25);
        grantRadio.setBackground(Color.WHITE);
        paymentGroup.add(grantRadio);
        paymentMethodPanel.add(grantRadio);
        
        // Create a panel for dynamic fields
        JPanel dynamicFieldsPanel = new JPanel();
        dynamicFieldsPanel.setBounds(20, 65, 520, 100);
        dynamicFieldsPanel.setLayout(null);
        dynamicFieldsPanel.setBackground(Color.WHITE);
        paymentMethodPanel.add(dynamicFieldsPanel);
        
        // Credit/Debit Card Fields
        cardNumberField = new JTextField();
        cardNumberField.setBounds(10, 10, 150, 25);
        cardNumberField.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        
        cardHolderField = new JTextField();
        cardHolderField.setBounds(170, 10, 150, 25);
        cardHolderField.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        
        expiryField = new JTextField();
        expiryField.setBounds(330, 10, 80, 25);
        expiryField.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        
        cvvField = new JTextField();
        cvvField.setBounds(420, 10, 80, 25);
        cvvField.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        
        // Institutional Account Fields
        accountNumberField = new JTextField();
        accountNumberField.setBounds(10, 10, 200, 25);
        accountNumberField.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        
        routingNumberField = new JTextField();
        routingNumberField.setBounds(220, 10, 150, 25);
        routingNumberField.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        
        institutionField = new JTextField();
        institutionField.setBounds(380, 10, 120, 25);
        institutionField.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        
        departmentField = new JTextField();
        departmentField.setBounds(10, 45, 250, 25);
        departmentField.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        
        // Research Grant Fields
        grantNumberField = new JTextField();
        grantNumberField.setBounds(10, 10, 200, 25);
        grantNumberField.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        
        researchProjectField = new JTextField();
        researchProjectField.setBounds(220, 10, 280, 25);
        researchProjectField.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        
        // Add labels for each field
        JLabel cardNumberLabel = new JLabel("Card Number:");
        cardNumberLabel.setBounds(10, -5, 100, 20);
        cardNumberLabel.setFont(new Font("Times New Roman", Font.PLAIN, 10));
        
        JLabel cardHolderLabel = new JLabel("Card Holder:");
        cardHolderLabel.setBounds(170, -5, 100, 20);
        cardHolderLabel.setFont(new Font("Times New Roman", Font.PLAIN, 10));
        
        JLabel expiryLabel = new JLabel("Expiry (MM/YY):");
        expiryLabel.setBounds(330, -5, 80, 20);
        expiryLabel.setFont(new Font("Times New Roman", Font.PLAIN, 10));
        
        JLabel cvvLabel = new JLabel("CVV:");
        cvvLabel.setBounds(420, -5, 50, 20);
        cvvLabel.setFont(new Font("Times New Roman", Font.PLAIN, 10));
        
        JLabel accountLabel = new JLabel("Account Number:");
        accountLabel.setBounds(10, -5, 100, 20);
        accountLabel.setFont(new Font("Times New Roman", Font.PLAIN, 10));
        
        JLabel routingLabel = new JLabel("Routing Number:");
        routingLabel.setBounds(220, -5, 100, 20);
        routingLabel.setFont(new Font("Times New Roman", Font.PLAIN, 10));
        
        JLabel institutionLabel = new JLabel("Institution:");
        institutionLabel.setBounds(380, -5, 80, 20);
        institutionLabel.setFont(new Font("Times New Roman", Font.PLAIN, 10));
        
        JLabel departmentLabel = new JLabel("Department:");
        departmentLabel.setBounds(10, 30, 100, 20);
        departmentLabel.setFont(new Font("Times New Roman", Font.PLAIN, 10));
        
        JLabel grantLabel = new JLabel("Grant Number:");
        grantLabel.setBounds(10, -5, 100, 20);
        grantLabel.setFont(new Font("Times New Roman", Font.PLAIN, 10));
        
        JLabel projectLabel = new JLabel("Research Project:");
        projectLabel.setBounds(220, -5, 120, 20);
        projectLabel.setFont(new Font("Times New Roman", Font.PLAIN, 10));
        
        // Action listeners for radio buttons
        creditRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedPaymentMethod = "Credit Card";
                dynamicFieldsPanel.removeAll();
                dynamicFieldsPanel.add(cardNumberField);
                dynamicFieldsPanel.add(cardHolderField);
                dynamicFieldsPanel.add(expiryField);
                dynamicFieldsPanel.add(cvvField);
                dynamicFieldsPanel.add(cardNumberLabel);
                dynamicFieldsPanel.add(cardHolderLabel);
                dynamicFieldsPanel.add(expiryLabel);
                dynamicFieldsPanel.add(cvvLabel);
                dynamicFieldsPanel.revalidate();
                dynamicFieldsPanel.repaint();
            }
        });
        
        debitRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedPaymentMethod = "Debit Card";
                dynamicFieldsPanel.removeAll();
                dynamicFieldsPanel.add(cardNumberField);
                dynamicFieldsPanel.add(cardHolderField);
                dynamicFieldsPanel.add(expiryField);
                dynamicFieldsPanel.add(cvvField);
                dynamicFieldsPanel.add(cardNumberLabel);
                dynamicFieldsPanel.add(cardHolderLabel);
                dynamicFieldsPanel.add(expiryLabel);
                dynamicFieldsPanel.add(cvvLabel);
                dynamicFieldsPanel.revalidate();
                dynamicFieldsPanel.repaint();
            }
        });
        
        institutionalRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedPaymentMethod = "Institutional Account";
                dynamicFieldsPanel.removeAll();
                dynamicFieldsPanel.add(accountNumberField);
                dynamicFieldsPanel.add(routingNumberField);
                dynamicFieldsPanel.add(institutionField);
                dynamicFieldsPanel.add(departmentField);
                dynamicFieldsPanel.add(accountLabel);
                dynamicFieldsPanel.add(routingLabel);
                dynamicFieldsPanel.add(institutionLabel);
                dynamicFieldsPanel.add(departmentLabel);
                dynamicFieldsPanel.revalidate();
                dynamicFieldsPanel.repaint();
            }
        });
        
        grantRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedPaymentMethod = "Research Grant";
                dynamicFieldsPanel.removeAll();
                dynamicFieldsPanel.add(grantNumberField);
                dynamicFieldsPanel.add(researchProjectField);
                dynamicFieldsPanel.add(grantLabel);
                dynamicFieldsPanel.add(projectLabel);
                dynamicFieldsPanel.revalidate();
                dynamicFieldsPanel.repaint();
            }
        });
        
        creditRadio.setSelected(true);
        creditRadio.doClick();
        
        JButton confirmBtn = new JButton("Confirm Reservation");
        confirmBtn.setFont(new Font("Times New Roman", Font.BOLD, 16));
        confirmBtn.setBounds(200, 440, 200, 40);
        confirmBtn.setBackground(new Color(255, 255, 255));
        confirmBtn.setForeground(new Color(0, 0, 0));
        confirmBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Validate payment method fields
                if (!validatePaymentFields(paymentGroup, dynamicFieldsPanel)) {
                    return;
                }
                
                int confirm = JOptionPane.showConfirmDialog(PaymentViewPanel,
                    "Are you sure you want to confirm this reservation?\n\n" +
                    "Payment Method: " + selectedPaymentMethod + "\n" +
                    "Total Amount: " + String.format("$%.2f", totalAmount) + "\n" +
                    "This action cannot be undone!",
                    "Confirm Reservation",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
                
                if (confirm == JOptionPane.YES_OPTION) {
                    // Process payment through PaymentController
                    boolean paymentSuccess = processPayment();
                    
                    if (paymentSuccess) {
                        JOptionPane.showMessageDialog(PaymentViewPanel,
                            "Payment Successful!\n\n" +
                            "Reservation ID: " + reservation.getReservationId() + "\n" +
                            "Total Paid: " + String.format("$%.2f", totalAmount) + "\n\n" +
                            "Your reservation has been confirmed.",
                            "Success",
                            JOptionPane.INFORMATION_MESSAGE);
                        
                        // Go back to the previous view
                        setPaymentViewVisibility(false);
                        backView.setReservationViewVisibility(true);
                    } else {
                        JOptionPane.showMessageDialog(PaymentViewPanel,
                            "Payment failed. Please check your payment information and try again.",
                            "Payment Failed",
                            JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        mainPanel.add(confirmBtn);
        
        JButton cancelBtn = new JButton("Cancel");
        cancelBtn.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        cancelBtn.setBounds(450, 440, 100, 40);
        cancelBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setPaymentViewVisibility(false);
                backView.setReservationViewVisibility(true);
            }
        });
        mainPanel.add(cancelBtn);
        
        PaymentViewPanel.repaint();
        PaymentViewPanel.revalidate();
    }
    
    private boolean processPayment() {
        PaymentController paymentController = PaymentController.getInstance();
        
        switch (selectedPaymentMethod) {
            case "Credit Card":
                String cardNumber = cardNumberField.getText().trim();
                String cardHolder = cardHolderField.getText().trim();
                String expiry = expiryField.getText().trim();
                String cvv = cvvField.getText().trim();
                
                if (cardNumber.isEmpty() || cardHolder.isEmpty() || expiry.isEmpty() || cvv.isEmpty()) {
                    JOptionPane.showMessageDialog(PaymentViewPanel,
                        "Please fill in all credit card information.",
                        "Validation Error",
                        JOptionPane.WARNING_MESSAGE);
                    return false;
                }
                
                return paymentController.processCardPayment(reservation, totalAmount, 
                    cardNumber, cardHolder, expiry, cvv);
                
            case "Debit Card":
                String debitCardNumber = cardNumberField.getText().trim();
                String debitCardHolder = cardHolderField.getText().trim();
                String debitExpiry = expiryField.getText().trim();
                String debitCvv = cvvField.getText().trim();
                
                if (debitCardNumber.isEmpty() || debitCardHolder.isEmpty() || debitExpiry.isEmpty() || debitCvv.isEmpty()) {
                    JOptionPane.showMessageDialog(PaymentViewPanel,
                        "Please fill in all debit card information.",
                        "Validation Error",
                        JOptionPane.WARNING_MESSAGE);
                    return false;
                }
                
                return paymentController.processCardPayment(reservation, totalAmount,
                    debitCardNumber, debitCardHolder, debitExpiry, debitCvv);
                
            case "Institutional Account":
                String accountNumber = accountNumberField.getText().trim();
                String routingNumber = routingNumberField.getText().trim();
                String institution = institutionField.getText().trim();
                String department = departmentField.getText().trim();
                
                if (accountNumber.isEmpty() || routingNumber.isEmpty() || institution.isEmpty() || department.isEmpty()) {
                    JOptionPane.showMessageDialog(PaymentViewPanel,
                        "Please fill in all institutional account information.",
                        "Validation Error",
                        JOptionPane.WARNING_MESSAGE);
                    return false;
                }
                
                return paymentController.processInstitutionalPayment(reservation, totalAmount,
                    accountNumber, routingNumber, institution, department);
                
            case "Research Grant":
                String grantNumber = grantNumberField.getText().trim();
                String researchProject = researchProjectField.getText().trim();
                
                if (grantNumber.isEmpty() || researchProject.isEmpty()) {
                    JOptionPane.showMessageDialog(PaymentViewPanel,
                        "Please fill in all research grant information.",
                        "Validation Error",
                        JOptionPane.WARNING_MESSAGE);
                    return false;
                }
                
                return paymentController.processGrantPayment(reservation, totalAmount,
                    grantNumber, researchProject);
                
            default:
                return false;
        }
    }
    
    private boolean validatePaymentFields(ButtonGroup paymentGroup, JPanel dynamicFieldsPanel) {
        if (paymentGroup.getSelection() == null) {
            JOptionPane.showMessageDialog(PaymentViewPanel,
                "Please select a payment method.",
                "Validation Error",
                JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        for (Component comp : dynamicFieldsPanel.getComponents()) {
            if (comp instanceof JTextField) {
                JTextField field = (JTextField) comp;
                if (field.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(PaymentViewPanel,
                        "Please fill in all payment information fields.",
                        "Validation Error",
                        JOptionPane.WARNING_MESSAGE);
                    return false;
                }
            }
        }
        
        return true;
    }
    
    public void setPaymentViewVisibility(boolean b) {
        PaymentViewPanel.setVisible(b);
        if (b) {
            frame.getContentPane().removeAll();
            frame.getContentPane().add(PaymentViewPanel);
            frame.revalidate();
            frame.repaint();
        }
    }
}