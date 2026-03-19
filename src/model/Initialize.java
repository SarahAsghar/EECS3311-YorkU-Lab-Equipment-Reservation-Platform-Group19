package model;

import java.util.ArrayList;

import model.Reservation.Reservation;
import model.User.UserType;
import view.AdminView;
import view.LoginView;

public class Initialize {

	public static void main(String[] args) {
		System.out.print("HI I AM WORKING :)");
		LoginView start = LoginView.getInstance();
		start.setLoginViewVisibility(false);
		new AdminView(UserType.HEADLABCOORDINATOR, null, null);
		
	}

}
