package zadaci_10_02_2016.Person;

/*
 * (The Person, Student, Employee, Faculty, and Staff classes) Design a class named Person and its two subclasses named Student
 *  and Employee. 
 * Make Faculty and Staff subclasses of Employee. A person has a name, address, phone number, and email address. A student has
 *  a class status
 *  (freshman, sophomore, junior, or senior). Define the status as a constant. An employee has an office, salary, and date hired. 
 *  Use the MyDate class defined in Programming Exercise 10.14 to create an object for date hired. A faculty member has office hours and 
 *  a rank. A staff member has a title. Override the toString method in each class to display the class name and the person’s name.
Draw the UML diagram for the classes and implement them. Write a test pro- gram that creates a Person, Student, Employee, Faculty,
 and Staff, and invokes their toString() methods.
 */
public class Person
{	
	
	Person()
	{
		
	}
	//constructor that creates and object of this class with specified values forwarded as parameter
	Person( String name )
	{
		//sets the values
		setName( name );
	}
	
	//sets name in string format
	private void setName( String fullName ) 
	{
		name = fullName;	
	}
	//returns string name
	public String getName()
	{
		return name;
	}

	//toString method displays string format of this class
	public String toString() 
	{
		return "Person Name: " + getName() ;
	}
	//variables for this class
	private String name;
	private String address;
	private String phoneNumber;
	private String emailAddress;

}
