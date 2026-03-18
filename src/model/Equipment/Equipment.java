package model.Equipment;

public class Equipment {
  
    private String equipmentId;
    private String name;
    private String description;
    private String labLocation;
    private double hourlyFee;
    private EquipmentStatus status;
    private boolean enabled;

    public Equipment() {
        this.enabled = true;
        this.status = EquipmentStatus.AVAILABLE;
    }

    public Equipment(String equipmentId, String name, String description,
                     String labLocation, double hourlyFee) {
        this.equipmentId = equipmentId;
        this.name = name;
        this.description = description;
        this.labLocation = labLocation;
        this.hourlyFee = hourlyFee;
        this.enabled = true;
        this.status = EquipmentStatus.AVAILABLE;
    }

    public Equipment(String equipmentId, String name, String description,
                     String labLocation, double hourlyFee,
                     EquipmentStatus status, boolean enabled) {
        this.equipmentId = equipmentId;
        this.name = name;
        this.description = description;
        this.labLocation = labLocation;
        this.hourlyFee = hourlyFee;
        this.status = status;
        this.enabled = enabled;
    }

    public String getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLabLocation() {
        return labLocation;
    }

    public void setLabLocation(String labLocation) {
        this.labLocation = labLocation;
    }

    public double getHourlyFee() {
        return hourlyFee;
    }

    public void setHourlyFee(double hourlyFee) {
        if (hourlyFee < 0) {
            throw new IllegalArgumentException("Hourly fee cannot be negative.");
        }
        this.hourlyFee = hourlyFee;
    }

    public EquipmentStatus getStatus() {
        return status;
    }

    public void setStatus(EquipmentStatus status) {
        if (status == null) {
            throw new IllegalArgumentException("Equipment status cannot be null.");
        }
        this.status = status;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
        if (!enabled) {
            this.status = EquipmentStatus.DISABLED;
        } else if (this.status == EquipmentStatus.DISABLED) {
            this.status = EquipmentStatus.AVAILABLE;
        }
    }

    public boolean isAvailable() {
        return enabled && status == EquipmentStatus.AVAILABLE;
    }

    public boolean isReservable() {
        return enabled && status == EquipmentStatus.AVAILABLE;
    }

    public void enableEquipment() {
        this.enabled = true;
        if (this.status == EquipmentStatus.DISABLED) {
            this.status = EquipmentStatus.AVAILABLE;
        }
    }

    public void disableEquipment() {
        this.enabled = false;
        this.status = EquipmentStatus.DISABLED;
    }

    public void markReserved() {
        if (!enabled) {
            throw new IllegalStateException("Disabled equipment");
        }
        if (status == EquipmentStatus.MAINTENANCE) {
            throw new IllegalStateException("Equipment under maintenance");
        }
        this.status = EquipmentStatus.RESERVED;
    }

    public void markInUse() {
        if (!enabled) {
            throw new IllegalStateException("Disabled equipment cannot be set to in use.");
        }
        if (status == EquipmentStatus.MAINTENANCE) {
            throw new IllegalStateException("Equipment under maintenance cannot be set to in use.");
        }
        this.status = EquipmentStatus.IN_USE;
    }

    public void markAvailable() {
        if (!enabled) {
            throw new IllegalStateException("Disabled equipment cannot be made available.");
        }
        this.status = EquipmentStatus.AVAILABLE;
    }

    public void markUnderMaintenance() {
        this.status = EquipmentStatus.MAINTENANCE;
    }

    public void updateStatus(EquipmentStatus newStatus) {
        if (newStatus == null) {
            throw new IllegalArgumentException("New status cannot be null.");
        }

        if (!enabled && newStatus != EquipmentStatus.DISABLED) {
            throw new IllegalStateException("Disabled equipment cannot change to a non-disabled state.");
        }

        this.status = newStatus;
    }

    @Override
    public String toString() {
        return equipmentId + " - " + name + " [" + status + "]";
    }
}
