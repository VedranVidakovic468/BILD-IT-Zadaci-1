package zadaci_18_01_2016;

import java.util.Scanner;

public class SortedNumbers 
{

	// metoda za printanje decimalnih vrijednosti po rastucem redosljedu
	public static void displaySortedNumbers(double num1, double num2, double num3)
	{
		if ( ( num1 < num2 ) && ( num1 < num3 ) ) // ako je num 1 najmanji
		{
			System.out.print(num1);
			if ( num2 < num3 ) // ako je num2 drugi najmanji
			{
				System.out.println(" "+num2+" "+num3);
			} 
			else
			{
				System.out.println(" "+num3+" "+num2);	 
			}
		}
		
		else if ( ( num2 < num1 ) && ( num2 < num3 ) ) // ako je num2 najmanji
		{
			System.out.print(num2);
			if ( num1 < num3 ) // ako je num1 drugi najmanji
			{
				System.out.println(" "+num1+" "+num3);
			} 
			else
			{
				System.out.println(" "+num3+" "+num1);	
			}
		}
		
		else if ( ( num3 < num2 ) && ( num3 < num1 ) ) // ako je num3 najmanji
		{
			System.out.print(num3);
			if ( num1 < num2 ) // ako je num1 drugi najmanji
			{
				System.out.println(" "+num1+" "+num2);
			} 
			else
			{
				System.out.println(" "+num2+" "+num1);	
			}
		}

	}
	
	public static void main(String[] args) 
	{
		Scanner unos = new Scanner(System.in); // scanner objekat
		
		System.out.println("Unesite 3 decimalna broja"); // unos brojeva sacuva ih kao double
		double x = unos.nextDouble();
		double y = unos.nextDouble();
		double z = unos.nextDouble();
		
		System.out.println("Poredani brojevi su: "); // pozivanje metode i ispisivanje
		displaySortedNumbers(x, y, z);
	}

}
