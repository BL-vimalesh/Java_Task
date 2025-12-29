package day_24;

import java.util.ArrayList;
import java.util.List;

public class HotelReservationService {
	public class Hotel {

		private String name;
		private int regularWeekdayRate;
		private int regularWeekendRate;

		public Hotel(String name, int regularWeekdayRate, int regularWeekendRate) {
			this.name = name;
			this.regularWeekdayRate = regularWeekdayRate;
			this.regularWeekendRate = regularWeekendRate;
		}

		public String getName() {
			return name;
		}

		public int getRegularWeekdayRate() {
			return regularWeekdayRate;
		}

		public int getRegularWeekendRate() {
			return regularWeekendRate;
		}
	}

	private List<Hotel> hotels = new ArrayList<>();

	public void addHotel(String name, int weekdayRate, int weekendRate) {
		Hotel hotel = new Hotel(name, weekdayRate, weekendRate);
		hotels.add(hotel);
	}

	public List<Hotel> getHotels() {
		return hotels;
	}
}
