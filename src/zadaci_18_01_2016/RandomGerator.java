package zadaci_18_01_2016;

import java.util.Random;

public class RandomGerator 
{

	static Random randomGenerator = new Random(); // random generator objekat
	
	public static void get100RandomNumbers() // metoda za ispisivanje 100 nasumicnih brojeva
	{
		System.out.println("100 random numbers");
		for ( int i = 0; i < 100; i++ )
		{
			if ( i % 10 == 0)
			{
				System.out.println();
			}
			int x = randomGenerator.nextInt(101); // nasumicni brojevu teku od 0 do 100
			System.out.print(x+ " ");
		}
		
	}
	
	public static void get100RadnomUpperCase() // metoda za ispisivanje Upercase lettera
	{
		System.out.println("\n\n100 Random Upper Case letters");
		for ( int i = 0; i < 100; i++ )
		{
			if ( i % 10 == 0)
			{
				System.out.println();
			}
			int x = randomGenerator.nextInt(91-65)+65; // od 65 do 90 su uppercase Letters u ascii codu
			System.out.print((char)x+" "); // ispisivanje ascii uppercase
		}
	}
	
	// metoda za ispisivanje 100 nasumicnih brojeva i 100 nasumicnih uppercase letters
	public static void print100NumbersAndLetters() 
	{
		get100RandomNumbers();
		get100RadnomUpperCase();
	}
	public static void main(String[] args) 
	{
		print100NumbersAndLetters();

	}

}
