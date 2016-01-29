package GameCraps;

public class CrapsTest 
{

	public static void main(String[] args) 
	{
		Craps game = new Craps();
		
		//game.play();
		
		CrapsBonus game2 = new CrapsBonus();
		
		for ( int i = 0; i <= 10000; i++ )
		{
			game2.play();
		}
		//Ispis pobjedjenih igrica od 10000 igranja
		System.out.println(game2.brojac);
	}

}
