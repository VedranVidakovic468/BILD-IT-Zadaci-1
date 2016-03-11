package hotel_managment ;

import java.awt.event.ActionEvent ;
import java.awt.event.ActionListener ;

import javax.swing.JComboBox ;
import javax.swing.JFrame ;
import javax.swing.JLabel ;
import javax.swing.JTextField ;

public class UpdatePanel extends JFrame implements ActionListener
{
	public UpdatePanel()
	{
		super( "Update Panel" ) ;
		getContentPane() ;
		// set default close operation to dispose
		setDefaultCloseOperation( DISPOSE_ON_CLOSE ) ;
		// setLayout to null
		setLayout( null ) ;
		setSize( 900, 600 ) ;
		setLocationRelativeTo( null ) ;

		setVisible( true ) ;
	}

	@Override
	public void actionPerformed( ActionEvent e )
	{
		// TODO Auto-generated method stub

	}

	private JLabel nameLabel ;
	private JLabel lastNameLabel ;

	int [ ] labelDim = new int [ 2 ] ;
	int [ ] textFieldDim = new int [ 2 ] ;

	static int [ ] labelPosition = new int [ 2 ] ;
	static int [ ] textFieldPoition = new int [ 2 ] ;
	private JTextField roomNumberText ;
	private JComboBox roomType ;
	private JTextField nameText ;
	private JTextField lastNameText ;
}
