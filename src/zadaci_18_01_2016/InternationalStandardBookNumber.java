package zadaci_18_01_2016;

import java.util.Scanner;

public class InternationalStandardBookNumber 
{

	public static void main(String[] args)
	{
		
		Scanner unos = new Scanner(System.in); //Scanner objekat za unos 
		
		int [] isbn10 = new int [10]; // niz od 10 clanova
		
		for (int i = 1; i < isbn10.length; i++ ) // niz pocinje od indexa 1, index 0 prazan i cuva se za d10
		{
			int x = unos.nextInt(); // unos moze samo biti brojevi od 0  do 9
			if ( x < 0 || x > 9) 
			{
				while ( x < 0 || x > 9 )
				{
					System.out.println("Unesite ponovo broj od 0 do 9");
					x = unos.nextInt() ;
				}
			}
			isbn10[i] = x;
		}

		int d10 = 0;
		for ( int i = 1; i < isbn10.length; i++ ) // izracunavanje d10
		{
			d10 += isbn10[i] * (i);
		}
		
		//provjera dal je d10 = 10
		d10 = d10 % 11;
		boolean checkSum = false;
		if ( d10 == 10 )
		{
		 checkSum = true;	
		}
		//013031997
		//013601267
		isbn10[0] = d10;
		
		System.out.println("ISBN broj :");
		for ( int i = 1; i < isbn10.length; i++ ) // ispisivanje isbn Broja
		{
			System.out.print(isbn10[i]);
			if ( i == 9 && checkSum)
			{
				System.out.print("X");
			}
			else if ( i == 9 )
			{
				System.out.print(isbn10[0]);
			}
		}



	}

}
