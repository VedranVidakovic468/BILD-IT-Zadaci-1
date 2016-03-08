package hotel_managment ;

import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.PreparedStatement ;
import java.sql.ResultSet ;
import java.util.ArrayList ;

import GroupProject.World ;

public class MyQuery
{

	// credentials for database
	private static final String USERNAME = "root" ;
	private static final String PASSWORD = "" ;
	private static final String CONN_STRING = "jdbc:mysql://localhost/hotel" ;

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

	public boolean checkAdminLogin( String userName, String password )
	{
		PreparedStatement statement ;
		ResultSet rs ;
		boolean check = false ;
		try
		{
			// connecting
			Connection conn = getConnected() ;
			// passing query
			statement = conn.prepareStatement( "SELECT * FROM admin" ) ;
			// Executing query
			rs = statement.executeQuery() ;

			while ( rs.next() )
			{
				String user = rs.getString( "username" ) ;
				String pass = rs.getString( "password" ) ;
				if ( userName.equals( user ) && password.equals( pass ) )
				{
					check = true ;
				}
			}

		}
		catch ( Exception ex )
		{
			System.out.println( ex.getMessage() ) ;
		}
		// return boolean
		return check ;

	}
	
	public boolean checkGuestLogin( String userName, String password )
	{
		PreparedStatement statement ;
		ResultSet rs ;
		boolean check = false ;
		try
		{
			// connecting
			Connection conn = getConnected() ;
			// passing query
			statement = conn.prepareStatement( "SELECT * FROM guest" ) ;
			// Executing query
			rs = statement.executeQuery() ;

			while ( rs.next() )
			{
				String user = rs.getString( "username" ) ;
				String pass = rs.getString( "password" ) ;
				if ( userName.equals( user ) && password.equals( pass ) )
				{
					check = true ;
				}
			}

		}
		catch ( Exception ex )
		{
			System.out.println( ex.getMessage() ) ;
		}
		// return boolean
		return check ;

	}
}
