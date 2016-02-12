package zadaci_11_02_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/*
 * (Largest rows and columns) Write a program that randomly fills in 0s and 1s into an n-by-n matrix, 
 * prints the matrix, and finds the rows and columns with the most 1s. (Hint: Use two ArrayLists to store the row and column 
 * indices with the most 1s.) Here is a sample run of the program:
 */
public class Zadatak1
{

	public static void main(String[] args)
	{
		//testing all the methods 
		System.out.println( "Ente row length of matrix:");
		int rowSize = readInt(); // reading in an int to set row length of matrix
		System.out.println( "Enter column length of matrix:");
		int columnSize = readInt(); // radint in an int to set column length of matrix
		int matrix [][] = createMatrix( rowSize, columnSize ); // creating matrix by sizes enterd by user
		fillMatrix( matrix );// fills the matrix randomly with 1s and 0s
		System.out.println( "Display matrix filled randomly with 0s and 1s" );
		printMatrix( matrix ); // displaying matrix
		printLargestRow( matrix ); // prints the row indexes that contain the most 1s
		System.out.println();
		printLargestColumn( matrix ); // prints the column indexes that contain the most 1s

	}
	
	//method that returns a matrix int size of parameters
	public static int [][] createMatrix( int rowLength, int columnLenght )
	{
		int [][] m = new int [ rowLength ][ columnLenght ];
		return m;
	}
	//returns and int from user input
	private static int readInt()
	{
		int x = input.nextInt();
		return x;
	}
	// display's the matrix 
	public static void printMatrix ( int [][] m )
	{
		for ( int i = 0; i < m.length; i++ )
		{
			for ( int j = 0; j < m[ 0 ].length; j++ )
			{
				System.out.print( m[ i ][ j ] + " " );
			}
			System.out.println();
		}
	}
	//fills the matrix randomly with 1s and and 0s
	public static void fillMatrix( int [][] m )
	{
		for ( int i = 0; i < m.length; i++ )
		{
			for ( int j = 0; j < m[ 0 ].length; j++ )
			{
				int x = randomGenerator.nextInt( 2 );
				m[ i ][ j ] = x;
			}
		}
	}
	
	//method for counting 1s in rows and returns counter int
	public static int countRow( int [][] m, int row )
	{
		int counter = 0;
		for ( int i = row; i <= row ; i++ )
		{
			for ( int j = 0; j < m[row].length; j++)
			{
				if ( m[ row ] [j ] == 1 )
				{
					counter++;
				}
			}
		}
		return counter;
	}
	
	//method for counting 1s in columns and returns counter int
	public static int countColumn ( int [][] m, int column )
	{
		int counter = 0;
		for ( int i = 0; i < m.length; i++ )
		{
			for ( int j = column; j <= column ; j++)
			{
				if ( m[ i ][ column ] == 1 )
				{
					counter++;
				}
			}
		}
		return counter;
	}
	
	// method for printing the largest row index of matrix
	public static void printLargestRow ( int [] [] m  )
	{
		ArrayList < Integer > rows = new ArrayList(); // arrayList rows to save the count of 1s in each row
		for ( int i = 0; i < m.length; i++ )
		{
			int x = countRow( m, i ); // x becomes the addition of 1s in each row
			rows.add( x ); //adding x to the list
		}
		int max = Collections.max( rows ); // finding the row with max 1's
		
		System.out.print( "The largest row index: ");
		for ( int i = 0; i < rows.size(); i++ )
		{
			if ( rows.get( i ) == max ) //printing all indexes that have the same value as max
			{
				System.out.print( " " + i + " ");
			}
		}
	}
	//method for printing the largest column index of matrix
	public static void printLargestColumn ( int [] [] m  )
	{
		ArrayList < Integer > columns = new ArrayList(); //arrayList to save the count of 1's in each column
		for ( int i = 0; i < m.length; i++ )
		{
			int x = countColumn( m, i ); //x becomes the addition of 1's in each column
			columns.add( x ); // adding x to the list columns
		}
		
		int max = Collections.max( columns ); // find the column with most 1's
		
		System.out.print( "The largest column index: ");
		for ( int i = 0; i < columns.size(); i++ )
		{
			if ( columns.get( i ) == max )//printing all indexes that have the same value as max
			{
				System.out.print( " " + i + " ");
			}
		}
	}

	
	private static Random randomGenerator = new Random(); // random generator object to generate random numbers
	private static Scanner input = new Scanner( System.in ); // scanner object to get user input
}
