package leetcode.easy.array;

import java.util.Arrays;

import static sorting.MergeSort.mergeSort;

public class IntersectionOfArrays {

    public static void main(String[] args) {
        int[] arr2 = {4, 9, 5};
        int[] arr3 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(arr2, arr3)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        mergeSort(nums1);
        mergeSort(nums2);

        int[] l;
        int[] s;

        if (nums1.length > nums2.length) {
            l = nums1;
            s = nums2;
        } else {
            l = nums2;
            s = nums1;
        }

        int longIndex = 0;
        int[] res = new int[s.length];
        int k = 0;
        int m =0;
        for (int i = 0; i < s.length; i++) {
            m = longIndex;
            while (m < l.length) {
                if (s[i] == l[m]) {
                    res[k] = s[i];
                    k++;
                    longIndex = ++m;
                    break;
                }
                m++;
            }
            if (longIndex > l.length - 1) {
                break;
            }
        }
        if (k == 0) {
            return new int[0];
        } else {
            int[] trimmedRes = new int[k];
            for (int i = 0; i <= trimmedRes.length - 1; i++) {
                trimmedRes[i] = res[i];
            }
            return trimmedRes;
        }
    }
}
