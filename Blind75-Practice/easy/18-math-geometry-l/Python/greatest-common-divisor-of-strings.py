"""
1071. Greatest Common Divisor of Strings
Difficulty: Easy
Pattern: Math & Geometry

Problem:
For two strings str1 and str2, we say that t divides s if and only if s =
t + t + ... + t (t concatenated with itself one or more times). Given two
strings str1 and str2, return the largest string x such that x divides both
str1 and str2. If no such non-empty string exists, return an empty string.

Example 1:
Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"

Example 2:
Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"

Example 3:
Input: str1 = "LEET", str2 = "CODE"
Output: ""

Constraints:
- 1 <= str1.length, str2.length <= 1000
- str1 and str2 consist of English uppercase letters
"""

import math


class Solution:
    def gcdOfStrings(self, str1: str, str2: str) -> str:
        if str1 + str2 != str2 + str1:
            return ""
        g = math.gcd(len(str1), len(str2))
        return str1[:g]


if __name__ == "__main__":
    s = Solution()
    assert s.gcdOfStrings("ABCABC", "ABC") == "ABC"
    assert s.gcdOfStrings("ABABAB", "ABAB") == "AB"
    assert s.gcdOfStrings("LEET", "CODE") == ""
    print("All test cases passed!")
