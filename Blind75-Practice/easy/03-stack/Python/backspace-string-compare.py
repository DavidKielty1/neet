"""
844. Backspace String Compare
Difficulty: Easy
Pattern: Stack / Two Pointers

Problem:
Given two strings s and t, return true if they are equal when both are typed
into empty text editors. '#' means a backspace character. Backspacing an
empty text leaves it empty.

Example 1:
Input: s = "ab#c", t = "ad#c"
Output: true

Example 2:
Input: s = "ab##", t = "c#d#"
Output: true

Example 3:
Input: s = "a#c", t = "b"
Output: false

Constraints:
- 1 <= s.length, t.length <= 200
- s and t only contain lowercase letters and '#' characters
"""


class Solution:
    def backspaceCompare(self, s: str, t: str) -> bool:
        """
        Approach: Stack to process backspaces

        Strategy:
        1. Use stack to build final string
        2. For each character:
           - If '#', pop from stack
           - Otherwise, push to stack
        3. Compare final strings
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

        def build_string(string):
            stack = []
            for char in string:
                if char == "#":
                    if stack:
                        stack.pop()
                else:
                    stack.append(char)
            return "".join(stack)

        return build_string(s) == build_string(t)


# Alternative O(1) space approach
class SolutionTwoPointer:
    def backspaceCompare(self, s: str, t: str) -> bool:
        def next_valid_char(string, index):
            """Find next valid character index going backwards"""
            backspace = 0
            while index >= 0:
                if string[index] == "#":
                    backspace += 1
                elif backspace > 0:
                    backspace -= 1
                else:
                    break
                index -= 1
            return index

        i, j = len(s) - 1, len(t) - 1

        while i >= 0 or j >= 0:
            i = next_valid_char(s, i)
            j = next_valid_char(t, j)

            # Both finished
            if i < 0 and j < 0:
                return True
            # One finished, other didn't
            if i < 0 or j < 0:
                return False
            # Characters don't match
            if s[i] != t[j]:
                return False

            i -= 1
            j -= 1

        return True


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.backspaceCompare("ab#c", "ad#c") == True
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.backspaceCompare("ab##", "c#d#") == True
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.backspaceCompare("a#c", "b") == False
    print("✓ Test case 3 passed")

    # Test case 4
    assert solution.backspaceCompare("a##c", "#a#c") == True
    print("✓ Test case 4 passed")

    print("\nAll test cases passed!")
