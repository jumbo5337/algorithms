package leetcode.easy.dp;

public class MaximumSubarray {

    public static void main(String[] args) {

    }

    public static int maxSubArray(int[] nums) {

        int sum = Integer.MIN_VALUE;
        int expectedSum = 0;

        for (int i=0; i < nums.length; i++) {
            int current = nums[i];
            expectedSum = expectedSum + current;
            if (sum < expectedSum) {
                sum = expectedSum;
            }
            if (expectedSum < 0) {
                expectedSum = 0;
            }
        }
        return sum;
    }
}
