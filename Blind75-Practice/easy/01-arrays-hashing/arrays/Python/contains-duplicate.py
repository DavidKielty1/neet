"""
LeetCode 217: Contains Duplicate
Difficulty: Easy
Pattern: Arrays & Hashing

Problem:
Given an integer array nums, return true if any value appears at least twice
in the array, and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true

Example 2:
Input: nums = [1,2,3,4]
Output: false

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true

Constraints:
- 1 <= nums.length <= 10^5
- -10^9 <= nums[i] <= 10^9

Time Complexity: O(n)
Space Complexity: O(n)
"""

from typing import List


class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        """
        Approach: Use a hash set to track seen elements

        Strategy:
        1. Create empty set to track seen numbers
        2. Iterate through array
        3. If number already in set, return True
        4. Otherwise, add to set
        5. If loop completes, no duplicates found
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

        for num in nums:
            if num in seen:
                return True
            seen.add(num)

        return False


# Alternative approach using set length comparison
class SolutionAlternative:
    def containsDuplicate(self, nums: List[int]) -> bool:
        return len(set(nums)) < len(nums)


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.containsDuplicate([1, 2, 3, 1]) == True
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.containsDuplicate([1, 2, 3, 4]) == False
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.containsDuplicate([1, 1, 1, 3, 3, 4, 3, 2, 4, 2]) == True
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
