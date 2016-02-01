package zadaci_01_02_2016;

import java.util.Scanner;

public class Zadatak3 
{
	//koriscen prmjer sa http://stackoverflow.com/questions/31523419/java-print-a-short-as-binary-with-all-16-bits

	public static void main(String[] args) 
	{
		Scanner unos = new Scanner(System.in);//scanner objekat za unos
		
		short x = unos.nextShort();
		
		
		//String format je 16 duzina, Inteeger klasa metoda to BinaryString x i da se zamjene svi spaceovi sa 0
		// jer Integer.toBinaryString() vraca string i tako da se prazna mjesta moraju zamjenut sa 0
		System.out.println(String.format("%16s", Integer.toBinaryString(x)).replace(' ', '0'));
		//Ja Ahmed razumjem ovaj kod
	}

}
