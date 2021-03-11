import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordTest {




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
        Boolean actual = Password.checkPassword("1122aa3314411");
        Assertions.assertFalse(actual);
    }

    @DisplayName("Testing password for numbers")
    @Test
    void checkPassword_Numbers(){
        Boolean actual = Password.checkPassword("FhCampusWien");
        Assertions.assertFalse(actual);
    }

    @DisplayName("Testing password for the wrong special chars")
    @Test
    void checkPassword_wrongSpecChars(){
        Boolean actual = Password.checkPassword("FhCampusWien0-");
        Assertions.assertFalse(actual);
    }

    @DisplayName("Testing password for the wrong special chars")
    @Test
    void checkPassword_wrongSpecChars2(){
        Boolean actual = Password.checkPassword("FhCampusWien0~");
        Assertions.assertFalse(actual);
    }

    @DisplayName("Testing password for illegal rows of numbers")
    @Test
    void checkPassword_illegalRowNumbers(){
        Boolean actual = Password.checkPassword("FhCampusWien0!456");
        Assertions.assertFalse(actual);
    }


    @DisplayName("Testing password for illegal rows of numbers")
    @Test
    void checkPassword_illegalRowNumbers2(){
        Boolean actual = Password.checkPassword("123FhCampusWien0!456");
        Assertions.assertFalse(actual);
    }


    @DisplayName("Testing password for same numbers >3x in a row")
    @Test
    void checkPassword_numbersMore3xInARow(){
        Boolean actual = Password.checkPassword("1111FhCampusWien!");
        Assertions.assertFalse(actual);
    }

    @DisplayName("Testing password for same numbers >3x in a row")
    @Test
    void checkPassword_numbersMore3xInARow2(){
        Boolean actual = Password.checkPassword("FhCampusWien!1111");
        Assertions.assertFalse(actual);
    }
}