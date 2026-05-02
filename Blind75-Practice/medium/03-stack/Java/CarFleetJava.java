/*
 * 853. Car Fleet
 * Difficulty: Medium
 * Pattern: Stack / Sorting
 *
 * Problem:
 * There are `n` cars going to the same destination along a one-lane road.
 *
 * You are given:
 * - `target`, the destination position
 * - `position[i]`, the starting position of the `i`th car
 * - `speed[i]`, the speed of the `i`th car
 *
 * A car can never pass another car ahead of it, but it can catch up and become part of
 * the same fleet. A car fleet is a set of cars driving together at the same speed.
 *
 * If a car catches a fleet exactly at the destination, it is still part of that fleet.
 *
 * Return the number of car fleets that will arrive at the destination.
 *
 * Example 1:
 * Input: target = 12, position = [10,8,0,5,3], speed = [2,4,1,1,3]
 * Output: 3
 *
 * Example 2:
 * Input: target = 10, position = [3], speed = [3]
 * Output: 1
 *
 * Example 3:
 * Input: target = 100, position = [0,2,4], speed = [4,2,1]
 * Output: 1
 *
 * Constraints:
 * - 1 <= position.length == speed.length <= 10^5
 * - 0 < target <= 10^6
 * - 0 <= position[i] < target
 * - 0 < speed[i] <= 10^6
 * - All positions are unique
 *
 * Notes:
 * - Sort cars by position from nearest to target back toward the start.
 * - Track arrival times; a new fleet forms only when a car takes longer than the fleet
 *   in front of it.
 */

public class CarFleetJava {
    static class Solution {
        public int carFleet(int target, int[] position, int[] speed) {
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

            // int n = position.length;
            // int[][] cars = new int[n][2];
            // for (int i = 0; i < n; i++) {
            //     cars[i][0] = position[i];
            //     cars[i][1] = speed[i];
            // }
            // Arrays.sort(cars, (a, b) -> Integer.compare(a[0], b[0]));
            //
            // int fleets = 0;
            // double lastTime = 0.0;
            // for (int i = n - 1; i >= 0; i--) {
            //     double time = (double) (target - cars[i][0]) / cars[i][1];
            //     if (time > lastTime) {
            //         fleets++;
            //         lastTime = time;
            //     }
            // }
            // return fleets;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert sol.carFleet(12, new int[] {10, 8, 0, 5, 3}, new int[] {2, 4, 1, 1, 3}) == 3;
        assert sol.carFleet(10, new int[] {3}, new int[] {3}) == 1;
        assert sol.carFleet(100, new int[] {0, 2, 4}, new int[] {4, 2, 1}) == 1;
        System.out.println("All test cases passed!");
    }
}
