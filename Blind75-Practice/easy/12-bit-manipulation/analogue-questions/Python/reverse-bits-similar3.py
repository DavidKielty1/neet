"""
Similar Problem 3: Number of Steps to Reduce to Zero
Difficulty: Easy
Pattern: Bit Manipulation

Problem:
Given an integer num, return the number of steps to reduce it to zero.

In one step, if the current number is even, you have to divide it by 2,
otherwise, you have to subtract 1 from it.

Example 1:
Input: num = 14
Output: 6
Explanation:
Step 1) 14 is even; divide by 2 and obtain 7.
Step 2) 7 is odd; subtract 1 and obtain 6.
Step 3) 6 is even; divide by 2 and obtain 3.
Step 4) 3 is odd; subtract 1 and obtain 2.
Step 5) 2 is even; divide by 2 and obtain 1.
Step 6) 1 is odd; subtract 1 and obtain 0.

Example 2:
Input: num = 8
Output: 4
Explanation: 8 -> 4 -> 2 -> 1 -> 0

Example 3:
Input: num = 123
Output: 12

Constraints:
- 0 <= num <= 10^6
"""


class Solution:
    def numberOfSteps(self, num: int) -> int:
        """
        Approach: Bit manipulation

        Strategy:
        1. Even number (rightmost bit 0): right shift (divide by 2)
        2. Odd number (rightmost bit 1): subtract 1 (flip rightmost bit)
        3. Count operations until num becomes 0
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

        if num == 0:
            return 0

        steps = 0

        while num > 0:
            if num & 1:  # Odd (rightmost bit is 1)
                num -= 1
            else:  # Even (rightmost bit is 0)
                num >>= 1
            steps += 1

        return steps


# Alternative: Count bits approach
class SolutionBitCount:
    def numberOfSteps(self, num: int) -> int:
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

        Insight:
        - Each 1 bit requires 2 operations (subtract, then divide)
        - Each 0 bit requires 1 operation (divide)
        - Except the leading 1 bit only needs 1 operation
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

        if num == 0:
            return 0

        # Number of bits
        bits = num.bit_length()

        # Count 1 bits
        ones = bin(num).count("1")

        # Total steps = (bits - 1) for divisions + ones for subtractions
        return bits - 1 + ones


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.numberOfSteps(14) == 6
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.numberOfSteps(8) == 4
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.numberOfSteps(123) == 12
    print("✓ Test case 3 passed")

    # Test case 4
    assert solution.numberOfSteps(0) == 0
    print("✓ Test case 4 passed")

    print("\nAll test cases passed!")
