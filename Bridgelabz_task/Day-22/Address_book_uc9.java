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


    private Map<String, List<Person>> cityDictionary = new HashMap<>();
    private Map<String, List<Person>> stateDictionary = new HashMap<>();

    public void addAddressBook(String name) {
        books.put(name, new AddressBook(name));
    }

    public AddressBook getAddressBook(String name) {
        return books.get(name);
    }


    public void addPerson(String bookName, Person person) {
        AddressBook book = books.get(bookName);
        if (book != null) {
            book.addContact(person);


            cityDictionary.computeIfAbsent(person.getCity(), k -> new ArrayList<>()).add(person);


            stateDictionary.computeIfAbsent(person.getState(), k -> new ArrayList<>()).add(person);
        }
    }


    public List<Person> viewByCity(String city) {
        return cityDictionary.getOrDefault(city, Collections.emptyList());
    }


    public List<Person> viewByState(String state) {
        return stateDictionary.getOrDefault(state, Collections.emptyList());
    }
}

public class Address_book_uc9 {
    public static void main(String[] args) {
        AddressBookSystem system = new AddressBookSystem();

        system.addAddressBook("Friends");
        system.addAddressBook("Family");

        system.addPerson("Friends", new Person("Alice", "Chennai", "Tamil Nadu"));
        system.addPerson("Friends", new Person("Bob", "Bangalore", "Karnataka"));
        system.addPerson("Family", new Person("Charlie", "Chennai", "Tamil Nadu"));
        system.addPerson("Family", new Person("David", "Mumbai", "Maharashtra"));

        
        System.out.println("People in Chennai: " + system.viewByCity("Chennai"));
        
        System.out.println("People in Tamil Nadu: " + system.viewByState("Tamil Nadu"));
    }
}

