package zadaci_01_02_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak5 
{

	public static void main(String[] args) 
	{
		ArrayList < Integer > brojevi = new ArrayList(); // objekat brojevi lista
		
		Scanner unos =  new Scanner(System.in); // scanner za  unos
		
		int i = 0; // i brojac
		while ( i < 10 ) // lista prima 10 unosa
		{
			int x = unos.nextInt();
			brojevi.add(x);
			i++;
		}
		// ispisivanje jedinstvenih brojeva
		System.out.println( "Jedinstveni brojevi u listi su: " );
		for ( int j = 0; j < brojevi.size(); j++ )
		{
			if ( Collections.frequency( brojevi, brojevi.get( j ) ) == 1 ) // ako se broj samo ponavlja jednom
			{
				System.out.print( brojevi.get( j )+ " " );
			}
		}
		
		ArrayList <Integer> duplicates = new ArrayList(); // napravljena nova lista za brojeve koji se ponavljaju
		
		for ( int j = 0; j < brojevi.size(); j++ )
		{
			// ako se broj ponavlja vise od jednom
			if ( Collections.frequency( brojevi, brojevi.get( j ) ) > 1 )
			{
				if ( duplicates.contains( brojevi.get( j ) ) ) // ako se u listi duplicates nalazi vec broj iz liste brojevi samo nastavi
				{
					continue;
				}
				else // ako se ne nalazi broj iz brojevi liste u duplicates listi onda dodaj ga
				{
					duplicates.add(brojevi.get(j));
				}
			}
		}
		
		// ako je duplicates list nije prazna
		if ( duplicates.isEmpty() == false )
		{	
			// ispis brojeva koji se ponavljaju samo jednom
			System.out.println( "\nBrojevi koji se ponavljaju su:" );
			for ( int j = 0; j < duplicates.size(); j++)
			{
				System.out.print( duplicates.get( j ) + " " );
			}
		}
		

	}

}
