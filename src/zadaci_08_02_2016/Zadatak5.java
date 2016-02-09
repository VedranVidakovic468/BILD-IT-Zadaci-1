package zadaci_08_02_2016;

import java.math.BigDecimal;
import java.math.BigInteger;

/*
 * (Divisible by 5 or 6) Find the first ten numbers greater than Long.MAX_VALUE that are divisible by 5 or 6.
 */

public class Zadatak5 
{

	public static void main(String[] args) 
	{
		long start = Long.MAX_VALUE; //inicijalizovanje long tipa podataka
		
		BigDecimal startDividend = BigDecimal.valueOf( start ); //djeljenik sa pocetnom vrijednoscu Long.MaxValue
		
		int counter = 1;
		System.out.println( "First 10 numbers that are greater than " + start + " and divisible by 5 or 6");
		while ( counter < 11 ) //counter = 11 izlazi iz loopa
		{
			//ispitivanje BigDecimal djeljenika dal je djeljiv sa 5 ili 6 ako da stampa se
			if ( startDividend.remainder( new BigDecimal( 5 ) ).equals( BigDecimal.ZERO ) 
					|| startDividend.remainder( new BigDecimal( 6 ) ).equals( BigDecimal.ZERO ) )
			{
				System.out.println( counter + ": " +startDividend );
				counter++;
			}
			startDividend = startDividend.add( BigDecimal.ONE ); //increment djeljenik za 1
		}

	}

}
