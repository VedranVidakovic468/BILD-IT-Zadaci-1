package zadaci_16_01_2016;

import java.util.Random;
import java.util.Scanner;

public class DivisorQuiz {

	static Random randomGenerator = new Random(); // radnom objekat za generisanje random brojeva
	static Scanner input = new Scanner(System.in); // scaner objekat za unos
	
	
	public static void quiz(int q) //quiz prima argumenat int za koliko pitanja da generise
	{
		int result; // resultat za uporedjivanje sa odgovorom strane korisnika
		int num1, num2; // num1 i num2 gdje se smijesta random broj
		int odgovor; // unos za scanner objekat
		int brojacTacnih = 0; // brojac tacnih odgovora
		for ( int i = 0; i < q; i++) // argumenat iz metode je ovdje ogranicenje
		{
			num1 = randomGenerator.nextInt(11); // random broj je ogranicen od 0 do 10
			num2 = randomGenerator.nextInt(11);
			result = num1 - num2;
			System.out.println("Koliko je " + num1 + " - "+ num2 + " ?");
			odgovor = input.nextInt();
			if ( odgovor == result ) // provjera dal je unos isti kao resultat
			{
				brojacTacnih++;
			}
		}
		System.out.println("Broj tacnih odgovora je "+ brojacTacnih + " , a " + (q-brojacTacnih)+
				" netacan ." );
	}
	public static void main(String[] args) {
		
		quiz(4);
		

	}

}
