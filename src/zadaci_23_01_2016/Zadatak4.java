package zadaci_23_01_2016;

public class Zadatak4 
{
	public static int count(String str, char a)
	{
		int br = 0; // brojac ponovljenih karaktera
		
		char [] niz = str.toCharArray(); // stavljanje stringa u niz
		
		for ( int i = 0; i < str.length(); i++ )
		{
			if ( niz[i] == a ) // ako je index 0 stringa jednak a povecaj brojac
			{
				br++;
			}
		}
		return br; // vraca ukupan broj ponovljenog charaktera
	}
	
	public static void main(String[] args) 
	{
		System.out.println(count("Welcome", 'e'));

	}

}
