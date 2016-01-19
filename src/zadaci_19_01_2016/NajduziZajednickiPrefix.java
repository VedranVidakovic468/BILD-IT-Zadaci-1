package zadaci_19_01_2016;

import java.util.Scanner;

public class NajduziZajednickiPrefix 
{

	public static void main(String[] args) 
	{
		Scanner unos = new Scanner(System.in); // scanner objekat za unos
		
		System.out.println("Unesite prvu recenicu"); // unos prve recenice
		String recenica1 = unos.nextLine();
		
		System.out.println("Unesite drugi recenicu"); // unos druge recenice
		String recenica2 = unos.nextLine();
		
		String small, large;
		
		if ( recenica1.length() > recenica2.length() ) // projera koja recenica je duza odnosno veca
		{
			small = recenica2;
			large = recenica1;	
		}
		else
		{
			small = recenica1;
			large = recenica2;
		}
		
		int index = 0;
		// prolazimo kroz recenicu stavljajuci je u niz da ispitamo svako slovo
		for ( char c : large.toCharArray() )  
		{
            if( index==small.length() ) // ako smo dostigli kraj prve recenice izlazi
            	{
            	break;
            	}
            if( c != small.charAt(index) ) // ako nema vise istih slova izmedju recenica izlazi
            	{
            	break;
            	}
            index++; // povecaji index dok ne izadje iz loopa
		} // nakon izlaska iz loopa index ce nosit zadjnu vrijednost gdje su oba stringa isti
		
		if ( index == 0 ) // ako je index 0 onda nema istih prefixa
		{
			System.out.println("Recenice nemaju zajednickog prefixa");
		}
		else 
		{
			// stampanje recenice do najveceg zajednickog indexa
			System.out.println("Najduzi zajednicki prefix za obe recenice je ' "+large.substring(0, index)+"'");
		}
	}
}
