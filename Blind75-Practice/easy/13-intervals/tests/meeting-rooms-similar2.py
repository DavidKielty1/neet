"""
Similar Problem 2: Merge Intervals (Easy Version)
Difficulty: Easy
Pattern: Intervals

Problem:
Given an array of intervals where intervals[i] = [starti, endi],
merge all overlapping intervals and return an array of the non-overlapping intervals.

Example 1:
Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: [1,3] and [2,6] overlap, merge to [1,6]

Example 2:
Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]

Example 3:
Input: intervals = [[1,2]]
Output: [[1,2]]

Constraints:
- 1 <= intervals.length <= 10^4
- intervals[i].length == 2
- 0 <= starti <= endi <= 10^4
"""

from typing import List


class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        """
        Approach: Sort and merge overlapping intervals

        Strategy:
        1. Sort intervals by start time
        2. For each interval, check if it overlaps with last merged
        3. If overlap, extend the end time
        4. If no overlap, add as new interval
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
            return []

        # Sort by start time
        intervals.sort(key=lambda x: x[0])

        merged = [intervals[0]]

        for i in range(1, len(intervals)):
            last = merged[-1]
            current = intervals[i]

            # Check for overlap: current starts before last ends
            if current[0] <= last[1]:
                # Merge: extend end time
                last[1] = max(last[1], current[1])
            else:
                # No overlap: add new interval
                merged.append(current)

        return merged


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.merge([[1, 3], [2, 6], [8, 10], [15, 18]]) == [
        [1, 6],
        [8, 10],
        [15, 18],
    ]
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.merge([[1, 4], [4, 5]]) == [[1, 5]]
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.merge([[1, 2]]) == [[1, 2]]
    print("✓ Test case 3 passed")

    # Test case 4
    assert solution.merge([[1, 4], [0, 4]]) == [[0, 4]]
    print("✓ Test case 4 passed")

    print("\nAll test cases passed!")
