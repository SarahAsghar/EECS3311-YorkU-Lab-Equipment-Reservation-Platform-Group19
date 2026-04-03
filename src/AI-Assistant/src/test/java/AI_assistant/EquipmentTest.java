import model.Equipment.Equipment;
import model.Equipment.EquipmentStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EquipmentTest {

    @Test
    void defaultConstructorSetsEnabledTrue() {
        Equipment equipment = new Equipment();
        assertTrue(equipment.isEnabled());
    }

    @Test
    void defaultConstructorSetsStatusAvailable() {
        Equipment equipment = new Equipment();
        assertEquals(EquipmentStatus.AVAILABLE, equipment.getStatus());
    }

    @Test
    void parameterizedConstructorStoresEquipmentId() {
        Equipment equipment = new Equipment("E1", "Microscope", "Lab microscope", "LAS1001", 25.0);
        assertEquals("E1", equipment.getEquipmentId());
    }

    @Test
    void parameterizedConstructorStoresName() {
        Equipment equipment = new Equipment("E1", "Microscope", "Lab microscope", "LAS1001", 25.0);
        assertEquals("Microscope", equipment.getName());
    }

    @Test
    void parameterizedConstructorStoresDescription() {
        Equipment equipment = new Equipment("E1", "Microscope", "Lab microscope", "LAS1001", 25.0);
        assertEquals("Lab microscope", equipment.getDescription());
    }

    @Test
    void parameterizedConstructorStoresLabLocation() {
        Equipment equipment = new Equipment("E1", "Microscope", "Lab microscope", "LAS1001", 25.0);
        assertEquals("LAS1001", equipment.getLabLocation());
    }

    @Test
    void parameterizedConstructorStoresHourlyFee() {
        Equipment equipment = new Equipment("E1", "Microscope", "Lab microscope", "LAS1001", 25.0);
        assertEquals(25.0, equipment.getHourlyFee());
    }

    @Test
    void parameterizedConstructorSetsEnabledTrueByDefault() {
        Equipment equipment = new Equipment("E1", "Microscope", "Lab microscope", "LAS1001", 25.0);
        assertTrue(equipment.isEnabled());
    }

    @Test
    void parameterizedConstructorSetsStatusAvailableByDefault() {
        Equipment equipment = new Equipment("E1", "Microscope", "Lab microscope", "LAS1001", 25.0);
        assertEquals(EquipmentStatus.AVAILABLE, equipment.getStatus());
    }

    @Test
    void fullConstructorStoresCustomStatus() {
        Equipment equipment = new Equipment(
                "E2", "Sensor", "Motion sensor", "LAB2", 10.0,
                EquipmentStatus.IN_USE, true
        );
        assertEquals(EquipmentStatus.IN_USE, equipment.getStatus());
    }

    @Test
    void fullConstructorStoresCustomEnabledFlag() {
        Equipment equipment = new Equipment(
                "E2", "Sensor", "Motion sensor", "LAB2", 10.0,
                EquipmentStatus.DISABLED, false
        );
        assertFalse(equipment.isEnabled());
    }

    @Test
    void setEquipmentIdUpdatesId() {
        Equipment equipment = new Equipment();
        equipment.setEquipmentId("NEW123");
        assertEquals("NEW123", equipment.getEquipmentId());
    }

    @Test
    void setNameUpdatesName() {
        Equipment equipment = new Equipment();
        equipment.setName("Oscilloscope");
        assertEquals("Oscilloscope", equipment.getName());
    }

    @Test
    void setDescriptionUpdatesDescription() {
        Equipment equipment = new Equipment();
        equipment.setDescription("Updated description");
        assertEquals("Updated description", equipment.getDescription());
    }

    @Test
    void setLabLocationUpdatesLocation() {
        Equipment equipment = new Equipment();
        equipment.setLabLocation("LAB9");
        assertEquals("LAB9", equipment.getLabLocation());
    }

    @Test
    void setHourlyFeeUpdatesFeeWhenValid() {
        Equipment equipment = new Equipment();
        equipment.setHourlyFee(50.0);
        assertEquals(50.0, equipment.getHourlyFee());
    }

    @Test
    void setHourlyFeeAllowsZero() {
        Equipment equipment = new Equipment();
        equipment.setHourlyFee(0.0);
        assertEquals(0.0, equipment.getHourlyFee());
    }

    @Test
    void setHourlyFeeThrowsForNegativeValue() {
        Equipment equipment = new Equipment();

        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> equipment.setHourlyFee(-1.0)
        );

        assertEquals("Hourly fee cannot be negative.", ex.getMessage());
    }

    @Test
    void setStatusUpdatesStatusWhenNotNull() {
        Equipment equipment = new Equipment();
        equipment.setStatus(EquipmentStatus.IN_USE);
        assertEquals(EquipmentStatus.IN_USE, equipment.getStatus());
    }

    @Test
    void setStatusThrowsWhenNull() {
        Equipment equipment = new Equipment();

        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> equipment.setStatus(null)
        );

        assertEquals("Equipment status cannot be null.", ex.getMessage());
    }

    @Test
    void disablingEquipmentSetsEnabledFalse() {
        Equipment equipment = new Equipment();
        equipment.setEnabled(false);
        assertFalse(equipment.isEnabled());
    }

    @Test
    void disablingEquipmentSetsStatusDisabled() {
        Equipment equipment = new Equipment();
        equipment.setEnabled(false);
        assertEquals(EquipmentStatus.DISABLED, equipment.getStatus());
    }

    @Test
    void enablingDisabledEquipmentSetsEnabledTrue() {
        Equipment equipment = new Equipment();
        equipment.setEnabled(false);
        equipment.setEnabled(true);
        assertTrue(equipment.isEnabled());
    }

    @Test
    void enablingPreviouslyDisabledEquipmentRestoresAvailableStatus() {
        Equipment equipment = new Equipment();
        equipment.setEnabled(false);
        equipment.setEnabled(true);
        assertEquals(EquipmentStatus.AVAILABLE, equipment.getStatus());
    }

    @Test
    void enablingEquipmentDoesNotOverrideNonDisabledStatus() {
        Equipment equipment = new Equipment();
        equipment.setStatus(EquipmentStatus.IN_USE);
        equipment.setEnabled(true);
        assertEquals(EquipmentStatus.IN_USE, equipment.getStatus());
    }

    @Test
    void isAvailableReturnsTrueWhenEnabledAndAvailable() {
        Equipment equipment = new Equipment();
        assertTrue(equipment.isAvailable());
    }

    @Test
    void isAvailableReturnsFalseWhenDisabled() {
        Equipment equipment = new Equipment();
        equipment.setEnabled(false);
        assertFalse(equipment.isAvailable());
    }

    @Test
    void isAvailableReturnsFalseWhenStatusNotAvailable() {
        Equipment equipment = new Equipment();
        equipment.setStatus(EquipmentStatus.IN_USE);
        assertFalse(equipment.isAvailable());
    }

    @Test
    void isReservableReturnsTrueWhenEnabledAndAvailable() {
        Equipment equipment = new Equipment();
        assertTrue(equipment.isReservable());
    }

    @Test
    void isReservableReturnsFalseWhenDisabled() {
        Equipment equipment = new Equipment();
        equipment.setEnabled(false);
        assertFalse(equipment.isReservable());
    }

    @Test
    void isReservableReturnsFalseWhenStatusNotAvailable() {
        Equipment equipment = new Equipment();
        equipment.setStatus(EquipmentStatus.IN_USE);
        assertFalse(equipment.isReservable());
    }

    @Test
    void multipleSettersUpdateStateTogether() {
        Equipment equipment = new Equipment();

        equipment.setEquipmentId("EQ77");
        equipment.setName("Printer");
        equipment.setDescription("3D printer");
        equipment.setLabLocation("ENG2000");
        equipment.setHourlyFee(12.5);
        equipment.setStatus(EquipmentStatus.AVAILABLE);
        equipment.setEnabled(true);

        assertEquals("EQ77", equipment.getEquipmentId());
        assertEquals("Printer", equipment.getName());
        assertEquals("3D printer", equipment.getDescription());
        assertEquals("ENG2000", equipment.getLabLocation());
        assertEquals(12.5, equipment.getHourlyFee());
        assertEquals(EquipmentStatus.AVAILABLE, equipment.getStatus());
        assertTrue(equipment.isEnabled());
    }

    @Test
    void disablingThenSettingStatusCanMakeObjectDisabledButNonDisabledStatus() {
        Equipment equipment = new Equipment();

        equipment.setEnabled(false);
        equipment.setStatus(EquipmentStatus.IN_USE);

        assertFalse(equipment.isEnabled());
        assertEquals(EquipmentStatus.IN_USE, equipment.getStatus());
        assertFalse(equipment.isAvailable());
        assertFalse(equipment.isReservable());
    }
}