package zadaci_19_02_2016;

public class Zadatak2
{

	public static void main( String [ ] args )
	{
		//created 2 object of class Circle with the same radius
		GeometricObject rectangle1 = new Rectangle( 5 , 7 );
		GeometricObject rectangle2 = new Rectangle( 5 , 7 );
		//Testing the abstract method equals
		System.out.println( rectangle1.equals( rectangle2 ) );

	}

}
