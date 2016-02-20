package zadaci_19_02_2016;

/*
 * Write a test program that creates an Octagon object with side value 5 and displays its area and perimeter.
 *  Create a new object using the clone method and compare the two objects using the compareTo method.
 */
public class Zadatak3
{

	public static void main( String [ ] args )
	{
		//create and object octagon
		GeometricObject octagon = new Octagon( 5 );
		System.out.println( octagon.toString() );
		
		//ovaj dio ne radi...methoda clone nije vidljiva ovdje, radio sam po primjerima iz knjige ali negdje steka
	//	Octagon octagon2 = ( Octagon )octagon.clone();
		
		GeometricObject octagon2 = new Octagon( 5 );
		//returns 1 if they are the same
		System.out.println( octagon2.compareTo( octagon ) );
	}

}
