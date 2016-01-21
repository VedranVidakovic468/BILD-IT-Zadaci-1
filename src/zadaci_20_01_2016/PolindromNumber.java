package zadaci_20_01_2016;

public class PolindromNumber
{
	public static int reverse(int number)
	{
		int num = 0; 
		while ( number != 0 ) //loop koji okrene broj
		{
			num = num * 10;
			num = num + number % 10; // ostatak unesenog broja ide na poziciju 1 nvog broja
			number /= 10;
		}
		return num; //vraca broj unazad
	}
	
	public static boolean isPalindrome(int number) // metoda za provjeru polindrom broja
	{
		if ( number == reverse(number) ) // ako je broj isti kao i naopako onda vraca true
		{
			return true;
		}
		else return false; // ako nije polindrom
	}
	
	public static void main(String[] args) 
	{
		System.out.println(isPalindrome(1321));
	}
}
