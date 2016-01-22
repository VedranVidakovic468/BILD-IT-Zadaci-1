package zadaci_21_01_2016;

import java.util.Scanner;

public class DaniUMjesecu 
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
		int mjesecUnos = unos.nextInt(); // unos mjeseca
		
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
		
		
		if ( mjesecUnos == 2 && isPrijestupnaGodina(godina) ) // pozivanje metode
		{
			dani[mjesecUnos] = 29;
		}
		
		//ispis
		System.out.println(mjesec[mjesecUnos]+" "+godina+" ima "+dani[mjesecUnos]+ " dana");

	}

}
