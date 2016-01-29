package zadaci_29_01_2016;

import java.util.Random;
import java.util.Scanner;

public class Zadatak2 
{

	public static void main(String[] args) 
	{
		Scanner unos = new Scanner(System.in); //Scanner objekat za unos
		Random randomGenerator = new Random(); // Random Generator za generisanje nasumicnih brojeva
		
		//deklarisanje konstanti
		final int PAPIR = 0; 
		final int BUNAR = 1;
		final int MAKAZE = 2;
		
		int [] igrica = { PAPIR, BUNAR, MAKAZE };
		//game status 
		String [] gameStatus = { "Pobjeda", "Poraz", "Nerijeseno" };
		
		// unos broja od korisnika brojevi se unose izmedju 0-2
		System.out.println( "Unesite broj od 0-2 0 je papir" );
		int index = unos.nextInt();
		
		// igrac i  protivnik prima vrijednost bunara, makaze ili papir
		int igrac = igrica[index];
		int protivnik = igrica[randomGenerator.nextInt(3)];
		
		String Status = "";
		

			//ispitivanje igraca i protivnika
			if ( igrac == PAPIR && protivnik == BUNAR )
			{
				Status = gameStatus[0];
			}
			else if ( igrac == PAPIR && protivnik == MAKAZE )
			{
				Status = gameStatus[1];
			}
			else if ( igrac == PAPIR && protivnik == PAPIR)
			{
				Status = gameStatus[2];
			}
			else if ( igrac == BUNAR && protivnik == MAKAZE )
			{
				Status = gameStatus[0];
			}
			else if ( igrac == BUNAR && protivnik == PAPIR )
			{
				Status = gameStatus[1];
			}
			else if ( igrac == BUNAR && protivnik == BUNAR )
			{
				Status = gameStatus[2];
			}
			else if ( igrac == MAKAZE && protivnik == PAPIR )
			{
				Status = gameStatus[0];
			}
			else if ( igrac == MAKAZE && protivnik == BUNAR )
			{
				Status = gameStatus[1];
			}
			else if ( igrac == MAKAZE && protivnik == MAKAZE )
			{
				Status = gameStatus[2];
			}
		
		//ispis game Status dal je pobjeda, poraz ili nerijeseno
		System.out.println(Status);
	}

}
