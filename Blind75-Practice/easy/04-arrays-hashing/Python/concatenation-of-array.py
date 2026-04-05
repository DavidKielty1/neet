"""
LeetCode 1929: Concatenation of Array
Difficulty: Easy
Pattern: Arrays & Hashing

Build an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i]
for 0 <= i < n (i.e., ans is the concatenation of two nums arrays).

Time Complexity: O(n)
Space Complexity: O(n) for the output
"""

from typing import List


class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        return nums + nums


if __name__ == "__main__":
    s = Solution()
    assert s.getConcatenation([1, 2, 1]) == [1, 2, 1, 1, 2, 1]
    assert s.getConcatenation([1, 3, 2, 1]) == [1, 3, 2, 1, 1, 3, 2, 1]
    print("All test cases passed!")
