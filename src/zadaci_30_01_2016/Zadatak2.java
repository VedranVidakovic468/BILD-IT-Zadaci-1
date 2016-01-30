package zadaci_30_01_2016;

import java.util.Scanner;

public class Zadatak2 
{

	public static void main(String[] args) 
	{
		Scanner unos = new Scanner (System.in); // scanner objekat za unos
		
		System.out.println( "Unesite neki string "); // upit za unos
		String duzina = unos.nextLine();
		
		char niz [] = duzina.toCharArray(); // stavljamo string u niz
		
		int br = 0;
		for ( int i = 0; i < niz.length; i ++ ) // provjera koliko praznih mjesta ima
		{
			char x = niz[i];
			if ( x == ' ' )
			{
				br++;
			}
		}
		// ispis prvog slova i duzine stringa 
		System.out.println( "Prvo slovo stringa je '"+duzina.charAt(0)+"' , a duzina je "+(duzina.length()-br));

	}

}
