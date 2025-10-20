"""
27. Remove Element
Difficulty: Easy
Pattern: Two Pointers

Given an integer array nums and an integer val, remove all occurrences of val in-place. The order of the elements may be changed.

Example:
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]

Time: O(n), Space: O(1)
"""


def remove_element(nums, val):
    """
    Two pointers: slow for valid elements, fast for traversal
    """
    slow = 0

    for fast in range(len(nums)):
        if nums[fast] != val:
            nums[slow] = nums[fast]
            slow += 1

    return slow


# Alternative: Two pointers from both ends (changes order)
def remove_element_swap(nums, val):
    """
    Two pointers from both ends - swaps elements to end
    """
    left, right = 0, len(nums) - 1

    while left <= right:
        if nums[left] == val:
            nums[left], nums[right] = nums[right], nums[left]
            right -= 1
        else:
            left += 1

    return left


# Test cases
if __name__ == "__main__":
    # Test 1
    nums1 = [3, 2, 2, 3]
    val1 = 3
    result1 = remove_element(nums1, val1)
    print(f"Length: {result1}, Array: {nums1[:result1]}")  # Length: 2, Array: [2, 2]

    # Test 2
    nums2 = [0, 1, 2, 2, 3, 0, 4, 2]
    val2 = 2
    result2 = remove_element(nums2, val2)
    print(
        f"Length: {result2}, Array: {nums2[:result2]}"
    )  # Length: 5, Array: [0, 1, 3, 0, 4]

    # Test 3
    nums3 = [1]
    val3 = 1
    result3 = remove_element(nums3, val3)
    print(f"Length: {result3}, Array: {nums3[:result3]}")  # Length: 0, Array: []
