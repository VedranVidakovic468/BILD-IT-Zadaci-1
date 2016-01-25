package zadaci_25_01_2016;

import java.util.Scanner;

public class Zadatak4
{

	public static void main(String[] args) 
	{
		Scanner unos = new Scanner (System.in); // scanner za unos
		
		System.out.println("Unesite broj minuta");
		long minutes = unos.nextLong(); // unos minuta
		
		long hours = minutes / 60;  // racunanje sati
		long days = hours / 24;  // racunanje dana
		long years = days / 365;  // racunanje godina
		long remainingdays = days % 365; // racunanje ostatka dana od godine
		
		
		//ispis koliko je minuta u godinama i danima
		System.out.println(minutes+" minuta je "+remainingdays+" dana i "+years+" godina");
	}

}
