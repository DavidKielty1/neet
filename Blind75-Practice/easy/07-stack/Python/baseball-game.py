"""
LeetCode 682: Baseball Game
Difficulty: Easy
Pattern: Stack

Parse operations: integer score, "+" sum last two, "D" double last, "C" cancel last.
Return sum of scores after all ops.

Time Complexity: O(n)
Space Complexity: O(n) for the stack
"""

from typing import List


class Solution:
    def calPoints(self, operations: List[str]) -> int:
        stack: List[int] = []
        for op in operations:
            if op == "+":
                stack.append(stack[-1] + stack[-2])
            elif op == "D":
                stack.append(2 * stack[-1])
            elif op == "C":
                stack.pop()
            else:
                stack.append(int(op))
        return sum(stack)


if __name__ == "__main__":
    s = Solution()
    assert s.calPoints(["5", "2", "C", "D", "+"]) == 30
    assert s.calPoints(["5", "-2", "4", "C", "D", "9", "+"]) == 27
    assert s.calPoints(["1", "C"]) == 0
    print("All test cases passed!")
