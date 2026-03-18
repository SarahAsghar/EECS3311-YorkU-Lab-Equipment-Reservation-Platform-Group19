package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import model.Reservation.Reservation;
import model.User.UserType;

import javax.swing.JTable;
import javax.swing.JButton;

public class AdminView {

	private JPanel AdminViewPanel;
	private JTable table;
	private JFrame frame = LoginView.getFrame();

	public AdminView(UserType usertype, ArrayList<Reservation> reservations) {
		AdminViewPanel = new JPanel();
		AdminViewPanel.setBounds(0, 0, 800, 600);
		AdminViewPanel.setLayout(null);
		frame.getContentPane().add(AdminViewPanel);
		regularView(reservations);
		if(usertype == UserType.HEADLABCOORDINATOR) {

		}
		else if (usertype == UserType.LABMANAGER) {

		}
		else  { //regularView
			regularView(reservations);
		}




	}

	public void regularView(ArrayList<Reservation> reservations) {
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(37, 82, 604, 492);
		AdminViewPanel.add(panel);
		panel.setLayout(null);

		String[] columnHeaders = {
				"Reservation ID",  
				"Equipment", 
				"Start Time", 
				"End Time"
		};

		DefaultTableModel model = new DefaultTableModel(columnHeaders, 0);
		table = new JTable(model);
		table.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		table.setBounds(0, 0, 604, 492);
		panel.add(table);
		JScrollPane scrollPane = new JScrollPane(table);
		panel.add(scrollPane);
		addReservations(reservations, model);

		JLabel welcomeLabel = new JLabel("Welcome ");
		welcomeLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		welcomeLabel.setBounds(37, 6, 317, 34);
		AdminViewPanel.add(welcomeLabel);

		JLabel CurrentReservationsLabel = new JLabel("Current Reservations");
		CurrentReservationsLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		CurrentReservationsLabel.setBounds(37, 47, 317, 34);
		AdminViewPanel.add(CurrentReservationsLabel);

		JButton logoutBtn = new JButton("Logout");
		logoutBtn.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		logoutBtn.setBounds(666, 536, 117, 38);
		AdminViewPanel.add(logoutBtn);

		JButton newReservationBtn = new JButton("New Reservation");
		newReservationBtn.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		newReservationBtn.setBounds(612, 18, 171, 49);
		AdminViewPanel.add(newReservationBtn);
	}

	private void addReservations(ArrayList<Reservation> reservations, DefaultTableModel model) {
		for (Reservation r : reservations) {
			Object[] rowData = {
					r.getReservationId(),
					r.getUserId(),
					r.getEquipmentID(),
					r.getStartTime().toString(),
					r.getEndTime().toString()};
			model.addRow(rowData);
		}
	}
}
