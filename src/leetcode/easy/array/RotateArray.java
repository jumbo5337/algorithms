package leetcode.easy.array;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        System.out.println(54 << 45);
        int[] arr = {1,2,3,4,5,6};
        rotate(arr, 3);
        System.out.println(Arrays.toString(arr));


    }

    public static void rotate(int[] nums, int k) {
        int shift;


        if (k > nums.length) {
            shift = k % nums.length;
        } else  {
            shift = k;
        }

        int currentIndex = 0;
        int buffer = nums[0];

        boolean cycled = false;
        int cycleShifts = -1;

        int gcd = gcd(nums.length, shift);

        if (gcd != 1) {
            cycled = true;
            cycleShifts = nums.length / gcd;
        }

        int shifts = 0;
        for (int i = 0; i < nums.length; i++) {

            int shiftedVal = buffer;
            int nextIndex = (currentIndex + shift) % nums.length;
            buffer = nums[nextIndex];
            nums[nextIndex] = shiftedVal;
            System.out.println("C=" + currentIndex + " N=" + nextIndex);
            shifts++;
            if (cycled && shifts == cycleShifts) {
                currentIndex++;
                if (currentIndex == nums.length) {
                    break;
                }
                buffer = nums[currentIndex];
                shifts=0;
            } else {
                currentIndex = nextIndex;
            }
            nextIndex = (currentIndex + shift) % nums.length;
        }
    }

    public static int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }
}


