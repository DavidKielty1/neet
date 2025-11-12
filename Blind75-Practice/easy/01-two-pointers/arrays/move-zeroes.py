"""
283. Move Zeroes
Difficulty: Easy
Pattern: Two Pointers

Given an integer array nums, move all 0's to the end of it while maintaining
the relative order of the non-zero elements.

Contract (LeetCode 283):
- Modify nums in-place to move all zeros to the end.
- Do not return anything; mutate nums directly.

Example:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Time: O(n), Space: O(1)
"""


# e.g. array = [1, 0, 0, 2, 3, 0]
def move_zeroes(nums):
    # slow, fast.
    # range for fast read moving digits to start
    # while for slow write with changes remaining to 0
    left = 0
    right = 0

    while right < len(nums):  # Outer loop with bounds check
        if nums[right] != 0:  # ✓ Use if, not while!
            nums[left], nums[right] = nums[right], nums[left]
            left += 1
        right += 1


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
