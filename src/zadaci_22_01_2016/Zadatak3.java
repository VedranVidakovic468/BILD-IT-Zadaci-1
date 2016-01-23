package zadaci_22_01_2016;

public class Zadatak3
{

	public static void main(String[] args) 
	{
		int br = 0; // brojac za redove, kad je 10 ide u novi red
		for ( int i = 100; i <= 1000; i++ )
		{
			if ( i%5==0 && i%6==0 ) // uslov ako je i djeljivo i sa 5 i sa 6
			{
				System.out.print(i+" "); // ako je uslov tacan ispisi i
				br++; // povecaj brojac za 1
				if ( br%10 == 0 ) // uslov ako je brojac djeljiv sa 10 i ostatak 0 predji u novi red
				{
					System.out.print("\n");
				}
			}	
		}

	}

}
