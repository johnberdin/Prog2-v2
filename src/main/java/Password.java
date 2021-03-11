import java.util.regex.*;


public class Password {


    public static Boolean checkPassword(String password){
        if(password.length()<8 || password.length() > 25){
            return false;
        }
        return true;
    }
}
