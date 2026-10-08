"""
13. Roman to Integer
Difficulty: Easy
Pattern: Math & Geometry

Problem:
Roman numerals are represented by seven symbols: I=1, V=5, X=10, L=50, C=100,
D=500, M=1000. Given a roman numeral string s, convert it to an integer.
Usually symbols are written largest to smallest from left to right and added.
When a smaller value appears before a larger one, that pair is subtracted
(IV=4, IX=9, XL=40, XC=90, CD=400, CM=900).

Example 1:
Input: s = "III"
Output: 3

Example 2:
Input: s = "LVIII"
Output: 58

Example 3:
Input: s = "MCMXCIV"
Output: 1994

Constraints:
- 1 <= s.length <= 15
- s contains only the characters ('I','V','X','L','C','D','M')
- It is guaranteed that s is a valid roman numeral in the range [1, 3999]
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
