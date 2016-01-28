package zadaci_27_01_2016;

import java.util.Scanner;

public class Zadatak2 
{
	public static void reverse( int number )
	{
		int num = 0; 
		while ( number != 0 ) //loop koji okrene broj
		{
			num = num * 10;
			num = num + number % 10; // ostatak unesenog broja ide na poziciju 1 nvog broja
			number /= 10;
		}
		System.out.println( num );  //ispis  broja unazad
	}

	public static void main(String[] args) 
	{
		
		Scanner unos = new Scanner(System.in); // scanner objekat
		
		System.out.println( "Unesite neki broj" ); // unos broja
		int broj = unos.nextInt();
		
		System.out.println( "Broj ispisan naopako je: " ); //ispis obrnutog broja
		reverse(broj);

	}
}
