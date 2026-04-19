"""
LeetCode 169: Majority Element
Difficulty: Easy
Pattern: Arrays & Hashing

Problem:
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume
that the majority element always exists in the array.

Example 1:
Input: nums = [3,2,3]
Output: 3

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2

Constraints:
- n == nums.length
- 1 <= n <= 5 * 10^4
- -10^9 <= nums[i] <= 10^9

Follow-up: Could you solve the problem in linear time and in O(1) space?

Time Complexity: O(n)
Space Complexity: O(1) with Boyer-Moore, O(n) with hash map
"""

from typing import List


class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        """
        Approach: Boyer-Moore Voting Algorithm

        Strategy:
        1. Maintain a candidate and count
        2. If count is 0, set current element as candidate
        3. Increment count if element equals candidate, else decrement
        4. Candidate at end is the majority element
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

        candidate = None
        count = 0

        for num in nums:
            if count == 0:
                candidate = num
            count += 1 if num == candidate else -1

        return candidate


# Alternative using hash map
class SolutionHashMap:
    def majorityElement(self, nums: List[int]) -> int:
        from collections import Counter

        count = Counter(nums)
        return count.most_common(1)[0][0]


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.majorityElement([3, 2, 3]) == 3
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.majorityElement([2, 2, 1, 1, 1, 2, 2]) == 2
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
