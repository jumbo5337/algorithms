package old.tasks.task2;

public class BinarySearch {

    // Бинарный поиск
    public static int binarySearch(int[] arr, int x) {
        return binarySearchAlg(arr, 0, arr.length-1, x);
    }
    private static int binarySearchAlg(int[] arr, int low, int max, int x) {
        int middle = low + (max - low) / 2;

        if (low+1>= max && arr[middle] != x) {
            return -1;
        } else if (arr[middle] == x) {
            return middle;
        } else if (arr[middle] > x) {
            return binarySearchAlg(arr, low, middle, x);
        } else if (arr[middle] < x) {
            return binarySearchAlg(arr, middle+1, max, x);
        }
        return -1;
    }


}
