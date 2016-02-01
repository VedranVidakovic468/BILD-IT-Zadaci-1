package zadaci_01_02_2016;

import java.util.Scanner;

public class Zadatak1 
{

	public static void main(String[] args)
	{
		Scanner unos = new Scanner (System.in); // scanner objekat za unos
		
		System.out.println( "Unesite neki broj izmedju 0 i 127 " );
		int x = unos.nextInt();
		
		if ( x < 0 || x > 127 ) // unos nemoze biti manji od 0 ili veci od 127
		{ 
	
			while ( x <= 0 || x >= 127 ) // ponovni unos u slucaju ne ispunjenog uslova
			{
				System.out.println( "Pogresan unos unesite ponovo" );
				x = unos.nextInt();
			}
		} 
		
		if ( Character.isWhitespace( ( char ) x ) ) // ako je x u ascii kodu white space
		{
			System.out.println( "Karakter je white space");
			System.exit(0); // izlaz iz programa
		} 
		if ( Character.isISOControl( ( char ) x ) ) //ako je x u acscii kodu control
		{
			System.out.println( "Karatker je control");
			System.exit(0); // izlaz iz programa
		}

		//ispis int broja u asci kodu
		System.out.println( "Broj " + x + " ascii koda je " + " ' "+ ( char ) x + " ' " );
	}

}
