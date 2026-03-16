package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class RegisterView {
	
	private JPanel RegisterViewPanel;
	private JTextField textField;
	private JPasswordField passwordTextfield;
	private static RegisterView instance;
	
	
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
		RegisterLabel.setBounds(100, 155, 588, 63);
		RegisterViewPanel.add(RegisterLabel);
		
		JPanel infoPanel = new JPanel();
		infoPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		infoPanel.setBackground(new Color(255, 255, 255));
		infoPanel.setBounds(100, 206, 588, 254);
		RegisterViewPanel.add(infoPanel);
		infoPanel.setLayout(null);
		
		JLabel emailLabel = new JLabel("Email:");
		emailLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		emailLabel.setBounds(18, 16, 93, 30);
		infoPanel.add(emailLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField.setBounds(103, 18, 431, 30);
		infoPanel.add(textField);
		textField.setColumns(10);
		
		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		passwordLabel.setBounds(18, 67, 118, 30);
		infoPanel.add(passwordLabel);
		
		passwordTextfield = new JPasswordField();
		passwordTextfield.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		passwordTextfield.setColumns(10);
		passwordTextfield.setBounds(134, 69, 431, 30);
		infoPanel.add(passwordTextfield);
		
		JLabel passwordReqsLabel = new JLabel("Password must contain at least of of each: uppercase, lowercase, numbers, and symbols\n");
		passwordReqsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		passwordReqsLabel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		passwordReqsLabel.setBounds(18, 98, 547, 30);
		infoPanel.add(passwordReqsLabel);
		
		JLabel userTypeLabel = new JLabel("User Type:");
		userTypeLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		userTypeLabel.setBounds(18, 140, 147, 30);
		infoPanel.add(userTypeLabel);
		
		JComboBox usertypeComboBox = new JComboBox();
		usertypeComboBox.setModel(new DefaultComboBoxModel(new String[] {"Student", "Faculty", "Researcher", "Guest"}));
		usertypeComboBox.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		usertypeComboBox.setBounds(148, 140, 267, 43);
		infoPanel.add(usertypeComboBox);
		
		JButton registerBtn = new JButton("Register");
		registerBtn.setFont(new Font("Times New Roman", Font.BOLD, 25));
		registerBtn.setBounds(214, 195, 160, 43);
		infoPanel.add(registerBtn);
		
		JPanel goToLoginPanel = new JPanel();
		goToLoginPanel.setBounds(100, 472, 588, 88);
		RegisterViewPanel.add(goToLoginPanel);
		goToLoginPanel.setLayout(null);
		goToLoginPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		goToLoginPanel.setBackground(Color.WHITE);
		
		JLabel LoginLabel = new JLabel("Already a User?");
		LoginLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		LoginLabel.setBounds(25, 28, 184, 30);
		goToLoginPanel.add(LoginLabel);
		
		JButton loginBtn = new JButton("Login");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setRegisterViewVisibility(false);
				LoginView.getInstance().setLoginViewVisibility(true);
			}
		});
		loginBtn.setFont(new Font("Times New Roman", Font.BOLD, 25));
		loginBtn.setBounds(236, 25, 117, 38);
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
		RegisterViewPanel.setVisible(b);
	}
}
