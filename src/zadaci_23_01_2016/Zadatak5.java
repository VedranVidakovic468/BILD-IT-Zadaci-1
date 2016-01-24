package zadaci_23_01_2016;

import java.util.Scanner;

public class Zadatak5 
{

	public static void main(String[] args) 
	{
		
		Scanner unos = new Scanner(System.in); // scanner objekat za unos
		
		System.out.println("Unesite prvi string: ");
		String str1 = unos.next(); // unos stringa 1
		
		System.out.println("Unesite drugi string");
		String str2 = unos.next(); // unos stringa 2
		
		if ( str1.contains(str2) ) // ako str1 sadrzi str2 onda je str2 substring od str 1
		{
			System.out.println(str2+ " je substring stringa "+str1);
		}
		else System.out.println(str2+" nije substring stringa "+str1);
		

	}

}
