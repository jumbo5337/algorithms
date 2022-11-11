package leetcode.easy.array;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        var arr = new int[]{1, 2, 3};
        plusOne(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] plusOne(int[] digits) {
        boolean needResize = false;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] = digits[i] + 1;
                break;
            } else if (digits[i] == 9) {
                digits[i] = 0;
                if (i == 0) {
                    needResize = true;
                }
            }
        }
        if (needResize) {
            int[] newArr = new int[digits.length + 1];
            newArr[0] = 1;
            for (int i = 1; i < newArr.length; i++) {
                newArr[i] = 0;
            }
            return newArr;
        } else {
            return digits;
        }
    }
}
