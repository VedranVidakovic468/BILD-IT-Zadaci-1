package CreditCardValidation;

import java.util.Scanner;

public class CarTest 
{
	public static void main(String[] args) 
	{
		CardValidation tester = new CardValidation();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a credit card number: ");
        long creditCardNum = input.nextLong();

        if (tester.isValid(creditCardNum)) {
            System.out.println(creditCardNum + " is valid.");
        } else {
            System.out.println(creditCardNum + " is INVALID");
        }
    }
		
	}


