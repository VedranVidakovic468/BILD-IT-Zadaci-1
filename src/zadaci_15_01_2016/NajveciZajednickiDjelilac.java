package zadaci_15_01_2016;

import java.util.Scanner;

public class NajveciZajednickiDjelilac {
	
	public static Scanner unos;
	
	public static void najveciDjelilac(int a, int b) 
	{
		while ( a!=0 && b!=0) //ponavlja se sve dok je a i b nula
		{
			int c = b;
			b = a%b;
			a = c;		
		}
		int maxDjelilac = a +b; //
		System.out.println("Najveci djelilac je "+maxDjelilac);
		
    }
	public static void main(String[] args) {
		
		unos = new Scanner(System.in);
		
		System.out.println("Unesite dva broja");
		int a = unos.nextInt();
		int b = unos.nextInt();
		
		najveciDjelilac(a, b);

	}

}
