package zadaci_27_01_2016;

public class Zadatak3 
{
	public static int reverse( int number )
	{
		int num = 0; 
		while ( number != 0 ) //loop koji okrene broj
		{
			num = num * 10;
			num = num + number % 10; // ostatak unesenog broja ide na poziciju 1 nvog broja
			number /= 10;
		}
		return num ;  //vraca ispisani  broj unazad
	}

	public static boolean isPrime( int n ) // metoda koja vraca Prost broj
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
			prost = true;
		}
		// vrati boolean true
		return prost;		
	}
	
	public static boolean isEmirp( int num ) 
	{
		 if ( isPrime(num) && isPrime(reverse(num)) ) // uslov dal je broj prost is kad je obrnut
		 {
			 return true; // ako jest vrati boolean true
		 }
		 else return false; // u drugom slucaju boolean false
	}
	
	

	public static void main(String[] args)
	{
		
		int brojac = 0; // brojac za ispis i izlaz iz loopa
		
		for ( int i = 2; i < 10000; i++ )
			if ( isEmirp(i) ) // pozivanje metode isEmirp
			{
				System.out.print( i+" " ); // ako je metoda ispunjena ispisi i
				brojac++;
				if ( brojac%10 == 0) // prelazak u novi red
				{
					System.out.println();
				}
				if ( brojac == 100 ) // nakon 100 ispisa izadji iz loopa
				{
					break;
				}
			}
		
	}

}
