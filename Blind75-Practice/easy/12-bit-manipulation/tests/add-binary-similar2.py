"""
LeetCode 43: Multiply Strings (simplified to Easy)
Difficulty: Medium (simplified to Easy)
Pattern: String / Math

Problem:
Given two non-negative integers num1 and num2 represented as strings, return the product
of num1 and num2, also represented as a string.

Note: You must not use any built-in BigInteger library or convert the inputs to integer
directly.

Example 1:
Input: num1 = "2", num2 = "3"
Output: "6"

Example 2:
Input: num1 = "123", num2 = "456"
Output: "56088"

Constraints:
- 1 <= num1.length, num2.length <= 200
- num1 and num2 consist of digits only
- Both num1 and num2 do not contain any leading zero, except the number 0 itself

Time Complexity: O(m * n)
Space Complexity: O(m + n)
"""


class Solution:
    def multiply(self, num1: str, num2: str) -> str:
        """
        Approach: Simulate multiplication

        Strategy:
        1. Handle edge case of zero
        2. Multiply each digit and track position
        3. Sum all intermediate results
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

        if num1 == "0" or num2 == "0":
            return "0"

        m, n = len(num1), len(num2)
        result = [0] * (m + n)

        for i in range(m - 1, -1, -1):
            for j in range(n - 1, -1, -1):
                mult = int(num1[i]) * int(num2[j])
                p1, p2 = i + j, i + j + 1

                total = mult + result[p2]
                result[p2] = total % 10
                result[p1] += total // 10

        # Convert to string and remove leading zeros
        result_str = "".join(map(str, result))
        return result_str.lstrip("0") or "0"


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.multiply("2", "3") == "6"
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.multiply("123", "456") == "56088"
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.multiply("0", "123") == "0"
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
