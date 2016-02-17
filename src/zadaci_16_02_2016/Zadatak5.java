package zadaci_16_02_2016;

import java.io.File ;
import java.io.PrintWriter ;
import java.util.Random ;

/*
 * Create large dataset) Create a data file with 1,000 lines. 
 * Each line in the file consists of a faculty member’s first name, last name, rank, and salary.
 *  The faculty member’s first name and last name for the ith line are FirstNamei and LastNamei. 
 *  The rank is randomly generated as assistant, associate, and full. 
 *  The salary is randomly generated as a number with two digits after the decimal point.
 *   The salary for an assistant professor should be in the range from 50,000 to 80,000, 
 *   for associate professor from 60,000 to 110,000, and for full professor from 75,000 to 130,000. 
 *   Save the file in Salary.txt. Here are some sample data:
FirstName1 LastName1 assistant 60055.95 FirstName2 LastName2 associate 81112.45
 */
public class Zadatak5
{
	/** Constance of this class */
	private final String FIRST_NAME = "FirstName";
	private final String LAST_NAME = "LastName";

	public static void main( String [ ] args )
	{
		Zadatak5 test = new Zadatak5(); //invoking test object of class Zadatak5
		
		File file = new File( "salary.txt" ); // creating a new file 'salary.txt'
		if ( file.exists() )
		{
			System.out.println( "File already exists." + " File address: " + file.getAbsolutePath() );
			System.exit( 0 );
		}
		try
		{
			PrintWriter output = new PrintWriter( file ); //passing the file to file writer
			for ( int i = 1; i <= 1000; i++ )
			{
				int id = new Random().nextInt( 3 );
				/** invoking toString method as an instance of class Zadatak5 */
				output.print( new Zadatak5().toString( i, id ) );
				output.println();
			}
			/** display if file is created and absolute path */
			System.out.println( "File succefully created." +  "File address: " + file.getAbsolutePath() );
			output.close();
		}
		catch ( Exception ex )
		{
			System.out.println( ex.getMessage() );
		}

	}
	/** returns random generated double number in range from 50k - 80k */
	private double getAssistantInRangeSalary()
	{
		double range = 30000;
		double scaled = new Random().nextDouble() * range;
		double shifted = scaled + 50000;
		return shifted;
	}
	/** return random generated double number in range from 60k - 110k */
	private double getAssociateInRangeSalary()
	{
		double range = 50000;
		double scaled = new Random().nextDouble() * range;
		double shifted = scaled + 60000;
		return shifted;
	}
	/** return random generated double number in range from 75k - 130k */
	private double getFullInRangeSalary()
	{
		double range = 55000;
		double scaled = new Random().nextDouble() * range;
		double shifted = scaled + 75000;
		return shifted;
	}
	
	
	/** returns random numbers */
	Random randomgGenerator =  new Random();
	/** array of String  */
	private String [ ] rank = { "assistant", "associate", "full" };
	//specify range ((max - min) + 1) + min;
	/** declaring salarys */
	private double assistantSalary = getAssistantInRangeSalary();
	private double associateSalary = getAssociateInRangeSalary();
	private double fullSalary = getFullInRangeSalary();
	private double [] salary = { assistantSalary, associateSalary, fullSalary };
	
	/** returns String */
	public String toString( int lineNumber, int id )
	{
		return FIRST_NAME+lineNumber+" "+LAST_NAME+lineNumber+" "+ rank[ id ] + " " 
	+ String.format("%.2f", salary[ id ]);
	}
	


}
