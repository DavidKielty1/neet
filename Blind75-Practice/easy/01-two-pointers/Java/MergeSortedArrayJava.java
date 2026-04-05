/*
88. Merge Sorted Array
Difficulty: Easy
Pattern: Two Pointers

Merge nums2 into nums1 in place; nums1 has length m + n with room at the end.

Approach: Three pointers from the tail — compare nums1[i] vs nums2[j] and fill nums1[k].

Time: O(m + n), Space: O(1)
*/

import java.util.Arrays;

public class MergeSortedArrayJava {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
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

        throw new UnsupportedOperationException("Implement merge");
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
