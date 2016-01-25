package GameCraps;

import java.util.Random;

public class GameCrapsRules 
{
	public static int point = 0;
	
	static Random roll = new Random();
	
	public static int dice1;
	public static int dice2;
	public static int sum = rollDice();
	
	public static int rollDice()
	{
		dice1 = 1+roll.nextInt(7);
		dice2 = 1+roll.nextInt(7);
		return sum = dice1 + dice2;
	}
	
	public static void checkRoll(int sum)
	{
	
		
			crapsRoll(sum);
			naturalRoll(sum);
		
			pointRoll(sum);
		
	}
	
	public static void crapsRoll(int sum)
	{
		if ( sum == 2 || sum == 3 || sum == 12)
		{
			System.out.println("Craps are rolled you lose");
		}
	}
	
	public static void naturalRoll(int sum)
	{
		if ( sum == 7 || sum == 11 )
		{
			System.out.println("You win!!!");
		}
	}
	
	public static void pointRoll(int sum)
	{
		int [] points = {4, 5, 6, 8, 9, 10};
		for ( int i = 0; i < points.length; i++ )
		{
			if ( sum ==  point )
			{
				System.out.println("You win!!");
				break;
			}
			if ( sum == points[i])
			{
				System.out.println("Point is "+points[i]);
				point = points[i];
			}
		}
	}
	
	public void setPoint()
	{
	
	}
	
}
