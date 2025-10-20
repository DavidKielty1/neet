"""
121. Best Time to Buy and Sell Stock - https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
Difficulty: Easy
Pattern: Dynamic Programming

You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Example 1:
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.

Example 2:
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.

Time: O(n), Space: O(1)
"""

from typing import List


def max_profit(prices: List[int]) -> int:
    """
    One pass approach tracking min price and max profit
    Time: O(n), Space: O(1)
    """
    # TODO: Implement one pass solution
    pass


# Test cases
if __name__ == "__main__":
    # Test 1
    prices1 = [7, 1, 5, 3, 6, 4]
    print(f"Max Profit: {max_profit(prices1)}")  # 5

    # Test 2
    prices2 = [7, 6, 4, 3, 1]
    print(f"Max Profit: {max_profit(prices2)}")  # 0
