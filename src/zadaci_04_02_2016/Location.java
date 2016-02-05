package zadaci_04_02_2016;

// Location klasa za cuvanje podataka gdje se nalazi najveci elemenat u matrici i njegova vrijednost
public class Location
{

	// inicijalizacija promjenljivih
	public static int row = 0;
	public static int column = 0;
	public static double maxValue = 0;
	
	// konstruktor Location prima 3 argumenta najveci elemenat matrice i njegove indexe
	public Location(double max, int index1, int index2)
	{
		//pozivanje setera
		setMaxValue(max);
		setRow(index1);
		setColumn(index2);
		//ispis najveceg elementa matrice i njegove indexe
		System.out.println("The location of the largest element " + maxValue + " at ( " + row + ", " + column + " )");
	}
	
	// seter za index reda
	public void setRow( int rowIndex )
	{
		row = rowIndex;
	}
	
	//seter za index kolone
	public void setColumn( int colIndex )
	{
		column = colIndex;
	}
	
	//seter za najvecu vrijednost 
	public void setMaxValue( double max )
	{
		maxValue = max;
	}
	

}
