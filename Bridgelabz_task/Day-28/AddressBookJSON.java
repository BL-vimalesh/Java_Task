package day_28;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.*;

public class AddressBookJSON {

    public static void main(String[] args) {
        String filePath = "contactperson/addressbook.json";
        Gson gson = new Gson();

       
        List<Person> contacts = Arrays.asList(
            new Person("Vimalesh", "9876543210", "vimalesh@gmail.com"),
            new Person("Ramesh", "9432543210", "ramesh@gmail.com")
        );


        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(contacts, writer);
            System.out.println("Contacts written successfully to JSON file.");
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (FileReader reader = new FileReader(filePath)) {
            Type listType = new TypeToken<List<Person>>() {}.getType();
            List<Person> readContacts = gson.fromJson(reader, listType);

            System.out.println("\nReading Address Book from JSON file:");
            readContacts.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
