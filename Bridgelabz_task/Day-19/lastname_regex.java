package java_regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lastname_regex {
	public static void main(String[] args) {
		String lastname = "Sachin Tendulakar";
		
		String[] str= lastname.split(" ");
		String new_lastname = str[str.length-1];
		Pattern p = Pattern.compile("^[A-Z][a-z]{2,}$");
        Matcher m = p.matcher(new_lastname);
        while(m.matches()) {
        	System.out.print("lastname is valid");
        	return;
        }
        
        System.out.print("invalid lastname");
	}
}


