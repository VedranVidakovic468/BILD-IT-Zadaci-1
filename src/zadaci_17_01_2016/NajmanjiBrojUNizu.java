package zadaci_17_01_2016;

import java.util.Scanner;

public class NajmanjiBrojUNizu
{

	public static double min(double[ ] array)
	{
		double min = array[0];
		for ( int i = 0; i < array.length; i++ )
		{
			for ( int j = 0; j < array.length; j++ )
			{
				if ( array[j] < min )
				{
					min = array[j];
				}
			}
		}return min;
	}
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		
		double niz [] = new double [10];
		
		System.out.println("Unesite clanove u niz: ");
		for ( int i = 0; i < niz.length; i++ )
		{
			double x = input.nextDouble();
			niz[i] = x;
		}
		
		for ( int i = 0; i < niz.length; i++ )
		{
			System.out.print(niz[i]+" ");
			if ( i == 4 )
			{
				System.out.println();
			}
		}
		System.out.println("\nNajmanji broj u nizu je "+min(niz));
	}

}
