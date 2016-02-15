package zadaci_15_02_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * (Remove text) Write a program that removes all the occurrences of a specified string from a text file. 
 * For example, invoking
            java Exercise12_11 John filename
removes the string John from the specified file. Your program should get the arguments from the command line.
 */
public class Zadatak3 
{

	public static void main(String[] args)  throws Exception
	{	
		//initializing Scanner and File objects
		Scanner input = new Scanner (System.in);
		Scanner fileReader = null ;
		Scanner removedString = null;
		boolean continuedInput = true;
		java.io.PrintWriter output = null;
		java.io.File file = null;
		
		/** getting the filename and forwarding the file to scanner */
		do
		{
			try
			{
				System.out.println( "Enter text file name: " );
				//enter sample for this exercise
				String fileName = input.nextLine();
				file = new java.io.File( fileName + ".txt" );
				fileReader = new Scanner( file );
				removedString = new Scanner (file);
				continuedInput = false;
			}
			catch ( FileNotFoundException ex )
			{
				System.out.println( "You must enter 'sample'" );
				input.nextLine();
			}
		}
		while ( continuedInput );
		
		/** displaying the file content */
		while ( fileReader.hasNext() )
		{
			String textPart1 = fileReader.next();
			String textPart2 = fileReader.next();
			String textPart3 = fileReader.next();
			String textPart4 = fileReader.next();
			System.out.print( textPart1 + " " + textPart2 + " " + textPart3 + 
					" " + textPart4 );
		}
		fileReader.close();
		//prompt to enter which String to be removed
		System.out.println( "\nEnter which string you like to be removed" );
		String removeMe = input.next();
		
		/** removing desired text from file and displaying it */
		String check = "";
		while ( removedString.hasNext() )
		{
			check += removedString.nextLine(); //check becomes the whole line of text
			check = check.replaceAll( removeMe, "" ); //find and replace the specific text with nothing
			try
			{
			 output = new PrintWriter( file );
		     System.out.println( check ); //display the new line
		     output.write( check ); // write it to the file
		     output.close();
		    }
			catch ( FileNotFoundException e ) 
			{
		        e.printStackTrace();
		    }
		}
		removedString.close();
			
		}
		
	}


