import java.util.Scanner;
import java.awt.*;


//Supber Klasa Kalendar
public class Kalendar {
	
	Scanner unos = new Scanner (System.in);
	
	private static int godina;
	private static String mjesec;

	Kalendar()
	{
		System.out.println("Godina");
		setGodina();
		
		System.out.println("Mjesec");
		setMjesec();
		
		
	}
	
	public void setGodina()
	{
		godina = unos.nextInt();
	}
	
	public void setMjesec()
	{
		mjesec = unos.next();
	}
	
	public void prikaziDatum()
	{
		
	}
	
	public void mjesecJanuar()
	{
		System.out.println("\t \4Januar "+godina);
		System.out.println("_____________________");
		
	}
	


}
