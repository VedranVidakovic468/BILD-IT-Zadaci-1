package zadaci_04_02_2016;

import java.util.Scanner;

/*
 * Row sorting) Implement the following method to sort the rows in a two- dimensional array. 
 * A new array is returned and the original array is intact.
public static double[][] sortRows(double[][] m)
Write a test program that prompts the user to enter a 3 * 3 matrix of double
values and displays a new row-sorted matrix. Here is a sample run:
Enter a 3-by-3 matrix row by row:
0.15 0.875 0.375
0.55 0.005 0.225
0.30 0.12 0.4
The row-sorted array is
 */
public class Zadatak1 
{
	
	public static void main(String[] args) 
	{
		double [][] matrix = createMatrix();
		fillMatrix(matrix);
		System.out.println("Display unsorted matrix");
		displayMatrix(matrix);
		System.out.println("Display sorted matrix");
		matrix = sortRows(matrix);
		displayMatrix(matrix);

	

	}
	
	//StartCopyCode source http://stackoverflow.com/questions/19213653/implement-the-following-method-to-sort-the-rows-in-a-twodimensional-array
	public static double[][] sortRows( double[][] m ) // metoda vraca sortiranu matricu
	{
		double [][] result = new double[m.length][m[0].length];
		for ( int i = 0; i < m.length; i++ )
		{
			for ( int j = 0; j < m[0].length; j++ )
			{
				result[i][j] = m [i][j];
			}
		}
		
		double temp = result[0][0];
		for ( int row = 0; row < result.length; row++ )
		{
			for ( int col = 0; col < result[row].length; col++ )
			{
				for( int nextCol = col; nextCol < result[row].length; nextCol++ )
				{
					if( result[row][col] > result[row][nextCol] )
		               {
		                  temp = result[row][col];
		                  result[row][col] = result[row][nextCol];
		                  result[row][nextCol] = temp;
		               }
				}
			}
		}
		
		return result;
	
	} 
	//EndCopyCode ja Ahmed razumjem ovaj kod
	
	//metoda za ispis matrice
	public static void displayMatrix ( double [][] m )
	{
		for ( int i = 0; i < m.length; i++ )
		{
			for ( int j = 0; j < m.length; j++ )
			{
				System.out.print( m[i][j] + " " );
			}
			System.out.println();
		}
	}
	
	//metoda za ispunjavanje matrice
	private static void fillMatrix( double [][] m )
	{
		for ( int i = 0; i < m.length; i++ )
		{
			for ( int j = 0; j < m.length; j++ )
			{
				m[i][j] = readDouble();
			}
		}
	}
	//metoda za pravljenje matrice
	private static double [][] createMatrix()
	{
		double [][] m = new double [3][3];
		return m;
	}
	//metoda za ucitavanje promjenljive tipa double, vraca double
	private static double readDouble()
	{
		input = new Scanner ( System.in );
		double x  = input.nextDouble();
		return x;
	}
	
	private static Scanner input; 

}
