package zadaci_06_02_2016;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.text.NumberFormatter;

/*
 * (The MyPoint class) Design a class named MyPoint to represent a point with x- and y-coordinates.
 *  The class contains:
■ The data fields x and y that represent the coordinates with getter methods.
■ A no-arg constructor that creates a point (0, 0).
■ A constructor that constructs a point with specified coordinates.
■ A method named distance that returns the distance from this point to a
specified point of the MyPoint type.
■ A method named distance that returns the distance from this point to
another point with specified x- and y-coordinates.
Draw the UML diagram for the class and then implement the class.
 Write a test program that creates the two points (0, 0) and (10, 30.5) and displays 
 the distance between them.
 */

public class MyPoint 
{

	public static void main(String[] args) 
	{
		//point pbjekti klase MyPoint
		MyPoint pointA = new MyPoint(); // x i y su 0,0
		MyPoint pointB = new MyPoint( 10, 30.5 );
		
		NumberFormat formatter = new DecimalFormat("#0.00"); 
		
		
		System.out.println( "The distance between point A and point B is: "+ formatter.format( pointA.distance(pointB) ) );

	}
	
	MyPoint() // defaultni konstruktor
	{
		setXCoordinate( 0 );
		setYCoordinate( 0 );
	}
	
	public MyPoint( double xValue, double yValue )
	{
		setXCoordinate( xValue );
		setYCoordinate( yValue );
	}
	//vraca double xCoordinate vrijednost
	private double getXCoordinate()
	{
		return xCoordinate;
	}
	//vraca double yCoordinate vrijednost
	private double getYCoordinate()
	{
		return yCoordinate;
	}
	//seter za xCoordinate
	private void setXCoordinate( double xValue )
	{
		xCoordinate = xValue;
	}
	// seter za yCoordinate
	private void setYCoordinate( double yValue )
	{
		yCoordinate = yValue;
	}
	//izracunavanje distance izmedju dvije razlicite coordinate
	private double distance( MyPoint obj )
	{
		double result = Math.sqrt( ( ( obj.getXCoordinate() - xCoordinate) * 
				( ( obj.getXCoordinate() - xCoordinate ) ) ) + ( ( obj.getYCoordinate() - yCoordinate )
						* ( obj.getYCoordinate() - yCoordinate ) ) );
		return result;
	}
	//izracunavanje distance od parametara
	private double distance( double xValue, double yValue )
	{
		double result = Math.sqrt( ( ( xValue - xCoordinate ) * ( ( xValue - xCoordinate ) ) ) + 
				( ( yValue - yCoordinate ) * ( yValue - yCoordinate ) ) );
		return result;
	}
	
	//promjenljive xCoordinate i yCoordinate
	public double xCoordinate;
	public double yCoordinate;

}
