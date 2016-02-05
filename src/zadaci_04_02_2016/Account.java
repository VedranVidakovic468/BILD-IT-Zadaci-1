package zadaci_04_02_2016;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Account 
{

	public static void main(String[] args) 
	{
		//test programa account
		Account test = new Account( 1122, 20000 );
		test.setAnnualInterestRate(4.5);
		System.out.println( "ID is: " + test.getId() );
		System.out.println("Display balance" );
		System.out.println( test.getBalance() );
		System.out.println( "Withdraw 2500...");
		test.withdraw( 2500 );
		System.out.println( test.getBalance() );
		System.out.println( "Deposit 3000..." );
		test.deposit( 3000 );
		System.out.println( test.getBalance() );
		System.out.println( "Monthly interest..." );
		System.out.println( test.getMonthlyInterest() );
		System.out.println( "Date created...");
		System.out.println( test.getDateCreated() );

	}
	// konstruktor account bez argumenata
	Account()
	{
		id = 0;
		balance = 0;
		annualInterestRate = 0;	
	}
	
	//inicijalizacija account klase sa prosljedjenim id number i kesom
	Account (int idNumber, double balanceCash)
	{
		setId(idNumber);
		setBalance(balanceCash);
	}
	
	// metoda setId Id dobiva vrijednost
	public void setId ( int idNumber )
	{
		id = idNumber;
	}
	//vracanje id vrijednosti int
	public int getId()
	{
		return id;
	}
	//postavljanje stanja racuna
	public void setBalance ( double amount )
	{
		balance = amount;
	}
	//provjera stanja
	public double getBalance()
	{
		return balance;
	}
	//postavljanje godisnje interesne stope
	public void setAnnualInterestRate( double rate )
	{
		annualInterestRate = rate;
	}
	//vraca vriijednost godistnje interestnsne stop u %
	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	//vraca string kad je account kreiran
	public String getDateCreated()
	{
		SimpleDateFormat fmt = new SimpleDateFormat("dd-MM-yyyy");
		dateCreated = new Date(System.currentTimeMillis());
		return fmt.format(dateCreated);
	}
	
	/*
	 * Monthly interest is balance * monthlyInterestRate. monthlyInterestRate is annualInterestRate / 12. 
	 * Note that annualInterestRate is a percentage, e.g., like 4.5%. You need to divide it by 100.)
	 */
	//metoza za izracunavanje mjesecne interesne stop vrati double u %
	public double getMonthlyInterestRate()
	{
		annualInterestRate = annualInterestRate / 100;
		double monthlyInterestRate = annualInterestRate / 12;
		monthlyInterestRate = monthlyInterestRate * 100;
		return monthlyInterestRate; 
	}
	//metoda za izracunavanje mjesecnog interesa
	public double getMonthlyInterest()
	{
		double monthlyInterest =  balance * getMonthlyInterestRate();
		return monthlyInterest;
	}
	// metoda za smanjivanja stanja na racunu
	public void withdraw( double amount )
	{
		balance -= amount;
	}
	//metoda za dodavanje na racun
	public void deposit( double amount )
	{
		balance += amount;
	}
	//promjenljive klase Account
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

}
