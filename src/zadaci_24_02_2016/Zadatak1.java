package zadaci_24_02_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * (Distinct elements in ArrayList) Write the following method that returns a new ArrayList. The new list contains the non-duplicate elements from the original list.
public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
 */
public class Zadatak1
{

	public static void main( String [ ] args )
	{
		// create scanner
		Scanner input = new Scanner( System.in );
		// craete arayList of integers
		ArrayList < Integer > myIntList = new ArrayList < >();
		boolean continuedInput = true;
		System.out.println( "Add numbers to list ( 0 stops the entry )" );
		do
		{
			try
			{
				// entering numbers in console
				int num = input.nextInt();
				if ( num == 0 )
				{
					continuedInput = false;
					break;
				}
				myIntList.add( num );
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
		// allocating myIntList elements to noDuplicates without duplicates
		ArrayList < Integer > noDuplicates = removeDuplicates( myIntList ); // incoking
																			// method

		// displaying both lists
		System.out.println( myIntList );
		System.out.println( noDuplicates );

	}

	/** returns a list without duplicates */
	public static < E > ArrayList < E > removeDuplicates( ArrayList < E > list )
	{
		ArrayList < E > removed = new ArrayList < >();

		for ( int i = 0; i < list.size(); i++ )
		{
			if ( !removed.contains( list.get( i ) ) )
			{
				removed.add( list.get( i ) );
			}
		}

		return removed;
	}

}
