package day_24;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

class Hotel {

    String name;
    int weekdayRate;
    int weekendRate;

    Hotel(String name, int weekdayRate, int weekendRate) {
        this.name = name;
        this.weekdayRate = weekdayRate;
        this.weekendRate = weekendRate;
    }

    int calculateTotal(List<LocalDate> dates) {
        int total = 0;
        for (LocalDate date : dates) {
            DayOfWeek day = date.getDayOfWeek();
            if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY) {
                total += weekendRate;
            } else {
                total += weekdayRate;
            }
        }
        return total;
    }
}

public class CheapestHotel {

    public static void main(String[] args) {

        
        List<Hotel> hotels = Arrays.asList(
                new Hotel("Lakewood", 110, 90),
                new Hotel("Bridgewood", 160, 60),
                new Hotel("Ridgewood", 220, 150)
        );

       
        String input = "10Sep2020, 11Sep2020";
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("ddMMMyyyy", Locale.ENGLISH);

        List<LocalDate> dates = new ArrayList<>();
        for (String d : input.split(",")) {
            dates.add(LocalDate.parse(d.trim(), formatter));
        }

        
        Hotel cheapestHotel = null;
        int minCost = Integer.MAX_VALUE;

        for (Hotel hotel : hotels) {
            int cost = hotel.calculateTotal(dates);
            if (cost < minCost) {
                minCost = cost;
                cheapestHotel = hotel;
            }
        }

        
        System.out.println(cheapestHotel.name + ", Total Rates: $" + minCost);
    }
}
