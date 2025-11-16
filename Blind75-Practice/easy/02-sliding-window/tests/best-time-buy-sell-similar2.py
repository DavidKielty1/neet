"""
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
"""

from typing import List


class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        """
        Approach: State machine with cooldown

        Strategy:
        1. Track three states: hold, sold (cooldown), cash (can buy)
        2. After selling, must cooldown for one day
        3. Return max profit when not holding stock
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

        if len(prices) <= 1:
            return 0

        # State: holding stock, just sold (cooldown), can buy
        hold = -prices[0]
        sold = 0
        rest = 0

        for price in prices[1:]:
            prev_sold = sold
            prev_hold = hold

            # Sold today (came from hold)
            sold = prev_hold + price
            # Holding (either kept holding or bought today)
            hold = max(prev_hold, rest - price)
            # Resting (either kept resting or cooled down from sold)
            rest = max(rest, prev_sold)

        # Max profit when not holding
        return max(sold, rest)


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.maxProfit([1, 2, 3, 0, 2]) == 3
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.maxProfit([1]) == 0
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.maxProfit([1, 2, 4]) == 3
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
