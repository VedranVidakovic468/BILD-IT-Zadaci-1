package zadaci_15_02_2016;

import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * (Count characters, words, and lines in a file) Write a program that will count the number of 
 * characters, words, and lines in a file. Words are separated by whitespace characters. 
 * The file name should be passed as a command-line argument, as shown in Figure 12.13.
 */
public class Zadatak4
{

	public static void main(String[] args) 
	{
		//inicializing scanner objects and file IO file object
		Scanner input = new Scanner (System.in);
		Scanner fileReader = null ;
		boolean continuedInput = true;
		java.io.File file = null;
		
		/** getting the filename and forwarding the file to scanner */
		do
		{
			try
			{
				System.out.println( "Enter text file name: " );
				//enter power for this exercise
				String fileName = input.nextLine();
				file = new java.io.File( fileName + ".txt" );
				fileReader = new Scanner( file );
				continuedInput = false;
			}
			catch ( FileNotFoundException ex )
			{
				System.out.println( "You must enter 'power'" );
				input.nextLine();
			}
		}
		while ( continuedInput );
		/** counters */
		int lineCount = 0;
		int wordCount = 0;
		int charCount = 0;
		/** process to count lines, words and charachters */
		while ( fileReader.hasNextLine() )
		{
			String line = fileReader.nextLine(); // pass the line to string line
			lineCount++; // increment line counter
			Scanner counter  = new Scanner( line ); // pass the line to scanner for further analysis
			while ( counter.hasNext() )
			{
				String word = counter.next();
				wordCount++;
				charCount += word.length();
			}
		}
		/** display the counters */
		System.out.println( "Your file has " + lineCount + " lines" +
		"\n " + wordCount + " words and " + charCount + " characters");

	}

}
