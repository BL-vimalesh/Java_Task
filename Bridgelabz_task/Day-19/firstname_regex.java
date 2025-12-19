package java_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.regex.*;

public class firstname_regex {
    public static void main(String[] args) {

        String firstName = "vima";

        Pattern p = Pattern.compile("^[A-Z][a-z]{1,3}$");
        Matcher m = p.matcher(firstName);

        if (m.matches()) {
            System.out.println("Valid First Name");
        } else {
            System.out.println("Invalid First Name");
        }
    }
}

