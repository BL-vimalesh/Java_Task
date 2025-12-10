package book;

import java.util.ArrayList;
import java.util.Scanner;

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


class AddressBook {
    private ArrayList<ContactPerson> contacts = new ArrayList<>();

    
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
            System.out.println("No contacts in Address Book.");
        } else {
            for (ContactPerson c : contacts) {
                System.out.println(c);
            }
        }
    }
}


public class Add_multiple_person {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        
        System.out.println("Welcome to Address Book Program!");

        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1: 
                	boolean b = true;
                	while(b) {
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
                    addressBook.addContact(contact);
                    
                    System.out.print("do u want to add more person YES/NO");
                    String response = sc.nextLine();
                    if(response.equalsIgnoreCase("No")) {
                    	b = false;
                    }}
                    break;

                case 2:
                    System.out.print("Enter First Name of contact to edit: ");
                    String editName = sc.nextLine();
                    addressBook.editContact(editName, sc);
                    break;

                case 3: 
                    System.out.print("Enter First Name of contact to delete: ");
                    String deleteName = sc.nextLine();
                    addressBook.deleteContact(deleteName);
                    break;

                case 4:
                    addressBook.displayContacts();
                    break;

                case 5:
                    exit = true;
                    System.out.println("Exiting Address Book Program...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        sc.close();
    }
}


