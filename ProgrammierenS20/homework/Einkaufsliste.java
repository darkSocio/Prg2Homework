package homework;


import java.util.HashMap;

public class Einkaufsliste {
	public static void main(String[] args) {
		
	

	 HashMap<String, String> shopList = new HashMap<>();
	 
	 shopList.put("Pop Vinyl Figur", "2");
	 shopList.put("SD-Karte", "1");
	 shopList.put("Hafermilch", "5");
	 shopList.put("Socken", "3");
	 shopList.put("Mascara", "2");
	 
	 System.out.println("Einkaufsliste: ");
	 
	 for(String article : shopList.keySet()) {
		 System.out.println(" o " + article);
		 String value = shopList.get(article);
		 System.out.println("   Menge: " + value);
	 }
	 
	 
	 
	}
}
	
	 