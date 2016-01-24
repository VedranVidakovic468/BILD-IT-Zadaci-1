package zadaci_23_01_2016;

public class Zadatak3 {

	public static void main(String[] args) {
		
		int br = 0; // brojac kombinacija
		int c = 2; // inicijalizacija drugog reda
		for ( int i = 1 ; i < 8; i++ )
		{
			for ( int j = c; j < 8; j++)
			{
				System.out.println(i+", "+j); // ispis kombinacija
				br++;
			}
			c++; // povecaj c uvjek za 1 vece od i, kombinacija nemoze biti 2, 2
		}

		System.out.println("Broj kombinacija je "+br);
	}

}
