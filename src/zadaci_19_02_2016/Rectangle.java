package zadaci_19_02_2016;

public class Rectangle extends GeometricObject implements Comparable {
	  private double width;
	  private double height;

	  public Rectangle() {
	  }

	  public Rectangle(double width, double height) {
	    this.width = width;
	    this.height = height;
	  }

	  /** Return width */
	  public double getWidth() {
	    return width;
	  }

	  /** Set a new width */
	  public void setWidth(double width) {
	    this.width = width;
	  }

	  /** Return height */
	  public double getHeight() {
	    return height;
	  }

	  /** Set a new height */
	  public void setHeight(double height) {
	    this.height = height;
	  }

	  @Override /** Return area */
	  public double getArea() {
	    return width * height;
	  }

	  @Override /** Return perimeter */
	  public double getPerimeter() {
	    return 2 * (width + height);
	  }
	  
	public String toString()
	{
		return "Rectangle Area: " + getArea();
	}

	@Override
	public int compareTo( Object o )
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	/** If areas of two Rectangles are the same value return true */
	public boolean equals( GeometricObject o )
	{
		if ( getArea() == o.getArea() )
		{
			return true;
		}
		else return false;
	}
	
}