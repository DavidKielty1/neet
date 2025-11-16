"""
Similar Problem 1: Non-overlapping Intervals (Easy Version)
Difficulty: Easy
Pattern: Intervals

Problem:
Given an array of intervals where intervals[i] = [starti, endi],
return true if there are any overlapping intervals, false otherwise.

Example 1:
Input: intervals = [[0,30],[5,10],[15,20]]
Output: true
Explanation: [0,30] overlaps with both [5,10] and [15,20]

Example 2:
Input: intervals = [[7,10],[2,4]]
Output: false

Example 3:
Input: intervals = [[1,2],[2,3]]
Output: false
Explanation: Intervals that touch at endpoints are not overlapping

Constraints:
- 1 <= intervals.length <= 10^5
- intervals[i].length == 2
- 0 <= starti < endi <= 10^6
"""

from typing import List


class Solution:
    def hasOverlap(self, intervals: List[List[int]]) -> bool:
        """
        Approach: Sort and check consecutive intervals

        Strategy:
        1. Sort intervals by start time
        2. Check each consecutive pair for overlap
        3. Overlap exists if current.start < previous.end
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

        if len(intervals) <= 1:
            return False

        # Sort by start time
        intervals.sort(key=lambda x: x[0])

        # Check consecutive pairs
        for i in range(1, len(intervals)):
            prev_end = intervals[i - 1][1]
            curr_start = intervals[i][0]

            # Overlap if current starts before previous ends
            if curr_start < prev_end:
                return True

        return False


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.hasOverlap([[0, 30], [5, 10], [15, 20]]) == True
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.hasOverlap([[7, 10], [2, 4]]) == False
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.hasOverlap([[1, 2], [2, 3]]) == False
    print("✓ Test case 3 passed")

    # Test case 4
    assert solution.hasOverlap([[1, 3], [2, 6], [8, 10]]) == True
    print("✓ Test case 4 passed")

    print("\nAll test cases passed!")
