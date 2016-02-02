package zadaci_01_03_2016;

import java.util.Scanner;

public class Zadatak5 
{
	// metoda koja vraca sumu elemenata matrice a i b
	public static double[][] addMatrix(double[][] a, double[][] b)
	{
		double [][] resultMatrix = new double [a.length][a.length];
		
		for ( int i = 0; i < resultMatrix.length; i++ )
		{
			for ( int j = 0; j < resultMatrix[0].length; j++ )
			{
				// zbir elemenata iz a  i b 
				resultMatrix [i][j] = a[i][j] + b [i][j];
			}
		}
		
		return resultMatrix; // vrtaca double matricu sa zbirom elemenata iz a i b matrice
	}

	public static void main(String[] args) 
	{
		Scanner unos = new Scanner (System.in);
		
		double [][] a = new double [3][3]; // matrica a 3X3
		double [][] b = new double [3][3]; // matrica b 3X3
		
		System.out.println( "Enter matrix 1"); // unos elemenata u matricu a
		for ( int i = 0; i < a.length; i++)
		{
			for ( int j = 0; j < a[0].length; j++ )
			{
				a[i][j] = unos.nextDouble(); // unos double
			}
		}
		
		System.out.println( "Enter matrix 2"); // unos elemenata u matricu b
		for ( int i = 0; i < b.length; i++)
		{
			for ( int j = 0; j < b[0].length; j++ )
			{
				b[i][j] = unos.nextDouble(); // unos double
			}
		}
		
		double [][] c = addMatrix(a, b);
		
		//ispis sabranih matrica a i b
		System.out.println( "The matrices are added as follows");
		for ( int i = 0; i < c.length; i++)
		{
			for ( int j = 0; j < c[0].length; j++ )
			{
				System.out.print( c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
