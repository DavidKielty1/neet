import java.util.Arrays;

/*
LeetCode 121: Best Time to Buy and Sell Stock
Difficulty: Easy
Pattern: Sliding Window / Greedy

Problem:
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing
a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve
any profit, return 0.

Example 1:
Input: prices = [7,2,5,3,6,4,1,8]
Output: 5
Explanation: Buy at price 1 and sell at price 6, profit = 6-1 = 5.

Example 2:
Input: prices = [7,6,4,3,1]
Output: 0

Time Complexity: O(n)
Space Complexity: O(1)
*/
public class BestTimeToBuySellStock {

    /*
     * Approach: Track minimum price and maximum profit
     *
     * Strategy:
     * 1. Keep track of minimum price seen so far (buy point)
     * 2. For each price, calculate profit if we sell today
     * 3. Update maximum profit if current profit is better
     * 4. Update minimum price if current price is lower
     */
    static class Solution {
        public int maxProfit(int[] prices) {
            if (prices == null || prices.length == 0) {
                return 0;
            }

            int lowestPrice = prices[0];
            int bestSellSoFar = 0;

            // [7,2,5,3,6,4,1,8]
            for (int price : prices) {
                lowestPrice = Math.min(lowestPrice, price);
                bestSellSoFar = Math.max(bestSellSoFar, price - lowestPrice);
            }

            return bestSellSoFar;
        }
    }

    // Alternative sliding window approach
    static class SolutionSlidingWindow {
        /*
         * Think of it as a sliding window where:
         * - left = buy day
         * - right = sell day
         */
        public int maxProfit(int[] prices) {
            int left = 0;   // buy
            int right = 1;  // sell
            int maxProfit = 0;

            while (right < prices.length) {
                if (prices[left] < prices[right]) {
                    int profit = prices[right] - prices[left];
                    maxProfit = Math.max(maxProfit, profit);
                } else {
                    // Found a lower buy price
                    left = right;
                }
                right++;
            }

            return maxProfit;
        }
    }

    // Test cases
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        assert solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}) == 5;
        System.out.println("✓ Test case 1 passed");

        // Test case 2
        assert solution.maxProfit(new int[]{7, 6, 4, 3, 1}) == 0;
        System.out.println("✓ Test case 2 passed");

        // Test case 3
        assert solution.maxProfit(new int[]{2, 4, 1}) == 2;
        System.out.println("✓ Test case 3 passed");

        // Test case 4
        assert solution.maxProfit(new int[]{1}) == 0;
        System.out.println("✓ Test case 4 passed");

        System.out.println("\nAll test cases passed!");
    }
}

