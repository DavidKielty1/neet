"""
168. Excel Sheet Column Title
Difficulty: Easy
Pattern: Math & Geometry

Problem:
Given an integer columnNumber, return its corresponding column title as it
appears in an Excel sheet. For example, 1 maps to "A", 2 maps to "B", 26 maps
to "Z", 27 maps to "AA", and 28 maps to "AB".

Example 1:
Input: columnNumber = 1
Output: "A"

Example 2:
Input: columnNumber = 28
Output: "AB"

Example 3:
Input: columnNumber = 701
Output: "ZY"

Constraints:
- 1 <= columnNumber <= 2^31 - 1
"""

from typing import List


class Solution:
    def convertToTitle(self, columnNumber: int) -> str:
        parts: List[str] = []
        n = columnNumber
        while n > 0:
            n -= 1
            parts.append(chr(ord("A") + (n % 26)))
            n //= 26
        return "".join(reversed(parts))


if __name__ == "__main__":
    s = Solution()
    assert s.convertToTitle(1) == "A"
    assert s.convertToTitle(28) == "AB"
    assert s.convertToTitle(701) == "ZY"
    print("All test cases passed!")
