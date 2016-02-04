package zadaci_03_02_2016;

import java.util.Random;

public class Zadatak4 
{
	//StartCopyCode source https://github.com/AhmedSalkic/intro-to-java-10th-edition/blob/master/src/Chapter_08/Exercise_16.java
	 public static void main(String[] args) {

	        int[][] matrix = new int[][] {
	                {4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}
	        };
	        sort(matrix);
	        displayMatrix(matrix);

	    }

	    public static void sort(int m[][]) {

	        for (int i = 0; i < m.length - 1; i++) {
	            int currentIndex = i;
	            int[] current = m[i];
	            for (int j = i +  1; j < m.length; j++) {
	                if (current[0] > m[j][0] || current[0] == m[j][0] && current[1] > m[j][1]) {
	                    current = m[j];
	                    currentIndex = j;
	                }
	            }
	            if (currentIndex != i) {
	                m[currentIndex] = m[i];
	                m[i] = current;
	            }
	        }

	    }

	    public static void displayMatrix(int[][] m) {

	        for (int i = 0; i < m.length; i++) {
	            for (int j = 0; j < m[i].length; j++) {
	                System.out.print(m[i][j] + " ");
	            }
	            System.out.println("");
	        }
	    }
	    // EndCopyCode ja Ahmed razumjem ovaj kod
}
