package controller;

import java.util.ArrayList;

import model.DatabaseManager;
import model.Reservation.Reservation;
import model.User.User;
import model.User.UserType;
import view.AdminView;

public class UserController {
	
	private static UserController instance;
	private DatabaseManager db = DatabaseManager.getInstance();

	public String loginUser(String email, String password) {
		
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
		else return "Fail";
	}
	
	public String registerUser(String email, String password, UserType t, String idNum) {
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
