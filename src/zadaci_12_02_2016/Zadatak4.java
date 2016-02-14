package zadaci_12_02_2016;

import java.util.Random;
import java.util.Scanner;

import zadaci_18_01_2016.RandomGerator;

/*
 * (ArrayIndexOutOfBoundsException) Write a program that meets the fol- lowing requirements:
■ Creates an array with 100 randomly chosen integers.
■ Prompts the user to enter the index of the array, then displays the corre-
sponding element value. If the specified index is out of bounds, display the message Out of Bounds.
 */
public class Zadatak4 
{

	public static void main(String[] args) 
	{
		int [] array = new int [100]; // array int of 100 elements
		for ( int i = 0; i < array.length; i++ )
		{
			array[ i ] = randomGenerator.nextInt( 100 ); //adding random number to the array
		}
		
		int index = 0;
		boolean continueInput = true; //controls the loop do/while loop
		do
		{
			try
			{
				System.out.println( "Enter an index of the array: "); //prompt to enter index of array
				index = input.nextInt();
				
				//displayin the corresponding value 
				System.out.println( "The cooresponding value of index " + index + " is: " + array[ index ]);
				continueInput = false;// exiting the loop
			}
			catch ( ArrayIndexOutOfBoundsException ex )
			{
				//if there was an index entered that is greater than the size of array try again
				System.out.println( "Try again ( Out of bounds )" );
				input.nextLine(); // resets the input so the user can enter a new value
			}
		}
		while ( continueInput );
		
		

	}
	
	private static Random randomGenerator =  new Random();
	private static Scanner input = new Scanner ( System.in );

}
