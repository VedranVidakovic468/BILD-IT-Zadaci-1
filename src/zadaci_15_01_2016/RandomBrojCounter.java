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
		//StartCopyCode source https://www.youtube.com/watch?v=pHxtKDENDdE&list=PLFE2CE09D83EE3E28&index=30
		for ( int r : randomNiz ) //sacuvanje brojaca 
		{
			brojacNiz[r]++;
		} //EndCopyCode I Ahmed understand this code. Ovaj kod je modificiran za izvrsavanje ovog koda 
		//ali ideja je od source
		
		//ispisivanje brojaca
		for (int i = 0; i < brojacNiz.length; i++) 
		{
		    System.out.println("" + i + " se ponavlja " + brojacNiz[i] + " puta");
		}


	}

}


