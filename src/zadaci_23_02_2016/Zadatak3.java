package zadaci_23_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * (Occurrencesofaspecifiedcharacterinastring)
 * Writea recursivemethod that finds the number of occurrences of a specified letter
 *  in a string using the follow- ing method header:
public static int count(String str, char a)
 */
public class Zadatak3
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
				// prompt for user input to enter a string
				System.out.println( "Enter a string:" );
				String line = input.nextLine();
				// prompt to enter a letter
				System.out.println( "Enter a letter to find number of occurrences" );
				char letter = input.next().charAt( 0 );
				// searching the string with letter occurences and displaying it
				System.out.println( "The letter " + letter + " occurred " + count( line, letter ) + " times." );
				continuedInput = false;
			}
			//handling exception
			catch ( InputMismatchException ex )
			{
				System.out.println( ex.getMessage() );
				input.nextLine();
			}
		}
		while ( continuedInput );
		input.close();

	}

	/** returns int the number of occurrences of a letter */
	public static int count( String str, char a )
	{
		int counter = 0;

		if ( str.charAt( str.length() - 1 ) == a )
		{
			counter++;
		}
		count( str.substring( 0, str.length() - 1 ), a );
		return counter;
	}
}
