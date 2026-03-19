package model;
import model.User.*;
import model.Equipment.*;
import model.Payment.*;
import model.Reservation.*;
import java.io.*;
import java.util.ArrayList;
import java.time.*;

public class DatabaseManager {
	
	

	private static DatabaseManager instance = null;
	
	//CSV file paths
	private String userFilePath = "/EECS3311-YorkU-Lab-Equipment-Reservation-Platform-Group19/src/User.csv";
	private String equipmentFilePath = "/EECS3311-YorkU-Lab-Equipment-Reservation-Platform-Group19/src/Equipment.csv";
	private String paymentFilePath = "/EECS3311-YorkU-Lab-Equipment-Reservation-Platform-Group19/src/Payment.csv";
	private String reservationFilePath = "/EECS3311-YorkU-Lab-Equipment-Reservation-Platform-Group19/src/Reservation.csv";
	
	
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
		return users;
	}
	
	public void saveUsers(ArrayList<User> users) {
		
	}
	
	public ArrayList<Equipment> loadEquipment(){
		return null;
	}
	
	public void saveEquipment(ArrayList<Equipment> equipment) {
		
	}
	
	public ArrayList<Reservation> loadReservations(){
		ArrayList<Reservation> reservations = new ArrayList<Reservation>();
		
		try {
			this.reservationFileReader = new BufferedReader(new FileReader(reservationFilePath));
			String line;
			
			while((line = this.reservationFileReader.readLine()) != null) {
				String[] reservationData = line.split(",");
				//Reservation r  = new Reservation(reservationData[0], new LocalDateTime(reservationData[1]), new LocalDateTime(reservationData[2]), new LocalDateTime(reservationData[3]), new ReservationState(reservationData[4]));
			}
		}catch(Exception e) {
			
		}
		
		return null;
	}
	
	public void saveReservations(ArrayList<Reservation> reservations) {
		
	}
	
	public ArrayList<Payment> loadPayments(){
		return null;
	}
	
	public void savePaymnents(ArrayList<Payment> payments) {
		
	}

	/**
	 * get the number of lab manager accounts created from StaticVariables.csv
	 * @return String numberOfLabManagerAccounts
	 */
	public String loadNumLabManagerAccountCreated() {
		return null;
		
	}
	
	/**
	 * Save number of lab manager accounts created to StaticVariables.csv
	 * @param num 
	 */
	public void saveNumLabManagerAccountCreated(String num) {
		
		
	}
	
}
