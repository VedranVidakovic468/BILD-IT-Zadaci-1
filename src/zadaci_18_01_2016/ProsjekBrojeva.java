package zadaci_18_01_2016;

import java.util.Scanner;

public class ProsjekBrojeva 
{

	public static void main(String[] args) 
	{
		Scanner unos = new Scanner(System.in); // scanenr objekat za unos
		
		int ocjene [] = new int[100]; // niz za smijestanje cijelih brojeva
		
		int total = 0; // brojac koliko je brojeva uneseno
		int prosjek = 0;
		for ( total = 0; total < 100; total++ )
		{
			int x = unos.nextInt();
			if( x == 0) // 0 prekida unos
			{
				break;
			}
			ocjene[total] = x;
			prosjek += x; // sabiranje prosjeka
		}
		
		double glavniProsjek = (double)(prosjek) / (double)(total); // izracunavanje prosjeka
		
		int brojacVecih = 0;
		
		for ( int x : ocjene ) // izracunavanje koliko je brojeva bilo iznad prosjeka ili jednako
		{
			if ( x >= glavniProsjek ) 
			{
				brojacVecih++;
			}
		}
		
		System.out.printf("\nUkupono ste unijeli: "+total+" brojeva i njihov prosjek je: %.2f",glavniProsjek);
		System.out.println("\nBrojeva iznad ili jednako prosjeku je bilo: "+brojacVecih);
		System.out.println("Brojeve ispod prosjeka je bilo: "+(total-brojacVecih));

	}

}
