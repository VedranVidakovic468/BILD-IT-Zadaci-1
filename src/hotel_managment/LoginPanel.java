package hotel_managment ;

/*
 * Class displaying login panel
 */
import java.awt.event.ActionEvent ;
import java.awt.event.ActionListener ;

import javax.swing.JButton ;
import javax.swing.JFrame ;
import javax.swing.JLabel ;
import javax.swing.JOptionPane ;
import javax.swing.JPasswordField ;
import javax.swing.JTextField ;

public class LoginPanel extends JFrame implements ActionListener
{
	/** displays login screen */
	public LoginPanel()
	{
		super( "Enter User credentials " ) ;
		getContentPane() ;
		setDefaultCloseOperation( EXIT_ON_CLOSE ) ;
		// no layout manager
		setLayout( null ) ;
		// fixed size
		setSize( 300, 150 ) ;
		setResizable( false ) ;
		setLocationRelativeTo( null ) ;
		// user Label parameters
		userLabel = new JLabel( "User" ) ;
		userLabel.setBounds( 10, 10, 80, 25 ) ;
		add( userLabel ) ;
		//user text field parameters has actionListener
		userText = new JTextField( 20 ) ;
		userText.setBounds( 100, 10, 160, 25 ) ;
		userText.addActionListener( this ) ;
		add( userText ) ;
		//password label parameters
		passwordLabel = new JLabel( "Password" ) ;
		passwordLabel.setBounds( 10, 40, 80, 25 ) ;
		add( passwordLabel ) ;
		//password text field parameters has actionListener
		passwordText = new JPasswordField( 20 ) ;
		passwordText.setBounds( 100, 40, 160, 25 ) ;
		passwordText.addActionListener( this ) ;
		add( passwordText ) ;
		//login button parameters has actioListener
		loginButton = new JButton( "login" ) ;
		loginButton.setBounds( 10, 80, 80, 25 ) ;
		loginButton.addActionListener( this ) ;
		add( loginButton ) ;

		setVisible( true ) ;
	}

	// method takes text fields and compares if such string exists in database
	@Override
	public void actionPerformed( ActionEvent e )
	{
		// create and object of MyQuery
		MyQuery mq = new MyQuery() ;
		// invoking method checkAdminLogin
		if ( mq.checkAdminLogin( userText.getText(), passwordText.getText() ) )
		{
			// closing the login panel
			dispose() ;
			// displaying login message
			JOptionPane.showMessageDialog( this, "Logged in as admin succefully", "Login in as admin", JOptionPane.INFORMATION_MESSAGE ) ;
			// displaying new frame
			AdminPanel adminScreen = new AdminPanel() ;
		}
		/*
		 * else if ( mq.checkGuestLogin( userText.getText(),
		 * passwordText.getText() ) ) { GuestPanel guestScreen = new
		 * GuestPanel() ; }
		 */
	}

	// Declaring JComponents
	private JButton loginButton ;
	private JTextField userText ;
	private JPasswordField passwordText ;
	private JLabel userLabel ;
	private JLabel passwordLabel ;

}
