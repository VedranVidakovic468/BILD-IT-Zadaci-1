package zadaci_02_02_2016;

import java.util.Scanner;

public class Zadatak4
{
	// metoda vraca sumu kolone matrice
	public static double sumColumn(double[][] m, int columnIndex)
	{
		double sum = 0; // inicijalizacija sum
		
		for ( int i = 0; i < m.length; i++ )
		{
			for ( int j = 0; j < m[0].length; j++ )
			{
				if ( j == columnIndex ) // samo se zbir vrsi u koloni prosljedjenoj u metodi
				{
					sum += m[i][j];
				}
			}
		}
		return sum; // vrati sum double
	}

	public static void main(String[] args) 
	{
		Scanner unos = new Scanner (System.in);
		
		double [][] matrix = new double [3][4]; // matrica 3 sa 4
		
		System.out.println( "Enter a 3-by-4 matrix row by row"); // unos elemenata u matricu
		for ( int i = 0; i < matrix.length; i++ )
		{
			for ( int j = 0; j < matrix[0].length; j++ )
			{
				matrix [i][j] = unos.nextDouble();
			}
		}
		
		// ispis suma svih kolona
		System.out.println("Sum of the elements at column 0 is: "+sumColumn(matrix, 0));
		System.out.println("Sum of the elements at column 1 is: "+sumColumn(matrix, 1));
		System.out.println("Sum of the elements at column 2 is: "+sumColumn(matrix, 2));
		System.out.println("Sum of the elements at column 3 is: "+sumColumn(matrix, 3));
	}

}
