import java.util.Scanner;

public class Zahlenschreiber {

	public static void main(String[] args) {
		
		Scanner meinScanner = new Scanner(System.in);
		
		System.out.printf("Geben Sie eine Ganzzahl zwischen 1 und 5 ein: ");
		int eingabe = meinScanner.nextInt();
		
		if(eingabe == 1) {
			System.out.print("EINS");
		}else if(eingabe ==2){
			System.out.print("Zwei");
		}else if(eingabe ==3){
			System.out.print("Drei");
		}else if(eingabe ==4){
			System.out.print("Vier");
		}else {
			System.out.print("Zahl ungültig");
		}
meinScanner.close();
	}

}
