package homework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class MittelwertMain {

	public static void main(String[] args) {
		//LinkedList, weil man Werte schnell hinzufügen möchte und nicht auf die Datenstruktur direkt zugreife
		//Kein Hashset weil die Daten ruhig gleich sein können
		LinkedList<Double> list = new LinkedList<>();
		Scanner meinScanner = new Scanner(System.in);
		String input = ""; // Input ist ""

		while (!input.equals("quit")) { // Solange input nicht "quit" ist mach das:
			System.out.println("Geben Sie eine Kommazahl an: ");
			input = meinScanner.nextLine(); // input ist das was wir eintippen

			try {
				double zahlen = Double.valueOf(input);//gibt ein Objekt des Typs Double zurück; Merke: Double.parseof() gibt double zurück(primitiv) 
				list.add(zahlen);
			} catch (NumberFormatException e) {
				System.out.println("Das war keine Kommazahl! Try again.");

			}
		}

		Iterator<Double> it = list.iterator();
		double summe = 0.0;
		while (it.hasNext()) {
			summe += it.next();

		}
		summe /= list.size();

		System.out.println("Mittelwert: " + summe);

		meinScanner.close();

	}
}
