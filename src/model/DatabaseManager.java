package model;
import model.User.*;
import model.Equipment.*;
import model.Payment.*;
import model.Reservation.*;
import java.io.*;
import java.util.ArrayList;

public class DatabaseManager {
	
	

	private static DatabaseManager instance = null;
	
	//CSV file paths
	private String userFilePath = "/EECS3311-YorkU-Lab-Equipment-Reservation-Platform-Group19/src/User.csv";
	private String equipmentFilePath = "/EECS3311-YorkU-Lab-Equipment-Reservation-Platform-Group19/src/Equipment.csv";
	private String paymentFilePath = "/EECS3311-YorkU-Lab-Equipment-Reservation-Platform-Group19/src/Payment.csv";
	private String reservationFilePath = "/EECS3311-YorkU-Lab-Equipment-Reservation-Platform-Group19/src/Reservation.csv";
	
	// line for reading data
	private String line = "";
	
	// initialize BufferedReader instances
	private BufferedReader userFileReader = null;
	private BufferedReader equipmentFileReader = null;
	private BufferedReader paymentFileReader = null;
	private BufferedReader reservationFileReader = null;
	
	// initialize BufferedWriter instances
	private BufferedWriter userFileWriter = null;
	private BufferedWriter equipmentFileWriter = null;
	private BufferedWriter paymentFileWriter = null;
	private BufferedWriter reservationFileWriter = null;
	
	private DatabaseManager() {
		try {
			//Define BufferedReaders
			userFileReader = new BufferedReader(new FileReader(userFilePath));
			equipmentFileReader = new BufferedReader(new FileReader(equipmentFilePath));
			paymentFileReader = new BufferedReader(new FileReader(paymentFilePath));
			reservationFileReader = new BufferedReader(new FileReader(reservationFilePath));
			
			//Define BufferedWriters
			userFileWriter = new BufferedWriter(new FileWriter(userFilePath));
			equipmentFileWriter = new BufferedWriter(new FileWriter(equipmentFilePath));
			paymentFileWriter = new BufferedWriter(new FileWriter(paymentFilePath));
			reservationFileWriter = new BufferedWriter(new FileWriter(reservationFilePath));
		}catch(Exception e){
			System.out.println("ERROR instansiating File Readers/Writers");
		}finally {
			
		}
		
	}
	
	public static DatabaseManager getInstance() {
		if(instance == null) {
			instance = new DatabaseManager();
		}
		
		return instance;
		
	}
	
	public ArrayList<User> loadUsers(){
		ArrayList<User> users = new ArrayList<User>();
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
