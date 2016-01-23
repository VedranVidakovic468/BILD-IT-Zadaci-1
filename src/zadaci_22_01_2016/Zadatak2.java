package zadaci_22_01_2016;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak2 
{

	public static void main(String[] args) 
	{
		Scanner unos = new Scanner (System.in);
		
		double geoDuzina1 = 0; // geografska duzina za tacku 1
		double geoSirina1 = 0; // geografska sirina za tacku 1
		double geoDuzina2 = 0; // geografska duzina za tacku 2
		double geoSirina2 = 0; // geografska sirina za tacku 2
		double rZemlje = 6371.01; // poluprecnik zemlje
		
		System.out.println("Unesite gerografsku duzinu tacke 1: ");
		geoDuzina1 = unos.nextDouble(); // unos duzine tacke 1
		geoDuzina1 = Math.toRadians(geoDuzina1); // konverzija duzine tacke 1 u radijane
		
		System.out.println("Unesite geografsku sirinu tacke 1: ");
		geoSirina1 = unos.nextDouble(); // unos sirina tacke 2
		geoSirina1 = Math.toRadians(geoSirina1);
		
		System.out.println("Unesite geografsku duzinu tacke 2");
		geoDuzina2 = unos.nextDouble(); // unos duzine tacke 2
		geoDuzina2 = Math.toRadians(geoDuzina2);
		
		System.out.println("Unesote geografsku sirinu tacke 2");
		geoSirina2 = unos.nextDouble(); // unos sirine 2
		geoSirina2 = Math.toRadians(geoSirina2);
		
		double distance;
		// formula za izracunavanje udaljenosti 
		//d = radius * arccos (sin(x1) X sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)) x je sirina
		distance =  Math.acos ( ( Math.sin( geoSirina1 ) * Math.sin( geoSirina2 ) ) + 
				( ( Math.cos ( geoSirina1 ) * Math.cos( geoSirina2 ) ) * 
				( Math.cos( geoDuzina1 - geoDuzina2) ) ) ) ;
		
		distance = Math.toDegrees(distance);
		distance = rZemlje * distance;
		
		DecimalFormat formatter = new DecimalFormat("#.###"); // formater decimala
		
		//ispis rezulatata
		System.out.println("Udaljenost izmedju dvijed tacke koje ste unijeli");
		System.out.println("je "+formatter.format(distance)+" kilometara");
		
	}

}
