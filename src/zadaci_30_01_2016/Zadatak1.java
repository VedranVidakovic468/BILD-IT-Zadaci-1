package zadaci_30_01_2016;

import java.util.Scanner;

public class Zadatak1 
{

	public static void main(String[] args) 
	{
		
		Scanner unos = new Scanner (System.in); // scanner objekat za unos
		
		System.out.println( "Unesite 3-cifreni broj" );
		
		int x = unos.nextInt(); // unos 3cifrenog broja
		
		int digit1 = x / 100; // dijelimo broj x sa 100 da dobijmo prvu cifru
		int digit3 = x % 10; // ostatak pri dijeljenju sa 10 broja x dobijemo 3cu cifru
		
		if ( digit1 ==  digit3 ) // ako su cifra 1 i cifra 3 jednake onda imamo polindrom broj
		{
			System.out.println( "Broj koji ste unijeli je polindrom" );
		} else System.out.println( "Broj nije polindrom");
	
	}

}
