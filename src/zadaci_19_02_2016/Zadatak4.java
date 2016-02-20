package zadaci_19_02_2016;

/*
 * (Sum the areas of geometric objects) Write a method that sums the areas of all the geometric objects 
 * in an array. The method signature is:
public static double sumArea(GeometricObject[] a)
  Programming Exercises 531 Write a test program that creates an array of four objects 
  (two circles and two rectangles) and computes their total area using the sumArea method.
 */
public class Zadatak4
{

	public static void main( String [ ] args )
	{
		//creating and arrayn of GeometricObjects with 4 elements
		GeometricObject [ ] array = new GeometricObject [ 4 ];
		//adding Objects to array elements
		array [ 0 ] = new Circle( 5 );
		array [ 1 ] = new Circle( 10 );
		array [ 2 ] = new Rectangle( 5, 5 );
		array [ 3 ] = new Rectangle( 10, 10 );
		
		//display the total sum
		System.out.println( "Total sum of all objects is : " + sumArea( array ) );

	}
	/** returns the total sum of areas */
	public static double sumArea( GeometricObject [ ] a )
	{
		double sum = 0;

		for ( int i = 0; i < a.length; i++ )
		{
			double area = a [ i ].getArea();
			sum += area;
		}
		return sum;

	}

}
