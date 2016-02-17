package zadaci_17_02_2016;

import java.io.File ;
import java.io.FileNotFoundException ;
import java.util.InputMismatchException ;
import java.util.Scanner ;

/*
 * (Occurrences of each letter) Write a program that prompts the user to enter a file name and displays the occurrences of each letter in the file.
 *  Letters are case-insensitive. Here is a sample run:
 */
public class Zadatak2
{

	public static void main( String [ ] args )
	{
		System.out.println( "Enter filename" );
		//enter Linocoln for this exercise
		String fileName = new Scanner( System.in ).next();
		
		try
		{
			File file = new File ( fileName + ".txt" ); //creating a file object
			Scanner input = new Scanner ( file ); //passing the file to scanner
			int [] counter = new int [ 26 ];
			
			while ( input.hasNext() ) //scanner takes next
			{
				String line = input.nextLine().toUpperCase(); //all line to uppercase
				for ( int i = 0; i < line.length(); i++ )
				{
					char ch = line.charAt( i );
					if ( Character.isLetter( ch ) ) 
					{
                        counter[ ch - 'A' ]++; // 'B' = 66 , 'A' = 65. index = 66 -65
					}
				}
			}
			input.close();
			/** diplaying the counts of letters */
			for ( int i = 0; i < counter.length; i++ ) 
			{
				System.out.println( "Number of " + ( char )( 'A' + i ) + "'s: " + counter[ i ] );
		    }
		}
		/** exception handling*/
		catch ( FileNotFoundException ex )
		{
			System.out.println( "You must enter 'Linocoln'" );
		}
		catch ( InputMismatchException ex )
		{
			System.out.println( ex.getMessage() );
		}

	}

}
