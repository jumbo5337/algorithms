package leetcode.easy.array;

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 *
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 *
 * Input: nums = [2,2,1]
 * Output: 1
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 *
 * Input: nums = [2,2,1]
 * Output: 1
 * 0 ^ 2 ^ 2 ^ 1 ==> 1
 *
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        int a = 0;
        for(int num : nums) {
            a ^= num;
        }
        return a;
    }

}
