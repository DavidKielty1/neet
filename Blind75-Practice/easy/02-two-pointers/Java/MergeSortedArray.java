/*
 * 88. Merge Sorted Array
 * Difficulty: Easy
 * Pattern: Two Pointers
 *
 * Problem:
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing
 * order, and two integers m and n, representing the number of valid elements
 * in nums1 and nums2 respectively. Merge nums2 into nums1 as one sorted array.
 * nums1 has length m + n, with the last n slots unused (filled with 0). Store
 * the merged result in-place in nums1. Do not return anything.
 *
 * Example 1:
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 *
 * Example 2:
 * Input: nums1 = [1], m = 1, nums2 = [], n = 0
 * Output: [1]
 *
 * Example 3:
 * Input: nums1 = [0], m = 0, nums2 = [1], n = 1
 * Output: [1]
 *
 * Constraints:
 * - nums1.length == m + n
 * - nums2.length == n
 * - 0 <= m, n <= 200
 * - 1 <= m + n <= 200
 * - -10^9 <= nums1[i], nums2[j] <= 10^9
 */

import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
    }


        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //


        // int i = m - 1, j = n - 1, k = m + n - 1;
        // while (j >= 0) {
        //     if (i >= 0 && nums1[i] > nums2[j]) {
        //         nums1[k--] = nums1[i--];
        //     } else {
        //         nums1[k--] = nums2[j--];
        //     }
        // }


    public static void main(String[] args) {
        MergeSortedArray s = new MergeSortedArray();
        int[] a = {1, 2, 3, 0, 0, 0};
        s.merge(a, 3, new int[] {2, 5, 6}, 3);
        assert Arrays.equals(a, new int[] {1, 2, 2, 3, 5, 6});
        int[] b = {1};
        s.merge(b, 1, new int[] {}, 0);
        assert Arrays.equals(b, new int[] {1});
        int[] c = {0};
        s.merge(c, 0, new int[] {1}, 1);
        assert Arrays.equals(c, new int[] {1});
        System.out.println("All test cases passed!");
    }
}
