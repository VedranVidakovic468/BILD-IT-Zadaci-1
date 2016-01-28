package zadaci_17_01_2016;

public class ProstiBrojevi 
{
	// start nemoze biti jedan, program se zavrsava ako je start 1
	public static void prikaziProsteBrojeve(int start, int end, int nPerLine) 
	{
		int printCounter = 0; // brojac ispisa

		for ( int i = start; i < end; i++ ) // StartCopyCode source http://www.java-examples.com/prime-numbers-java-example
		{
			if ( start == 1 ) // ako je pocetak 1 izlazi iz programa jer prost broj nije jedan
			{
				System.out.println("Broj 1 nije validan pocetak");
				break;
			}
			boolean prost = true;
			for ( int j = i -1; j > 1; j--)
			{
				if ( i%j == 0 )
				{
					prost = false;
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
			
		} // EndCopyCode I Ahmed understand this code
	}
	public static void main(String[] args)
	{
		
		prikaziProsteBrojeve(2, 50, 3);
	}

}
