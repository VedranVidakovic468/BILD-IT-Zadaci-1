package hotel_managment ;

/*
 * class designed to create a object of taken services to add it to the GUI and update database
 */
public class Services
{
	private String username ;
	private double total ;
	// Declaring constants
	private final double GYM = 10 ;
	private final double CINEMA = 10 ;
	private final double POOL = 10 ;
	private final double RESTAURANT = 20 ;
	private final double SAUNA = 10 ;
	private final double SINGLE_ROOM = 20 ;

	// no-arg konstruktor
	public Services()
	{

	}

	// constructor with data fields
	public Services( double gym, double cinema, double pool, double restaurant, double sauna, String username )
	{
		super() ;
		gym *= GYM ;
		cinema *= CINEMA ;
		pool *= POOL ;
		restaurant = RESTAURANT ;
		sauna *= SAUNA ;
		this.username = username ;

		total = gym + cinema + pool + restaurant + sauna ;
	}

	/** returns total sum of all services */
	// total displays result only if a object of class services is created
	public double getTotal()
	{
		return total ;
	}

	/** return gym price */
	public double getGym()
	{
		return GYM ;
	}

	/** return cinema price */
	public double getCinema()
	{
		return CINEMA ;
	}

	/** return pool price */
	public double getPool()
	{
		return POOL ;
	}

	/** return restaurant price */
	public double getResturant()
	{
		return RESTAURANT ;
	}

	/** return double price */
	public double getSauna()
	{
		return SAUNA ;
	}

	/** return user name */
	public String getUsername()
	{
		return username ;
	}

}
