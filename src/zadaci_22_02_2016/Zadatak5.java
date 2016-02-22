package zadaci_22_02_2016;

import java.util.InputMismatchException ;
import java.util.Scanner ;

public class Zadatak5
{

	public static void main( String [ ] args )
	{
		//create scanner
		Scanner input = new Scanner (System.in);
		boolean continuedInput = false;
		do
		{
			try
			{
				//prompt for user input
				System.out.println( "Enter a integer number" );
				int num = input.nextInt();
				//displaying the sum series of number entered
				System.out.println( "The sum series of number " + num + " is " + sumSeries( num ) );
				continuedInput = false;
			}
			//handling exception
			catch( InputMismatchException ex )
			{
				System.out.println( "Please enter integer number" );
				input.nextLine();
			}
		}
		while ( continuedInput );
		input.close();

	}

	/** returns a int of sum Series i/ i+1 */
	public static int sumSeries( int i )
	{
		i--;
		if ( i <= 1 )
		{
			return 1;
		}
		return sumSeries( i / i - 1 ) + sumSeries( i - 1 / i - 2 );
	}
}
