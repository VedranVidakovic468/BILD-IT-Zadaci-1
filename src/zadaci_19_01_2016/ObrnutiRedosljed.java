package zadaci_19_01_2016;

import java.util.Scanner;

public class ObrnutiRedosljed 
{

	public static void main(String[] args) 
	{
		
		Scanner unos = new Scanner(System.in); // scanner objekat
		
		int niz [] = new int [10]; // niz od 10
		
		for ( int i = 0; i < niz.length; i++ ) // unos int u niz
		{
			niz[i] = unos.nextInt();
		}

		for ( int i = niz.length-1; i >= 0; i-- ) // ispisivanje niza naopako
		{
			System.out.println(niz[i]);
		}
	}

}
