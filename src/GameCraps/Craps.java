package GameCraps;

import java.util.Random;

public class Craps 
{

	private Random roll = new Random(); // random objekat za bacanje nasumicnih brojeva
	
	// konstante koje predstavljaju pobjedu ili lost 
	private final static int SNAKE_EYES = 2; // StartCopyCode Source https://www.youtube.com/watch?v=G1Ew9z3tRt4
	private final static int TREY = 3;		
	private final static int SEVEN = 7;
	private final static int ELEVEN = 11;
	private final static int TWELVE = 12; // EndCopyCode  I Ahmed understand this code
	
	// niz stringa koji predstavlja stanje u igrici
	private final static String [] gameStatus = { "Continue", "Won", "Lost" };
	
	public void play()  // StartCopyCode Source https://www.youtube.com/watch?v=G1Ew9z3tRt4
	{
		int myPoint = 0; // inicjalizacija point u slucaju da igrac ne pobjedi ili izgubi
		
		String status; // status inicijalizacija 
		
		int sumOfDice = rollDice(); // prvo bacanje kockica
		
		switch ( sumOfDice )
		{
		case SEVEN:
		case ELEVEN:
			// u slucaju da je sumOfDice 7 ili 11 status je pobjeda i igrica se zavrsava
			status = gameStatus[1];
			break;
		case SNAKE_EYES:
		case TREY:
		case TWELVE:
			// u slucaju da je sumOfDice 2,3 ili 12 status je lost i igrica se zavrsava
			status = gameStatus[2];
			break;
		default:
			// ako sumOfDice nije ni jedan od pobjednickog ili lost zbira onda se izvrsava sledece
			status = gameStatus[0]; // status prima String continue
			myPoint = sumOfDice; // myPoint dobiva vrijdnost od sumOfDice
			System.out.printf( "Point is %d \n", myPoint) ; // ispisivanje my Point
			break;
		}
		
		// ako igrica nije zavrsena i status je continue
		while ( status == gameStatus[0] )
		{
			sumOfDice = rollDice(); // bacamo ponovo kockice
			
			if ( sumOfDice ==  myPoint ) // ako je sumOfDice isti kao myPoint onda je POvjeda
			{
				status = gameStatus[1];
			}
			else
				if ( sumOfDice == SEVEN ) // ako bacimo 7 u ponovnom bacanju onda igrica je izgubljena
			{
				status = gameStatus[2];
			}
		}
		
		// ispis dal je igrac pobjedio ili izgubio
		if ( status == gameStatus[1])
		{
			System.out.println( "You win!!" );
		} else System.out.println( "You lost" );
		
	}
	
	public int rollDice() // metoda za bacanje kockica
	{
		int dice1 = 1 + roll.nextInt(6); 
		int dice2 = 1 + roll.nextInt(6);
		
		int sum = dice1 + dice2; // suma kockica
		// print force za ispis
		System.out.printf( "Player rolled %d + %d = %d \n",dice1, dice2, sum );
		return sum;
	} //  EndCopyCode I Ahmed understand this code. Key is gameStatus controls the flow

}
