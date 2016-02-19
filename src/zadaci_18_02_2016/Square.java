package zadaci_18_02_2016;

public class Square extends GeometricObject implements Colorable
{

	public static void main( String [ ] args )
	{
		// TODO Auto-generated method stub

	}
	/** default constructor takes double values for width and height*/
	Square ( double width, double height )
	{
	    this.width = width;
	    this.height = height;
	}
	
	@Override
	/** display Color all four sides */
	public void howToColor()
	{
		System.out.println( "Color all four sides" );
		
	}

	@Override
	/** returns the area of a square */
	public double getArea()
	{
		return width * height;
	}

	@Override
	/** returns perimeter of a square */
	public double getPerimeter()
	{
		double perimeter;
		perimeter = Math.sqrt( getArea() );
		return perimeter;
	}
	/** return width */
	public double getWidth()
	{
		return width;
	}
	/** return height */
	public double getHeight()
	{
		return height;
	}
	/** set width */
	public void setWidth( double width )
	{
		this.width = width;
	}
	/** set height */
	public void setHeight( double height )
	{
		this.height = height;
	}
	
	public String toString()
	{
		return  "Square Area: " + getArea();
	}
	
	private double width;
	private double height;

}
