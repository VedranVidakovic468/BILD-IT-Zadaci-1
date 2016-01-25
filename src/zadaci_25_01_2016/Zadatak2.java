package zadaci_25_01_2016;

public class Zadatak2 
{
	// metoda prima 3 argumenta pocetak , kraj i koliko po liniji da stampa
	public static void prikaziProsteBrojeve(int start, int end, int nPerLine) // metoda za ispis prostih brojeva
	{
		int printCounter = 0; // brojac ispisa

		for ( int i = start; i <= end; i++ )
		{
			if ( start == 1 ) // ako je pocetak 1 izlazi iz programa jer prost broj nije jedan
			{
				System.out.println("Broj 1 nije validan pocetak");
				break;
			}
			boolean prost = true;
			for ( int j = i -1; j > 1; j--) // ako je broj djeljiv sa jos nekim brojim osim samim sobom
			{								// onda nije prost broj
				if ( i%j == 0 )
				{
					prost = false; // prost je false
				}
			} 
			if (prost) // ako je prost broj ispisi ga
				{
					System.out.print(i+ " ");
					printCounter++;
					if ( printCounter%nPerLine ==  0 )
						{
						System.out.println(); //predji u novi red
						}
				}
			
		}
	}
	public static void main(String[] args)
	{
		prikaziProsteBrojeve(2, 1000, 8);

	}

}
