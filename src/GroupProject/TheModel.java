package GroupProject ;

import javax.swing.table.AbstractTableModel ;
/*
 * Class model is to setup JTable with String columns, and rows
 */
public class TheModel extends AbstractTableModel
{
	//no args constructor
	public TheModel()
	{
	}
	/** Fill JTable with (Object [][] rows, String [] columnNames) */
	public TheModel( Object [ ] [ ] data, String [ ] columnName )
	{

		this.rows = data ;
		this.columns = columnName ;
	}
	/**returns Class value */
	public Class getColumnClass( int column )
	{
		return getValueAt( 0, column ).getClass() ;
	}
	/** return int row count */
	public int getRowCount()
	{
		return this.rows.length ;
	}
	/** return int column count */
	public int getColumnCount()
	{
		return this.columns.length ;
	}
	/** return Object at specified rowIndex and columnIndex */
	public Object getValueAt( int rowIndex, int columnIndex )
	{

		return this.rows [ rowIndex ] [ columnIndex ] ;
	}
	/** return String column name */
	public String getColumnName( int col )
	{
		return this.columns [ col ] ;
	}
	//Declaring variables
	private String [ ] columns ;
	private Object [ ] [ ] rows ;


}
