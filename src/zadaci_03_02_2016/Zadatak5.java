package zadaci_03_02_2016;

import java.util.Random;
/*
 * program nasumicno generise jedinice i nule u matricu 6x6 i provjerava dal u redovima ima paran ili neparan broj jedinica
 * 
 */
public class Zadatak5 
{
	private static Random randomGenerator; // random objekat randomGenerator
	
	public static void displayMatrix ( int [][] m ) // metoda za ispisivanje matrice
	{
		for ( int i = 0; i < m.length; i++ )
		{
			for ( int j = 0; j < m[0].length; j++ )
			{
				System.out.print( m[i][j] + " " );
			}
			System.out.println();
		}
	}
	
	public static void fillMatrix ( int [][] m ) // metoda za ispunjavanje amtrice
	{
		randomGenerator = new Random();
		for ( int i = 0; i < m.length; i++ )
		{
			for ( int j = 0; j < m[0].length; j++ )
			{
				m[i][j] = randomGenerator.nextInt(2);
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
	public static int countColumn ( int [][] m, int column )
	{
		int counter = 0;
		for ( int i = 0; i < m.length; i++ )
		{
			for ( int j = column; j <= column ; j++)
			{
				if ( m[i][column] == 1 )
				{
					counter++;
				}
			}
		}
		return counter;
	}
	
	public static void printCheckedColumns ( int [][] m ) // metoda za ispisivanje dal kolona sadrzi parni ili neparni broj jedinica po koloni
	{
		int [] checkCol = new int [6]; // niz od 6 elemenata
		for ( int i = 0; i < checkCol.length; i++ )
		{
			checkCol[i] = countColumn( m, i ); // counter jedinica svake kolone ide u niz
			if ( checkCol[i] % 2 == 0 && checkCol[i] != 0 ) // ispitivanje countera dal je paran broj ili neparan i da je != 0
			{
				System.out.println( "Column# " + i + " has a even number of 1s");
			}
			else System.out.println( "Column# " + i + " has a odd number of 1s");
		}
	}
	
	public static void printCheckedRows ( int [][] m ) // metoda za ispitivanje dal red sadrzi parni ili neparni broj jedinica po redu
	{
		int [] checkRow = new int [6]; // niz od 6 elemenata
		for ( int i = 0; i < checkRow.length; i++ )
		{
			checkRow[i] = countRow( m, i ); // counter jedinica svakog reda ide u niz
			if ( checkRow[i] % 2 == 0 && checkRow[i] != 0 ) // ako je counter paran broj onda red sadrzi paran broj jedinica 
			{
				System.out.println( "Row# " + i + " has a even number of 1s");
			}
			else System.out.println( "Row# " + i + " has a odd number of 1s");
		}
	}

	public static void main(String[] args) 
	{
		int matrix [][] = new int [6][6];
		
		fillMatrix(matrix);
		displayMatrix(matrix);
		printCheckedColumns(matrix);
		printCheckedRows(matrix);

	}

}
