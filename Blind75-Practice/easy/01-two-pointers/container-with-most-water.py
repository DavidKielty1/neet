"""
11. Container With Most Water
Difficulty: Medium
Pattern: Two Pointers

You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Example:
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49

Time: O(n), Space: O(1)
"""

from typing import List


def max_area(heights: List[int]) -> int:
    """
    Two-pointer solution:
    - Start with pointers at both ends.
    - Compute area with width (right - left).
    - Move the pointer at the shorter line inward, because only that can potentially increase
      the min height and thus the area despite a smaller width.
    Time: O(n), Space: O(1)
    """
    left, right = 0, len(heights) - 1
    totalarea = 0

    # [1,8,6,2,5,4,8,3,7]
    while left < right:
        minheight = min(heights[left], heights[right])

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

    left = 0
    right = len(heights) - 1
    max_area = 0

    # [1,8,6,2,5,4,8,3,7]
    while left < right:
        min_height = min(heights[left], heights[right])
        curr_area = (right - left) * min_height
        max_area = max(max_area, curr_area)

        if heights[left] > heights[right]:
            right -= 1
        else:
            left += 1

    return max_area
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


# Test cases
if __name__ == "__main__":
    # Test 1
    height1 = [1, 8, 6, 2, 5, 4, 8, 3, 7]
    print(f"Max Area: {max_area(height1)}")  # 49

    # Test 2
    height2 = [1, 1]
    print(f"Max Area: {max_area(height2)}")  # 1

    # Test 3
    height3 = [4, 3, 2, 1, 4]
    print(f"Max Area: {max_area(height3)}")  # 16
