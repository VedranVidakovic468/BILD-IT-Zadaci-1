package zadaci_15_01_2016;

import java.util.ArrayList;
import java.util.Scanner;

//klasa najveciBrojUNizu nasljedjuje MaxValue kako bi iskoristili ranije napravljenu metodu
public class NajveciBrojUNizu extends MaxValue {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in); // scanner objekat za ucitanjae sa tastature

		ArrayList<Integer> lista = new ArrayList(); //array lista cijelih brojeva
		
		int x = 0;
	
		while ( unos.hasNextInt()) //while loop za ubacivanje vrijednosti nozu sve dok koristnik ne unese 0
		{
			x = unos.nextInt();
			if ( x == 0)
			{
				break;
			}
			else lista.add(x);		
		}
		
		
		int maxValue = max(lista); //dodjelujemo maximalnu vrijenost liste pomocu metode
		System.out.println( "Najveca vrijednost iz liste je "+maxValue );
		
		int counter = 0;
		for ( int j = 0; j < lista.size(); j++ ) 
		{
			if ( lista.get(j).equals(maxValue) ) //uporedjivanje maxValue koliko cesto se ponavlja
			{
				counter++;
			}
		}
		System.out.println("Najveca vrijednost se ponavlja u listi "+counter+" puta");
		
	
	}

}
