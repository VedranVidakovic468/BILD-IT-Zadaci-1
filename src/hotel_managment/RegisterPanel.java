package hotel_managment ;

import java.awt.event.ActionEvent ;
import java.awt.event.ActionListener ;
import java.text.Format ;
import java.text.SimpleDateFormat ;
import java.util.Calendar ;
import java.util.Date ;

import javax.swing.ButtonGroup ;
import javax.swing.JButton ;
import javax.swing.JComboBox ;
import javax.swing.JFormattedTextField ;
import javax.swing.JFrame ;
import javax.swing.JLabel ;
import javax.swing.JOptionPane ;
import javax.swing.JRadioButton ;
import javax.swing.JTextField ;

public class RegisterPanel extends JFrame implements ActionListener
{
	// displaying register panel
	public RegisterPanel()
	{
		// title
		super( "Enter guest information" ) ;
		getContentPane() ;
		// set default close operation to dispose
		setDefaultCloseOperation( DISPOSE_ON_CLOSE ) ;
		// setLayout to null
		setLayout( null ) ;
		setSize( 300, 400 ) ;
		setLocationRelativeTo( null ) ;
		// initializing labels on screen
		initLabels() ;
		// initializing text fields on screen
		initTextFields() ;
		// initializing radio buttons on screen
		initRadioButtons() ;
		// initializing combo box on screen
		initComboBox() ;
		// initializing formated text field on screen
		initFormatedTextField() ;
		// initializing buttons on screen
		initButtons() ;

		
		setVisible( true ) ;
	}

	// method for setting up JLabels on screen
	private void initLabels()
	{
		// name label parameters
		nameLabel = new JLabel( "Name:" ) ;
		nameLabel.setBounds( 10, 10, 80, 25 ) ;
		add( nameLabel ) ;
		// last name label parameters
		lastNameLabel = new JLabel( "Last Name:" ) ;
		lastNameLabel.setBounds( 10, 40, 80, 25 ) ;
		add( lastNameLabel ) ;
		// gender label parameters
		genderLabel = new JLabel( "Gender:" ) ;
		genderLabel.setBounds( 10, 70, 80, 25 ) ;
		add( genderLabel ) ;
		// social security number parameters
		ssNumberLabel = new JLabel( "SSN#:" ) ;
		ssNumberLabel.setBounds( 10, 100, 80, 25 ) ;
		add( ssNumberLabel ) ;
		// age label parameters
		ageLabel = new JLabel( "Age:" ) ;
		ageLabel.setBounds( 10, 130, 80, 25 ) ;
		add( ageLabel ) ;
		// room type parameters
		roomTypeLabel = new JLabel( "Room Type:" ) ;
		roomTypeLabel.setBounds( 10, 160, 80, 25 ) ;
		add( roomTypeLabel ) ;
		// room number parameters
		roomNumberLabel = new JLabel( "Room#:" ) ;
		roomNumberLabel.setBounds( 10, 190, 80, 25 ) ;
		add( roomNumberLabel ) ;
		// time label parameters
		timeLabel = new JLabel( "Time:" ) ;
		timeLabel.setBounds( 10, 220, 80, 25 ) ;
		add( timeLabel ) ;
		// user name label parameters
		userNameLabel = new JLabel( "Username: " ) ;
		userNameLabel.setBounds( 10, 250, 80, 25 ) ;
		add( userNameLabel ) ;
		// password label parameters
		passwordLabel = new JLabel( "Password:" ) ;
		passwordLabel.setBounds( 10, 280, 80, 25 ) ;
		add( passwordLabel ) ;

	}

	// method for setting up JTextFields on screen
	private void initTextFields()
	{
		// name text field parameters
		nameText = new JTextField() ;
		nameText.setBounds( 100, 10, 160, 25 ) ;
		add( nameText ) ;
		// last name text field parameters
		lastNameText = new JTextField() ;
		lastNameText.setBounds( 100, 40, 160, 25 ) ;
		add( lastNameText ) ;
		// social security text field parameters
		ssnumberText = new JTextField() ;
		ssnumberText.setBounds( 100, 100, 160, 25 ) ;
		add( ssnumberText ) ;
		// age text field parameters
		ageText = new JTextField() ;
		ageText.setBounds( 100, 130, 160, 25 ) ;
		add( ageText ) ;
		// room number text field parameters
		roomNumberText = new JTextField() ;
		roomNumberText.setBounds( 100, 190, 160, 25 ) ;
		add( roomNumberText ) ;
		// user name text field parameters
		userNameText = new JTextField() ;
		userNameText.setBounds( 100, 250, 160, 25 ) ;
		add( userNameText ) ;
		// password text field parameters has action listener
		passwordText = new JTextField() ;
		passwordText.setBounds( 100, 280, 160, 25 ) ;
		passwordText.addActionListener( this ) ;
		add( passwordText ) ;
	}

	// method for setting up formated text field on screen
	private void initFormatedTextField()
	{
		// creating and calendar object with current time
		Calendar c = Calendar.getInstance() ;
		// creating a date object with current time
		final Date date = c.getTime() ;
		// formatter for time text field
		Format timeFormat = new SimpleDateFormat( "HH:mm:ss" ) ;
		// creating and formated text field with forwarded format
		timeText = new JFormattedTextField( timeFormat ) ;
		// sets the value of the field to current time
		timeText.setValue( date ) ;
		timeText.setBounds( 100, 220, 160, 25 ) ;
		add( timeText ) ;
	}

	// method for setting up radio button on screen
	private void initRadioButtons()
	{
		// male radio button parameters
		male = new JRadioButton( "Male" ) ;
		male.setSelected( true ) ;
		// adding action command
		male.setActionCommand( "Male" ) ;
		male.setBounds( 100, 70, 80, 25 ) ;
		// female radio button parameters
		female = new JRadioButton( "Female" ) ;
		// adding action command
		female.setActionCommand( "Female" ) ;
		female.setBounds( 180, 70, 80, 25 ) ;

		// Button group
		group = new ButtonGroup() ;
		group.add( male ) ;
		group.add( female ) ;
		add( male ) ;
		add( female ) ;

	}

	// method for setting up combo box on screen
	private void initComboBox()
	{
		// initializing Combo box and passing roomNames array as parameter
		roomType = new JComboBox( roomNames ) ;
		// setting up bounds for combo box
		roomType.setBounds( 100, 160, 160, 25 ) ;
		add( roomType ) ;
	}

	// method for setting up buttons on screen
	private void initButtons()
	{
		// back button parameters has action listener
		backButton = new JButton( "back" ) ;
		backButton.setBounds( 10, 310, 140, 50 ) ;
		backButton.addActionListener( this ) ;
		add( backButton ) ;
		// add user button parameters has action listener
		addUserButton = new JButton( "Add+ User " ) ;
		addUserButton.setBounds( 150, 310, 140, 50 ) ;
		addUserButton.addActionListener( this ) ;
		add( addUserButton ) ;
	}

	@Override
	public void actionPerformed( ActionEvent e )
	{

		if ( e.getSource().equals( backButton ) )
		{
			dispose() ;
		}
		if ( e.getSource().equals( addUserButton ) )
		{
			try
			{
				// getting all data from fields into variables
				String name = nameText.getText() ;
				String lastName = lastNameText.getText() ;
				String gender = group.getSelection().getActionCommand() ;
				String ssNumber = ssnumberText.getText() ;
				int age = Integer.parseInt( ageText.getText() ) ;
				String roomType = this.roomType.getSelectedItem().toString() ;
				int roomNumber = Integer.parseInt( roomNumberText.getText() ) ;
				String time = timeText.getText() ;
				String userName = userNameText.getText() ;
				String password = passwordText.getText() ;
				// creating an object of type GuestInformation with parameters
				// from screen

				GuestInformation guest = new GuestInformation( name, lastName, gender, ssNumber, age, roomType,
						roomNumber, time, userName, password ) ;
				// MyQuery object
				MyQuery mq = new MyQuery() ;
				// invoking insertGuest method
				mq.insertGuest( guest ) ;
				JOptionPane.showMessageDialog( this, "Guest successfully added to database", "Added", JOptionPane.INFORMATION_MESSAGE );
				clear();//invoking method clear
			}
			catch ( Exception ex )
			{
				System.out.println( "All fields must be entered" ) ;
				//display error message
				JOptionPane.showMessageDialog( this, "All fields must have a value", "Error",
						JOptionPane.ERROR_MESSAGE ) ;
			}

		}

	}
	//method to clear all fields 
	private void clear()
	{
		nameText.setText( "" );
		lastNameText.setText( "" );
		male.setSelected( true );
		ssnumberText.setText( "" );
		ageText.setText( "" );
		roomType.setSelectedIndex( 0 );
		roomNumberText.setText( "" );
		timeText.setText( "" );
		userNameText.setText( "" );
		passwordText.setText( "" );
	}

	// Declaring JButtons
	private JButton backButton ;
	private JButton addUserButton ;
	// Declaring RadioButtons and BUtton group
	private JRadioButton male ;
	private JRadioButton female ;
	private ButtonGroup group ;
	// Declaring JLabels
	private JLabel nameLabel ;
	private JLabel lastNameLabel ;
	private JLabel genderLabel ;
	private JLabel ssNumberLabel ;
	private JLabel ageLabel ;
	private JLabel roomTypeLabel ;
	private JLabel roomNumberLabel ;
	private JLabel timeLabel ;
	private JLabel userNameLabel ;
	private JLabel passwordLabel ;

	// Declaring TextFields
	private JTextField nameText ;
	private JTextField lastNameText ;
	private JTextField ssnumberText ;
	private JTextField ageText ;
	private JTextField roomNumberText ;
	private JFormattedTextField timeText ;
	private JTextField userNameText ;
	private JTextField passwordText ;
	// Declaring ComboBox to choose room type
	private JComboBox roomType ;
	// room types array
	private String [ ] roomNames =
	{ "Single Bed Room", "Double Bed Room" } ;

}
