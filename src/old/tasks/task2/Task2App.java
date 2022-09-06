package old.tasks.task2;

import java.util.Arrays;
import java.util.Random;

public class Task2App {

    public static void main(String[] args) {

        int[] arr1 = new Random().ints(30, 0, 400).toArray();
        int[] arr2 = new Random().ints(30, 0, 400).toArray();
        int[] arr3 = new Random().ints(30, 0, 400).toArray();
        int[] arr4 = new Random().ints(30, 1, 3).toArray();
        int[] arr5 = new Random().ints(30, 0, 6).toArray();


        System.out.println("Исходный массив      :" + Arrays.toString(arr1));
        BubbleSort.bubbleSort(arr1);
        System.out.println("Сортировка пузырьком :" + Arrays.toString(arr1));
        System.out.println(" ");


        System.out.println("Исходный массив     :" + Arrays.toString(arr2));
        MergeSort.myMergeSort(arr2);
        System.out.println("Сортировка слиянием :" + Arrays.toString(arr2));
        System.out.println(" ");

        System.out.println("Исходный массив    :" + Arrays.toString(arr3));
        MergeSort.myMergeSort(arr3);
        System.out.println("Быстрая сортировка :" + Arrays.toString(arr3));
        System.out.println(" ");

        System.out.println("Исходный массив :" + Arrays.toString(arr4));
        OddEven.mapArr(arr4);
        System.out.println("Нечет/Чет       :" + Arrays.toString(arr4));
        System.out.println(" ");

        Arrays.sort(arr5);
        System.out.println("Исходный массив для поиска :" + Arrays.toString(arr5));
        System.out.println("Бинарный поиск элемента 4 : " + BinarySearch.binarySearch(arr5, 4));
        System.out.println("Бинарный поиск элемента 7 : " + BinarySearch.binarySearch(arr5, 7));
        System.out.println("  ");

        System.out.println("Исходный массив для суммирования :" + Arrays.toString(arr5));
        System.out.println("Результаты суммирования: " + Recursion.sumRecursion(arr5, arr4.length-1)
                + "\n" +   "Суммирование стримами  : " + Arrays.stream(arr5).sum());

        System.out.println("Факториал числа 5 : "+ Recursion.factorial(5));

    }




}
