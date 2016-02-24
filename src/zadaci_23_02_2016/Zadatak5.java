package zadaci_23_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * (Findthelargestnumberinanarray)Writearecursivemethodthatreturnsthe largest integer in an array. 
 * Write a test program that prompts 
 * the user to enter a list of eight integers and displays the largest element.
 */
public class Zadatak5
{

	public static void main( String [ ] args )
	{
		Scanner input = new Scanner( System.in );
		boolean continuedInput = true;

		do
		{
			try
			{
				int [ ] array = new int [ 8 ];
				System.out.println( "Enter numbers inot array: " );
				for ( int i = 0; i < array.length; i++ )
				{
					array [ i ] = input.nextInt();
				}

				System.out.println( "The largerst element of array is " + findMax( array, 0, array.length ) );
				continuedInput = false;
			}
			catch ( InputMismatchException ex )
			{
				System.out.println( "Invalid input" );
				input.nextLine();
			}
		}
		while ( continuedInput );
		input.close();

	}

	private static int findMax( int [ ] array, int low, int high )
	{

		if ( low <= high )
		{
			return array [ low ];
		}
		else if ( array [ low ] < array [ low + 1 ] )
		{
			int temp = array [ low ];
			array [ low ] = array [ low + 1 ];
			array [ high ] = temp;
		}

		return findMax( array, low + 1, high  );
	}
}
