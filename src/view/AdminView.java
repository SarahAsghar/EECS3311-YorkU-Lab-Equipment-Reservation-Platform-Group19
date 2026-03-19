package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import controller.UserController;
import model.Equipment.EquipmentStatus;
import model.Reservation.Reservation;
import model.User.User;
import model.User.UserType;

import javax.swing.JTable;
import javax.swing.JButton;

public class AdminView {

	private JPanel AdminViewPanel;
	private JTable table;
	private JFrame frame = LoginView.getFrame();
	private JTable Table;

	public AdminView(UserType usertype, ArrayList<Reservation> reservations, ArrayList<User> users) {
		
		
		if(usertype == UserType.HEADLABCOORDINATOR) {
			headLabCoordinatorView(users);
		}
		else if (usertype == UserType.LABMANAGER) {
			LabManagerView();
		}
		else  { //regularView
			regularView(reservations);
		}




	}
	
	private void LabManagerView() {
		AdminViewPanel = new JPanel();
		AdminViewPanel.setBounds(0, 0, 800, 600);
		AdminViewPanel.setLayout(null);
		frame.getContentPane().add(AdminViewPanel);

		JPanel labManagerPanel = new JPanel();
		labManagerPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		labManagerPanel.setBackground(new Color(255, 255, 255));
		labManagerPanel.setBounds(37, 82, 604, 492);
		labManagerPanel.setLayout(null); // Keep null layout
		AdminViewPanel.add(labManagerPanel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 592, 480); 
		labManagerPanel.add(scrollPane);

		String[] columnHeaders = {
				"equipmentId",
			   "name",
			    "description",
			    "labLocation",
			   "status",
			    "enabled"
		};

		DefaultTableModel model = new DefaultTableModel(columnHeaders, 0);
		Table = new JTable(model);
		Table.setFont(new Font("Times New Roman", Font.PLAIN, 15));

		scrollPane.setViewportView(Table);
		Table.setAutoCreateRowSorter(true);

		scrollPane.revalidate();
		scrollPane.repaint();

		JLabel welcomeLabel = new JLabel("Welcome Lab Manager");
		welcomeLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		welcomeLabel.setBounds(37, 6, 440, 34);
		AdminViewPanel.add(welcomeLabel);

		JLabel CurrentEquipmentsLabel = new JLabel("Current Equipments");
		CurrentEquipmentsLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		CurrentEquipmentsLabel.setBounds(37, 47, 317, 34);
		AdminViewPanel.add(CurrentEquipmentsLabel);

		JButton logoutBtn = new JButton("Logout");
		logoutBtn.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		logoutBtn.setBounds(666, 536, 117, 38);
		logoutBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setAdminViewVisibility(false);
				LoginView l = LoginView.getInstance();
				l.setLoginViewVisibility(true);	
			}

		});
		AdminViewPanel.add(logoutBtn);

		JButton newEquipmentBtn = new JButton("Add equipment");
		newEquipmentBtn.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		newEquipmentBtn.setBounds(489, 18, 294, 49);
		newEquipmentBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
//				JOptionPane.showMessageDialog(AdminViewPanel,
//						account,
//						"Lab Manager Account Created",
//						JOptionPane.INFORMATION_MESSAGE);
			}

		});
		AdminViewPanel.add(newEquipmentBtn);
		AdminViewPanel.revalidate();
		AdminViewPanel.repaint();
	}

	private void headLabCoordinatorView(ArrayList<User> users) {
		AdminViewPanel = new JPanel();
		AdminViewPanel.setBounds(0, 0, 800, 600);
		AdminViewPanel.setLayout(null);
		frame.getContentPane().add(AdminViewPanel);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(37, 82, 604, 492);
		panel.setLayout(null); // Keep null layout
		AdminViewPanel.add(panel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 592, 480); 
		panel.add(scrollPane);

		String[] columnHeaders = {
				"Status",  
				"Email", 
				"Name", 
				"UserType",
				"IdNumber"
		};

		DefaultTableModel model = new DefaultTableModel(columnHeaders, 0);
		Table = new JTable(model);
		Table.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		addUsers(users, model);

		scrollPane.setViewportView(Table);
		Table.setAutoCreateRowSorter(true);

		scrollPane.revalidate();
		scrollPane.repaint();

		JLabel welcomeLabel = new JLabel("Welcome Head Lab Coordinator");
		welcomeLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		welcomeLabel.setBounds(37, 6, 440, 34);
		AdminViewPanel.add(welcomeLabel);

		JLabel CurrentReservationsLabel = new JLabel("Current Users");
		CurrentReservationsLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		CurrentReservationsLabel.setBounds(37, 47, 317, 34);
		AdminViewPanel.add(CurrentReservationsLabel);

		JButton logoutBtn = new JButton("Logout");
		logoutBtn.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		logoutBtn.setBounds(666, 536, 117, 38);
		logoutBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setAdminViewVisibility(false);
				LoginView l = LoginView.getInstance();
				l.setLoginViewVisibility(true);	
			}

		});
		AdminViewPanel.add(logoutBtn);

		JButton newLabManagerAccountBtn = new JButton("Generate Lab Manager Account");
		newLabManagerAccountBtn.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		newLabManagerAccountBtn.setBounds(489, 18, 294, 49);
		newLabManagerAccountBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String account = UserController.getInstance().createLabManagerUser();
				JOptionPane.showMessageDialog(AdminViewPanel,
						account,
						"Lab Manager Account Created",
						JOptionPane.INFORMATION_MESSAGE);
			}

		});
		AdminViewPanel.add(newLabManagerAccountBtn);
		AdminViewPanel.revalidate();
		AdminViewPanel.repaint();
		
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
		logoutBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setAdminViewVisibility(false);
				LoginView l = LoginView.getInstance();
				l.setLoginViewVisibility(true);	
			}

		});
		AdminViewPanel.add(logoutBtn);


		JButton newReservationBtn = new JButton("New Reservation");
		newReservationBtn.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		newReservationBtn.setBounds(612, 18, 171, 49);
		newReservationBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setAdminViewVisibility(false);
				ReservationView r = new ReservationView();			
			}

		});
		AdminViewPanel.add(newReservationBtn);
	}

	private void addReservations(ArrayList<Reservation> reservations, DefaultTableModel model) {
		for (Reservation r : reservations) {
			Object[] rowData = {
					r.getReservationId(),
					r.getEquipmentID(),
					r.getStartTime().toString(),
					r.getEndTime().toString()};
			model.addRow(rowData);
		}
	}

	private void addUsers(ArrayList<User> users, DefaultTableModel model) {
		if (users != null) {
			for (User r : users) {
				Object[] rowData = {
						r.getStatus(),
						r.getEmail(),
						r.getName(),
						r.getUserType(),
						r.getIDNum()};
				model.addRow(rowData);
			}
		}
	}

	public void setAdminViewVisibility(boolean b) {
		AdminViewPanel.setVisible(b);
	}
}
