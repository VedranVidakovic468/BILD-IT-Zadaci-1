package zadaci_04_02_2016;

import java.util.Scanner;

/*
 * Program koji pita za unos dimenzija matrice i nadje najveci elemenat u matrice te njegove indexe
 */


public class Zadatak5 
{

	public static void main(String[] args) 
	{
		//upit za duzinu redova i kolona
		System.out.println( "Enter the number of rows and columns in the array" );
		int rowSize = readInt();
		int colSize = readInt();
		
		double [][] matrix = createMatrix(rowSize, colSize);
		//unos elemenata tipa double u matricu
		System.out.println( "Enter the array");
		//pozivanje metoda za popunjavanje matrice i prikaz
		fillMatrix(matrix);
		displayMatrix(matrix);
		locateLargest(matrix);
		

	}
	
	//metoda vraca matricu duzine prosljedjenoj u argumentima
	private static double [][] createMatrix ( int rowLength, int colLength )
	{
		double m [][] = new double[rowLength][colLength];
		return m;
	}
	
	// metoda pronalazi najveci elemenat u matrici te njegove indexe i vratca instancu klase Location
	public static Location locateLargest ( double[][] m )
	{
		//inicijalizacija max i indexa
		double max = 0;
		int index1 = 0;
		int index2 = 0;
		for ( int i = 0; i < m.length; i++ )
		{
			for ( int j = 0; j < m[0].length; j++ )
			{
				if ( m[i][j] > max  )
				{
					max = m [i][j];
					index1 = i;
					index2 = j;
				}
			}
		}
		
		//pravljenje objekta klase Location i proslijedili argumente za inicijalizaciju
		Location location = new Location( max, index1, index2 );
		return location;
	}
	
	// metoda za ispis matrice
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
	
	// metoda za ispunjavanje matrice
	public static void fillMatrix ( double [][] m )
	{
		for ( int i = 0; i < m.length; i++ )
		{
			for ( int j = 0; j < m.length; j++ )
			{
				m[i][j] = readDouble();
			}
		}	
	}
	
	// metoda za ucitavanje broja tipa double
	private static double readDouble()
	{
		double x = input.nextDouble();
		return x;
	}
	
	//metoda za ucitavanje broja tipa int
	private static int readInt()
	{
		int x = input.nextInt();
		return x;
	}
	// scanner objelat input
	private static Scanner input = new Scanner (System.in);;
	

}
