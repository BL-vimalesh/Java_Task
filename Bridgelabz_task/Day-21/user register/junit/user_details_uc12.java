package junit;

public class user_details_uc12 {

    public String checkdetails(String firstname, String lastname, String email, String mobile, String password)
            throws InvalidUserDetailException {

        if (firstname == null || firstname.trim().isEmpty()) {
            throw new InvalidFirstNameException("Invalid First Name");
        }
        if (lastname == null || lastname.trim().isEmpty()) {
            throw new InvalidLastNameException("Invalid Last Name");
        }
        if (email == null || email.trim().isEmpty()) {
            throw new InvalidEmailException("Invalid Email");
        }
        if (mobile == null || mobile.trim().isEmpty()) {
            throw new InvalidMobileException("Invalid Mobile");
        }
        if (password == null || password.trim().isEmpty()) {
            throw new InvalidPasswordException("Invalid Password");
        }

        return "happy";
    }
}
