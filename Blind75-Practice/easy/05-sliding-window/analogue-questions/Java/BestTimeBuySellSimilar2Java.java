/*
 * Ported from: 02-sliding-window/analogue-questions/Python/best-time-buy-sell-similar2.py
 * --- Original description ---
Similar Problem 2: Maximum Profit from Selling Stock with Cooldown
Difficulty: Easy (Simplified)
Pattern: Sliding Window / State Machine

Problem:
You are given an array prices where prices[i] is the price of a stock on the ith day.

Find the maximum profit you can achieve with the following restriction:
After you sell your stock, you cannot buy stock on the next day (i.e., cooldown one day).

Example 1:
Input: prices = [1,2,3,0,2]
Output: 3
Explanation: transactions = [buy, sell, cooldown, buy, sell]

Example 2:
Input: prices = [1]
Output: 0

Constraints:
- 1 <= prices.length <= 5000
- 0 <= prices[i] <= 1000
 */

import java.util.*;
import java.util.function.*;


public class BestTimeBuySellSimilar2Java {



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

            // if len(prices) <= 1:
            // return 0
            // hold = -prices[0]
            // sold = 0
            // rest = 0
            // for price in prices[1:]:
            // prev_sold = sold
            // prev_hold = hold
            // sold = prev_hold + price
            // hold = max(prev_hold, rest - price)
            // rest = max(rest, prev_sold)
            // return max(sold, rest)

            throw new UnsupportedOperationException("Implement maxProfit");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.maxProfit(java.util.List.of(1, 2, 3, 0, 2)) == 3);
        System.out.println("✓ Test case 1 passed");
        assert (sol.maxProfit(java.util.List.of(1)) == 0);
        System.out.println("✓ Test case 2 passed");
        assert (sol.maxProfit(java.util.List.of(1, 2, 4)) == 3);
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
