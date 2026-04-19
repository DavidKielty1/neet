"""
LeetCode 67: Add Binary
Difficulty: Easy
Pattern: Bit Manipulation / Math

Problem:
Given two binary strings a and b, return their sum as a binary string.

Example 1:
Input: a = "11", b = "1"
Output: "100"

Example 2:
Input: a = "1010", b = "1011"
Output: "10101"

Constraints:
- 1 <= a.length, b.length <= 10^4
- a and b consist only of '0' or '1' characters
- Each string does not contain leading zeros except for the zero itself

Time Complexity: O(max(len(a), len(b)))
Space Complexity: O(max(len(a), len(b)))
"""


class Solution:
    def addBinary(self, a: str, b: str) -> str:
        """
        Approach: Iterate from right to left with carry

        Strategy:
        1. Start from rightmost digits
        2. Add corresponding digits with carry
        3. Calculate new digit and carry
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
            total = carry

            if i >= 0:
                total += int(a[i])
                i -= 1

            if j >= 0:
                total += int(b[j])
                j -= 1

            result.append(str(total % 2))
            carry = total // 2

        return "".join(reversed(result))


# Alternative using Python built-ins
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
