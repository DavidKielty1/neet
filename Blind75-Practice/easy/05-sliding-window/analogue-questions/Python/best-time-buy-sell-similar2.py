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
        1. Track three states:
           - hold: holding stock (can sell)
           - sold: just sold (cooldown period, cannot buy)
           - rest: can buy (not holding, not in cooldown) - this is like "cash"
        2. After selling, must cooldown for one day before buying again
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

        # [1, 2, 3, 0, 2]

        # Three states:
        # hold: holding stock (profit can be negative)
        # sold: just sold today (cooldown period - cannot buy tomorrow)
        # rest: can buy (not holding, not in cooldown) - equivalent to "cash"

        hold = -prices[0]  # Bought on day 0, so profit is -price[0]
        sold = 0  # Haven't sold yet, so profit is 0
        rest = 0  # Start with no stock, can buy (like cash = 0)

        #       [1, 2, 3, 0, 2]
        # hold -1  -1 -1  1  1
        # sold 0    1  2 -1  3
        # rest 0    0  1  2  2
        #
        # Cooldown enforcement:
        # - sold is calculated every day (potential profit if we sold today)
        # - But cooldown is enforced: can only BUY from 'rest' state
        # - rest updates from prev_sold (yesterday's sold state)
        # - So: sell on day X → cooldown on day X+1 → can buy on day X+2

        for price in prices[1:]:
            prev_sold = sold  # Save previous states before updating
            prev_hold = hold

            # State transitions:
            # 1. sold: Calculate profit if we sold today (from hold state)
            #    This is calculated every day, but doesn't mean we actually sell
            sold = prev_hold + price

            # 2. hold: Either keep holding OR buy today
            #    COOLDOWN ENFORCED: can only buy from 'rest' state (not from 'sold')
            hold = max(prev_hold, rest - price)

            # 3. rest: Either keep resting OR transition from sold (cooldown ends)
            #    This is how cooldown works: yesterday's 'sold' becomes today's 'rest'
            #    So if you sold yesterday, today you're in cooldown, tomorrow you can buy
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
