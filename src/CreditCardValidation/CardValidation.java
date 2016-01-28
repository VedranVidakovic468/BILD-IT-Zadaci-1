package CreditCardValidation;

public class CardValidation 
{
	
    public static final int PREFIX_VISA = 4;
    public static final int PREFIX_MASTER = 5;
    public static final int PREFIX_AMERICAN_XP = 37;
    public static final int PREFIX_DISCOVERS = 6;

    static int[] prefixes = new int[] {
            PREFIX_VISA, PREFIX_MASTER, PREFIX_AMERICAN_XP, PREFIX_DISCOVERS
    };
    
    public static boolean isValid(long number) {

        if ( getSize( number ) > 16 || getSize( number ) < 13 )
        	{
        	return false;
        	}

        for ( int i = 0; i < prefixes.length; i++ ) 
        {
            if ( getPrefix( number, prefixes[ i ] ) == prefixes[ i ])
            	{
            	break; // ako se prefixi slazu izadji iz loopa
            	}
            if ( i < prefixes.length - 1 )
            	{
            	return false; // no prefix return false
            	}

        }

        int sum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);

        return sum % 10 == 0;
    }

    /** Return true if the digit d is a prefix for number */
    public static boolean prefixMatched(long number, int d) {

        if (d > number) return false;

        long difference = (getSize(number) - getSize(d));

        return d == (int)(number / Math.pow(10, difference));

    }


    /** Return the first k number of digits from number. If the
     * number of digits in number is less than k, return number. */
    public static long getPrefix(long number, int k) {
        if (prefixMatched(number, k)) return k;

        return number;
    }

    /** Get the result from Step 2 */
    public static int sumOfDoubleEvenPlace(long number) {

        int sum = 0;
        while (number > 0) {
            number /= 10;
            int digit = getDigit((int) (number % 10) * 2);
            sum += digit;
            number /= 10;
        }
        return sum;
    }

    /** Return sum of odd-place digits in number */
    public static int sumOfOddPlace(long number) {

        int sum = 0;
        while (number > 0) {

            int digit = (int) (number % 10);
            digit = getDigit(digit);
            sum += digit;
            number /= 100;
        }
        return sum;
    }

    /** Return this number if it is a single digit, otherwise,
     * return the sum of the two digits */
    public static int getDigit(int number) {

        return (number > 9) ? number - 9 : number;
    }

    /** Return the number of digits in d */
    public static int getSize(long d) {

        int size = 0;
        while (d > 0) {
            size++;
            d /= 10;
        }
        return size;
    }
	
}
