/*
 * Ported from: 13-intervals/analogue-questions/Python/meeting-rooms-similar1.py
 * --- Original description ---
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
 */

import java.util.*;
import java.util.function.*;


public class MeetingRoomsSimilar1 {



    static class Solution {
        public boolean hasOverlap(List<List<Integer>> intervals) {
            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            // if len(intervals) <= 1:
            // return False
            // intervals.sort(key=lambda x: x[0])
            // for i in range(1, len(intervals)):
            // prev_end = intervals[i - 1][1]
            // curr_start = intervals[i][0]
            // if curr_start < prev_end:
            // return True
            // return False

            throw new UnsupportedOperationException("Implement hasOverlap");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.hasOverlap(java.util.List.of(java.util.List.of(0, 30), java.util.List.of(5, 10), java.util.List.of(15, 20))) == true);
        System.out.println("✓ Test case 1 passed");
        assert (sol.hasOverlap(java.util.List.of(java.util.List.of(7, 10), java.util.List.of(2, 4))) == false);
        System.out.println("✓ Test case 2 passed");
        assert (sol.hasOverlap(java.util.List.of(java.util.List.of(1, 2), java.util.List.of(2, 3))) == false);
        System.out.println("✓ Test case 3 passed");
        assert (sol.hasOverlap(java.util.List.of(java.util.List.of(1, 3), java.util.List.of(2, 6), java.util.List.of(8, 10))) == true);
        System.out.println("✓ Test case 4 passed");
        System.out.println("\nAll test cases passed!");
    }
}
