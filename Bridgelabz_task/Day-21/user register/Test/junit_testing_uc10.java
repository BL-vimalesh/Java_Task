package Test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import junit.junit_validate_uc10;

public class junit_testing_uc10 {

	@Test
	public void checkdetails() {
		junit_validate_uc10 junit = new junit_validate_uc10();
		String output = junit.checkdetails("vimalesh", "R", "v@gmail.com", "967754743", "Vimalesh@281");
        String expected = "happy";
        assertEquals(expected, output);
	}
	
	@Test
	public void checkdetails2() {
		junit_validate_uc10 junit = new junit_validate_uc10();
		String output = junit.checkdetails("vimalesh", "", "v@gmail.com", "967754743", "Vimalesh@281");
        String expected = "sad";
        assertEquals(expected, output);
	}
}


