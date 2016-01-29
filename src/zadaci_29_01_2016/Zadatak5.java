package zadaci_29_01_2016;

import java.util.Random;

import zadaci_18_01_2016.RandomGerator;

public class Zadatak5 
{
	static Random randomGenerator = new Random(); // random objekat za generisanje nasumicnih brojeva
	
	public static void printMatrix(int n) // stampa matricu velicince n * n
	{
		int matrix [][] = new int [n][n]; // napravljena matrica n*n
		fillMatrix(matrix); // pozvana metoda fill za ispunjavanje matrice za 0 i 1
		for ( int i = 0; i < matrix.length; i++ ) // ispis matrice
		{
			System.out.println();
			for ( int j = 0; j < matrix[0].length; j++ )
			{
			System.out.print(matrix[i][j]+" ");
			}
		}
	}
	
	public static void fillMatrix(int [][] m) // metoda za ispunjavanje matrice sa 0 i 1
	{
		for ( int i = 0; i < m.length; i++ )
		{
			for ( int j = 0; j < m[0].length; j++ )
			{
				int x = randomGenerator.nextInt(2);
				m[i][j] = x;
			}
		}
	}
	public static void main(String[] args) 
	{
		printMatrix(8);// pozivanje metode za ispis matrice 

	}

}
