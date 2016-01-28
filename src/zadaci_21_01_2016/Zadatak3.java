package zadaci_21_01_2016;

import java.util.Scanner;

public class Zadatak3
{
	public static boolean isPrijestupnaGodina(int godina) // ispitivanje godine dal je prijestupna ili nije
	{
		  if  (( godina % 4 == 0 ) && ( godina % 100 != 0 )) return true;
	        if  ( godina % 400 == 0 ) return true;
	        return false;
	}

	public static void main(String[] args) 
	{
		Scanner unos = new Scanner (System.in); // Scanner objekat za unos
		
		System.out.println("Unesite mjesec za koji zelite provjerit dane ");
		String mjesecUnos = unos.next(); // unos mjeseca unos treba bude prva 3 slova mjeseca
		// unos prima i malo i veliko slovo kao prvo
		String capitalLetter = mjesecUnos.substring(0,1).toUpperCase(); //konvertovanje prvog slova u uppercase
		mjesecUnos = capitalLetter+mjesecUnos.substring(1,mjesecUnos.length()); //uppercase letter se dodaje na pocetak

		
		System.out.println("Unesite godinu: ");
		int godina = unos.nextInt(); // unos godine
		
		int[] dani =  // dani[i] = broj dana u mjesecu i, prvi index je 0 tako kad je unos 1 bude 31 dana
		    	{
		        0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
		    	};
		
		String[] mjesec = //Mjesec[i] = ime mjeseca za mjesecUnoos
			{
	            "",                               // prvi prazan tako da je Jan = 1;
	            "Januar", "Februar", "Mart",
	            "April", "Maj", "Juni",
	            "Juli", "August", "Septembar",
	            "Oktobar", "Novembar", "Decembar"
	        };
		
		if ( mjesecUnos.equals(mjesec[2].substring(0, 3)) && isPrijestupnaGodina(godina) ) // pozivanje metode
		{
			dani[2] = 29;
		}	
		
		int index = 0;
		for ( int i = 1; i < mjesec.length; i++ ) // loop za uzimanje indexa kako bi nasli dane za trazeni mjesec
		{
			if ( mjesecUnos.equals( mjesec[i].substring( 0, 3 ) ) )
			{
				index = i;
			}
		}

		System.out.println(mjesecUnos+" "+godina+" ima "+dani[index]+" dan");
		


	}

}
