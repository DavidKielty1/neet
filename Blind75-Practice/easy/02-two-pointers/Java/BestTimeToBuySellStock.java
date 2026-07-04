/*
LeetCode 121: Best Time to Buy and Sell Stock
Difficulty: Easy
Pattern: Sliding Window / Greedy

Problem:
You are given an array `prices` where `prices[i]` is the price of a given stock
on the `i`th day.

Choose a single day to buy one stock and a different day in the future to sell
that stock. Return the maximum profit you can achieve from this transaction. If
you cannot make any profit, return `0`.

Example 1:
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 at price 1 and sell on day 5 at price 6.

Example 2:
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: The prices only go down, so no profitable transaction exists.

Time Complexity: O(n)
Space Complexity: O(1)
*/
public class BestTimeToBuySellStock {

    static class Solution {
        public int maxProfit(int[] prices) {


            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            // if (prices == null || prices.length == 0) {
                // return 0;
            // }
            // int lowestPrice = prices[0];
            // int bestSellSoFar = 0;
            // for (int price : prices) {
                // lowestPrice = Math.min(lowestPrice, price);
                // bestSellSoFar = Math.max(bestSellSoFar, price - lowestPrice);
            // }
            // return bestSellSoFar;

            throw new UnsupportedOperationException("Implement maxProfit");
        }
    }

    static class SolutionSlidingWindow {
        /*
         * Think of it as a sliding window where:
         * - left = buy day
         * - right = sell day
         */
        // public int maxProfit(int[] prices) {
        //     int left = 0;
        //     int right = 1;
        //     int maxProfit = 0;
        //     while (right < prices.length) {
        //         if (prices[left] < prices[right]) {
        //             int profit = prices[right] - prices[left];
        //             maxProfit = Math.max(maxProfit, profit);
        //         } else {
        //             left = right;
        //         }
        //         right++;
        //     }
        //     return maxProfit;
        // }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        assert solution.maxProfit(new int[] {7, 1, 5, 3, 6, 4}) == 5;
        System.out.println("✓ Test case 1 passed");

        assert solution.maxProfit(new int[] {7, 6, 4, 3, 1}) == 0;
        System.out.println("✓ Test case 2 passed");

        assert solution.maxProfit(new int[] {2, 4, 1}) == 2;
        System.out.println("✓ Test case 3 passed");

        assert solution.maxProfit(new int[] {1}) == 0;
        System.out.println("✓ Test case 4 passed");

        System.out.println("\nAll test cases passed!");
    }
}
