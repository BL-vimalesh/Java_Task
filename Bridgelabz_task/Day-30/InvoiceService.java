package invoice;

import java.util.List;

public class InvoiceService {
    private RideRepository rideRepository;

    public InvoiceService() {
        this.rideRepository = new RideRepository();
    }

    public Invoicesummary getInvoice(String userId) {
        List<Rides> userRides = rideRepository.getRides(userId);
        double totalFare = 0;

        for (Rides ride : userRides) {
            invoice fareCalculator = new invoice();
            totalFare += fareCalculator.calculatefare(ride.distance, ride.time);
        }

        return new Invoicesummary(userRides.size(), totalFare);
    }
}
