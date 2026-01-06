package invoice;

import java.util.*;

public class RideRepository {
    private Map<String, List<Rides>> userRideMap = new HashMap<>();

    public void addRides(String userId, Rides[] rides) {
        userRideMap.put(userId, Arrays.asList(rides));
    }

    public List<Rides> getRides(String userId) {
        return userRideMap.get(userId);
    }
}
