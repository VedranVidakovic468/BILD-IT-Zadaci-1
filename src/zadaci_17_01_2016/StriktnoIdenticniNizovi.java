package zadaci_17_01_2016;

import java.util.Scanner;

public class StriktnoIdenticniNizovi
{

	public static boolean equals(int[ ] niz1, int[ ] niz2)
	{
		boolean equals;
		for ( int i = 0; i < niz1.length; i++)
		{
			if ( niz1[i] != niz2[i])
			{
				return equals = false;
			}
		}
		return equals = true;
	}
	public static void main(String[] args)
	{
		Scanner unos = new Scanner(System.in);
		
		int niz1 [] = new int [3];
		int niz2 [] = new int [3];
		
		System.out.println("Unesite clanove niza 1");
		for ( int i = 0; i < niz1.length; i++ )
		{
			niz1[i] = unos.nextInt();
		}
		
		System.out.println("Unesite clanove niza 2");
		for ( int i = 0; i < niz1.length; i++ )
		{
			niz2[i] = unos.nextInt();
		}

		System.out.println("Dal su niz 1 i niz 2 striktno identicni? "+equals(niz1, niz2));
	}

}
