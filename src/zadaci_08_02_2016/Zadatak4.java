package zadaci_08_02_2016;

import java.math.BigDecimal;

/*
 * (Mersenne prime) A prime number is called a Mersenne prime if it can be writ- ten in the form 2p - 1 for
 *  some positive integer p. Write a program that finds all Mersenne primes with p ... 100 and displays the output 
 *  as shown below. (Hint: You have to use BigInteger to store the number, 
 * because it is too big to be stored in long. Your program may take several hours to run.)
 */

public class Zadatak4 
{
	//StartCopyCode source https://github.com/LuizGsa21/intro-to-java-10th-edition/blob/master/src/Chapter_10/Exercise_19.java
	public static void main(String[] args) 
	{
//ispis Mersenne prostih brjeva
	System.out.printf("%-10s%7s\n", "P", "2 * P -1");
    int numberOfPrimes = 0;
    for (int i = 2; numberOfPrimes < 100; i++) {
        if (isPrime(i)) {
            numberOfPrimes++;
            System.out.printf("%-10d%-10s\n", i, getMersennePrime(i));
        }
    }


	}
	//metoda vraca prost broj
public static boolean isPrime(long n) {

    long square = (long) Math.sqrt(n);
    for (int i = 2; i <= square; i++) {

        if (n % i == 0) {
            return false;
        }
    }

    return true;
}
// racunanje Mersenne prostog broja
public static BigDecimal getMersennePrime(int p) {

    return new BigDecimal(2).pow(p).subtract(BigDecimal.ONE);
}

}
//EndCopyCode Ja ahmed razumjem ovaj kod

