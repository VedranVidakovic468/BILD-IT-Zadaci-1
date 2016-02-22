package zadaci_22_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak4
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
				System.out.println( "Enter a Integer number" );
				int num = input.nextInt();
				// Displaying the sum
				System.out.println( "The sum series of number " + num + " is " + sumSeries( 18 ) );
				continuedInput = false;
			}
			//handling exception
			catch ( InputMismatchException ex )
			{
				System.out.println( "Enter Integer number" );
				input.nextLine();
			}
		}
		while ( continuedInput );
		input.close();

	}

	/** returns a int of sum Seriers i */
	public static int sumSeries( int i )
	{
		i--;
		if ( i <= 1 )
		{
			return 1;
		}
		return sumSeries( i / i - 1 ) + sumSeries( i - 1 / i - 3 );
	}

}
