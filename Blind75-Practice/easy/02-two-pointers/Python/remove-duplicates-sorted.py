"""
26. Remove Duplicates from Sorted Array
Difficulty: Easy
Pattern: Two Pointers

Problem:
Given an integer array nums sorted in non-decreasing order, remove the
duplicates in-place so that each unique element appears only once. The
relative order of the elements must be kept the same. Return k, the number
of unique elements. The first k positions of nums should contain those
unique values in order. Anything after index k - 1 does not matter.

Example 1:
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]

Example 2:
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]

Constraints:
- 1 <= nums.length <= 3 * 10^4
- -100 <= nums[i] <= 100
- nums is sorted in non-decreasing order
"""

from typing import List


def remove_duplicates(nums: List[int]) -> int:
    """
    Two pointers approach: read and write indices
    """
    # [0, 1, 2, 3, 4, 2, 2, 3, 3, 4]
    # [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]

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

    #

    #

    #

    #

    #

    # left = 1

    # # e.g. [0, 1, 2, 3, 4, 2, 2, 3, 3, 4]
    # # e.g. [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
    # for right in range(1, len(nums)):
    #     if nums[right] > nums[left - 1]:
    #         nums[left] = nums[right]
    #         left += 1

    # return left

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

    #

    #
    #

    #

    #

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

    # Test 4: Unsorted array (violates problem precondition, but shows behavior)
    nums4 = [0, 1, 2, 3, 4, 2, 2, 3, 3, 4]
    result4 = remove_duplicates(nums4)
    print(
        f"Remove Duplicates: {result4}, nums = {nums4[:result4]}"
    )  # 5, [0, 1, 2, 3, 4] - '1' is preserved!
