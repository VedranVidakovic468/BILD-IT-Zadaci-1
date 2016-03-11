package hotel_managment ;

/*
 * (Ime, prezime, spol, broj lične karte, godine, broj i tip sobe u kojoj će korisnik da boravi, vrijeme prijave u hotel, korisničko ime i password za korisnika ... )
 */
public class GuestInformation
{


	/**
	 * GuestInformation( String name, String lastName, String gender, String
	 * ssNumber, int age, String roomType, int roomNumber, String time, String
	 * userName, String password)
	 */
	public GuestInformation( String name, String lastName, String gender, String ssNumber, int age,
			String roomType, int roomNumber, String time, String userName, String password )
	{
		this.name = name ;
		this.lastName = lastName ;
		this.gender = gender ;
		this.ssNumber = ssNumber ;
		this.age = age ;
		this.roomType = roomType ;
		this.roomNumber = roomNumber ;
		this.time = time ;
		this.userName = userName ;
		this.password = password ;
	}


	public String getName()
	{
		return name ;
	}

	public String getLastName()
	{
		return lastName ;
	}

	public String getGender()
	{
		return gender ;
	}

	public String getSSNumber()
	{
		return ssNumber ;
	}

	public int getAge()
	{
		return age ;
	}

	public String getRoomType()
	{
		return roomType ;
	}

	public int getRoomNumber()
	{
		return roomNumber ;
	}

	public String getTime()
	{
		return time ;
	}

	public String getUserName()
	{
		return userName ;
	}

	public String getPassword()
	{
		return password ;
	}

	public void setName( String name )
	{
		this.name = name ;
	}

	public void setLastName( String lastName )
	{
		this.lastName = lastName ;
	}
	
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	
	public void setSSNumber(String ssNumber)
	{
		this.ssNumber = ssNumber;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setRoomType(String roomType)
	{
		this.roomType = roomType;
	}
	
	public void setRoomNumber( int roomNumber)
	{
		this.roomNumber = roomNumber;
	}
	
	public void setTime(String time)
	{
		this.time = time;
	}
	
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}

	private String name ;
	private String lastName ;
	private String gender ;
	private String ssNumber ;
	private int age ;
	private String roomType ;
	private int roomNumber ;
	private String time ;
	private String userName ;
	private String password ;

}
