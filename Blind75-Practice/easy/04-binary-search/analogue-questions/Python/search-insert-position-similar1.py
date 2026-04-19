"""
LeetCode 744: Find Smallest Letter Greater Than Target
Difficulty: Easy
Pattern: Binary Search

Problem:
You are given an array of characters letters that is sorted in non-decreasing order,
and a character target. There are at least two different characters in letters.

Return the smallest character in letters that is lexicographically greater than target.
If such a character does not exist, return the first character in letters.

Example 1:
Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.

Example 2:
Input: letters = ["c","f","j"], target = "c"
Output: "f"
Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.

Example 3:
Input: letters = ["x","x","y","y"], target = "z"
Output: "x"
Explanation: There are no characters in letters that is lexicographically greater than 'z'
so we return letters[0].

Constraints:
- 2 <= letters.length <= 10^4
- letters[i] is a lowercase English letter
- letters is sorted in non-decreasing order
- letters contains at least two different characters
- target is a lowercase English letter

Time Complexity: O(log n)
Space Complexity: O(1)
"""

from typing import List


class Solution:
    def nextGreatestLetter(self, letters: List[str], target: str) -> str:
        """
        Approach: Binary search for ceiling

        Strategy:
        1. Use binary search to find smallest letter > target
        2. If no such letter exists, return first letter (wrap around)
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

        left, right = 0, len(letters) - 1

        while left <= right:
            mid = left + (right - left) // 2

            if letters[mid] <= target:
                left = mid + 1
            else:
                right = mid - 1

        # left is now at the smallest letter > target, or past the end
        return letters[left % len(letters)]


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.nextGreatestLetter(["c", "f", "j"], "a") == "c"
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.nextGreatestLetter(["c", "f", "j"], "c") == "f"
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.nextGreatestLetter(["x", "x", "y", "y"], "z") == "x"
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
