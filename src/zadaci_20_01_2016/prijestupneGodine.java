package zadaci_20_01_2016;

import java.util.Scanner;

public class prijestupneGodine 
{

	public static void main(String[] args) 
	{
		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite pocetnu godinu");
		int start = unos.nextInt(); //start godina
		
		System.out.println("Unesite Krajnu godinu");
		int end = unos.nextInt(); // end godina
		int brojac = 0;
		
		for ( start = start; start <= end; start++)
		{
			if ( (start % 4 == 0) && (start % 100 != 0) ) //uslov dal je prijestupna godina
			{
				System.out.print(start + " ");
				brojac++;
				if ( brojac%10 == 0 ) // pprebacuje u novi red nakon 10 ispisivanja
				{
					System.out.print("\n \n");
				}
			}
			else if ( start % 100 == 0 ) //uslov dal je prijestupna godina
			{
				System.out.print(start + " ");
				brojac++;
				if ( brojac%10 == 0 )
				{
					System.out.print("\n \n");
				}
			}

		}
	}
}
