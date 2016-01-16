package zadaci_16_01_2016;

import java.util.Scanner;
import java.util.Random;

public class NMatrica 
{
	static Random randomGenrator = new Random(); // random generator za generisanje random broja
	static Scanner unos = new Scanner(System.in); // scanner objekat za unos dimenzije matrice
	
	public static void printMatrix(int n) // metoda stampa matricu dimenzija primljene kao argumenat
	{
		int [][] matrica = new int[n][n];

		for ( int i = 0; i < matrica.length; i++ )
		{
			for ( int j = 0; j < matrica.length; j++ )
			{
				int x = randomGenrator.nextInt(2);
				matrica[i][j] = x; // matrica dobiva random ili 0 ili 1
			}
		}
		
		for ( int i = 0; i < matrica.length; i++ ) // ispisivanje matrice
		{
			for ( int j = 0; j < matrica.length; j++ )
			{
				System.out.print(matrica[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{

		System.out.println("Unesite dimenzije matrice: ");
		int a = unos.nextInt(); // unos dimenzije matrice
		printMatrix(a); // pozivanje metode
	}

}
