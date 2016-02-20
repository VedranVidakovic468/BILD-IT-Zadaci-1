package zadaci_19_02_2016;

import java.text.DecimalFormat;

public class Octagon extends GeometricObject implements Comparable <Octagon>, Cloneable
{

	//constructor with parameter side
	public Octagon( double side )
	{
		this.side = side;
	}


	@Override
	/** returns true if are of two Octagons is the same */
	public boolean equals( GeometricObject o )
	{
		if ( getArea() == o.getArea() )
		{
			return true;
		}
		return false;
	}

	@Override
	/** returns area of Octagon */
	public double getArea()
	{
		double area = ( 2.0 + 4.0 / Math.sqrt( 2 ) * side * side );
		return area;
	}

	@Override
	/** returns perimeter of Octagon */
	public double getPerimeter()
	{
		return side * 8;
	}
/** clone object */
	public Object clone() throws CloneNotSupportedException 
	{ 
		return super.clone();
	}
	

	public String toString()
	{
		return "Octagon area is " + formatter.format( this.getArea() ) + " and its perimeter is " + this.getPerimeter();
	}

	DecimalFormat formatter = new DecimalFormat( "##.###" );
	private double side;
	
	@Override
	/** comparable method returns 1 if object 1 is greater than object 2 */
	public int compareTo( Octagon o )
	{
		if ( getArea() > o.getArea() )
		{
			return 1;
		}
		else if ( equals( o ) )
		{
			return -1;
		}
		else return 0;
	}

}
