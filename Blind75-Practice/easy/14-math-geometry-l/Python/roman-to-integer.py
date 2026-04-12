"""
LeetCode 13: Roman to Integer
Difficulty: Easy
Pattern: Math & Geometry

Convert a Roman numeral string to an integer (I=1, V=5, X=10, L=50, C=100, D=500, M=1000).

Approach: Left-to-right; if current value < next, subtract current; else add.

Time Complexity: O(n)
Space Complexity: O(1) — fixed map size
"""


class Solution:
    def romanToInt(self, s: str) -> int:
        vals = {"I": 1, "V": 5, "X": 10, "L": 50, "C": 100, "D": 500, "M": 1000}
        total = 0
        for i, ch in enumerate(s):
            v = vals[ch]
            if i + 1 < len(s) and v < vals[s[i + 1]]:
                total -= v
            else:
                total += v
        return total


if __name__ == "__main__":
    s = Solution()
    assert s.romanToInt("III") == 3
    assert s.romanToInt("LVIII") == 58
    assert s.romanToInt("MCMXCIV") == 1994
    print("All test cases passed!")
