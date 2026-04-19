"""
LeetCode 1790: Check if One String Swap Can Make Strings Equal
Difficulty: Easy
Pattern: Arrays & Hashing

Problem:
You are given two strings s1 and s2 of equal length. A string swap is an operation
where you choose two indices in a string (not necessarily different) and swap the
characters at these indices.

Return true if it is possible to make both strings equal by performing at most one
string swap on exactly one of the strings. Otherwise, return false.

Example 1:
Input: s1 = "bank", s2 = "kanb"
Output: true
Explanation: For example, swap the first character with the last character of s2 to make "bank".

Example 2:
Input: s1 = "attack", s2 = "defend"
Output: false
Explanation: It is impossible to make them equal with one string swap.

Example 3:
Input: s1 = "kelb", s2 = "kelb"
Output: true
Explanation: The two strings are already equal, so no string swap is needed.

Constraints:
- 1 <= s1.length, s2.length <= 100
- s1.length == s2.length
- s1 and s2 consist of only lowercase English letters

Time Complexity: O(n)
Space Complexity: O(1)
"""


class Solution:
    def areAlmostEqual(self, s1: str, s2: str) -> bool:
        """
        Approach: Compare differences

        Strategy:
        1. Find positions where strings differ
        2. If equal, return True
        3. If exactly 2 differences, check if one swap fixes it
        4. Otherwise False
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

        if s1 == s2:
            return True

        diff_indices = []
        for i in range(len(s1)):
            if s1[i] != s2[i]:
                diff_indices.append(i)
                if len(diff_indices) > 2:
                    return False

        if len(diff_indices) != 2:
            return False

        i, j = diff_indices
        return s1[i] == s2[j] and s1[j] == s2[i]


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.areAlmostEqual("bank", "kanb") == True
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.areAlmostEqual("attack", "defend") == False
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.areAlmostEqual("kelb", "kelb") == True
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
