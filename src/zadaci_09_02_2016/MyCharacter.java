package zadaci_09_02_2016;

public class MyCharacter 
{

	public static void main(String[] args) 
	{
        MyCharacter ch = new MyCharacter( 'L' );
        System.out.println( "ch = " + ch.getChar());
        System.out.println( "Is a letter: " + ch.isLetter() );
        System.out.println( "Is a digit: " + ch.isDigit() );
        System.out.println( "L == L ?" + ch.equals( 'L' ) );

	}
	
	MyCharacter( char ch )
	{
		setInputChar( ch );
	}
	
	private void setInputChar( char ch )
	{
		inputChar = ch;
	}
	
	private char getChar()
	{
		return inputChar;
	}
	
	private boolean isLetter()
	{
		if ( inputChar > 64 && inputChar < 91 || 
				inputChar > 96 && inputChar < 123 )
			{
			return true;
			}
		return false;
	}
	
	private boolean isDigit()
	{
		if ( inputChar > 47 && inputChar < 58 )
		{
			return true;
		}
		return false;
	}
	
	private boolean equals ( char ch )
	{
		if ( inputChar == ch )
		{
			return true;
		}
		return false;
	}
	
	private static char inputChar;

}
