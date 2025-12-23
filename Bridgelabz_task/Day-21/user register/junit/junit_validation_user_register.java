package junit;

public class junit_validation_user_register {
      private static String firstname;
      private static String lastname;
      private static String email;
      private static String mobile;
      private static String password;
      public junit_validation_user_register(String firstname, String lastname, String email, String mobile, String password) {
    	  this.firstname = firstname;
    	  this.lastname = lastname;
    	  this.email = email;
    	  this.mobile = mobile;
    	  this.password = password;
      }
      public String checkuserdetails() {
    	  if(firstname.trim().isEmpty() || lastname.trim().isEmpty() || email.trim().isEmpty() 
    			  || mobile.trim().isEmpty() || password.trim().isEmpty()) {
    		  return "sad";
    	  }
    	  return "happy";
      }
}
