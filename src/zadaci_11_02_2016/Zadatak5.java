package zadaci_11_02_2016;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * (Combine two lists) Write a method that returns the union of two array lists of integers using the following header:
public static ArrayList<Integer> union( ArrayList<Integer> list1, ArrayList<Integer> list2)
 */
public class Zadatak5 
{

	public static void main(String[] args) 
	{
		ArrayList < Integer > list1 = new ArrayList(); // creating a list of integers
		ArrayList < Integer > list2 =  new ArrayList(); // creating a second list of integers
		Scanner input = new Scanner (System.in ); // scanner object for user input
		
		int counter = 1;
		System.out.println( "Enter five integers for list1:" );
		while ( counter < 6 ) //counter == breaks the loop
		{
			int x = input.nextInt(); //user input
			list1.add( x );//adding the input to list1
			counter++; //increment counter
		}
		
		counter = 1; //reseting counter to 1
		System.out.println( "Enter five integers for list2:" );
		while ( counter < 6 )
		{
			int x = input.nextInt(); //user input
			list2.add( x );// adding the input to list2
			counter++;//increment counter
		}
		//Combining 2 lists into one using method union
		ArrayList < Integer > united = union( list1, list2 );
		System.out.println( "The combined list is " );
		System.out.println( united ); //displaying combined list

	}
	//method combines two lists into one
	public static ArrayList<Integer> union( ArrayList<Integer> list1, ArrayList<Integer> list2 )
	{
		ArrayList < Integer > united = new ArrayList(); // creating a list united to store data from list1 and list2
		united.addAll( list1 ); //addAll elements from list1 to united
		united.addAll( list2 );// addAll elements from list2 to united
		return united; // return the combined list
	}

}
