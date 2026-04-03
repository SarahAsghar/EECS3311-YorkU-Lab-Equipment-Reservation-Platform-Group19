import controller.UserController;
import model.DatabaseManager;
import model.User.User;
import model.User.UserType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class UserControllerTest {

    private UserController controller;
    private DatabaseManager db;

    @BeforeEach
    void setUp() {
        controller = UserController.getInstance();
        db = DatabaseManager.getInstance();
        db.saveUsers(new ArrayList<>());
        UserController.setLoggedInUser(null);
        db.saveNumLabManagerAccountCreated("0");
    }

    @Test
    void getInstanceReturnsSameObject() {
        UserController controller2 = UserController.getInstance();
        assertSame(controller, controller2);
    }

    @Test
    void registerUserReturnsInvalidEmailWhenEmailMalformed() {
        String result = controller.registerUser(
                "bademail",
                "Strong1!",
                UserType.STUDENT,
                "S1",
                "User"
        );

        assertEquals("Invalid email", result);
    }

    @Test
    void registerUserReturnsPasswordMessageWhenWeakPassword() {
        String result = controller.registerUser(
                "user@test.com",
                "weak",
                UserType.STUDENT,
                "S1",
                "User"
        );

        assertEquals("Password must contain uppercase, lowercase, number, and special character", result);
    }

    @Test
    void registerUserReturnsSuccessWhenValid() {
        String result = controller.registerUser(
                "user@test.com",
                "Strong1!",
                UserType.STUDENT,
                "S1",
                "User"
        );

        assertEquals("User successfully created!", result);
    }

    @Test
    void registerUserActuallyAddsUser() {
        controller.registerUser(
                "user@test.com",
                "Strong1!",
                UserType.STUDENT,
                "S1",
                "User"
        );

        ArrayList<User> users = db.loadUsers();

        assertEquals(1, users.size());
        assertEquals("user@test.com", users.get(0).getEmail());
    }

    @Test
    void registerUserRejectsDuplicateEmail() {
        controller.registerUser(
                "user@test.com",
                "Strong1!",
                UserType.STUDENT,
                "S1",
                "User"
        );

        String result = controller.registerUser(
                "user@test.com",
                "Strong2!",
                UserType.FACULTY,
                "F1",
                "Another"
        );

        assertEquals("Email not unique", result);
    }

    @Test
    void approveUserReturnsTrueWhenEmailExists() {
        User user = new User("user@test.com", "Strong1!", UserType.STUDENT, "S1", "User");
        user.setStatus(false);

        ArrayList<User> users = new ArrayList<>();
        users.add(user);
        db.saveUsers(users);

        boolean result = controller.approveUser("user@test.com");

        assertTrue(result);
    }

    @Test
    void approveUserSetsStatusTrue() {
        User user = new User("user@test.com", "Strong1!", UserType.STUDENT, "S1", "User");
        user.setStatus(false);

        ArrayList<User> users = new ArrayList<>();
        users.add(user);
        db.saveUsers(users);

        controller.approveUser("user@test.com");

        ArrayList<User> updated = db.loadUsers();
        assertTrue(updated.get(0).getStatus());
    }

    @Test
    void approveUserReturnsFalseWhenEmailMissing() {
        boolean result = controller.approveUser("missing@test.com");
        assertFalse(result);
    }

    @Test
    void removeUserReturnsTrueWhenEmailExists() {
        User user = new User("user@test.com", "Strong1!", UserType.STUDENT, "S1", "User");

        ArrayList<User> users = new ArrayList<>();
        users.add(user);
        db.saveUsers(users);

        boolean result = controller.removeUser("user@test.com");

        assertTrue(result);
    }

    @Test
    void removeUserActuallyRemovesUser() {
        User user = new User("user@test.com", "Strong1!", UserType.STUDENT, "S1", "User");

        ArrayList<User> users = new ArrayList<>();
        users.add(user);
        db.saveUsers(users);

        controller.removeUser("user@test.com");

        assertTrue(db.loadUsers().isEmpty());
    }

    @Test
    void removeUserReturnsFalseWhenEmailMissing() {
        boolean result = controller.removeUser("missing@test.com");
        assertFalse(result);
    }

    @Test
    void setLoggedInUserAndGetLoggedInUserWork() {
        User user = new User("user@test.com", "Strong1!", UserType.STUDENT, "S1", "User");

        UserController.setLoggedInUser(user);

        assertSame(user, UserController.getLoggedInUser());
    }

    @Test
    void createLabManagerUserReturnsExpectedMessage() {
        String result = controller.createLabManagerUser();

        assertTrue(result.contains("New Lab Manager Created:"));
        assertTrue(result.contains("email=LabManager1@account.ca"));
        assertTrue(result.contains("password=LabManager@1"));
    }

    @Test
    void createLabManagerUserActuallyAddsUser() {
        controller.createLabManagerUser();

        ArrayList<User> users = db.loadUsers();

        assertEquals(1, users.size());
        assertEquals(UserType.LABMANAGER, users.get(0).getUserType());
    }

    @Test
    void createLabManagerUserIncrementsCounter() {
        controller.createLabManagerUser();
        controller.createLabManagerUser();

        ArrayList<User> users = db.loadUsers();

        assertEquals(2, users.size());
        assertEquals("LabManager2@account.ca", users.get(1).getEmail());
    }

    @Test
    void loginUserReturnsFailWhenCredentialsWrong() {
        String result = controller.loginUser("missing@test.com", "Wrong1!");
        assertEquals("Fail", result);
    }

    @Test
    void loginUserReturnsDepartmentMessageWhenUserNotApproved() {
        User user = new User("user@test.com", "Strong1!", UserType.STUDENT, "S1", "User");
        user.setStatus(false);

        ArrayList<User> users = new ArrayList<>();
        users.add(user);
        db.saveUsers(users);

        String result = controller.loginUser("user@test.com", "Strong1!");

        assertEquals("Department has not approved this account", result);
    }
}