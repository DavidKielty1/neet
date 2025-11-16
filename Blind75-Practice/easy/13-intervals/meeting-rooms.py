"""
LeetCode 252: Meeting Rooms
Difficulty: Easy
Pattern: Intervals

Problem:
Given an array of meeting time intervals where intervals[i] = [start_i, end_i],
determine if a person could attend all meetings.

Example 1:
Input: intervals = [[0,30],[5,10],[15,20]]
Output: false
Explanation: Cannot attend all meetings because [0,30] and [5,10] overlap.

Example 2:
Input: intervals = [[7,10],[2,4]]
Output: true
Explanation: No overlap, can attend all meetings.

Constraints:
- 0 <= intervals.length <= 10^4
- intervals[i].length == 2
- 0 <= start_i < end_i <= 10^6

Time Complexity: O(n log n)
Space Complexity: O(1) or O(n) depending on sort implementation
"""

from typing import List


class Solution:
    def canAttendMeetings(self, intervals: List[List[int]]) -> bool:
        """
        Approach: Sort by start time and check for overlaps

        Strategy:
        1. Sort intervals by start time
        2. Check if any meeting starts before previous one ends
        3. If overlap found, return False
        4. If no overlaps, return True

        Two intervals [a,b] and [c,d] overlap if:
        a < d and c < b (or simply: c < b when sorted by start)
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
        for i in range(1, len(intervals)):
            # If current start < previous end, overlap
            if intervals[i][0] < intervals[i - 1][1]:
                return False

        return True


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1: Overlap
    assert solution.canAttendMeetings([[0, 30], [5, 10], [15, 20]]) == False
    print("✓ Test case 1 passed")

    # Test case 2: No overlap
    assert solution.canAttendMeetings([[7, 10], [2, 4]]) == True
    print("✓ Test case 2 passed")

    # Test case 3: Empty
    assert solution.canAttendMeetings([]) == True
    print("✓ Test case 3 passed")

    # Test case 4: Adjacent meetings (no overlap)
    assert solution.canAttendMeetings([[1, 5], [5, 10]]) == True
    print("✓ Test case 4 passed")

    print("\nAll test cases passed!")
