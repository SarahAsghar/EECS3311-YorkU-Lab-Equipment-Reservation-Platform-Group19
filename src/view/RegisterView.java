package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import controller.UserController;
import model.User.UserType;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class RegisterView {
	
	private JPanel RegisterViewPanel;
	private JTextField emailTextfield;
	private JPasswordField passwordTextfield;
	private static RegisterView instance;
	private JTextField NameTextfield;
	private JTextField IDNumberTextfield;
	
	
	private RegisterView(JFrame frame) {
		RegisterViewPanel = new JPanel();
		RegisterViewPanel.setBounds(0, 0, 800, 600);
		RegisterViewPanel.setLayout(null);
		frame.getContentPane().add(RegisterViewPanel);
		
		JPanel TitlePanel = new JPanel();
		TitlePanel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		TitlePanel.setBackground(new Color(255, 255, 255));
		TitlePanel.setBounds(100, 18, 588, 141);
		RegisterViewPanel.add(TitlePanel);
		TitlePanel.setLayout(null);
		
		JLabel TitleLaplePart1 = new JLabel("YORKU Equipment ");
		TitleLaplePart1.setHorizontalAlignment(SwingConstants.CENTER);
		TitleLaplePart1.setBounds(6, 6, 576, 63);
		TitleLaplePart1.setFont(new Font("Times New Roman", Font.BOLD, 35));
		TitlePanel.add(TitleLaplePart1);
		
		JLabel TitleLabelPart2 = new JLabel("Registration Platform");
		TitleLabelPart2.setHorizontalAlignment(SwingConstants.CENTER);
		TitleLabelPart2.setFont(new Font("Times New Roman", Font.BOLD, 35));
		TitleLabelPart2.setBounds(6, 72, 576, 63);
		TitlePanel.add(TitleLabelPart2);
		
		JLabel RegisterLabel = new JLabel("Register");
		RegisterLabel.setHorizontalAlignment(SwingConstants.CENTER);
		RegisterLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		RegisterLabel.setBounds(100, 148, 588, 63);
		RegisterViewPanel.add(RegisterLabel);
		
		JPanel infoPanel = new JPanel();
		infoPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		infoPanel.setBackground(new Color(255, 255, 255));
		infoPanel.setBounds(100, 193, 588, 302);
		RegisterViewPanel.add(infoPanel);
		infoPanel.setLayout(null);
		
		JLabel emailLabel = new JLabel("Email:");
		emailLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		emailLabel.setBounds(18, 65, 118, 30);
		infoPanel.add(emailLabel);
		
		emailTextfield = new JTextField();
		emailTextfield.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		emailTextfield.setBounds(134, 67, 431, 30);
		infoPanel.add(emailTextfield);
		emailTextfield.setColumns(10);
		
		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		passwordLabel.setBounds(18, 116, 118, 30);
		infoPanel.add(passwordLabel);
		
		passwordTextfield = new JPasswordField();
		passwordTextfield.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		passwordTextfield.setColumns(10);
		passwordTextfield.setBounds(144, 118, 431, 30);
		infoPanel.add(passwordTextfield);
		
		JLabel passwordReqsLabel = new JLabel("Password must contain at least of of each: uppercase, lowercase, numbers, and symbols\n");
		passwordReqsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		passwordReqsLabel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		passwordReqsLabel.setBounds(18, 144, 547, 30);
		infoPanel.add(passwordReqsLabel);
		
		JLabel userTypeLabel = new JLabel("User Type:");
		userTypeLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		userTypeLabel.setBounds(18, 176, 147, 30);
		infoPanel.add(userTypeLabel);
		
		JComboBox<UserType> usertypeComboBox = new JComboBox<>(UserType.values());
		usertypeComboBox.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		usertypeComboBox.setBounds(154, 173, 267, 43);
		infoPanel.add(usertypeComboBox);
		UserType type = (UserType) usertypeComboBox.getSelectedItem();
		
		
		JLabel NameLabel = new JLabel("Name:");
		NameLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		NameLabel.setBounds(18, 21, 118, 30);
		infoPanel.add(NameLabel);
		
		NameTextfield = new JTextField();
		NameTextfield.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		NameTextfield.setColumns(10);
		NameTextfield.setBounds(134, 23, 431, 30);
		infoPanel.add(NameTextfield);
		
		JLabel idNumber = new JLabel("ID/Certifcation Number");
		idNumber.setFont(new Font("Times New Roman", Font.BOLD, 25));
		idNumber.setBounds(18, 216, 277, 30);
		infoPanel.add(idNumber);
		
		IDNumberTextfield = new JTextField();
		IDNumberTextfield.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		IDNumberTextfield.setColumns(10);
		IDNumberTextfield.setBounds(288, 218, 277, 30);
		infoPanel.add(IDNumberTextfield);
		
		JButton registerBtn = new JButton("Register");
		registerBtn.setFont(new Font("Times New Roman", Font.BOLD, 25));
		registerBtn.setBounds(217, 258, 147, 38);
		registerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = NameTextfield.getText();
				String email = emailTextfield.getText();
				String password = String.valueOf(passwordTextfield.getPassword());
				String IDNum = IDNumberTextfield.getText();
				
				if(name == null || email == null || password == null || IDNum != null ||
						name.equals("") || email.equals("") || password.equals("") || IDNum.equals("")) {
					JOptionPane.showMessageDialog(RegisterViewPanel,
		                    "Enter Name, Email, and Password",
		                    "Error",
		                    JOptionPane.INFORMATION_MESSAGE);
				
				}
				else {
					String s = UserController.getInstance().registerUser(email, password, (UserType) usertypeComboBox.getSelectedItem(), IDNum);
					
					if(s.equals("GOOD")) {
						JOptionPane.showMessageDialog(RegisterViewPanel,
			                    "User successfully created!",
			                    "User created",
			                    JOptionPane.INFORMATION_MESSAGE);
						setRegisterViewVisibility(false);
						LoginView.getInstance().setLoginViewVisibility(true);
					}
					else if (s.equals("Password not strong")) {
						JOptionPane.showMessageDialog(RegisterViewPanel,
			                    "Password not strong enough!",
			                    "User created",
			                    JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(RegisterViewPanel,
			                    "User was not created",
			                    "Error",
			                    JOptionPane.INFORMATION_MESSAGE);
					}
				}
				
				}
		});
		infoPanel.add(registerBtn);
		
		JPanel goToLoginPanel = new JPanel();
		goToLoginPanel.setBounds(100, 507, 588, 57);
		RegisterViewPanel.add(goToLoginPanel);
		goToLoginPanel.setLayout(null);
		goToLoginPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		goToLoginPanel.setBackground(Color.WHITE);
		
		JLabel LoginLabel = new JLabel("Already a User?");
		LoginLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		LoginLabel.setBounds(18, 16, 184, 30);
		goToLoginPanel.add(LoginLabel);
		
		JButton loginBtn = new JButton("Login");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setRegisterViewVisibility(false);
				LoginView.getInstance().setLoginViewVisibility(true);
			}
		});
		loginBtn.setFont(new Font("Times New Roman", Font.BOLD, 25));
		loginBtn.setBounds(238, 13, 117, 38);
		goToLoginPanel.add(loginBtn);
		
		frame.getContentPane().setVisible(true);

	}
	
	public static synchronized RegisterView getInstance(JFrame f) {
		if(instance == null) {
			instance = new RegisterView(f);
		}
		return instance;
	}
	
	public void setRegisterViewVisibility(boolean b) {
		emailTextfield.setText("");
		passwordTextfield.setText("");
		NameTextfield.setText("");
		RegisterViewPanel.setVisible(b);
	}
}
