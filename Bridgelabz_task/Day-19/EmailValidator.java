package java_regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    public static void main(String[] args) {

        String email = "abc.xyz@bl.co.in";
        Pattern p = Pattern.compile("^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)?@[a-zA-Z0-9]+"
        		+ "\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$");
        Matcher m = p.matcher(email);

        if (m.matches()) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
        }
    }
}
