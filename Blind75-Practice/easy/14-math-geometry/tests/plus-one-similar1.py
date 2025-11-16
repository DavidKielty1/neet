"""
Similar Problem 1: Add to Array-Form of Integer
Difficulty: Easy
Pattern: Math / Array

Problem:
The array-form of an integer num is an array representing its digits in left to right order.
For example, for num = 1321, the array form is [1,3,2,1].

Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.

Example 1:
Input: num = [1,2,0,0], k = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234

Example 2:
Input: num = [2,7,4], k = 181
Output: [4,5,5]
Explanation: 274 + 181 = 455

Example 3:
Input: num = [2,1,5], k = 806
Output: [1,0,2,1]
Explanation: 215 + 806 = 1021

Constraints:
- 1 <= num.length <= 10^4
- 0 <= num[i] <= 9
- 0 <= k <= 10^4
"""

from typing import List


class Solution:
    def addToArrayForm(self, num: List[int], k: int) -> List[int]:
        """
        Approach: Add digit by digit with carry

        Strategy:
        1. Process from right to left
        2. Add k and carry to each digit
        3. Update k to remaining value
        4. Handle any remaining carry
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

        result = []
        carry = k

        # Process from right to left
        for i in range(len(num) - 1, -1, -1):
            total = num[i] + carry
            result.append(total % 10)
            carry = total // 10

        # Handle remaining carry
        while carry > 0:
            result.append(carry % 10)
            carry //= 10

        # Reverse to get correct order
        return result[::-1]


# Alternative: Simpler approach
class SolutionSimple:
    def addToArrayForm(self, num: List[int], k: int) -> List[int]:
        for i in range(len(num) - 1, -1, -1):
            k, num[i] = divmod(num[i] + k, 10)

        # Prepend remaining digits of k
        while k:
            num = [k % 10] + num
            k //= 10

        return num


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.addToArrayForm([1, 2, 0, 0], 34) == [1, 2, 3, 4]
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.addToArrayForm([2, 7, 4], 181) == [4, 5, 5]
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.addToArrayForm([2, 1, 5], 806) == [1, 0, 2, 1]
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
