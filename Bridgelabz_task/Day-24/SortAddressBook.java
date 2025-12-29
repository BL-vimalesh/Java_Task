package stream_api;

import java.util.*;
import java.util.stream.Collectors;

class Person {

	String name;
	String city;
	String state;

	Person(String name, String city, String state) {
		this.name = name;
		this.city = city;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", City: " + city + ", State: " + state;
	}
}

public class SortAddressBook {

	public static void main(String[] args) {

		List<Person> addressBook = Arrays.asList(new Person("Vimalesh", "Chennai", "TN"),
				new Person("Arun", "Bangalore", "KA"), new Person("Rajesh", "Whitefield", "KA"),
				new Person("Gosh", "Pune", "MH"), new Person("Meena", "Chennai", "TN"));

		List<Person> sortlist = addressBook.stream().sorted(Comparator.comparing(p -> p.name))
				.collect(Collectors.toList());

		sortlist.forEach(System.out::println);
	}
}
