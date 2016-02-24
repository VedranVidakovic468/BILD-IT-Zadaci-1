package zadaci_23_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * (Sum the digits in an integer using recursion)
 *  Write a recursive method that computes the sum of the digits in an integer. 
 *  Use the following method header:
public static int sumDigits(long n)
For example, sumDigits(234) returns 2 + 3 + 4 = 9. Write a test program
that prompts the user to enter an integer and displays its sum.
 */
public class Zadatak4
{

	public static void main( String [ ] args )
	{
		// create a scanner
		Scanner input = new Scanner( System.in );
		boolean continuedInput = true;

		do
		{
			try
			{
				// prompt to enter a integer number
				System.out.println( "Enter a number" );
				int num = input.nextInt();
				// displaying the summary of digits for given number
				System.out.println( "The sum of digits is from number " + num + " is = " + sumDigits( num ) );
			}
			// handling exception
			catch ( InputMismatchException ex )
			{
				System.out.println( "Please enter a integer number" );
				input.nextLine();
			}
		}
		while ( continuedInput );
		input.close();
	}

	/** method return summary of digits */
	public static int sumDigits( int n )
	{
		if ( n == 0 )
		{
			return 0;
		}
		return n % 10 + sumDigits( n / 10 );
	}
}
