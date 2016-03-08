package hotel_managment ;

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
		super("Enter User credentials ");
		setDefaultCloseOperation( EXIT_ON_CLOSE ) ;
		setLayout( null ) ;
		setSize( 300, 150 ) ;
		setLocationRelativeTo( null ) ;

		userLabel = new JLabel( "User" ) ;
		userLabel.setBounds( 10, 10, 80, 25 ) ;
		add( userLabel ) ;

		userText = new JTextField( 20 ) ;
		userText.setBounds( 100, 10, 160, 25 ) ;
		add( userText ) ;

		passwordLabel = new JLabel( "Password" ) ;
		passwordLabel.setBounds( 10, 40, 80, 25 ) ;
		add( passwordLabel ) ;

		passwordText = new JPasswordField( 20 ) ;
		passwordText.setBounds( 100, 40, 160, 25 ) ;
		add( passwordText ) ;

		loginButton = new JButton( "login" ) ;
		loginButton.setBounds( 10, 80, 80, 25 ) ;
		loginButton.addActionListener( this ) ;
		add( loginButton ) ;

		setVisible( true ) ;
	}

	@Override
	public void actionPerformed( ActionEvent e )
	{
		MyQuery mq = new MyQuery() ;
		if ( mq.checkAdminLogin( userText.getText(), passwordText.getText() ) )
		{
			JOptionPane.showMessageDialog(this, "Logged in as admin succefully");
			AdminPanel adminScreen = new AdminPanel() ;
		}
	/*	else if ( mq.checkGuestLogin( userText.getText(), passwordText.getText() ) )
		{
			GuestPanel guestScreen = new GuestPanel() ;
		}
 */
	}

	// Declaring JComponents
	private JButton loginButton ;
	private JTextField userText ;
	private JPasswordField passwordText ;
	private JLabel userLabel ;
	private JLabel passwordLabel ;

}
