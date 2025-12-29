package stream_api;

import java.util.*;

public class AddressBook {

    String name;
    String address;

    AddressBook(String name, String address) {
        this.name = name;
        this.address = address;
    }
    @Override
    public boolean equals(Object obj) {
        System.out.println(this);
        System.out.println(obj);
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        AddressBook other = (AddressBook) obj;
        return name.equalsIgnoreCase(other.name);
    }


    @Override
    public int hashCode() {
        return name.toLowerCase().hashCode();
    }
    public static void main(String[] args) {
        List<AddressBook> persons = new ArrayList<>();      
        addPerson(persons, new AddressBook("John", "Chennai"));
        addPerson(persons, new AddressBook("Alice", "Bangalore"));
        addPerson(persons, new AddressBook("john", "Mumbai")); // Duplicate
    }

    static void addPerson(List<AddressBook> persons, AddressBook newPerson) {

        boolean isDuplicate = persons.stream()
                .anyMatch(p -> p.equals(newPerson)); 

        if (isDuplicate) {
            System.out.println("Duplicate Entry: " + newPerson.name);
        } else {
            persons.add(newPerson);
            System.out.println("Person Added: " + newPerson.name);
        }
    }
}


