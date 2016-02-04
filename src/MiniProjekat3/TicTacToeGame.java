package MiniProjekat3;

import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.*;

public class TicTacToeGame extends JFrame implements ActionListener
{
	
	// StartCopyCode http://www.dreamincode.net/forums/topic/321933-creating-a-calculator-using-jframe/
	public final void setDesign() // bez ove metode moj startup window je u najmanjim dimenzijama
	{
		try
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch(Exception e)
		{
		}
	}  //EndCopyCode Ja Ahmed razumjem ovaj kod
	

	//metoda play koja inicijalizuje dugmad i pokrece prozor dimenzija navedenih
	public void play()
	{
		setTitle("TicTacToe");
		setDesign(); 
		setSize(400, 400); // psotavljanje startne dimenzije
		initButtons();
		setDefaultCloseOperation(EXIT_ON_CLOSE); // izlazi iz programa na dugme X
		setVisible(true);
	}
	
	
	public void initButtons() // inicijalizacija objekata dugmad
	{
		
		setLayout(new GridLayout(3,3));
		btn1 = new JButton();
		add ( btn1 );
		btn2 = new JButton();
		add ( btn2 );
		btn3 = new JButton();
		add ( btn3 );
		btn4 = new JButton();
		add ( btn4 );
		btn5 = new JButton();
		add ( btn5 );
		btn6 = new JButton();
		add ( btn6 );
		btn7 = new JButton();
		add ( btn7 );
		btn8 = new JButton();
		add ( btn8 );
		btn9 = new JButton();
		add ( btn9 );
		
		addActionListeners();
			
	}
	
	
	private void addActionListeners() //dodavanje actionListenera dugmadima
		{
			btn1.addActionListener(this);
			btn2.addActionListener(this);
			btn3.addActionListener(this);
			btn4.addActionListener(this);
			btn5.addActionListener(this);
			btn6.addActionListener(this);
			btn7.addActionListener(this);
			btn8.addActionListener(this);
			btn9.addActionListener(this);
		}

	
	public void actionPerformed (ActionEvent e )
		{
			getPlayer(); //metoda vraca string igraca X ili O
			//provjera koje je dugme stisnuto i stavlja se text na dugme ako je prazno
			if ( e.getSource() == btn1 && btn1.getText().isEmpty() )
			{
				btn1.setText(currentPlayer); //postavljanje texta na dugme
				checkWinner(); // ispitivanje pobjednika
				swapPlayers(); // zamjeni igrace
				//princip se ponavlja na ostalim dugmadima
			}	
			if ( e.getSource() == btn2 && btn2.getText().isEmpty() )
			{
				btn2.setText(currentPlayer);
				checkWinner();
				swapPlayers();
			}
			if ( e.getSource() == btn3 && btn3.getText().isEmpty() )
			{
				btn3.setText(currentPlayer);
				checkWinner();
				swapPlayers();
			}
			if ( e.getSource() == btn4 && btn4.getText().isEmpty() )
			{
				btn4.setText(currentPlayer);
				checkWinner();
				swapPlayers();
			}
			if ( e.getSource() == btn5 && btn5.getText().isEmpty() )
			{
				btn5.setText(currentPlayer);
				checkWinner();
				swapPlayers();
			}
			if ( e.getSource() == btn6 && btn6.getText().isEmpty() )
			{
				btn6.setText(currentPlayer);
				checkWinner();
				swapPlayers();
			}
			if ( e.getSource() == btn7 && btn7.getText().isEmpty() )
			{
				btn7.setText(currentPlayer);
				checkWinner();
				swapPlayers();
			}
			if ( e.getSource() == btn8 && btn8.getText().isEmpty() )
			{
				btn8.setText(currentPlayer);
				checkWinner();
				swapPlayers();
			}
			if ( e.getSource() == btn9 && btn9.getText().isEmpty() )
			{
				btn9.setText(currentPlayer);
				checkWinner();
				swapPlayers();
			}
		}
	
	// metoda koja ispituje da li je po horizontali u bilo kojem redu nalaze 3 X'a ili 3 O
	private static void checkHorizontal()
	{
		//ako je dugme 1,2 i 3 X prikazi pobjednika igraca X
		if ( btn1.getText() == playerX && btn2.getText() == playerX && btn3.getText() == playerX )
		{
			JOptionPane.showMessageDialog(null, "Player "+ playerX + " WON ", "Congrats", JOptionPane.PLAIN_MESSAGE);
			System.exit(0);
		}
		else if ( btn1.getText() == playerO && btn2.getText() == playerO && btn3.getText() == playerO )
		{
			JOptionPane.showMessageDialog(null, "Player "+ playerO + " WON ", "Congrats", JOptionPane.PLAIN_MESSAGE);
			System.exit(0);
		}
		else if ( btn4.getText() == playerX && btn5.getText() == playerX && btn6.getText() == playerX )
		{
			JOptionPane.showMessageDialog(null, "Player "+ playerX + " WON ", "Congrats", JOptionPane.PLAIN_MESSAGE);
			System.exit(0);
		}
		else if ( btn4.getText() == playerO && btn5.getText() == playerO && btn6.getText() == playerO )
		{
			JOptionPane.showMessageDialog(null, "Player "+ playerO + " WON ", "Congrats", JOptionPane.PLAIN_MESSAGE);
			System.exit(0);
		}
		else if ( btn7.getText() == playerX && btn8.getText() == playerX && btn9.getText() == playerX )
		{
			JOptionPane.showMessageDialog(null, "Player "+ playerX + " WON ", "Congrats", JOptionPane.PLAIN_MESSAGE);
			System.exit(0);
		}
		else if ( btn7.getText() == playerO && btn8.getText() == playerO && btn9.getText() == playerO )
		{
			JOptionPane.showMessageDialog(null, "Player "+ playerO + " WON ", "Congrats", JOptionPane.PLAIN_MESSAGE);
			System.exit(0);
		}
	}
	
	// metoda koja ispituje da li je po vertikali u bilo kojoj koloni nalaze 3 X'a ili 3 O
	private static void checkVertical()
	{
		//ako je dugme 1,4 i 7 oznaceno X'om igrac x je pobjednik
		if ( btn1.getText() == playerX && btn4.getText() == playerX && btn7.getText() == playerX )
		{
			JOptionPane.showMessageDialog(null, "Player "+ playerX + " WON ", "Congrats", JOptionPane.PLAIN_MESSAGE);
			System.exit(0);
		}
		else if ( btn1.getText() == playerO && btn4.getText() == playerO && btn7.getText() == playerO )
		{
			JOptionPane.showMessageDialog(null, "Player "+ playerO + " WON ", "Congrats", JOptionPane.PLAIN_MESSAGE);
			System.exit(0);
		}
		else if ( btn2.getText() == playerX && btn5.getText() == playerX && btn8.getText() == playerX )
		{
			JOptionPane.showMessageDialog(null, "Player "+ playerX + " WON ", "Congrats", JOptionPane.PLAIN_MESSAGE);
			System.exit(0);
		}
		else if ( btn2.getText() == playerO && btn5.getText() == playerO && btn8.getText() == playerO )
		{
			JOptionPane.showMessageDialog(null, "Player "+ playerO + " WON ", "Congrats", JOptionPane.PLAIN_MESSAGE);
			System.exit(0);
		}
		else if ( btn3.getText() == playerX && btn6.getText() == playerX && btn9.getText() == playerX )
		{
			JOptionPane.showMessageDialog(null, "Player "+ playerX + " WON ", "Congrats", JOptionPane.PLAIN_MESSAGE);
			System.exit(0);
		}
		else if ( btn3.getText() == playerO && btn6.getText() == playerO && btn9.getText() == playerO )
		{
			JOptionPane.showMessageDialog(null, "Player "+ playerO + " WON ", "Congrats", JOptionPane.PLAIN_MESSAGE);
			System.exit(0);
		}
		
	}
	// metoda koja ispituje da li se po vertikali nalaze 3 X'a ili 3 O
	private static void checkDiagonal()
	{
		//ako je dugme 1,5 i 9 oznaceno igrax X je pobjednik
		if ( btn1.getText() == playerX && btn5.getText() == playerX && btn9.getText() == playerX )
		{
			JOptionPane.showMessageDialog(null, "Player "+ playerX + " WON ", "Congrats", JOptionPane.PLAIN_MESSAGE);
			System.exit(0);
		}
		else if ( btn1.getText() == playerO && btn5.getText() == playerO && btn9.getText() == playerO )
		{
			JOptionPane.showMessageDialog(null, "Player "+ playerO + " WON ", "Congrats", JOptionPane.PLAIN_MESSAGE);
			System.exit(0);
		}
		else if ( btn3.getText() == playerX && btn5.getText() == playerX && btn7.getText() == playerX )
		{
			JOptionPane.showMessageDialog(null, "Player "+ playerO + " WON ", "Congrats", JOptionPane.PLAIN_MESSAGE);
			System.exit(0);
		}
		else if ( btn3.getText() == playerO && btn5.getText() == playerO && btn7.getText() == playerO )
		{
			JOptionPane.showMessageDialog(null, "Player "+ playerO + " WON ", "Congrats", JOptionPane.PLAIN_MESSAGE);
			System.exit(0);
		}
	}
	
	//metoda koja provjerava pobjednika po svim mogucim kombinacijama
	private static void checkWinner()
	{
		checkHorizontal();
		checkVertical();
		checkDiagonal();
	}

	//metoda vraca String X ili O
	private static String getPlayer()
	{
		if ( currentPlayer.isEmpty() ) //u slucaju da je currentPlayer 0 
		{
			initPlayer();
		}
		return currentPlayer;
	}
	
	public static String swapPlayers() //mijenjanje igraca nakon svakog stiska na dugme
	{
		if ( currentPlayer == playerX )
		{
			currentPlayer = playerO;
		}
		else initPlayer();
		return currentPlayer;
	}
	
	public static void initPlayer() //inicijalizacija igraca currentPLayer = X
	{
		currentPlayer = playerX;
	}
	
	private static final String playerX = "X"; //konstanta string X
	private static final String playerO = "0"; //konstanta string O
	private static String currentPlayer = ""; // trenurni igrac

	//kreiranje instance promjenljivih tipa JButton
	private static JButton btn1;
	private static JButton btn2;
	private static JButton btn3;
	private static JButton btn4;
	private static JButton btn5;
	private static JButton btn6;
	private static JButton btn7;
	private static JButton btn8;
	private static JButton btn9;
	
	
}
