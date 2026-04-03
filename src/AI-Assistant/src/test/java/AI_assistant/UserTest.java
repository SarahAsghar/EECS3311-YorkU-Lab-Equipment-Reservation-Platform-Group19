import model.User.User;
import model.User.UserType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    void guestUserHasStatusTrue() {
        User user = new User("guest@test.com", "pass123", UserType.GUEST, "G1", "Guest User");
        assertTrue(user.getStatus());
    }

    @Test
    void studentUserHasStatusFalse() {
        User user = new User("student@test.com", "pass123", UserType.STUDENT, "S1", "Student User");
        assertFalse(user.getStatus());
    }

    @Test
    void facultyUserHasStatusFalse() {
        User user = new User("faculty@test.com", "pass123", UserType.FACULTY, "F1", "Faculty User");
        assertFalse(user.getStatus());
    }

    @Test
    void researcherUserHasStatusFalse() {
        User user = new User("research@test.com", "pass123", UserType.RESEARCHER, "R1", "Research User");
        assertFalse(user.getStatus());
    }

    @Test
    void labManagerUserHasStatusFalse() {
        User user = new User("lab@test.com", "pass123", UserType.LABMANAGER, "L1", "Lab Manager");
        assertFalse(user.getStatus());
    }

    @Test
    void headLabCoordinatorUserHasStatusFalse() {
        User user = new User("head@test.com", "pass123", UserType.HEADLABCOORDINATOR, "H1", "Head Lab");
        assertFalse(user.getStatus());
    }

    @Test
    void emailGetterWorks() {
        User user = new User("test@test.com", "pass", UserType.FACULTY, "F2", "Faculty User");
        assertEquals("test@test.com", user.getEmail());
    }

    @Test
    void passwordGetterWorks() {
        User user = new User("test@test.com", "secret", UserType.STUDENT, "S2", "Student");
        assertEquals("secret", user.getPassword());
    }

    @Test
    void userTypeGetterWorks() {
        User user = new User("test@test.com", "pass", UserType.RESEARCHER, "R2", "Researcher");
        assertEquals(UserType.RESEARCHER, user.getUserType());
    }

    @Test
    void idGetterWorks() {
        User user = new User("test@test.com", "pass", UserType.STUDENT, "S999", "Student");
        assertEquals("S999", user.getIDNum());
    }

    @Test
    void nameGetterWorks() {
        User user = new User("test@test.com", "pass", UserType.STUDENT, "S3", "Nabeela");
        assertEquals("Nabeela", user.getName());
    }

    @Test
    void emailSetterWorks() {
        User user = new User("old@test.com", "pass", UserType.STUDENT, "S4", "Student");
        user.setEmail("new@test.com");
        assertEquals("new@test.com", user.getEmail());
    }

    @Test
    void passwordSetterWorks() {
        User user = new User("test@test.com", "oldpass", UserType.STUDENT, "S5", "Student");
        user.setPassword("newpass");
        assertEquals("newpass", user.getPassword());
    }

    @Test
    void idSetterWorks() {
        User user = new User("test@test.com", "pass", UserType.STUDENT, "OLDID", "Student");
        user.setIDNum("NEWID");
        assertEquals("NEWID", user.getIDNum());
    }

    @Test
    void statusSetterWorks() {
        User user = new User("test@test.com", "pass", UserType.STUDENT, "S6", "Student");
        user.setStatus(true);
        assertTrue(user.getStatus());
    }

    @Test
    void userTypeSetterWorks() {
        User user = new User("test@test.com", "pass", UserType.STUDENT, "S7", "Student");
        user.setUserType(UserType.FACULTY);
        assertEquals(UserType.FACULTY, user.getUserType());
    }

    @Test
    void emailCanBeSetToEmptyString() {
        User user = new User("test@test.com", "pass", UserType.STUDENT, "S8", "Student");
        user.setEmail("");
        assertEquals("", user.getEmail());
    }

    @Test
    void passwordCanBeSetToEmptyString() {
        User user = new User("test@test.com", "pass", UserType.STUDENT, "S9", "Student");
        user.setPassword("");
        assertEquals("", user.getPassword());
    }

    @Test
    void idCanBeSetToEmptyString() {
        User user = new User("test@test.com", "pass", UserType.STUDENT, "S10", "Student");
        user.setIDNum("");
        assertEquals("", user.getIDNum());
    }

    @Test
    void emailCanBeSetToNull() {
        User user = new User("test@test.com", "pass", UserType.STUDENT, "S11", "Student");
        user.setEmail(null);
        assertNull(user.getEmail());
    }

    @Test
    void passwordCanBeSetToNull() {
        User user = new User("test@test.com", "pass", UserType.STUDENT, "S12", "Student");
        user.setPassword(null);
        assertNull(user.getPassword());
    }

    @Test
    void idCanBeSetToNull() {
        User user = new User("test@test.com", "pass", UserType.STUDENT, "S13", "Student");
        user.setIDNum(null);
        assertNull(user.getIDNum());
    }

    @Test
    void constructorAcceptsNullEmail() {
        User user = new User(null, "pass", UserType.STUDENT, "S14", "Student");
        assertNull(user.getEmail());
    }

    @Test
    void constructorAcceptsNullPassword() {
        User user = new User("test@test.com", null, UserType.STUDENT, "S15", "Student");
        assertNull(user.getPassword());
    }

    @Test
    void constructorAcceptsNullId() {
        User user = new User("test@test.com", "pass", UserType.STUDENT, null, "Student");
        assertNull(user.getIDNum());
    }

    @Test
    void constructorAcceptsNullName() {
        User user = new User("test@test.com", "pass", UserType.STUDENT, "S16", null);
        assertNull(user.getName());
    }

    @Test
    void constructorAcceptsWhitespaceStrings() {
        User user = new User("   ", "   ", UserType.STUDENT, "   ", "   ");
        assertEquals("   ", user.getEmail());
        assertEquals("   ", user.getPassword());
        assertEquals("   ", user.getIDNum());
        assertEquals("   ", user.getName());
    }

    @Test
    void changingUserTypeDoesNotAutomaticallyChangeStatusToTrue() {
        User user = new User("test@test.com", "pass", UserType.STUDENT, "S17", "Student");

        user.setUserType(UserType.GUEST);

        assertEquals(UserType.GUEST, user.getUserType());
        assertFalse(user.getStatus());
    }

    @Test
    void changingUserTypeFromGuestDoesNotAutomaticallyChangeStatusToFalse() {
        User user = new User("guest@test.com", "pass", UserType.GUEST, "G2", "Guest");

        user.setUserType(UserType.STUDENT);

        assertEquals(UserType.STUDENT, user.getUserType());
        assertTrue(user.getStatus());
    }

    @Test
    void statusCanBeToggledMultipleTimes() {
        User user = new User("test@test.com", "pass", UserType.STUDENT, "S18", "Student");

        user.setStatus(true);
        assertTrue(user.getStatus());

        user.setStatus(false);
        assertFalse(user.getStatus());
    }

    @Test
    void multipleSettersUpdateStateTogether() {
        User user = new User("a@test.com", "old", UserType.STUDENT, "OLD", "Name");

        user.setEmail("b@test.com");
        user.setPassword("new");
        user.setIDNum("NEW");
        user.setStatus(true);
        user.setUserType(UserType.RESEARCHER);

        assertEquals("b@test.com", user.getEmail());
        assertEquals("new", user.getPassword());
        assertEquals("NEW", user.getIDNum());
        assertTrue(user.getStatus());
        assertEquals(UserType.RESEARCHER, user.getUserType());
        assertEquals("Name", user.getName());
    }
}