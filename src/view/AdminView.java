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
import java.util.ArrayList;

import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import controller.EquipmentController;
import controller.UserController;
import model.Equipment.Equipment;
import model.Equipment.EquipmentStatus;
import model.Reservation.Reservation;
import model.User.User;
import model.User.UserType;

import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import javax.swing.JDialog;

public class AdminView {

	private JPanel AdminViewPanel;
	private JTable table;
	private JFrame frame = LoginView.getFrame();
	private JTable Table;

	public AdminView(UserType usertype, ArrayList<Reservation> reservations, ArrayList<User> users, ArrayList<Equipment> equipments) {
		if(usertype == UserType.HEADLABCOORDINATOR) {
			headLabCoordinatorView(users);
		}
		else if (usertype == UserType.LABMANAGER) {
			LabManagerView(equipments);
		}
		else  { //regularView
			regularView(reservations);
		}

	}
	
	/**
	 * Will see equipment table, logout btn, add equipment btn
	 * Right click entry in table to enable, disable, or mark as unavailable
	 */
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
	    
	    // Populate the table FIRST before setting up context menu
	    addEquipment(equipments, model);
	    
	    // Set up context menu AFTER table is populated
	    JPopupMenu statusMenu = new JPopupMenu();
	    EquipmentStatus[] statuses = {
	        EquipmentStatus.AVAILABLE,
	        EquipmentStatus.RESERVED,
	        EquipmentStatus.DISABLED,
	        EquipmentStatus.MAINTENANCE,
	        EquipmentStatus.IN_USE
	    };

	    // FIXED: Create menu items with proper status capturing
	    for (EquipmentStatus status : statuses) {
	        JMenuItem menuItem = new JMenuItem("Set to " + status.name());
	        // Capture the current status value
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
	                            "Please fill in all required fields (Equipment ID, Name, and Lab Location)",
	                            "Validation Error",
	                            JOptionPane.WARNING_MESSAGE);
	                        return;
	                    }
	                    
	                    String result = EquipmentController.addEquipment(equipmentId, name, description, labLocation);
	                    
	                    if (result != null && result.equals("Good")) {
	                        Object[] rowData = {
	                            equipmentId,
	                            name,
	                            description,
	                            labLocation,
	                            "AVAILABLE"  
	                        };
	                        model.addRow(rowData);
	                        
	                        JOptionPane.showMessageDialog(popup, 
	                            "Equipment added successfully!",
	                            "Success",
	                            JOptionPane.INFORMATION_MESSAGE);
	                        popup.dispose();
	                    } else {
	                        JOptionPane.showMessageDialog(popup, 
	                            "Equipment ID is not unique. Equipment not added.",
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
	    String userType = "";
	    
	    UserType type = user.getUserType();
	    if (type != null) {
	        userType = type.getType(); 
	    } else {
	        userType = "Unknown";
	    }
	    
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
	    
	    // Approve action
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
	                        // Update the table
	                        Table.getModel().setValueAt("Approved", modelRow, 0);
	                        JOptionPane.showMessageDialog(AdminViewPanel,
	                            "User approved successfully!",
	                            "Success",
	                            JOptionPane.INFORMATION_MESSAGE);
	                        
	                        refreshUserTable(model, users);
	                    } else {
	                        JOptionPane.showMessageDialog(AdminViewPanel,
	                            "Failed to approve user. Please try again.",
	                            "Error",
	                            JOptionPane.ERROR_MESSAGE);
	                    }
	                }
	            }
	        }
	    });
	    
	    // Reject action
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
	                
	                // Confirm rejection with user details
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
	                            "Failed to reject user. Please try again.",
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
	
	private void addEquipment(ArrayList<Equipment> equipments, DefaultTableModel model) {
		if(equipments != null) {
			for(Equipment e : equipments) {
				Object[] rowData = {
						e.getEquipmentId(),
						e.getName(),
						e.getDescription(),
						e.getLabLocation(),
						e.getStatus()};
				model.addRow(rowData);
			}
		}

	}

	public void setAdminViewVisibility(boolean b) {
		AdminViewPanel.setVisible(b);
	}
}
