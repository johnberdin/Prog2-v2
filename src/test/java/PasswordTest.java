import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordTest {


    @BeforeEach
    void setup() {
        System.out.println("Setup started");
        System.out.println("Setup finish");
    }

    @DisplayName("Testing password for the minimum length")
    @Test
    void checkPassword_tooSmall() {
        Boolean actual = Password.checkPassword("FH");
        Assertions.assertFalse(actual);
    }

    @DisplayName("Testing password for the maximum length")
    @Test
    void checkPassword_tooBig() {
        Boolean actual = Password.checkPassword("FhCampusWienComputerScience");
        Assertions.assertFalse(actual);
    }

    @DisplayName("Testing password for letter cases")
    @Test
    void checkPassword_UpperAndLowerCase() {
        Boolean actual = Password.checkPassword("aaaaaaaaaaa");
        Assertions.assertFalse(actual);
    }
}