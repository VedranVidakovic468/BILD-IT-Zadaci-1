package zadaci_30_01_2016;

import java.util.Scanner;

public class Zadatak3
{

	public static void main(String[] args) 
	{
		Scanner unos = new Scanner (System.in); // scanenr objekat za unos
	
		boolean isValid = false; // inicijalizacija boolean isValid to false
		
		while ( isValid == false )// dok je unos pogresan loop se ponavlja
		{
			System.out.println( "Unesite Social Security Number (SSN) u formatu DDD-DD-DDDD");
			String socialSecurityNum = unos.next(); // unos stringa
			char niz [] = socialSecurityNum.toCharArray(); // string to char array
			int dashes = 0; // brojac minusa
			int numbers = 0; // brojac brojeva
			for ( int i = 0; i < socialSecurityNum.length(); i++ )
			{
				char x = niz[i]; // stavljanje pojedinacnih karaktera iz niza u x
				if ( ( ( int ) x ) == 45 ) // ako je x ascii == 45 tj minus
				{
					if ( i == 3 || i == 6 ) // ako je na poziciji 3 ili 6
					{
						dashes++; // povecaj brojac
					}
				}
				// ako je x ascii izmjedju 48 i 57 onda je broj i povecaj brojac
				if ( ( ( int ) x ) > 47 && ( ( int ) x ) < 58 )
				{
					numbers++;
				}
			}
		
			if ( dashes == 2 && numbers == 9 ) // ako string sadrza 2 minusa i 9 brojeva onda je validan unos
			{
				isValid = true;
				System.out.println( "Vas unos je tacan" );
			}
			else 
			{
				System.out.println( "Vas unos je pogresan pokusaj ponovo" );
				isValid = false;
			}		
		}
	}

}
