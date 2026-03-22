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
import controller.UserController;
import model.Reservation.Reservation;
import model.User.User;

public class PaymentView {
    private JPanel PaymentViewPanel;
    private JFrame frame = LoginView.getFrame();
    private ReservationView backView;
    private Reservation reservation;
    private double totalAmount;
    private double depositAmount;
    
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
        
        User loggedInUser = UserController.getLoggedInUser();
        double hourlyFee = loggedInUser.getUserType().getHourlyFee();
        double hours = reservation.calculateHours();
        totalAmount = hourlyFee * hours;
        depositAmount = hourlyFee; // 1 hour deposit
        
        PaymentViewPanel = new JPanel();
        PaymentViewPanel.setBounds(0, 0, 800, 600);
        PaymentViewPanel.setLayout(null);
        frame.getContentPane().add(PaymentViewPanel);
        
        JPanel mainPanel = new JPanel();
        mainPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
        mainPanel.setBackground(new Color(255, 255, 255));
        mainPanel.setBounds(100, 50, 600, 500);
        mainPanel.setLayout(null);
        PaymentViewPanel.add(mainPanel);
        
        JPanel reservationPanel = new JPanel();
        reservationPanel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), 
                "RESERVATION DETAILS", TitledBorder.LEFT, TitledBorder.TOP, 
                new Font("Times New Roman", Font.BOLD, 14)));
        reservationPanel.setBackground(new Color(255, 255, 255));
        reservationPanel.setBounds(20, 20, 560, 160);
        reservationPanel.setLayout(null);
        mainPanel.add(reservationPanel);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        
        int y = 25;
        addDetailRow(reservationPanel, "Email:", UserController.getLoggedInUser().getEmail(), y);
        y += 30;
        addDetailRow(reservationPanel, "Equipment ID:", reservation.getEquipmentID(), y);
        y += 30;
        addDetailRow(reservationPanel, "Start Time:", reservation.getStartTime().format(formatter), y);
        y += 30;
        addDetailRow(reservationPanel, "End Time:", reservation.getEndTime().format(formatter), y);
        y += 30;
        addDetailRow(reservationPanel, "Hours:", String.format("%.2f", reservation.calculateHours()), y);
        
        JLabel depositLabel = new JLabel("Deposit (1 hour):");
        depositLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
        depositLabel.setBounds(20, 200, 150, 25);
        mainPanel.add(depositLabel);
        
        JLabel depositValue = new JLabel(String.format("$%.2f", depositAmount));
        depositValue.setFont(new Font("Times New Roman", Font.BOLD, 14));
        depositValue.setForeground(new Color(0, 100, 0));
        depositValue.setBounds(180, 200, 100, 25);
        mainPanel.add(depositValue);
        
        JLabel remainingLabel = new JLabel("Remaining (after arrival):");
        remainingLabel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        remainingLabel.setBounds(20, 230, 150, 20);
        mainPanel.add(remainingLabel);
        
        double remainingAmount = totalAmount - depositAmount;
        JLabel remainingValue = new JLabel(String.format("$%.2f", remainingAmount));
        remainingValue.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        remainingValue.setBounds(180, 230, 100, 20);
        mainPanel.add(remainingValue);
        
        JPanel paymentMethodPanel = new JPanel();
        paymentMethodPanel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), 
                "PAYMENT METHOD", TitledBorder.LEFT, TitledBorder.TOP, 
                new Font("Times New Roman", Font.BOLD, 14)));
        paymentMethodPanel.setBackground(new Color(255, 255, 255));
        paymentMethodPanel.setBounds(20, 260, 560, 180);
        paymentMethodPanel.setLayout(null);
        mainPanel.add(paymentMethodPanel);
        
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
        
        JPanel dynamicFieldsPanel = new JPanel();
        dynamicFieldsPanel.setBounds(20, 65, 520, 100);
        dynamicFieldsPanel.setLayout(null);
        dynamicFieldsPanel.setBackground(Color.WHITE);
        paymentMethodPanel.add(dynamicFieldsPanel);
        
        initializeFields(dynamicFieldsPanel);
        
        creditRadio.addActionListener(e -> showCreditCardFields(dynamicFieldsPanel));
        debitRadio.addActionListener(e -> showCreditCardFields(dynamicFieldsPanel));
        institutionalRadio.addActionListener(e -> showInstitutionalFields(dynamicFieldsPanel));
        grantRadio.addActionListener(e -> showGrantFields(dynamicFieldsPanel));
        
        creditRadio.setSelected(true);
        showCreditCardFields(dynamicFieldsPanel);
        
        JButton confirmBtn = new JButton("Confirm Reservation");
        confirmBtn.setFont(new Font("Times New Roman", Font.BOLD, 16));
        confirmBtn.setBounds(200, 450, 200, 40);
        confirmBtn.addActionListener(e -> {
            if (!validatePaymentFields(paymentGroup, dynamicFieldsPanel)) return;
            
            int confirm = JOptionPane.showConfirmDialog(PaymentViewPanel,
                "Pay deposit of $" + depositAmount + " to confirm reservation?",
                "Confirm Payment",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
            
            if (confirm == JOptionPane.YES_OPTION) {
                boolean paymentSuccess = processPayment();
                if (paymentSuccess) {
                    JOptionPane.showMessageDialog(PaymentViewPanel,
                        "Deposit Paid Successfully!\n\n" +
                        "Reservation ID: " + reservation.getReservationId() + "\n" +
                        "Deposit: $" + depositAmount,
                        "Success",
                        JOptionPane.INFORMATION_MESSAGE);
                    
                    setPaymentViewVisibility(false);
                    if (backView != null && backView.adminInstance != null) {
                        backView.adminInstance.refreshRegularView(); // Refresh the reservations
                        backView.adminInstance.setAdminViewVisibility(true);
                    }
                }else {
                    JOptionPane.showMessageDialog(PaymentViewPanel,
                        "Payment failed. Please try again.",
                        "Payment Failed",
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        mainPanel.add(confirmBtn);
        
        JButton cancelBtn = new JButton("Cancel");
        cancelBtn.setBounds(450, 450, 100, 40);
        cancelBtn.addActionListener(e -> {
            setPaymentViewVisibility(false);
            backView.setReservationViewVisibility(true);
        });
        mainPanel.add(cancelBtn);
        
        PaymentViewPanel.repaint();
        PaymentViewPanel.revalidate();
    }
    
    private void addDetailRow(JPanel panel, String label, String value, int y) {
        JLabel labelComp = new JLabel(label);
        labelComp.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        labelComp.setBounds(20, y, 100, 20);
        panel.add(labelComp);
        
        JLabel valueComp = new JLabel(value);
        valueComp.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        valueComp.setBounds(130, y, 400, 20);
        panel.add(valueComp);
    }
    
    private void initializeFields(JPanel panel) {
        cardNumberField = new JTextField();
        cardNumberField.setBounds(10, 10, 150, 25);
        cardHolderField = new JTextField();
        cardHolderField.setBounds(170, 10, 150, 25);
        expiryField = new JTextField();
        expiryField.setBounds(330, 10, 80, 25);
        cvvField = new JTextField();
        cvvField.setBounds(420, 10, 80, 25);
        
        accountNumberField = new JTextField();
        accountNumberField.setBounds(10, 10, 200, 25);
        routingNumberField = new JTextField();
        routingNumberField.setBounds(220, 10, 150, 25);
        institutionField = new JTextField();
        institutionField.setBounds(380, 10, 120, 25);
        departmentField = new JTextField();
        departmentField.setBounds(10, 45, 250, 25);
        
        grantNumberField = new JTextField();
        grantNumberField.setBounds(10, 10, 200, 25);
        researchProjectField = new JTextField();
        researchProjectField.setBounds(220, 10, 280, 25);
    }
    
    private void showCreditCardFields(JPanel panel) {
        panel.removeAll();
        panel.add(createLabel("Card Number:", 10, -5));
        panel.add(cardNumberField);
        panel.add(createLabel("Card Holder:", 170, -5));
        panel.add(cardHolderField);
        panel.add(createLabel("Expiry:", 330, -5));
        panel.add(expiryField);
        panel.add(createLabel("CVV:", 420, -5));
        panel.add(cvvField);
        panel.revalidate();
        panel.repaint();
    }
    
    private void showInstitutionalFields(JPanel panel) {
        panel.removeAll();
        panel.add(createLabel("Account Number:", 10, -5));
        panel.add(accountNumberField);
        panel.add(createLabel("Routing Number:", 220, -5));
        panel.add(routingNumberField);
        panel.add(createLabel("Institution:", 380, -5));
        panel.add(institutionField);
        panel.add(createLabel("Department:", 10, 30));
        panel.add(departmentField);
        panel.revalidate();
        panel.repaint();
    }
    
    private void showGrantFields(JPanel panel) {
        panel.removeAll();
        panel.add(createLabel("Grant Number:", 10, -5));
        panel.add(grantNumberField);
        panel.add(createLabel("Research Project:", 220, -5));
        panel.add(researchProjectField);
        panel.revalidate();
        panel.repaint();
    }
    
    private JLabel createLabel(String text, int x, int y) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("Times New Roman", Font.PLAIN, 10));
        label.setBounds(x, y, 100, 20);
        return label;
    }
    
    private boolean processPayment() {
        PaymentController paymentController = PaymentController.getInstance();
        
        switch (selectedPaymentMethod) {
            case "Credit Card":
                return paymentController.processCardPayment(reservation, depositAmount,
                    cardNumberField.getText().trim(), cardHolderField.getText().trim(),
                    expiryField.getText().trim(), cvvField.getText().trim());
            case "Debit Card":
                return paymentController.processCardPayment(reservation, depositAmount,
                    cardNumberField.getText().trim(), cardHolderField.getText().trim(),
                    expiryField.getText().trim(), cvvField.getText().trim());
            case "Institutional Account":
                return paymentController.processInstitutionalPayment(reservation, depositAmount,
                    accountNumberField.getText().trim(), routingNumberField.getText().trim(),
                    institutionField.getText().trim(), departmentField.getText().trim());
            case "Research Grant":
                return paymentController.processGrantPayment(reservation, depositAmount,
                    grantNumberField.getText().trim(), researchProjectField.getText().trim());
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
        frame.getContentPane().removeAll();

    	if (b) {
            frame.getContentPane().add(PaymentViewPanel);
            PaymentViewPanel.setVisible(true);
            frame.revalidate();
            frame.repaint();
           
        } else {
            PaymentViewPanel.setVisible(false);
        }
    }
}