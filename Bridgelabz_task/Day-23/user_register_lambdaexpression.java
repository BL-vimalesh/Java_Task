package lambda_expression;

public class user_register_lambdaexpression {

	@FunctionalInterface
	public interface calculate{
		boolean validate(String input);
	}
	public static void main(String[] args) {
		
		calculate firstvalidation = (name) -> name.matches("[A-Z][a-z]{2,}");
		
		calculate lastvalidation = (name) -> name.matches("[A-Z][a-z]{1,}");
				
		calculate email = emails-> emails.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
		
		calculate mobile = mobiles -> mobiles.matches("\\d{10}");
		
		calculate password = passwords -> passwords.matches("(?=.*[A-Z])(?=.*[@#$!%]).{8,}");
		
		
		System.out.println(firstvalidation.validate("John"));
		System.out.println(lastvalidation.validate("Ravi"));
		System.out.println(email.validate("v@gmail.com"));
		System.out.println(mobile.validate("9566649311"));
		System.out.println(password.validate("Vimalesh@281"));

	}

}
