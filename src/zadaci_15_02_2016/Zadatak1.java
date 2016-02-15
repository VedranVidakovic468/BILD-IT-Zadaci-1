package zadaci_15_02_2016;

import java.awt.image.ColorConvertOp;
import java.util.Scanner;

/*
 * (NumberFormatException) Write the bin2Dec(String binaryString) method to convert a binary string into a
 *  decimal number.
 *  Implement the bin2Dec method to throw a NumberFormatException if the string is not a binary string.
 */
public class Zadatak1
{

	public static void main(String[] args) 
	{
		try
		{
		 System.out.println( bin2Dec( "111001" ) );
	        // Purposely throwing an exception...
	    System.out.println(bin2Dec( "lafkja" ) );
		}
		catch ( NumberFormatException ex )
		{
			System.out.println( ex.getMessage() );
		}


	}
	
	public static int bin2Dec( String binaryString )
	{
		if ( !isBinary( binaryString) ) //invoking isBinary method
		{
			//throw exception if the String have anything different of 1's and 0's
			throw new NumberFormatException ("Illeagal Number Format. (String is not binary). ");
		}
		
		/*
		binary number:	1	1	1	0	0	1
		power of 2:	 	2^5+2^4+2^3+2^2+2^1+2^0
		1110012 = 1·2^5+1·2^4+1·2^3+0·2^2+0·2^1+1·2^0 = 57
		*/
		int power = 0;
        int decimal = 0;
        for ( int i = binaryString.length() - 1; i >= 0; i-- ) 
        {

            if ( binaryString.charAt( i ) == '1')
            {
                decimal += Math.pow( 2, power );
            }
            power++;
        }
        return decimal;
		
	}
	
	public static boolean isBinary( String binary ) // method return true if the string is consistent with 1s and 0s
	{
		char [] array = binary.toCharArray(); //getting the String to an char array
		for ( int i = 0; i < array.length; i++ )
		{
			char ch = array[ i ];
			if ( ch != '0' && ch != '1' ) //if a character is different from 1 and 0 return false
			{
				return false;
			}
		}
		return true;
	}

}
