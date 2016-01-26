package zadaci_26_01_2016;

import java.util.Scanner;

public class Zadatak4b 
{
	public static void sortNumbers( int num1, int num2, int num3 ) // metoda za sortiranje brojeva
		{
			if ( ( num1 < num2 ) && ( num1 < num3 ) ) // ako je num 1 najmanji
			{
				System.out.print( num1 ) ;
				if ( num2 < num3 ) // ako je num2 drugi najmanji
				{
					System.out.println( " " + num2 + " " + num3 );
				} 
				else
				{
					System.out.println( " " + num3 + " " + num2 );	 
				}
			}
			
			else if ( ( num2 < num1 ) && ( num2 < num3 ) ) // ako je num2 najmanji
			{
				System.out.print( num2 );
				if ( num1 < num3 ) // ako je num1 drugi najmanji
				{
					System.out.println( " " + num1 + " " + num3 );
				} 
				else
				{
					System.out.println( " " + num3 + " " + num1 );	
				}
			}
			
			else if ( ( num3 < num2 ) && ( num3 < num1 ) ) // ako je num3 najmanji
			{
				System.out.print( num3 );
				if ( num1 < num2 ) // ako je num1 drugi najmanji
				{
					System.out.println( " " + num1 + " " + num2 );
				} 
				else
				{
					System.out.println( " " + num2 + " " + num1 );	
				}
			}

		}
	

	public static void main(String[] args) 
	{
		Scanner unos = new Scanner (System.in); // scanner objekat za unos
		
		// int a,b i c za unos cijelih brojeva
		int a , b, c;
		
		System.out.println( "Unesite 3 cijela broja: " );
		// unos
		a = unos.nextInt();
		b = unos.nextInt();
		c = unos.nextInt();
		
		// pozivanje metode za sortiranje
		sortNumbers(a, b, c);
	}

}
