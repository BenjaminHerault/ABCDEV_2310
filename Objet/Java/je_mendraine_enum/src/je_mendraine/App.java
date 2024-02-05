package je_mendraine;

import je_mendraine_enum.Day;

public class App {

	public static void main(String[] args) {
		
		Day moment =  Day.MATIN;
		System.out.println(moment.name().toLowerCase());
		
		moment =  Day.MIDI;
		System.out.println("Nous somme actuellement le " + moment.name().toLowerCase() + 
							" il est actuellement : " + moment.getHour()+ "h "+moment.getMessage());
		
		moment = Day.SOIR;
		System.out.println("Nous somme actuellement le " + moment.name().toLowerCase() + 
							" il est actuellement : " + moment.getHour()+ "h " +moment.getMessage());

		
		for (Day moment1 : Day.values()) {
			
			//pour pas avoir tout on peux faire
			if(!moment1.equals(Day.MIDI)) {
				
				System.out.println("Nous somme actuellement le " + moment1.name().toLowerCase() + 
									" il est actuellement : " + moment1.getHour()+ "h " +moment1.getMessage());
			}
		}
	}

}
