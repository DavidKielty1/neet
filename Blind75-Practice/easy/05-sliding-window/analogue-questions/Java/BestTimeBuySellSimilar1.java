/*
 * Ported from: 02-sliding-window/analogue-questions/Python/best-time-buy-sell-similar1.py
 * --- Original description ---
Similar Problem 1: Best Time to Buy and Sell Stock with Transaction Fee
Difficulty: Easy (Simplified Version)
Pattern: Sliding Window / Greedy

Problem:
You are given an array prices where prices[i] is the price of a given stock on the ith day,
and an integer fee representing a transaction fee.

Find the maximum profit you can achieve. You may complete as many transactions as you like,
but you need to pay the transaction fee for each transaction.

Note: You may not engage in multiple transactions simultaneously.

Example 1:
Input: prices = [1,3,2,8,4,9], fee = 2
Output: 8
Explanation: Maximum profit = ((8-1)-2) + ((9-4)-2) = 8

Example 2:
Input: prices = [1,3,7,5,10,3], fee = 3
Output: 6

Constraints:
- 1 <= prices.length <= 5 * 10^4
- 1 <= prices[i] < 5 * 10^4
- 0 <= fee < 5 * 10^4
 */

import java.util.*;
import java.util.function.*;


public class BestTimeBuySellSimilar1 {



    static class Solution {
        public int maxProfit(List<Integer> prices, int fee) {
            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

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
            // cash = 0
            // hold = -prices[0]
            // for price in prices[1:]:
            // cash = max(cash, hold + price - fee)
            // hold = max(hold, cash - price)
            // return cash

            throw new UnsupportedOperationException("Implement maxProfit");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.maxProfit(java.util.List.of(1, 3, 2, 8, 4, 9), 2) == 8);
        System.out.println("✓ Test case 1 passed");
        assert (sol.maxProfit(java.util.List.of(1, 3, 7, 5, 10, 3), 3) == 6);
        System.out.println("✓ Test case 2 passed");
        assert (sol.maxProfit(java.util.List.of(1), 0) == 0);
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
