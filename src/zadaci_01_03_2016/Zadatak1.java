package zadaci_01_03_2016;

import java.util.Random;

public class Zadatak1 
{

	public static void main(String[] args) 
	{
		
		Random randomGenerator = new Random();// random generator za kreaitanje nasumicnih brojeva
		int [] count = new int [10]; // niz brojac
		
		for ( int i = 0; i < 100; i++ )
		{
			int x = randomGenerator.nextInt(10); //generisanje nasumicnog broja izmedju 0 i 9
			count[x]++; //povecaj count niz za 1 od broja x
		}
		
		System.out.println( "Number \tfrequency "); // ispis broja i ponavljanja
		for ( int i = 0; i < count.length; i++ )
		{
			System.out.println( i+" \t"+count[i] );
		}

	}

}
