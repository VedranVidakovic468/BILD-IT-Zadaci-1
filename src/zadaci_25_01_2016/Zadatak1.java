package zadaci_25_01_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak1 
{

	public static void main(String[] args) 
	{
		ArrayList <String> gradovi = new ArrayList(); // napravljena lista gradovi
		
		Scanner unos = new Scanner(System.in); // scanner za unos
		
		while ( gradovi.size() < 3 ) // loop dok je size of liste manje od 3
		{
			String grad =  unos.nextLine(); // unos grada
			String up = grad.substring(0, 1); //izdvajamo prvi karakter
			up = up.toUpperCase(); // prvi karakter pretvaraamo u upercase
			grad = grad.substring(1, grad.length()); // izdvajamo prvi karatker od grada
			grad = up + grad; // sastavljamo string sa prvim letterom upercase
			gradovi.add(grad); // dodajemo listi gradovi unos
		}
		
		Collections.sort(gradovi); // sortiramo gradove pomocu Collections api
		
		System.out.println(gradovi); // ispis liste
	}

}
