/*
 * Ported from: 02-sliding-window/analogue-questions/Python/best-time-buy-sell-similar3.py
 * --- Original description ---
Similar Problem 3: Find Maximum in Sliding Window (Profit Version)
Difficulty: Easy
Pattern: Sliding Window

Problem:
You are given an array prices and an integer k. You want to find the maximum profit
you can get by buying and selling within any k-day window.

In each window, you can only make one transaction (buy once and sell once).

Example 1:
Input: prices = [1,5,3,8,2,9], k = 3
Output: 7
Explanation: Window [1,5,3] profit=4, [5,3,8] profit=5, [3,8,2] profit=5, [8,2,9] profit=7

Example 2:
Input: prices = [7,1,5,3,6,4], k = 4
Output: 5

Constraints:
- k <= prices.length <= 10^5
- 0 <= prices[i] <= 10^4
 */

import java.util.*;
import java.util.function.*;


public class BestTimeBuySellSimilar3Java {



    static class Solution {
        public int maxProfitInWindow(List<Integer> prices, int k) {
            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            // if not prices or k <= 1:
            // return 0
            // max_profit = 0
            // for i in range(len(prices) - k + 1):
            // window = prices[i:i + k]
            // min_price = min(window)
            // max_price = max(window)
            // window_profit = 0
            // min_so_far = float('inf')
            // for price in window:
            // min_so_far = min(min_so_far, price)
            // window_profit = max(window_profit, price - min_so_far)
            // max_profit = max(max_profit, window_profit)
            // return max_profit

            throw new UnsupportedOperationException("Implement maxProfitInWindow");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.maxProfitInWindow(java.util.List.of(1, 5, 3, 8, 2, 9), 3) == 7);
        System.out.println("✓ Test case 1 passed");
        assert (sol.maxProfitInWindow(java.util.List.of(7, 1, 5, 3, 6, 4), 4) == 5);
        System.out.println("✓ Test case 2 passed");
        assert (sol.maxProfitInWindow(java.util.List.of(1, 2, 3, 4, 5), 2) == 1);
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
