package zadaci_09_02_2016;

import java.util.Scanner;

/*
 * Implement the String class) The String class is provided in the Java library. 
 * Provide your own implementation for the following methods (name the new class MyString1):
public MyString1(char[] chars);
public char charAt(int index);
public int length();
public MyString1 substring(int begin, int end); public MyString1 toLowerCase();
public boolean equals(MyString1 s); public static MyString1 valueOf(int i);
 */
public class MyString1 
{

	public static void main(String[] args) 
	{
	
			String haso = "Haso";
			char [] charArray = haso.toCharArray();
			MyString1 test = new MyString1( charArray );
			test.printCharArray(); // ispis char Array
			System.out.println( "\nChart at 0" );
			System.out.println( test.charAt( 0 ) ); //test metode charAt
			System.out.println( "\nTo lowerCase");
			test.toLowerCase(); //test metode toLowercase
			test.printCharArray();
			System.out.println( "\nSubstring 0,2" );
			test.substring(0, 2); // test metode substring
			test.printCharArray();
			System.out.println( "\nValue of");
			test.valueOf(375); // test metode value of
			test.printCharArray();
			
	}
	//defaultni konstruktor inicijalizacija klase MyString1
	public MyString1( char[] chars ) 
	{
		setInputCharArray( chars );
	}
	//set metoda prima char niz parameta
	public void setInputCharArray( char[] s )
	{
		inputCharArray = s;
	}
	// get metoda vraca char niz
	public char [] getInputCharArray()
	{
		return inputCharArray;
	}
	//vraca char 
	public char charAt( int index )
	{
		return inputCharArray[ index ];
	}
	
	//vraca duzina char niza
	public int length()
	{
		return	inputCharArray.length;
	}
	//stampa char array
	public void printCharArray()
	{
		for ( int i = 0; i < length(); i++ )
		{
			System.out.println( charAt( i ) );
		}
	}
	//vraca substring char array
	public MyString1 substring( int begin, int end )
	{
		int subbedArrayLength = ( end - begin );
		char [] subbed = new char [ subbedArrayLength ];
		for ( int i = 0; i < subbedArrayLength; i++ )
		{
			subbed [ i ] = charAt( begin );
			begin++;
		}
		return new MyString1( subbed );
	}
	//vraca charArray malim slovima
	public MyString1 toLowerCase()
	{
		char [] lowerCase = new char [ length() ];
		for ( int i = 0; i < length(); i++ )
		{
			char ch = charAt( i ) ;
			if ( ch > 64 && ch < 91) //velika slova ascii coda su izmedju 65 i 90
			{
				ch = ( char ) ( 32 + ch ); // mala slova pocinju od 97. 65+32 = 97
			}
			lowerCase [ i ] = ch;
		}	
		return new MyString1 ( lowerCase );
		
	}
	//metoda vraca boolean true ako su iste duzine 
	public boolean equals( MyString1 s )
	{
		 if ( inputCharArray.length != s.length() )
		 {
			 return false;
		 }
		 return true;

	}
	//metoda treba da kovertuje int u charArray
	public static MyString1 valueOf(int i)
    {
		MyString1 num = new MyString1 ( Integer.toString(i).toCharArray());
		return num;
    } 
	
	
	private static char [] inputCharArray;

}
