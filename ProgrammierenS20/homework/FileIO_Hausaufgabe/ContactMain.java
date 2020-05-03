package homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ContactMain {

	public static void main(String[] args) {
		LinkedList<Contact> contacts = new LinkedList<>();
		contacts.add(new Contact(198345, "Daniel"));
		contacts.add(new Contact(312312, "Digimon"));
		contacts.add(new Contact(319876, "Frankie"));
		contacts.add(new Contact(123456789012L, "Chuck Norris"));
		contacts.add(new Contact(345678, "Bruce Lee"));
		contacts.add(new Contact(123345, "Bob Ross"));
		contacts.add(new Contact(917283, "Uwe Boll"));

		Collections.sort(contacts);
//AUFGABE 1
		// InputStream = Lesen einer Datei
		// OutputStream = Schreiben in eine Datei

		// Neue Datei anlegen, wo man die Kontakte reinschreibt

		File file = new File("aufgabe1.txt"); // relativ
		if (file.exists()) {
			System.out.println("Die Datei existiert.");
		} else {
			System.out.println("Die Datei wird angelegt.");
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try {
			// OutputStream
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for (Contact contact : contacts) {
				oos.writeObject(contact);

			}
			oos.close();
			fos.close();

			// InputStream
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();

			if (obj instanceof Contact) { // gelesene Objekt vom Typ Contact?
				for (Contact contact : contacts) {
					Contact kk = (Contact) obj; // casten

					System.out.println(contact.getName() + " " + contact.getNumber());
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
//AUFGABE 2
		File file2 = new File("aufgabe2.txt"); // relativ
		if (file2.exists()) {
			try {

				FileWriter fw = new FileWriter(file2);
				PrintWriter writer = new PrintWriter(fw);
				writer.println(
						"“Human relationships are chemical reactions. If you have a reaction then you can never return back to your previous state of being.” – Kaneki Ken");
				writer.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				
				Scanner meinScanner = new Scanner(file2);
				String line = meinScanner.nextLine();
				System.out.println(line);
				meinScanner.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}


		

