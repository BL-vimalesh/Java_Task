package add;

import java.util.*;

public class AddressBookSystem {

	
	static Map<String, List<String>> addressBooks = new HashMap<>();

	public static void main(String[] args) {

		
		addressBooks.put("Personal", new ArrayList<>());
		addressBooks.put("Office", new ArrayList<>());

	
		addressBooks.get("Personal").add("Rahul - 9999999999");
		addressBooks.get("Office").add("Manager - 8888888888");

		
		System.out.println("Personal Address Book:");
		System.out.println(addressBooks.get("Personal"));

		System.out.println("Office Address Book:");
		System.out.println(addressBooks.get("Office"));
	}
}
