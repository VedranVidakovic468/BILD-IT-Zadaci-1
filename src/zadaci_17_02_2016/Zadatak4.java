package zadaci_17_02_2016;

import java.util.ArrayList ;
import java.util.Collections ;
import java.util.Random ;
import java.util.Scanner ;

/*
 * (Shuffle ArrayList) Write the following method that shuffles an ArrayList of numbers:
public static void shuffle(ArrayList<Number> list)
 */
public class Zadatak4
{

	public static void main( String [ ] args )
	{
		ArrayList <Number > myList = new ArrayList(); // creating a list of numbers
		
		int x = 1;
		while ( x!= 0 ) // 0 breaks the loop
		{
			x = new Scanner( System.in ).nextInt();
			if ( x == 0 )
			{
				break;
			}
			myList.add( x );
		}
		
		System.out.println( "Displaying unshufeled list " + myList );
		/** Invoking shuffle method */
		shuffle( myList ); 
		/** displaying shuffeled list */
		System.out.println( "Displaying shuffeled list "+ myList );
		shuffle( myList );
		System.out.println( "Displaying shuffeled list "+ myList );

	}
	/** method to shuffle indexes of arrayList */
	public static void shuffle( ArrayList< Number > list )
	{
		for ( int i = 0; i < list.size(); i++) 
		{
			Number temp = list.get( i );
			int randomIndex = new Random().nextInt( list.size() );
			list.set( i, list.get( randomIndex ) );
			list.set( randomIndex, temp );
		}
		
	}

}
