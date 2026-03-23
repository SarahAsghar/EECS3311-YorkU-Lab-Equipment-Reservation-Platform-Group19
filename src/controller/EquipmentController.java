package controller;

import java.util.ArrayList;

import model.DatabaseManager;
import model.Equipment.Equipment;
import model.Equipment.EquipmentStatus;

public class EquipmentController {
	
	/**
	 * 1 Instance of EquipmentController to be accessed
	 */
    private static EquipmentController instance;
    
    /**
     * Database access 
     */
    private DatabaseManager db = DatabaseManager.getInstance();

    private EquipmentController() { }

    /**
     * Get instance of this controller
     * @return EquipmentController instance
     */
    public static synchronized EquipmentController getInstance() {
        if (instance == null) {
            instance = new EquipmentController();
        }
        return instance;
    }

    /**
     * Add equipment to database, checks for duplicate equipment id
     * @param equipmentId: unique id for equipment
     * @param name: name of equipment
     * @param description
     * @param labLocation
     * @param hourlyFee
     * @return String: Tells us if valid and worked or not
     */
    public String addEquipment(String equipmentId, String name, String description, 
            String labLocation, double hourlyFee) {
        ArrayList<Equipment> equipmentList = db.loadEquipment();

        //check if duplicate id
        for (Equipment e : equipmentList) {
            if (e.getEquipmentId().equalsIgnoreCase(equipmentId)) {
                return "Equipment ID already exists";
            }
        }

        //Save Equipment
        Equipment newEquipment = new Equipment(equipmentId, name, description, 
                labLocation, hourlyFee);
        equipmentList.add(newEquipment);
        db.saveEquipment(equipmentList);

        return "Equipment added successfully!";
    }

    /**
     * LabManager enables equipment
     * @param equipmentId: equipent to enable
     * @return String telling if it worked or not
     */
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

    /**
     * Lab Manager disables equipment
     * @param equipmentId: Equipment to disbale
     * @return String telling if it worked or not
     */
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

    /**
     * Lab Manager marks equipment as maintenance
     * @param equipmentId: Equipment to mark as maintenance
     * @return String telling if it worked or not
     */
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

    /**
     * Lab Manager marks equipment as available
     * @param equipmentId: Equipment to mark as available
     * @return String telling if it worked or not
     */
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

    /**
     * Lab Manager removes equipment from database
     * @param equipmentId: Equipment to remove
     * @return String telling if it worked or not
     */
    public String removeEquipment(String equipmentId) {
        ArrayList<Equipment> equipmentList = db.loadEquipment();

        for (Equipment e : equipmentList) {
            if (e.getEquipmentId().equalsIgnoreCase(equipmentId)) {
                equipmentList.remove(e);
                db.saveEquipment(equipmentList);
                return "Equipment removed successfully!";
            }
        }
        return "Equipment not found";
    }

    /**
     * Find the equipment needed
     * @param equipmentId: Equipment to find from database
     * @return Equipment: One that matches the id given
     */
    public Equipment getEquipment(String equipmentId) {
        ArrayList<Equipment> equipmentList = db.loadEquipment();

        for (Equipment e : equipmentList) {
            if (e.getEquipmentId().equalsIgnoreCase(equipmentId)) {
                return e;
            }
        }
        return null;
    }

    /**
     * Get all equipments
     * @return ArrayList<Equipment> all equipments
     */
    public ArrayList<Equipment> getAllEquipment() {
        return db.loadEquipment();
    }

    public String getEquipmentStatus(String equipmentId) {
        ArrayList<Equipment> equipmentList = db.loadEquipment();

        for (Equipment e : equipmentList) {
            if (e.getEquipmentId().equalsIgnoreCase(equipmentId)) {
                return e.getStatus().toString();
            }
        }
        return "Equipment not found";
    }

    /**
     * Update status of equipment
     * @param equipmentId: Equipment to be updates
     * @param newStatus: the new status of equipment
     * @return boolean if update worked or not
     */
    public static boolean updateEquipmentStatus(String equipmentId, EquipmentStatus newStatus) {
        EquipmentController controller = getInstance();
        ArrayList<Equipment> equipmentList = controller.db.loadEquipment();
        
        for (Equipment e : equipmentList) {
            if (e.getEquipmentId().equalsIgnoreCase(equipmentId)) {
                switch (newStatus) {
                    case AVAILABLE:
                        e.markAvailable();
                        break;
                    case RESERVED:
                        e.markReserved();
                        break;
                    case DISABLED:
                        e.disableEquipment();
                        break;
                    case MAINTENANCE:
                        e.markUnderMaintenance();
                        break;
                    case IN_USE:
                        e.markInUse();
                        break;
                }
                controller.db.saveEquipment(equipmentList);
                return true;
            }
        }
        return false;
    }
}