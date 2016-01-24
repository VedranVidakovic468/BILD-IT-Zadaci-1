package zadaci_23_01_2016;

import java.util.Scanner;

public class Zadatak1 
{
	public static boolean isLeapYaer ( int year ) // ispitivanje godine dal je prijestupna ili nije
	{
		  if  (( year % 4 == 0 ) && ( year % 100 != 0 )) return true;
	        if  ( year % 400 == 0 ) return true;
	        return false;
	}
	
	public static int numberOfDayInAYear(int year) // metoda koja vraca broj dana u godini
	{
		if (isLeapYaer(year)) // ako je prijestupna godina onda vraca 366 dana
			{
			return 366;
			}
		else return 365; // ako nije prijestupna godina onda vraca 365 dana
	}
	
	public static void main(String[] args) 
	{
		Scanner unos = new Scanner (System.in); // scanner objekat unos
		
		System.out.println("Unesite pocetnu godinu"); // unosenje pocetne godine int
		int startYear = unos.nextInt();
		
		System.out.println("Unesite krajnu godinu"); // unosenje krajnje godine int
		int endYear = unos.nextInt();
		
		for ( int i = startYear; i <= endYear; i++ ) // loop za ispisivanje
		{
			System.out.println("Godina "+i+" ima "+numberOfDayInAYear(i)+" dana");
		}

	}

}
