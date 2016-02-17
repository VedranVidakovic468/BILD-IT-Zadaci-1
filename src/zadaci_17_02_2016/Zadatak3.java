package zadaci_17_02_2016;

import java.io.File ;
import java.io.IOException ;
import java.net.URL ;
import java.util.InputMismatchException ;
import java.util.NoSuchElementException ;
import java.util.Scanner ;

/*
 * Baby name popularity ranking) The popularity ranking of baby names from years 2001 to 2010 is downloaded 
 * from www.ssa.gov/oact/babynames and stored in files named babynameranking2001.txt, babynameranking2002.txt, . . . , babynameranking2010.txt.
 * Each file contains one thousand lines. Each line contains a ranking, a boy’s name, number for the boy’s name, a girl’s name, and number for the girl’s name.
 * For example, the first two lines in the file babynameranking2010.txt are as follows:
 * Write a program that prompts the user to enter the year, gender, and followed by a name, and displays the ranking of the name for the year. Here is a sample run:
 */
public class Zadatak3
{

	public static void main( String [ ] args )
	{
		/** initializing variables */
		Scanner keyboard = new Scanner( System.in );
		int year = 0;
		String gender = "";
		String name = "";
		boolean continuedInput = true;
		
	do
	{
		try
		{
			//year must be in range
			System.out.println( "Enter a year" );
			year = keyboard.nextInt();
			if ( year < 2001 || year > 2010 )
			{
				throw new InputMismatchException( "Year must be in range from 2001 to 2010 ");
			}
			
			// string must be a letter m or f
			System.out.println( "Enter gender" );
			gender = keyboard.next().toUpperCase();
			if ( !gender.equals( "M" ) && !gender.equals( "F" ) )
			{
				throw new InputMismatchException( "Gender can only be 'M' or 'F' ");
			}
			
			System.out.println( "Enter a name: " );
			name = keyboard.next();
			continuedInput = false;
			
		}
		catch ( InputMismatchException ex )
		{
			System.out.println( ex );;
		}
		keyboard.nextLine();
	}
	while ( continuedInput );
	
	int rank = 0;
	String urlString = "http://www.ssa.gov/oact/babynames/babynameranking"+year+".txt"; //getting url String
		try
		{
			URL url = new URL ( urlString ); //passing urlString to url object
			Scanner input = new Scanner( url.openStream() ); //passing url to scanner
			
			while ( input.hasNext() )
			{
				rank = input.nextInt();
				String babyName = input.next();
				if ( babyName.equals( name ) )
				{
					break;
				}
			}
			/**displaying name and rank */
			System.out.println( name+" is ranked #"+rank+" in year "+year );
		}
		catch( NoSuchElementException ex )
		{
			System.out.println( ex );
		}
		catch ( IOException ex )
		{
			System.out.println( ex );
		}
	}

}
