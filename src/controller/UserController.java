package controller;

import java.util.ArrayList;

import model.DatabaseManager;
import model.Reservation.Reservation;
import model.User.User;
import model.User.UserType;
import view.AdminView;

public class UserController {
	
	private static UserController instance;

	public String loginUser(String email, String password) {
		DatabaseManager db = DatabaseManager.getInstance();
		
		//get all email and passwords from database
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
			AdminView v = new AdminView(t, res);
			return "Good";
		}
		else
		//if no, return fail
		return "Fail";
	}
	
	public String registerUser(String email, String password, UserType t, String idNum) {
		//get all email --> check if email is unique
		//check if password contains 1 upper, 1 lower, 1 number, 1 special char
		boolean strongPassword = checkPassword(password); 
		if (!strongPassword) {
			return "Password not strong";
		}
		//if true, create user and open AdminView for user
		return "GOOD";
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

}
