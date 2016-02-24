package zadaci_23_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * (Print the characters in a string reversely) 
 * Write a recursive method that dis- plays a string reversely on the console using the following header:
public static void reverseDisplay(String value)
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
				// Prompt for user input
				System.out.println( "Enter a string to be reversed: " );
				String line = input.nextLine();

				// displaying the result aka string in reverse
				System.out.println( "String in reverse: " );
				reverseDisplay( line, line.length() - 1 );
				continuedInput = false;
			}
			// handling exception
			catch ( InputMismatchException ex )
			{
				System.out.println( "Please enter a string" );
				input.nextLine();
			}
		}
		while ( continuedInput );
		input.close();

	}

	/** Displays string in Reverse */
	public static void reverseDisplay( String value, int high )
	{
		if ( high <= 0 )
		{
			return;
		}
		System.out.print( value.charAt( high ) );
		reverseDisplay( value, high - 1 );
	}
}
