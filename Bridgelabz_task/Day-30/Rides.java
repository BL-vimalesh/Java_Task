package invoice;

public class Rides {
    public double distance;
    public int time;
    public RideType rideType;

    public Rides(double distance, int time, RideType rideType) {
        this.distance = distance;
        this.time = time;
        this.rideType = rideType;
    }
}
