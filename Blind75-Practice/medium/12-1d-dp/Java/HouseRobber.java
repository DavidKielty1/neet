/*
 * 198. House Robber
 * Difficulty: Medium
 * Pattern: Dynamic Programming (1D)
 *
 * Problem:
 * You are a professional robber planning to rob houses along a street. Each house has
 * a certain amount of money stashed. Adjacent houses have security systems connected,
 * and it will automatically contact the police if two adjacent houses were broken into
 * on the same night.
 *
 * Given an integer array nums representing the amount of money of each house, return
 * the maximum amount of money you can rob tonight without alerting the police.
 *
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: 4
 * Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
 * Total amount = 1 + 3 = 4.
 *
 * Example 2:
 * Input: nums = [2,7,9,3,1]
 * Output: 12
 * Explanation: Rob house 1 (money = 2), house 3 (money = 9), and house 5 (money = 1).
 * Total amount = 2 + 9 + 1 = 12.
 *
 * Constraints:
 * - 1 <= nums.length <= 100
 * - 0 <= nums[i] <= 400
 *
 * Notes:
 * - dp[i] = max money robbing houses 0..i.
 * - Transition: rob house i + dp[i-2], or skip i and take dp[i-1].
 * - Space can be reduced to two variables (prev1, prev2).
 */

public class HouseRobber {
    static class Solution {
        public int rob(int[] nums) {
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //

            // int prev2 = 0;
            // int prev1 = 0;
            // for (int n : nums) {
            //     int current = Math.max(prev1, prev2 + n);
            //     prev2 = prev1;
            //     prev1 = current;
            // }
            // return prev1;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert sol.rob(new int[] {1, 2, 3, 1}) == 4;
        assert sol.rob(new int[] {2, 7, 9, 3, 1}) == 12;
        System.out.println("All test cases passed!");
    }
}
