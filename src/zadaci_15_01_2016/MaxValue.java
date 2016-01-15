package zadaci_15_01_2016;

import java.util.ArrayList;
import java.util.Collections;

public class MaxValue {

	//metoda za vracanje najvece vrijednosti iz ArrayListe
	public static Integer max(ArrayList<Integer> list)
	{
		int maxValue; // deklasirana trenutna max promjeljiva
		if ( list.isEmpty() )  // provjera dal je lista prazna i u slucaju da vraca nulu
		{
			return null;
		} else // ovaj dio koda bi se mogo i zamjenuti sa "return Collections.max(list);"
			//maxValu poprimi najmanju vrijednost da bi se uporedilo sa ostalim clanovima u listi
			maxValue = 0; 
			for ( int i = 0; i < list.size(); i++ )
			{
				// ako je lista index od i veci od maxValue onda maxValue dobiva novu vrijednost
				if ( list.get(i) > maxValue ) 
				{
					maxValue = list.get(i);
				}
			} 
			return maxValue; //vraca najvecu vrijednost iz liste
			
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList();
		lista.add(5);
		lista.add(55);
		lista.add(25);
		lista.add(2);
		lista.add(203);
		lista.add(18);  
	
		System.out.println(max(lista));

	}

}
