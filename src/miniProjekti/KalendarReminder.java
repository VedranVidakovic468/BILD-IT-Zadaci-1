package miniProjekti;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class KalendarReminder 
{

	final String windowsPath = "c:\\"; // path do direktorijuma ako ste windows korisnik
	
	//ovaj path radi na mom racunaru
	final String osxPath = "/Users/ahmedsalkic/Documents/workspace/BILD-IT-Zadaci/src/miniProjekti/";
	
	static Scanner unos = new Scanner (System.in); // scanner za unos sa tastature
	static Scanner citac = null; //scanner za citanje file
	
	private static File reminder;

	public void createReminderFile() // metoda pravi fie reminder
	{
		try
		{
			reminder = new File (osxPath+"reminder.txt"); // path treba promjenut zavisno od korisnika
			if ( reminder.createNewFile() )
			{
				System.out.println("Reminder file napravljen");
			}
			else 
			{
				System.out.println("Kalendar program");
			}		
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
	}
	
	public void writeReminder() // metoda koja pise u reminder file
	{
		System.out.println("Unesite reminder");
		String s = unos.nextLine();

		try
		{
			java.io.PrintWriter output = new java.io.PrintWriter(new FileWriter (reminder, true));
			output.println(s);
			output.println();
			output.close();
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
	}
	
	
	public void readReminder() // metoda koja cita reminder file
	{
		try 
		{
			citac = new Scanner(reminder);
			while ( citac.hasNextLine() )
			{
				String note = citac.nextLine();
				System.out.println(note);
			}
			citac.close();
		}
		catch (IOException e) 
		{
			System.out.println(e);
		}
	}
	
}
