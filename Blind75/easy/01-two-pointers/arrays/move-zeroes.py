"""
283. Move Zeroes
Difficulty: Easy
Pattern: Two Pointers

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Time: O(n), Space: O(1)
"""


def move_zeroes(nums):
    """
    Two pointers: slow for non-zero position, fast for traversal
    """
    slow = 0

    # Move all non-zero elements to the front
    for fast in range(len(nums)):
        if nums[fast] != 0:
            nums[slow], nums[fast] = nums[fast], nums[slow]
            slow += 1


# Alternative: Two passes approach
def move_zeroes_two_passes(nums):
    """
    First pass: move non-zeros, second pass: fill with zeros
    """
    slow = 0

    # First pass: move non-zero elements
    for fast in range(len(nums)):
        if nums[fast] != 0:
            nums[slow] = nums[fast]
            slow += 1

    # Second pass: fill remaining positions with zeros
    for i in range(slow, len(nums)):
        nums[i] = 0


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
