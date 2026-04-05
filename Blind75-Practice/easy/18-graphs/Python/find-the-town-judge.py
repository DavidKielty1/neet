"""
LeetCode 997: Find the Town Judge
Difficulty: Easy
Pattern: Graphs (directed edges)

Problem:
In a town of n people labeled 1..n, trust is directed: trust[i] = [a, b] means a trusts b.
The town judge trusts nobody and is trusted by everyone else. At most one judge exists.
Return the judge's label if unique and valid, else -1.

Example 1:
Input: n = 2, trust = [[1,2]]
Output: 2

Example 2:
Input: n = 3, trust = [[1,3],[2,3]]
Output: 3

Constraints:
- 1 <= n <= 1000
- 0 <= trust.length <= 10^4

Time Complexity: O(n + t) where t = len(trust)
Space Complexity: O(n)
"""

from typing import List


class Solution:
    def findJudge(self, n: int, trust: List[List[int]]) -> int:
        """Judge has out-degree 0 and in-degree n - 1."""

        out_deg = [0] * (n + 1)
        in_deg = [0] * (n + 1)
        for a, b in trust:
            out_deg[a] += 1
            in_deg[b] += 1
        for person in range(1, n + 1):
            if out_deg[person] == 0 and in_deg[person] == n - 1:
                return person
        return -1


if __name__ == "__main__":
    sol = Solution()
    assert sol.findJudge(2, [[1, 2]]) == 2
    assert sol.findJudge(3, [[1, 3], [2, 3]]) == 3
    assert sol.findJudge(3, [[1, 3], [2, 3], [3, 1]]) == -1
    print("All tests passed.")
