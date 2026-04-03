import model.User.UserType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTypeTest {

    @Test
    void studentHasHourlyFee() {
        assertTrue(UserType.STUDENT.getHourlyFee() >= 0);
    }

    @Test
    void facultyHasHourlyFee() {
        assertTrue(UserType.FACULTY.getHourlyFee() >= 0);
    }

    @Test
    void researcherHasHourlyFee() {
        assertTrue(UserType.RESEARCHER.getHourlyFee() >= 0);
    }

    @Test
    void guestHasHourlyFee() {
        assertTrue(UserType.GUEST.getHourlyFee() >= 0);
    }

    @Test
    void labManagerHasHourlyFee() {
        assertTrue(UserType.LABMANAGER.getHourlyFee() >= 0);
    }

    @Test
    void headLabCoordinatorHasHourlyFee() {
        assertTrue(UserType.HEADLABCOORDINATOR.getHourlyFee() >= 0);
    }

    @Test
    void valuesArrayNotEmpty() {
        assertTrue(UserType.values().length > 0);
    }

}