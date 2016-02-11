package zadaci_10_02_2016;

import java.awt.DisplayMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/*
 * (Shuffle ArrayList) Write the following method that shuffles the elements in an ArrayList of integers.
public static void shuffle(ArrayList<Integer> list)
 */
public class Zadatak5 
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
		System.out.println( "Display list in normal order:");
		displayList( values ); //displaying list in normal order
		System.out.println( "Display shuffeled list: ");
		shuffle( values );//Shuffling the list and displaying it
		displayList(values);
		shuffle( values );
		displayList(values);
		shuffle( values );
		displayList(values);

	}
	
	public static void shuffle( ArrayList< Integer > list )//shuffle method to shuffle the indexes of arraList
	{
		Random seed = new Random( list.size() ); // random variable seed that max value is size of list
		Collections.shuffle( list, seed ); //calling Collections shuffle method to shuffle indexes of arrayList
	}
	
	public static void displayList( ArrayList< Integer > list ) //method to display the arrayList
	{
		System.out.println( list );
	}

}
