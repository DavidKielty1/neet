/*
 * Ported from: 05-binary-search/analogue-questions/Python/first-bad-version-similar3.py
 * --- Original description ---
LeetCode 852: Peak Index in a Mountain Array
Difficulty: Medium (simplified to Easy)
Pattern: Binary Search

Problem:
An array arr is a mountain if the following properties hold:

- arr.length >= 3
- There exists some i with 0 < i < arr.length - 1 such that:
  - arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
  - arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

Given a mountain array arr, return the index i such that
arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].

You must solve it in O(log(arr.length)) time complexity.

Example 1:
Input: arr = [0,1,0]
Output: 1

Example 2:
Input: arr = [0,2,1,0]
Output: 1

Example 3:
Input: arr = [0,10,5,2]
Output: 1

Constraints:
- 3 <= arr.length <= 10^5
- 0 <= arr[i] <= 10^6
- arr is guaranteed to be a mountain array

Time Complexity: O(log n)
Space Complexity: O(1)
 */

import java.util.*;
import java.util.function.*;


public class FirstBadVersionSimilar3 {



    static class Solution {
        public int peakIndexInMountainArray(List<Integer> arr) {
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

            // left, right = (0, len(arr) - 1)
            // while left < right:
            // mid = left + (right - left) // 2
            // if arr[mid] < arr[mid + 1]:
            // left = mid + 1
            // else:
            // right = mid
            // return left

            throw new UnsupportedOperationException("Implement peakIndexInMountainArray");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.peakIndexInMountainArray(java.util.List.of(0, 1, 0)) == 1);
        System.out.println("✓ Test case 1 passed");
        assert (sol.peakIndexInMountainArray(java.util.List.of(0, 2, 1, 0)) == 1);
        System.out.println("✓ Test case 2 passed");
        assert (sol.peakIndexInMountainArray(java.util.List.of(0, 10, 5, 2)) == 1);
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
