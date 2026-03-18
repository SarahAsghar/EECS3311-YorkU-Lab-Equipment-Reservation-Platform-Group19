package controller;

import model.User.User;
import model.User.UserType;

public class UserController {
	
	private static UserController instance;

	public String loginUser(String email, String password) {
		//get all email and passwords from database
		
		//see if email and password match, 
		
		//if they do return user associated with it, create user and open AdminView for user
		User u;
		
		
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
