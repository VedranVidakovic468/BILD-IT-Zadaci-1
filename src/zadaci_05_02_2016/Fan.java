package zadaci_05_02_2016;

/*
 * (The Fan class) Design a class named Fan to represent a fan. The class contains:
■ Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to denote the fan speed.
■ A private int data field named speed that specifies the speed of the fan (the default is SLOW).
■ A private boolean data field named on that specifies whether the fan is on (the default is false).
■ A private double data field named radius that specifies the radius of the fan (the default is 5).
■ A string data field named color that specifies the color of the fan (the default is blue).
■ The accessor and mutator methods for all four data fields.
■ A no-arg constructor that creates a default fan.
■ A method named toString() that returns a string description for the fan. If
the fan is on, the method returns the fan speed, color, and radius in one com- bined string.
 If the fan is not on, the method returns the fan color and radius along with the string “fan is off” in 
 one combined string. Draw the UML diagram for the class and then implement the class. 
 Write a test program that creates two Fan objects. Assign maximum speed, radius 10, color yellow,
  and turn it on to the first object. Assign medium speed, radius 5, color blue, and turn it off to the 
  second object. Display the objects by invoking their toString method.
 */

public class Fan 
{
	//konstante predstavljaju brzinu ventilatora
	private static final int SLOW = 1;
	private static final int MEDIUM = 2;
	private static final int FAST = 3;
	
	public static void main(String[] args) 
	{
		//pravljenje objeta klase fan
		Fan fan1 =  new Fan();
		Fan fan2 =  new Fan();
		
		//postavljanje attributa na fan1
		fan1.setSpeed( FAST );
		fan1.setRadius( 10 );
		fan1.setColor( "yellow" );
		fan1.setPowerOn();
		
		//postavljanje attributa na fan2
		fan2.setSpeed( MEDIUM );
		fan2.setRadius( 5 );
		fan2.setColor( "blue" );
		fan2.setPowerOff();
		
		//ispis ventilatora 1 i 2
		System.out.println(fan1.toString());
		System.out.println(fan2.toString());
		

	}
	
	//defaultni konstruktor
	Fan()
	{
		setSpeed( SLOW );
		setPowerOff();
		setRadius( 5 );
		setColor( "Blue" );
	}
	
	//postavljanje brzine ventilatora seter
	private void setSpeed( int option )
	{
		speed = option;
	}
	
	private int getSpeed()
	{
		return speed;
	}
	//set Power on i Power Off za ukljucivanje i iskljucivanje ventilatora
	private void setPowerOn()
	{
		on = true;
	}
	
	private void setPowerOff()
	{
		on = false;
	}
	//getter za power
	private boolean getPower()
	{
		return on;
	}
	//seter radius prima argumenat double r
	private void setRadius( double r )
	{
		radius = r;
	}
	
	private double getRadius()
	{
		return radius;
	}
	//psotavljanje boje ventilatora
	private void setColor( String c )
	{
		color = c;
	}
	
	private String getColor()
	{
		return color;
	}
	
	//to string metoda za ispis poruke
	public String toString()
	{
		if (on == true )
		{
			return String.format( "Current Fan speed is %s, color is %s and radius %s", speed, color, radius );
		}
		else
		{
		return String.format( "Fan speed is off, color is %s and radius %s", color, radius );
		}
	}
	
	//promjenljive klase fan
	private int speed;
	private boolean on;
	private double radius;
	private String color;
}
