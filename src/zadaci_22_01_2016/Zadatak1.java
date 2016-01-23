package zadaci_22_01_2016;

import java.util.Scanner;

public class Zadatak1 
{

	public static void main(String[] args) 
	{
		Scanner unos = new Scanner(System.in); // scanner objekat
		
		//string niz sa danima
		String [] dani = {"Ponedeljak", "Utorak", "Srijeda", "Cetvrtak", "Petak", "Subota", 
				"Nedelja"};
		
		System.out.println("Unesite danasnji dan 0  je pondeljak");
		
		//unos dnasnjeg dana 0 je ponedaljak
		int danasnjiDan = unos.nextInt();
		
		System.out.println("Unesite broj dana da saznamo buduci dan");
		
		int buduciDan = unos.nextInt();
		
		// racunanje indexa za dani string int 1%7 = 1
		int indexDani = (danasnjiDan + buduciDan) % 7;
		
		System.out.println("Danas je "+dani[danasnjiDan]+" ,a za "+buduciDan+" dana je "+dani[indexDani]);
		
	}

}
