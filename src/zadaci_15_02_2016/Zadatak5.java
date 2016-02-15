package zadaci_15_02_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.text.NumberFormatter;

/*
 * (Process scores in a text file) Suppose that a text file contains an unspecified number of 
 * scores separated by blanks. Write a program that prompts the user to enter the file,
reads the scores from the file, and displays their total and average.
 */
public class Zadatak5 
{

	public static void main(String[] args) 
	{
		//Initializing scanner and file objects
		Scanner input = new Scanner ( System.in );
		Scanner fileReader =  null;
		File file = null;
		boolean continuedInput = true;
		
		do 
		{
			try
			{
				System.out.println( "Enter file name to check avarega score: ");
				//enter scores for this exercise
				String fileName = input.nextLine();
				file = new File( fileName + ".txt" );
				fileReader = new Scanner( file );
				continuedInput = false;
			}
			catch ( FileNotFoundException ex )
			{
				System.out.println( "Please enter 'scores'"); 
			}
		}
		while ( continuedInput );
		/** initializing counter and sum */
		int counter = 0;
		double sum = 0;
		
		while ( fileReader.hasNext() ) // read next from file
		{
			try
			{
			int x = fileReader.nextInt();
			counter++;
			sum += ( double ) x; // adding all numbers to sum
			}
			catch ( InputMismatchException ex ) // the file can't contain other elemetns besides Integers
			{
				System.out.println( "Check your file ( File needs to contain only whole numbers Integer type )");
				System.exit(0);
			}
		}
		
		DecimalFormat formatter = new DecimalFormat("##.##"); // formatter to display formated decimal number
		double average = sum / counter;
		System.out.println( "The sume of all numbers in file score is: " + sum +
				" and the average is " + formatter.format(average) );

	}

}
