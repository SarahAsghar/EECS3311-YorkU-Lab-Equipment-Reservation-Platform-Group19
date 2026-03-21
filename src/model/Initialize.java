package model;

import java.util.ArrayList;

import model.Reservation.Reservation;
import model.User.User;
import model.User.UserType;
import view.AdminView;
import view.LoginView;

public class Initialize {

	public static void main(String[] args) {
		System.out.print("HI I AM WORKING :)");
		User u = new User("h@email.com", "123", UserType.HEADLABCOORDINATOR, "123", "Man");
		u.setStatus(true);
		DatabaseManager db = DatabaseManager.getInstance();
		
		ArrayList<User> users = new ArrayList<User>();
		users.add(u);
		db.saveUsers(users);
		LoginView start = LoginView.getInstance();
//		AdminView v = new AdminView(UserType.LABMANAGER, new ArrayList<Reservation>() , new ArrayList<User>());
		
		
	}

}
