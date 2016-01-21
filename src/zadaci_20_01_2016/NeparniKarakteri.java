package zadaci_20_01_2016;

import java.util.Scanner;

public class NeparniKarakteri 
{

	public static void main(String[] args)
	{
		
		Scanner unos = new Scanner(System.in); // scanner objekat za unos sa tastature
		
		System.out.println("Unesite neki string");
		
		String x = unos.nextLine(); // unoesenja stringa
		
		char [] niz = x.toCharArray(); // string ide u char niz
		
		System.out.println("Ispis karaktera na neparnim pozicijama"); 
		for ( int i = 0; i <= niz.length; i+=2 ) // ispis slova na neparnim pozicijama i+=2
		{
			System.out.println(niz[i]);
		}
	}

}
