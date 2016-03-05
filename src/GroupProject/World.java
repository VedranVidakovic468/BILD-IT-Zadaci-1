package GroupProject ;

/*
 * Class World designed to save data from database as World objects
 * each objects contains information of 1 country, Country Code, Country name
 * Continent, Region ,SurfaceArea and population
 */
public class World
{
	// default constructor
	public World()
	{

	}

	/**
	 * creates a Object with String a, String b, String c, String d, double e,
	 * int f
	 */
	public World( String code, String name, String continent, String region, double surfaceArea, int population )
	{
		this.code = code ;
		this.name = name ;
		this.continent = continent ;
		this.region = region ;
		this.surfaceArea = surfaceArea ;
		this.population = population ;
	}

	/** returns String country code name */
	public String getCode()
	{
		return code ;
	}

	/** set String Code to new String , (String str) */
	public void setCode( String code )
	{
		this.code = code ;
	}

	/** return String country name */
	public String getName()
	{
		return name ;
	}

	/** set country name to a new name . (String str) */
	public void setName( String name )
	{
		this.name = name ;
	}

	/** returns String Continent */
	public String getContinent()
	{
		return continent ;
	}

	/** set Continent to a new Contient, (String str) */
	public void setContinent( String continent )
	{
		this.continent = continent ;
	}

	/** retruns String region name */
	public String getRegion()
	{
		return region ;
	}

	/** set region name to a new region, (String str) */
	public void setRegion( String region )
	{
		this.region = region ;
	}

	/** returns double surfaceArea value */
	public double getSurfaceArea()
	{
		return surfaceArea ;
	}

	/** sets surfaceArea to a new value, (double area) */
	public void setSurfaceArea( double surfaceArea )
	{
		this.surfaceArea = surfaceArea ;
	}

	/** returns int population count */
	public int getPopulation()
	{
		return population ;
	}

	/** sets population to a new value, ( int value ) */
	public void setPopulation( int population )
	{
		this.population = population ;
	}

	// Declaring variables
	private String code ;
	private String name ;
	private String continent ;
	private String region ;
	double surfaceArea ;
	int population ;
	// end of class
}
