package old.tasks.task2;

public class OddEven {

    public static void mapArr(int[] arr) {
        oddEvenAlg(arr, 0, arr.length - 1);
    }

    private static void oddEvenAlg(int[] arr, int low, int hi) {
        if (low + 1 >= hi) {
            return;
        }
        int mid = low + (hi - low) / 2;
        oddEvenAlg(arr, low, mid);
        oddEvenAlg(arr, mid, hi);
        merge(arr, low, mid, hi);
    }

    private static void merge(int[] arr, int low, int middle, int hi) {
        int i = low;
        int j = hi;
        int buff;
        while (i < j) {
            while (arr[i] % 2 != 0 && arr[j] % 2 == 0) {
                i++;
                j--;
            }
            buff = arr[i];
            arr[i] = arr[j];
            arr[j] = buff;
            if (arr[i]%2!=0) i++;
            if (arr[j]%2==0) j--;
        }
    }
}
