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
    void checkPassword_UpperAndLowerCase1() {
        Boolean actual = Password.checkPassword("aaaaaaaaaaa");
        Assertions.assertFalse(actual);
    }

    @DisplayName("Testing password for letter cases")
    @Test
    void checkPassword_UpperAndLowerCase2(){
        Boolean actual = Password.checkPassword("1111aa1111111");
        Assertions.assertFalse(actual);
    }

    @DisplayName("Testing password for numbers")
    @Test
    void checkPassword_Numbers(){
        Boolean actual = Password.checkPassword("FhCampusWien");
        Assertions.assertFalse(actual);
    }

    @DisplayName("Testing password for special chars")
    @Test
    void checkPassword_specChars(){
        Boolean actual = Password.checkPassword("FhCampusWien0!");
        Assertions.assertFalse(actual);
    }

    @DisplayName("Testing password for null")
    @Test
    void checkPassword_null(){
        Boolean actual = Password.checkPassword(null);
        Assertions.assertFalse(actual);
    }


}