package zadaci_03_02_2016;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak2
{
	private static Scanner unos;  // Class variable unos
	// Class variable counter koji sluzi pri ispisu matrice da ukaze na matric 1 ili 2 itd
	private static int counter = 1; 
	private static DecimalFormat df; // Class variable df

	// metoda za mnozenje matrica
	public static double[][] multiplyMatrix(double[][] a, double[][] b)
	{
		// nova matrica resultat
		double [][] resultMatrix = new double [a.length][a.length];
        for ( int i = 0; i < resultMatrix.length; i++ )
        {
            for ( int j = 0; j < resultMatrix.length; j++ )
            {
                for ( int k = 0; k < resultMatrix[0].length; k++ )
                {
                	// mnozenje indexa po semi ai1 * b1j + ai2 * b2j +...
                    resultMatrix[i][j] += a[i][k] * b[k][j];   
                }
            }
        }
        return resultMatrix;
    }
	
	// metoda za ispis matrice
	public static void displayMatrix ( double [] [] a )
	{
		df = new DecimalFormat("##.##"); // objekat df
		System.out.println( "Matrix "+counter);
		for ( int i = 0; i < a.length; i++ )
		{
			for ( int j = 0; j < a.length; j++ )
			{
				// formatiranje i ispis promjenljive double
				System.out.print( df.format( a[i][j] ) + " ");
			}
			System.out.println();
		}
		counter++;
		System.out.println();
	}
	
	// metoda za ispunjavanje matrice
	public static void fillMatrix ( double [] [] a )
	{
		unos = new Scanner(System.in); // scanner objekat unos
		for ( int i = 0; i < a.length; i++ )
		{
			for ( int j = 0; j < a.length; j++ )
			{
				a[i][j] = unos.nextDouble(); // unos elemenata u matricu tipa double
			}
		}
	}
	
	public static void main(String[] args) 
	{
		double [][] a = new double [3][3];
		double [][] b = new double [3][3];
		
		//unos u matricu 1
		System.out.println( "Enter Matrix1:");
		fillMatrix(a);
		
		//unos u matricu 2
		System.out.println( "Enter Matrix2:");
		fillMatrix(b);
		
		//matrica c je rezultat mnozenja a i b matrice
		double [][] c = multiplyMatrix(a, b);
		
		//ispis matrica a, b i c
		displayMatrix(a);
		displayMatrix(b);
		displayMatrix(c);

	}

}
