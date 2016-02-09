package zadaci_08_02_2016;

import java.math.BigInteger;

/*
 *  (Large prime numbers) Write a program that finds five prime numbers larger than Long.MAX_VALUE.
 */

public class Zadatak3
{

	public static void main(String[] args) 
	{
                                  
		long start = Long.MAX_VALUE; //deklarisanje long promjenljive
		//dodjeljivanje Long.Max u BigInteger prime 
		BigInteger prime = BigInteger.valueOf( Long.MAX_VALUE );
		int counter = 1;
		System.out.println( "5 prime Numbers larger than "+ start);
		while ( counter < 6 ) //counter == 6 izlazi iz loopa
		{
			if ( prime.isProbablePrime( 0 ) ) //metoda isProbablePrime klase BigInteger provjerava broj dal je prost
			{
				System.out.println( counter + ".  " + prime );
				counter++;
			}
			prime = prime.add( BigInteger.ONE );
		}
	}

}


