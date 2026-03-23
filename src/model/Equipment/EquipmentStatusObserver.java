package model.Equipment;

//public class EquipmentStatusObserver {
  public class EquipmentStatusObserver implements Observer {

    private final Equipment equipment;
    private final EquipmentSensor sensor;

    public EquipmentStatusObserver(Equipment equipment, EquipmentSensor sensor) {
        if (equipment == null) {
            throw new IllegalArgumentException("Equipment cannot be null.");
        }
        if (sensor == null) {
            throw new IllegalArgumentException("EquipmentSensor cannot be null.");
        }
        this.equipment = equipment;
        this.sensor = sensor;
    }

    @Override
    public void update(EquipmentStatus status) {
        equipment.updateStatus(status);
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public EquipmentSensor getSensor() {
        return sensor;
    }
}
