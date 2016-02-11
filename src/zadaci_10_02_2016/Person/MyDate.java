package zadaci_10_02_2016.Person;

import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * The MyDate class) Design a class named MyDate. The class contains:
■ The data fields year, month, and day that represent a date. month is 0-based, i.e., 0 is for January.
■ A no-arg constructor that creates a MyDate object for the current date.
■ A constructor that constructs a MyDate object with a specified elapsed time
since midnight, January 1, 1970, in milliseconds.
■ A constructor that constructs a MyDate object with the specified year,
month, and day.
■ Three getter methods for the data fields year, month, and day, respectively.
■ A method named setDate(long elapsedTime) that sets a new date for
the object using the elapsed time.
Draw the UML diagram for the class and then implement the class. Write a testprogramthatcreatestwoMyDateobjects
(usingnew MyDate()andnew MyDate(34355555133101L)) and displays their year, month, and day.
(Hint: The first two constructors will extract the year, month, and day from the elapsed time. 
For example, if the elapsed time is 561555550000 milli- seconds, the year is 1987, the month is 9, and the day is 18. You may use the GregorianCalendar class discussed in Programming Exercise 9.5 to sim- plify coding.)
 */

public class MyDate 
{
	
	public static void main(String[] args) 
	{
		//test programa MyDate
		MyDate rightNow = new MyDate();
		MyDate elapsed = new MyDate( 34355555133101L );
		//Months are indexed from 0 not 1 so 10 is November and 11 will be December.
		System.out.println( rightNow.toString() );
		System.out.println( elapsed.toString() );
	}
	public MyDate()  //constructor that creates a MyDate object for the current date.
	{
		// new calendar object
		GregorianCalendar calendar = new GregorianCalendar();
		setDay( calendar.get( Calendar.DAY_OF_MONTH) );
		//Months are indexed from 0 not 1 so 10 is November and 11 will be December.
		setMonth( calendar.get( Calendar.MONTH ) );
		setYear( calendar.get( Calendar.YEAR ) );


	}
	//  A constructor that constructs a MyDate object with a specified elapsed time since midnight, January 1, 1970, in milliseconds
	public MyDate( long elapsedTime ) 
	{
		setDate( elapsedTime );
	}
	// A constructor that constructs a MyDate object with the specified year, 	month, and day. 
	public MyDate( int day, int month, int year )
	{
		setDay( day );
		setMonth( month );
		setYear( year );
	}
	
	//sets dat to a new value forwarded as parameter
	public void setDay( int newDay )
	{
		day = newDay;
	}
	
	//sets month to a new value forwarded as parameter
	public void setMonth( int newMonth )
	{
		month = newMonth;
	}
	
	//sets year to value forwarded as parameter
	public void setYear( int newYear )
	{
		year = newYear;
	}
	
	//returns int value of day
	public int getDay()
	{
		return day;
	}
	
	//returns month int
	public int getMonth()
	{
		return month;
	}

	//returns int year
	public int getYear() 
	{
		return year;
	}

	// sets a new date for 	the object using the elapsed time.
	public void setDate( long elapsedTime ) 
	{
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTimeInMillis(elapsedTime);
		setDay( calendar.get( Calendar.DAY_OF_MONTH) );
		setMonth( calendar.get( Calendar.MONTH ) );
		setYear( calendar.get( Calendar.YEAR ) );
	}
	// String format for MyDate  Class
	public String toString() 
	{
		return day + "." + month + "." + year;
	}
	//variables of this class
	private int year;
	private int month;
	private int day;
}
