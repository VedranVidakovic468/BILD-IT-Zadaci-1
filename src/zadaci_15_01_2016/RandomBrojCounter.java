package zadaci_15_01_2016;

import java.util.Random;

public class RandomBrojCounter {

	public static void main(String[] args) {
		
		Random rndObj = new Random(); //random objekat za generisanje nasumicnih brojeva
		
		int randomNiz [] = new int[100]; //random niz za sacuvanje nasumicnih brojeva
		int brojacNiz [] = new int [10]; // niz brojac
		
		for ( int i = 0; i < randomNiz.length; i++ ) //unosenje nasumicnih brojeva od 0 - 9 u niz
		{

			randomNiz[i] = rndObj.nextInt(10);
		}

		for ( int r : randomNiz ) //sacuvanje brojaca 
		{
			brojacNiz[r]++;
		}
		
		//ispisivanje brojaca
		for (int i = 0; i < brojacNiz.length; i++) 
		{
		    System.out.println("" + i + " se ponavlja " + brojacNiz[i] + " puta");
		}


	}

}


