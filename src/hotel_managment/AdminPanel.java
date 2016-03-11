package hotel_managment ;

import java.awt.event.ActionEvent ;
import java.awt.event.ActionListener ;

import javax.swing.JButton ;
import javax.swing.JFrame ;

public class AdminPanel extends JFrame implements ActionListener
{
	/** displaying admin panel */
	public AdminPanel()
	{
		// set panel title
		super( "Choose option" ) ;
		getContentPane() ;
		// set close operation
		setDefaultCloseOperation( EXIT_ON_CLOSE ) ;
		setLayout( null ) ; // layout is null
		// fixed size window
		setSize( 250, 350 ) ;
		setResizable( false ) ;
		setLocationRelativeTo( null ) ;
		// parameters for register button has actionListener
		registerButton = new JButton( "Register" ) ;
		registerButton.setBounds( 20, 20, 200, 40 ) ;
		registerButton.addActionListener( this ) ;
		add( registerButton ) ;
		// parameters for update button has actionListener
		updateButton = new JButton( "Update" ) ;
		updateButton.setBounds( 20, 60, 200, 40 ) ;
		updateButton.addActionListener( this ) ;
		add( updateButton ) ;
		// parameters for print button has actionListener
		printButton = new JButton( "Print receipt" ) ;
		printButton.setBounds( 20, 100, 200, 40 ) ;
		printButton.addActionListener( this ) ;
		add( printButton ) ;
		// parameters for sign out button has actionListener
		signOutButton = new JButton( "Sign Out Guest" ) ;
		signOutButton.setBounds( 20, 140, 200, 40 ) ;
		signOutButton.addActionListener( this ) ;
		add( signOutButton ) ;
		// parameters for system info button has actionListener
		systemInfoButton = new JButton( "System Info" ) ;
		systemInfoButton.setBounds( 20, 180, 200, 40 ) ;
		systemInfoButton.addActionListener( this ) ;
		add( systemInfoButton ) ;
		// parameters for search user button has actionListener
		searchUsersButton = new JButton( "Search Users" ) ;
		searchUsersButton.setBounds( 20, 220, 200, 40 ) ;
		searchUsersButton.addActionListener( this ) ;
		add( searchUsersButton ) ;
		// parameters for guest Archive button has actionListener
		guestArchiveButton = new JButton( "Guest Archive" ) ;
		guestArchiveButton.setBounds( 20, 260, 200, 40 ) ;
		guestArchiveButton.addActionListener( this ) ;
		add( guestArchiveButton ) ;

		setVisible( true ) ;
	}

	@Override
	// method check which button is pressed and displays equivalent panel
	public void actionPerformed( ActionEvent e )
	{
		if ( e.getSource().equals( registerButton ) )
		{
			RegisterPanel register = new RegisterPanel() ;
		}
		if ( e.getSource().equals( updateButton ))
		{
			UpdatePanel update = new UpdatePanel();
		}

	}

	// Declaring JButtons
	private JButton registerButton ;
	private JButton updateButton ;
	private JButton printButton ;
	private JButton signOutButton ;
	private JButton systemInfoButton ;
	private JButton searchUsersButton ;
	private JButton guestArchiveButton ;

}
