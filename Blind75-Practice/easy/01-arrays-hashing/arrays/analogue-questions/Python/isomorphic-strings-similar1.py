"""
LeetCode 205 Variant: Check if Two Strings Can Be Made Equal
Difficulty: Easy
Pattern: Arrays & Hashing

Problem:
You are given two strings s1 and s2, both of the same length. You can swap two
characters in s1 at most once. Return true if you can make s1 equal to s2, otherwise
return false.

Example 1:
Input: s1 = "bank", s2 = "kanb"
Output: true

Example 2:
Input: s1 = "attack", s2 = "defend"
Output: false

Example 3:
Input: s1 = "kelb", s2 = "kelb"
Output: true

Constraints:
- 1 <= s1.length, s2.length <= 100
- s1.length == s2.length
- s1 and s2 consist of only lowercase English letters

Time Complexity: O(n)
Space Complexity: O(1)
"""


class Solution:
    def areSimilar(self, s1: str, s2: str) -> bool:
        """
        Approach: Find mismatches

        Strategy:
        1. Find all positions where s1 and s2 differ
        2. If 0 differences, return True
        3. If exactly 2 differences, check if swapping makes them equal
        4. Otherwise return False
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

        diff = []
        for i in range(len(s1)):
            if s1[i] != s2[i]:
                diff.append(i)

        if len(diff) == 0:
            return True
        if len(diff) == 2:
            i, j = diff
            return s1[i] == s2[j] and s1[j] == s2[i]
        return False


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.areSimilar("bank", "kanb") == True
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.areSimilar("attack", "defend") == False
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.areSimilar("kelb", "kelb") == True
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
