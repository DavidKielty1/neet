"""
Similar Problem 2: Add Binary
Difficulty: Easy
Pattern: Math / String

Problem:
Given two binary strings a and b, return their sum as a binary string.

Example 1:
Input: a = "11", b = "1"
Output: "100"

Example 2:
Input: a = "1010", b = "1011"
Output: "10101"

Example 3:
Input: a = "0", b = "0"
Output: "0"

Constraints:
- 1 <= a.length, b.length <= 10^4
- a and b consist only of '0' or '1' characters
- Each string does not contain leading zeros except for the zero itself
"""


class Solution:
    def addBinary(self, a: str, b: str) -> str:
        """
        Approach: Add bit by bit with carry

        Strategy:
        1. Process from right to left
        2. Add corresponding bits plus carry
        3. Result bit is sum % 2, carry is sum // 2
        4. Continue until both strings processed and no carry
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
        carry = 0
        i, j = len(a) - 1, len(b) - 1

        while i >= 0 or j >= 0 or carry:
            # Get current bits
            bit_a = int(a[i]) if i >= 0 else 0
            bit_b = int(b[j]) if j >= 0 else 0

            # Add bits and carry
            total = bit_a + bit_b + carry
            result.append(str(total % 2))
            carry = total // 2

            i -= 1
            j -= 1

        # Reverse to get correct order
        return "".join(result[::-1])


# Alternative: Using Python's built-in
class SolutionBuiltin:
    def addBinary(self, a: str, b: str) -> str:
        return bin(int(a, 2) + int(b, 2))[2:]


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.addBinary("11", "1") == "100"
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.addBinary("1010", "1011") == "10101"
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.addBinary("0", "0") == "0"
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
