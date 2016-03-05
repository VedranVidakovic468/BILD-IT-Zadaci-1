package GroupProject ;

/*
 * Class MyQuery is designed to establish conection with MySql database 
 * and retrieve data from its tables in ArrayList's
 */
import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.PreparedStatement ;
import java.sql.ResultSet ;
import java.util.ArrayList ;

public class MyQuery
{
	// credentials for database
	private static final String USERNAME = "root" ;
	private static final String PASSWORD = "" ;
	private static final String CONN_STRING = "jdbc:mysql://localhost/world" ;

	/** method returns connection to SQL Database World */
	public static Connection getConnected() throws Exception
	{
		try
		{
			Connection conn = DriverManager.getConnection( CONN_STRING, USERNAME, PASSWORD ) ;
			System.out.println( "Connected" ) ;
			return conn ;
		}
		catch ( Exception e )
		{
			System.out.println( "Insufficient permissions" ) ;
		}
		return null ;
	}

	/**
	 * method that returns ArrayList of type World that contains data from
	 * country table
	 */
	public ArrayList < World > bindTable()
	{
		// creating a new list of type World
		ArrayList < World > list = new ArrayList < World >() ;
		// declaring a PreparedStatement and ResultSet
		PreparedStatement statement ;
		ResultSet rs ;
		try
		{
			// connecting
			Connection conn = getConnected() ;
			// passing query
			statement = conn.prepareStatement( "SELECT * FROM country" ) ;
			// Executing query
			rs = statement.executeQuery() ;

			World world = null ;
			while ( rs.next() )
			{
				// create a new object type world with data from country table
				world = new World( rs.getString( "Code" ), rs.getString( "Name" ), rs.getString( "Continent" ),
						rs.getString( "Region" ), rs.getDouble( "SurfaceArea" ), rs.getInt( "Population" ) ) ;
				// add object to list
				list.add( world ) ;
			}

		}
		catch ( Exception ex )
		{
			System.out.println( ex.getMessage() ) ;
		}
		// return list
		return list ;

	}

	/**
	 * method that returns ArrayList of type World that contains data from
	 * search argument, (String ValToSearch)
	 */
	public ArrayList < World > displaySearch( String ValToSearch )
	{
		//create a new list of type World
		ArrayList < World > list = new ArrayList < World >() ;
		//declaring PreparedStatement and ResultSet variables
		PreparedStatement statement ;
		ResultSet rs ;
		try
		{
			//conecting
			Connection conn = getConnected() ;
			//passing sql query
			statement = conn.prepareStatement( "SELECT * FROM country WHERE Name LIKE '%" + ValToSearch
					+ "%' OR Code LIKE '%" + ValToSearch + "%' OR Continent LIKE '%" + ValToSearch
					+ "%' OR Region LIKE '%" + ValToSearch + "%' OR SurfaceArea LIKE '%" + ValToSearch
					+ "%' OR Population LIKE '%" + ValToSearch + "%'" ) ;
			//executing query
			rs = statement.executeQuery() ;

			World world = null ;
			while ( rs.next() )
			{
				// create a new object type world with data from country table
				world = new World( rs.getString( "Code" ), rs.getString( "Name" ), rs.getString( "Continent" ),
						rs.getString( "Region" ), rs.getDouble( "SurfaceArea" ), rs.getInt( "Population" ) ) ;
				list.add( world ) ;
			}
		}
		catch ( Exception ex )
		{
			System.out.println( ex.getMessage() ) ;
		}
		return list ;
	}

}
