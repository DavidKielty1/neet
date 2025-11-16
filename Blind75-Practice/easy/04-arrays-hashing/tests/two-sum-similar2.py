"""
Similar Problem 2: Two Sum - Count Pairs
Difficulty: Easy
Pattern: Hash Map

Problem:
Given an array of integers nums and an integer target, return the number of
pairs of indices (i, j) where i < j and nums[i] + nums[j] == target.

Example 1:
Input: nums = [1,2,3,2,1], target = 3
Output: 2
Explanation: Pairs are (0,1) and (2,4): nums[0]+nums[1]=1+2=3, nums[2]+nums[4]=3+0=3

Example 2:
Input: nums = [1,1,1,1], target = 2
Output: 6
Explanation: All pairs sum to 2

Example 3:
Input: nums = [1,2,3], target = 7
Output: 0

Constraints:
- 2 <= nums.length <= 1000
- -10^9 <= nums[i] <= 10^9
- -10^9 <= target <= 10^9
"""

from typing import List
from collections import defaultdict


class Solution:
    def twoSumCount(self, nums: List[int], target: int) -> int:
        """
        Approach: Hash map to count complements

        Strategy:
        1. For each number, check if complement exists in seen numbers
        2. Add count of complement to result
        3. Update count of current number
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

        count = 0
        seen = defaultdict(int)

        for num in nums:
            complement = target - num
            # Add number of times we've seen the complement
            count += seen[complement]
            # Update count of current number
            seen[num] += 1

        return count


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.twoSumCount([1, 2, 3, 2, 1], 3) == 2
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.twoSumCount([1, 1, 1, 1], 2) == 6
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.twoSumCount([1, 2, 3], 7) == 0
    print("✓ Test case 3 passed")

    # Test case 4
    assert solution.twoSumCount([3, 3, 3], 6) == 3
    print("✓ Test case 4 passed")

    print("\nAll test cases passed!")
