package zadaci_27_01_2016;

import java.util.Scanner;

public class Zadatak1 
{

	public static void main(String[] args) 
	{
		Scanner unos = new Scanner(System.in); // scanner objekat za unos
		
		System.out.println("Unesite iznos racuna:");// upit za unos racuna tipa double
		double racun = unos.nextDouble();
		
		System.out.println("Unesite procenat za napojnicu:"); // upit za unos procenta tipa int
		int procenat = unos.nextInt();
		
		double napojnica = (double) ( racun * procenat) / 100;  // izracunavanje napojnice cast double
		
		double total = (double) napojnica + racun; // izracunavanje ukupnog iznosa racuna tipa double
		
		//ispis upuknog racuna i napojnice
		System.out.println("Ukupan racun za uplatit je: "+total+" a napojnica je: "+napojnica);
	

	}

}
