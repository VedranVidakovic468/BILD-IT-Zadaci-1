package zadaci_19_02_2016;

public class Circle extends GeometricObject implements Comparable
{
	private double radius;

	public Circle()
	{
	}

	public Circle( double radius )
	{
		this.radius = radius;
	}

	/** Return radius */
	public double getRadius()
	{
		return radius;
	}

	/** Set a new radius */
	public void setRadius( double radius )
	{
		this.radius = radius;
	}

	@Override /** Return area */
	public double getArea()
	{
		return radius * radius * Math.PI;
	}

	/** Return diameter */
	public double getDiameter()
	{
		return 2 * radius;
	}

	@Override /** Return perimeter */
	public double getPerimeter()
	{
		return 2 * radius * Math.PI;
	}

	public String toString()
	{
		return "Circle Area: " + getArea();
	}

	/* Print the circle info */
	public void printCircle()
	{
		System.out.println( "The circle is created " + getDateCreated() + " and the radius is " + radius );
	}

	@Override
	/** returns true if the radius is the same value */
	public boolean equals( GeometricObject o)
	{
		if ( getRadius() == ( ( Circle ) o ).getRadius()  )
		{
			return true;
		}
		else return false;
	}

	@Override
	public int compareTo( Object o )
	{
		// TODO Auto-generated method stub
		return 0;
	}
}