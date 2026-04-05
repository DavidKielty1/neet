"""
LeetCode 374: Guess Number Higher or Lower
Difficulty: Easy
Pattern: Binary Search

Problem:
We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked.

Every time you guess wrong, I will tell you whether the number I picked is higher or lower
than your guess.

You call a pre-defined API int guess(int num), which returns three possible results:

-1: Your guess is higher than the number I picked (i.e. num > pick).
1: Your guess is lower than the number I picked (i.e. num < pick).
0: your guess is equal to the number I picked (i.e. num == pick).

Return the number that I picked.

Example 1:
Input: n = 10, pick = 6
Output: 6

Example 2:
Input: n = 1, pick = 1
Output: 1

Example 3:
Input: n = 2, pick = 1
Output: 1

Constraints:
- 1 <= n <= 2^31 - 1
- 1 <= pick <= n

Time Complexity: O(log n)
Space Complexity: O(1)
"""


# The guess API is already defined for you.
def guess(num: int) -> int:
    """Mock implementation - will be provided by the system"""
    pass


class Solution:
    def guessNumber(self, n: int) -> int:
        """
        Approach: Binary search

        Strategy:
        1. Use binary search on range 1 to n
        2. Call guess(mid) to determine search direction
        3. Adjust search range based on result
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

        left, right = 1, n

        while left <= right:
            mid = left + (right - left) // 2
            result = guess(mid)

            if result == 0:
                return mid
            elif result == -1:
                right = mid - 1
            else:
                left = mid + 1

        return -1


# Test implementation
class TestAPI:
    def __init__(self, pick):
        self.pick = pick

    def guess(self, num):
        if num > self.pick:
            return -1
        elif num < self.pick:
            return 1
        else:
            return 0


# Test cases
if __name__ == "__main__":
    # Test case 1
    test_api = TestAPI(6)

    def guess(num):
        return test_api.guess(num)

    solution = Solution()
    assert solution.guessNumber(10) == 6
    print("✓ Test case 1 passed")

    # Test case 2
    test_api = TestAPI(1)
    assert solution.guessNumber(1) == 1
    print("✓ Test case 2 passed")

    # Test case 3
    test_api = TestAPI(1)
    assert solution.guessNumber(2) == 1
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
