package zadaci_10_02_2016.Person;

/* A student has
*  a class status
*  (freshman, sophomore, junior, or senior).
*/

public class Student extends Person
{
	//Constants of this class
	private final String FRESHMAN = "Freshman";
	private final String SOPHOMORE = "Sophomore";
	private final String JUNIOR = "Junior";
	private final String SENIOR = "Senior";

	// constructot that extends Person 
	public Student( String name) 
	{
		super( name );
	}

	//returns string dosplay format of this class
	public String toString() 
	{
		return "Student Name: " + getName();
	}
	
	private String status;
	
}
