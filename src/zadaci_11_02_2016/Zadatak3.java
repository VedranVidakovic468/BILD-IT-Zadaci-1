package zadaci_11_02_2016;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * (Sum ArrayList) Write the following method that returns the sum of all num-
bers in an ArrayList:
public static double sum(ArrayList<Double> list)
Write a test program that prompts the user to enter 5 numbers, stores them in an array list, and displays their sum.
 */
public class Zadatak3
{

	public static void main(String[] args) 
	{
		ArrayList < Double > sumMyList = new ArrayList(); // creating a list that stores double type values
		Scanner input = new Scanner ( System.in ); // scanner object for taking user input
		System.out.println( "Enter 5 numbers into array list:");
		int counter = 1;
		while ( counter < 6 ) //6 breaks the loop
		{
			double x = input.nextDouble();//entering a double num
			sumMyList.add( x ); //adding the number to sumMyList
			counter++;
		}
		
		System.out.println( "The sum of your list is:");
		//output of the sum
		System.out.println( sum( sumMyList ) );
	}
	
	public static double sum( ArrayList<Double> list)
	{
		double sum = 0;// Initializing sum value
		for ( int i = 0; i < list.size(); i++ )
		{
			sum += list.get( i ); //adding value of list 
		}
		return sum; ///returning sum of double values from list
	}

}
