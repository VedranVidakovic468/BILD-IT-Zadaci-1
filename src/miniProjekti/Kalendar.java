package miniProjekti;
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
		
		int j;
		for ( j = 1; j > 0; j++) // loop da se izvrsava program sve dok korisnik ne pritisne 0
		{
		System.out.println("Unesite godinu");
		setGodina();
		
		do // ponavljanje upita za mjesec sve dok se ne unese validan mjesec od 1 do 12
		{ 
			System.out.println( "Unesite mjesec" );
			setMjesec();
			if ( mjesecUnos > 0 && mjesecUnos < 13 ) 
			{
				break;
			}
		} while( true );
	
		
		if ( mjesecUnos == 2 && isPrijestupnaGodina(godina) )
		{
			dani[mjesecUnos] = 29;
		}
		
		prikaziNaslovDatuma();
		
		int d = dan( 1, mjesecUnos, godina ); // koji dan je prvi izabranog mjeseca dal je 5 Petak, 6 Subota itd..
		
		for ( int i = 0; i < d; i++ ) // odvaja prazna mjesta do tog dana u kanelendaru
		{
			System.out.print("   ");	
		}
		
		for ( int i = 1; i < dani[mjesecUnos]; i ++ ) //ispisuje dane za izabrani mjesec
		{
			System.out.printf( "%2d ", i );
            if ((( i + d ) % 7 == 0 ) || ( i == dani[mjesecUnos] )) System.out.println(); // prebacuje u novi red
		}	
		
		System.out.println();
		System.out.println("\nZa reminder 2");
		System.out.println("Za drugi mjesec 1");
		System.out.println("Close 0");
		
		int opcija = unos.nextInt();
		
		if ( opcija == 1)
		{
			j++;
		}
		else if ( opcija == 0 )
			break;
		}
	}//kraj inicijalizacije
	
	public void setGodina() // godina dobiva vrijednost
	{
		godina = unos.nextInt();
	}
	
	public void setMjesec() //mjesec dobiva vrijednost 
	{
		mjesecUnos = unos.nextInt();

	}
	
	public void prikaziNaslovDatuma() // naslova kalendara
	{
		System.out.println("     " + mjesec[mjesecUnos] + " " + godina);
		System.out.println(" N  P  U  S  C  P  S");
	}
	
	//Vraca 0 za Nedelju, 1 za ponedeljak itd da bi mogli odraditi razmak
    public static int dan(int d, int mjesecUnos, int godina) {
        int g = godina - (14 - mjesecUnos) / 12;
        int x = g + g/4 - g/100 + g/400;
        int m = mjesecUnos + 12 * ((14 - mjesecUnos) / 12) - 2;
        int D = (d + x + (31*m)/12) % 7;
        return D;
    }
    
	
	public static boolean isPrijestupnaGodina(int godina) // ispitivanje godine dal je prijestupna ili nije
	{
		  if  (( godina % 4 == 0 ) && ( godina % 100 != 0 )) return true;
	        if  ( godina % 400 == 0 ) return true;
	        return false;
	}
	


}
