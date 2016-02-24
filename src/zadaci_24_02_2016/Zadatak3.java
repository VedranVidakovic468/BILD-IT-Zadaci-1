package zadaci_24_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * (Maximum element in an array) Implement the following method that returns the maximum element in an array.
                  public static <E extends Comparable<E>> E max(E[] list)
 */
public class Zadatak3
{

	public static void main( String [ ] args )
	{
		// create scanner
		Scanner input = new Scanner( System.in );
		boolean continuedInput = true;
		// create array of Integers
		Integer [ ] myIntList = new Integer [ 5 ];

		do
		{
			try
			{
				// prompt to enter Integers to array
				System.out.println( "Enter Integers to array" );

				for ( int i = 0; i < myIntList.length; i++ )
				{
					myIntList [ i ] = input.nextInt();
				}

				// Invoking method max (E[] list)
				Integer max = max( myIntList );
				// Displaying the max value of list
				System.out.println( "The max element in array is: " + max );
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

	/** returns E max element */
	public static < E extends Comparable < E > > E max( E [ ] list )
	{
		E max = list [ 0 ];

		for ( int i = 0; i < list.length; i++ )
		{
			if ( list [ i ].compareTo( max ) > 0 )
			{
				max = list [ i ];
			}
		}
		return max;
	}

}
