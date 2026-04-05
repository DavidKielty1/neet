/*
 * Ported from: 13-intervals/analogue-questions/Python/meeting-rooms-similar2.py
 * --- Original description ---
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
 */

import java.util.*;
import java.util.function.*;


public class MeetingRoomsSimilar2Java {



    static class Solution {
        public List<List<Integer>> merge(List<List<Integer>> intervals) {
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

            // if not intervals:
            // return []
            // intervals.sort(key=lambda x: x[0])
            // merged = [intervals[0]]
            // for i in range(1, len(intervals)):
            // last = merged[-1]
            // current = intervals[i]
            // if current[0] <= last[1]:
            // last[1] = max(last[1], current[1])
            // else:
            // merged.append(current)
            // return merged

            throw new UnsupportedOperationException("Implement merge");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert java.util.Objects.equals(sol.merge(java.util.List.of(java.util.List.of(1, 3), java.util.List.of(2, 6), java.util.List.of(8, 10), java.util.List.of(15, 18))), java.util.List.of(java.util.List.of(1, 6), java.util.List.of(8, 10), java.util.List.of(15, 18)));
        System.out.println("✓ Test case 1 passed");
        assert java.util.Objects.equals(sol.merge(java.util.List.of(java.util.List.of(1, 4), java.util.List.of(4, 5))), java.util.List.of(java.util.List.of(1, 5)));
        System.out.println("✓ Test case 2 passed");
        assert java.util.Objects.equals(sol.merge(java.util.List.of(java.util.List.of(1, 2))), java.util.List.of(java.util.List.of(1, 2)));
        System.out.println("✓ Test case 3 passed");
        assert java.util.Objects.equals(sol.merge(java.util.List.of(java.util.List.of(1, 4), java.util.List.of(0, 4))), java.util.List.of(java.util.List.of(0, 4)));
        System.out.println("✓ Test case 4 passed");
        System.out.println("\nAll test cases passed!");
    }
}
