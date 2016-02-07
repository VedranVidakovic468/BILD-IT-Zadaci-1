package zadaci_06_02_2016;

import java.util.ArrayList;

/*
 * (The MyInteger class) Design a class named MyInteger. The class contains:
■ An int data field named value that stores the int value represented by this object.
■ A constructor that creates a MyInteger object for the specified int value.
■ A getter method that returns the int value.
■ The methods isEven(), isOdd(), and isPrime() that return true if the
value in this object is even, odd, or prime, respectively.
■ The static methods isEven(int), isOdd(int), and isPrime(int) that
return true if the specified value is even, odd, or prime, respectively.
■ The static methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger) that return true if the specified value is even, odd,
or prime, respectively.
■ The methods equals(int) and equals(MyInteger) that return true if
the value in this object is equal to the specified value.
■ A static method parseInt(char[]) that converts an array of numeric
characters to an int value.
■ A static method parseInt(String) that converts a string into an int
value.
 */

public class MyInteger
{
	//main za testiranje programa
	public static void main(String[] args) 
	{
	/*
	 * Greske u programu :
	 * 1. ako se objekti num1, num2 i num3 poredaju jedan iza drugog toString metoda vraca samo rezultat za objekat num3
	 * ili zadnji napravljen objekat
	 * 2. equals metoda neispravno funcionise u primjeru dole num1.equals(num3) vraca true a nije isti broj
	 */
		 MyInteger num1 = new MyInteger(7);
		 System.out.println( num1.toString() );
		 
		 MyInteger num2 = new MyInteger(7);
		 System.out.println( num2.toString() );
		 
		 MyInteger num3 = new MyInteger(30);
		 System.out.println( num3.toString() );
		 
	     System.out.printf("Num 1 == Num 2: %b\n", num1.equals(num2));
	     System.out.printf("Num 1 == Num 3: %b\n", num1.equals(num3)); // pogresan rezultat
	     System.out.printf("Parse int 100 string value == %d\n", MyInteger.parseInt("100"));
	     System.out.printf("Parse int 150 char array value == %d\n", MyInteger.parseInt("150".toCharArray()));


	}
	// defaultni konstruktor
	MyInteger( int myInt )
	{
		setMyInt( myInt );
	
	}
	//getter vraca int
	private static int getMyInt()
	{
		return myInt;
	}
	//seter koji mijenja promjenjljivu int u novu prosljedjenu
	private void setMyInt( int value )
	{
		myInt = value;
	}
	// metoda bez argumenata za ispitivanje dal je myInt paran broj
	private static boolean isEven()
	{
		if ( getMyInt() % 2 == 0 )
		{
			return true;
		}
		return false;
	}
	// metoda bez argumenata za ispitivanje dal je myInt neparan broj
	private static boolean isOdd()
	{
		if ( !isEven() )
		{
			return true;
		}
		return false;
	}
	// metoda bez argumenata za ispitivanje dal je myInt prost broj
	private static boolean isPrime()
	{
		for ( int j = ( getMyInt() -1 ); j > 1; j-- )
		{
			if ( getMyInt() % j == 0 )
			{
				return false;
			}
		} 
		return true;
	}
	// metoda za provjeru dal je broj paran koji prosljedimo 
	private static boolean isEven( int value )
	{
		if ( value % 2 == 0 )
		{
			return true;
		}
		else return false;
	}
	// metoda za provjeru dal je broj neparan koji prosljedimo
	private static boolean isOdd( int value )
	{
		if ( !isEven( value ) )
		{
			return true;
		}
		else return false;
	}
	// metoda za provjetru dal je broj prost koji prosljedimo
	private static boolean isPrime( int value )
	{
		for ( int j = ( value - 1) ; j > 1; j-- )
		{
			if ( value % j == 0 )
			{
				return false;
			}
		}
		return true;
	}
	// metoda za provjeru dal je broj paran objekat se prosljedjuje
	private static boolean isEven( MyInteger obj )
	{
		if ( obj.isEven() || MyInteger.isEven( obj.getMyInt() ) )
		{
			return true;
		}
		else return false;
	}
	// metoda za provjeru dal je broj neparan objekat se prosljedjuje
	private static boolean isOdd( MyInteger obj )
	{
		if ( !isEven( obj ) )
		{
			return true;
		}
		else return false;
	}
	//metoda za provjeru dal je broj prost koji se prosljedjuje
	private static boolean isPrime( MyInteger obj )
	{
		for ( int j = ( obj.getMyInt() - 1 ); j > 1; j-- )
		{
			if ( obj.getMyInt() % j == 0 )
			{
				return false;
			}
		}
		return true;
	}
	//metoda za provjeru dal je prosljedjen broj jednak myInt
	private boolean equals( int value )
	{
		if ( value == getMyInt() )
		{
			return true;
		}
		else return false;
	}
	//metoda za za provjeru dal je obj jednak broju myInt
	private boolean equals( MyInteger obj )
	{
		if ( obj.getMyInt() == myInt )
		{
			return true;
		}
		else return false;
		
	}
	//metoda za konvertovanje char niz brojeva u broj int
	private static int parseInt( char[] number )
	{
		int x = Integer.parseInt( String.valueOf( number ) );
		return x;
	}
	// metoda za konvertovanje string broja u broj int
	private static int parseInt( String  str )
	{
		int x = Integer.parseInt( str );
		return x;
	}
	
	 public String toString()
	{
		ArrayList<String> result = new ArrayList();
		if ( isEven() || isEven( getMyInt() ) || isEven( this ) )
			{
			 result.add (String.format( "My number: %d is even %b", getMyInt(), MyInteger.isEven( this ) ));
			}
		if ( isOdd() || isOdd( getMyInt() ) || isOdd( this ))
			{
			result.add( String.format( "My number: %d is odd %b", getMyInt(), MyInteger.isOdd( this ) ));
			}
		if ( isPrime() || isPrime( getMyInt() ) || isPrime( this ) )
			{
			result.add( String.format( "My number: %d is prime %b", getMyInt(), MyInteger.isOdd( this ) ) );
			}
		return ""+result;
	}
	
	private static int myInt;

}
