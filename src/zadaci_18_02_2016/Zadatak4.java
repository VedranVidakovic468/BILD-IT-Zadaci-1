package zadaci_18_02_2016;

public class Zadatak4
{

	public static void main( String [ ] args )
	{
		//creating an array of objects
		GeometricObject [] objects = new GeometricObject [ 5 ];
		//adding object elements tot he array
		objects[ 0 ] = new Rectangle( 7, 9 );
		objects[ 1 ] = new Circle ( 5 );
		objects[ 2 ] = new Square( 5, 5 );
		objects[ 3 ] = new Square( 10, 10 );
		objects[ 4 ] = new Circle( 9 );
		
		//displaying the areas and how to color method
		for ( int i = 0; i < objects.length; i++ )
		{
			if ( objects[ i ].equals( objects[ 2 ] ) || objects[ i ].equals( objects[ 3 ] ) )
			{
				( ( Square ) objects[ i ] ).howToColor() ;
			}
			System.out.println( objects[ i ].toString() + " " );
		}

	}
}
