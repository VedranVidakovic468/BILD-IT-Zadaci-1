package Chapter_17 ;

import java.io.BufferedOutputStream ;
import java.io.File ;
import java.io.FileOutputStream ;
import java.io.IOException ;
import java.io.PrintWriter ;
import java.util.Random ;

/*
 * (Create a text file) Write a program to create a file named Exercise17_01.txt if it does not exist. Append new data to it if it already exists.
Write 100 integers created randomly into the file using text I/O. Integers are separated by a space.
 */
public class Exercise_1
{

	public static void main( String [ ] args )
	{
		Random randomGenerator = new Random();
		File file = new File( "integers.txt" ) ;
		boolean append = file.exists() ;

		do
		{
			try
			{
				PrintWriter output = new PrintWriter(
						new BufferedOutputStream( new FileOutputStream( file, append ) ) ) ;

				for ( int i = 0; i < 100; i++ )
				{
					int x = randomGenerator.nextInt( 10 ) ;
					output.print( x + " ");

				}
				append = false ;
				output.close() ;
				System.out.println( "File created...." ) ;
			}
			catch ( IOException ex )
			{
				System.out.println( ex.getMessage() ) ;
			}
		}
		while ( append ) ;

	}

}
