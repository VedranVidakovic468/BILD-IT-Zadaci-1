package zadaci_16_02_2016;

import java.net.URL ;
import java.text.DecimalFormat ;
import java.util.InputMismatchException ;
import java.util.Scanner ;

public class Zadatak4
{

	public static void main( String [ ] args )
	{
		System.out.println( "Enter a URL:" );
		// enter http://cs.armstrong.edu/liang/data/Scores.txt 
		String URLString = new Scanner( System.in ).next();
		
		try
		{
			URL url = new URL( URLString ); //creating and URL object
			int counter = 0;
			double sum = 0;
			Scanner input = new Scanner ( url.openStream() );//passing the url object to scanner
			while( input.hasNextInt() ) 
			{
				int x = input.nextInt(); //taking the nextInt into x
				sum += ( double ) x; //add x to sum
				counter++; //increment counter
			}
			/**Displaying the Total and the average */
			double average = ( double ) ( sum / counter );
			DecimalFormat formatter = new DecimalFormat( "##.##" );
			System.out.println( "The total is: " + sum + " and average score is: " + formatter.format( average ) );
		}
		/** handling exceptions */
		catch ( InputMismatchException ex )
		{
			System.out.println( ex.getMessage() );
		}
		catch ( java.io.IOException ex )
		{
			System.out.println( "I/O Errors: no such file" );
		}

	}

}
