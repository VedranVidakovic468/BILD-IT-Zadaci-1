package zadaci_25_01_2016;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Zadatak3 
{

	public static void main(String[] args) 
	{
		// Dare classa koji ima argumenat metodu System.currentTimeMillis() i d dobije vrijednost current time
		Date d = new Date(System.currentTimeMillis()); 
		//Date format klasa da mozemo manipulisat formatom ispisa datuma i vremena
		DateFormat dateFormat = new SimpleDateFormat("dd.MMMM,yyyy HH:mm:ss"); 
		//ispis trenutnog datuma i vremena
		System.out.println("Trenurni datum i vrijeme: "+dateFormat.format(d));
	}

}
