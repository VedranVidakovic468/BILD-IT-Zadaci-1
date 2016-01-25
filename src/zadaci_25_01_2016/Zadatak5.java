package zadaci_25_01_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5
{

	public static void main(String[] args)
	{
		// lista za ovaj program ako bi zelili jos kakve dodatne funkcije na programu sortiranje ili slicno
	//	ArrayList <Integer> brojevi = new ArrayList<>();  // iskljucena lista jer nam ne treba za rezultat
		
		Scanner unos = new Scanner(System.in); // scanner za unos
		
		int minusBrojac = 0;  // brojac negativnih brojeva
		int positiveBrojac = 0; // brojac pozitivnih brojeva
		int brojacUnosa = 0; //brojac ukuupnog uosa (minusBrojac+postiveBrojac)
		double sum = 0; // suma brojeva unosa double
		while ( unos.hasNext() ) // while loop
		{
			int x = unos.nextInt(); // unos int
			if ( x == 0 ) // nula prekida unos
			{
				break;
			}
			if ( x < 0 ) // minus brojac raste ako je broj manji od nule
			{
				minusBrojac++;
			}
			if ( x > 0 ) // positive brojac raste ako je broj veci od 0
			{
				positiveBrojac++;
			}
			sum += x; // suma
			brojacUnosa++;
		//	brojevi.add(x);
		}
		
		double prosjek = (double) (sum /brojacUnosa); // izracunavanje prosjeka
		System.out.println("Broj pozitivnih brojeva je "+positiveBrojac+", negativnih brojeva "+minusBrojac
				+" suma brojeva je "+sum+" ,a prosjek svih brojeva je "+prosjek);
		
	}

}
