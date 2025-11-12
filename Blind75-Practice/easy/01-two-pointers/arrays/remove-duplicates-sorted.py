"""
26. Remove Duplicates from Sorted Array
Difficulty: Easy
Pattern: Two Pointers

Given an integer array nums sorted in non-decreasing order, remove the
duplicates in-place such that each unique element appears only once. The
relative order of the elements should be kept the same.

Contract (LeetCode 26):
- Modify nums in-place so that the first k elements of nums contain the
  unique elements in order.
- Return k (the number of unique elements). The values beyond index k-1
  are ignored by the caller and may be any value.

Example:
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]  # Only the first 2 positions are considered

Time: O(n), Space: O(1)
"""

from typing import List


# e.g. [0, 1, 2, 3, 4, 2, 2, 3, 3, 4]
# e.g. [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
def remove_duplicates(nums: List[int]) -> int:
    """
    Two pointers approach: read and write indices
    """
    if not nums:
        return 0

    left = 1

    for right in range(1, len(nums)):
        if nums[right] > nums[left - 1]:
            nums[left] = nums[right]
            left += 1

    return left


# Test cases
if __name__ == "__main__":
    # Test 1
    nums1 = [1, 1, 2]
    result1 = remove_duplicates(nums1)
    print(f"Remove Duplicates: {result1}, nums = {nums1}")  # 2, [1, 2, _]

    # Test 2
    nums2 = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
    result2 = remove_duplicates(nums2)
    print(
        f"Remove Duplicates: {result2}, nums = {nums2}"
    )  # 5, [0, 1, 2, 3, 4, _, _, _, _, _]

    # Test 3
    nums3 = [1, 2, 3]
    result3 = remove_duplicates(nums3)
    print(f"Remove Duplicates: {result3}, nums = {nums3}")  # 3, [1, 2, 3]
