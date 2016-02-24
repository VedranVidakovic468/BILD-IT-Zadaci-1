package zadaci_24_02_2016;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/*
 * (Generic binary search) Implement the following method using binary search.
public static <E extends Comparable<E>> int binarySearch(E[] list, E key)
 */
public class Zadatak5
{

	public static void main( String [ ] args )
	{
		// create scanner and random object
		Scanner input = new Scanner( System.in );
		Random randomGenerator = new Random();
		// create an Integer array
		Integer [ ] myIntArray = new Integer [ 10 ];
		boolean continuedLoop = true;
		do
		{
			try
			{
				// filling the list with random numbers
				System.out.println( "Filling list with random numbers..." );
				for ( int i = 0; i < myIntArray.length; i++ )
				{
					myIntArray [ i ] = randomGenerator.nextInt( 20 );
				}
				// Displaying unsorted array
				System.out.println( "Displaying unsorted list:" );
				for ( int x : myIntArray )
				{
					System.out.print( x + " " );
				}
				// invoking method to sort list
				sort( myIntArray );
				// display sorted list
				System.out.println( "\nDisplaying sorted list:" );
				for ( int x : myIntArray )
				{
					System.out.print( x + " " );
				}
				// prompt to enter key to search
				System.out.println( "\nEnter a key to search for: " );
				int key = input.nextInt();
				// displaying key index by invoking method binarySearch
				System.out.println( "\nThe value " + key + " is at index# " + binarySearch( myIntArray, key ) );
				continuedLoop = false;
			}
			// handling exception
			catch ( InputMismatchException ex )
			{
				System.out.println( "Invalid input" );
				input.nextLine();
			}
		}
		while ( continuedLoop );
		input.close();

	}

	/** void method to sort a list */
	public static < E extends Comparable < E > > void sort( E [ ] list )
	{
		E currentMin;
		int currentMinIndex;

		for ( int i = 0; i < list.length - 1; i++ )
		{
			// Find the minimum in the list[i+1..list.length-2]
			currentMin = list [ i ];
			currentMinIndex = i;
			for ( int j = i + 1; j < list.length; j++ )
			{
				if ( currentMin.compareTo( list [ j ] ) > 0 )
				{
					currentMin = list [ j ];
					currentMinIndex = j;
				}
			}
			// Swap list[i] with list[currentMinIndex] if necessary
			if ( currentMinIndex != i )
			{
				list [ currentMinIndex ] = list [ i ];
				list [ i ] = currentMin;
			}
		}

	}

	/** returns index of key value */
	// Binary Search works only if the list is sorted
	public static < E extends Comparable < E > > int binarySearch( E [ ] list, E key )
	{

		int lh = 0; // left hand
		int rh = list.length; // right hand

		while ( lh <= rh )
		{
			int mid = lh + ( rh - lh ) / 2;
			if ( key.compareTo( list [ mid ] ) < 0 )
				rh = mid - 1;
			else if ( key.compareTo( list [ mid ] ) > 0 )
				lh = mid + 1;
			else
				return mid;
		}
		return -1;
	}
}
