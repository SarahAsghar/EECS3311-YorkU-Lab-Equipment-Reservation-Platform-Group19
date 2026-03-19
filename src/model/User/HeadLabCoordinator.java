package model.User;
import java.util.ArrayList;

public class HeadLabCoordinator extends User {

    public HeadLabCoordinator(String email, String password, String idNum, String name) {
        super(email, password, UserType.HEADLABCOORDINATOR, idNum, name);
        setStatus(true);
    }

    public User generateLabManagerAccount(String email, String password,
                                          String idNum, String name,
                                          ArrayList<User> users) {

        return UserFactory.createLabManager(email, password, idNum, name, users);
    }

    public void approveUser(User user) {
        user.setStatus(true);
    }
}
