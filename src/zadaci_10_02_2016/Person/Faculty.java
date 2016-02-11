package zadaci_10_02_2016.Person;
//A faculty member has office hours and a rank. A
public class Faculty extends Employee
{
	//constructor of this class that exnteds Employee that extends Person
	public Faculty( String name ) 
	{
		//Faculty extends Employee extends Person 
		super( name );
	}

	//toString method returns string display format for this class
	public String toString() 
	{
		return "Faculty member Name: " + getName() ;
	}
	//variables o this class
	private double hoursWorked;
	private int rank;
	

}
