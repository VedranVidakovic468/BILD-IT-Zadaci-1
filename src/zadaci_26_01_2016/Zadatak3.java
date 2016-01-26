package zadaci_26_01_2016;

public class Zadatak3 
{

	public static int isPrime( int n ) // metoda koja vraca Prost broj
	{
		boolean prost = true; // inicijalizacija prost = true
		int prostBroj = 0; // inicijalizacija prostroj = 0
		for ( int j = n -1; j > 1; j-- ) // provjera dal je prost broj
		{
			if ( n%j == 0 ) // ako je broj n djeljiv sa jos nekim brojem osim samim sobom onda prost = false
			{
				prost = false;
			}
		} 
		// ako n broj samo djeljiv sam sa sobom onda je prost
		if ( prost ) 
		{
			prostBroj = n;
		}
		// vrati prost broj
		return prostBroj;		
	}
	
	public static void main(String[] args) 
	{
		int br = 0; // brojac za ispis 10 po liniji
		for ( int i = 2; i < 10000; i++ ) // start od 2 jer 1 je slozen broj
		{
			if ( isPrime( i ) != 0 ) // pozivanje metode isPrime i ako je razlicito od 0
			{
				System.out.print( i + " " ); // ispis prostog broja
				br++;
				if ( br%10 == 0 ) // nakon 10 ispisa predji u novi red
				{
					System.out.println();
				}
			}
		}	
	}

}


