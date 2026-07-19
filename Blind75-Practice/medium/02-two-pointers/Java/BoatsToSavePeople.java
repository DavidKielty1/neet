/*
 * 881. Boats to Save People
 * Difficulty: Medium
 * Pattern: Two Pointers / Greedy
 *
 * Problem:
 * You are given an array `people` where `people[i]` is the weight of the `i`th person,
 * and an infinite number of boats where each boat can carry a maximum weight of `limit`.
 * Each boat carries at most two people at the same time.
 *
 * Return the minimum number of boats to carry every given person.
 *
 * Example 1:
 * Input: people = [1,2], limit = 3
 * Output: 1
 *
 * Example 2:
 * Input: people = [3,2,2,1], limit = 3
 * Output: 3
 *
 * Example 3:
 * Input: people = [3,5,3,4], limit = 5
 * Output: 4
 *
 * Constraints:
 * - 1 <= people.length <= 5 * 10^4
 * - 1 <= people[i] <= limit <= 3 * 10^4
 *
 */

public class BoatsToSavePeople {
    static class Solution {
        public int numRescueBoats(int[] people, int limit) {
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //

            // Arrays.sort(people);
            // int left = 0;
            // int right = people.length - 1;
            // int boats = 0;
            //
            // while (left <= right) {
            //     if (people[left] + people[right] <= limit) {
            //         left++;
            //     }
            //     right--;
            //     boats++;
            // }
            //
            // return boats;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert sol.numRescueBoats(new int[] {1, 2}, 3) == 1;
        assert sol.numRescueBoats(new int[] {3, 2, 2, 1}, 3) == 3;
        assert sol.numRescueBoats(new int[] {3, 5, 3, 4}, 5) == 4;
        System.out.println("All test cases passed!");
    }
}
