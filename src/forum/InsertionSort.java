package forum;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        int n = 10;
        double[] arrayRandom = new double[n];

        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());
        for (int i=0; i<n; i++)
        {
            double r = rand.nextDouble() * 100;
            r = Math.round(r * 100);
            r = r/100;
            arrayRandom[i] = r;
        }

        System.out.println("INITIAL ARRAY:\n" + Arrays.toString(arrayRandom));
        insertionSort(arrayRandom);
        System.out.println("\nSORTED ARRAY:\n" + Arrays.toString(arrayRandom));
    }

    /** The method for sorting the numbers */
    public static void insertionSort(double[] list) {
        for (int i = 1; i < list.length; i++) {
            /** insert list[i] into a sorted sublist list[0..i-1] so that
             list[0..i] is sorted. */
            double currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] < currentElement; k--) {
                list[k + 1] = list[k];
            }
            // Insert the current element into list[k + 1]
            list[k + 1] = currentElement;
        }
    }
}
