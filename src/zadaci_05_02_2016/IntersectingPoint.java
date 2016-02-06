package zadaci_05_02_2016;

import java.util.Scanner;

/*
 * (Geometry: intersecting point) Suppose two line segments intersect. The two end- points for the first line segment are (x1, y1) and (x2, y2) 
 * and for the second line segment are (x3, y3) and (x4, y4). Write a program that prompts the user to enter these four endpoints and displays the 
 * intersecting point. As discussed in Program- ming Exercise 3.25, the intersecting point can be found by solving a linear equa- tion. Use the LinearEquation
 *  class in Programming Exercise 9.11 to solve this equation. See Programming Exercise 3.25 for sample runs.
 */

public class IntersectingPoint 
{


	static Scanner input = new Scanner (System.in); // scaner objekat za unos
	
	//metoda za unos promjenljive tipda double i vraca takodje tip double
	public static double readDouble()
	{
		double x = input.nextDouble();
		return x;
	}

	public static void main(String[] args) 
	{
		double x1, y1, x2, y2, x3, y3, x4, y4;
		//unos x1,y1 i x2, y4
		System.out.println( "Enter endpoint for the first line segment x1,y1 and x2,y2 :");
		x1 = readDouble();
		y1 = readDouble();
		x2 = readDouble();
		y2 = readDouble();
		
		//unos x3,y3 i x4,y4
		System.out.println( "Enter endpoints for the second line segemnt x3,y3 and x4,y4 :");
		x3 = readDouble();
		y3 = readDouble();
		x4 = readDouble();
		y4 = readDouble();
		
		// prema formuli definisemo vrednosti za a, b, c, d, e, i f
		double a = y1 - y2;
		double b = x1 - x2;
		double c = y3 - y4;
		double d = x3 - x4;
		double e = ( y1 - y2 ) * x1 - ( x1 - x2 ) * y1;
		double f = ( y3 - y4 ) * x3 - ( x3 - x4 ) * y3;
			
		// pravljenje objekta klase LinearEquation sa prosljedjenim vrijednostima izracunatim ranije
		LinearEquation intersectingPoint =  new LinearEquation( a, b, c, d, e, f );
		
		//ispis rezultata 
		System.out.println( intersectingPoint.toString() );

	}
	


}
