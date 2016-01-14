import java.util.Scanner;
import java.awt.*;


//Super Klasa Kalendar
public class Kalendar {
	
	Scanner unos = new Scanner (System.in); //Scanner objekat za unos
	
	private static int godina;
	
	private static int mjesecUnos; //mjesecUnos je i od Mjesec niza
	
	private static String[] mjesec = //Mjesec[i] = ime mjeseca za mjesecUnoos
		{
            "",                               // prvi prazan tako da je Jan = 1;
            "Januar", "Februar", "Mart",
            "April", "Maj", "Juni",
            "Juli", "August", "Septembar",
            "Oktobar", "Novembar", "Decembar"
        };
	
   int[] dani =  // dani[i] = broj dana u mjesecu i
    	{
        0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    	};
    
	Kalendar() //iniciajalizacija
	{
		System.out.println("Unesite godinu");
		setGodina();
		
		System.out.println("Unesite mjesec");
		setMjesec();
		
		if ( mjesecUnos == 2 && isPrijestupnaGodina(godina) )
		{
			dani[mjesecUnos] = 29;
		}
		
		prikaziNaslovDatuma();
		
		int d = dan( 1, mjesecUnos, godina );
		
		for ( int i = 0; i < d; i++ )
		{
			System.out.print("   ");	
		}
		
		for ( int i = 1; i < dani[mjesecUnos]; i ++ )
		{
			System.out.printf( "%2d ", i );
            if ((( i + d ) % 7 == 0 ) || ( i == dani[mjesecUnos] )) System.out.println();
		}	
		
	}//kraj inicijalizacije
	
	public void setGodina()
	{
		godina = unos.nextInt();
	}
	
	public void setMjesec()
	{
		mjesecUnos = unos.nextInt();

	}
	
	public void prikaziNaslovDatuma()
	{
		System.out.println("     " + mjesec[mjesecUnos] + " " + godina);
		System.out.println(" N  P  U  S  C  P  S");
	}
	
    public static int dan(int d, int mjesecUnos, int godina) {
        int g = godina - (14 - mjesecUnos) / 12;
        int x = g + g/4 - g/100 + g/400;
        int m = mjesecUnos + 12 * ((14 - mjesecUnos) / 12) - 2;
        int D = (d + x + (31*m)/12) % 7;
        return D;
    }
    
	
	public static boolean isPrijestupnaGodina(int godina)
	{
		  if  (( godina % 4 == 0 ) && ( godina % 100 != 0 )) return true;
	        if  ( godina % 400 == 0 ) return true;
	        return false;
	}
	


}
