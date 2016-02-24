package zadaci_24_02_2016;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/*
 * (Maximum element in a two-dimensional array) Write a generic method that
returns the maximum element in a two-dimensional array.
public static <E extends Comparable<E>> E max(E[][] list)
 */

public class Zadatak4
{

	public static void main( String [ ] args )
	{
		// create scanner and random objects
		Scanner input = new Scanner( System.in );
		Random randomGenerator = new Random();
		// create integer matrix
		Integer [ ] [ ] myIntList = new Integer [ 3 ] [ 3 ];
		boolean continuedInput = true;

		do
		{
			try
			{
				// adding randomly values to matrix in range from 0 - 9
				for ( int i = 0; i < myIntList.length; i++ )
				{
					for ( int j = 0; j < myIntList [ 0 ].length; j++ )
					{
						myIntList [ i ] [ j ] = randomGenerator.nextInt( 10 );
					}
				}
				// displaying the matrix
				for ( int i = 0; i < myIntList.length; i++ )
				{
					System.out.println();
					for ( int j = 0; j < myIntList [ 0 ].length; j++ )
					{
						System.out.print( myIntList [ i ] [ j ] + " " );
					}
				}
				// assigning max to maxValue of myIntList
				Integer max = max( myIntList ); // invoking method max
				// displying max value
				System.out.println( "\nThe max element in the matrix is: " + max );
				continuedInput = false;
			}
			// handling exceptin
			catch ( InputMismatchException ex )
			{
				System.out.println( "Enter a Integer number" );
				input.nextLine();
			}
		}
		while ( continuedInput );
		input.close();

	}
	/** returns E max value of E matrix */
	public static < E extends Comparable < E > > E max( E [ ] [ ] list )
	{
		E max = list [ 0 ] [ 0 ];

		for ( int i = 0; i < list.length; i++ )
		{
			for ( int j = 0; j < list [ 0 ].length; j++ )
			{
				if ( list [ i ] [ j ].compareTo( max ) > 0 )
				{
					max = list [ i ] [ j ];
				}
			}
		}
		return max;
	}
}
