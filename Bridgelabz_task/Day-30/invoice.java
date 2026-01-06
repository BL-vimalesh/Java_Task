package invoice;

public class invoice {
    private static final double MINIMUM_COST_PER_KILOMETER = 10.0;
    private static final int COST_PER_TIME = 1;
    private static final double MINIMUM_FARE = 5;

        public double calculatefare(double distance, int time, RideType rideType) {
            double costPerKm;
            int costPerMin;
            double minimumFare;

            if (rideType == RideType.PREMIUM) {
                costPerKm = 15.0;
                costPerMin = 2;
                minimumFare = 20.0;
            } else {
                costPerKm = 10.0;
                costPerMin = 1;
                minimumFare = 5.0;
            }

            double totalFare = distance * costPerKm + time * costPerMin;
            return Math.max(totalFare, minimumFare);
        }

        public Invoicesummary calculatefare(Rides[] rides) {
            double total = 0;
            for (Rides ride : rides) {
                total += calculatefare(ride.distance, ride.time, ride.rideType);
            }
            return new Invoicesummary(rides.length, total);
        }

}
