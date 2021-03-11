import java.util.regex.*;


public class Password {


    public static Boolean checkPassword(String password){
        if(password.length()<8 || password.length() > 25){
            return false;
        }
        char helpChar;
        int lowerCaseCounter = 0;
        int upperCaseCounter = 0;
        int numberCounter = 0;
        int specialChar = 0;
        for(int i = 0; i < password.length(); i++){
            helpChar = password.charAt(i);
            if(Character.isLowerCase(helpChar)){
                lowerCaseCounter++;
            }else if(Character.isUpperCase(helpChar)){
                upperCaseCounter++;
            }else if(Character.isDigit(helpChar)){
                numberCounter++;
            }
        }
        if(lowerCaseCounter == 0 || upperCaseCounter == 0 || numberCounter == 0) {
            return false;
        }
        return true;
    }
}
