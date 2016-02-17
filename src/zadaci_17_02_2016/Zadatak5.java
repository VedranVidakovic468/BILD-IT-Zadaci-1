package zadaci_17_02_2016;

import java.util.ArrayList ;
import java.util.Collections ;

/*
 * (Sort ArrayList) Write the following method that sorts an ArrayList of numbers.
public static void sort(ArrayList<Number> list)
 */
public class Zadatak5
{
//StartCopyCode source https://github.com/AhmedSalkic/intro-to-java-10th-edition/blob/master/src/Chapter_13/Exercise_03.java
	public static void main(String[] args) {

        ArrayList<Number> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }

        Collections.shuffle(numbers);
        System.out.println("Shuffled: ");
        System.out.println( numbers );
        System.out.println("Sorted: ");
        sort(numbers);
        System.out.println( numbers );
    }

    public static void sort(ArrayList<Number> list) {

        for (int i = 0; i < list.size() - 1; i++) {
            Number currentMin = list.get(i);
            int currentIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).doubleValue() < currentMin.doubleValue()) {
                    currentMin = list.get(j);
                    currentIndex = j;
                }
            }

            if (currentIndex != i) {
                list.set(currentIndex, list.get(i));
                list.set(i, currentMin);
            }
        }

    }
    //EndCopyCode ja Ahmed razumjem ovaj kod
}
