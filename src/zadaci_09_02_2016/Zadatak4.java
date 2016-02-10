package zadaci_09_02_2016;

/*
 * New string split method) The split method in the String class returns an array of strings
 *  consisting of the substrings split by the delimiters. However, the delimiters are not returned.
 *   Implement the following new method that returns an array of strings consisting of the 
 * substrings split by the matching delimiters, including the matching delimiters.
 * For example, split("ab#12#453", "#") returns ab, #, 12, #, 453 in an
 *  arrayofString,andsplit("a?b?gf#e", "[?#]")returnsa,b,?,b,gf, #, and e in an array of String.
 */
public class Zadatak4 
{
	public static void main(String[] args) 
	{
	
		String [] test = split("ab#12#453", "#");
		for ( int i = 0; i < test.length; i++ )
		{
			System.out.println( test[ i ] );
		}
	}
	
	public static String[] split( String s, String regex )
	{
		String [] split;
		String [] simbolsArray = new String [ regex.length() ];
		String simbols = "";
		int counterRegex = 0;
		for ( int i = 0; i < regex.length(); i++ )
		{
			simbolsArray [ i ] = regex.substring (regex.length()-i );
		}
		
		for ( int i = 0; i < s.length(); i++ )
		{
			for ( int j = 0; j < simbolsArray.length; j++ )
			{
				if ( s.charAt( i ) == simbolsArray[ j ].charAt( j ) )
				{
					counterRegex++;
				}
			}
		}
		
		split = new String [ s.length() + ( 2 * counterRegex ) ];
		for ( int i = 0; i < split.length; i++ )
		{
			for ( int j = 0; j < simbols.length(); j++ )
			{
				if ( s.charAt( i ) == simbolsArray[ j ].charAt( j ) )
				{
					split[ i ] = ","+ simbolsArray[ j ];
				}
				split [i] = s.substring(s.length()-i);
			}
			
		}
		return split;
	}
	
}
