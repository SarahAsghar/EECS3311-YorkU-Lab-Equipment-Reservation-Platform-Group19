import controller.EquipmentController;
import model.DatabaseManager;
import model.Equipment.Equipment;
import model.Equipment.EquipmentStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class EquipmentControllerTest {

    private EquipmentController controller;
    private DatabaseManager db;

    @BeforeEach
    void setUp() {
        controller = EquipmentController.getInstance();
        db = DatabaseManager.getInstance();
        db.saveEquipment(new ArrayList<>());
    }

    @Test
    void getInstanceReturnsSameObject() {
        EquipmentController controller2 = EquipmentController.getInstance();
        assertSame(controller, controller2);
    }

    @Test
    void addEquipmentReturnsSuccessForNewId() {
        String result = controller.addEquipment("E1", "Microscope", "Lab microscope", "LAS1001", 25.0);
        assertEquals("Equipment added successfully!", result);
    }

    @Test
    void addEquipmentActuallyAddsEquipmentToDatabase() {
        controller.addEquipment("E1", "Microscope", "Lab microscope", "LAS1001", 25.0);

        ArrayList<Equipment> equipmentList = db.loadEquipment();

        assertEquals(1, equipmentList.size());
        assertEquals("E1", equipmentList.get(0).getEquipmentId());
    }

    @Test
    void addEquipmentRejectsDuplicateIdIgnoringCase() {
        controller.addEquipment("E1", "Microscope", "Lab microscope", "LAS1001", 25.0);

        String result = controller.addEquipment("e1", "Sensor", "Motion sensor", "LAS1002", 10.0);

        assertEquals("Equipment ID already exists", result);
    }

    @Test
    void getEquipmentReturnsMatchingEquipmentIgnoringCase() {
        controller.addEquipment("E1", "Microscope", "Lab microscope", "LAS1001", 25.0);

        Equipment equipment = controller.getEquipment("e1");

        assertNotNull(equipment);
        assertEquals("E1", equipment.getEquipmentId());
    }

    @Test
    void getEquipmentReturnsNullWhenNotFound() {
        Equipment equipment = controller.getEquipment("NOPE");
        assertNull(equipment);
    }

    @Test
    void getAllEquipmentReturnsSavedEquipmentList() {
        controller.addEquipment("E1", "Microscope", "Lab microscope", "LAS1001", 25.0);
        controller.addEquipment("E2", "Sensor", "Motion sensor", "LAS1002", 10.0);

        ArrayList<Equipment> all = controller.getAllEquipment();

        assertEquals(2, all.size());
    }

    @Test
    void enableEquipmentReturnsSuccessWhenFound() {
        controller.addEquipment("E1", "Microscope", "Lab microscope", "LAS1001", 25.0);
        controller.disableEquipment("E1");

        String result = controller.enableEquipment("E1");

        assertEquals("Equipment enabled successfully!", result);
    }

    @Test
    void enableEquipmentMakesEquipmentEnabledAndAvailable() {
        controller.addEquipment("E1", "Microscope", "Lab microscope", "LAS1001", 25.0);
        controller.disableEquipment("E1");

        controller.enableEquipment("E1");
        Equipment equipment = controller.getEquipment("E1");

        assertTrue(equipment.isEnabled());
        assertEquals(EquipmentStatus.AVAILABLE, equipment.getStatus());
    }

    @Test
    void enableEquipmentReturnsNotFoundForMissingId() {
        String result = controller.enableEquipment("X1");
        assertEquals("Equipment not found", result);
    }

    @Test
    void disableEquipmentReturnsSuccessWhenFound() {
        controller.addEquipment("E1", "Microscope", "Lab microscope", "LAS1001", 25.0);

        String result = controller.disableEquipment("E1");

        assertEquals("Equipment disabled successfully!", result);
    }

    @Test
    void disableEquipmentMakesEquipmentDisabled() {
        controller.addEquipment("E1", "Microscope", "Lab microscope", "LAS1001", 25.0);

        controller.disableEquipment("E1");
        Equipment equipment = controller.getEquipment("E1");

        assertFalse(equipment.isEnabled());
        assertEquals(EquipmentStatus.DISABLED, equipment.getStatus());
    }

    @Test
    void disableEquipmentReturnsNotFoundForMissingId() {
        String result = controller.disableEquipment("X1");
        assertEquals("Equipment not found", result);
    }

    @Test
    void markMaintenanceReturnsSuccessWhenFound() {
        controller.addEquipment("E1", "Microscope", "Lab microscope", "LAS1001", 25.0);

        String result = controller.markMaintenance("E1");

        assertEquals("Equipment marked for maintenance", result);
    }

    @Test
    void markMaintenanceChangesStatusToMaintenance() {
        controller.addEquipment("E1", "Microscope", "Lab microscope", "LAS1001", 25.0);

        controller.markMaintenance("E1");
        Equipment equipment = controller.getEquipment("E1");

        assertEquals(EquipmentStatus.MAINTENANCE, equipment.getStatus());
    }

    @Test
    void markMaintenanceReturnsNotFoundForMissingId() {
        String result = controller.markMaintenance("X1");
        assertEquals("Equipment not found", result);
    }

    @Test
    void markAvailableReturnsSuccessWhenFound() {
        controller.addEquipment("E1", "Microscope", "Lab microscope", "LAS1001", 25.0);
        controller.markMaintenance("E1");

        String result = controller.markAvailable("E1");

        assertEquals("Equipment marked available", result);
    }

    @Test
    void markAvailableChangesStatusToAvailable() {
        controller.addEquipment("E1", "Microscope", "Lab microscope", "LAS1001", 25.0);
        controller.markMaintenance("E1");

        controller.markAvailable("E1");
        Equipment equipment = controller.getEquipment("E1");

        assertEquals(EquipmentStatus.AVAILABLE, equipment.getStatus());
    }

    @Test
    void markAvailableReturnsNotFoundForMissingId() {
        String result = controller.markAvailable("X1");
        assertEquals("Equipment not found", result);
    }

    @Test
    void removeEquipmentReturnsSuccessWhenFound() {
        controller.addEquipment("E1", "Microscope", "Lab microscope", "LAS1001", 25.0);

        String result = controller.removeEquipment("E1");

        assertEquals("Equipment removed successfully!", result);
    }

    @Test
    void removeEquipmentActuallyRemovesEquipment() {
        controller.addEquipment("E1", "Microscope", "Lab microscope", "LAS1001", 25.0);

        controller.removeEquipment("E1");

        assertNull(controller.getEquipment("E1"));
        assertEquals(0, controller.getAllEquipment().size());
    }

    @Test
    void removeEquipmentReturnsNotFoundForMissingId() {
        String result = controller.removeEquipment("X1");
        assertEquals("Equipment not found", result);
    }

    @Test
    void getEquipmentStatusReturnsStatusStringWhenFound() {
        controller.addEquipment("E1", "Microscope", "Lab microscope", "LAS1001", 25.0);
        controller.markMaintenance("E1");

        String result = controller.getEquipmentStatus("E1");

        assertEquals("MAINTENANCE", result);
    }

    @Test
    void getEquipmentStatusReturnsNotFoundWhenMissing() {
        String result = controller.getEquipmentStatus("X1");
        assertEquals("Equipment not found", result);
    }

    @Test
    void updateEquipmentStatusReturnsTrueWhenEquipmentFound() {
        controller.addEquipment("E1", "Microscope", "Lab microscope", "LAS1001", 25.0);

        boolean result = EquipmentController.updateEquipmentStatus("E1", EquipmentStatus.RESERVED);

        assertTrue(result);
    }

    @Test
    void updateEquipmentStatusChangesToAvailable() {
        controller.addEquipment("E1", "Microscope", "Lab microscope", "LAS1001", 25.0);
        controller.markMaintenance("E1");

        EquipmentController.updateEquipmentStatus("E1", EquipmentStatus.AVAILABLE);

        assertEquals(EquipmentStatus.AVAILABLE, controller.getEquipment("E1").getStatus());
    }

    @Test
    void updateEquipmentStatusChangesToReserved() {
        controller.addEquipment("E1", "Microscope", "Lab microscope", "LAS1001", 25.0);

        EquipmentController.updateEquipmentStatus("E1", EquipmentStatus.RESERVED);

        assertEquals(EquipmentStatus.RESERVED, controller.getEquipment("E1").getStatus());
    }

    @Test
    void updateEquipmentStatusChangesToDisabled() {
        controller.addEquipment("E1", "Microscope", "Lab microscope", "LAS1001", 25.0);

        EquipmentController.updateEquipmentStatus("E1", EquipmentStatus.DISABLED);

        Equipment equipment = controller.getEquipment("E1");
        assertEquals(EquipmentStatus.DISABLED, equipment.getStatus());
        assertFalse(equipment.isEnabled());
    }

    @Test
    void updateEquipmentStatusChangesToMaintenance() {
        controller.addEquipment("E1", "Microscope", "Lab microscope", "LAS1001", 25.0);

        EquipmentController.updateEquipmentStatus("E1", EquipmentStatus.MAINTENANCE);

        assertEquals(EquipmentStatus.MAINTENANCE, controller.getEquipment("E1").getStatus());
    }

    @Test
    void updateEquipmentStatusChangesToInUse() {
        controller.addEquipment("E1", "Microscope", "Lab microscope", "LAS1001", 25.0);

        EquipmentController.updateEquipmentStatus("E1", EquipmentStatus.IN_USE);

        assertEquals(EquipmentStatus.IN_USE, controller.getEquipment("E1").getStatus());
    }

    @Test
    void updateEquipmentStatusReturnsFalseWhenEquipmentMissing() {
        boolean result = EquipmentController.updateEquipmentStatus("X1", EquipmentStatus.AVAILABLE);
        assertFalse(result);
    }
}