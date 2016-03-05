package GroupProject ;

/*
 * Class MainFrame represents the skin of the program
 */
import java.awt.BorderLayout ;
import java.awt.event.ActionEvent ;
import java.awt.event.ActionListener ;
import java.util.ArrayList ;

import javax.swing.JButton ;
import javax.swing.JFrame ;
import javax.swing.JScrollPane ;
import javax.swing.JTable ;
import javax.swing.JTextField ;

public class MainFrame extends JFrame implements ActionListener
{
	/** Returns GUI Objects for handling data from World SQL database */
	public MainFrame()
	{
		// title
		super( "World Info" ) ;
		// layout
		setLayout( new BorderLayout() ) ;

		// initializing text field and button
		fldSearch = new JTextField( "search by any column header..." ) ;
		btnSearch = new JButton( "search" ) ;
		// adding actionListeners
		btnSearch.addActionListener( this ) ;
		fldSearch.addActionListener( this ) ;
		// positioning text field and button
		add( fldSearch, BorderLayout.PAGE_START ) ;// search bar at the top
		add( btnSearch, BorderLayout.PAGE_END ) ;// button at the bottom
		// initializing new JTable object
		tableInfo = new JTable() ;
		initTable() ;// invoking method initTable();

		// initializing new JScrollPane object
		scrollPane = new JScrollPane() ;
		scrollPane.setViewportView( tableInfo ) ;
		// positioning and adding the scroll pane to the layout at center
		add( scrollPane, BorderLayout.CENTER ) ;
		// set default size for frame
		setSize( 960, 720 ) ;
		setDefaultCloseOperation( EXIT_ON_CLOSE ) ;
		setVisible( true ) ;
	}

	/** populating JTable with country table database info */
	private void populateJTable()
	{
		//creating MyQuery object, to connect to database and return info
		MyQuery mq = new MyQuery() ;
		//duplicating  ArratList type World from database
		ArrayList < World > list = mq.bindTable() ; //invoking MyQuery class method
		//JTable Column headers
		String [ ] columnNames =
		{ "Code", "Name", "Continent", "Region", "SurfaceArea`", "Population" } ;
		//row data
		Object [ ] [ ] rows = new Object [ list.size() ] [ 6 ] ;
		for ( int i = 0; i < list.size(); i++ )
		{
			//filling rows with info from database
			rows [ i ] [ 0 ] = list.get( i ).getCode() ;
			rows [ i ] [ 1 ] = list.get( i ).getName() ;
			rows [ i ] [ 2 ] = list.get( i ).getContinent() ;
			rows [ i ] [ 3 ] = list.get( i ).getRegion() ;
			rows [ i ] [ 4 ] = list.get( i ).getSurfaceArea() ;
			rows [ i ] [ 5 ] = list.get( i ).getPopulation() ;
		}
		//creating a model for JTable of rows and columnNames
		TheModel model = new TheModel( rows, columnNames ) ;
		tableInfo.setModel( model ) ;

	}
	/** populating JTable with search result info */
	private void searchTable()
	{
		//creating MyQuery object, to connect to database and return info
		MyQuery mq = new MyQuery() ;
		//creating a list type World from database info
		ArrayList < World > list = mq.displaySearch( fldSearch.getText() ) ; //invoking displaySearch Method
		//JTable Column headers
		String [ ] columnNames =
		{ "Code", "Name", "Continent", "Region", "SurfaceArea`", "Population" } ;
		//row data
		Object [ ] [ ] rows = new Object [ list.size() ] [ 6 ] ;
		for ( int i = 0; i < list.size(); i++ )
		{
			rows [ i ] [ 0 ] = list.get( i ).getCode() ;
			rows [ i ] [ 1 ] = list.get( i ).getName() ;
			rows [ i ] [ 2 ] = list.get( i ).getContinent() ;
			rows [ i ] [ 3 ] = list.get( i ).getRegion() ;
			rows [ i ] [ 4 ] = list.get( i ).getSurfaceArea() ;
			rows [ i ] [ 5 ] = list.get( i ).getPopulation() ;
		}
		//creating a model for JTable of rows and columnNAmes
		TheModel model = new TheModel( rows, columnNames ) ;
		tableInfo.setModel( model ) ;

	}
	/** method set's up JTable with infor */
	public void initTable()
	{
		searchTable() ;
		populateJTable() ;
	}
	
	// listen for event happening on button or textField
	public void actionPerformed( ActionEvent e )
	{
		searchTable() ;
	}

	//Declaring variables
	private JTextField fldSearch ;
	private JButton btnSearch ;
	private JTable tableInfo ;
	private JScrollPane scrollPane ;
}
