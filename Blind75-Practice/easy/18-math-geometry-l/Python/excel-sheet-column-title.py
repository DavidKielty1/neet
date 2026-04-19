"""
LeetCode 168: Excel Sheet Column Title
Difficulty: Easy
Pattern: Math & Geometry

Convert 1 -> "A", 28 -> "AB". Base-26 with offset: Excel columns are 1-indexed (no zero digit).

Approach: Repeatedly: n--, append (char)('A' + n % 26), n /= 26.

Time Complexity: O(log_26 n)
Space Complexity: O(log_26 n) for the string
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
