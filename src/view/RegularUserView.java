package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

import model.User.User;

public class RegularUserView {

	private JPanel RegularUserViewPanel;
	private JTable table;
	
	public RegularUserView() {
		JFrame frame = LoginView.getFrame();
		
		RegularUserViewPanel = new JPanel();
		RegularUserViewPanel.setBounds(0, 0, 800, 600);
		RegularUserViewPanel.setLayout(null);
		frame.getContentPane().add(RegularUserViewPanel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(37, 82, 604, 492);
		RegularUserViewPanel.add(panel);
		panel.setLayout(null);
		
		table = new JTable();
		table.setBounds(0, 0, 604, 492);
		panel.add(table);
		
		JLabel welcomeLabel = new JLabel("Welcome ");
		welcomeLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		welcomeLabel.setBounds(37, 6, 317, 34);
		RegularUserViewPanel.add(welcomeLabel);
		
		JLabel CurrentReservationsLabel = new JLabel("Current Reservations");
		CurrentReservationsLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		CurrentReservationsLabel.setBounds(37, 47, 317, 34);
		RegularUserViewPanel.add(CurrentReservationsLabel);
		
		JButton logoutBtn = new JButton("Logout");
		logoutBtn.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		logoutBtn.setBounds(666, 536, 117, 38);
		RegularUserViewPanel.add(logoutBtn);
		
		JButton newReservationBtn = new JButton("New Reservation");
		newReservationBtn.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		newReservationBtn.setBounds(612, 18, 171, 49);
		RegularUserViewPanel.add(newReservationBtn);
			
		
	}
}
