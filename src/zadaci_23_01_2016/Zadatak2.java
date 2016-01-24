package zadaci_23_01_2016;

public class Zadatak2 
{

	public static void main(String[] args)
	{
		
		int start = 2; //pocinjemo od 2 jer 1 nije prost broj
		int prostBroj = 3;
		int br = 0; // brojac za ispis 10 po liniji
		for ( int i = start; i <= 10000; i++ )
		{
			boolean prost = true; // inicijalizacija booleana prost
			for ( int j = i -1; j > 1; j--)
			{
				if ( i%j == 0 ) // ako je j djeljivo sa jos nekim brojem osim samim sobom onda bolean false
				{
					prost = false;
				}
			} 
			if (prost)  // ako je prost broj idemo dalje
				{
				
				if ( (i-prostBroj) == 2 ) // ako je prost broj - predhodni prost broj == 2 ispisi ga
				{
					System.out.print(prostBroj+" "+i+" ");
					br++;
					if ( br%10==0 )
					{
						System.out.println();
					}
				}
				prostBroj = i; // zadnji prost broj postaje prost broj
				
				}
			
		}
	}

}
