package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import controller.EquipmentController;
import controller.ReservationController;
import controller.UserController;
import model.Equipment.Equipment;
import model.Equipment.EquipmentStatus;
import model.Reservation.CompletedState;
import model.Reservation.Reservation;
import model.User.User;
import model.User.UserType;

import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JComboBox;

public class AdminView {

	private JPanel AdminViewPanel;
	private JTable table;
	private JFrame frame = LoginView.getFrame();
	private JTable Table;
	private AdminView instance = this;
	private UserType currentUserType;
	private ArrayList<Reservation> currentReservations;
	private ArrayList<Equipment> currentEquipments;
	private ArrayList<User> currentUsers;

	public AdminView(UserType usertype, ArrayList<Reservation> reservations, 
			ArrayList<User> users, ArrayList<Equipment> equipments) {
		this.currentUserType = usertype;
		this.currentReservations = reservations;
		this.currentUsers = users;
		this.currentEquipments = equipments;
		
		if(usertype == UserType.HEADLABCOORDINATOR) {
			headLabCoordinatorView(users);
		}
		else if (usertype == UserType.LABMANAGER) {
			LabManagerView(equipments);
		}
		else {
			regularView(reservations, equipments);
		}
	}
	
	// Method to refresh the regular view with updated reservations
	public void refreshRegularView() {
		if (currentUserType != UserType.HEADLABCOORDINATOR && currentUserType != UserType.LABMANAGER) {
			// Refresh reservations from database
			currentReservations = ReservationController.getInstance().getMyReservations();
			// Update the table
			refreshReservationTable();
		}
	}
	
	private void refreshReservationTable() {
		if (table != null && table.getModel() instanceof DefaultTableModel) {
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.setRowCount(0); // Clear all rows
			addReservationsSorted(currentReservations, model);
			table.revalidate();
			table.repaint();
		}
	}

	private void LabManagerView(ArrayList<Equipment> equipments) {
		AdminViewPanel = new JPanel();
		AdminViewPanel.setBounds(0, 0, 800, 600);
		AdminViewPanel.setLayout(null);
		frame.getContentPane().add(AdminViewPanel);

		JPanel labManagerPanel = new JPanel();
		labManagerPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		labManagerPanel.setBackground(new Color(255, 255, 255));
		labManagerPanel.setBounds(37, 82, 604, 492);
		labManagerPanel.setLayout(null); 
		AdminViewPanel.add(labManagerPanel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 592, 480); 
		labManagerPanel.add(scrollPane);

		String[] columnHeaders = {
				"equipmentId",
				"name",
				"description",
				"labLocation",
				"status"
		};

		DefaultTableModel model = new DefaultTableModel(columnHeaders, 0);
		Table = new JTable(model);
		Table.setFont(new Font("Times New Roman", Font.PLAIN, 15));

		scrollPane.setViewportView(Table);
		Table.setAutoCreateRowSorter(true);

		addEquipment(equipments, model);

		JPopupMenu statusMenu = new JPopupMenu();
		EquipmentStatus[] statuses = {
				EquipmentStatus.AVAILABLE,
				EquipmentStatus.RESERVED,
				EquipmentStatus.DISABLED,
				EquipmentStatus.MAINTENANCE,
				EquipmentStatus.IN_USE
		};

		for (EquipmentStatus status : statuses) {
			JMenuItem menuItem = new JMenuItem("Set to " + status.name());
			EquipmentStatus currentStatus = status;
			menuItem.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int selectedRow = Table.getSelectedRow();
					if (selectedRow >= 0) {
						int modelRow = Table.convertRowIndexToModel(selectedRow);
						Object idValue = Table.getModel().getValueAt(modelRow, 0);

						if (idValue == null) {
							JOptionPane.showMessageDialog(AdminViewPanel, 
									"Error: Could not get equipment ID", 
									"Error", 
									JOptionPane.ERROR_MESSAGE);
							return;
						}

						String equipmentId = idValue.toString();
						boolean success = EquipmentController.updateEquipmentStatus(equipmentId, currentStatus);

						if (success) {
							Table.getModel().setValueAt(currentStatus.name(), modelRow, 4);
							JOptionPane.showMessageDialog(AdminViewPanel, 
									"Equipment status updated to " + currentStatus.name(),
									"Success", 
									JOptionPane.INFORMATION_MESSAGE);
						} else {
							JOptionPane.showMessageDialog(AdminViewPanel, 
									"Failed to update equipment status", 
									"Error", 
									JOptionPane.ERROR_MESSAGE);
						}
					}
				}
			});
			statusMenu.add(menuItem);
		}

		Table.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isRightMouseButton(e)) {
					int row = Table.rowAtPoint(e.getPoint());
					if (row >= 0) {
						Table.setRowSelectionInterval(row, row);
						statusMenu.show(Table, e.getX(), e.getY());
					}
				}
			}
		});

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
				JDialog popup = new JDialog();
				popup.setTitle("Add New Equipment");
				popup.setModal(true);
				popup.setSize(400, 350);
				popup.setLocationRelativeTo(null);
				popup.setLayout(null);

				JLabel idLabel = new JLabel("Equipment ID:");
				idLabel.setBounds(30, 30, 100, 25);
				JTextField idField = new JTextField();
				idField.setBounds(140, 30, 220, 25);

				JLabel nameLabel = new JLabel("Name:");
				nameLabel.setBounds(30, 70, 100, 25);
				JTextField nameField = new JTextField();
				nameField.setBounds(140, 70, 220, 25);

				JLabel descriptionLabel = new JLabel("Description:");
				descriptionLabel.setBounds(30, 110, 100, 25);
				JTextArea descriptionArea = new JTextArea();
				descriptionArea.setLineWrap(true);
				descriptionArea.setWrapStyleWord(true);
				JScrollPane descriptionScroll = new JScrollPane(descriptionArea);
				descriptionScroll.setBounds(140, 110, 220, 80);

				JLabel labLabel = new JLabel("Lab Location:");
				labLabel.setBounds(30, 210, 100, 25);
				JTextField labField = new JTextField();
				labField.setBounds(140, 210, 220, 25);

				JButton confirmBtn = new JButton("Add Equipment");
				confirmBtn.setBounds(140, 260, 120, 30);

				popup.add(idLabel);
				popup.add(idField);
				popup.add(nameLabel);
				popup.add(nameField);
				popup.add(descriptionLabel);
				popup.add(descriptionScroll);
				popup.add(labLabel);
				popup.add(labField);
				popup.add(confirmBtn);

				confirmBtn.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						String equipmentId = idField.getText().trim();
						String name = nameField.getText().trim();
						String description = descriptionArea.getText().trim();
						String labLocation = labField.getText().trim();

						if (equipmentId.isEmpty() || name.isEmpty() || labLocation.isEmpty()) {
							JOptionPane.showMessageDialog(popup, 
									"Please fill in all required fields",
									"Validation Error",
									JOptionPane.WARNING_MESSAGE);
							return;
						}

						String result = EquipmentController.getInstance().addEquipment(
								equipmentId, name, description, labLocation, 1);

						if (result != null && result.equals("Equipment added successfully!")) {
							Object[] rowData = {
									equipmentId, name, description, labLocation, "AVAILABLE"
							};
							model.addRow(rowData);

							JOptionPane.showMessageDialog(popup, 
									"Equipment added successfully!",
									"Success",
									JOptionPane.INFORMATION_MESSAGE);
							popup.dispose();
						} else {
							JOptionPane.showMessageDialog(popup, 
									result,
									"Error",
									JOptionPane.ERROR_MESSAGE);
							idField.setText("");
							idField.requestFocus();
						}
					}
				});

				popup.setVisible(true);
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
		panel.setLayout(null);
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

		addUsersWithUnapprovedFirst(users, model);

		scrollPane.setViewportView(Table);
		Table.setAutoCreateRowSorter(true);

		setupUserContextMenu(model, users);

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
				refreshUserTable(model, users);
			}
		});
		AdminViewPanel.add(newLabManagerAccountBtn);
		AdminViewPanel.revalidate();
		AdminViewPanel.repaint();
	}

	private void addUsersWithUnapprovedFirst(ArrayList<User> users, DefaultTableModel model) {
		model.setRowCount(0);

		ArrayList<User> unapprovedUsers = new ArrayList<>();
		ArrayList<User> approvedUsers = new ArrayList<>();

		for (User user : users) {
			if (user.getStatus()) {
				approvedUsers.add(user);
			} else {
				unapprovedUsers.add(user);
			}
		}

		for (User user : unapprovedUsers) {
			addUserToTable(user, model);
		}

		for (User user : approvedUsers) {
			addUserToTable(user, model);
		}
	}

	private void addUserToTable(User user, DefaultTableModel model) {
		String status = user.getStatus() ? "Approved" : "Pending Approval";
		String userType = user.getUserType().getType();

		Object[] rowData = {
				status,
				user.getEmail(),
				user.getName(),
				userType,
				user.getIDNum()
		};
		model.addRow(rowData);
	}

	private void setupUserContextMenu(DefaultTableModel model, ArrayList<User> users) {
		JPopupMenu userMenu = new JPopupMenu();

		JMenuItem approveItem = new JMenuItem("Approve User");
		JMenuItem rejectItem = new JMenuItem("Reject User");

		userMenu.add(approveItem);
		userMenu.add(rejectItem);

		approveItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int selectedRow = Table.getSelectedRow();
				if (selectedRow >= 0) {
					int modelRow = Table.convertRowIndexToModel(selectedRow);
					String status = Table.getModel().getValueAt(modelRow, 0).toString();
					String email = Table.getModel().getValueAt(modelRow, 1).toString();
					String name = Table.getModel().getValueAt(modelRow, 2).toString();

					if (status.equals("Approved")) {
						JOptionPane.showMessageDialog(AdminViewPanel,
								"This user is already approved!",
								"Information",
								JOptionPane.INFORMATION_MESSAGE);
						return;
					}

					int confirm = JOptionPane.showConfirmDialog(AdminViewPanel,
							"Approve user: " + name + " (" + email + ")?",
							"Confirm Approval",
							JOptionPane.YES_NO_OPTION,
							JOptionPane.QUESTION_MESSAGE);

					if (confirm == JOptionPane.YES_OPTION) {
						boolean success = UserController.getInstance().approveUser(email);

						if (success) {
							Table.getModel().setValueAt("Approved", modelRow, 0);
							JOptionPane.showMessageDialog(AdminViewPanel,
									"User approved successfully!",
									"Success",
									JOptionPane.INFORMATION_MESSAGE);
							refreshUserTable(model, users);
						} else {
							JOptionPane.showMessageDialog(AdminViewPanel,
									"Failed to approve user.",
									"Error",
									JOptionPane.ERROR_MESSAGE);
						}
					}
				}
			}
		});

		rejectItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int selectedRow = Table.getSelectedRow();
				if (selectedRow >= 0) {
					int modelRow = Table.convertRowIndexToModel(selectedRow);
					String status = Table.getModel().getValueAt(modelRow, 0).toString();
					String email = Table.getModel().getValueAt(modelRow, 1).toString();
					String name = Table.getModel().getValueAt(modelRow, 2).toString();
					String idNumber = Table.getModel().getValueAt(modelRow, 4).toString();

					if (status.equals("Approved")) {
						JOptionPane.showMessageDialog(AdminViewPanel,
								"Cannot reject an approved user!",
								"Error",
								JOptionPane.ERROR_MESSAGE);
						return;
					}

					int confirm = JOptionPane.showConfirmDialog(AdminViewPanel,
							"Are you sure you want to reject this user?\n\n" +
									"Name: " + name + "\n" +
									"Email: " + email + "\n" +
									"ID: " + idNumber,
									"Confirm Rejection",
									JOptionPane.YES_NO_OPTION,
									JOptionPane.WARNING_MESSAGE);

					if (confirm == JOptionPane.YES_OPTION) {
						boolean success = UserController.getInstance().removeUser(email);

						if (success) {
							model.removeRow(modelRow);
							JOptionPane.showMessageDialog(AdminViewPanel,
									"User rejected and removed successfully!",
									"Success",
									JOptionPane.INFORMATION_MESSAGE);
						} else {
							JOptionPane.showMessageDialog(AdminViewPanel,
									"Failed to reject user.",
									"Error",
									JOptionPane.ERROR_MESSAGE);
						}
					}
				}
			}
		});

		Table.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isRightMouseButton(e)) {
					int row = Table.rowAtPoint(e.getPoint());
					if (row >= 0) {
						Table.setRowSelectionInterval(row, row);
						userMenu.show(Table, e.getX(), e.getY());
					}
				}
			}
		});
	}

	private void refreshUserTable(DefaultTableModel model, ArrayList<User> users) {
		if (users != null) {
			addUsersWithUnapprovedFirst(users, model);
		}
	}

	public void regularView(ArrayList<Reservation> res, ArrayList<Equipment> equipments) {
		AdminViewPanel = new JPanel();
		AdminViewPanel.setBounds(0, 0, 800, 600);
		AdminViewPanel.setLayout(null);
		frame.getContentPane().add(AdminViewPanel);

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
				"End Time",
				"Status"
		};

		DefaultTableModel model = new DefaultTableModel(columnHeaders, 0);
		table = new JTable(model);

		table.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		table.setAutoCreateRowSorter(true);
		addReservationsSorted(res, model);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0, 0, 604, 492);
		panel.add(scrollPane);

		JLabel welcomeLabel = new JLabel("Welcome " + UserController.getLoggedInUser().getName());
		welcomeLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		welcomeLabel.setBounds(37, 6, 500, 34);
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

		// Pass the table and model to setupReservationContextMenu
		setupReservationContextMenu(table, model, res);

		JButton newReservationBtn = new JButton("New Reservation");
		newReservationBtn.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		newReservationBtn.setBounds(612, 18, 171, 49);
		newReservationBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ReservationView r = new ReservationView(equipments, instance);
				setAdminViewVisibility(false);
				r.setReservationViewVisibility(true);
			}
		});
		AdminViewPanel.add(newReservationBtn);

		AdminViewPanel.revalidate();
		AdminViewPanel.repaint();
	}

	private void setupReservationContextMenu(JTable table, DefaultTableModel model, ArrayList<Reservation> res) {
		JPopupMenu reservationMenu = new JPopupMenu();
		
		// Cancel Reservation option
		JMenuItem cancelItem = new JMenuItem("Cancel Reservation");
		// Extend Reservation option
		JMenuItem extendItem = new JMenuItem("Extend Reservation");
		
		reservationMenu.add(cancelItem);
		reservationMenu.add(extendItem);

		// Cancel Reservation Action
		cancelItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int selectedRow = table.getSelectedRow();
				if (selectedRow >= 0) {
					int modelRow = table.convertRowIndexToModel(selectedRow);
					String reservationId = table.getModel().getValueAt(modelRow, 0).toString();
					String status = table.getModel().getValueAt(modelRow, 4).toString();

					Reservation selectedReservation = findReservationById(reservationId, res);

					if (selectedReservation != null) {
						if (status.equals("Missed") || status.equals("Completed")) {
							JOptionPane.showMessageDialog(AdminViewPanel,
									"Cannot cancel a reservation that has already passed!",
									"Invalid Action",
									JOptionPane.WARNING_MESSAGE);
							return;
						}

						int confirm = JOptionPane.showConfirmDialog(AdminViewPanel,
								"Are you sure you want to CANCEL this reservation?\n\n" +
								"Reservation ID: " + reservationId + "\n" +
								"Equipment: " + selectedReservation.getEquipmentID() + "\n" +
								"Start Time: " + selectedReservation.getStartTime() + "\n" +
								"End Time: " + selectedReservation.getEndTime() + "\n\n" +
								"This action cannot be undone!",
								"Confirm Cancellation",
								JOptionPane.YES_NO_OPTION,
								JOptionPane.WARNING_MESSAGE);

						if (confirm == JOptionPane.YES_OPTION) {
							boolean success = ReservationController.getInstance()
									.cancelReservation(reservationId);
							
							if (success) {
								JOptionPane.showMessageDialog(AdminViewPanel,
									"Reservation cancelled successfully!",
									"Success",
									JOptionPane.INFORMATION_MESSAGE);
								refreshRegularView();
							} else {
								JOptionPane.showMessageDialog(AdminViewPanel,
									"Failed to cancel reservation.",
									"Error",
									JOptionPane.ERROR_MESSAGE);
							}
						}
					}
				}
			}
		});

		// Extend Reservation Action
		extendItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int selectedRow = table.getSelectedRow();
				if (selectedRow >= 0) {
					int modelRow = table.convertRowIndexToModel(selectedRow);
					String reservationId = table.getModel().getValueAt(modelRow, 0).toString();
					String status = table.getModel().getValueAt(modelRow, 4).toString();

					Reservation selectedReservation = findReservationById(reservationId, res);

					if (selectedReservation != null) {
						if (status.equals("Missed") || status.equals("Completed")) {
							JOptionPane.showMessageDialog(AdminViewPanel,
									"Cannot extend a reservation that has already ended!",
									"Invalid Action",
									JOptionPane.WARNING_MESSAGE);
							return;
						}

						// Create popup dialog for extension
						JDialog extendDialog = new JDialog();
						extendDialog.setTitle("Extend Reservation");
						extendDialog.setModal(true);
						extendDialog.setSize(450, 350);
						extendDialog.setLocationRelativeTo(null);
						extendDialog.setLayout(null);

						JLabel infoLabel = new JLabel("Current End Time: " + selectedReservation.getEndTime());
						infoLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
						infoLabel.setBounds(20, 20, 400, 25);
						extendDialog.add(infoLabel);

						JLabel newEndLabel = new JLabel("New End Time:");
						newEndLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
						newEndLabel.setBounds(20, 60, 100, 25);
						extendDialog.add(newEndLabel);

						// Create date/time pickers
						JComboBox<String> yearCombo = createYearCombo();
						yearCombo.setBounds(120, 60, 80, 25);
						extendDialog.add(yearCombo);

						JComboBox<String> monthCombo = createMonthCombo();
						monthCombo.setBounds(210, 60, 60, 25);
						extendDialog.add(monthCombo);

						JComboBox<String> dayCombo = createDayCombo();
						dayCombo.setBounds(280, 60, 60, 25);
						extendDialog.add(dayCombo);

						JComboBox<String> hourCombo = createHourCombo();
						hourCombo.setBounds(350, 60, 80, 25);
						extendDialog.add(hourCombo);

						JLabel hoursLabel = new JLabel("Additional Hours:");
						hoursLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
						hoursLabel.setBounds(20, 100, 120, 25);
						extendDialog.add(hoursLabel);

						JSpinner hoursSpinner = new JSpinner(new SpinnerNumberModel(1, 1, 72, 1));
						hoursSpinner.setBounds(140, 100, 80, 25);
						extendDialog.add(hoursSpinner);

						JLabel noteLabel = new JLabel("Note: The new end time must be after the current end time");
						noteLabel.setFont(new Font("Times New Roman", Font.ITALIC, 10));
						noteLabel.setBounds(20, 140, 400, 20);
						extendDialog.add(noteLabel);

						JButton extendConfirmBtn = new JButton("Extend");
						extendConfirmBtn.setBounds(150, 180, 100, 30);
						extendConfirmBtn.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent ev) {
								try {
									int year = Integer.parseInt((String) yearCombo.getSelectedItem());
									int month = Integer.parseInt((String) monthCombo.getSelectedItem());
									int day = Integer.parseInt((String) dayCombo.getSelectedItem());
									String hourStr = (String) hourCombo.getSelectedItem();
									int hour = Integer.parseInt(hourStr.split(":")[0]);
									int additionalHours = (Integer) hoursSpinner.getValue();

									LocalDateTime selectedEndTime = LocalDateTime.of(year, month, day, hour, 0, 0);
									LocalDateTime newEndTime = selectedEndTime.plusHours(additionalHours);
									
									LocalDateTime currentStartTime = selectedReservation.getStartTime();
									LocalDateTime currentEndTime = selectedReservation.getEndTime();
									
									// Validate new end time is after current end time
									if (!newEndTime.isAfter(currentEndTime)) {
										JOptionPane.showMessageDialog(extendDialog,
											"New end time must be after the current end time!\n" +
											"Current: " + currentEndTime,
											"Validation Error",
											JOptionPane.WARNING_MESSAGE);
										return;
									}
									
									// Validate within 3 months from current end time
									LocalDateTime threeMonthsFromNow = LocalDateTime.now().plusMonths(3);
									if (newEndTime.isAfter(threeMonthsFromNow)) {
										JOptionPane.showMessageDialog(extendDialog,
											"Reservation cannot be extended beyond " + threeMonthsFromNow,
											"Validation Error",
											JOptionPane.WARNING_MESSAGE);
										return;
									}
									
									// Check for time conflicts (only check the extended period)
									boolean isAvailable = ReservationController.getInstance()
											.isTimeSlotAvailable(selectedReservation.getEquipmentID(), 
													currentEndTime, newEndTime);
									
									if (!isAvailable) {
										JOptionPane.showMessageDialog(extendDialog,
											"The requested extension time conflicts with another reservation!\n" +
											"Please choose a different end time.",
											"Time Conflict",
											JOptionPane.ERROR_MESSAGE);
										return;
									}
									
									// Show confirmation
									int confirm = JOptionPane.showConfirmDialog(extendDialog,
										"Confirm Extension?\n\n" +
										"Reservation ID: " + reservationId + "\n" +
										"Current End Time: " + currentEndTime + "\n" +
										"New End Time: " + newEndTime + "\n" +
										"Additional Hours: " + additionalHours,
										"Confirm Extension",
										JOptionPane.YES_NO_OPTION,
										JOptionPane.QUESTION_MESSAGE);
									
									if (confirm == JOptionPane.YES_OPTION) {
										boolean success = ReservationController.getInstance()
												.updateReservation(reservationId, 
														selectedReservation.getEquipmentID(),
														currentStartTime, newEndTime);
										
										if (success) {
											JOptionPane.showMessageDialog(extendDialog,
												"Reservation extended successfully!",
												"Success",
												JOptionPane.INFORMATION_MESSAGE);
											extendDialog.dispose();
											refreshRegularView();
										} else {
											JOptionPane.showMessageDialog(extendDialog,
												"Failed to extend reservation.",
												"Error",
												JOptionPane.ERROR_MESSAGE);
										}
									}
								} catch (Exception ex) {
									JOptionPane.showMessageDialog(extendDialog,
										"Invalid date/time selection!",
										"Error",
										JOptionPane.ERROR_MESSAGE);
								}
							}
						});
						extendDialog.add(extendConfirmBtn);
						
						JButton cancelBtn = new JButton("Cancel");
						cancelBtn.setBounds(260, 180, 100, 30);
						cancelBtn.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								extendDialog.dispose();
							}
						});
						extendDialog.add(cancelBtn);
						
						// Set default values to current end time
						LocalDateTime currentEnd = selectedReservation.getEndTime();
						yearCombo.setSelectedItem(String.valueOf(currentEnd.getYear()));
						monthCombo.setSelectedItem(String.format("%02d", currentEnd.getMonthValue()));
						dayCombo.setSelectedItem(String.format("%02d", currentEnd.getDayOfMonth()));
						hourCombo.setSelectedItem(String.format("%02d:00", currentEnd.getHour()));
						
						extendDialog.setVisible(true);
					}
				}
			}
		});

		// Add mouse listener to the table
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isRightMouseButton(e)) {
					int row = table.rowAtPoint(e.getPoint());
					if (row >= 0) {
						table.setRowSelectionInterval(row, row);
						reservationMenu.show(table, e.getX(), e.getY());
					}
				}
			}
		});
	}

	private void addReservationsSorted(ArrayList<Reservation> reservations, DefaultTableModel model) {
		model.setRowCount(0);

		ArrayList<Reservation> sortedReservations = new ArrayList<>(reservations);
		sortedReservations.sort(Comparator.comparing(Reservation::getStartTime));

		LocalDateTime currentDate = LocalDateTime.now();

		for (Reservation reservation : sortedReservations) {
			String status = determineReservationStatus(reservation, currentDate);
			Object[] rowData = {
					reservation.getReservationId(),
					reservation.getEquipmentID(),
					reservation.getStartTime(),
					reservation.getEndTime(),
					status
			};
			model.addRow(rowData);
		}
	}

	private String determineReservationStatus(Reservation reservation, LocalDateTime currentDate) {
		LocalDateTime endTime = reservation.getEndTime();

		if (endTime.isBefore(currentDate)) {
			if (reservation.getState() instanceof CompletedState) {
				return "Completed";
			} else {
				return "Missed";
			}
		} else {
			return "Upcoming";
		}
	}

//	private void setupReservationContextMenu(DefaultTableModel model, ArrayList<Reservation> res) {
//		JPopupMenu reservationMenu = new JPopupMenu();
//		
//		// Cancel Reservation option
//		JMenuItem cancelItem = new JMenuItem("Cancel Reservation");
//		// Extend Reservation option
//		JMenuItem extendItem = new JMenuItem("Extend Reservation");
//		
//		reservationMenu.add(cancelItem);
//		reservationMenu.add(extendItem);
//
//		// Cancel Reservation Action
//		cancelItem.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				int selectedRow = table.getSelectedRow();
//				if (selectedRow >= 0) {
//					int modelRow = table.convertRowIndexToModel(selectedRow);
//					String reservationId = table.getModel().getValueAt(modelRow, 0).toString();
//					String status = table.getModel().getValueAt(modelRow, 4).toString();
//
//					Reservation selectedReservation = findReservationById(reservationId, res);
//
//					if (selectedReservation != null) {
//						if (status.equals("Missed") || status.equals("Completed")) {
//							JOptionPane.showMessageDialog(AdminViewPanel,
//									"Cannot cancel a reservation that has already passed!",
//									"Invalid Action",
//									JOptionPane.WARNING_MESSAGE);
//							return;
//						}
//
//						int confirm = JOptionPane.showConfirmDialog(AdminViewPanel,
//								"Are you sure you want to CANCEL this reservation?\n\n" +
//								"Reservation ID: " + reservationId + "\n" +
//								"Equipment: " + selectedReservation.getEquipmentID() + "\n" +
//								"Start Time: " + selectedReservation.getStartTime() + "\n" +
//								"End Time: " + selectedReservation.getEndTime() + "\n\n" +
//								"This action cannot be undone!",
//								"Confirm Cancellation",
//								JOptionPane.YES_NO_OPTION,
//								JOptionPane.WARNING_MESSAGE);
//
//						if (confirm == JOptionPane.YES_OPTION) {
//							boolean success = ReservationController.getInstance()
//									.cancelReservation(reservationId);
//							
//							if (success) {
//								JOptionPane.showMessageDialog(AdminViewPanel,
//									"Reservation cancelled successfully!",
//									"Success",
//									JOptionPane.INFORMATION_MESSAGE);
//								refreshRegularView();
//							} else {
//								JOptionPane.showMessageDialog(AdminViewPanel,
//									"Failed to cancel reservation.",
//									"Error",
//									JOptionPane.ERROR_MESSAGE);
//							}
//						}
//					}
//				}
//			}
//		});
//
//		// Extend Reservation Action
//		extendItem.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				int selectedRow = table.getSelectedRow();
//				if (selectedRow >= 0) {
//					int modelRow = table.convertRowIndexToModel(selectedRow);
//					String reservationId = table.getModel().getValueAt(modelRow, 0).toString();
//					String status = table.getModel().getValueAt(modelRow, 4).toString();
//
//					Reservation selectedReservation = findReservationById(reservationId, res);
//
//					if (selectedReservation != null) {
//						if (status.equals("Missed") || status.equals("Completed")) {
//							JOptionPane.showMessageDialog(AdminViewPanel,
//									"Cannot extend a reservation that has already ended!",
//									"Invalid Action",
//									JOptionPane.WARNING_MESSAGE);
//							return;
//						}
//
//						// Create popup dialog for extension
//						JDialog extendDialog = new JDialog();
//						extendDialog.setTitle("Extend Reservation");
//						extendDialog.setModal(true);
//						extendDialog.setSize(450, 350);
//						extendDialog.setLocationRelativeTo(null);
//						extendDialog.setLayout(null);
//
//						JLabel infoLabel = new JLabel("Current End Time: " + selectedReservation.getEndTime());
//						infoLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
//						infoLabel.setBounds(20, 20, 400, 25);
//						extendDialog.add(infoLabel);
//
//						JLabel newEndLabel = new JLabel("New End Time:");
//						newEndLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
//						newEndLabel.setBounds(20, 60, 100, 25);
//						extendDialog.add(newEndLabel);
//
//						// Create date/time pickers
//						JComboBox<String> yearCombo = createYearCombo();
//						yearCombo.setBounds(120, 60, 80, 25);
//						extendDialog.add(yearCombo);
//
//						JComboBox<String> monthCombo = createMonthCombo();
//						monthCombo.setBounds(210, 60, 60, 25);
//						extendDialog.add(monthCombo);
//
//						JComboBox<String> dayCombo = createDayCombo();
//						dayCombo.setBounds(280, 60, 60, 25);
//						extendDialog.add(dayCombo);
//
//						JComboBox<String> hourCombo = createHourCombo();
//						hourCombo.setBounds(350, 60, 80, 25);
//						extendDialog.add(hourCombo);
//
//						JLabel hoursLabel = new JLabel("Additional Hours:");
//						hoursLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
//						hoursLabel.setBounds(20, 100, 120, 25);
//						extendDialog.add(hoursLabel);
//
//						JSpinner hoursSpinner = new JSpinner(new SpinnerNumberModel(1, 1, 72, 1));
//						hoursSpinner.setBounds(140, 100, 80, 25);
//						extendDialog.add(hoursSpinner);
//
//						JLabel noteLabel = new JLabel("Note: The new end time must be after the current end time");
//						noteLabel.setFont(new Font("Times New Roman", Font.ITALIC, 10));
//						noteLabel.setBounds(20, 140, 400, 20);
//						extendDialog.add(noteLabel);
//
//						JButton extendConfirmBtn = new JButton("Extend");
//						extendConfirmBtn.setBounds(150, 180, 100, 30);
//						extendConfirmBtn.addActionListener(new ActionListener() {
//							@Override
//							public void actionPerformed(ActionEvent ev) {
//								try {
//									int year = Integer.parseInt((String) yearCombo.getSelectedItem());
//									int month = Integer.parseInt((String) monthCombo.getSelectedItem());
//									int day = Integer.parseInt((String) dayCombo.getSelectedItem());
//									String hourStr = (String) hourCombo.getSelectedItem();
//									int hour = Integer.parseInt(hourStr.split(":")[0]);
//									int additionalHours = (Integer) hoursSpinner.getValue();
//
//									LocalDateTime selectedEndTime = LocalDateTime.of(year, month, day, hour, 0, 0);
//									LocalDateTime newEndTime = selectedEndTime.plusHours(additionalHours);
//									
//									LocalDateTime currentStartTime = selectedReservation.getStartTime();
//									LocalDateTime currentEndTime = selectedReservation.getEndTime();
//									
//									// Validate new end time is after current end time
//									if (!newEndTime.isAfter(currentEndTime)) {
//										JOptionPane.showMessageDialog(extendDialog,
//											"New end time must be after the current end time!\n" +
//											"Current: " + currentEndTime,
//											"Validation Error",
//											JOptionPane.WARNING_MESSAGE);
//										return;
//									}
//									
//									// Validate within 3 months from current end time
//									LocalDateTime threeMonthsFromNow = LocalDateTime.now().plusMonths(3);
//									if (newEndTime.isAfter(threeMonthsFromNow)) {
//										JOptionPane.showMessageDialog(extendDialog,
//											"Reservation cannot be extended beyond " + threeMonthsFromNow,
//											"Validation Error",
//											JOptionPane.WARNING_MESSAGE);
//										return;
//									}
//									
//									// Check for time conflicts (only check the extended period)
//									boolean isAvailable = ReservationController.getInstance()
//											.isTimeSlotAvailable(selectedReservation.getEquipmentID(), 
//													currentEndTime, newEndTime);
//									
//									if (!isAvailable) {
//										JOptionPane.showMessageDialog(extendDialog,
//											"The requested extension time conflicts with another reservation!\n" +
//											"Please choose a different end time.",
//											"Time Conflict",
//											JOptionPane.ERROR_MESSAGE);
//										return;
//									}
//									
//									// Show confirmation
//									int confirm = JOptionPane.showConfirmDialog(extendDialog,
//										"Confirm Extension?\n\n" +
//										"Reservation ID: " + reservationId + "\n" +
//										"Current End Time: " + currentEndTime + "\n" +
//										"New End Time: " + newEndTime + "\n" +
//										"Additional Hours: " + additionalHours,
//										"Confirm Extension",
//										JOptionPane.YES_NO_OPTION,
//										JOptionPane.QUESTION_MESSAGE);
//									
//									if (confirm == JOptionPane.YES_OPTION) {
//										boolean success = ReservationController.getInstance()
//												.updateReservation(reservationId, 
//														selectedReservation.getEquipmentID(),
//														currentStartTime, newEndTime);
//										
//										if (success) {
//											JOptionPane.showMessageDialog(extendDialog,
//												"Reservation extended successfully!",
//												"Success",
//												JOptionPane.INFORMATION_MESSAGE);
//											extendDialog.dispose();
//											refreshRegularView();
//										} else {
//											JOptionPane.showMessageDialog(extendDialog,
//												"Failed to extend reservation.",
//												"Error",
//												JOptionPane.ERROR_MESSAGE);
//										}
//									}
//								} catch (Exception ex) {
//									JOptionPane.showMessageDialog(extendDialog,
//										"Invalid date/time selection!",
//										"Error",
//										JOptionPane.ERROR_MESSAGE);
//								}
//							}
//						});
//						extendDialog.add(extendConfirmBtn);
//						
//						JButton cancelBtn = new JButton("Cancel");
//						cancelBtn.setBounds(260, 180, 100, 30);
//						cancelBtn.addActionListener(new ActionListener() {
//							@Override
//							public void actionPerformed(ActionEvent e) {
//								extendDialog.dispose();
//							}
//						});
//						extendDialog.add(cancelBtn);
//						
//						// Set default values to current end time
//						LocalDateTime currentEnd = selectedReservation.getEndTime();
//						yearCombo.setSelectedItem(String.valueOf(currentEnd.getYear()));
//						monthCombo.setSelectedItem(String.format("%02d", currentEnd.getMonthValue()));
//						dayCombo.setSelectedItem(String.format("%02d", currentEnd.getDayOfMonth()));
//						hourCombo.setSelectedItem(String.format("%02d:00", currentEnd.getHour()));
//						
//						extendDialog.setVisible(true);
//					}
//				}
//			}
//		});
//
//		table.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mousePressed(MouseEvent e) {
//				if (SwingUtilities.isRightMouseButton(e)) {
//					int row = table.rowAtPoint(e.getPoint());
//					if (row >= 0) {
//						table.setRowSelectionInterval(row, row);
//						reservationMenu.show(table, e.getX(), e.getY());
//					}
//				}
//			}
//		});
//	}

	private JComboBox<String> createYearCombo() {
		JComboBox<String> combo = new JComboBox<>();
		java.util.Calendar cal = java.util.Calendar.getInstance();
		int currentYear = cal.get(java.util.Calendar.YEAR);
		for (int i = currentYear; i <= currentYear + 1; i++) {
			combo.addItem(String.valueOf(i));
		}
		return combo;
	}

	private JComboBox<String> createMonthCombo() {
		JComboBox<String> combo = new JComboBox<>();
		for (int i = 1; i <= 12; i++) {
			combo.addItem(String.format("%02d", i));
		}
		return combo;
	}

	private JComboBox<String> createDayCombo() {
		JComboBox<String> combo = new JComboBox<>();
		for (int i = 1; i <= 31; i++) {
			combo.addItem(String.format("%02d", i));
		}
		return combo;
	}

	private JComboBox<String> createHourCombo() {
		JComboBox<String> combo = new JComboBox<>();
		for (int i = 0; i <= 23; i++) {
			combo.addItem(String.format("%02d:00", i));
		}
		return combo;
	}

	private Reservation findReservationById(String id, ArrayList<Reservation> reservations) {
		for (Reservation r : reservations) {
			if (r.getReservationId().equals(id)) {
				return r;
			}
		}
		return null;
	}

	private void addEquipment(ArrayList<Equipment> equipments, DefaultTableModel model) {
		if(equipments != null) {
			for(Equipment e : equipments) {
				Object[] rowData = {
						e.getEquipmentId(),
						e.getName(),
						e.getDescription(),
						e.getLabLocation(),
						e.getStatus()
				};
				model.addRow(rowData);
			}
		}
	}

	public void setAdminViewVisibility(boolean b) {
		if (b) {
			if (currentUserType != UserType.HEADLABCOORDINATOR && currentUserType != UserType.LABMANAGER) {
				currentReservations = ReservationController.getInstance().getMyReservations();
				refreshReservationTable();
			}
			frame.getContentPane().removeAll();
			frame.getContentPane().add(AdminViewPanel);
			frame.revalidate();
			frame.repaint();
			AdminViewPanel.setVisible(true);
		} else {
			AdminViewPanel.setVisible(false);
		}
	}
}