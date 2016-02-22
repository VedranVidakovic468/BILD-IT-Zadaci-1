package zadaci_22_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Compute greatest common divisor using recursion) The gcd(m, n) can also be defined 
 * recursively as follows:■ If m % nis0,gcd(m, n)isn. ■ Otherwise,gcd(m, n)is gcd(n, m % n).
Write a recursive method to find the GCD. Write a test program that prompts the user to enter two integers 
and displays their GCD.
 */
public class Zadatak2
{

	public static void main( String [ ] args )
	{
		// create scanner
		Scanner input = new Scanner( System.in );
		boolean continuedInput = true;

		do
		{
			try
			{
				// prompt to enter 2 integers
				System.out.println( "Enter two integers" );
				int num1 = input.nextInt();
				int num2 = input.nextInt();
				// finding and displaying the GCD for input
				System.out.println( "The GCD for " + num1 + " and " + num2 + " is " + gcd( num1, num2 ) + "." );
				continuedInput = false;
			}
			// handling exception
			catch ( InputMismatchException ex )
			{
				System.out.println( "Enter Integer numbers" );
				input.nextLine();
			}
		}
		while ( continuedInput );
		input.close();

	}

	/** returns GCD for two Integers */
	public static int gcd( int m, int n )
	{
		if ( m % n == 0 )
		{
			return n;
		}
		else
			return gcd( n, m % n );
	}

}
