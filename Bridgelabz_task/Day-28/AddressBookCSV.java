package day_28;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AddressBookCSV {
	public class Person {
	    private String name;
	    private String phone;
	    private String email;

	    public Person(String name, String phone, String email) {
	        this.name = name;
	        this.phone = phone;
	        this.email = email;
	    }
	    public String getName() { return name; }
	    public String getPhone() { return phone; }
	    public String getEmail() { return email; }
	}
    public static void main(String[] args) {
        String filePath = "contactperson/addressbook.csv";       
        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
            
            String[] header = {"Name", "Phone", "Email"};
            writer.writeNext(header);

            // Contact rows
            String[] contact1 = {"Vimalesh", "9876543210", "vimalesh@gmail.com"};
            String[] contact2 = {"Ramesh", "9432543210", "ramesh@gmail.com"};

            writer.writeNext(contact1);
            writer.writeNext(contact2);

            System.out.println("Contacts written successfully to CSV file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] nextLine;
            System.out.println("\nReading Address Book from CSV file:");
            while ((nextLine = reader.readNext()) != null) {
                System.out.println("Name: " + nextLine[0] +
                                   ", Phone: " + nextLine[1] +
                                   ", Email: " + nextLine[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

