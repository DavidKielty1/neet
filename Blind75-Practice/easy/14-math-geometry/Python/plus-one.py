"""
LeetCode 66: Plus One
Difficulty: Easy
Pattern: Math / Array

Problem:
You are given a large integer represented as an integer array digits, where each
digits[i] is the ith digit of the integer. The digits are ordered from most significant
to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123. Incrementing by one gives 123 + 1 = 124.

Example 2:
Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321. Incrementing by one gives 4321 + 1 = 4322.

Example 3:
Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9. Incrementing by one gives 9 + 1 = 10.

Constraints:
- 1 <= digits.length <= 100
- 0 <= digits[i] <= 9
- digits does not contain any leading 0's.

Time Complexity: O(n)
Space Complexity: O(1) or O(n) if need to create new array for all 9s
"""

from typing import List


class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        """
        Approach: Add 1 to rightmost digit and handle carry

        Strategy:
        1. Start from rightmost digit
        2. Add 1 and handle carry
        3. If no carry, we're done
        4. If carry propagates to front (all 9s), prepend 1
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

        n = len(digits)

        # Start from rightmost digit
        for i in range(n - 1, -1, -1):
            # If digit is less than 9, just increment and return
            if digits[i] < 9:
                digits[i] += 1
                return digits

            # If digit is 9, set to 0 and carry over
            digits[i] = 0

        # If we reach here, all digits were 9
        # Need to prepend 1
        return [1] + digits


# Alternative: More explicit carry handling
class SolutionExplicit:
    def plusOne(self, digits: List[int]) -> List[int]:
        carry = 1

        for i in range(len(digits) - 1, -1, -1):
            total = digits[i] + carry
            digits[i] = total % 10
            carry = total // 10

            if carry == 0:
                break

        if carry == 1:
            digits.insert(0, 1)

        return digits


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.plusOne([1, 2, 3]) == [1, 2, 4]
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.plusOne([4, 3, 2, 1]) == [4, 3, 2, 2]
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.plusOne([9]) == [1, 0]
    print("✓ Test case 3 passed")

    # Test case 4: All 9s
    assert solution.plusOne([9, 9, 9]) == [1, 0, 0, 0]
    print("✓ Test case 4 passed")

    print("\nAll test cases passed!")
