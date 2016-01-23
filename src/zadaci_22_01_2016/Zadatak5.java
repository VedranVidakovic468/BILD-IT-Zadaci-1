package zadaci_22_01_2016;

public class Zadatak5 
{

	public static String convertMillis( long millis )  // metoda prima long parametar
	{
		// racunanje sekundi, minuta i sati za parametar koji smo unijeli
		long second = ( millis / 1000 ) % 60;
		long minute = ( millis / (1000 * 60 )) % 60;
		long hour = ( millis / ( 1000 * 60 * 60 )) % 24;
		// format stringa u obliku hh:mm:ss
		String time = String.format("%02d:%02d:%02d h", hour, minute, second);
		
		return time;// vraca formatiran string
	}
	public static void main(String[] args) 
	{
		
		System.out.println(convertMillis(12654814));
	}

}
