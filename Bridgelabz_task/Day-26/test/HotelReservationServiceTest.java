package test;

import day_24.HotelReservationService;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HotelReservationServiceTest {

    @Test
    void givenHotelDetails_WhenAdded_ShouldReturnHotelInList() {

        HotelReservationService service = new HotelReservationService();

        service.addHotel("Lakewood", 110, 90);

        assertEquals(1, service.getHotels().size());
        assertEquals("Lakewood", service.getHotels().get(0).getName());
        assertEquals(110, service.getHotels().get(0).getRegularWeekdayRate());
        assertEquals(90, service.getHotels().get(0).getRegularWeekendRate());
    }
}
