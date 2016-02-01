package zadaci_01_02_2016;

import java.util.Scanner;

public class Zadatak2 
{

	public static void main(String[] args) 
	{

		Scanner unos = new Scanner (System.in); // scanner objekat za unos
		
		System.out.println( "Unesite neki karakter sa tastature" );
		String x = unos.next();
		
		if ( x .length() > 1 ) // unos nemoze biti veci od 1 charaktera ili slova
		{ 
	
			while ( x.length() !=  1 ) // ponovni unos u slucaju ne ispunjenog uslova
			{
				System.out.println( "Pogresan unos unesite ponovo" );
				x = unos.next();
			}
		} 
		
		char y = x.charAt(0); //string index 0 ide u char y
		
		//ispis int karaktera u ascii broj
		System.out.println( "Karakter " + x + " je " + (int) y + " broj ascii tabele" ); 
	}

}
