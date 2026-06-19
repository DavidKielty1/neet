/*
 * 494. Target Sum
 * Difficulty: Medium
 * Pattern: Dynamic Programming (1D / subset sum)
 *
 * Problem:
 * You are given an integer array nums and an integer target.
 *
 * You want to build an expression by adding a '+' or '-' sign before each integer in
 * nums, then concatenate all the integers to form an expression that evaluates to target.
 *
 * Return the number of different expressions that you can build that evaluate to target.
 *
 * Example 1:
 * Input: nums = [1,1], target = 0
 * Output: 2
 * Explanation: +1-1 and -1+1 evaluate to 0.
 *
 * Example 2:
 * Input: nums = [1], target = 1
 * Output: 1
 *
 * Constraints:
 * - 1 <= nums.length <= 20
 * - 0 <= nums[i] <= 1000
 * - 0 <= sum(nums[i]) <= 1000
 * - -1000 <= target <= 1000
 *
 * Notes:
 * - Equivalent to: find subsets P, N such that sum(P) - sum(N) = target.
 * - Can use DP over (index, current sum) with memo, or transform to subset-sum counting.
 */

public class TargetSum {
    static class Solution {
        public int findTargetSumWays(int[] nums, int target) {
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //

            // int total = 0;
            // for (int n : nums) {
            //     total += n;
            // }
            // if ((total + target) % 2 != 0 || total < Math.abs(target)) {
            //     return 0;
            // }
            // int subsetTarget = (total + target) / 2;
            // int[] dp = new int[subsetTarget + 1];
            // dp[0] = 1;
            // for (int n : nums) {
            //     for (int s = subsetTarget; s >= n; s--) {
            //         dp[s] += dp[s - n];
            //     }
            // }
            // return dp[subsetTarget];
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert sol.findTargetSumWays(new int[] {1, 1}, 0) == 2;
        assert sol.findTargetSumWays(new int[] {1}, 1) == 1;
        System.out.println("All test cases passed!");
    }
}
