package hotel_managment ;

import java.awt.GridLayout ;
import java.awt.event.ActionEvent ;
import java.awt.event.ActionListener ;

import javax.swing.JComboBox ;
import javax.swing.JFrame ;
import javax.swing.JLabel ;
import javax.swing.JPanel ;
import javax.swing.JSpinner ;
import javax.swing.JTable ;
import javax.swing.JTextField ;

/*
 *  Registruje/Prijavi korisnika u hotel (Ime, prezime, spol, broj lične karte, godine, broj i tip sobe u kojoj će korisnik da boravi, vrijeme prijave u hotel, korisničko ime i password za korisnika ... )
 */
public class AdminPanel extends JFrame implements ActionListener
{
	public AdminPanel()
	{
		setSize( 920, 760 ) ;
		setLayout( new GridLayout( 1, 1 ) ) ;
		// setting up top panel
		topPanel = new JPanel( new GridLayout( 5, 4 ) ) ;
		// 1st row
		nameLabel = new JLabel( "Name:" ) ;
		nameText = new JTextField( 20 ) ;
		lastNameLabel = new JLabel( "Last Name:" ) ;
		lastNameText = new JTextField( 20 ) ;
		topPanel.add( nameLabel ) ;
		topPanel.add( nameText ) ;
		topPanel.add( lastNameLabel ) ;
		topPanel.add( lastNameText ) ;

		// 2nd row
		genderLabel = new JLabel( "Gender" ) ;
		genderText = new JTextField() ;
		ssNumberLabel = new JLabel( "Social Security Number:" ) ;
		ssnumberText = new JTextField() ;
		topPanel.add( genderLabel ) ;
		topPanel.add( genderText ) ;
		topPanel.add( ssNumberLabel ) ;
		topPanel.add( ssnumberText ) ;
		add( topPanel ) ;
		setDefaultCloseOperation( EXIT_ON_CLOSE ) ;
		setVisible( true ) ;
	}

	@Override
	public void actionPerformed( ActionEvent e )
	{
		// TODO Auto-generated method stub

	}

	private JLabel nameLabel ;
	private JLabel lastNameLabel ;
	private JLabel genderLabel ;
	private JLabel ssNumberLabel ;

	private JPanel topPanel ;
	private JPanel bottomPanel ;
	// Declaring TextFields
	private JTextField nameText ;
	private JTextField lastNameText ;
	private JTextField genderText ;
	private JTextField ssnumberText ;
	private JTextField ageText ;
	private JTextField roomText ;
	private JTextField userNameText ;
	private JTextField passwordText ;
	// Declaring ComboBox to choose room type
	private JComboBox roomType ;
	// Declaring Spinner
	private JSpinner time ;
	// Declaring JTable
	private JTable guestInfoTable ;

	private String [ ] roomNames =
	{ "Single Bed Room", "Double Bed Room" } ;
}
