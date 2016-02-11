package zadaci_10_02_2016.Person;

public class Staff extends Employee
{
	//constructor of this class that extends employee that extends person 
	public Staff( String name )
	{
		//staff extends employee extends person + staff
		super( name);

	}
	
	//toString returns string display format of this class
	public String toString() 
	{
		return "Staff member Name: " + getName() ;
	}

	private String title;

}
