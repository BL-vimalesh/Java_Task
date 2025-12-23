package junit;

public class junit_validate_uc10 {
	
	public String checkdetails(String firstname, String lastname, String email, String mobile, String password) {
		if(firstname.trim().isEmpty() || lastname.trim().isEmpty() || email.trim().isEmpty()
				|| mobile.trim().isEmpty() || password.trim().isEmpty()) {
			return "sad";
		}
		return "happy";
	}
}