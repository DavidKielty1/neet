"""
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
Input: prices = [7,2,5,3,9,4,1,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.

Example 2:
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.

Constraints:
- 1 <= prices.length <= 10^5
- 0 <= prices[i] <= 10^4

Time Complexity: O(n)
Space Complexity: O(1)
"""

from typing import List


class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        """
        Approach: Track minimum price and maximum profit

        Strategy:
        1. Keep track of minimum price seen so far (buy point)
        2. For each price, calculate profit if we sell today
        3. Update maximum profit if current profit is better
        4. Update minimum price if current price is lower
        """
        if not prices:
            return 0

        min_price = float("inf")
        max_profit = 0

        for price in prices:
            min_price = min(min_price, price)

            profit = price - min_price

            max_profit = max(max_profit, profit)

        return max_profit

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
            # Update minimum price (best buy opportunity)
            min_price = min(min_price, price)

            # Calculate profit if we sell today
            profit = price - min_price

            # Update maximum profit
            max_profit = max(max_profit, profit)

        return max_profit


# Alternative sliding window approach
class SolutionSlidingWindow:
    def maxProfit(self, prices: List[int]) -> int:
        """
        Think of it as a sliding window where:
        - left = buy day
        - right = sell day
        """
        left, right = 0, 1  # left=buy, right=sell
        max_profit = 0

        while right < len(prices):
            # Profitable transaction?
            if prices[left] < prices[right]:
                profit = prices[right] - prices[left]
                max_profit = max(max_profit, profit)
            else:
                # Found a lower buy price
                left = right

            right += 1

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
    assert solution.maxProfit([2, 4, 1]) == 2
    print("✓ Test case 3 passed")

    # Test case 4
    assert solution.maxProfit([1]) == 0
    print("✓ Test case 4 passed")

    print("\nAll test cases passed!")
