package zadaci_27_01_2016;

import java.util.Scanner;

public class Zadatak5 
{

	public static void main(String[] args) 
	{
		Scanner unos = new Scanner (System.in); // scanner objeakt za unos
		
		System.out.println( "Unesite cijenu za paket 1 " ); // upit za cijenu 1 paketa 1 tipa double
		double cijenaPaket1 = unos.nextDouble();
		
		System.out.println( "Unesite tezinu za paket 1 " ); // upit za tezinu 1 paketa 1 tipa double
		double tezinaPaket1 = unos.nextDouble();
		 
		System.out.println( "Unesite cijecu za paket 2 "); // upit za cijenu 2 paketa 2 tipa double
		double cijenaPaket2 = unos.nextDouble();
		
		System.out.println( "Unesite tezinu za paket 2"); // upit za tezinu 2 paketa 2 tipa double
		double tezinaPaket2 = unos.nextDouble();
		
		double cijenaGrama1 = cijenaPaket1 / tezinaPaket1; // izracunavanja cijene po gramu
		double cijenaGrama2 = cijenaPaket2 / tezinaPaket2;
		
		
		if ( cijenaGrama1 < cijenaGrama2 ) //uporedjivanje cijenna po gramu
		{
			System.out.println( "Paket 1 ima bolju cijenu");
		}
		else
		{
			System.out.println( "Paket 2 ima bolju cijenu ");
		}
	}

}
