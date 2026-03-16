package model;
import model.User.*;
import model.Equipment.*;
import model.Payment.*;
import model.Reservation.*;
import java.io.File;
import java.util.ArrayList;

public class DatabaseManager {
	
	

	private static DatabaseManager instance = null;
	
	private DatabaseManager() {
		
	}
	
	public static DatabaseManager getInstance() {
		if(instance == null) {
			instance = new DatabaseManager();
		}
		
		return instance;
		
	}
	
	public ArrayList<User> loadUsers(){
		return null;
	}
	
	public void saveUsers(ArrayList<User> users) {
		
	}
	
	public ArrayList<Equipment> loadEquipment(){
		return null;
	}
	
	public void saveEquipment(ArrayList<Equipment> equipment) {
		
	}
	
	public ArrayList<Reservation> loadReservations(){
		return null;
	}
	
	public void saveReservations(ArrayList<Reservation> reservations) {
		
	}
	
	public ArrayList<Payment> loadPayments(){
		return null;
	}
	
	public void savePaymnents(ArrayList<Payment> payments) {
		
	}
	
}
