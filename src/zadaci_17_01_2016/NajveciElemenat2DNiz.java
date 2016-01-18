package zadaci_17_01_2016;

import java.util.Scanner;

public class NajveciElemenat2DNiz {

	public static int[ ] locateLargest(double[ ][ ] a) // metoda vraca int niz
	{

		int index [] = new int[2];
		double maxValue = a[0][0];
		for ( int i = 0; i < a.length; i++ )
		{
			for ( int j = 0; j < a.length; j++)
			{
				if ( a[i][j] > maxValue ) // trazimo najvecu vriednost
				{
					maxValue = a[i][j];
					index[0] = i; // sacuvamo index i u niz index
					index[1] = j; // sacuvamo index j u niz index
				}
			}
		} return (int[])index;
	}
	
	public static void main(String[] args)
	{
		Scanner unos = new Scanner(System.in);
		
		double [][] a = new double [3][3];
		
		for ( int i = 0; i < a.length; i++ )
		{
			for ( int j = 0; j < a.length; j++ )
			{
				a[i][j] = unos.nextDouble(); // unos u matricu
			}
		}
		
		for ( int i = 0; i < a.length; i++ )
		{
			for ( int j = 0; j < a.length; j++ )
			{
				System.out.print(a[i][j]+" "); // ispis matrice
			}
			System.out.println();
		}
		
		
		int[] niz = locateLargest(a);
		// ispisivanje indexa najveceg clana pomocu metode
		System.out.println("\nIndexi najveceg claca u matrici je: "+niz[0]+" "+ niz[1]);
		
	}
}
