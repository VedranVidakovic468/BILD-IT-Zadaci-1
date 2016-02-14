package zadaci_12_02_2016;
/*
 * (IllegalArgumentException) Modify the Loan class in Listing 10.2 to throw IllegalArgumentException
 *  if the loan amount, interest rate, or number of years is less than or equal to zero.
 */
public class Loan 
{

	public static void main(String[] args)
	{
		try 
		{
            Loan loan = new Loan( 2, 1950, -10 );
        } 
		catch ( IllegalArgumentException ex ) 
		{
            System.out.println( "IllegalArgumentException: " + ex.getMessage() );
        }
	}
	/** default constructor */
	public Loan() 
	{
		this( 2.5, 1, 100 );
	}
	/** Constructor with specified Annual Interest rate, number of yeas and loan amount */
	public Loan( double annualInterestRate, int numberOfYears, double loanAmount )
	{	
		setAnnualInterestRate( annualInterestRate );
		setNumberOfYears( numberOfYears );
		setLoanAmount( loanAmount );
		loanDate = new java.util.Date();
	}
	/** return annualInterestRate */
	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	/** sets annualInterestRate to a new value */
	public void setAnnualInterestRate ( double annualInterestRate )
	{
		if ( annualInterestRate <= 0 )
            throw new IllegalArgumentException( "AnnualInterestRate must be greater than 0.");
		this.annualInterestRate = annualInterestRate;
	}
	/** returns numberOfYears */
	public int getNumberOfYears()
	{
		return numberOfYears;
	}
	/** sets numberOfYears to a new numberOfYears */
	public void setNumberOfYears( int numberOfYears )
	{
		if ( numberOfYears <= 0 )
			throw new IllegalArgumentException( "Number of Years must be greater than 0." );
		this.numberOfYears = numberOfYears;
	}
	/** returns loanAmount*/
	public double getLoanAmount()
	{
		return loanAmount;
	}
	/** sets the loanAmount to a new loanAmount */
	public void setLoanAmount ( double loanAmount )
	{
		if ( loanAmount <= 0 )
			throw new IllegalArgumentException( " Loan amount must be greater than 0." );
		this.loanAmount = loanAmount;
	}
	/** returns monthlyPayment */
	public double getMonthlyPayment() 
	{
	     double monthlyInterestRate = annualInterestRate / 1200;
	     double monthlyPayment = loanAmount * monthlyInterestRate / 
	    		 (1 - (1 / Math.pow( 1 + monthlyInterestRate, numberOfYears * 12 ) ) );
	    return monthlyPayment;
	}

	    /** Find total payment */
	public double getTotalPayment() 
	{
	     double totalPayment = getMonthlyPayment() * numberOfYears * 12;
	     return totalPayment;
	}

	   /** Return loan date */
	public java.util.Date getLoanDate() 
	{
	     return loanDate;
	}
	
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;

}
