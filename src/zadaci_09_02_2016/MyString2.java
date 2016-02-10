package zadaci_09_02_2016;

/*
 * (Implement the String class) The String class is provided in the Java library.
 *  Provide your own implementation for the following methods (name the new class MyString2):
public MyString2(String s);
public int compare(String s);
public MyString2 substring(int begin); public MyString2 toUpperCase();
public char[] toChars();
public static MyString2 valueOf(boolean b);
 */

public class MyString2 
{

	public static void main(String[] args) 
	{
		String haso = "Java";
		MyString2 test = new MyString2( haso );
		System.out.println( "Ispis stringa ");
		test.printString(); // test print string
		System.out.println( "Test compare to string 'Java' , compare returns 0 is strings are equals" );
		System.out.println( test.compare( "Java" ) ); // test compare string, vraca 0 ako su isti
		System.out.println( "Test substring, 1" );
		test.substring( 1 ).printString(); //test substring
		System.out.println( "Test to uppeCase");
		test.toUpperCase().printString(); //test toUppercase
		System.out.println( "Test value of false");
		test.valueOf(false).toUpperCase().printString(); //test value of false
		
		

	}
	//defaultni konstruktor
	public MyString2( String s )
	{
		setString( s);
	}
	//set metoda
	private void setString( String s )
	{
		inputString = s;
	}
	//compare string metoda vraca 0 ako su input string i string prisljedjen u parametru isti
	public int compare( String s )
	{
		return inputString.compareTo(s);
	}
	//ispis inpuStringa
	private void printString()
	{
		System.out.println( inputString );
	}
	//substring metod
	public MyString2 substring( int begin )
	{
		char [] charArray = toChars();
		String result = "";
		for ( int i = begin; i < charArray.length; i++ )
		{
			result += charArray[ i ];
		}
		return new MyString2 ( result );
	}
	//to char method stavlja string u char niz
	public char[] toChars()
	{
		char [] charArray = inputString.toCharArray();
		return charArray;
	}
	
	//pretvara se mala slova u velika
	public MyString2 toUpperCase()
	{
		char [] upperCase = toChars();
		String result = "";
		for ( int i = 0; i < upperCase.length; i++ )
		{
			char ch = upperCase[ i ] ;
			if ( ch > 96 && ch < 123) //mala slova ascii coda su izmedju 97 i 122
			{
				ch = ( char ) ( ch - 32 ); // velika slova pocinju od 65. 97-32 = 65
			}
			result += ch;
		}	
		return new MyString2 ( result );	
	}
	//vraca boolean string
	public static MyString2 valueOf( boolean b )
	{
		String result = "";
		if ( b )
		{
			result = "true";
		}
		else 
		{
			result = "false";
		}
		return new MyString2( result );
	}
	//promjenljiva inputString klase Mystring2
	private static String inputString;

}
