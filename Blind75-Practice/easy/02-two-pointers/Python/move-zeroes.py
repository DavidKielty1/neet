"""
283. Move Zeroes
Difficulty: Easy
Pattern: Two Pointers

Problem:
Given an integer array nums, move all 0's to the end of it while maintaining
the relative order of the non-zero elements. You must do this in-place
without making a copy of the array. Do not return anything; mutate nums
directly.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:
Input: nums = [0]
Output: [0]

Constraints:
- 1 <= nums.length <= 10^4
- -2^31 <= nums[i] <= 2^31 - 1
"""


# e.g. array = [1, 0, 0, 2, 3, 0]
def move_zeroes(nums: list[int]):
    # slow, fast.
    # range for fast read moving digits to start
    # while for slow write with changes remaining to 0

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
    # left = 0

    # for right in range(len(nums)):
    #     if nums[right] != 0:
    #         nums[right], nums[left] = nums[left], nums[right]
    #         left += 1


# Test cases
if __name__ == "__main__":
    # Test 1
    nums1 = [0, 1, 0, 3, 12]
    move_zeroes(nums1)
    print(f"Move Zeroes: {nums1}")  # [1, 3, 12, 0, 0]

    # Test 2
    nums2 = [0]
    move_zeroes(nums2)
    print(f"Move Zeroes: {nums2}")  # [0]

    # Test 3
    nums3 = [1, 0, 0, 2, 3]
    move_zeroes(nums3)
    print(f"Move Zeroes: {nums3}")  # [1, 2, 3, 0, 0]
