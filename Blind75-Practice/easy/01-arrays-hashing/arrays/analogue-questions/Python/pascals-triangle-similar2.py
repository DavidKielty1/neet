"""
LeetCode 1672: Richest Customer Wealth
Difficulty: Easy
Pattern: Arrays & Hashing

Problem:
You are given an m x n integer grid accounts where accounts[i][j] is the amount of
money the i-th customer has in the j-th bank. Return the wealth that the richest
customer has.

A customer's wealth is the amount of money they have in all their bank accounts.
The richest customer is the customer that has the maximum wealth.

Example 1:
Input: accounts = [[1,2,3],[3,2,1]]
Output: 6

Example 2:
Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10

Example 3:
Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
Output: 17

Constraints:
- m == accounts.length
- n == accounts[i].length
- 1 <= m, n <= 50
- 1 <= accounts[i][j] <= 100

Time Complexity: O(m * n)
Space Complexity: O(1)
"""

from typing import List


class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        """
        Approach: Calculate sum for each customer

        Strategy:
        1. For each customer, sum all their accounts
        2. Track maximum wealth
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

        return max(sum(customer) for customer in accounts)


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.maximumWealth([[1, 2, 3], [3, 2, 1]]) == 6
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.maximumWealth([[1, 5], [7, 3], [3, 5]]) == 10
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.maximumWealth([[2, 8, 7], [7, 1, 3], [1, 9, 5]]) == 17
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
