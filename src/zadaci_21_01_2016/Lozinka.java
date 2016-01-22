package zadaci_21_01_2016;

import java.util.Scanner;

public class Lozinka 
{

	public static void main(String[] args)
	{
		
		Scanner input = new Scanner (System.in);
		
		String a,b;
		
		System.out.println("Unesite Lozinku: "); // trazi se unos lozinke
		a = input.nextLine();
		
		System.out.println("Potvrdite Lozinku: "); // trazi se potvrda lozinke
		b = input.nextLine();
		
		int upperCase = 0; // brojac velikih slova
		int special = 0; // brojac brojeva
		
		char [] password = a.toCharArray(); // lozinka ide u char niz
		
		for ( int i = 0; i < password.length; i++ )
		{
			char ch = password[i];  // ispitivanje karaktera pojedinacno
				if( Character.isUpperCase(ch) )		// ako je karakter veliko slovo
				{
					upperCase++;
				}
				if( Character.isDigit(ch) )		// ako je karakter broj
				{
					special++;
				}
		}

		// lozinka je samo dobra ako ste potvrdili unos, ako je veca od 8 karaktera, ima 2 broja i 
		//barem jedno veliko slovo
		if ( a.length() >7 && a.equals(b) && special > 1 && upperCase > 0 )
		{
			System.out.println("Lozinka je dobra");
			
		}else System.out.println("Napravili ste gresku");
		
	}

}
