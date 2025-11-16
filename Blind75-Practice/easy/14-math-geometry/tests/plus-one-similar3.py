"""
Similar Problem 3: Multiply Strings
Difficulty: Easy (Simplified)
Pattern: Math / String

Problem:
Given two non-negative integers num1 and num2 represented as strings,
return the product of num1 and num2, also represented as a string.

Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

Example 1:
Input: num1 = "2", num2 = "3"
Output: "6"

Example 2:
Input: num1 = "123", num2 = "456"
Output: "56088"

Example 3:
Input: num1 = "0", num2 = "0"
Output: "0"

Constraints:
- 1 <= num1.length, num2.length <= 200
- num1 and num2 consist of digits only
- Both num1 and num2 do not contain any leading zero, except the number 0 itself
"""


class Solution:
    def multiply(self, num1: str, num2: str) -> str:
        """
        Approach: Grade school multiplication

        Strategy:
        1. Handle edge case: if either is "0", return "0"
        2. Multiply each digit of num2 with num1
        3. Add results with appropriate offsets
        4. Similar to plus one with carry handling
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

        # Result array to store intermediate products
        m, n = len(num1), len(num2)
        result = [0] * (m + n)

        # Multiply each digit
        for i in range(m - 1, -1, -1):
            for j in range(n - 1, -1, -1):
                # Multiply digits
                product = int(num1[i]) * int(num2[j])

                # Position in result array
                p1, p2 = i + j, i + j + 1

                # Add to existing value at p2
                total = product + result[p2]

                # Store digit and carry
                result[p2] = total % 10
                result[p1] += total // 10

        # Convert to string, skip leading zeros
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
    assert solution.multiply("0", "0") == "0"
    print("✓ Test case 3 passed")

    # Test case 4
    assert solution.multiply("9", "9") == "81"
    print("✓ Test case 4 passed")

    print("\nAll test cases passed!")
