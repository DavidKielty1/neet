/*
746. Min Cost Climbing Stairs
Difficulty: Easy
Pattern: Dynamic Programming

Min cost to reach top; can start at index 0 or 1.

Time: O(n), Space: O(1)
*/
public class MinCostClimbingStairsJava {
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
        MinCostClimbingStairsJava s = new MinCostClimbingStairsJava();
        assert s.minCostClimbingStairs(new int[] {10, 15, 20}) == 15;
        System.out.println("All test cases passed!");
    }

}
