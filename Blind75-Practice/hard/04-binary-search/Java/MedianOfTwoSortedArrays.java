/*
 * 4. Median of Two Sorted Arrays
 * Difficulty: Hard
 * Pattern: Binary search
 *
 * Problem:
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return
 * the median of the two sorted arrays.
 *
 * The overall run time complexity should be O(log (m+n)).
 *
 * Example 1:
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: Merged array = [1,2,3], and the median is 2.
 *
 * Example 2:
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.50000
 * Explanation: Merged array = [1,2,3,4], and the median is (2 + 3) / 2.
 *
 * Constraints:
 * - nums1.length == m
 * - nums2.length == n
 * - 0 <= m <= 1000
 * - 0 <= n <= 1000
 * - 1 <= m + n <= 2000
 * - -10^6 <= nums1[i], nums2[i] <= 10^6
 */
public class MedianOfTwoSortedArrays {
    static class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
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

            // if (nums1.length > nums2.length) {
            //     return findMedianSortedArrays(nums2, nums1);
            // }
            //
            // int total = nums1.length + nums2.length;
            // int half = (total + 1) / 2;
            // int left = 0;
            // int right = nums1.length;
            //
            // while (left <= right) {
            //     int cut1 = left + (right - left) / 2;
            //     int cut2 = half - cut1;
            //
            //     int left1 = cut1 == 0 ? Integer.MIN_VALUE : nums1[cut1 - 1];
            //     int right1 = cut1 == nums1.length ? Integer.MAX_VALUE : nums1[cut1];
            //     int left2 = cut2 == 0 ? Integer.MIN_VALUE : nums2[cut2 - 1];
            //     int right2 = cut2 == nums2.length ? Integer.MAX_VALUE : nums2[cut2];
            //
            //     if (left1 <= right2 && left2 <= right1) {
            //         if (total % 2 == 1) {
            //             return Math.max(left1, left2);
            //         }
            //         return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
            //     }
            //
            //     if (left1 > right2) {
            //         right = cut1 - 1;
            //     } else {
            //         left = cut1 + 1;
            //     }
            // }
            //
            // throw new IllegalArgumentException("Input arrays are not sorted.");
            throw new UnsupportedOperationException("Implement findMedianSortedArrays");
        }
    }

    public static void main(String[] args) {
        System.out.println("Practice stub ready. Implement findMedianSortedArrays and add checks.");
    }
}
