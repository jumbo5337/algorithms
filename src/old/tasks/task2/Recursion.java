package old.tasks.task2;

public class Recursion {

    // Рекурсивное суммирование
    public static int sumRecursion(int[] arr, int index) {
        if (index == 0) {
            return arr[0];
        }
        return arr[index] + sumRecursion(arr, --index);
    }

    // Факториал
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}



