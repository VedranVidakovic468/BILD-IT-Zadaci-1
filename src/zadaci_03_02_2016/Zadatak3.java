package zadaci_03_02_2016;

import java.util.Random;
/*program nasumicno generise 1 ili 0 u matricu 4x4 i ispise u kojim prvim redu ima najvise jedinica
i u kojoj prvoj koloni ima najvise jedinica */

public class Zadatak3 
{
	private static Random randomGenerator; // static objekat randomGenerator
	
	public static void displayMatrix( int [][] a ) // metoda za ispisivanje matrice 
	{
		for ( int i = 0; i < a.length; i++ )
		{
			for ( int j = 0; j < a[0].length; j++ )
			{
				System.out.print( a[i][j] + " " );
			}
			System.out.println();
		}
	}
	
	//metoda za ispunjavanje matrice nasumicno sa 1 ili 0
	private static void fillMatrix( int [][] a ) 
	{
		randomGenerator =  new Random();
		
		for ( int i = 0; i < a.length; i++ )
		{
			for ( int j = 0; j < a[0].length; j++ )
			{
				int x = randomGenerator.nextInt(2);
				a [i][j] = x;
			}
		}
	}
	
	//metoda za brojanje jedinica u redu matrice, prima red parametar i vraca int
	public static int countRow( int [][] a, int row)
	{
		int counter = 0;
		for ( int i = row; i <= row ; i++ )
		{
			for ( int j = 0; j < a[row].length; j++)
			{
				if ( a[row][j] == 1 )
				{
					counter++;
				}
			}
		}
		return counter;
	}
	
	//metoda za brojanje jedinica u koloni prima kolonu kao parametar i vraca int
	public static int countColumn ( int [][] a, int column )
	{
		int counter = 0;
		for ( int i = 0; i < a.length; i++ )
		{
			for ( int j = column; j <= column ; j++)
			{
				if ( a[i][column] == 1 )
				{
					counter++;
				}
			}
		}
		return counter;
	}
	
	// metoda za ispisivanje reda sa najvise jedinica note ako ima red sa istim brojem jedinica index prvog reda se ispisuje
	public static void printLargestRow ( int [] [] a )
	{
		int [] largestRow = new int [4]; // niz za 4 elementa
		int rowIndex = 0;
		int temp = 0;
		for ( int i = 0; i < largestRow.length; i++ )
		{
			//smijestanje broj jedinica u niz Largest Row
			largestRow[i] = countRow(a, i);
			//ispitivanje na kojime indexu se nalazi najvisi broj jedinica
			if ( largestRow[i] > temp )
			{
				temp = largestRow[i];
				rowIndex = i;
			}
		}
		System.out.println( "\nThe largest row index: " + rowIndex );
	}
	
	//metoda za ispisivanje kolone sa najvise jedinica
	//prvi red sa najvise jedinica ce biti ispisan
	public static void printLargestColumn ( int [][] a)
	{
		int [] largestColumn = new int [4]; // novi niz od 4 elementa
		int columnIndex = 0;
		int temp = 0;
		for ( int i = 0; i < largestColumn.length; i++ )
		{
			//LargestColumn postaje count jedinica iz Matrice
			largestColumn[i] = countColumn(a, i);
			//ispitivanje na kojem indexu se nalazi najvisi broj jedinica
			if ( largestColumn[i] > temp )
			{
				temp = largestColumn[i];
				columnIndex = i;
			}
		}
		System.out.println( "\nThe largest column index: " + columnIndex );
	}
	
	public static void main(String[] args) 
	{
		int [][] matrix  = new int [4] [4];
		
		fillMatrix(matrix);
		displayMatrix(matrix);
		printLargestRow(matrix);
		printLargestColumn(matrix);

	}

}
