"""
LeetCode 682: Baseball Game
Difficulty: Easy
Pattern: Stack

Problem:
You are keeping the scores for a baseball game with strange rules. At the beginning of
the game, you start with an empty record.

You are given a list of strings operations, where operations[i] is the ith operation you
must apply to the record and is one of the following:

- An integer x: Record a new score of x.
- '+': Record a new score that is the sum of the previous two scores.
- 'D': Record a new score that is the double of the previous score.
- 'C': Invalidate the previous score, removing it from the record.

Return the sum of all the scores on the record after applying all the operations.

Example 1:
Input: ops = ["5","2","C","D","+"]
Output: 30
Explanation:
"5" - Add 5 to the record, record is now [5].
"2" - Add 2 to the record, record is now [5, 2].
"C" - Invalidate and remove the previous score, record is now [5].
"D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
"+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
The total sum is 5 + 10 + 15 = 30.

Example 2:
Input: ops = ["5","-2","4","C","D","9","+","+"]
Output: 27

Example 3:
Input: ops = ["1","C"]
Output: 0

Constraints:
- 1 <= operations.length <= 1000
- operations[i] is "C", "D", "+", or a string representing an integer in the range [-3 * 10^4, 3 * 10^4]
- For operation "+", there will always be at least two previous scores on the record
- For operations "C" and "D", there will always be at least one previous score on the record

Time Complexity: O(n)
Space Complexity: O(n)
"""

from typing import List


class Solution:
    def calPoints(self, operations: List[str]) -> int:
        """
        Approach: Stack for record keeping

        Strategy:
        1. Use stack to maintain scores
        2. Process each operation accordingly
        3. Return sum of final scores
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

        for op in operations:
            if op == "C":
                stack.pop()
            elif op == "D":
                stack.append(stack[-1] * 2)
            elif op == "+":
                stack.append(stack[-1] + stack[-2])
            else:
                stack.append(int(op))

        return sum(stack)


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.calPoints(["5", "2", "C", "D", "+"]) == 30
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.calPoints(["5", "-2", "4", "C", "D", "9", "+", "+"]) == 27
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.calPoints(["1", "C"]) == 0
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
