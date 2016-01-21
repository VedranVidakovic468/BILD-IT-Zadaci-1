package zadaci_20_01_2016;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class IznosInvesticije 
{

	public static void main(String[] args) 
	{
		
		Scanner unos = new Scanner(System.in); // scanner objekat
	
		System.out.println("Unesit iznos investicije stedjne ");
		double iznosInvesticije = unos.nextDouble(); //ucitvanje stednje
	
		
		System.out.println("Unesit iznos interesne stope ");
		double iznosStope = unos.nextDouble(); //ucitvanje godisnje stope
	
		double mjesecnaStopa = iznosStope /1200; // racunanje mjesecne stope
		
		NumberFormat formatter = new DecimalFormat("#0000.000"); // format ispisivanje podrzaje hiljade
		
		System.out.println("Unesite broj godina nakon kojeg bi želio znati buducu vrijednost investicije. ");
		int godina = unos.nextInt();
		double buducaVrijdnost = 0;

		buducaVrijdnost = iznosInvesticije*Math.pow(1+mjesecnaStopa, godina*12);
		
		System.out.println(formatter.format(buducaVrijdnost));
	}

}
