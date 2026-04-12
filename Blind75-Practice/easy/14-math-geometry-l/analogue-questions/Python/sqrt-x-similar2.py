"""
LeetCode 633: Sum of Square Numbers
Difficulty: Medium (simplified to Easy)
Pattern: Math / Two Pointers

Problem:
Given a non-negative integer c, decide whether there're two integers a and b such that
a^2 + b^2 = c.

Example 1:
Input: c = 5
Output: true
Explanation: 1 * 1 + 2 * 2 = 5

Example 2:
Input: c = 3
Output: false

Constraints:
- 0 <= c <= 2^31 - 1

Time Complexity: O(sqrt(c))
Space Complexity: O(1)
"""


class Solution:
    def judgeSquareSum(self, c: int) -> bool:
        """
        Approach: Two pointers

        Strategy:
        1. Use two pointers: left = 0, right = sqrt(c)
        2. Check if left^2 + right^2 = c
        3. Adjust pointers based on sum
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

        left = 0
        right = int(c**0.5)

        while left <= right:
            current_sum = left * left + right * right

            if current_sum == c:
                return True
            elif current_sum < c:
                left += 1
            else:
                right -= 1

        return False


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.judgeSquareSum(5) == True
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.judgeSquareSum(3) == False
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.judgeSquareSum(0) == True
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
