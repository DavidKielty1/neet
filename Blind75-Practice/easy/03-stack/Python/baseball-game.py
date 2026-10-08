"""
682. Baseball Game
Difficulty: Easy
Pattern: Stack

Problem:
You are keeping score for a baseball game with strange rules. You are given
a list of strings operations, where operations[i] is one of:
- An integer x: record a new score of x.
- "+": record a new score that is the sum of the previous two scores.
- "D": record a new score that is double the previous score.
- "C": invalidate and remove the previous score.
Return the sum of all recorded scores after applying every operation. It is
guaranteed that operations will be valid.

Example 1:
Input: ops = ["5","2","C","D","+"]
Output: 30

Example 2:
Input: ops = ["5","-2","4","C","D","9","+","+"]
Output: 27

Example 3:
Input: ops = ["1","C"]
Output: 0

Constraints:
- 1 <= operations.length <= 1000
- operations[i] is "C", "D", "+", or an integer string in [-3 * 10^4, 3 * 10^4]
- For + and D operations, there are enough previous scores
- For C operations, there is at least one previous score
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
