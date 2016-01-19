package zadaci_19_01_2016;

import java.text.DecimalFormat; //importovana klasa za formatiranje decimalnih tacaka
import java.text.NumberFormat;
import java.util.Scanner;

public class StedniRacun 
{

	public static void main(String[] args) 
	{
		
		Scanner unos = new Scanner(System.in); // scanner objekat
		System.out.println("Unesit iznos mjesecne stedjne ");
		
		double x = unos.nextDouble(); //ucitvanje mjesecne stednje
		double stanje = 0;
		double stednja = x;
		double rate = 0.00417;
		
		NumberFormat formatter = new DecimalFormat("#0000.000"); // format ispisivanje podrzaje hiljade
		
		System.out.println("Unesite broj mjeseci nakon kojeg bi želio znati stanje računa. ");
		int y = unos.nextInt();
		for( int mjesec = 1; mjesec <= y; mjesec++ )
		{
			stanje += stednja*Math.pow( 1 + rate,mjesec );
		}
		
		System.out.println("Vase stanje na racunu nakon "+ y +" mjeseca je "+formatter.format(stanje)+"$");
	

	}

}
