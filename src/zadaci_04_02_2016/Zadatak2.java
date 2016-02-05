package zadaci_04_02_2016;

import java.util.Scanner;

/*
 * 
public static boolean equals(int[][] m1, int[][] m2)
Write a test program that prompts the user to enter two 3 * 3 arrays of
 integers and displays whether the two are strictly identical. Here are the sample runs.
Enter list1: 51 22 25 6 1 4 24 54 6
Enter list2: 51 22 25 6 1 4 24 54 6
The two arrays are strictly identical
Enter list1: 51 25 22 6 1 4 24 54 6
Enter list2: 51 22 25 6 1 4 24 54 6
The two arrays are not strictly identical
 */
public class Zadatak2 
{
	//main metoda za testiranje methoda i programa
	public static void main(String[] args)
	{
		//pravljenje matrica 3x3 createMatrix pravi matrice 3x3
		int [][] matrix1 = createMatrix();
		int [][] matrix2 = createMatrix();
		
		//unos elemenata u matricu 1
		System.out.println( "Enter list 1: ");
		fillMatrix(matrix1);
		//unos elemenata u matricu 2
		System.out.println( "Enter list 2: ");
		fillMatrix(matrix2);
		
		// ako je equals true onda su matrice striktno identicne
		if (equals(matrix1,matrix2))
		{
			System.out.println( "The two arrays are strictly identical" );
		}
		else System.out.println( "The two arrays are not strictly identical" );

	}
	//metoda equals koja provjerava da li su matrice striktno identicne vraca boolean
	public static boolean equals(int[][] m1, int[][] m2)
	{
		for ( int i = 0; i < m1.length; i++ )
		{
			for ( int j = 0; j < m1[0].length; j++ )
			{
				if ( m1[i][j] != m2[i][j] )
				{
					return false;
				}
			}
		}
		return true;
	}
	//metoda za ispunjavanje matrice
	public static void fillMatrix ( int [][] m)
	{
		for ( int i = 0; i < m.length; i++ )
		{
			for ( int j = 0; j<  m.length; j++)
			{
				m[i][j] = readInt();
			}
		}
	}
	//metoda za pravljenje matrice
	public static int [][] createMatrix()
	{
		int [][] m  = new int [3][3];
		return m;
	}
	//metoda za ucitavanje int i vraca int
	public static int readInt()
	{
		input = new Scanner(System.in); //scanner objekat input
		int x = input.nextInt();
		return x;
	}

	//scanner variable input
	private static Scanner input;
	

}
