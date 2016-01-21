package zadaci_20_01_2016;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Avion 
{

	public static void main(String[] args)
	{
		Scanner unos = new Scanner (System.in); // scanner objekat za unos
		
		double v = 0; // inicijalizacija brzine aviona
		double a = 0; // inicijalizacija ubrzanja aviona
		
		System.out.println("Unesite brzinu aviona u m/s: "); // unos brzine aviona
			v = unos.nextDouble();
		
		System.out.println("Unesite ubrzanje aviona m/s^2: "); // unos ubrzanja aviona
			a = unos.nextDouble();
		
		double s = ( v * v) / ( 2 * a); // racunanje minimalne duzine piste po formuli dužina = v * v / 2a
		
		DecimalFormat formatter = new DecimalFormat("#.###"); //format ispisa na 3 decimale
		System.out.println("Minimalna duzina piste je: "+ formatter.format(s)); // ispis duzine  min piste
	}

}
