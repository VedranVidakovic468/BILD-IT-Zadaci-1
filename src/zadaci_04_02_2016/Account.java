package zadaci_04_02_2016;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Account 
{

	public static void main(String[] args) 
	{
		

	}
	
	Account()
	{
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		
		
	}
	
	Account (int idNumber, double balanceCash)
	{
		
	}
	
	public void setId ( int idNumber )
	{
		id = idNumber;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setBalance ( double amount )
	{
		balance = amount;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void setAnnualInterestRate( double rate )
	{
		annualInterestRate = rate;
	}
	
	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	
	public String getDateCreated()
	{
		SimpleDateFormat fmt = new SimpleDateFormat("dd-MM-yyyy");
		dateCreated = new Date(System.currentTimeMillis());
		return fmt.format(dateCreated);
	}
	
	public double getMonthlyInterestRate()
	{
		return 1;
	}
	
	public double getMonthlyInterest()
	{
		return 1;
	}
	
	public void withdraw( double amount )
	{
		balance -= amount;
	}
	
	public void deposit( double amount )
	{
		balance += amount;
	}
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

}
