package zadaci_19_02_2016;

/*
 *  (Enable Circle comparable) Rewrite the Circle class in Listing 13.2 to extend GeometricObject and implement the Comparable 
 *  interface. Override the equals method in the Object class. 
 *  Two Circle objects are equal if their radii are the same. 
 *  Draw the UML diagram that involves Circle, GeometricObject, and Comparable.
 */
public class Zadatak1
{

	public static void main( String [ ] args )
	{
		//created 2 object of class Circle with the same radius
		GeometricObject circle1 = new Circle( 5 );
		GeometricObject circcl2 = new Circle( 5 );
		//Testing the abstract method equals
		System.out.println( circle1.equals( circcl2 ) );

	}

}
