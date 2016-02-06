package zadaci_05_02_2016;

import java.util.Scanner;

/*
 * Algebra: quadratic equations) Design a class named QuadraticEquation for
a quadratic equation ax2 + bx + x = 0. The class contains:
■ Private data fields a, b, and c that represent three coefficients.
■ A constructor for the arguments for a, b, and c.
■ Three getter methods for a, b, and c.
■ A method named getDiscriminant() that returns the discriminant, which is
b2 - 4ac.
■ The methods named getRoot1() and getRoot2() for returning two roots of
the equation
r1=-b+2b2-4ac and r2=-b-2b2-4ac
2a 2a
These methods are useful only if the discriminant is nonnegative. Let these meth- ods return 0 if the discriminant is negative.
Draw the UML diagram for the class and then implement the class. Write a test program that prompts the user to enter values for a,
 b, and c and displays the result based on the discriminant. If the discriminant is positive, display the two roots. If the discriminant is 0, 
 display the one root. Otherwise, display “The equation has no roots.” See Programming Exercise 3.1 for sample runs.
 */

public class QuadraticEquation 
{

	public static void main(String[] args) 
	{
		System.out.println( "Enter values for a, b and c: "); //upit za unos vrijednosti koeficijentima
		double aCoefficient = readDouble();
		double bCoefficient = readDouble();
		double cCoefficient = readDouble();
		
		//pravljenje objekta klase QuadraticEquation koji ima 3 argumenta, to su brojevi koje smo predhodno unijeli
		QuadraticEquation equation = new QuadraticEquation( aCoefficient, bCoefficient, cCoefficient );
		//to string methoda za ispis roota 
		System.out.println( equation.toString() );

	}
	
	//konstruktor QuadraticEquation prima 3 argumenta tipa double
	QuadraticEquation( double a, double b, double c )
	{
		//seteri metode
		setACoefficient(a);
		setBCoefficient(b);
		setCCoefficient(c);
	}
	
	//metoda vraca discriminant tipa double
	private double getDiscriminant()
	{
		double discriminant;
		discriminant = ( Math.pow( b, 2 ) ) - ( 4 * a * b );
		return discriminant;
	}
	
	// metoda vraca korijen 1 tipa double
	private double getRoot1()
	{
		if ( getDiscriminant() < 0 ) // ako je diskriminant negativan broj onda metoda vraca nulu
		{
			return 0;
		}
		else
		{
		double root;
		double dividend = ( - b ) + ( Math.sqrt( getDiscriminant() ) ); // line je djeljenik
		double divisor = 2 * a; // line2 je djelilac
		root = dividend / divisor;
		return root;
		}
	}
	
	//metoda vraca korijen 2 topa double
	private double getRoot2()
	{
		if ( getDiscriminant() < 0 ) // ako je diskriminant negativan broj onda metoda vraca nulu
		{
			return 0;
		}
		else
		{
		double root;
		double dividend = ( - b ) + ( Math.sqrt( getDiscriminant() ) ); // line je djeljenik
		double divisor = 2 * a; // line2 je djelilac
		root = dividend / divisor;
		return root;
		}
	}
	
	//seteri metode za postavljanje vrijednosti koeficijentima
	private void setACoefficient( double aCoefficient )
	{
		a = aCoefficient;
	}
	
	private void setBCoefficient( double bCoefficient )
	{
		b = bCoefficient;
	}
	
	private void setCCoefficient( double cCoefficient )
	{
		c = cCoefficient;
	}
	
	//geter metode za vracanje vrijednosti koeficijenata
	private double getACoefficient()
	{
		return a;
	}
	
	private double getBCoefficient()
	{
		return b;
	}
	
	private double getCCoefficient()
	{
		return c;
	}
	
	//metoda za ucitavanje promjenljive tipa double i vrati tu vrijenost
	public static double readDouble()
	{
		double x = input.nextDouble();
		return x;
	}
	
	//to string metoda za ispis 
	public String toString()
	{
		if ( getDiscriminant() > 0 ) //ako je diskriminant veci od 0
		{
			return String.format( "Root 1 is: %s and Root 2 is: %s ", getRoot1(), getRoot2() );
		}
		else if ( getDiscriminant() == 0 ) // ako je diskriminant jednak nuli
		{
		return String.format( "Root 1 is %s", getRoot1() );
		}
		else
		{
			return String.format( "The equation has no roots." );
		}
	}
	
	// ab i c predstavljaju koeificijente
	private double a;
	private double b;
	private double c;
	
	private static Scanner input = new Scanner(System.in); // scanner objekat za unos
}
