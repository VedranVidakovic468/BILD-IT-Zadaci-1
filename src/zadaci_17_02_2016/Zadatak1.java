package zadaci_17_02_2016;

import java.io.IOException ;
import java.net.MalformedURLException ;
import java.net.URL ;
import java.util.InputMismatchException ;
import java.util.Scanner ;

/*
 * (Process large dataset) A university posts its employees’ salaries at http:// cs.armstrong.edu/liang/data/Salary.txt. 
 * Each line in the file consists of a faculty member’s first name, last name, rank, and salary (see Programming Exercise 12.24). 
 * Write a program to display the total salary for assistant professors, associate professors, full professors, and all faculty, r
 * espectively, and display the average salary for assistant professors, associate professors, full professors, and all faculty, 
 * respectively.
 */

public class Zadatak1
{

	public static void main( String [ ] args )
	{
		
		System.out.println( "Enter a URL" );
		//enter http://cs.armstrong.edu/liang/data/Salary.txt for this exercise
		String urlString = new Scanner( System.in ).next();
		
		try
		{
			URL url = new URL ( urlString ); // creating an URL object
			//initializing variable to calculate averega and total
			long totalSalaryAssistant = 0;
			long totalSalaryAssociate = 0;
			long totalSalaryFull = 0;
			int counterAssistant = 0;
			int counterAssociate = 0;
			int counterFull = 0;
			Scanner input = new Scanner( url.openStream() ); //pass url to scanner
			while ( input.hasNext() )
			{
				String temp = input.next();
				if ( temp.equals( "assistant" ) )
				{
					counterAssistant++;
					totalSalaryAssistant += input.nextDouble();
				}
				if ( temp.equals( "associate" ) )
				{
					counterAssociate++;
					totalSalaryAssociate += input.nextDouble();
				}
				if ( temp.equals( "full" ) )
				{
					counterFull++;
					totalSalaryFull += input.nextDouble();
				}
			}
			/** displaying the results */
			long grandTotal = totalSalaryAssistant + totalSalaryAssociate + totalSalaryFull;
			long assistantAverageSalary = ( long ) ( totalSalaryAssistant / counterAssistant );
			long associateAverageSalary = ( long ) ( totalSalaryAssociate /  counterAssociate );
			long fullAverageSalary = ( long ) ( totalSalaryFull / counterFull );
			long grandAverage = grandTotal / 1000;
			System.out.println( "Total salary for assistant " + totalSalaryAssistant + " and the average is " + assistantAverageSalary );
			System.out.println( "Total salary for associate " + totalSalaryAssociate + " and the average is " + associateAverageSalary );
			System.out.println( "Total salary for full " + totalSalaryFull + " and the average is " + fullAverageSalary );
			System.out.println( "Total salary for all faculty members " + grandTotal + " and the average is " + grandAverage  );
			input.close();
		}
		catch ( InputMismatchException ex )
		{
			System.out.println( ex.getMessage() );
		}
		catch ( MalformedURLException ex )
		{
			System.out.println( ex.getMessage() );
		}
		catch ( IOException ex )
		{
			System.out.println( ex.getMessage() );
		}
	}

}
