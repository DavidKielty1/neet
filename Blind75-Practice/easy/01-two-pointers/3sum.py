"""
15. 3Sum
Difficulty: Medium
Pattern: Two Pointers

Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

Example:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]

Time: O(n²), Space: O(1)
"""

from typing import List


def three_sum(nums: List[int]) -> List[List[int]]:
    """
    Fix one number (range), use two pointers for the other two (while left < right).
    target = -nums[i]
    we sort, so if the current_sum is smaller than target, we increment left.
    if current_sum is larger than target, we decrement right.
    """

    nums.sort()
    output: List[List[int]] = []

    # [-4, -1, -1, 0, 0, 0, 1, 2, 4, 4]
    for i in range(len(nums)):
        while nums[i] == nums[i] + 1:
            continue

        left = i + 1
        right = len(nums) - 1

        while right > left:
            current_total = nums[i] + nums[left] + nums[right]

            if current_total == 0:
                output.append([nums[i], nums[left], nums[right]])

                while right > left and nums[right] == nums[right - 1]:
                    right -= 1

                while right > left and nums[left] == nums[left + 1]:
                    left += 1

                right -= 1
                left += 1

            elif current_total > 0:
                right -= 1

            else:
                left += 1

    return output

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

    # nums.sort()
    # result = []

    # for i in range(len(nums) - 2):
    #     if i > 0 and nums[i] == nums[i - 1]:
    #         continue

    #     left, right = i + 1, len(nums) - 1
    #     target = -nums[i]

    #     while left < right:
    #         curr_sum = nums[left] + nums[right]
    #         if curr_sum == target:
    #             result.append([nums[i], nums[left], nums[right]])

    #             while left < right and nums[left] == nums[left + 1]:
    #                 left += 1

    #             while left < right and nums[right] == nums[right - 1]:
    #                 right -= 1

    #             left += 1
    #             right -= 1

    #         elif curr_sum < target:
    #             left += 1

    #         else:
    #             right -= 1

    # return result


# Test cases
if __name__ == "__main__":
    # Test 1
    nums1 = [-1, 0, 1, 2, -1, -4]
    print(f"3Sum: {three_sum(nums1)}")  # [[-1,-1,2],[-1,0,1]]

    # Test 2
    nums2 = [0, 1, 1]
    print(f"3Sum: {three_sum(nums2)}")  # []

    # Test 3
    nums3 = [0, 0, 0]
    print(f"3Sum: {three_sum(nums3)}")  # [[0,0,0]]
