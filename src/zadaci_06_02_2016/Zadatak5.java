package zadaci_06_02_2016;

import java.util.Scanner;

/*
 * (Displaying the prime numbers) Write a program that displays all the prime numbers less than 120 in decreasing order. 
 * Use the StackOfIntegers class to store the prime numbers
 *  (e.g., 2, 3, 5, ...) and retrieve and display them in reverse order.
 */

public class Zadatak5
{

	public static void main(String[] args)
	{
		addPrimeNumberToStack(); // pozivanje metode za dodavanje prostih brojeva u Stack
		//ispis prostih brojeva manji od 120 pomocu klase StackOfIntegers
		for ( int i = stack.getSize(); i > 0; i-- )
		{
			System.out.println( stack.peek() );
			stack.pop();
		}

	}
	
	public static void addPrimeNumberToStack() // metoda za ubacivanje prostih brojeva u stack
	{
		for ( int i = 2; i < 121; i++ ) 
		{
			boolean isPrime = true;
			for ( int j = i -1; j > 1; j-- )
			{
				if ( i%j == 0 )
				{
					isPrime = false;
				}
			} 
			if ( isPrime ) // ako je prost broj ispisi ga
				{
					stack.push( i ); // dodaj u stack
				}
		} 
	}
	//objekat stack klase StackOfIntegers
	private static StackOfIntegers stack = new StackOfIntegers();

}
