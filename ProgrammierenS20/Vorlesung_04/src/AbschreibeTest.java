import java.util.Scanner;

public class AbschreibeTest {

	public static void main(String[] args) {
		
		Scanner meinScanner = new Scanner(System.in);
		
		String text = "Keep It SimpeL sTupid";
		
		System.out.print("Bitte tippen SIe - Keep It SimpeL sTupid: ");
		String eingabe = meinScanner.nextLine();
		
		if(eingabe.equals(text)) {
			System.out.print("Die Eingabe war korrekt!");
			
		}if(!eingabe.equals(text)) {
			System.out.print("Die Eingabe war leider nicht korrekt!");
			
		}
		meinScanner.close();
	}

}
