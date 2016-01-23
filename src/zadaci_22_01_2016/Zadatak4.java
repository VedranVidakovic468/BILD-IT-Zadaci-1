package zadaci_22_01_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak4 
{

	public static void main(String[] args) 
	{
		Scanner unos = new Scanner (System.in); // objekat za unos
		
		ArrayList <Integer> lista =  new ArrayList(); // pravljenje liste
		
		//program izbacuje gresku ako se nista ne unese, Collections nema sta da obradjuje pa error
		while ( unos.hasNextInt()  ) //dok ima unosa petlja se krece
		{
			int x = unos.nextInt();
			if ( x == 0 ) // 0 prekida petlju
			{
				break;
			}
			lista.add(x);
		}
		
		// koristen collections api za rad sa kolekcijama
		int maxValue =  Collections.max(lista); // maxValue prima najvecu vrijednost iz liste
		// frequency prima int koliko se puta najveci broj ponovio
		int Frequency = Collections.frequency(lista, maxValue); 

		//ispis
		System.out.println("Najveca vrijednost koju ste unijeli je "+maxValue+" i ponavlja se "
		+Frequency+" puta");
	}

}
