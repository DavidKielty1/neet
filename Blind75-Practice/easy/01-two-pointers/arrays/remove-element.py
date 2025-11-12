"""
27. Remove Element
Difficulty: Easy
Pattern: Two Pointers

Given an integer array nums and an integer val, remove all occurrences of
val in-place. The order of the elements may be changed.

Contract (LeetCode 27):
- Modify nums in-place so that the first k elements of nums contain the
  elements that are not equal to val (order of these elements may change).
- Return k (the number of elements not equal to val). The values beyond
  index k-1 are ignored by the caller and may be any value.

Example:
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]  # Only the first 2 positions are considered

Time: O(n), Space: O(1)
"""

from typing import List


# nums: [3, 2, 2, 3]
# nums: [0, 1, 4, 0, 3, 2, 2, 2] target = 2
def remove_element(nums: List[int], val: int) -> int:
    """
    Two pointers: write index tracks where to place next 'keep' element
    """
    left = 0

    for right in range(len(nums)):
        if nums[right] != val:
            nums[left] = nums[right]
            left += 1

    return left


# Test cases
if __name__ == "__main__":
    # Test 1
    nums1 = [3, 2, 2, 3]
    val1 = 3
    result1 = remove_element(nums1, val1)
    print(f"Remove Element: {result1}, nums = {nums1}")  # 2, [2, 2, _, _]

    # Test 2
    nums2 = [0, 1, 3, 0, 4, 0, 4, 2]
    val2 = 2
    result2 = remove_element(nums2, val2)
    print(f"Remove Element: {result2}, nums = {nums2}")  # 5, [0, 1, 3, 0, 4, _, _, _]

    # Test 3
    nums3 = [1]
    val3 = 1
    result3 = remove_element(nums3, val3)
    print(f"Remove Element: {result3}, nums = {nums3}")  # 0, [_]
