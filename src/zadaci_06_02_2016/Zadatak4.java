package zadaci_06_02_2016;

/*
 * (Displaying the prime factors) Write a program that prompts the user to enter a positive 
 * integer and displays all its smallest factors in decreasing order. For example, if the integer
 *  is 120, the smallest factors are displayed as 5, 3, 2, 2, 2. Use the StackOfIntegers class to store the 
 * factors (e.g., 2, 2, 2, 3, 5) and retrieve and display them in reverse order.
 */
import java.util.Scanner;

public class Zadatak4 
{
	public static void main(String[] args) 
	{
		System.out.println( "Enter a positive int number: "); // unos broja za rastavlljanje na proste faktore
		int x = readInt();
		
		primeFactor( x ); //taj broj se prosljedjuje metodi
		
		//ispis prostih faktora pomocu klase StackOfIntegers
		for ( int i = stack.getSize(); i > 0; i-- )
		{
			System.out.println( stack.peek() );
			stack.pop();
		}
		
	}
	//metoda za unos koja vraca int
	private static int readInt()
	{
		int x = input.nextInt();
		return x;
	}
//metoda rastavlja broj na proste faktore
	public static void primeFactor( int n )
	{
	    // dodaje 2 u stack sve dok se moze dijelit sa brojem 
	    while ( n % 2 == 0 )
	    {
	       stack.push( 2 );
	        n = n / 2;
	    }
	 
	    // n postaje neparan broj.  Preskacemo elemente na neparne (Note i = i +2)
	    for ( int i = 3; i <= Math.sqrt( n ); i = i + 2 )
	    {
	        while ( n%i == 0 )
	        {
	        	stack.push( i );
	            n = n / i;
	        }
	    }
	 
	    if ( n > 2 )
	    	stack.push( n );
	}
	//objekat unput klase Scanner za unos
	private static Scanner input = new Scanner (System.in);
	//objekat stack klase StackOfIntegers
	private static StackOfIntegers stack = new StackOfIntegers();
}
