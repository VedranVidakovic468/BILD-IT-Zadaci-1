package zadaci_10_02_2016;

import java.util.ArrayList;
import java.util.Date;
/*
 * (Use ArrayList) Write a program that creates an ArrayList and adds a Loan object, a Date object,
 *  a string, and a Circle object to the list, and use a loop to display all the
 *  elements in the list by invoking the object’s toString() method.
 */
public class Zadatak4
{

	public static void main(String[] args) 
	{
		ArrayList<Object> myList = new ArrayList<>(); //creating an arrayList type objects
		myList.add( new zadaci_04_02_2016.Account( 2500, 230 ) ); //adding the account class to my ArrayList of objects
		myList.add( new Date() ); //adding a date object to the list
		myList.add("JAVANATOR"); // adding a string to my list
		myList.add( new Triangle( 3,5,5 ) ); //adding a triangle object to the list
		//looping thru the list and invoking their toString methods
		for ( int i = 0; i < myList.size(); i++ )
		{
			System.out.println( myList.get( i ) );
		}

	}

}
