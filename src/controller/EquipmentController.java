package controller;

import java.util.ArrayList;

import model.DatabaseManager;
import model.Equipment.Equipment;

public class EquipmentController {

    private static EquipmentController instance;
    private DatabaseManager db = DatabaseManager.getInstance();

    private EquipmentController() {
    }

    public static synchronized EquipmentController getInstance() {
        if (instance == null) {
            instance = new EquipmentController();
        }
        return instance;
    }

    public String addEquipment(String equipmentId, String name, String description,
                               String labLocation, double hourlyFee) {

        ArrayList<Equipment> equipmentList = db.loadEquipment();

        for (Equipment e : equipmentList) {
            if (e.getEquipmentId().equalsIgnoreCase(equipmentId)) {
                return "Equipment ID already exists";
            }
        }

        Equipment equipment = new Equipment(equipmentId, name, description, labLocation, hourlyFee);
        equipmentList.add(equipment);
        db.saveEquipment(equipmentList);

        return "Equipment added successfully!";
    }

    public String enableEquipment(String equipmentId) {
        ArrayList<Equipment> equipmentList = db.loadEquipment();

        for (Equipment e : equipmentList) {
            if (e.getEquipmentId().equalsIgnoreCase(equipmentId)) {
                e.enableEquipment();
                db.saveEquipment(equipmentList);
                return "Equipment enabled successfully!";
            }
        }

        return "Equipment not found";
    }

    public String disableEquipment(String equipmentId) {
        ArrayList<Equipment> equipmentList = db.loadEquipment();

        for (Equipment e : equipmentList) {
            if (e.getEquipmentId().equalsIgnoreCase(equipmentId)) {
                e.disableEquipment();
                db.saveEquipment(equipmentList);
                return "Equipment disabled successfully!";
            }
        }

        return "Equipment not found";
    }

    public String markMaintenance(String equipmentId) {
        ArrayList<Equipment> equipmentList = db.loadEquipment();

        for (Equipment e : equipmentList) {
            if (e.getEquipmentId().equalsIgnoreCase(equipmentId)) {
                e.markUnderMaintenance();
                db.saveEquipment(equipmentList);
                return "Equipment marked for maintenance";
            }
        }

        return "Equipment not found";
    }

    public String markAvailable(String equipmentId) {
        ArrayList<Equipment> equipmentList = db.loadEquipment();

        for (Equipment e : equipmentList) {
            if (e.getEquipmentId().equalsIgnoreCase(equipmentId)) {
                e.markAvailable();
                db.saveEquipment(equipmentList);
                return "Equipment marked available";
            }
        }

        return "Equipment not found";
    }
}
