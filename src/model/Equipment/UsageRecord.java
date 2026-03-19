package model.Equipment;
import java.time.LocalDateTime;

public class UsageRecord {
    private String recordId;
    private String equipmentId;
    private LocalDateTime startUsage;
    private LocalDateTime endUsage;
    private String statusUpdate;

    public UsageRecord() {
    }

    public UsageRecord(String recordId, String equipmentId, LocalDateTime startUsage,
                       LocalDateTime endUsage, String statusUpdate) {
        this.recordId = recordId;
        this.equipmentId = equipmentId;
        this.startUsage = startUsage;
        this.endUsage = endUsage;
        this.statusUpdate = statusUpdate;
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    public LocalDateTime getStartUsage() {
        return startUsage;
    }

    public void setStartUsage(LocalDateTime startUsage) {
        this.startUsage = startUsage;
    }

    public LocalDateTime getEndUsage() {
        return endUsage;
    }

    public void setEndUsage(LocalDateTime endUsage) {
        this.endUsage = endUsage;
    }

    public String getStatusUpdate() {
        return statusUpdate;
    }

    public void setStatusUpdate(String statusUpdate) {
        this.statusUpdate = statusUpdate;
    }

    @Override
    public String toString() {
        return "UsageRecord{" +
                "recordId='" + recordId + '\'' +
                ", equipmentId='" + equipmentId + '\'' +
                ", startUsage=" + startUsage +
                ", endUsage=" + endUsage +
                ", statusUpdate='" + statusUpdate + '\'' +
                '}';
    }
}

