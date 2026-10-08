/*
 * 746. Min Cost Climbing Stairs
 * Difficulty: Easy
 * Pattern: Dynamic Programming
 *
 * Problem:
 * You are given an integer array cost where cost[i] is the cost of ith step
 * on a staircase. Once you pay the cost, you can either climb one or two
 * steps. You can either start from the step with index 0, or the step with
 * index 1. Return the minimum cost to reach the top of the floor.
 *
 * Example 1:
 * Input: cost = [10,15,20]
 * Output: 15
 *
 * Example 2:
 * Input: cost = [1,100,1,1,1,100,1,1,1,1]
 * Output: 6
 *
 * Constraints:
 * - 2 <= cost.length <= 1000
 * - 0 <= cost[i] <= 999
 */
public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        // dp[i] = cost[i] + min(dp[i-1], dp[i-2])

        // int prev2 = 0;
        // int prev1 = 0;
        // for (int i = 2; i <= cost.length; i++) {
        //     int current = Math.min(prev1 + cost[i - 1], prev2 + cost[i - 2]);
        //     prev2 = prev1;
        //     prev1 = current;
        // }
        // return prev1;
        throw new UnsupportedOperationException("Implement minCostClimbingStairs");
    }
    public static void main(String[] args) {
        MinCostClimbingStairs s = new MinCostClimbingStairs();
        assert s.minCostClimbingStairs(new int[] {10, 15, 20}) == 15;
        System.out.println("All test cases passed!");
    }

}
