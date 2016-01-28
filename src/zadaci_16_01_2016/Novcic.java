package zadaci_16_01_2016;

import java.util.Random;

public class Novcic {
	
	static Random randomGenerator = new Random(); //random generator objekat
	
	public static void bacanjeNovcica(int n) //metoda prima argumenat koliko puta se novcic baca
	{
		System.out.println("Bacamo novcic...");

		//StartCopyCode source http://stackoverflow.com/questions/3342651/how-can-i-delay-a-java-program-for-a-few-seconds
		try {
		    Thread.sleep(1500);                 //pravimo pauzu od 1.5 sekundu.
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}//EndCopyCode I Ahmed dont understand this except that it puts the console to sleep
			
		String niz [] = {"Pismo", "Glava"}; //niz string Glava ili Pismo
		int pismoBrojac = 0; //brojac Pisma
		int glavaBrojac = 0; //brojac Glava
		for ( int i = 0; i < n; i++ ) // bacanje novcica
		{
			int x = randomGenerator.nextInt(2);
			if (niz[x].equals("Pismo")) //provjera dal je pismo ili glava
			{
				pismoBrojac++;
			}
			else glavaBrojac++;
		}
		System.out.println("Glava je pokazana "+glavaBrojac+" puta ,a pismo je pokazeno "
		+pismoBrojac+ " puta");
	}
	public static void main(String[] args) {
		
		bacanjeNovcica(8);
	}

}
