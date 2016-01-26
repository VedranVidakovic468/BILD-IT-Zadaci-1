package zadaci_26_01_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import zadaci_18_01_2016.SortedNumbers;

public class Zadatak4 
{
	static Scanner unos = new Scanner (System.in); // scanner objekat za unos

	public static void sortList( ArrayList < Integer > l ) // metoda koja prima i sortira listu
	{
		Collections.sort( l );
	}

	public static void main(String[] args)
	{
		ArrayList < Integer > lista =  new ArrayList(); // napravljena lista
		System.out.println( "Unesite brojeve 0 prekida unos: " );
		int x = 1;
		while ( x != 0 ) // unosenje cijelih brojeva u listu 0 prekida unos
		{
			x = unos.nextInt();
			lista.add( x );
		}
		
	
		sortList( lista ); // pozovanje metode sortList
		System.out.println( lista ); // ispis liste
	}

}
