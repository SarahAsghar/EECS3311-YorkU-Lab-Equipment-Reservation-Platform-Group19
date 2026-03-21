package controller;

import java.util.ArrayList;

import model.DatabaseManager;
import model.Equipment.Equipment;
import model.Equipment.EquipmentStatus;

public class EquipmentController {

	public static String addEquipment(String equipmentId, String name, String description, String labLocation) {
		DatabaseManager db = DatabaseManager.getInstance();
		
		ArrayList<Equipment> allEquipments = db.loadEquipment();
		
		for(Equipment e : allEquipments) {
			if(e.getEquipmentId().equals(equipmentId)) {
				return "Duplicate ID";
			}
		}
		
		Equipment e = new Equipment(equipmentId,  name,  description,  labLocation, 1.00);
		allEquipments.add(e);
		
		return "Good";
	}

	public static boolean updateEquipmentStatus(String equipmentId, EquipmentStatus status) {
		// TODO Auto-generated method stub
		return false;
	}



}
