package leetcode.easy.array;

import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args) {
        int[] arr1 = {4,5,6,0,0,0};
        int[] arr2 = {1,2,3};
        int m=3;
        int n=3;

        merge(arr1, m, arr2, n);
        System.out.println(Arrays.toString(arr1));
    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0;
        int p2 = 0;

        int e1 = m;
        int e2 = n;

        while (p2<e2) {
            if (nums1[p1] <= nums2[p2] && p1 < e1) {
                p1++;
            } else if (nums1[p1] >= nums2[p2] && p1 < e1){
                for (int i=nums1.length-1; i > p1; i--) {
                    nums1[i]=nums1[i-1];
                }
                nums1[p1] = nums2[p2];
                p1++;
                p2++;
                e1++;
            } else if (p1 >= e1) {
                nums1[p1] = nums2[p2];
                p1++;
                p2++;
            }
        }
    }
}
