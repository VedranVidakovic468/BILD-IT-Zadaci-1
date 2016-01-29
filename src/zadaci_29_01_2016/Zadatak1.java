package zadaci_29_01_2016;

import java.util.Random;

public class Zadatak1 
{

	public static void main(String[] args)
	{
		//random objekat za generisanje nasumicnih brojeva
		Random randomGenerator = new Random();
		
		//niz string
		String [] mjeseci = {"", "Januar", "Februar", "Mart", "April", "Maj",
				"Juni", "Juli", "August", "Septembar", "Oktobar", "Novembar", "Decembar"};
		
		//int index nasumicnih broj
		int index = 1+randomGenerator.nextInt(12);
		
		//ispis nasumicnog mjeseca
		System.out.println(mjeseci[index]);
	}

}
