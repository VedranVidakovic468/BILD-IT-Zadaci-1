package zadaci_01_03_2016;

import java.util.Random;

import zadaci_18_01_2016.RandomGerator;

public class Zadatak2 
{	
	private static Random randomGenerator = new Random(); // random generator za generisanje nasumicnih brojeva
	
	//metoda vraca nasumicnih broj izuzev brojeva prosljedjeni u argumentu
	public static int getRandom(int... numbers)
	{
		int x = 1+randomGenerator.nextInt(54); // generisanje broja izmedju 1 i 54
		
		int [] brojevi = numbers.clone(); // cloniranje numbers u niz
		for ( int i = 0; i < brojevi.length; i++ )
		{
			if ( x == brojevi[i] ) // ispitivanje dal je x == numbers
			{
				x = 1+randomGenerator.nextInt(54); // ako jeste generisi novi broj
			}
		}
		return x;
	}

	public static void main(String[] args) 
	{
		System.out.println(getRandom(5,12,3,4,7,8,9,45,13,20,25,24)); // pozivanje metode getRandom

	}

}
