"""
Similar Problem 3: Find All Duplicates in Array
Difficulty: Easy
Pattern: Hash Set

Problem:
Given an integer array nums, return all the elements that appear more than once.
You may return the answer in any order.

Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]

Example 2:
Input: nums = [1,1,2]
Output: [1]

Example 3:
Input: nums = [1]
Output: []

Constraints:
- 1 <= nums.length <= 10^5
- 1 <= nums[i] <= 10^5
"""

from typing import List


class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:
        """
        Approach: Hash set to track seen and duplicates

        Strategy:
        1. Use set to track seen numbers
        2. Use another set to track duplicates (avoid adding same duplicate twice)
        3. Return list of duplicates
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

        seen = set()
        duplicates = set()

        for num in nums:
            if num in seen:
                duplicates.add(num)
            else:
                seen.add(num)

        return list(duplicates)


# Alternative: Using Counter
class SolutionAlternative:
    def findDuplicates(self, nums: List[int]) -> List[int]:
        from collections import Counter

        count = Counter(nums)
        return [num for num, freq in count.items() if freq > 1]


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    result1 = sorted(solution.findDuplicates([4, 3, 2, 7, 8, 2, 3, 1]))
    assert result1 == [2, 3]
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.findDuplicates([1, 1, 2]) == [1]
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.findDuplicates([1]) == []
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
