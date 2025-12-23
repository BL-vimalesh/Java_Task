package Test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import junit.junit_validation_user_register;

public class user_register_testing {

    @Test
    public void testing() {
        junit_validation_user_register junit = new junit_validation_user_register(
            "vimalesh", "R", "v@gmail.com", "967754743", "Vimalesh@281"
        );
        String output = junit.checkuserdetails();
        String expected = "happy";
        assertEquals(expected, output);
    }
    @Test
    public void testing2() {
        junit_validation_user_register junit = new junit_validation_user_register(
            "vimalesh", "R", "", "967754743", "Vimalesh@281"
        );
        String output = junit.checkuserdetails();
        String expected = "sad";
        assertEquals(expected, output);
    }
}
