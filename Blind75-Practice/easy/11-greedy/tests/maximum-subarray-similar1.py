"""
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
"""

from typing import List


class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        """
        Approach: Kadane's algorithm on price differences

        Strategy:
        1. Track minimum price seen so far
        2. Calculate profit if selling at current price
        3. Update maximum profit
        4. Similar to max subarray but tracking min/max
        """

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        if not prices:
            return 0

        min_price = float("inf")
        max_profit = 0

        for price in prices:
            min_price = min(min_price, price)
            profit = price - min_price
            max_profit = max(max_profit, profit)

        return max_profit


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.maxProfit([7, 1, 5, 3, 6, 4]) == 5
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.maxProfit([7, 6, 4, 3, 1]) == 0
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.maxProfit([1, 2, 3, 4, 5]) == 4
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
