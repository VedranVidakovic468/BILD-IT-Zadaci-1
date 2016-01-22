package zadaci_21_01_2016;

public class SavrsenBroj {
	
	public static boolean isSavrsenBroj( int broj )
	{
		int djelilac = 0; // inicijalizacija djelilaca
		
		for ( int i = 1; i <= (broj / 2); i++ )
		{
			if ( broj%i == 0) // ako je broj djeljiv sa i
			{
				djelilac += i; // zbir djelilaca
			}
		}
		
		if ( djelilac == broj ) // ako je broj jednak djelilcu
		{
			return true;
		}
		else return false;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Savrseni brojevi od 0 do 10.000:");
		// ispis savrsenih brojeva
		for ( int i = 0; i <= 10000; i++ )
		{
			if ( isSavrsenBroj(i) ) // pozivanje metode i ispitivanje dal se radi o savrsenom broju
			{
				System.out.print(i+" ");
			}
		}

	}

}
