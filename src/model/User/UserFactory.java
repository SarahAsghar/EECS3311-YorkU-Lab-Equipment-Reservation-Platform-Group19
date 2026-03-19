package model.User;
import java.util.ArrayList;

public class UserFactory {

    public static User createUser(String email, String password,
                                  UserType type, String idNum, String name,
                                  ArrayList<User> users) {

        for (User u : users) {
            if (u.getEmail().equalsIgnoreCase(email)) {
                throw new IllegalArgumentException("Email already exists");
            }
        }

        return new User(email, password, type, idNum, name);
    }

    public static User createLabManager(String email, String password,
                                        String idNum, String name,
                                        ArrayList<User> users) {

        for (User u : users) {
            if (u.getEmail().equalsIgnoreCase(email)) {
                throw new IllegalArgumentException("Email already exists");
            }
        }

        User manager = new User(email, password, UserType.LABMANAGER, idNum, name);
        manager.setStatus(true); 
        return manager;
    }
}

