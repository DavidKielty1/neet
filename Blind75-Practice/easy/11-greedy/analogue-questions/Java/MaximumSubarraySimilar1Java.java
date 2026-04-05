/*
 * Ported from: 11-greedy/analogue-questions/Python/maximum-subarray-similar1.py
 * --- Original description ---
Similar Problem 1: Best Time to Buy and Sell Stock (Kadane's Variation)
Difficulty: Easy
Pattern: Greedy / Kadane's Algorithm

Problem:
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy and a different day in the future to sell.

Return the maximum profit. If you cannot achieve any profit, return 0.

Example 1:
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1), sell on day 5 (price = 6), profit = 6-1 = 5

Example 2:
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: No profit possible

Constraints:
- 1 <= prices.length <= 10^5
- 0 <= prices[i] <= 10^4
 */

import java.util.*;
import java.util.function.*;


public class MaximumSubarraySimilar1Java {



    static class Solution {
        public int maxProfit(List<Integer> prices) {
            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            // if not prices:
            // return 0
            // min_price = float('inf')
            // max_profit = 0
            // for price in prices:
            // min_price = min(min_price, price)
            // profit = price - min_price
            // max_profit = max(max_profit, profit)
            // return max_profit

            throw new UnsupportedOperationException("Implement maxProfit");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.maxProfit(java.util.List.of(7, 1, 5, 3, 6, 4)) == 5);
        System.out.println("✓ Test case 1 passed");
        assert (sol.maxProfit(java.util.List.of(7, 6, 4, 3, 1)) == 0);
        System.out.println("✓ Test case 2 passed");
        assert (sol.maxProfit(java.util.List.of(1, 2, 3, 4, 5)) == 4);
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
