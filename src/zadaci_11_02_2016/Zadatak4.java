package zadaci_11_02_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * (Remove duplicates) Write a method that removes the duplicate elements from an array list of integers using the following header:
public static void removeDuplicate(ArrayList<Integer> list) Write a test program that prompts the user to enter 10 integers to a list
 and dis-plays the distinct integers separated by exactly one space. Here is a sample run:
 */
public class Zadatak4
{

	public static void main(String[] args)
	{
		ArrayList < Integer > myList =  new ArrayList();// creating an arraList of Integers named myList
		Scanner input = new Scanner( System.in ); // scanner object for taking input from user
		int counter = 1;
		
		System.out.println( "Enter values to your list"); //prompt to enter values to list
		while ( counter < 11 ) // counter = 11 breaks the loop
		{
			int x = input.nextInt();//entering value
			myList.add( x ); // adding values to list
			counter++;//increment counter by 1
		}
		
		System.out.println( "Display list wiht duplicates" );
		System.out.println( myList ); // display list without removing duplicates
		System.out.println( "Display list without duplicates" );
		removeDuplicate( myList ); // calling method to remove duplicate
		System.out.println( myList ); // displaying list without duplicates

	}
	
	public static void removeDuplicate( ArrayList<Integer> list ) //this method removes duplicate values from list
	{
		ArrayList < Integer > removedDuplicates =  new ArrayList();
		for ( int i = 0; i < list.size(); i++ )
		{
			if ( !removedDuplicates.contains( list.get( i ) ) ) // if removedDuplicates list dont have the value of myList 
			{
				removedDuplicates.add( list.get( i ) ); // add the value to remobedDuplicates list
			}
		}
		list.clear(); // clear the list
		list.addAll( removedDuplicates ); // add all the values from removedDuplicates
	}

}
