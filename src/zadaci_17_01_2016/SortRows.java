package zadaci_17_01_2016;

import java.util.Scanner;

public class SortRows 
{
	static Scanner unos = new Scanner(System.in);

	public static void prikaziMatricu( double [][] m ) // metoda za prikaz matrice
	{
        for ( int i = 0; i < m.length; i++ )
        {
            for ( int j = 0; j < m[i].length; j++ ) 
            {
                System.out.printf("%2.3f ", m[i][j]); // format prinatanja za 3 decimalna mjesta
            }
            System.out.println("");
        }
    }
	
    public static double[][] sortRows(double[][] m) //metoda za sortiranje matrice prima argumenat matricu double
    {
    	double [][] sortedRows = new double [m.length][m[0].length]; // nova matrica
    	
    	for( int i = 0; i < m.length; i++ )
    		for (int j = 0; j < m.length; j++ )
    		{
    			sortedRows[i][j] = m[i][j]; // smijestamo vrijednost iz prosljedjene matrice u novu matricu
    		}
    	
    	//sortiranje redova
    	for ( int i = 0; i < sortedRows.length; i++ )
    	{
    		for ( int j = 0; j < sortedRows[0].length - 1; j++ )
    		{
    			double currentMin = sortedRows[i][j];
    			int minIndex = j;
    			for ( int column = j+1; column <sortedRows[0].length; column++ )
    			{
    				if ( currentMin > sortedRows[i][column] )
    				{
    					currentMin = sortedRows[i][column];
    					minIndex = column;
    				}
    			}
    			
    			if ( minIndex != j )
    			{
    				sortedRows[i][minIndex] = sortedRows[i][j];
    				sortedRows[i][j] = currentMin;
    			}
    		}
    	}
    	return sortedRows;
    }
	
    public static void ispuniMatricu( double [][] m ) // metoda za ispis matrice
    {
    	for ( int i = 0; i < m.length; i++ )
    	{
    		for ( int j = 0; j <m[0].length; j++ )
    		{
    			m[i][j] = unos.nextDouble();
    		}
    	}
    }
    
	public static void main(String[] args)
	{
	
	double [][] m = new double[3][3];
	System.out.println("Unesite vrijednosti u matricu: ");
	ispuniMatricu(m);
	
	double [][] sorted = sortRows(m);
	prikaziMatricu(sorted);
	
	}
}
	
	
