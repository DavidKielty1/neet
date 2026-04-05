"""
Similar Problem 3: Minimum Number of Arrows to Burst Balloons (Easy Version)
Difficulty: Easy
Pattern: Intervals / Greedy

Problem:
There are some spherical balloons taped onto a flat wall that represents the XY-plane.
The balloons are represented as a 2D integer array points where points[i] = [xstart, xend]
denotes a balloon whose horizontal diameter stretches between xstart and xend.

An arrow can be shot up exactly vertically (in the positive y-direction) from any point along the x-axis.
A balloon with xstart and xend is burst by an arrow shot at x if xstart <= x <= xend.

Find the minimum number of arrows that must be shot to burst all balloons.

Example 1:
Input: points = [[10,16],[2,8],[1,6],[7,12]]
Output: 2
Explanation: Shoot at x=6 (bursts [2,8],[1,6]) and x=11 (bursts [10,16],[7,12])

Example 2:
Input: points = [[1,2],[3,4],[5,6],[7,8]]
Output: 4

Example 3:
Input: points = [[1,2],[2,3],[3,4],[4,5]]
Output: 2

Constraints:
- 1 <= points.length <= 10^5
- points[i].length == 2
- -2^31 <= xstart < xend <= 2^31 - 1
"""

from typing import List


class Solution:
    def findMinArrowShots(self, points: List[List[int]]) -> int:
        """
        Approach: Greedy - sort and track overlap

        Strategy:
        1. Sort balloons by end position
        2. Shoot arrow at end of first balloon
        3. This arrow bursts all overlapping balloons
        4. When no overlap, need new arrow
        """

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

        if not points:
            return 0

        # Sort by end position
        points.sort(key=lambda x: x[1])

        arrows = 1
        arrow_pos = points[0][1]

        for i in range(1, len(points)):
            # If current balloon doesn't overlap with arrow position
            if points[i][0] > arrow_pos:
                # Need new arrow
                arrows += 1
                arrow_pos = points[i][1]

        return arrows


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.findMinArrowShots([[10, 16], [2, 8], [1, 6], [7, 12]]) == 2
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.findMinArrowShots([[1, 2], [3, 4], [5, 6], [7, 8]]) == 4
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.findMinArrowShots([[1, 2], [2, 3], [3, 4], [4, 5]]) == 2
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
