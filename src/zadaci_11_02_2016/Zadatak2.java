package zadaci_11_02_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * (Sort ArrayList) Write the following method that sorts an ArrayList of numbers:
public static void sort(ArrayList<Integer> list)
Write a test program that prompts the user to enter 5 numbers, stores them in an
array list, and displays them in increasing order.
 */

public class Zadatak2 
{

	public static void main(String[] args)
	{
		ArrayList < Integer > myList =  new ArrayList();
		
		int counter = 0;
		while ( counter < 6 )
		{
			int x = readInt();
			myList.add( x );
			counter++;
		}
		System.out.println( myList );
		System.out.println( "Sort list" );
		sort( myList );
		System.out.println( myList );
		
	}
	
	public static void sort( ArrayList<Integer> list )
	{
		Collections.sort( list );
	}
	
	//returns and int from user input
	private static int readInt()
	{
		int x = input.nextInt();
		return x;
	}
	
	private static Scanner input = new Scanner( System.in );

}
