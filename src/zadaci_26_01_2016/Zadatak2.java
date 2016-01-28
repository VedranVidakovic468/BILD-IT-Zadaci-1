package zadaci_26_01_2016;

import java.util.Scanner;

public class Zadatak2 
{

	//ideja za rijesenje je source http://www.geekboots.com/java/lcm al 
	//je kod modificiran za ispunjavanje uslova zadatka
	public static int najveciDjelilac( int a, int b ) // metoda za najveci zajednicki djelilac vraca int
	{
		int maxDjelilac = 0;
		while ( a!=0 && b!=0) //ponavlja se sve dok je a i b nula
		{
			int c = b;
			b = a%b;
			a = c;		
		}
		return maxDjelilac = a +b; //najveci djlilac je a + b
	
		
    }
	
	public static int najmanjiDjelilac( int a, int b ) // metoda za najmanji djelilac vraca int
	{
		int minDjelilac = ( a / najveciDjelilac( a, b ) ) * b; // izracunavanje najmanjeg djelilca
		return minDjelilac; // vraca int
	}
	
	public static void main(String[] args) 
	{
		
		Scanner unos = new Scanner (System.in); // scanner objekat za unos
		System.out.println( "Unesite dva broja" ); // prompt za unos dva broja
		// int a i b za smijestanje unosa
		int a = unos.nextInt(); 
		int b = unos.nextInt();
		
		//ispis najveceg i najmanjeg zajdenickog djelilca
		System.out.println( "Najveci zajednicki djelilac je " + najveciDjelilac ( a ,b ) );
		System.out.println( "Najmanji zajednicki djelilac je " + najmanjiDjelilac( a, b ) ); // ispisivanje najmanjeg djelilca

	}

}
