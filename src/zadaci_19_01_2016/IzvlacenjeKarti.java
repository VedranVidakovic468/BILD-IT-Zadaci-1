package zadaci_19_01_2016;

import java.util.Random;

public class IzvlacenjeKarti {

	public static void main(String[] args) {
		
		Random randomGenerator = new Random();
		
		String [] karte = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q" , "K"};
		String [] znakovi = {"Srce", "Pik", "Djetelina", "Kocka"};

		int brojKarte = randomGenerator.nextInt(13);
		int brojZnaka = randomGenerator.nextInt(4);
		
		System.out.println("Karta koju ste izvukli je "+karte[brojKarte]+" u znaku "+znakovi[brojZnaka]);
	}

}
