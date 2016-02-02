package zadaci_01_03_2016;

import java.util.Scanner;

public class Zadatak3 
{
	// metoda koja vraca boolean dal ima u nizu 4 ista uzastopna broja 
	public static boolean isConsecutiveFour(int[] values)
	{
				
		int temp = values[0];
		int counter = 0; // brojac
		for ( int i = 0; i < values.length; i++ )
		{
			if ( values[i] == temp ) // ispitivanje temp sa elementom iz values ako su isti povecaj brojac
			{
				counter++;
				if ( counter == 4 ) // ako je brojac == 4 izadji iz loopa
				{
					break;
				}
			}
			else
			{ // u slucaju da temp nije isti kao elemenat od values onda prima novu vrijednost i brojac se resetuje na 1
				temp = values[i];
				counter = 1; 
			}
		}
		if ( counter == 4 ) // ako je counter 4 vrati true
		{
			return true;
		}
		else return false;
	}

	public static void main(String[] args) 
	{
		Scanner unos = new Scanner (System.in); // scanner objekat za unos
		System.out.println( "Enter the number of values "); // upit za size of niz
		int size = unos.nextInt();
		
		int [] values = new int [size];
		System.out.println( "Enter the values" ); // unos elemenata u niz
		for ( int i = 0; i < values.length; i++ )
		{
			values[i] = unos.nextInt();
		}
		

		if ( isConsecutiveFour( values ) ) // pozivinje metode i provjera dal postoji 4 uzastopna broja u listi
		{
			System.out.println( "The list has consecutive fours" );
		}
		else System.out.println( "The list has no consecutive fours" );
	}

}
