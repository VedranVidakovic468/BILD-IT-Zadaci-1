package zadaci_16_02_2016;

import java.util.Scanner;

public class Zadatak3
{

	public static void main( String [ ] args )
	{
		System.out.println( "Enter a URL:" );
		// enter http://cs.armstrong.edu/liang/data/Lincoln.txt" //
		String URLString = new Scanner( System.in ).next();

		try
		{
			java.net.URL url = new java.net.URL( URLString ); //create a URL object
			int count = 0;
			Scanner input = new Scanner( url.openStream() );//pass the url object to scanner
			while ( input.hasNext() ) //checking for next 
			{
				String s = input.next(); //put the next word into s
				if ( !s.equals( "--" ) ) //dont dount double dashes as words
				{
				count++; //increment the counter
				}
			}
			System.out.println( "The file size is " + count + " words" );
		}
		/** exception handling */
		catch ( java.net.MalformedURLException ex )
		{
			System.out.println( "Invalid URL" );
		}
		catch ( java.io.IOException ex )
		{
			System.out.println( "I/O Errors: no such file" );
		}

	}

}
