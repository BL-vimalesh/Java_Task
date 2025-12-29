package stream_api;

import java.util.*;
import java.util.stream.*;
public class AddressBookUC8 {
	String name;
	String city;
	String state;
	public AddressBookUC8(String name, String city, String state) {
		this.name = name;
		this.city = city;
		this.state = state;
	}
	public static void main(String[] args) {
		
		List<AddressBookUC8> book1 = Arrays.asList(
				new AddressBookUC8("vimalesh","tiruppur","tn"));
		
		List<AddressBookUC8> book2 = Arrays.asList(
				new AddressBookUC8("ronaldo","lisben","portual"));
		
        List<List<AddressBookUC8>> allBooks = Arrays.asList(book1, book2);

       
        allBooks.stream()
                .flatMap(book -> book.stream())   
                .filter(p -> p.city.equalsIgnoreCase("Chennai"))
                .forEach(p -> System.out.println(p.name));


        allBooks.stream()
                .flatMap(book -> book.stream())
                .filter(p -> p.state.equalsIgnoreCase("TN"))
                .forEach(p -> System.out.println(p.name));
    }
}
