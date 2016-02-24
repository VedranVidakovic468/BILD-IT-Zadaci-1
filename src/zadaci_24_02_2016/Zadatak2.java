package zadaci_24_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 
 * (Generic linear search) Implement the following generic method for linear search.
public static <E extends Comparable<E>> int linearSearch(E[] list, E key)
 */
public class Zadatak2
{

	public static void main( String [ ] args )
	{
		// create scanner
		Scanner input = new Scanner( System.in );
		boolean continuedInput = true;
		// create array of strings
		String [ ] myStringArray = new String [ 8 ];
		String key = "";

		do
		{
			try
			{
				// prompt to enter names to array
				System.out.println( "Enter names or words to the array" );
				for ( int i = 0; i < myStringArray.length; i++ )
				{
					myStringArray [ i ] = input.nextLine();
				}
				// prompt to enter a key to search
				System.out.println( "Enter what string you searching for?" );
				key = input.next();

				// invoking the method
				int in = linearSearch( myStringArray, key );
				// displaying the int value of the index where the key is
				// located
				System.out.println( "The index for string " + key + " is " + in );
				continuedInput = false;
			}
			// Handling exception
			catch ( InputMismatchException ex )
			{
				System.out.println( "Enter a string" );
				input.nextLine();
			}
		}
		while ( continuedInput );
		input.close();

	}

	/** method returnds index value of key */
	public static < E extends Comparable < E > > int linearSearch( E [ ] list, E key )
	{
		int index = 0;

		for ( int i = 0; i < list.length; i++ )
		{
			if ( list [ i ].compareTo( key ) == 0 )
			{
				index = i;
			}
		}
		return index;
	}

}
