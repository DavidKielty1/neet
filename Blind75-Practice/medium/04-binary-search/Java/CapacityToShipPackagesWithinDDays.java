/*
 * 1011. Capacity To Ship Packages Within D Days
 * Difficulty: Medium
 * Pattern: Binary Search on Answer
 *
 * Problem:
 * A conveyor belt has packages with weights `weights[i]`. Each day, you load packages
 * onto the ship in the given order. You may not split packages, and the total weight
 * loaded in one day cannot exceed the ship capacity.
 *
 * Return the least weight capacity of the ship that will result in all packages being
 * shipped within `days` days.
 *
 * Example 1:
 * Input: weights = [1,2,3,4,5,6,7,8,9,10], days = 5
 * Output: 15
 *
 * Example 2:
 * Input: weights = [3,2,2,4,1,4], days = 3
 * Output: 6
 *
 * Example 3:
 * Input: weights = [1,2,3,1,1], days = 4
 * Output: 3
 *
 * Constraints:
 * - 1 <= days <= weights.length <= 5 * 10^4
 * - 1 <= weights[i] <= 500
 *
 * Notes:
 * - The minimum possible capacity is the heaviest package.
 * - The maximum possible capacity is the sum of all weights.
 */

public class CapacityToShipPackagesWithinDDays {
    static class Solution {
        public int shipWithinDays(int[] weights, int days) {
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
            // int right = 0;
            // for (int weight : weights) {
            //     left = Math.max(left, weight);
            //     right += weight;
            // }
            // while (left < right) {
            //     int mid = left + (right - left) / 2;
            //     if (canShip(weights, days, mid)) {
            //         right = mid;
            //     } else {
            //         left = mid + 1;
            //     }
            // }
            // return left;
        }

        // private boolean canShip(int[] weights, int days, int capacity) {
        //     int usedDays = 1;
        //     int current = 0;
        //     for (int weight : weights) {
        //         if (current + weight > capacity) {
        //             usedDays++;
        //             current = 0;
        //         }
        //         current += weight;
        //     }
        //     return usedDays <= days;
        // }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert sol.shipWithinDays(new int[] {1,2,3,4,5,6,7,8,9,10}, 5) == 15;
        assert sol.shipWithinDays(new int[] {3,2,2,4,1,4}, 3) == 6;
        assert sol.shipWithinDays(new int[] {1,2,3,1,1}, 4) == 3;
        System.out.println("All test cases passed!");
    }
}
