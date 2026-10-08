"""
1929. Concatenation of Array
Difficulty: Easy
Pattern: Arrays & Hashing

Problem:
Given an integer array nums of length n, return an array ans of length 2n
where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n. In other
words, ans is the concatenation of two copies of nums.

Example 1:
Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]

Example 2:
Input: nums = [1,3,2,1]
Output: [1,3,2,1,1,3,2,1]

Constraints:
- n == nums.length
- 1 <= n <= 1000
- 1 <= nums[i] <= 1000
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
