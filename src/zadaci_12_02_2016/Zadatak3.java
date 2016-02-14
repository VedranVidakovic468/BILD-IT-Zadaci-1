package zadaci_12_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

//(InputMismatchException) Write a program that prompts the user to read two integers and displays their sum. 
//Your program should prompt the user to read the number again if the input is incorrect.
public class Zadatak3
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);   //scanner object for taking user input
		boolean continueInput = true; //initializing boolean to true to control the loop 
		int number = 0, number2 = 0;
		
		do 
		{
			try
			{
				System.out.println( "Enter an Integer"); //if the user input was an type of integer number stores the values and moves on
				//to take the second value
				number = input.nextInt();
				continueInput = false; //continueInput becomes false exits the loop
			}
			catch ( InputMismatchException ex ) //if there was an input missmatch catch the exception and try again for input while 
			//continueInput is true
			{
				System.out.println( "Try again ( Incorrect inpout an Integer is required )" );
				input.nextLine(); // resets the input so the user can enter a new value
			}
		} 
		while ( continueInput );
		
		do
		{
			try
			{
				System.out.println( "Enter a second Integer" );
				number2 = input.nextInt();
				continueInput = false;
			}
			catch ( InputMismatchException ex )
			{
				System.out.println( "Try again ( Incorrect input an Integer is required )" );
				input.nextLine();
			}
		}
		while ( continueInput );
		
		int sum = number + number2; //sum of two integers
		System.out.println( "The sum of two integers is: " + sum );
	}

}
