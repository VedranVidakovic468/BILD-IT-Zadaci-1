package zadaci_05_02_2016;

import java.util.Scanner;

/*
 * Algebra: 2 * 2 linear equations) Design a class named LinearEquation for a 2 * 2 system of linear equations:
ax+by=e x= ed-bf y= af-ec cx + dy = f ad - bc ad - bc
The class contains:
■ Private data fields a, b, c, d, e, and f.
■ A constructor with the arguments for a, b, c, d, e, and f.
■ Six getter methods for a, b, c, d, e, and f.
■ A method named isSolvable() that returns true if ad - bc is not 0.
■ Methods getX() and getY() that return the solution for the equation.
Draw the UML diagram for the class and then implement the class. Write a test program that prompts the user to
 enter a, b, c, d, e, and f and displays the result. If ad - bc is 0, report that “The equation has no solution.” 
 See Programming Exercise 3.3 for sample runs.
 */

public class LinearEquation 
{

	public static void main(String[] args) 
	{
		//upit za unos primjenljivih a,b,c,d,e i f
		System.out.println( "Enter values for a, b, c, d, e and f: ");
		//dodjeljivanje promjenjljivih pomocu methode readDouble
		double a = readDouble();
		double b = readDouble();
		double c = readDouble();
		double d = readDouble();
		double e = readDouble();
		double f = readDouble();
		
		//kreiranje objekta equation klase LinearEquation sa prosljedjenim unosom
		LinearEquation equation = new LinearEquation( a, b, c, d, e, f );
		//ispis rezultata
		System.out.println(equation.toString());

	}
	
	//defaultni konstruktor
	public  LinearEquation( double a, double b, double c, double d, double e, double f )
	{
		setAlpha(a);
		setBravo(b);
		setCharlie(c);
		setDelta(d);
		setEcho(e);
		setFox(f); 
	}
	
	//defaultni konstruktor
	public  LinearEquation(  )
	{
	
	}
	
	//metoda za izracunavanje x
	private double getX()
	{
		double dividend = ( echo * delta ) - ( bravo * fox ); //  djeljenik
		double divisor = ( alpha * delta ) - ( bravo * charlie ); // djelitelj
		double result = dividend / divisor;
		return result;	
	}
	//metoda za izracunavanje y
	private double getY()
	{
		double dividend = ( alpha * fox ) - ( echo * charlie );
		double divisor = ( alpha * delta ) - ( bravo * charlie );
		double result = dividend /  divisor;
		return result;
	}
	// metoda koja provjerava dali ima rijesenja
	private boolean isSolvable()
	{
		if ( ( ( alpha * delta ) - ( bravo * charlie ) ) != 0 )
		{
			return true;
		}
		return false;
	}
	// seteri za promjenljive a,b,c,d,e i f
	private void setAlpha( double value )
	{
		alpha = value;
	}
	
	private void setBravo( double value )
	{
		bravo = value;
	}
	
	private void setCharlie( double value )
	{
		charlie = value;
	}
	
	private void setDelta( double value )
	{
		delta = value;
	}
	
	private void setEcho( double value )
	{
		echo = value;
	}
	
	private void setFox( double value )
	{
		fox = value;
	}
	//metoda za ucitavanje promjenljive tipa double i vraca istu vrijednost
	public static double readDouble()
	{
		double x = input.nextDouble();
		return x;
	}
	
	//to string metoda za ispis 
	public String toString()
	{
		if ( !isSolvable() ) //ako je ad - bc = 0
		{
			return String.format( "The equation has no solution." );
		}
		else 
		{
			//ispis rezutata
		return String.format( "Result for x is %s and result for y is %s", getX(), getY() );
		}
	
	}
	
	private static Scanner input = new Scanner(System.in); // scanner objekat za unos
	//promjenljive a,b,c,d,e i f
	private double alpha;
	private double bravo;
	private double charlie;
	private double delta;
	private double echo;
	private double fox;

}
