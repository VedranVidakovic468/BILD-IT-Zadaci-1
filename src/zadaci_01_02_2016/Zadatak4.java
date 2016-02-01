package zadaci_01_02_2016;

import java.text.DecimalFormat;

public class Zadatak4 
{
	public static String format(int number, int width)
	{
		String zero = "0"; // inicijalizacija stringa zero
		String pattern = ""; //inicijalizacija stringa pattern
		for ( int i = 0; i < width; i++ )
		{
			pattern += zero; // dodavanje nula na string pattern
		}
		DecimalFormat formatter = new DecimalFormat(pattern); //objekat formatter prima argumenat pattern
		
		return formatter.format(number); // vracanje formatiranog stringa
	}
	public static void main(String[] args)
	{
		
		//ispis formatiranog stringa
		System.out.println(format(34,1));

	}

}
