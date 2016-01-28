package zadaci_26_01_2016;

import java.util.Scanner;

public class Zadatak5 
{

	public static void main(String[] args) 
	{
		// ideja za kod je od source https://www.youtube.com/watch?v=pHxtKDENDdE
		// al je kod modificiran da ipunjaje uslove zadatka
		Scanner unos = new Scanner (System.in); // scanner objekat za unos
		
		int freq[] = new int [ 100 ]; // int niz od max 100 clanova

		System.out.println( "Unesite brojeve u niz 0 prekida unos: ");
		for ( int i = 1; i < freq.length; i++ )
		{
			int x = unos.nextInt(); // unos brojeva u niz
			if ( x == 0 ) // 0 prekida unos
			{
				break;
			}
			freq[ x ]++; // niz od unosa povecaj za 1
		}
		
		System.out.println( "Broj\tPonavljanja" ); // ispis koliko cesto se broj neki ponovio u nizu
		
		for ( int i = 1; i < freq.length; i++ )
		{
			if ( freq[i] > 0 ) // ako neki broj nije unesen da se ne prikaze
			{
			System.out.println( i + "\t" + freq[i]+ " puta" );
			}
		}

	}

}
