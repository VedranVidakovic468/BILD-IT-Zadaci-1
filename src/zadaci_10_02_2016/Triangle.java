package zadaci_10_02_2016;

import java.util.Scanner;

import javax.naming.RefAddr;

/*
 * (The Triangle class) Design a class named Triangle that extends GeometricObject. The class contains:
■ Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of the triangle.
■ A no-arg constructor that creates a default triangle.
■ A constructor that creates a triangle with the specified side1, side2, and
side3.
■ The accessor methods for all three data fields.
■ A method named getArea() that returns the area of this triangle.
■ A method named getPerimeter() that returns the perimeter of this triangle.
■ A method named toString() that returns a string description for the triangle.
For the formula to compute the area of a triangle, see Programming Exercise 2.19. The toString() method is implemented as follows:
return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
Draw the UML diagrams for the classes Triangle and GeometricObject and implement the classes. 
Write a test program that prompts the user to enter three sides of the triangle, a color, and a Boolean value to indicate whether 
the triangle is filled. The program should create a Triangle object with these sides and set the color and filled properties using the 
input. The program should display the area, perimeter, color, and true or false to indicate whether it is filled or not.
 */
public class Triangle
{

	public static void main(String[] args) 
	{
		//test programa Triangle
		//prompt for user input
		System.out.println( "Enter the values for the sides of a triangle");
		double sideA = readDouble();
		double sideB = readDouble();
		double sideC = readDouble();
		//prompt for color input
		System.out.println( "Enter color of the triangle ");
		String colorTriangle = readString();
		//prompt for boolean input either true or false
		System.out.println( "Enter a boolean value for the triangle to be filled or not" );
		boolean isFilled =  readBoolean();
		//cratign and object myTriangle with user input as parameters
		Triangle myTriangle =  new Triangle( sideA, sideB, sideC );
		myTriangle.setColor( colorTriangle );
		myTriangle.setFill( isFilled );
		System.out.println( myTriangle.toString() );
		
	}
	//default constructor with the initial value of filled to be false
	Triangle()
	{
		setSide1( 1.0 );
		setSide2( 1.0 );
		setSide3( 1.0 );
		setFill( false );
	}
	//A constructor that creates a triangle with specific sides forwarded as parameters
	Triangle ( double s1, double s2, double s3 )
	{
		setSide1( s1 );
		setSide2( s2 );
		setSide3( s3 );
	
	}
	
	//sets value of side1 to a new value forwarded as parameter
	private void setSide1( double value )
	{
		side1 = value;
	}
	//sets value of side2 to a new value forwarded as parameter
	private void setSide2( double value )
	{
		side2 = value;
	}
	//sets value of side 3 to a new value forwarded as parameter
	private void setSide3( double value )
	{
		side3 = value;
	}
	//returns value of side1
	private double getSide1()
	{
		return side1;
	}
	//returns value od side2
	private double getSide2()
	{
		return side2;
	}
	//returns value of side3
	private double getSide3()
	{
		return side3;
	}
	//sets new color of triangle
	private void setColor( String c )
	{
		color = c;
	}
	//returns string what color the triangle is
	private String getColor()
	{
		return color;
	}
	//set filled boolean to true or false
	private void setFill( boolean b )
	{
		filled = b;
	}
	//returns boolean if the triangle is filled or not
	private boolean isFilled()
	{
		return filled;
	}
	
	//returns the area of a triangle
	private double getArea()
	{
		//calculating the half round triangle first, s = side1 + side2 + side3 / 2
		double s = getPerimeter() / 2.0;
		// calculating the area of a triangle
		double triangleArea = Math.sqrt(s * ( ( s - side1 ) * ( s - side2 ) * ( s - side3 ) ) );
		return triangleArea;
	}
	//returnung the perimeter of a triangle
	private double getPerimeter()
	{
		//calculating perimeter by adding sides
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}
	//returns String in bellow format
	public String toString()
	{
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3 + " color = " 
	+ color + " isFilled = " + filled;
	}
	//returns a double value from the user input
	public static double readDouble()
	{
		double value = input.nextDouble();
		return value;
	}
	//returns a string from the user input
	public static String readString()
	{
		String str = input.next();
		return str;
	}
	
	private static boolean readBoolean()
	{
		boolean b = input.nextBoolean();
		return b;
	}
	
	//declaring variable sides of traingle
	private double side1;
	private double side2;
	private double side3;
	//declaring variable color to be the color of the triangle
	private String color;
	//declaring boolean variable to set the triangle to be filled or not
	private boolean filled;
	//Scanner object and variable to get user input
	private static Scanner input = new Scanner( System.in );
}
