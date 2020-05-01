package homework;
//HashSet, weil keine Duplikate, viele gleiche Daten, Zugriff über for each

import java.util.HashSet;
import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		Scanner meinScanner = new Scanner(System.in);
		HashSet<Account> accounts = new HashSet<>();

		accounts.add(new Account("Midoriya", 2888493));
		accounts.add(new Account("Allmight", 14758393));
		accounts.add(new Account("DarkSocio", 3355633));
		accounts.add(new Account("DarkSocio", 335633));

		System.out.println("Neuen Account anlegen (Benutzername):");
		String Name = meinScanner.nextLine();
		System.out.println("Neuen Account anlegen (Handynummer):");
		long Nr = meinScanner.nextLong();

		Account neuerAccount = new Account(Name, Nr);
		accounts.add(neuerAccount);
		if (accounts.contains(neuerAccount)) {
			System.out.println("Benutzername/Nummer schon vergeben.");
		} else {

			for (Account account : accounts) {
				System.out.print("Account: ");
				System.out.println(String.format("%10s\t%d", account.getName(), account.getNumber()));
			}
		}
		meinScanner.close();

	}
}