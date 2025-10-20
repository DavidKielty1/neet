"""
26. Remove Duplicates from Sorted Array
Difficulty: Easy
Pattern: Two Pointers

Given an integer array nums sorted in non-decreasing order, remove the
duplicates in-place such that each unique element appears only once. The
relative order of the elements should be kept the same.

Example:
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]

Time: O(n), Space: O(1)
"""


def remove_duplicates(nums):
    """
    Two pointers: slow pointer for unique elements, fast pointer for traversal
    """
    if not nums:
        return 0

    slow = 0

    for fast in range(1, len(nums)):
        if nums[fast] != nums[slow]:
            slow += 1
            nums[slow] = nums[fast]

    return slow + 1


# Alternative: Remove duplicates with at most k occurrences
def remove_duplicates_k(nums, k=2):
    """
    Remove duplicates allowing at most k occurrences
    """
    if len(nums) <= k:
        return len(nums)

    slow = k

    for fast in range(k, len(nums)):
        if nums[fast] != nums[slow - k]:
            nums[slow] = nums[fast]
            slow += 1

    return slow


# Test cases
if __name__ == "__main__":
    # Test 1
    nums1 = [1, 1, 2]
    result1 = remove_duplicates(nums1)
    print(f"Length: {result1}, Array: {nums1[:result1]}")  # Length: 2, Array: [1, 2]

    # Test 2
    nums2 = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
    result2 = remove_duplicates(nums2)
    print(
        f"Length: {result2}, Array: {nums2[:result2]}"
    )  # Length: 5, Array: [0, 1, 2, 3, 4]

    # Test 3 - Allow at most 2 occurrences
    nums3 = [1, 1, 1, 2, 2, 3]
    result3 = remove_duplicates_k(nums3, 2)
    print(
        f"Length: {result3}, Array: {nums3[:result3]}"
    )  # Length: 5, Array: [1, 1, 2, 2, 3]
