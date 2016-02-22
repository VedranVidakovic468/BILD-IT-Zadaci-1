package zadaci_22_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1
{

	public static void main( String [ ] args )
	{
		// create Scanner
		Scanner input = new Scanner( System.in );
		boolean continuedInput = true;
		do
		{
			try
			{
				// prompt to enter index for a Fibonnaci number
				System.out.print( "Enter an index for a Fibonacci number: " );
				int index = input.nextInt();

				// Find and display the Fibonacci number
				System.out.println( "The Fibonacci number at index " + index + " is " + fib( index ) );
				continuedInput = false;
			}
			// handling exception
			catch ( InputMismatchException ex )
			{
				System.out.println( "Please enter a Integer number" );
				input.nextLine();
			}
		}
		while ( continuedInput );
		input.close();
	}

	/** return a fibonacci number */
	public static long fib( long n )
	{
		long f0 = 0;
		long f1 = 1;

		for ( int i = 1; i <= n; i++ )
		{
			long currentFib = f0 + f1;
			f0 = f1;
			f1 = currentFib;
		}
		return f1;
		// After the loop, currentFib is fib(n)
	}

}
