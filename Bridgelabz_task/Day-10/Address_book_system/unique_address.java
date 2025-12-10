package n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

// ContactPerson class
class ContactPerson {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    public String getZip() { return zip; }
    public void setZip(String zip) { this.zip = zip; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + address + ", " + city + ", " + state +
               ", " + zip + ", Phone: " + phoneNumber + ", Email: " + email;
    }
}

// AddressBook class
class AddressBook {
    private String name; 
    private ArrayList<ContactPerson> contacts = new ArrayList<>();

    public AddressBook(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public void addContact(ContactPerson contact) {
        contacts.add(contact);
        System.out.println("Contact added successfully!");
    }

    public void editContact(String name, Scanner sc) {
        for (ContactPerson c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(name)) {
                System.out.println("Editing contact: " + c);
                System.out.print("Enter new Address: ");
                c.setAddress(sc.nextLine());
                System.out.print("Enter new City: ");
                c.setCity(sc.nextLine());
                System.out.print("Enter new State: ");
                c.setState(sc.nextLine());
                System.out.print("Enter new Zip: ");
                c.setZip(sc.nextLine());
                System.out.print("Enter new Phone Number: ");
                c.setPhoneNumber(sc.nextLine());
                System.out.print("Enter new Email: ");
                c.setEmail(sc.nextLine());
                System.out.println("Contact updated successfully!");
                return;
            }
        }
        System.out.println("Contact not found!");
    }

    public void deleteContact(String name) {
        for (ContactPerson c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(name)) {
                contacts.remove(c);
                System.out.println("Contact deleted successfully!");
                return;
            }
        }
        System.out.println("Contact not found!");
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts in Address Book '" + name + "'.");
        } else {
            System.out.println("Contacts in Address Book '" + name + "':");
            for (ContactPerson c : contacts) {
                System.out.println(c);
            }
        }
    }
}

// AddressBookSystem class
class AddressBookSystem {
    private HashMap<String, AddressBook> addressBooks = new HashMap<>();

    public void addAddressBook(String name) {
        if (addressBooks.containsKey(name.toLowerCase())) {
            System.out.println("Address Book with this name already exists!");
            return;
        }
        addressBooks.put(name.toLowerCase(), new AddressBook(name));
        System.out.println("New Address Book '" + name + "' added successfully!");
    }

    public AddressBook getAddressBook(String name) {
        return addressBooks.get(name.toLowerCase());
    }

    public void displayAddressBooks() {
        if (addressBooks.isEmpty()) {
            System.out.println("No Address Books available.");
        } else {
            System.out.println("Available Address Books:");
            for (String key : addressBooks.keySet()) {
                System.out.println("- " + key);
            }
        }
    }
}

// Main class
public class unique_address {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBookSystem system = new AddressBookSystem();

        System.out.println("Welcome to Address Book System!");

        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add New Address Book");
            System.out.println("2. Select Address Book");
            System.out.println("3. Display All Address Books");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter Address Book name: ");
                    String bookName = sc.nextLine();
                    system.addAddressBook(bookName);
                    break;

                case 2:
                    System.out.print("Enter Address Book name to select: ");
                    String selectName = sc.nextLine();
                    AddressBook selectedBook = system.getAddressBook(selectName);
                    if (selectedBook != null) {
                        boolean back = false;
                        while (!back) {
                            System.out.println("\nWorking in Address Book: " + selectName);
                            System.out.println("1. Add Contact");
                            System.out.println("2. Edit Contact");
                            System.out.println("3. Delete Contact");
                            System.out.println("4. Display Contacts");
                            System.out.println("5. Back to Main Menu");
                            System.out.print("Enter choice: ");
                            int subChoice = Integer.parseInt(sc.nextLine());

                            switch (subChoice) {
                                case 1:
                                    ContactPerson contact = new ContactPerson();
                                    System.out.print("Enter First Name: ");
                                    contact.setFirstName(sc.nextLine());
                                    System.out.print("Enter Last Name: ");
                                    contact.setLastName(sc.nextLine());
                                    System.out.print("Enter Address: ");
                                    contact.setAddress(sc.nextLine());
                                    System.out.print("Enter City: ");
                                    contact.setCity(sc.nextLine());
                                    System.out.print("Enter State: ");
                                    contact.setState(sc.nextLine());
                                    System.out.print("Enter Zip: ");
                                    contact.setZip(sc.nextLine());
                                    System.out.print("Enter Phone Number: ");
                                    contact.setPhoneNumber(sc.nextLine());
                                    System.out.print("Enter Email: ");
                                    contact.setEmail(sc.nextLine());
                                    selectedBook.addContact(contact);
                                    break;

                                case 2:
                                    System.out.print("Enter First Name of contact to edit: ");
                                    String editName = sc.nextLine();
                                    selectedBook.editContact(editName, sc);
                                    break;

                                case 3:
                                    System.out.print("Enter First Name of contact to delete: ");
                                    String deleteName = sc.nextLine();
                                    selectedBook.deleteContact(deleteName);
                                    break;

                                case 4:
                                    selectedBook.displayContacts();
                                    break;

                                case 5:
                                    back = true;
                                    break;

                                default:
                                    System.out.println("Invalid choice. Try again.");
                            }
                        }
                    } else {
                        System.out.println("Address Book not found!");
                    }
                    break;

                case 3:
                    system.displayAddressBooks();
                    break;

                case 4:
                    exit = true;
                    System.out.println("Exiting Address Book System...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        sc.close();
    }
}

