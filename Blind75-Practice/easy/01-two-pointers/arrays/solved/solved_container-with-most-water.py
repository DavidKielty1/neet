"""
11. Container With Most Water
Difficulty: Medium (but good for two pointers practice)
Pattern: Two Pointers

You are given an integer array height of length n. There are n vertical lines
drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Example:
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49

Time: O(n), Space: O(1)
"""


def max_area(height):
    """
    Two pointers approach - start from both ends and move inward
    """
    left, right = 0, len(height) - 1
    max_water = 0

    while left < right:
        # Calculate current area
        width = right - left
        current_height = min(height[left], height[right])
        current_area = width * current_height
        max_water = max(max_water, current_area)

        # Move the pointer with smaller height
        if height[left] < height[right]:
            left += 1
        else:
            right -= 1

    return max_water


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
