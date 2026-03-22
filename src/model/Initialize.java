package model;

import java.util.ArrayList;

import controller.UserController;
import model.Equipment.Equipment;
import model.Reservation.Reservation;
import model.User.User;
import model.User.UserType;
import view.AdminView;
import view.LoginView;
import view.ReservationView;

public class Initialize {

	public static void main(String[] args) {
		System.out.print("HI I AM WORKING :)");
		User u = new User("h@email.com", "123", UserType.HEADLABCOORDINATOR, "123", "Man");
		u.setStatus(true);
		DatabaseManager db = DatabaseManager.getInstance();
		
		ArrayList<User> users = new ArrayList<User>();
		users.add(u);
		db.saveUsers(users);
		
		UserController.setLoggedInUser(u);
//		ReservationView v = new ReservationView(new ArrayList<Equipment>(), new AdminView(null, null, users, null));
		LoginView start = LoginView.getInstance();
		start.setLoginViewVisibility(false);
		ReservationView vs = new ReservationView(new ArrayList<Equipment>(), new AdminView(UserType.STUDENT, new ArrayList<Reservation> (),  users, new ArrayList<Equipment> ()));

//		AdminView v = new AdminView(UserType.LABMANAGER, new ArrayList<Reservation>() , new ArrayList<User>());
		
		
	}

}
