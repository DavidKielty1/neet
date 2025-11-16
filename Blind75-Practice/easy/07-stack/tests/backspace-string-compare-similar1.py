"""
LeetCode 1047: Remove All Adjacent Duplicates In String
Difficulty: Easy
Pattern: Stack

Problem:
You are given a string s consisting of lowercase English letters. A duplicate removal
consists of choosing two adjacent and equal letters and removing them.

We repeatedly make duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made. It can be
proven that the answer is unique.

Example 1:
Input: s = "abbaca"
Output: "ca"
Explanation:
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal,
and this is the only possible move. The result of this move is that the string is "aaca",
of which only "aa" is possible, so the final string is "ca".

Example 2:
Input: s = "azxxzy"
Output: "ay"

Constraints:
- 1 <= s.length <= 10^5
- s consists of lowercase English letters.

Time Complexity: O(n)
Space Complexity: O(n)
"""


class Solution:
    def removeDuplicates(self, s: str) -> str:
        """
        Approach: Stack for adjacent removal

        Strategy:
        1. Use stack to track characters
        2. If top of stack equals current char, pop
        3. Otherwise push current char
        4. Return stack as string
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

        stack = []

        for char in s:
            if stack and stack[-1] == char:
                stack.pop()
            else:
                stack.append(char)

        return "".join(stack)


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.removeDuplicates("abbaca") == "ca"
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.removeDuplicates("azxxzy") == "ay"
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.removeDuplicates("aaa") == "a"
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
