package zadaci_15_01_2016;

import java.util.Scanner;

public class Samoglasnici {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite recenicu");
		
		String recenica = input.nextLine(); //unosimo string
		
		char [] samoglasnici = recenica.toCharArray(); // stavljamo string u char niz
		
		int smg = 0; //brojac samoglasnika
		int spc = 0; // brojac praznih mjesta 'Space'
		for ( int j = 0; j < samoglasnici.length; j++ ) 										
		{
			char ch = samoglasnici[j]; //charakter dobiva vrijednost od prvog indexa rijeci
			if ( ch == ' ')  //provjera dal je prazno mjesto
			{
				spc++;
			}
			//provjera dal je slovo samoglasnik
			if ( (ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'o') || (ch == 'u') )		
			{
				smg++;
			}
		}
		
		int ukupanBrojSlova = recenica.length(); //ukupan broj slova iz recenice koju smo unijeli
		int suglasnici = ukupanBrojSlova - smg - spc; // ukupan broj suglasnika
		System.out.println("Samoglasnika u recenici ima: "+smg+" a suglasnika "+ suglasnici);
	}

}
