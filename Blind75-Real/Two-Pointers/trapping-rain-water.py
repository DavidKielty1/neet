"""
42. Trapping Rain Water - https://leetcode.com/problems/trapping-rain-water/
Difficulty: Hard
Pattern: Two Pointers

Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

Example 1:
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.

Example 2:
Input: height = [4,2,0,3,2,5]
Output: 9

Time: O(n), Space: O(1)
"""

from typing import List


def trap(height: List[int]) -> int:
    """
    Two pointers approach:
    - Use left and right pointers
    - Track max height from left and right
    - Water trapped at position i = min(max_left, max_right) - height[i]
    - Move pointer with smaller max height
    Time: O(n), Space: O(1)
    """
    # TODO: Implement two pointers solution

    left, right = 0, len(height) - 1
    max_left = 0
    max_right = 0
    water = 0

    # [0,1,0,2,1,0,1,3,2,1,2,1]
    while left < right:
        if height[left] < height[right]:
            if height[left] >= max_left:
                max_left = height[left]
            else:
                water += max_left - height[left]

            left += 1
        else:
            if height[right] >= max_right:
                max_right = height[right]
            else:
                water += max_right - height[right]

            right -= 1

    return water

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

    # left, right = 0, len(height) - 1
    # max_left = max_right = 0
    # water = 0

    # # [0,1,0,2,1,0,1,3,2,1,2,1]

    # # [3, 0, 2, 0, 4]
    # while left < right:
    #     # Calculate min side (lower) first
    #     if height[left] < height[right]:
    #         # If right is bigger process left
    #         if height[left] >= max_left:
    #             max_left = height[left]
    #         else:
    #             water += max_left - height[left]

    #         left += 1
    #     else:
    #         # If left is bigger process right
    #         if height[right] >= max_right:
    #             max_right = height[right]
    #         else:
    #             water += max_right - height[right]

    #         right -= 1

    # return water


# Test cases
if __name__ == "__main__":
    # Test 1
    height1 = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
    print(f"Trapping Rain Water: {trap(height1)}")  # 6

    # Test 2
    height2 = [4, 2, 0, 3, 2, 5]
    print(f"Trapping Rain Water: {trap(height2)}")  # 9

    # Test 3
    height3 = [3, 0, 2, 0, 4]
    print(f"Trapping Rain Water: {trap(height3)}")  # 7
