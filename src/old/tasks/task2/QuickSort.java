package old.tasks.task2;

public class QuickSort {


    public static void quickSort (int[] arr){
        if (arr.length<=1){
            return;
        }
        quickSortAlg(arr, 0, arr.length-1);
    }


    private static void quickSortAlg (int[] arr, int low, int hi){
        if (low+1>=hi){
            return;
        }
        int middle= low+(hi-low)/2;
        int base = arr[middle];
        int i = low;
        int j = hi;
        while (i<=j){
            while (arr[i]<base){
                i++;
            }
            while (arr[j]>base){
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSortAlg(arr, low, j);
        if (hi > i)
            quickSortAlg(arr, i, hi);
    }
}
