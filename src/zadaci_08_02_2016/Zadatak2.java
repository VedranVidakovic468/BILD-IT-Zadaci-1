package zadaci_08_02_2016;

import java.math.BigDecimal;
import java.math.BigInteger;

/*
 *  (Square numbers) Find the first ten square numbers that are greater than Long.MAX_VALUE. A square number is a 
 *  number in the form of n2. For exam- ple, 4, 9, and 16 are square numbers. Find an efficient approach to run your program fast.
 */
public class Zadatak2
{

	public static void main(String[] args)
	{
		// deklarisanje long promjenljive 
		long start = ( long ) Math.sqrt( Long.MAX_VALUE );// long start je korijen Long.Max_Value
		
		//BigDecimal postaje Long.Max_Value
		BigDecimal maxLongValue = new BigDecimal( start );
		BigDecimal maxLongComparator =  new BigDecimal( start );
		
		int counter = 1;// brojac za ispis i izlaz iz loopa
		while ( counter < 11 )
		{
			//squared je maxLongValue * maxLongValue
			BigDecimal squared =  maxLongValue.multiply(maxLongValue);
			if ( squared.compareTo(maxLongComparator) > 0 ) // ako je squared veci od komperatora
			{
			System.out.println( counter + ". " + maxLongValue + " * " + maxLongValue + " = " + squared);
			counter++;
			}
			//povecavamo maxLongValue tj. korijen od Long.MAX_Value za jedan
			maxLongValue = maxLongValue.add(new BigDecimal(1));
		}
		
	
	
            
		}
	}


