package add;

import java.util.*;

public class address_book_uc7 {

	static class Person {
		String name;

		Person(String name) {
			this.name = name;
		}

		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null || getClass() != obj.getClass())
				return false;
			Person person = (Person) obj;
			return name.equals(person.name);
		}
	}

	public static void main(String[] args) {

		List<Person> addressBook = new ArrayList<>();

		addPerson(addressBook, new Person("Rahul"));
		addPerson(addressBook, new Person("Anita"));
		addPerson(addressBook, new Person("Rahul")); 
	}

	static void addPerson(List<Person> list, Person person) {

		
		if (list.contains(person)) {
			System.out.println("Duplicate entry not allowed: " + person.name);
		} else {
			list.add(person);
			System.out.println("Person added: " + person.name);
		}
	}
}
