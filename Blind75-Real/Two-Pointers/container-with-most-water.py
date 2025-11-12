"""
11. Container With Most Water - https://leetcode.com/problems/container-with-most-water/
Difficulty: Medium
Pattern: Two Pointers

You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

Example 1:
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

Example 2:
Input: height = [1,1]
Output: 1

Time: O(n), Space: O(1)
"""

from typing import List


def max_area(height: List[int]) -> int:
    """
    Two pointers approach:
    - Start with pointers at both ends
    - Calculate area = min(height[left], height[right]) * (right - left)
    - Move the pointer with smaller height inward
    - Only moving the smaller height can potentially increase the area
    Time: O(n), Space: O(1)
    """
    maxArea = 0
    left, right = 0, len(height) - 1

    while left < right:
        width = right - left
        vertical = min(height[right], height[left])
        area = width * vertical
        maxArea = max(maxArea, area)

        if height[right] > height[left]:
            left += 1
        else:
            right -= 1

    return maxArea


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
