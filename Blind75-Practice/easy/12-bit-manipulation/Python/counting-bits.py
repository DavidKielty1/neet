"""
LeetCode 338: Counting Bits
Difficulty: Easy
Pattern: Bit Manipulation / Dynamic Programming

Problem:
Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n),
ans[i] is the number of 1's in the binary representation of i.

Example 1:
Input: n = 2
Output: [0,1,1]
Explanation:
0 --> 0
1 --> 1
2 --> 10

Example 2:
Input: n = 5
Output: [0,1,1,2,1,2]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101

Constraints:
- 0 <= n <= 10^5

Follow up:
- It is very easy to come up with a solution with a runtime of O(n log n).
  Can you do it in O(n)?

Time Complexity: O(n)
Space Complexity: O(1) (output doesn't count)
"""

from typing import List


class Solution:
    def countBits(self, n: int) -> List[int]:
        """
        Approach: DP with bit manipulation trick

        Strategy:
        Key insight: i & (i-1) removes the rightmost 1 bit
        So: countBits(i) = countBits(i & (i-1)) + 1

        Example:
        i=5 (101), i&(i-1)=4 (100)
        countBits(5) = countBits(4) + 1
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

        ans = [0] * (n + 1)

        for i in range(1, n + 1):
            ans[i] = ans[i & (i - 1)] + 1

        return ans


# Alternative: Right shift pattern
class SolutionRightShift:
    def countBits(self, n: int) -> List[int]:
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

        Pattern: i has same number of 1s as i//2,
                 plus 1 if i is odd

        i//2 is same as i >> 1
        i is odd if i & 1 == 1
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

        ans = [0] * (n + 1)

        for i in range(1, n + 1):
            ans[i] = ans[i >> 1] + (i & 1)

        return ans


# Alternative: Count using function for each number
class SolutionNaive:
    def countBits(self, n: int) -> List[int]:
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

        Time: O(n log n) - count bits for each number
        """

        def count_ones(num):
            count = 0
            while num:
                count += num & 1
                num >>= 1
            return count

        return [count_ones(i) for i in range(n + 1)]


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.countBits(2) == [0, 1, 1]
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.countBits(5) == [0, 1, 1, 2, 1, 2]
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.countBits(0) == [0]
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
