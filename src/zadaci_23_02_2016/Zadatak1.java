package zadaci_23_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * (Printthedigitsinanintegerreversely)Writearecursivemethodthatdisplays an int value
 *  reversely on the console using the following header:
public static void reverseDisplay(int value)
For example, reverseDisplay(12345) displays 54321. Write a test program
that prompts the user to enter an integer and displays its reversal.
 */
public class Zadatak1
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
				// prompt to enter integer number
				System.out.println( "Enter a number to be reversed" );
				int num = input.nextInt();

				System.out.println( "Reversed:" );
				reverseDisplay( num ); // invoking the method to reverse the
										// input number
				continuedInput = false;
			}
			// handling exception
			catch ( InputMismatchException ex )
			{
				System.out.println( "Enter Integer number" );
				input.nextLine();
			}
		}
		while ( continuedInput );
		input.close();

	}

	/** displays number in reverse */
	public static void reverseDisplay( int value )
	{
		if ( value == 0 )
		{
			return;
		}
		else
		{
			System.out.print( value % 10 );
			reverseDisplay( value / 10 );
		}
	}

}
