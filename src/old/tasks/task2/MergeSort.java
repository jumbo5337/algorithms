package old.tasks.task2;

import java.util.Arrays;

public class MergeSort {
    // Сортировка Слиянием
    public static void myMergeSort(int[] arr){
        if (arr.length==1){
            return;
        }
        int low = 0;
        int hi = arr.length;
        int middle = low+(hi-low)/2;

        int [] arrA = Arrays.copyOfRange(arr,0, middle);
        int [] arrB = Arrays.copyOfRange(arr, middle, hi);
        myMergeSort(arrA);
        myMergeSort(arrB);

        int[] buff = myMergeAlg(arrA, arrB);
        System.arraycopy(buff, 0, arr, 0, arr.length);
    }

    public static int[] myMergeAlg(int[] firstArr, int[] secondArr) {
        int lenght = firstArr.length + secondArr.length;
        int buff[] = new int[lenght];
        int i = 0; // курсор первого массива;
        int j = 0; // кусор второго массива;
        for (int k = 0; k < lenght; k++) {
            if (j >= secondArr.length || i < firstArr.length && firstArr[i] < secondArr[j]) {
                buff[k] = firstArr[i++];
            } else {
                buff[k] = secondArr[j++];
            }
        }
        return buff;
    }

    public static void sort(int[] arr, int low, int hi){
        if(low+1>=hi){
            return;
        }
        int middle=low+(hi-low)/2;
        sort(arr, low,middle);
        sort(arr, middle,hi);
        merge(arr,low,middle,hi);
    }

    private static void merge (int[] arr, int low, int middle, int hi){
        int i=low;
        int j=middle;
        int size=hi-low;
        int[]buff=new int[size];


        for(int k=0;k<buff.length;k++){
            if (j >= hi || i < middle && arr[i]<arr[j]){
                buff[k]=arr[i++];
            } else {
                buff[k]=arr[j++];
            }
        }
        System.arraycopy(buff, 0, arr, low, size);
    }

}
