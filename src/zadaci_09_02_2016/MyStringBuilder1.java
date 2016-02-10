package zadaci_09_02_2016;

/*
 * (Implement the StringBuilder class) The StringBuilder class is provided in the Java library.
 *  Provide your own implementation for the following methods (name the new class MyStringBuilder1):
public MyStringBuilder1(String s);
public MyStringBuilder1 append(MyStringBuilder1 s); public MyStringBuilder1 append(int i);
public int length();
public char charAt(int index);
public MyStringBuilder1 toLowerCase();
public MyStringBuilder1 substring(int begin, int end); public String toString();
 */
public class MyStringBuilder1 
{
	public static void main(String[] args) 
	{
		//kreiranji objekat 1 i 2 za testiranje metoda
		MyStringBuilder1 objekat1 = new MyStringBuilder1( "Javanator ");
		MyStringBuilder1 objekat2  = new MyStringBuilder1( "is back");
		System.out.println( "objekat1 MyStringBuilder1 append objekat2");
		System.out.println( objekat1.append( objekat2 ) ); //test obj append obj
		System.out.println( "objekat2 MyStringBuilder1 append int 6");
		System.out.println( objekat2.append( 6 ) ); // obj append int
		System.out.println( "objekat2 charAt 6 ");
		System.out.println( objekat2.charAt( 6 ) ); // returns char na poziciji 6 objekta 2
		System.out.println( "objekat1 toLowercase ");
		System.out.println( objekat1.toLowerCase() ); //returns objekt1 to lowerCase
		System.out.println( "objekat1 substring 0 - 4");
		System.out.println( objekat1.substring( 0 , 4 ) ); //reurns prva 4 slova  objekta 1
	}
	//defaultni konstruktor
	public MyStringBuilder1( String s )
	{
		setInputString( s );
	}
	//set inpuString to s
	private void setInputString( String s ) 
	{
		inputString = s;	
	}
	// object appends another object
	public MyStringBuilder1 append( MyStringBuilder1 s )
	{
		return new MyStringBuilder1( toString() + s.toString() );
	}
	
	//object appends an int
	public MyStringBuilder1 append( int i )
	{
		return append( new MyStringBuilder1( String.valueOf( i ) ) );
	}
	//returns int length size of the inpuString
	public int length()
	{
		return toString().length();
	}
	//returns a character at index forwarded as parameter
	public char charAt( int index )
	{
		return toCharrs() [ index ];
	}
	//converts inputString to charArray
	public char [] toCharrs()
	{
		return inputString.toCharArray();
	}
	//returns a reference to this object in lowercase
	public MyStringBuilder1 toLowerCase()
	{
		return new MyStringBuilder1 ( toString().toLowerCase() );
	}
	//returns a reference to this object with the substring 
	public MyStringBuilder1 substring( int begin, int end ) // provide start index and end index point
	{
		String subbed = toString().substring( begin, end );
		return new MyStringBuilder1 ( subbed ); // return object subbed
	}
	
	public String toString()// returns the inpustString
	{
		return inputString;
	}
	
	private  String inputString;
	
}
