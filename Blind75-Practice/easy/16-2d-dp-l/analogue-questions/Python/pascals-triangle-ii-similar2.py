"""
LeetCode 228: Summary Ranges
Difficulty: Easy
Pattern: Arrays

Problem:
You are given a sorted unique integer array nums.

A range [a,b] is the set of all integers from a to b (inclusive).

Return the smallest sorted list of ranges that cover all the numbers in the array exactly.
That is, each element of nums is covered by exactly one of the ranges, and there is no
integer x such that x is in one of the ranges but not in nums.

Each range [a,b] in the list should be output as:
- "a->b" if a != b
- "a" if a == b

Example 1:
Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: The ranges are:
[0,2] --> "0->2"
[4,5] --> "4->5"
[7,7] --> "7"

Example 2:
Input: nums = [0,2,3,4,6,8,9]
Output: ["0","2->4","6","8->9"]

Constraints:
- 0 <= nums.length <= 20
- -2^31 <= nums[i] <= 2^31 - 1
- All the values of nums are unique
- nums is sorted in ascending order

Time Complexity: O(n)
Space Complexity: O(n)
"""

from typing import List


class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        """
        Approach: Track range start and end

        Strategy:
        1. Track start of current range
        2. When gap found, add range to result
        3. Handle single number vs range format
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

        if not nums:
            return []

        result = []
        start = 0

        for i in range(len(nums)):
            # Check if next number is not consecutive
            if i == len(nums) - 1 or nums[i] + 1 != nums[i + 1]:
                if start == i:
                    result.append(str(nums[start]))
                else:
                    result.append(f"{nums[start]}->{nums[i]}")
                start = i + 1

        return result


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.summaryRanges([0, 1, 2, 4, 5, 7]) == ["0->2", "4->5", "7"]
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.summaryRanges([0, 2, 3, 4, 6, 8, 9]) == ["0", "2->4", "6", "8->9"]
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
