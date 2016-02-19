package zadaci_18_02_2016;

/*
 * Write a test program that creates an array of five GeometricObjects.
 For each object in the array, display its area and invoke its howToColor method if it is colorable.
 */
public class Zadatak3
{

	public static void main( String [ ] args )
	{
		ComparableCircle c1 = new ComparableCircle( 5 );
        ComparableCircle c2 = new ComparableCircle( 10 );
        ComparableCircle c3 = ( ComparableCircle ) GeometricObject.max( c1, c2 );
        System.out.println( c1.getArea() );
        System.out.println( c2.getArea() );

        System.out.println("Max circle = " + c3.getArea() );
 
	}

}
