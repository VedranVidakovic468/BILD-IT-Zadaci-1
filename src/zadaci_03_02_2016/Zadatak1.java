package zadaci_03_02_2016;

import java.util.Random;

public class Zadatak1
{
	// StartCopyCode source https://github.com/AhmedSalkic/intro-to-java-10th-edition/blob/master/src/Chapter_08/Exercise_04.java
	static final int EMP = 0;
    static final int HOURS = 1;

    public static void main(String[] args) {

        int[][] employeeHours = new int[][] {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}};


        int[][] totalHoursChart = calcTotalHours(employeeHours);

        descendingSort(totalHoursChart);

        for (int i = 0; i < totalHoursChart.length; i++) {

            System.out.println("Employee #"+ totalHoursChart[i][EMP] + " total hours = " +
                            totalHoursChart[i][HOURS]);
        }

    }

    public static int[][] calcTotalHours(int[][] m) {

        int[][] totalHoursChart = new int[m.length][2];

        for (int i = 0; i < m.length; i++) {
            totalHoursChart[i][HOURS] = getRowTotalHour(m, i);
            totalHoursChart[i][EMP] = i;
        }


        return totalHoursChart;
    }

    public static int getRowTotalHour(int[][] m, int row) {

        int total = 0;
        for (int column = 0; column < m[row].length; column++) {
            total += m[row][column];
        }
        return total;
    }

    public static void descendingSort(int[][] m) {

        for (int i = 0; i < m.length - 1; i++) {

            int currentIndex = i;
            int currentMax = m[i][HOURS];
            int empNum = m[i][EMP];
            for (int k = i + 1; k < m.length; k++) {

                if (currentMax < m[k][HOURS]) {
                    currentMax = m[k][HOURS];
                    currentIndex = k;
                    empNum = m[k][EMP];
                }
            }

            if (currentIndex != i) {
                m[currentIndex][EMP] = m[i][EMP];
                m[currentIndex][HOURS] = m[i][HOURS];
                m[i][EMP] = empNum;
                m[i][HOURS] = currentMax;
            }

        }
    }
    // EndCopyCode ja Ahmed razumjem ovaj kod

}
