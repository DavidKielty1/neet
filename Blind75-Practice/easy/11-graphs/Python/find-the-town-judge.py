"""
997. Find the Town Judge
Difficulty: Easy
Pattern: Graphs (directed edges)

Problem:
In a town of n people labeled from 1 to n, there is a rumor that one of these
people is secretly the town judge. If the town judge exists, then: the town
judge trusts nobody; everybody (except the town judge) trusts the town judge;
and there is exactly one person that satisfies these conditions. You are given
an array trust where trust[i] = [ai, bi] representing that the person labeled
ai trusts the person labeled bi. Return the label of the town judge if the
town judge exists and can be identified, or return -1 otherwise.

Example 1:
Input: n = 2, trust = [[1,2]]
Output: 2

Example 2:
Input: n = 3, trust = [[1,3],[2,3]]
Output: 3

Example 3:
Input: n = 3, trust = [[1,3],[2,3],[3,1]]
Output: -1

Constraints:
- 1 <= n <= 1000
- 0 <= trust.length <= 10^4
- trust[i].length == 2
- All the pairs of trust are unique
- ai != bi
- 1 <= ai, bi <= n
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
