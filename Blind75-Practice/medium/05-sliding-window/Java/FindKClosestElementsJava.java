/*
 * 658. Find K Closest Elements
 * Difficulty: Medium
 * Pattern: Sliding Window / Binary Search
 *
 * Problem:
 * Given a sorted integer array `arr`, two integers `k` and `x`, return the `k` closest
 * integers to `x` in the array. The result should also be sorted in ascending order.
 *
 * An integer `a` is closer to `x` than an integer `b` if:
 * - |a - x| < |b - x|, or
 * - |a - x| == |b - x| and a < b
 *
 * Example 1:
 * Input: arr = [1,2,3,4,5], k = 4, x = 3
 * Output: [1,2,3,4]
 *
 * Example 2:
 * Input: arr = [1,2,3,4,5], k = 4, x = -1
 * Output: [1,2,3,4]
 *
 * Constraints:
 * - 1 <= k <= arr.length <= 10^4
 * - arr is sorted in ascending order
 * - -10^4 <= arr[i], x <= 10^4
 *
 * Notes:
 * - One common solution binary-searches the left boundary of a size-`k` window.
 * - Another expands from a center, but the binary-search window method is cleaner here.
 */

import java.util.List;

public class FindKClosestElementsJava {
    static class Solution {
        public List<Integer> findClosestElements(int[] arr, int k, int x) {
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

            // int left = 0;
            // int right = arr.length - k;
            // while (left < right) {
            //     int mid = left + (right - left) / 2;
            //     if (x - arr[mid] > arr[mid + k] - x) {
            //         left = mid + 1;
            //     } else {
            //         right = mid;
            //     }
            // }
            // List<Integer> result = new ArrayList<>();
            // for (int i = left; i < left + k; i++) {
            //     result.add(arr[i]);
            // }
            // return result;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert sol.findClosestElements(new int[] {1, 2, 3, 4, 5}, 4, 3).size() == 4;
        assert sol.findClosestElements(new int[] {1, 2, 3, 4, 5}, 4, -1).size() == 4;
        System.out.println("All test cases passed!");
    }
}
