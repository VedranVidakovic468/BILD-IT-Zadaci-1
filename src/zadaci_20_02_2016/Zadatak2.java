package zadaci_20_02_2016;

import java.math.BigInteger;

public class Zadatak2 extends Number implements Comparable < Zadatak2 >
{
	// Data fields for numerator and denominator
	private BigInteger numerator = new BigInteger( "0" );
	private BigInteger denominator = new BigInteger( "1" );

	/** Construct a rational with default properties */
	public Zadatak2()
	{
		this( BigInteger.ZERO, BigInteger.ONE );
	}

	/** Construct a rational with specified numerator and denominator */
	public Zadatak2( BigInteger numerator, BigInteger denominator )
	{
		long num = numerator.longValue();
		long den = denominator.longValue();
		long gcd = gcd( num, den );
		long n = ( ( den > 0 ) ? 1 : -1 ) * num / gcd;
		this.numerator = new BigInteger( n + "" );
		long d = Math.abs( den ) / gcd;
		this.denominator = new BigInteger( d + "" );
	}

	/** Find GCD of two numbers */
	private static long gcd( long n, long d )
	{
		long n1 = Math.abs( n );
		long n2 = Math.abs( d );
		int gcd = 1;

		for ( int k = 1; k <= n1 && k <= n2; k++ )
		{
			if ( n1 % k == 0 && n2 % k == 0 )
				gcd = k;
		}

		return gcd;
	}

	/** Return numerator */
	public BigInteger getNumerator()
	{
		return numerator;
	}

	/** Return denominator */
	public BigInteger getDenominator()
	{
		return denominator;
	}

	/** Add a rational number to this rational */
	public Zadatak2 add( Zadatak2 secondRational )
	{
		BigInteger n = numerator.multiply( secondRational.getDenominator() )
				.add( denominator.multiply( secondRational.getNumerator() ) );
		BigInteger d = denominator.multiply( secondRational.getDenominator() );
		return new Zadatak2( n, d );
	}

	/** Subtract a rational number from this rational */
	public Zadatak2 subtract( Zadatak2 secondRational )
	{
		BigInteger n = numerator.multiply( secondRational.getDenominator() )
				.subtract( denominator.multiply( secondRational.getNumerator() ) );
		BigInteger d = denominator.multiply( secondRational.getDenominator() );
		return new Zadatak2( n, d );
	}

	/** Multiply a rational number to this rational */
	public Zadatak2 multiply( Zadatak2 secondRational )
	{
		BigInteger n = numerator.multiply( secondRational.getNumerator() );
		BigInteger d = denominator.multiply( secondRational.getDenominator() );
		return new Zadatak2( n, d );
	}

	/** Divide a rational number from this rational */
	public Zadatak2 divide( Zadatak2 secondRational )
	{
		BigInteger n = numerator.multiply( secondRational.getDenominator() );
		BigInteger d = denominator.multiply( secondRational.getNumerator() );
		return new Zadatak2( n, d );
	}

	@Override
	public String toString()
	{
		if ( denominator.equals( "1" ) )
			return numerator + "";
		else
			return numerator + "/" + denominator;
	}

	@Override // Override the equals method in the Object class
	public boolean equals( Object other )
	{
		if ( ( this.subtract( ( Zadatak2 ) ( other ) ) ).getNumerator().equals( "0" ) )
			return true;
		else
			return false;
	}

	@Override // Implement the abstract intValue method in Number
	public int intValue()
	{
		return ( int ) doubleValue();
	}

	@Override // Implement the abstract floatValue method in Number
	public float floatValue()
	{
		return ( float ) doubleValue();
	}

	@Override // Implement the doubleValue method in Number
	public double doubleValue()
	{
		BigInteger x = numerator.divide( denominator );
		double n = x.doubleValue();
		return n;
	}

	@Override // Implement the abstract longValue method in Number
	public long longValue()
	{
		return ( long ) doubleValue();
	}

	@Override // Implement the compareTo method in Comparable
	public int compareTo( Zadatak2 o )
	{
		if ( this.subtract( o ).getNumerator().intValue() > 0 )
			return 1;
		else if ( this.subtract( o ).getNumerator().intValue() < 0 )
			return -1;
		else
			return 0;
	}
}