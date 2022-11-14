package leetcode.easy.array;

import java.util.*;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr, 9)));
    }

    public  static int[] twoSum(int[] nums, int target) {
        Map<Integer, List<Integer>> map = new HashMap<>(nums.length);
        for (int i=0; i<nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(i);
                map.put(nums[i], arr);
            } else {
                map.get(nums[i]).add(i);
            }
        }
        int[] result = new int[2];
        boolean found = false;
        for (int k : map.keySet()) {
            int delta = target - k;
            List<Integer> indexes = map.get(k);
            if (delta == k && indexes.size() > 1){
                result[0] = indexes.get(0);
                result[1] = indexes.get(1);
                found = true;
                break;
            }
            if (map.containsKey(delta)) {
                result[0] = indexes.get(0);
                result[1] = map.get(delta).get(0);
                found = true;
                break;
            }
        }
        if (found) {
            return result;
        } else {
            return new int[0];
        }
    }
}
