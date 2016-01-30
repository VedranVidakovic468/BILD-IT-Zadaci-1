package MiniProjekat3;

public class GameTester
{

	public static void main(String[] args) 
	{
	

        String[][] grid = new String[3][3];

        for (int i = 0; i < grid.length; i++) {
            for (int k = 0; k < grid[i].length; k++) {
                if (k == 0)
                    grid[i][k] = "|     |"; // every first column
                else
                    grid[i][k] = "      |"; // every column after first
            }
        }
        
        for (int i = 0; i < grid.length; i++) {
        	System.out.println();
            for (int k = 0; k < grid[i].length; k++) {
            	System.out.print(grid[i][k]);
            }
        }
	}

}
