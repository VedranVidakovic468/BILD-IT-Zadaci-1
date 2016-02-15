package zadaci_15_02_2016;


/*
 * (OutOfMemoryError) 
 * Write a program that causes the JVM to throw an OutOfMemoryError and catches and handles this error.
 */

public class Zadatak2
{

	public static void main(String[] args)
	{
		
		boolean continuedAddittion = true;
		byte[] crasher = new byte[ Integer.MAX_VALUE ]; //Requested array size exceeds VM limit
		int i = 0;
		try 
		{
			while ( continuedAddittion )
			{
				crasher[i] = (byte) Integer.MAX_VALUE; //when trying to accessing this array error occurs
				i++;
			}
		}
		catch ( IndexOutOfBoundsException ex)
		{
			System.out.println( ex.getMessage() );
		}
		catch ( OutOfMemoryError ex ) 
		{
		    System.out.println( ex.getMessage() );
		}
		

	}

}
