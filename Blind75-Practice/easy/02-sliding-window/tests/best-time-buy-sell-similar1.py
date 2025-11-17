"""
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
"""

from typing import List


class Solution:
    def maxProfit(self, prices: List[int], fee: int) -> int:
        """
        Approach: Track cash and hold states

        Strategy:
        1. Track two states: cash (not holding) and hold (holding stock)
        2. For each price, calculate best profit for each state
        3. When buying, pay the price
        4. When selling, pay the fee
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

        # [1,3,2,8,4,9], fee = 2 ; result  = 8

        if not prices:
            return 0

        cash = 0  # Max profit when not holding stock
        hold = -prices[0]  # Max profit when holding stock

        for price in prices[1:]:
            # Update cash: either keep cash or sell stock (pay fee)
            cash = max(cash, hold + price - fee)
            # Update hold: either keep holding or buy stock
            hold = max(hold, cash - price)

        return cash


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.maxProfit([1, 3, 2, 8, 4, 9], 2) == 8
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.maxProfit([1, 3, 7, 5, 10, 3], 3) == 6
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.maxProfit([1], 0) == 0
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
