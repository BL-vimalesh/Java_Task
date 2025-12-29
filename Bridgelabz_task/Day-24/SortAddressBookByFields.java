package stream_api;

import java.util.*;
import java.util.stream.Collectors;

class Person {

    String name;
    String city;
    String state;
    String zip;

    Person(String name, String city, String state, String zip) {
        this.name = name;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }


    @Override
    public String toString() {
        return "Name: " + name +
               ", City: " + city +
               ", State: " + state +
               ", Zip: " + zip;
    }
}

public class SortAddressBookByFields {

    
    public static List<Person> sortByCity(List<Person> persons) {
        return persons.stream()
                      .sorted(Comparator.comparing(p -> p.city))
                      .collect(Collectors.toList());
    }

    
    public static List<Person> sortByState(List<Person> persons) {
        return persons.stream()
                      .sorted(Comparator.comparing(p -> p.state))
                      .collect(Collectors.toList());
    }

    
    public static List<Person> sortByZip(List<Person> persons) {
        return persons.stream()
                      .sorted(Comparator.comparing(p -> p.zip))
                      .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<Person> addressBook = Arrays.asList(
                new Person("Vimalesh", "Chennai", "TN", "600001"),
                new Person("Arun", "Bangalore", "KA", "560001"),
                new Person("Rajesh", "Whitefield", "KA", "560066"),
                new Person("Gosh", "Pune", "MH", "411001"),
                new Person("Meena", "Chennai", "TN", "600045")
        );

        System.out.println("Sorted by City:");
        sortByCity(addressBook).forEach(System.out::println);

        System.out.println("\nSorted by State:");
        sortByState(addressBook).forEach(System.out::println);

        System.out.println("\nSorted by Zip:");
        sortByZip(addressBook).forEach(System.out::println);
    }
}

