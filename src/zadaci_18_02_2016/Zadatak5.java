package zadaci_18_02_2016;

import java.util.ArrayList ;
import java.util.Objects ;

public class Zadatak5
{

	public static void main( String [ ] args )
	{
		
		MyStack stack1 = new MyStack();
		for ( int i = 0; i < 10; i++ )
		{
			stack1.push( i );
		}
		MyStack stack2 = ( MyStack ) stack1.clone();
		// get rid of two items
		stack1.pop();
		stack1.pop();

		// display size for both stacks to make sure they are different
		System.out.println( "stack1 size = " + stack1.getSize() );
		System.out.println( "stack2 size = " + stack2.getSize() );

	}

}
