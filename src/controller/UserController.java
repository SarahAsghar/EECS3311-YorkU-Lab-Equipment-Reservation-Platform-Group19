package controller;

import java.util.ArrayList;

import model.DatabaseManager;
import model.Equipment.Equipment;
import model.Reservation.Reservation;
import model.User.User;
import model.User.*;
import view.AdminView;

public class UserController {

	/**
	 * Singular instance of this controller
	 */
    private static UserController instance;
    
    /**
     * Database instance
     */
    private DatabaseManager db = DatabaseManager.getInstance();
    
    /**
     * Logged in user instance
     */
    private static User LoggedInUser;

    /**
     * Logs in the user based on email and password provided
     * @param email: email to check with database
     * @param password: pasword to check with database
     * @return String if login valid or error
     */
    public String loginUser(String email, String password) {
        ArrayList<User> users = db.loadUsers();

        User user = null;
        
        //Finds user
        for(User u: users) {
            if(u.getEmail().equals(email) && u.getPassword().equals(password)) {
                user = u;
                break;
            }
        }
        
        //Creates user to save for logged in user
        if(user != null) {
            UserType t = user.getUserType();
            ArrayList<Reservation> res = db.loadReservations();
            ArrayList<Equipment> e = db.loadEquipment();

            if(user.getStatus() == true) {
                LoggedInUser = user;
                
                if(t != UserType.HEADLABCOORDINATOR && t != UserType.LABMANAGER) {
                    ArrayList<Reservation> userRes = new ArrayList<Reservation>();
                    for(Reservation r: res) {
                        if(r.getUserId() != null && r.getUserId().equals(user.getIDNum())) {
                            userRes.add(r);
                        }
                    }
                    AdminView v = new AdminView(t, userRes, users, e);
                }
                else {
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

    /**
     * Register a new user
     * @param email: Email to check if unique and then register
     * @param password: Password to check if strong, then register
     * @param t: Type of User
     * @param idNum: Id number of user
     * @param name: name of user
     * @return: String if worked or ot
     */
    public String registerUser(String email, String password, UserType t, 
            String idNum, String name) {
        ArrayList<User> users = db.loadUsers();
        
        //Check email unique
        for(User u: users) {
            if(u.getEmail().equals(email)) {
                return "Email not unique";
            }
        }

        boolean validEmail = isValidEmail(email);
        if(!validEmail){
            return "Invalid email";
        }

        //check if strong password
        boolean strongPassword = checkPassword(password); 
        if (!strongPassword) {
            return "Password must contain uppercase, lowercase, number, and special character";
        }

        User u = UserFactory.createUser(email, password, t, idNum, name, users);
        users.add(u);
        db.saveUsers(users);
        return "User successfully created!";
    }

    /**
     * Checks if email is unique
     * @param email: Email to check
     * @return boolean unique
     */
    private boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        int atIndex = email.indexOf('@');
        if (atIndex <= 0 || atIndex != email.lastIndexOf('@')) {
            return false; 
        }

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
    
    /**
     * Creates Lab Manager User
     * @return STring  of Lab Manager data
     */
    public String createLabManagerUser() {
        String number = db.loadNumLabManagerAccountCreated();
        int num = Integer.valueOf(number) + 1;
        String email = "LabManager" + num + "@account.ca";
        String password = "LabManager@" + num;
        
        User u = new User(email, password, UserType.LABMANAGER, String.valueOf(num), 
                ("LabManager" + num));
        db.saveNumLabManagerAccountCreated(String.valueOf(num));
        ArrayList<User> users = db.loadUsers();
        users.add(u);
        db.saveUsers(users);
        
        return "New Lab Manager Created:\n"
                + "email=" + email + "\n"
                + "password=" + password;
    }

    /**
     * Check if password is strong
     * @param password: password to check
     * @return strong password or not
     */
    private boolean checkPassword(String password) {
        boolean hasUppercase = password.matches(".*[A-Z].*");
        boolean hasLowercase = password.matches(".*[a-z].*");
        boolean hasDigit = password.matches(".*\\d.*");
        boolean hasSpecialChar = password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?].*");
        return hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
    }

    /**
     * Get instance of this controller
     * @return UserController instance
     */
    public static synchronized UserController getInstance() {
        if(instance == null) {
            instance = new UserController();
        }
        return instance;
    }

    /**
     * HeadLabCoordinator can approve user
     * @param email: user email to approve
     * @return boolean if worked or not
     */
    public boolean approveUser(String email) {
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

    /**
     * HeadLabCoordinator can remove user by email
     * @param email: User to remove
     * @return boolean if worked or not
     */
    public boolean removeUser(String email) {
        ArrayList<User> users = db.loadUsers();
        
        for(User u : users) {
            if (u.getEmail().equals(email)) {
                users.remove(u);
                db.saveUsers(users);
                return true;
            }
        }
        return false;
    }
    /**
     * Get the current logged in user
     * @return User that is logged in
     */
    
    public static User getLoggedInUser() {
        return LoggedInUser;
    }

    /**
     * Sets the logged in user
     * @param u: User to be logged in
     */
    public static void setLoggedInUser(User u) {
        LoggedInUser = u;
    }
}