"""
15. 3Sum
Difficulty: Medium (but good for two pointers practice)
Pattern: Two Pointers

Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Example:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]

Time: O(n²), Space: O(1) excluding output
"""


def three_sum(nums):
    """
    Sort array, then use two pointers for each fixed element
    """
    nums.sort()
    result = []

    for i in range(len(nums) - 2):
        # Skip duplicates for the first element
        if i > 0 and nums[i] == nums[i - 1]:
            continue

        left, right = i + 1, len(nums) - 1

        while left < right:
            current_sum = nums[i] + nums[left] + nums[right]

            if current_sum == 0:
                result.append([nums[i], nums[left], nums[right]])

                # Skip duplicates
                while left < right and nums[left] == nums[left + 1]:
                    left += 1
                while left < right and nums[right] == nums[right - 1]:
                    right -= 1

                left += 1
                right -= 1
            elif current_sum < 0:
                left += 1
            else:
                right -= 1

    return result


# Test cases
if __name__ == "__main__":
    # Test 1
    nums1 = [-1, 0, 1, 2, -1, -4]
    print(f"3Sum: {three_sum(nums1)}")  # [[-1, -1, 2], [-1, 0, 1]]

    # Test 2
    nums2 = [0, 1, 1]
    print(f"3Sum: {three_sum(nums2)}")  # []

    # Test 3
    nums3 = [0, 0, 0]
    print(f"3Sum: {three_sum(nums3)}")  # [[0, 0, 0]]
