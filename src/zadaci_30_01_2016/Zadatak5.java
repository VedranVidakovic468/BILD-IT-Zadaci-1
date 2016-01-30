package zadaci_30_01_2016;

import java.util.Scanner;

public class Zadatak5 
{
	// koriscen Halimov primjer i https://www.youtube.com/watch?v=5TIUbp9_xvM

	public static void main(String[] args) 
	{
		Scanner unos =  new Scanner(System.in); // scanner objekat za unos

		int size = unos.nextInt();
	 
		for ( int row = 1; row <= size; row++ ) // prvi loop se vrti zavisno od unosa
		{
			// space = size - row, znaci ako je unos 7 prvi red praznih mjeseta je 6
			for ( int j = 1; j <= size - row; j++ )
			{
				System.out.print("   "); // 3 spaces
			}
			// sa lijeve strane column treba da se smanjuje
			for ( int column = row; column >= 1; column-- ) 
			{
				System.out.print( "  " + column );
			}
			// sa desne strane column treba da raste
			for ( int column = 2; column <= row; column++ )
			{
				System.out.print( "  " + column );
			}
			System.out.println(); // novi red
		}
	}
		
}


