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
		User u2 = new User("a@email.com", "123", UserType.STUDENT, "123", "stu");

		u.setStatus(true);
		u2.setStatus(true);

		DatabaseManager db = DatabaseManager.getInstance();
		
		ArrayList<User> users = new ArrayList<User>();
		users.add(u);
		users.add(u2);
		db.saveUsers(users);
		
		Equipment e = new Equipment("equipmentId123", "name",  "descriptiokdkdkn",
                 "labLocati33on",  1.0);
		
		ArrayList<Equipment> es = new ArrayList<Equipment>();
		es.add(e);
		db.saveEquipment(es);

		
		UserController.setLoggedInUser(u);
		LoginView start = LoginView.getInstance();
			
	}

}
