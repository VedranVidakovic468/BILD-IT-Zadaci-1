package zadaci_18_01_2016;

import java.util.Scanner;

public class RastaviBrojNaProsteFaktore 
{
	public static void primeFactors(int n)
	{
	    // Stampaj 2 sve dok se moze dijelit sa brojem 
	    while ( n%2 == 0 )
	    {
	        System.out.print((2+", "));
	        n = n/2;
	    }
	 
	    // n postaje neparan broj.  Preskacemo elemente na neparne (Note i = i +2)
	    for ( int i = 3; i <= Math.sqrt(n); i = i+2 )
	    {
	        // While i dijeli n, stampaj i dijeli n
	        while ( n%i == 0 )
	        {
	        	System.out.print(i+", ");
	            n = n/i;
	        }
	    }
	 
	    if ( n > 2 )
	    	System.out.print (n+".");
	}

	public static void main(String[] args) 
	{
		
		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite cijeli broj: ");
		int num1 = unos.nextInt();
		primeFactors(num1);

	}

}
