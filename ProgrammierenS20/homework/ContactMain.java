package datastructures;


import java.util.Collections;
import java.util.LinkedList;

public class ContactMain  {

	public static void main(String[] args) {
		LinkedList<Contact> contacts = new LinkedList<>();
		
		
		contacts.add(new Contact(1234345678L, "Kiwan"));
		contacts.add(new Contact(012323732323L, "Zorro"));
		contacts.add(new Contact(786768562343L, "Zorro"));
		contacts.add(new Contact(0, "Chuck Norris"));
		contacts.add(new Contact(14656, "Bruce Lee"));
		contacts.add(new Contact(14656, "Bob Ross"));
		Collections.sort(contacts);
		
		for (Contact person : contacts) {
			System.out.println(String.format("%15s\t%d", person.getName(), person.getNumber()));

	}

}
}
