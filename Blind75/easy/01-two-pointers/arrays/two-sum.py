"""
1. Two Sum
Difficulty: Easy
Pattern: Two Pointers (with Hash Map)

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

Example:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Time: O(n), Space: O(n)
"""


def two_sum(nums, target):
    """
    Two pointers approach with hash map for O(n) solution
    """
    num_map = {}

    for i, num in enumerate(nums):
        complement = target - num
        if complement in num_map:
            return [num_map[complement], i]
        num_map[num] = i

    return []


# Alternative: Two pointers on sorted array (O(n log n))
def two_sum_sorted(nums, target):
    """
    Two pointers on sorted array - returns values, not indices
    """
    nums.sort()
    left, right = 0, len(nums) - 1

    while left < right:
        current_sum = nums[left] + nums[right]
        if current_sum == target:
            return [nums[left], nums[right]]
        elif current_sum < target:
            left += 1
        else:
            right -= 1

    return []


# Test cases
if __name__ == "__main__":
    # Test 1
    nums1 = [2, 7, 11, 15]
    target1 = 9
    print(f"Two Sum: {two_sum(nums1, target1)}")  # [0, 1]

    # Test 2
    nums2 = [3, 2, 4]
    target2 = 6
    print(f"Two Sum: {two_sum(nums2, target2)}")  # [1, 2]

    # Test 3
    nums3 = [3, 3]
    target3 = 6
    print(f"Two Sum: {two_sum(nums3, target3)}")  # [0, 1]
