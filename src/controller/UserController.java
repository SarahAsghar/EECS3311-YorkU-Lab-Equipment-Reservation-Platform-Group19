package controller;

import java.util.ArrayList;

import model.DatabaseManager;
import model.Equipment.Equipment;
import model.Reservation.Reservation;
import model.User.User;
import model.User.*;
import view.AdminView;

public class UserController {

	private static UserController instance;
	private DatabaseManager db = DatabaseManager.getInstance();
	private static User LoggedInUser;
	

	public String loginUser(String email, String password) {
		ArrayList<User> users = db.loadUsers();

		//see if email and password match, 
		User user = null;
		for(User u: users) {
			if(u.getEmail().equals(email) && u.getPassword().equals(password)) {
				user = u;
				break;
			}
		}
		//if they do return user associated with it, create user and open view for user
		if(user != null) {
			UserType t = user.getUserType();
			ArrayList<Reservation> res = db.loadReservations();
			ArrayList<Equipment> e = db.loadEquipment();
			

			//if user is approved
			if(user.getStatus() == true) {
				LoggedInUser = user;
				
				if(t != UserType.HEADLABCOORDINATOR && t != UserType.LABMANAGER) {
					ArrayList<Reservation> userRes = new ArrayList<Reservation>();
					for(Reservation r: res) {
						if(r.getUserId().equals(user.getIDNum())) {
							userRes.add(r);
						}
					}
					
					AdminView v = new AdminView(t, userRes, users, e);
					
				}
				else  {
					AdminView v = new AdminView(t, res, users, e);
				}
				return "Good";
			}
			else {
				return "Department has not approved this account";
			}
			
		}
		else return "Fail";
	}

	public String registerUser(String email, String password, UserType t, String idNum, String name) {
		//get all email --> check if email is unique
		ArrayList<User> users = db.loadUsers();
		for(User u: users) {
			if(u.getEmail().equals(email)) {
				return "Email not unique";
			}
		}

		boolean validEmail = isValidEmail(email);
		if(!validEmail){
			return "Invalid email";
		}


		//check if password contains 1 upper, 1 lower, 1 number, 1 special char
		boolean strongPassword = checkPassword(password); 
		if (!strongPassword) {
			return "Password not strong enough!";
		}

		//if true, create user and open AdminView for user
		User u = UserFactory.createUser(email, password, t, idNum, name, users);
		return "User successfully created!";
	}

	private boolean isValidEmail(String email) {
		if (email == null || email.isEmpty()) {
			return false;
		}

		// Check for @ symbol
		int atIndex = email.indexOf('@');
		if (atIndex <= 0 || atIndex != email.lastIndexOf('@')) {
			return false; 
		}

		// Check for dot after @
		int dotIndex = email.indexOf('.', atIndex);
		if (dotIndex <= atIndex + 1) {
			return false; 
		}


		if (dotIndex == email.length() - 1) {
			return false;
		}


		for (char c : email.toCharArray()) {
			if (!Character.isLetterOrDigit(c) && c != '@' && c != '.' && c != '_' && c != '-') {
				return false;
			}
		}

		return true;
	}
	
	public String createLabManagerUser() {
		String number = db.loadNumLabManagerAccountCreated();
		int num = Integer.valueOf(number) + 1;
		String email = "LabManager" + num +"@account.ca";
		String password = "LabManager@" + num;
		
		User u = new User(email, password, UserType.LABMANAGER, String.valueOf(num), ("LabManager" + num));
		ArrayList<User> users = db.loadUsers();
		users.add(u);
		db.saveUsers(users);
		db.saveNumLabManagerAccountCreated(String.valueOf(num));
		
		UserFactory.createLabManager(email, password, number, password, users);
		
		return"New Lab Manager Created:\n"
				+ "email=" + email +"\n"
				+ "password=" + password;
		
		
	}


	private boolean checkPassword(String password) {
		boolean hasUppercase = password.matches(".*[A-Z].*");
		boolean hasLowercase = password.matches(".*[a-z].*");
		boolean hasDigit = password.matches(".*\\d.*");
		boolean hasSpecialChar = password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?].*");

		return hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
	}

	public static synchronized UserController getInstance() {
		if(instance == null) {
			instance = new UserController();
		}
		return instance;
	}

	public boolean approveUser(String email) {
		//find user in db
		ArrayList<User> users = db.loadUsers();
		
		for(User u : users) {
			if (u.getEmail().equals(email)) {
				u.setStatus(true);
				db.saveUsers(users);
				return true;
			}
		}
		return false;
	}

	public boolean removeUser(String email) {
		ArrayList<User> users = db.loadUsers();
		
		for(User u : users) {
			if (u.getEmail().equals(email)) {
				u.setStatus(false);
				users.remove(u);
				db.saveUsers(users);
				return true;
			}
		}
		return false;
	}
	
	public static User getLoggedInUser() {
		return LoggedInUser;
	}

}
