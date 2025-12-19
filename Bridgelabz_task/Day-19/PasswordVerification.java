package java_regex;
import java.util.regex.Pattern;
public class PasswordVerification {
    public static void main(String[] args) {
        String password = "vimalesh@281";  
        String regex = "^(?=.*[A-Z])(?=.*[@#$%^&*+=!]).{8,}";
        
        boolean isValid = Pattern.matches(regex, password);
        if (isValid) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }
}
