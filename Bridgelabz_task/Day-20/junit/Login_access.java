package junit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login_access {

    public boolean user_login(String username, String password) {
    	Pattern pattern_username = Pattern.compile("^[a-zA-Z0-9]+@[a-zA-Z]+\\.[a-zA-Z]{2,}$");
        Matcher musername = pattern_username.matcher(username);
       
        Pattern pattern_password = Pattern.compile("^(?=.*[A-Z])(?=.*[@#$%^&*+=!]).{8,}$");
        Matcher mpassword = pattern_password.matcher(password);

        if (musername.matches() && mpassword.matches()) {
            return true;
        } else {
            return false;
        }
    }
}

