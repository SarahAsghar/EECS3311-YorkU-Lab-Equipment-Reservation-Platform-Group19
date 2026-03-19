package model.User;
public class LabManager extends User {

    public LabManager(String email, String password, String idNum, String name) {
        super(email, password, UserType.LABMANAGER, idNum, name);
        setStatus(true);
    }

    public boolean canManageEquipment() {
        return true;
    }
}
