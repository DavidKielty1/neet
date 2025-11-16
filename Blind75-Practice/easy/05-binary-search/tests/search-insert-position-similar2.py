"""
LeetCode 441: Arranging Coins
Difficulty: Easy
Pattern: Binary Search / Math

Problem:
You have n coins and you want to build a staircase with these coins. The staircase
consists of k rows where the ith row has exactly i coins. The last row of the staircase
may be incomplete.

Given the integer n, return the number of complete rows of the staircase you will build.

Example 1:
Input: n = 5
Output: 2
Explanation: Because the 3rd row is incomplete, we return 2.

Example 2:
Input: n = 8
Output: 3
Explanation: Because the 4th row is incomplete, we return 3.

Constraints:
- 1 <= n <= 2^31 - 1

Time Complexity: O(log n)
Space Complexity: O(1)
"""


class Solution:
    def arrangeCoins(self, n: int) -> int:
        """
        Approach: Binary search

        Strategy:
        1. Use binary search to find largest k where k*(k+1)/2 <= n
        2. This is the number of complete rows
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

        left, right = 0, n

        while left <= right:
            mid = left + (right - left) // 2
            total = mid * (mid + 1) // 2

            if total == n:
                return mid
            elif total < n:
                left = mid + 1
            else:
                right = mid - 1

        return right


# Alternative using math
class SolutionMath:
    def arrangeCoins(self, n: int) -> int:
        # Solve k*(k+1)/2 = n for k
        # k = (-1 + sqrt(1 + 8n)) / 2
        import math

        return int((-1 + math.sqrt(1 + 8 * n)) / 2)


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.arrangeCoins(5) == 2
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.arrangeCoins(8) == 3
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.arrangeCoins(1) == 1
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
