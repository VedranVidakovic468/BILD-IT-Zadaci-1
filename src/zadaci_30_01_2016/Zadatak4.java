package zadaci_30_01_2016;

import java.util.Date;

public class Zadatak4 
{
	public static void displayDateTime() // metoda za vracanje trenutacnog vremena i datuma
	{
		Date d = new Date(System.currentTimeMillis()); // Date klasa sa argumentom System.currentTimeMillis
		// ispis objekta d Date klase
		System.out.println(d);
	}
	
	public static void main(String[] args) 
	{
		displayDateTime();
		
	}

}
