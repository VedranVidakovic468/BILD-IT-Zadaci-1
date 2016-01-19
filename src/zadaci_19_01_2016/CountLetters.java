package zadaci_19_01_2016;

import java.util.Scanner;

public class CountLetters 
{
	public static int countLetters(String s) // metoda vraca broj slova u recenici
	{
		char [] slova = s.toCharArray(); // stravljamo string u char niz
		
		int spaceCount = 0;
		for ( int i = 0; i < slova.length; i++ ) // provjera koliko praznih mjesta ima
		{
			if ( slova[i] == ' ' )
			{
				spaceCount++;
			}
		}
		int ukupnoSlova = slova.length - spaceCount;
		return ukupnoSlova; // vracamo ukupan broj slova
	}
	
	public static void main(String[] args) 
	{
		
		Scanner unos = new Scanner(System.in);
		
		String recenica = unos.nextLine();
		
		System.out.println(countLetters(recenica));

	}

}
