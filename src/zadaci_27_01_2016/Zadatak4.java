package zadaci_27_01_2016;

public class Zadatak4 
{
	public static int reverse(int number)
	{
		int num = 0; 
		while ( number != 0 ) //loop koji okrene broj
		{
			num = num * 10;
			num = num + number % 10; // ostatak unesenog broja ide na poziciju 1 nvog broja
			number /= 10;
		}
		return num; //vraca broj unazad
	}
	
	public static boolean isPalindrome(int number) // metoda za provjeru polindrom broja
	{
		if ( number == reverse(number) ) // ako je broj isti kao i naopako onda vraca true
		{
			return true;
		}
		else return false; // ako nije polindrom
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

	public static void main(String[] args) 
	{
		
		int brojac = 0; // brojac za redove i izlaz iz loopa
		
		for ( int i = 10; i < 100000; i++ ) // i krece od 10 jer Polindrom broj je makar dvije cifre
		{
			if ( isPrime(i) && isPalindrome(i) ) // pozivanje metoda dal je prost broj i dal je Palindrome
			{
				System.out.print( i+" " ); // ispis broja i
				brojac++; // brojac ++
				if ( brojac%10 == 0 ) // predji u novi red nakon 10 ispisa
				{
					System.out.println();
				}
				if ( brojac == 100 ) // izadji iz loopa nakon 100 ispisa
				{
					break;
				}
			}
		}

	}

}
