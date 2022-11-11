package leetcode.easy.array;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        int[] arr2 = {4,0, 9,0, 5};
        moveZeroes(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    public static void moveZeroes(int[] nums) {
        int endPointer = nums.length - 1;
        int curPointer = 0;
        while (curPointer != endPointer) {
           if (nums[curPointer] != 0) {
               curPointer ++;
           } else {
               for (int i = curPointer; i < endPointer; i++) {
                   nums[i] = nums[i+1];
               }
               nums[endPointer] = 0;
               endPointer--;
           }
        }
    }
}
