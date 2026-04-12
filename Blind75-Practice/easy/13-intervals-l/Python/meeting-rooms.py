"""
LeetCode 252: Meeting Rooms (Premium)
Difficulty: Easy
Pattern: Intervals

Problem:
Given an array of meeting time intervals where intervals[i] = [starti, endi], determine
if a person could attend all meetings.

Example 1:
Input: intervals = [[0,30],[5,10],[15,20]]
Output: false
Explanation: There is overlap between [0,30] and [5,10], and between [0,30] and [15,20].

Example 2:
Input: intervals = [[7,10],[2,4]]
Output: true

Constraints:
- 0 <= intervals.length <= 10^4
- intervals[i].length == 2
- 0 <= starti < endi <= 10^6

Time Complexity: O(n log n)
Space Complexity: O(1)
"""

from typing import List


class Solution:
    def canAttendMeetings(self, intervals: List[List[int]]) -> bool:
        """
        Approach: Sort and check overlaps

        Strategy:
        1. Sort intervals by start time
        2. Check if any interval overlaps with the next
        3. Overlap exists if current end > next start
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

        if not intervals:
            return True

        # Sort by start time
        intervals.sort(key=lambda x: x[0])

        # Check for overlaps
        for i in range(len(intervals) - 1):
            if intervals[i][1] > intervals[i + 1][0]:
                return False

        return True


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.canAttendMeetings([[0, 30], [5, 10], [15, 20]]) == False
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.canAttendMeetings([[7, 10], [2, 4]]) == True
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.canAttendMeetings([]) == True
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
