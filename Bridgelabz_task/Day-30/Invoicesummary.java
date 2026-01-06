package invoice;

public class Invoicesummary {

    private int no_of_rides;
    private double totalfare;
    private double average_fare;

    public Invoicesummary(int no_of_rides, double totalfare) {
        this.no_of_rides = no_of_rides;
        this.totalfare = totalfare;
        this.average_fare = totalfare / no_of_rides;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Invoicesummary that = (Invoicesummary) obj;
        return no_of_rides == that.no_of_rides &&
               Double.compare(that.totalfare, totalfare) == 0 &&
               Double.compare(that.average_fare, average_fare) == 0;
    }
}
