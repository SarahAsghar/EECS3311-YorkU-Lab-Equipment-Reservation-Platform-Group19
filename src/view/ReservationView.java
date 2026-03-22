package view;

import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controller.EquipmentController;
import controller.ReservationController;
import controller.UserController;
import model.Equipment.Equipment;
import model.Equipment.EquipmentStatus;
import model.Reservation.Reservation;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ReservationView {
	private JPanel ReservationViewPanel;
	private JFrame frame = LoginView.getFrame();
	private JTable Table;
	private JTextField emailField;
	private JTextField equipmentIdField;
	private JComboBox<String> startYearCombo;
	private JComboBox<String> startMonthCombo;
	private JComboBox<String> startDayCombo;
	private JComboBox<String> startHourCombo;
	private JComboBox<String> endYearCombo;
	private JComboBox<String> endMonthCombo;
	private JComboBox<String> endDayCombo;
	private JComboBox<String> endHourCombo;
	private String currentUserEmail;
	private Equipment selectedEquipment;
	private ArrayList<Equipment> equipmentList;
	private JLabel hoursValueLabel = new JLabel("0.00");
	private JLabel formTitle;
	private JButton paymentBtn;
	private JPanel formPanel;
	private Reservation selectedReservation;

	public ReservationView(ArrayList<Equipment> equipments, AdminView instance) {
		this.equipmentList = equipments;
		this.selectedReservation = null;

		currentUserEmail = UserController.getLoggedInUser().getEmail();

		ReservationViewPanel = new JPanel();
		ReservationViewPanel.setBounds(0, 0, 800, 600);
		ReservationViewPanel.setLayout(null);
		frame.getContentPane().add(ReservationViewPanel);

		JLabel allEquipmentLabel = new JLabel("ALL EQUIPMENT");
		allEquipmentLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		allEquipmentLabel.setBounds(37, 6, 400, 34);
		ReservationViewPanel.add(allEquipmentLabel);

		JPanel tablePanel = new JPanel();
		tablePanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		tablePanel.setBackground(new Color(255, 255, 255));
		tablePanel.setBounds(37, 50, 379, 527);
		tablePanel.setLayout(null);
		ReservationViewPanel.add(tablePanel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 367, 504);
		tablePanel.add(scrollPane);

		String[] columnHeaders = {
				"Equipment ID",
				"Name",
				"Description",
				"Lab Location"
		};

		DefaultTableModel model = new DefaultTableModel(columnHeaders, 0);
		Table = new JTable(model);
		Table.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		scrollPane.setViewportView(Table);
		Table.setAutoCreateRowSorter(true);

		addEquipment(equipments, model);

		Table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int selectedRow = Table.getSelectedRow();
				if (selectedRow >= 0) {
					int modelRow = Table.convertRowIndexToModel(selectedRow);
					String equipmentId = Table.getModel().getValueAt(modelRow, 0).toString();

					for (Equipment eq : equipmentList) {
						if (eq.getEquipmentId().equals(equipmentId)) {
							selectedEquipment = eq;
							equipmentIdField.setText(selectedEquipment.getEquipmentId());
							break;
						}
					}
				}
			}
		});

		formPanel = new JPanel();
		formPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		formPanel.setBackground(new Color(255, 255, 255));
		formPanel.setBounds(437, 50, 280, 477);
		ReservationViewPanel.add(formPanel);
		formPanel.setLayout(null);

		formTitle = new JLabel("Reserve Equipment");
		formTitle.setBounds(20, 10, 200, 30);
		formTitle.setFont(new Font("Times New Roman", Font.BOLD, 20));
		formPanel.add(formTitle);

		JLabel emailLabel = new JLabel("Email:");
		emailLabel.setBounds(20, 50, 80, 25);
		emailLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		formPanel.add(emailLabel);

		emailField = new JTextField(currentUserEmail);
		emailField.setBounds(100, 50, 157, 25);
		emailField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		emailField.setEditable(false);
		formPanel.add(emailField);

		JLabel equipmentIdLabel = new JLabel("Equipment ID:");
		equipmentIdLabel.setBounds(20, 85, 100, 25);
		equipmentIdLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		formPanel.add(equipmentIdLabel);

		equipmentIdField = new JTextField();
		equipmentIdField.setBounds(120, 85, 100, 25);
		equipmentIdField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		equipmentIdField.setEditable(false);
		formPanel.add(equipmentIdField);

		JLabel startLabel = new JLabel("Start Time:");
		startLabel.setBounds(20, 122, 80, 25);
		startLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		formPanel.add(startLabel);

		startYearCombo = createYearCombo();
		startYearCombo.setBounds(20, 155, 100, 25);
		formPanel.add(startYearCombo);

		startMonthCombo = createMonthCombo();
		startMonthCombo.setBounds(140, 155, 117, 25);
		formPanel.add(startMonthCombo);

		startDayCombo = createDayCombo();
		startDayCombo.setBounds(20, 190, 100, 25);
		formPanel.add(startDayCombo);

		startHourCombo = createHourCombo();
		startHourCombo.setBounds(140, 190, 117, 25);
		formPanel.add(startHourCombo);

		JLabel endLabel = new JLabel("End Time:");
		endLabel.setBounds(20, 235, 80, 25);
		endLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		formPanel.add(endLabel);

		endYearCombo = createYearCombo();
		endYearCombo.setBounds(20, 270, 100, 25);
		formPanel.add(endYearCombo);

		endMonthCombo = createMonthCombo();
		endMonthCombo.setBounds(140, 270, 117, 25);
		formPanel.add(endMonthCombo);

		endDayCombo = createDayCombo();
		endDayCombo.setBounds(20, 305, 100, 25);
		formPanel.add(endDayCombo);

		endHourCombo = createHourCombo();
		endHourCombo.setBounds(140, 305, 117, 25);
		formPanel.add(endHourCombo);

		JLabel hoursLabel = new JLabel("Number of Hours:");
		hoursLabel.setBounds(20, 360, 120, 25);
		hoursLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		formPanel.add(hoursLabel);
		
		hoursValueLabel.setBounds(140, 360, 100, 25);
		hoursValueLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		hoursValueLabel.setBackground(Color.WHITE);
		hoursValueLabel.setOpaque(true);
		hoursValueLabel.setBorder(new LineBorder(new Color(200, 200, 200), 1));
		formPanel.add(hoursValueLabel);
		
		paymentBtn = new JButton("Go to Payment");
		paymentBtn.setBounds(70, 410, 130, 35);
		paymentBtn.setFont(new Font("Times New Roman", Font.BOLD, 18));
		paymentBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ReservationView ins = getInstance();
				Reservation r = ReservationController.getInstance().createReservation(selectedReservation);
				PaymentView v = new PaymentView(ins, r );
			}

		});
		formPanel.add(paymentBtn);

		addTimeListeners();

		JButton backBtn = new JButton("Back");
		backBtn.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		backBtn.setBounds(666, 536, 117, 38);
		backBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setReservationViewVisibility(false);
				instance.setAdminViewVisibility(true);
			}
		});
		ReservationViewPanel.add(backBtn);

		setDefaultDates();
		ReservationViewPanel.repaint();
		ReservationViewPanel.revalidate();
	}
	
	private ReservationView getInstance() {
		return this;
	}

	public ReservationView(Reservation selectedReservation, AdminView instance) {
		this(EquipmentController.getInstance().getAllEquipment(), instance);
		
		this.selectedReservation = selectedReservation;
		
		if (selectedReservation != null) {
			String reservedEquipmentId = selectedReservation.getEquipmentID();
			equipmentIdField.setText(reservedEquipmentId);
			
			for (int i = 0; i < Table.getRowCount(); i++) {
				String equipmentId = Table.getValueAt(i, 0).toString();
				if (equipmentId.equals(reservedEquipmentId)) {
					Table.setRowSelectionInterval(i, i);
					for (Equipment eq : equipmentList) {
						if (eq.getEquipmentId().equals(equipmentId)) {
							selectedEquipment = eq;
							break;
						}
					}
					break;
				}
			}
			
			populateDateTimeFields(selectedReservation);
			formTitle.setText("Modify/Cancel Reservation");
			replaceButtonsForModification(selectedReservation, instance);
		}
	}

	private void addEquipment(ArrayList<Equipment> equipments, DefaultTableModel model) {
		if(equipments != null) {
			for(Equipment e : equipments) {
				if(e.getStatus() == EquipmentStatus.AVAILABLE) {
					Object[] rowData = {
							e.getEquipmentId(),
							e.getName(),
							e.getDescription(),
							e.getLabLocation()};
					model.addRow(rowData);
				}
			}
		}
	}

	private JComboBox<String> createYearCombo() {
		JComboBox<String> combo = new JComboBox<>();
		Date now = new Date();
		Calendar cal = Calendar.getInstance();
		int currentYear = cal.get(Calendar.YEAR);

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

	private void addTimeListeners() {
		ActionListener updateListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calculateHours();
			}
		};

		startYearCombo.addActionListener(updateListener);
		startMonthCombo.addActionListener(updateListener);
		startDayCombo.addActionListener(updateListener);
		startHourCombo.addActionListener(updateListener);
		endYearCombo.addActionListener(updateListener);
		endMonthCombo.addActionListener(updateListener);
		endDayCombo.addActionListener(updateListener);
		endHourCombo.addActionListener(updateListener);
	}

	private void calculateHours() {
	    try {
	        Date startDate = getDateFromComponents(startYearCombo, startMonthCombo, startDayCombo, startHourCombo);
	        Date endDate = getDateFromComponents(endYearCombo, endMonthCombo, endDayCombo, endHourCombo);
	        
	        if (startDate != null && endDate != null && endDate.after(startDate)) {
	            long diffInMillis = endDate.getTime() - startDate.getTime();
	            double hours = diffInMillis / (1000.0 * 60 * 60);
	            hoursValueLabel.setText(String.format("%.2f", hours));
	        } else {
	            hoursValueLabel.setText("0.00");
	        }
	    } catch (Exception e) {
	        hoursValueLabel.setText("0.00");
	    }
	}

	private Date getDateFromComponents(JComboBox<String> yearCombo, JComboBox<String> monthCombo, 
			JComboBox<String> dayCombo, JComboBox<String> hourCombo) {
		try {
			int year = Integer.parseInt((String) yearCombo.getSelectedItem());
			int month = Integer.parseInt((String) monthCombo.getSelectedItem()) - 1;
			int day = Integer.parseInt((String) dayCombo.getSelectedItem());
			String hourStr = (String) hourCombo.getSelectedItem();
			int hour = Integer.parseInt(hourStr.split(":")[0]);

			Calendar cal = Calendar.getInstance();
			cal.set(year, month, day, hour, 0, 0);
			cal.set(Calendar.MILLISECOND, 0);
			return cal.getTime();
		} catch (Exception e) {
			return null;
		}
	}

	private void setDefaultDates() {
		Date now = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(now);

		int currentHour = cal.get(Calendar.HOUR_OF_DAY);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		if (cal.getTime().before(now)) {
			cal.add(Calendar.HOUR_OF_DAY, 1);
		}

		startYearCombo.setSelectedItem(String.valueOf(cal.get(Calendar.YEAR)));
		startMonthCombo.setSelectedItem(String.format("%02d", cal.get(Calendar.MONTH) + 1));
		startDayCombo.setSelectedItem(String.format("%02d", cal.get(Calendar.DAY_OF_MONTH)));
		startHourCombo.setSelectedItem(String.format("%02d:00", cal.get(Calendar.HOUR_OF_DAY)));

		cal.add(Calendar.HOUR_OF_DAY, 1);
		endYearCombo.setSelectedItem(String.valueOf(cal.get(Calendar.YEAR)));
		endMonthCombo.setSelectedItem(String.format("%02d", cal.get(Calendar.MONTH) + 1));
		endDayCombo.setSelectedItem(String.format("%02d", cal.get(Calendar.DAY_OF_MONTH)));
		endHourCombo.setSelectedItem(String.format("%02d:00", cal.get(Calendar.HOUR_OF_DAY)));

		calculateHours();
	}
	
	private void populateDateTimeFields(Reservation reservation) {
		LocalDateTime startTime = reservation.getStartTime();
		LocalDateTime endTime = reservation.getEndTime();
		
		// Set start time
		startYearCombo.setSelectedItem(String.valueOf(startTime.getYear()));
		startMonthCombo.setSelectedItem(String.format("%02d", startTime.getMonthValue()));
		startDayCombo.setSelectedItem(String.format("%02d", startTime.getDayOfMonth()));
		startHourCombo.setSelectedItem(String.format("%02d:00", startTime.getHour()));
		
		// Set end time
		endYearCombo.setSelectedItem(String.valueOf(endTime.getYear()));
		endMonthCombo.setSelectedItem(String.format("%02d", endTime.getMonthValue()));
		endDayCombo.setSelectedItem(String.format("%02d", endTime.getDayOfMonth()));
		endHourCombo.setSelectedItem(String.format("%02d:00", endTime.getHour()));
		
		calculateHours();
	}
	
	private void replaceButtonsForModification(Reservation selectedReservation, AdminView instance) {
		// Remove the existing payment button
		if (paymentBtn != null) {
			formPanel.remove(paymentBtn);
		}
		
		// Create Update button
		JButton updateBtn = new JButton("Update Reservation");
		updateBtn.setBounds(70, 410, 130, 35);
		updateBtn.setFont(new Font("Times New Roman", Font.BOLD, 12));
		updateBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				updateReservation(selectedReservation, instance);
			}
		});
		formPanel.add(updateBtn);
		
		// Create Cancel button
		JButton cancelBtn = new JButton("Cancel Reservation");
		cancelBtn.setBounds(70, 450, 130, 35);
		cancelBtn.setFont(new Font("Times New Roman", Font.BOLD, 12));
		cancelBtn.setBackground(new Color(255, 100, 100));
		cancelBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cancelReservation(selectedReservation, instance);
			}
		});
		formPanel.add(cancelBtn);
		
		// Refresh the form panel
		formPanel.revalidate();
		formPanel.repaint();
	}
	
	private void updateReservation(Reservation oldReservation, AdminView instance) {
		if (!validateReservation()) {
			return;
		}
		
		Date startDate = getDateFromComponents(startYearCombo, startMonthCombo, startDayCombo, startHourCombo);
		Date endDate = getDateFromComponents(endYearCombo, endMonthCombo, endDayCombo, endHourCombo);
		double hours = Double.parseDouble(hoursValueLabel.getText());
		
		LocalDateTime newStartTime = LocalDateTime.ofInstant(startDate.toInstant(), ZoneId.systemDefault());
		LocalDateTime newEndTime = LocalDateTime.ofInstant(endDate.toInstant(), ZoneId.systemDefault());
		
		int confirm = JOptionPane.showConfirmDialog(ReservationViewPanel,
			"Are you sure you want to UPDATE this reservation?\n\n" +
			"Equipment: " + selectedEquipment.getName() + "\n" +
			"Original Start: " + oldReservation.getStartTime() + "\n" +
			"Original End: " + oldReservation.getEndTime() + "\n\n" +
			"New Start: " + newStartTime + "\n" +
			"New End: " + newEndTime + "\n" +
			"Duration: " + hours + " hours",
			"Confirm Update",
			JOptionPane.YES_NO_OPTION,
			JOptionPane.QUESTION_MESSAGE);
		
		if (confirm == JOptionPane.YES_OPTION) {
			boolean success = ReservationController.getInstance().updateReservation(
				oldReservation.getReservationId(),
				selectedEquipment.getEquipmentId(),
				newStartTime,
				newEndTime
			);
			
			if (success) {
				JOptionPane.showMessageDialog(ReservationViewPanel,
					"Reservation updated successfully!",
					"Success",
					JOptionPane.INFORMATION_MESSAGE);
				setReservationViewVisibility(false);
				instance.setAdminViewVisibility(true);
			} else {
				JOptionPane.showMessageDialog(ReservationViewPanel,
					"Failed to update reservation. The equipment may not be available at the selected times.",
					"Error",
					JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	private void cancelReservation(Reservation reservation, AdminView instance) {
		int confirm = JOptionPane.showConfirmDialog(ReservationViewPanel,
			"Are you sure you want to CANCEL this reservation?\n\n" +
			"Reservation ID: " + reservation.getReservationId() + "\n" +
			"Equipment: " + reservation.getEquipmentID() + "\n" +
			"Start Time: " + reservation.getStartTime() + "\n" +
			"End Time: " + reservation.getEndTime() + "\n\n" +
			"This action cannot be undone!",
			"Confirm Cancellation",
			JOptionPane.YES_NO_OPTION,
			JOptionPane.WARNING_MESSAGE);
		
		if (confirm == JOptionPane.YES_OPTION) {
			boolean success = ReservationController.getInstance().cancelReservation(reservation.getReservationId());
			
			if (success) {
				JOptionPane.showMessageDialog(ReservationViewPanel,
					"Reservation cancelled successfully!",
					"Success",
					JOptionPane.INFORMATION_MESSAGE);
				setReservationViewVisibility(false);
				instance.setAdminViewVisibility(true);
			} else {
				JOptionPane.showMessageDialog(ReservationViewPanel,
					"Failed to cancel reservation. Please try again.",
					"Error",
					JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	private boolean validateReservation() {
		if (selectedEquipment == null) {
			JOptionPane.showMessageDialog(ReservationViewPanel,
					"Please select equipment from the table.",
					"Error",
					JOptionPane.ERROR_MESSAGE);
			return false;
		}

		Date startDate = getDateFromComponents(startYearCombo, startMonthCombo, startDayCombo, startHourCombo);
		Date endDate = getDateFromComponents(endYearCombo, endMonthCombo, endDayCombo, endHourCombo);
		Date now = new Date();

		if (startDate.before(now)) {
			JOptionPane.showMessageDialog(ReservationViewPanel,
					"Start time cannot be in the past.",
					"Error",
					JOptionPane.ERROR_MESSAGE);
			return false;
		}

		if (!endDate.after(startDate)) {
			JOptionPane.showMessageDialog(ReservationViewPanel,
					"End time must be after start time.",
					"Error",
					JOptionPane.ERROR_MESSAGE);
			return false;
		}

		Calendar threeMonthsLater = Calendar.getInstance();
		threeMonthsLater.add(Calendar.MONTH, 3);

		if (startDate.after(threeMonthsLater.getTime()) || endDate.after(threeMonthsLater.getTime())) {
			JOptionPane.showMessageDialog(ReservationViewPanel,
					"Reservation cannot be more than 3 months in advance.",
					"Error",
					JOptionPane.ERROR_MESSAGE);
			return false;
		}

		return true;
	}
	
	private void processReservation() {
		if (!validateReservation()) {
			return;
		}
		
		Date startDate = getDateFromComponents(startYearCombo, startMonthCombo, startDayCombo, startHourCombo);
		Date endDate = getDateFromComponents(endYearCombo, endMonthCombo, endDayCombo, endHourCombo);
		double hours = Double.parseDouble(hoursValueLabel.getText());
		
		JOptionPane.showMessageDialog(ReservationViewPanel,
			"Proceeding to payment for reservation of " + selectedEquipment.getName() +
			"\nDuration: " + hours + " hours",
			"Payment",
			JOptionPane.INFORMATION_MESSAGE);
	}

	public void setReservationViewVisibility(boolean b) {
		ReservationViewPanel.setVisible(b);
		if (b) {
			frame.getContentPane().removeAll();
			frame.getContentPane().add(ReservationViewPanel);
			frame.revalidate();
			frame.repaint();
		}
	}
}