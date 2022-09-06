package old.tasks.task4;

import java.util.Arrays;
import java.util.Random;

public class Task4App {

    public static void main(String[] args) {
        int[] array = new Random().ints(10, 0, 2).toArray();

        System.out.println("Исходный Массив : " + Arrays.toString(array));
        System.out.println("Максимальная длинная вектора : " +VectorCounter.count(array));
    }
}
