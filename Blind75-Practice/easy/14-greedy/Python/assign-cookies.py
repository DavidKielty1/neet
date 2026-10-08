"""
455. Assign Cookies
Difficulty: Easy
Pattern: Greedy

Problem:
Assume you want to give your children some cookies. You should give each child
at most one cookie. Each child i has a greed factor g[i], which is the minimum
size of a cookie that the child will be content with, and each cookie j has a
size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i, and the
child i will be content. Return the maximum number of content children.

Example 1:
Input: g = [1,2,3], s = [1,1]
Output: 1

Example 2:
Input: g = [1,2], s = [1,2,3]
Output: 2

Constraints:
- 1 <= g.length <= 3 * 10^4
- 0 <= s.length <= 3 * 10^4
- 1 <= g[i], s[j] <= 2^31 - 1
"""

from typing import List


class Solution:
    def findContentChildren(self, g: List[int], s: List[int]) -> int:
        """
        Approach: Greedy with sorting

        Strategy:
        1. Sort both arrays
        2. Try to satisfy children with smallest greed first
        3. Use smallest cookie that satisfies current child
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

        g.sort()
        s.sort()

        child = 0
        cookie = 0

        while child < len(g) and cookie < len(s):
            if s[cookie] >= g[child]:
                child += 1
            cookie += 1

        return child


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.findContentChildren([1, 2, 3], [1, 1]) == 1
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.findContentChildren([1, 2], [1, 2, 3]) == 2
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
