/*
LeetCode 88: Merge Sorted Array
Difficulty: Easy
Pattern: Two Pointers

Problem:
You are given two integer arrays `nums1` and `nums2`, sorted in non-decreasing
order, and two integers `m` and `n`, representing the number of valid elements
in `nums1` and `nums2` respectively.

Merge `nums2` into `nums1` as one sorted array. The final sorted array should
be stored inside `nums1`, which has a length of `m + n` with extra space at the
end.

Example 1:
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: Merge the valid parts [1,2,3] and [2,5,6] into nums1.

Example 2:
Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: nums2 is empty, so nums1 stays the same.

Example 3:
Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: nums1 has no valid initial elements, so copy nums2 in.

Time Complexity: O(m + n)
Space Complexity: O(1)
*/

import java.util.Arrays;

public class MergeSortedArrayJava {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // mIndex = 3
        // nIndex = 3
        // m = [4, 5, 6, 0, 0, 0]
        // n = [1, 2, 3]
        int mIndex = m - 1;
        int nIndex = n - 1;
        int tailIndex = nums1.length - 1;
        while (nIndex >= 0) {
            if (mIndex >= 0 && nums1[mIndex] > nums2[nIndex]) {
                nums1[tailIndex--] = nums1[mIndex--];
            } else {
                nums1[tailIndex--] = nums2[nIndex--];
            }
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

    }

    public static void main(String[] args) {
        MergeSortedArrayJava s = new MergeSortedArrayJava();
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
