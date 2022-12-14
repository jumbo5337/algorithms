package sorting;

import old.tasks.task2.BubbleSort;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr1 = {5,4,57,79,7,89,88,45,34,92,38,85,6,0,77,44,61};
        System.out.println("Исходный массив      :" + Arrays.toString(arr1));
        mergeSort(arr1);
        System.out.println("in place merge sort :" + Arrays.toString(arr1));
    }


    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        mergeSortInternal(arr, 0, arr.length - 1);
    }

    private static void mergeSortInternal(int[] arr, int start, int end) {
        if (end - start <= 0) return;
        int mid = start + (end - start) / 2;
        mergeSortInternal(arr, start, mid);
        mergeSortInternal(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }


    private static void merge(int[] arr, int start, int mid, int end) {
        int currentMid = mid;
        int i = start;
        int j = mid + 1;
        while (i <= currentMid && j <= end) {
            if (arr[i] < arr[j]) {
                i++;
            } else {
                int buffer = arr[j];
                int shiftIndex = j;
                while (shiftIndex > i) {
                    arr[shiftIndex] = arr[shiftIndex - 1];
                    shiftIndex--;
                }
                arr[i] = buffer;
                i++;
                j++;
                currentMid++;
            }
        }
    }
}
