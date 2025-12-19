package java_regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mobile_format {

	public static void main(String[] args) {
		String number = "911 9566649311";
		String[] number2 = number.split(" ");
		String countrycode = number2[0];
		String mnumber = number2[1];
		Pattern code = Pattern.compile("^[0-9]{2}$");
		Matcher m_code = code.matcher(countrycode);
		Pattern p = Pattern.compile("[6-9][0-9]{9}");
		Matcher m_number  = p.matcher(mnumber);
		
		while(m_number.find() && m_code.find()) {
			System.out.print("valid mobile number");
			return;
		}
		System.out.print("not an valid mobile number");
	}
}
