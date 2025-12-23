package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;
import junit.*;

public class junit_testing_uc12 {

    @Test
    public void givenValidDetails_shouldReturnHappy() throws InvalidUserDetailException {
        junit_validate_uc10 junit = new junit_validate_uc10();
        String output = junit.checkdetails("vimalesh", "R", "v@gmail.com", "967754743", "Vimalesh@281");
        assertEquals("happy", output);
    }

    @Test
    public void givenEmptyFirstName_shouldThrowInvalidFirstNameException() {
        junit_validate_uc10 junit = new junit_validate_uc10();
        try {
            junit.checkdetails("", "R", "v@gmail.com", "967754743", "Vimalesh@281");
            fail("Expected InvalidFirstNameException was not thrown");
        } catch (InvalidFirstNameException e) {
            assertEquals("Invalid First Name", e.getMessage());
        } catch (InvalidUserDetailException e) {
            fail("Wrong exception type thrown");
        }
    }

    @Test
    public void givenEmptyLastName_shouldThrowInvalidLastNameException() {
        junit_validate_uc10 junit = new junit_validate_uc10();
        try {
            junit.checkdetails("vimalesh", "", "v@gmail.com", "967754743", "Vimalesh@281");
            fail("Expected InvalidLastNameException was not thrown");
        } catch (InvalidLastNameException e) {
            assertEquals("Invalid Last Name", e.getMessage());
        } catch (InvalidUserDetailException e) {
            fail("Wrong exception type thrown");
        }
    }

    @Test
    public void givenEmptyEmail_shouldThrowInvalidEmailException() {
        junit_validate_uc10 junit = new junit_validate_uc10();
        try {
            junit.checkdetails("vimalesh", "R", "", "967754743", "Vimalesh@281");
            fail("Expected InvalidEmailException was not thrown");
        } catch (InvalidEmailException e) {
            assertEquals("Invalid Email", e.getMessage());
        } catch (InvalidUserDetailException e) {
            fail("Wrong exception type thrown");
        }
    }

    @Test
    public void givenEmptyMobile_shouldThrowInvalidMobileException() {
        junit_validate_uc10 junit = new junit_validate_uc10();
        try {
            junit.checkdetails("vimalesh", "R", "v@gmail.com", "", "Vimalesh@281");
            fail("Expected InvalidMobileException was not thrown");
        } catch (InvalidMobileException e) {
            assertEquals("Invalid Mobile", e.getMessage());
        } catch (InvalidUserDetailException e) {
            fail("Wrong exception type thrown");
        }
    }

    @Test
    public void givenEmptyPassword_shouldThrowInvalidPasswordException() {
        junit_validate_uc10 junit = new junit_validate_uc10();
        try {
            junit.checkdetails("vimalesh", "R", "v@gmail.com", "967754743", "");
            fail("Expected InvalidPasswordException was not thrown");
        } catch (InvalidPasswordException e) {
            assertEquals("Invalid Password", e.getMessage());
        } catch (InvalidUserDetailException e) {
            fail("Wrong exception type thrown");
        }
    }
}
