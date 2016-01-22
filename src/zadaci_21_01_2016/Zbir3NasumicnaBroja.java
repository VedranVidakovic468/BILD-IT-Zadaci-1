package zadaci_21_01_2016;

import java.util.Random;
import java.util.Scanner;

public class Zbir3NasumicnaBroja
{

	public static void main(String[] args) 
	{
		Random randomGenerator = new Random(); //Random objekat za generisanje nasumicnih cifara
		Scanner unos = new Scanner (System.in); // Scanner objekat za unos
		 
		int a = 1+randomGenerator.nextInt(10); // generisanje 3 nasumicna broja od 1 do 10
		int b = 1+randomGenerator.nextInt(10);
		int c = 1+randomGenerator.nextInt(10);
		
		System.out.println("Koji je zbir od "+a+" + "+ b + " + " +c);
		
		int sum = a + b + c; // suma tri nasumicna broja
		int odgovor = 0;
		
		while ( odgovor != sum ) // upit korisnika za odgovor
		{
			odgovor = unos.nextInt();
				if ( odgovor == sum ) // ukoliko je odgovor tacan ispis i izlaz iz loopa
				{
					System.out.println("Cestitamo unijeli ste tacan rezultat");
					break;
				}
			// ukoliko netacan odgovo korisnik se pita za ponovni pokusaj
			System.out.println("Odgovor je netacan pokusaj ponovo"); 
		}
		
	}

}
