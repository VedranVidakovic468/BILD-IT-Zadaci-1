package zadaci_26_01_2016;

import java.util.Random;

public class Zadatak1 
{

	public static void main(String[] args) 
	{
		Random randomGenerator = new Random(); // random klasa za generisanje nasumicnih brojeva
		
		String slova = ""; // inicijalizacija slova
		String brojevi = ""; // inicijalizacija brojeva
		for ( int i = 0; i < 4; i++ ) // for lopp za 4 ponavljanja jer brojevi imaju max 4 charaktera
		{
			int x = randomGenerator.nextInt( 91-65 ) + 65; // od 65 do 90 su uppercase Letters u ascii codu
			int y = randomGenerator.nextInt( 58-48 ) + 48; // od 48 do 57 su brojevu u ascii codu
			if ( i < 3 ) // tablica ima max tri slova i prema tome cemo samo sabrat 3 slova
				{
				slova += ( char ) x;
				}
			brojevi += ( char )y; // dodavanje brojeva 
		}

		//ispis tablice
		System.out.println(slova+"-"+brojevi);
	}

}
