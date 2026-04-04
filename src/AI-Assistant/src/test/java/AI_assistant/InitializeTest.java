
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

import model.Initialize;

public class InitializeTest {

    @Test
    void testMainRunsWithoutError() {

        // This checks that the Initialize main method runs successfully
        assertDoesNotThrow(() -> {
            Initialize.main(new String[]{});
        });

    }

}