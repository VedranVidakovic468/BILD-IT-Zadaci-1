package zadaci_22_02_2016;

import java.util.InputMismatchException ;
import java.util.Scanner;

/*
 * (Sum series) Write a recursive method to compute the following series: m(i)=1+1+1+ c+1
   23i Write a test program that displays m(i) for i = 1, 2, . . ., 10.
 */
public class Zadatak3
{

	public static void main( String [ ] args )
	{
		//create scanenr object
		Scanner input = new Scanner( System.in );
		boolean continuedInput = false;
		
		do
		{
			try
			{
				//prompt to enter an Integer
				System.out.println( "Enter a Integer number" );
				int num = input.nextInt();
				//displaying the sumSeries of that number
				System.out.println( "The sum Series for numer you entered is " + sumSeries( num ) );
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

	/** return m(i) = 1 + 1/2 + 1/3 + 1/i... */
	public static int sumSeries( int i )
	{
		i--;
		if ( i <= 1 )
		{
			return 1;
		}
		return sumSeries( i ) + sumSeries( i - 1 );

	}

}
