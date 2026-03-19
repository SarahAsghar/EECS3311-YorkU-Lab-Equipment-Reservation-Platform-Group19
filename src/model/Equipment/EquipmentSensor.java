package model.Equipment;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class EquipmentSensor implements SensorSubject {

    private EquipmentStatus currentStatus;
    private final List<Observer> observers;
    private final List<UsageRecord> usageRecords;
    private final Equipment equipment;

    private LocalDateTime currentUsageStart;
    private UsageRecord latestRecord;

    public EquipmentSensor(Equipment equipment) {
        if (equipment == null) {
            throw new IllegalArgumentException("Cannot create sensor without equiipment");
        }
        this.equipment = equipment;
        this.currentStatus = equipment.getStatus();
        this.observers = new ArrayList<>();
        this.usageRecords = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        if (observer != null && !observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(currentStatus);
        }
    }

    public void detectUsage(EquipmentStatus detectedStatus) {
        if (detectedStatus == null) {
            throw new IllegalArgumentException("valid status cannot be detected");
        }

        this.currentStatus = detectedStatus;

        if (detectedStatus == EquipmentStatus.IN_USE) {
            startUsageRecord();
        } else if (detectedStatus == EquipmentStatus.AVAILABLE
                || detectedStatus == EquipmentStatus.DISABLED
                || detectedStatus == EquipmentStatus.MAINTENANCE
                || detectedStatus == EquipmentStatus.RESERVED) {
            endUsageRecordIfOpen(detectedStatus);
        }

        notifyObservers();
    }

    private void startUsageRecord() {
        if (currentUsageStart == null) {
            currentUsageStart = LocalDateTime.now();

            latestRecord = new UsageRecord();
            latestRecord.setRecordId(generateRecordId());
            latestRecord.setEquipmentId(equipment.getEquipmentId());
            latestRecord.setStartUsage(currentUsageStart);
            latestRecord.setStatusUpdate("Equipment started being used.");
        }
    }

    private void endUsageRecordIfOpen(EquipmentStatus finalStatus) {
        if (latestRecord != null && latestRecord.getEndUsage() == null) {
            latestRecord.setEndUsage(LocalDateTime.now());
            latestRecord.setStatusUpdate("Equipment status changed to " + finalStatus + ".");
            usageRecords.add(latestRecord);

            latestRecord = null;
            currentUsageStart = null;
        }
    }

    private String generateRecordId() {
        return "UR-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
    }

    public EquipmentStatus getCurrentStatus() {
        return currentStatus;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public UsageRecord getLatestRecord() {
        return latestRecord;
    }

    public List<UsageRecord> getUsageRecords() {
        return Collections.unmodifiableList(usageRecords);
    }
}
