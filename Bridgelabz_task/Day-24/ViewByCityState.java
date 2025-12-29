package stream_api;

import java.util.*;
import java.util.stream.Collectors;

class Person {

    String name;
    String city;
    String state;

    public Person(String name, String city, String state) {
        this.name = name;
        this.city = city;
        this.state = state;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class ViewByCityState {

    public static void main(String[] args) {


        List<Person> persons = Arrays.asList(
                new Person("Vimalesh", "Chennai", "TN"),
                new Person("Rajesh", "Whitefield", "KA"),
                new Person("Gosh", "Pune", "MH"),
                new Person("Arun", "Chennai", "TN")
        );


        Map<String, List<Person>> personsByCity =
                persons.stream()
                       .collect(Collectors.groupingBy(p -> p.city));


        Map<String, List<Person>> personsByState =
                persons.stream()
                       .collect(Collectors.groupingBy(p -> p.state));


        System.out.println("Persons by City:");
        personsByCity.forEach((city, list) ->
                System.out.println(city + " -> " + list));

        System.out.println("\nPersons by State:");
        personsByState.forEach((state, list) ->
                System.out.println(state + " -> " + list));
    }
}
