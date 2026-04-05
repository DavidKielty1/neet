"""
LeetCode 1071: Greatest Common Divisor of Strings
Difficulty: Easy
Pattern: Math & Geometry

Largest string x such that str1 and str2 can be formed by repeating x.

Key fact: a common divisor exists iff str1 + str2 == str2 + str1. Then answer length is
gcd(len(str1), len(str2)).

Time Complexity: O(len(str1) + len(str2)) for concatenation check + gcd
Space Complexity: O(len(str1) + len(str2)) for the concatenations (can avoid full concat for
check by comparing in passes; kept simple here)
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
