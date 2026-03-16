package controller;

import model.User.UserType;

public class UserController {
	
	private static UserController instance;

	public String loginUser(String email, String password) {
		//get all email and passwords from database
		
		//see if email and password match, 
		//if they do return user associated with it, create user and open AdminView for user
		//if no, return fail
		//
		return "Fail";
	}
	
	public void registerUser(String email, String password, UserType t) {
		//get all email --> check if email is unique
		//check if password contains 1 upper, 1 lower, 1 number, 1 special char
		//if true, create user and open AdminView for user
	}
	
	public static synchronized UserController getInstance() {
		if(instance == null) {
			instance = new UserController();
		}
		return instance;
	}

}
