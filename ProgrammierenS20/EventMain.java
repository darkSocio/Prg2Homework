package homework;


import java.util.ArrayList;

public class EventMain {

	public static void main(String[] args) {

		ArrayList<Event> events = new ArrayList<>();

		events.add(new Event("It's my birthday, bitches!", "Golden Event Center", "2020,11,15"));
		events.add(new Event("Abiball", "Rathhaus", "2021/10/07"));
		events.add(new Event("Auf nach Vietnam", "Flughafen Hamburg", "2020/12/24"));
		events.add(new Event("Prüfung Prg2", "HAW Finkenau", "2020/07/30"));
		events.add(new Event("Prüfung Prg2", "HAW Finkenau", "2020/07/30"));

		System.out.printf("%-30s | %-30s | %-25s\n", "Event", "Ort", "Datum");
		System.out.println("_______________________________________________________________________________________");
		for (Event event : events) {
			
			System.out.printf("%-30s | %-30s | %-25s\n", event.getName(), event.getOrt(), event.getDatum());
		}

	}
} 