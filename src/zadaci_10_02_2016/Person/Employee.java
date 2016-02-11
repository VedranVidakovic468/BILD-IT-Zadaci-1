package zadaci_10_02_2016.Person;

public class Employee extends Person
{
	
	//constructor of class employee that extends person
	public Employee( String name ) 
	{
		super( name);
	}

	// toString method returns display format for this class
	public String toString() 
	{
		return "Employee Name: " + getName() ;
	}
	//variables for this class
	private double salary;
	private String office;
	private MyDate dateHired;

}
