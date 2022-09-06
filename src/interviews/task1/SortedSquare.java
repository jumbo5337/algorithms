package interviews.task1;

import java.util.Arrays;
import java.util.Random;

/**
 * Given sorted array of ints,
 * The goal is to square ints in array and return in sorted order
 * [-3, -1, 0, 2 , 5] -> [0, 1, 4, 9, 25]
 */
public class SortedSquare {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            int[] arr5 = new Random().ints(10, -5, 5).toArray();
            Arrays.sort(arr5);
            System.out.println("Initial array " + Arrays.toString(arr5));
            sortedPower(arr5);
            System.out.println("Sorted array  " + Arrays.toString(arr5));
        }
    }

    public static void sortedPower(int[] arr) {
        int positiveCursor = -1;
        for (int i = 0; i < arr.length; i++) {
            if (positiveCursor == -1 && arr[i] >= 0) {
                positiveCursor = i;
            }
            arr[i] = arr[i] * arr[i];
        }
        // Все числа позитивны или негативны
        if (positiveCursor == -1 || positiveCursor == 0) {
            return;
        }
        merge(arr);
    }

    private static void merge(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] > arr[j]) {
                // swapAndShift
                shiftLeft(arr, i, j);
                j--;
            } else {
                j--;
            }
        }
    }

    private static void shiftLeft(int[] arr, int shifted, int shiftTo) {
        int buffer = arr[shifted];
        for (int i = shifted; i <= shiftTo - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[shiftTo] = buffer;
    }
}
