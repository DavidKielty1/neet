/*
 * 1095. Find in Mountain Array
 * Difficulty: Hard
 * Pattern: Binary search
 *
 * Problem:
 * You may recall that an array arr is a mountain array if and only if:
 * - arr.length >= 3
 * - There exists some i with 0 < i < arr.length - 1 such that:
 *   arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 *   arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 *
 * Given a mountain array mountainArr, return the minimum index such that
 * mountainArr.get(index) == target. If no such index exists, return -1.
 *
 * You cannot access the mountain array directly. You may only access it using
 * the MountainArray interface. Calls to MountainArray.get are limited, so the
 * solution should use binary search.
 *
 * Example 1:
 * Input: array = [1,2,3,4,5,3,1], target = 3
 * Output: 2
 *
 * Example 2:
 * Input: array = [0,1,2,4,2,1], target = 3
 * Output: -1
 *
 * Constraints:
 * - 3 <= mountainArr.length() <= 10^4
 * - 0 <= target <= 10^9
 * - 0 <= mountainArr.get(index) <= 10^9
 */
public class FindInMountainArray {
    interface MountainArray {
        int get(int index);

        int length();
    }

    static class Solution {
        public int findInMountainArray(int target, MountainArray mountainArr) {
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

            // int n = mountainArr.length();
            // int left = 0;
            // int right = n - 1;
            // while (left < right) {
            //     int mid = left + (right - left) / 2;
            //     if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
            //         left = mid + 1;
            //     } else {
            //         right = mid;
            //     }
            // }
            //
            // int peak = left;
            // int ascending = binarySearch(target, mountainArr, 0, peak, true);
            // if (ascending != -1) {
            //     return ascending;
            // }
            // return binarySearch(target, mountainArr, peak + 1, n - 1, false);
            throw new UnsupportedOperationException("Implement findInMountainArray");
        }

        @SuppressWarnings("unused")
        private int binarySearch(
                int target, MountainArray mountainArr, int left, int right, boolean ascending) {
            // while (left <= right) {
            //     int mid = left + (right - left) / 2;
            //     int value = mountainArr.get(mid);
            //     if (value == target) {
            //         return mid;
            //     }
            //     if ((value < target) == ascending) {
            //         left = mid + 1;
            //     } else {
            //         right = mid - 1;
            //     }
            // }
            // return -1;
            throw new UnsupportedOperationException("Implement binarySearch");
        }
    }

    public static void main(String[] args) {
        System.out.println("Practice stub ready. Implement findInMountainArray and add checks.");
    }
}
