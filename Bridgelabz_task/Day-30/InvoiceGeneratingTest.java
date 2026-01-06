package invoice;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceGeneratingTest {
// Test case - 1
    @Test
    public void testInvoiceFare() {
        invoice voice = new invoice();
        double fare = voice.calculatefare(2.0, 5);
        Assert.assertEquals(25.0, fare, 0.0);
    }

    @Test
    public void givenlesstime() {
        invoice voice2 = new invoice();
        double fare = voice2.calculatefare(0.1, 1);
        Assert.assertEquals(5.0, fare, 0.0);
    }
//Test case - 2,3
    @Test
    public void getmultipleinvoice() {
        invoice voice2 = new invoice();
        Rides[] rides = { new Rides(2, 5), new Rides(0.1, 1) };
        Invoicesummary summary = voice2.calculatefare(rides);
        Invoicesummary expected = new Invoicesummary(2, 30.0);
        Assert.assertEquals(expected, summary);
    }
    
// Test case - 4
    @Test
    public void testPremiumRideInvoice() {
        invoice generator = new invoice();
        Rides[] rides = {
            new Rides(3.0, 10, RideType.PREMIUM), // (3×15)+(10×2)=45+20=65
            new Rides(0.2, 1, RideType.PREMIUM)   // (0.2×15)+(1×2)=3+2=5 → min fare = 20
        };
        Invoicesummary summary = generator.calculatefare(rides);
        Invoicesummary expected = new Invoicesummary(2, 85.0);
        Assert.assertEquals(expected, summary);
    }

}
