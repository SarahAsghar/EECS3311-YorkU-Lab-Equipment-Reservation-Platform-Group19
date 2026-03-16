package view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.FlowLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JFormattedTextField;
import javax.swing.JToggleButton;

public class LoginView {
	
	private static JFrame frame = new JFrame("EquipmentReservationSystem");
	private JTextField EmailTextfield;
	private JPasswordField PasswordTextfield;
	private JPanel LoginViewPanel;
	
	private static LoginView instance;
	
	private LoginView() {
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Close on exit
		frame.setVisible(true);
		frame.setResizable(false); // stop resize
		frame.setMinimumSize(new Dimension(800, 600));
		frame.getContentPane().setBackground(new Color(239, 239, 239));
		frame.getContentPane().setLayout(null);

		LoginViewPanel = new JPanel();
		LoginViewPanel.setBounds(0, 0, 800, 600);
		LoginViewPanel.setLayout(null);
		frame.getContentPane().add(LoginViewPanel);
		
		JPanel TitlePanel = new JPanel();
		TitlePanel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		TitlePanel.setBackground(new Color(255, 255, 255));
		TitlePanel.setBounds(100, 18, 588, 141);
		LoginViewPanel.add(TitlePanel);
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
		
		JLabel LoginLabel = new JLabel("Login");
		LoginLabel.setHorizontalAlignment(SwingConstants.CENTER);
		LoginLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		LoginLabel.setBounds(100, 155, 588, 63);
		LoginViewPanel.add(LoginLabel);
		
		JPanel InfoPanel = new JPanel();
		InfoPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		InfoPanel.setBackground(new Color(255, 255, 255));
		InfoPanel.setBounds(100, 217, 588, 226);
		LoginViewPanel.add(InfoPanel);
		InfoPanel.setLayout(null);
		
		JLabel EmailLabel = new JLabel("Email:");
		EmailLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		EmailLabel.setBounds(35, 51, 94, 30);
		InfoPanel.add(EmailLabel);
		
		EmailTextfield = new JTextField();
		EmailTextfield.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		EmailTextfield.setToolTipText("Enter Email");
		EmailTextfield.setBounds(121, 51, 420, 31);
		InfoPanel.add(EmailTextfield);
		EmailTextfield.setColumns(10);
		
		JLabel PasswordLabel = new JLabel("Password:");
		PasswordLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		PasswordLabel.setBounds(17, 112, 112, 30);
		InfoPanel.add(PasswordLabel);
		
		PasswordTextfield = new JPasswordField();
		PasswordTextfield.setToolTipText("Enter Password");
		PasswordTextfield.setEchoChar('*');
		PasswordTextfield.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		PasswordTextfield.setColumns(10);
		PasswordTextfield.setBounds(142, 111, 399, 31);
		InfoPanel.add(PasswordTextfield);
		
		JButton LoginBtn = new JButton("Login");
		LoginBtn.setFont(new Font("Times New Roman", Font.BOLD, 25));
		LoginBtn.setBounds(240, 167, 117, 38);
		LoginBtn.setVisible(true);
		InfoPanel.add(LoginBtn);
		
		JPanel RegistrationPanel = new JPanel();
		RegistrationPanel.setBounds(100, 456, 588, 88);
		LoginViewPanel.add(RegistrationPanel);
		RegistrationPanel.setLayout(null);
		RegistrationPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		RegistrationPanel.setBackground(Color.WHITE);
		
		JLabel RegisterLabel = new JLabel("New User?");
		RegisterLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		RegisterLabel.setBounds(25, 28, 134, 30);
		RegistrationPanel.add(RegisterLabel);
		
		JButton Registerbtn = new JButton("Register");
		Registerbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setLoginViewVisibility(false);
				new RegisterView(frame);
			}
		});
		Registerbtn.setFont(new Font("Times New Roman", Font.BOLD, 25));
		Registerbtn.setBounds(236, 25, 117, 38);
		RegistrationPanel.add(Registerbtn);
		
		
		
		
	}
	
	public static synchronized LoginView openLoginView() {
		if(instance == null) {
			instance = new LoginView();
		}
		return instance;
	}
	
	public void setLoginViewVisibility(boolean b) {
		LoginViewPanel.setVisible(b);
	}
	
	
}
