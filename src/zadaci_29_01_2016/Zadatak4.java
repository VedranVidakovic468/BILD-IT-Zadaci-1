package zadaci_29_01_2016;

public class Zadatak4 
{
	public static int sumDigits(long n) //metoda vraca sumu cifara
	{
		int sum = 0; //inicijalizacija sum
		
		while ( n != 0 ) 
		{
			int c = (int) (n%10); // c postaje ostatak pri djeljenu od 10
			sum += c; // sum = sum + c
			n = n /10; 
		}
		return sum; //vrati sumu int
	}
	public static void main(String[] args) 
	{
		
		System.out.println(sumDigits(25114));

	}

}
