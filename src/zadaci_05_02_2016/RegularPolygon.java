package zadaci_05_02_2016;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/*
 * Geometry: n-sided regular polygon) In an n-sided regular polygon, all sides have the same length and all angles have the
 *  same degree (i.e., the polygon is both equilateral and equiangular). Design a class named RegularPolygon that contains:
■ A private int data field named n that defines the number of sides in the poly- gon with default value 3.
■ A private double data field named side that stores the length of the side with default value 1.
■ A private double data field named x that defines the x-coordinate of the poly- gon’s center with default value 0.
■ A private double data field named y that defines the y-coordinate of the poly- gon’s center with default value 0.
■ A no-arg constructor that creates a regular polygon with default values.
■ A constructor that creates a regular polygon with the specified number of sides
and length of side, centered at (0, 0).
■ A constructor that creates a regular polygon with the specified number of sides,
length of side, and x- and y-coordinates.
■ The accessor and mutator methods for all data fields.
■ The method getPerimeter() that returns the perimeter of the polygon.
■ The method getArea() that returns the area of the polygon. The formula for
2
computing the area of a regular polygon is Area = n * s . p
4*tan¢ ≤ n
  Draw the UML diagram for the class and then implement the class. Write a test program that creates three RegularPolygon objects,
   created using the no-arg constructor, using RegularPolygon(6, 4), and using RegularPolygon(10, 4, 5.6, 7.8). For each object, display its perimeter and area.
 */

public class RegularPolygon 
{

	public static void main(String[] args) 
	{
		NumberFormat formatter = new DecimalFormat("#0.00");  
		RegularPolygon polygon1 = new RegularPolygon();
		RegularPolygon polygon2 = new RegularPolygon( 6,4 );
		RegularPolygon polygon3 =  new RegularPolygon( 10, 4, 5.6, 7.8 );
		
		System.out.println( "Polygon 1 has the perimeter of: " + polygon1.getPerimeter() + " and area of: " + formatter.format( polygon1.getArea() ) );
		System.out.println( "Polygon 2 has the perimeter of: " + polygon2.getPerimeter() + " and area of: " + formatter.format( polygon2.getArea() ) );
		System.out.println( "Polygon 3 has the perimeter of: " + polygon3.getPerimeter() + " and area of: " + formatter.format( polygon3.getArea() ) );
		

	}
	//defaultni konstruktor bez argumenata
	RegularPolygon()
	{
		setNumberOfSides( 3 );
		setLengthOfSide( 1 );
		setXCoordinate( 0 );
		setYCoordinate( 0 );
	}
	//konstruktor sa parametrima duzine i broj strana
	RegularPolygon( int numberOfSides, double sideLength )
	{
		setNumberOfSides( numberOfSides );
		setLengthOfSide( sideLength );
		setXCoordinate( 0 );
		setYCoordinate( 0 );
	}
	//konstruktor sa parametrima duzine,broj strana, x i y coordinatama
	RegularPolygon( int numberOfSides, double sideLength, double xCoordinate, double yCoordinate )
	{
		setNumberOfSides( numberOfSides );
		setLengthOfSide( sideLength );
		setXCoordinate( xCoordinate );
		setYCoordinate( yCoordinate );
	}
	
	//method for finding the perimeter of a regular polygon is to multiply the number of sides by the length of one side.
	private double getPerimeter()
	{
		double perimeter = n * side;
		return perimeter;
	}
	//metoda za izracunavanje povrsine 
	private double getArea()
	{
		double area;
		double tangentOfsides = 4 * Math.tan( ( Math.PI ) / ( n ) );
		area = ( ( n ) * ( Math.pow( side, 2 ) ) ) / tangentOfsides;
		return area;
	}
	
	//set i get metoda za promjenljive
	private void setNumberOfSides( int numberOfSides )
	{
		n = numberOfSides;
	}
	
	private int getNumberOfSides()
	{
		return n;
	}
	
	private void setLengthOfSide( double sideLenght )
	{
		side = sideLenght;
	}
	
	private double getLengthOfSide()
	{
		return side;
	}
	
	private void setXCoordinate( double xCoordinate )
	{
		x = xCoordinate;
	}
	
	private double getXCoordinate()
	{
		return x;
	}
	
	private void setYCoordinate( double yCoordinate )
	{
		y = yCoordinate;
	}
	
	private double getYCoordinate()
	{
		return y;
	}
	//promjenljive klase fan
	private int n; //number of sides
	private double side; // length of sides
	private double x;
	private double y;

}
