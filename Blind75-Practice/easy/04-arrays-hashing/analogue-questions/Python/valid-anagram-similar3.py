"""
Similar Problem 3: Isomorphic Strings
Difficulty: Easy
Pattern: Hash Map (Two-way Mapping)

Problem:
Given two strings s and t, determine if they are isomorphic.
Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while
preserving the order of characters. No two characters may map to the same character,
but a character may map to itself.

Example 1:
Input: s = "egg", t = "add"
Output: true

Example 2:
Input: s = "foo", t = "bar"
Output: false

Example 3:
Input: s = "paper", t = "title"
Output: true

Constraints:
- 1 <= s.length <= 5 * 10^4
- t.length == s.length
- s and t consist of any valid ascii character
"""


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        """
        Approach: Two hash maps for bidirectional mapping

        Strategy:
        1. Map each character in s to corresponding character in t
        2. Also map each character in t back to s (ensure one-to-one)
        3. Check if mapping is consistent throughout
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

        if len(s) != len(t):
            return False

        s_to_t = {}
        t_to_s = {}

        for char_s, char_t in zip(s, t):
            # Check s -> t mapping
            if char_s in s_to_t:
                if s_to_t[char_s] != char_t:
                    return False
            else:
                s_to_t[char_s] = char_t

            # Check t -> s mapping
            if char_t in t_to_s:
                if t_to_s[char_t] != char_s:
                    return False
            else:
                t_to_s[char_t] = char_s

        return True


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.isIsomorphic("egg", "add") == True
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.isIsomorphic("foo", "bar") == False
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.isIsomorphic("paper", "title") == True
    print("✓ Test case 3 passed")

    # Test case 4
    assert solution.isIsomorphic("badc", "baba") == False
    print("✓ Test case 4 passed")

    print("\nAll test cases passed!")
