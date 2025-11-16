"""
LeetCode 1441: Build an Array With Stack Operations
Difficulty: Medium (simplified to Easy)
Pattern: Stack / Simulation

Problem:
You are given an integer array target and an integer n.

You have an empty stack with the two following operations:

- "Push": pushes an integer to the top of the stack.
- "Pop": removes the integer on the top of the stack.

You also have a stream of the integers in the range [1, n].

Use the two stack operations to make the numbers in the stack (from the bottom to the top)
equal to target. You should follow the following rules:

- If the stream of the integers is not empty, pick the next integer from the stream and
  push it to the top of the stack.
- If the stack is not empty, you can pop the integer at the top of the stack.
- If, at any moment, the elements in the stack (from the bottom to the top) are equal to
  target, do not read new integers from the stream and do not do more operations on the stack.

Return the stack operations needed to build target following the mentioned rules. If there
are multiple valid answers, return any of them.

Example 1:
Input: target = [1,3], n = 3
Output: ["Push","Push","Pop","Push"]
Explanation: Initially the stack s is empty. The last element is the top of the stack.
Read 1 from stream and push it to the stack. s = [1].
Read 2 from stream and push it to the stack. s = [1,2].
Pop the integer on the top of the stack. s = [1].
Read 3 from stream and push it to the stack. s = [1,3].

Example 2:
Input: target = [1,2,3], n = 3
Output: ["Push","Push","Push"]

Example 3:
Input: target = [1,2], n = 4
Output: ["Push","Push"]

Constraints:
- 1 <= target.length <= 100
- 1 <= n <= 100
- 1 <= target[i] <= n
- target is strictly increasing

Time Complexity: O(n)
Space Complexity: O(n)
"""

from typing import List


class Solution:
    def buildArray(self, target: List[int], n: int) -> List[str]:
        """
        Approach: Simulate stack operations

        Strategy:
        1. Iterate through numbers 1 to n
        2. Push each number
        3. If not in target, pop it
        4. Stop when we've built target
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

        result = []
        target_idx = 0

        for num in range(1, n + 1):
            result.append("Push")

            if num == target[target_idx]:
                target_idx += 1
                if target_idx == len(target):
                    break
            else:
                result.append("Pop")

        return result


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.buildArray([1, 3], 3) == ["Push", "Push", "Pop", "Push"]
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.buildArray([1, 2, 3], 3) == ["Push", "Push", "Push"]
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.buildArray([1, 2], 4) == ["Push", "Push"]
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
