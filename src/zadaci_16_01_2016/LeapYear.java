package zadaci_16_01_2016;

public class LeapYear 
{

	public static void main(String[] args) 
	{
		
		int year = 101; //start godina
		int brojac = 0;
		
		for ( year = 101; year < 2101; year++)
		{
			if ( (year % 4 == 0) && (year % 100 != 0) ) //uslov dal je prijestupna godina
			{
				System.out.print(year + " ");
				brojac++;
				if ( brojac%10 == 0 ) // pprebacuje u novi red nakon 10 ispisivanja
				{
					System.out.print("\n \n");
				}
			}
			else if ( year % 100 == 0 ) //uslov dal je prijestupna godina
			{
				System.out.print(year + " ");
				brojac++;
				if ( brojac%10 == 0 )
				{
					System.out.print("\n \n");
				}
			}

		}
		
		System.out.println("Ukupno prijestupnih godina od 101 do 2100 godine ima "+ brojac);

		
	}

}
