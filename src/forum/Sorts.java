package forum;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Random;

public class Sorts {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        int m = 1000;
        int n = 1000;
        int[][] arrayRandom = new int[m][n];
        Random rand = new Random();
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                int r = rand.nextInt(0, 1000);
                arrayRandom[i][j] = r;
            }
        }

        System.out.printf("ARRAY LENGTH %d, WITH %d ITERATIONS%n", n, m);

        /* Insertion Sort */
        long[] durations1 = new long[m];
        for (int i = 0; i < m; i++) {
            long startTime = System.nanoTime();
            insertionSort(arrayRandom[i].clone());
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            durations1[i] = duration;
        }

        System.out.println("\nINSERTION SORT");
        System.out.printf("Min time: %s ns%n", Arrays.stream(durations1).min().getAsLong());
        System.out.printf("Max time: %s ns%n", Arrays.stream(durations1).max().getAsLong());
        System.out.printf("Avg time: %s ns%n", Arrays.stream(durations1).average().getAsDouble());

        /* Bubble Sort */
        long[] durations2 = new long[m];
        for (int i = 0; i < m; i++) {
            long startTime = System.nanoTime();
            bubbleSort(arrayRandom[i].clone());
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            durations2[i] = duration;
        }

        System.out.println("\nBUBBLE SORT");
        System.out.printf("Min time: %s ns%n", Arrays.stream(durations2).min().getAsLong());
        System.out.printf("Max time: %s ns%n", Arrays.stream(durations2).max().getAsLong());
        System.out.printf("Avg time: %s ns%n", Arrays.stream(durations2).average().getAsDouble());

        /* Merge Sort */
        long[] durations3 = new long[m];
        for (int i = 0; i < m; i++) {
            long startTime = System.nanoTime();
            mergeSort(arrayRandom[i].clone(), 0, arrayRandom[i].length-1);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            durations3[i] = duration;
        }

        System.out.println("\nMERGE SORT");
        System.out.printf("Min time: %s ns%n", Arrays.stream(durations3).min().getAsLong());
        System.out.printf("Max time: %s ns%n", Arrays.stream(durations3).max().getAsLong());
        System.out.printf("Avg time: %s ns%n", Arrays.stream(durations3).average().getAsDouble());

        /* Quick Sort */
        long[] durations4 = new long[m];
        for (int i = 0; i < m; i++) {
            long startTime = System.nanoTime();
            quickSort(arrayRandom[i].clone(), 0, arrayRandom[i].length-1);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            durations4[i] = duration;
        }

        System.out.println("\nQUICK SORT");
        System.out.printf("Min time: %s ns%n", Arrays.stream(durations4).min().getAsLong());
        System.out.printf("Max time: %s ns%n", Arrays.stream(durations4).max().getAsLong());
        System.out.printf("Avg time: %s ns%n", Arrays.stream(durations4).average().getAsDouble());
    }

    /** Insertion sort */
    public static int[] insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;
        }

        return arr;
    }

    /** Bubble sort */
    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

    /** Merge sort */
    public static int[] mergeSort(int[] arr, int left, int right) {

        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }

        return arr;
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    /** Quick sort */
    public static int[] quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }

        return arr;
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
