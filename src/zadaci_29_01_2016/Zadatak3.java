package zadaci_29_01_2016;

public class Zadatak3 
{

	public static void main(String[] args) 
	{
		double sum = 0; // inicijalizacija sum
		double j = 1; // inicilizacija djelilca
		for ( double i = 1; i <= 97; i += 2 ) // for loop od i 1 do i =97 i 
		{
			j += 2; //djelilac raste za +2 pa je 3,5,7,9...
			sum +=  (i / j);
		}

		System.out.println(sum);
	}

}
