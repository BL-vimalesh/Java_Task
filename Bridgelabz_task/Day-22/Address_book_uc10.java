package add;
import java.util.*;
import java.util.stream.Collectors;

class Person {
    private String name;
    private String city;
    private String state;

    public Person(String name, String city, String state) {
        this.name = name;
        this.city = city;
        this.state = state;
    }

    public String getName() { return name; }
    public String getCity() { return city; }
    public String getState() { return state; }

    @Override
    public String toString() {
        return name + " (" + city + ", " + state + ")";
    }
}

class AddressBook {
    private String name;
    private List<Person> contacts;

    public AddressBook(String name) {
        this.name = name;
        this.contacts = new ArrayList<>();
    }

    public void addContact(Person person) {
        contacts.add(person);
    }

    public List<Person> getContacts() {
        return contacts;
    }
}

class AddressBookSystem {
    private Map<String, AddressBook> books = new HashMap<>();

    public void addAddressBook(String name) {
        books.put(name, new AddressBook(name));
    }

    public AddressBook getAddressBook(String name) {
        return books.get(name);
    }


    public Map<String, Long> countByCity() {
        return books.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .collect(Collectors.groupingBy(Person::getCity, Collectors.counting()));
    }

    
    public Map<String, Long> countByState() {
        return books.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .collect(Collectors.groupingBy(Person::getState, Collectors.counting()));
    }
}

public class Address_book_uc10 {
    public static void main(String[] args) {
        AddressBookSystem system = new AddressBookSystem();

        system.addAddressBook("Friends");
        system.addAddressBook("Family");

        system.getAddressBook("Friends").addContact(new Person("Alice", "Chennai", "Tamil Nadu"));
        system.getAddressBook("Friends").addContact(new Person("Bob", "Bangalore", "Karnataka"));
        system.getAddressBook("Family").addContact(new Person("Charlie", "Chennai", "Tamil Nadu"));
        system.getAddressBook("Family").addContact(new Person("David", "Mumbai", "Maharashtra"));

        
        System.out.println("Count by City: " + system.countByCity());
        
        System.out.println("Count by State: " + system.countByState());
    }
}
