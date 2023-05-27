package Lab;

import java.util.ArrayList;

public class Deck {
	
	
	public boolean deck(String cardname,ArrayList<String> arr) {
		if (arr.contains(cardname)) {
			return false;
			
		}
		else {
			arr.add(cardname);
			
		}
		return true;
		
	}

}
