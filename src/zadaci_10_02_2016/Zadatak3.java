package zadaci_10_02_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * (Maximum element in ArrayList) Write the following method that returns the maximum value in an
 *  ArrayList of integers. The method returns null if the list is null or the list size is 0.
public static Integer max(ArrayList<Integer> list)
 */
public class Zadatak3 
{

	public static void main(String[] args) 
	{
		ArrayList <Integer> values = new ArrayList(); // creating an object of ArrayList type Integer
		Scanner input = new Scanner ( System.in ); // creating an object of Scanner type Input Stream
		System.out.println( "Enter values to list (0 stops the entry) :");
		
		int addMe = 1;
		while ( addMe != 0 ) //0 braeks the loop
		{
			addMe = input.nextInt(); // entereing value
			if ( addMe == 0 )
			{
				break;
			}
			values.add( addMe ); //adding the value to the list
		}
		
		if ( values.isEmpty() ) // if the list is empty display null
		{
			System.out.println( max( values) );
		}
		else //display the max value of the list
		{
		System.out.println( "Max value of the list: ");
		int max = max( values );
		System.out.println( max );
		}

	}
	
	public static Integer max( ArrayList <Integer> list )
	{
		int maxValue; //initializing maxValue
		if ( list.size() == 0 ) //if list size is 0 return null
		{
			return null;
		}
		else
		{
			//if they are values in the list use Colleactions method max to find max value in the list and return it
			maxValue = Collections.max( list );
			return maxValue;
		}
		
	}

}