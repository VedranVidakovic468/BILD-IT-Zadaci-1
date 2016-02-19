package zadaci_18_02_2016;

import java.text.DecimalFormat ;

/*
 * (Enable GeometricObject comparable) Modify the GeometricObject class to implement the Comparable interface,
 *  and define a static max method in the GeometricObject class for finding the larger of two GeometricObject objects. 
 *  Draw the UML diagram and implement the new GeometricObject class.
 *  Write a test program that uses the max method to find the larger of two circles and the larger of two rectangles.
 */
public class Zadatak2
{

	public static void main( String [ ] args )
	{
		
		DecimalFormat formatter = new DecimalFormat("###.###"); //formatting decimal numbers
		GeometricObject c1 = new Circle( 5 ); //argument is radius
		GeometricObject c2 = new Circle( 8 );
		//comparing two cricles
		GeometricObject maxCircle = (Circle)GeometricObject.max( c1, c2 );
		
		//printing the areas of circles
        System.out.println( "Circle area 1: " + formatter.format( c1.getArea() ) );
        System.out.println( "Circle area 2: " + formatter.format( c2.getArea() ) );
        System.out.println( "Max circle area is: " + formatter.format( maxCircle.getArea() ) );

        GeometricObject r1 = new Rectangle( 10, 5 );//argument is width and height of a rectangle
        GeometricObject r2 = new Rectangle( 15, 5);
        GeometricObject maxRectangle = (Rectangle) GeometricObject.max(r1, r2);
        //print the areas and of the rectangles
        System.out.println("Rectangle area 1: " + r1.getArea() );
        System.out.println("Rectangle area 2: " + r2.getArea() );
        System.out.println("Max Rectangle is: " + maxRectangle.getArea() );

	}

}
