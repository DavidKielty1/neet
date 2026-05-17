/*
 * Ported from: 13-intervals/analogue-questions/Python/meeting-rooms-similar3.py
 * --- Original description ---
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
 */

import java.util.*;
import java.util.function.*;


public class MeetingRoomsSimilar3 {



    static class Solution {
        public int findMinArrowShots(List<List<Integer>> points) {
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

            // if not points:
            // return 0
            // points.sort(key=lambda x: x[1])
            // arrows = 1
            // arrow_pos = points[0][1]
            // for i in range(1, len(points)):
            // if points[i][0] > arrow_pos:
            // arrows += 1
            // arrow_pos = points[i][1]
            // return arrows

            throw new UnsupportedOperationException("Implement findMinArrowShots");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.findMinArrowShots(java.util.List.of(java.util.List.of(10, 16), java.util.List.of(2, 8), java.util.List.of(1, 6), java.util.List.of(7, 12))) == 2);
        System.out.println("✓ Test case 1 passed");
        assert (sol.findMinArrowShots(java.util.List.of(java.util.List.of(1, 2), java.util.List.of(3, 4), java.util.List.of(5, 6), java.util.List.of(7, 8))) == 4);
        System.out.println("✓ Test case 2 passed");
        assert (sol.findMinArrowShots(java.util.List.of(java.util.List.of(1, 2), java.util.List.of(2, 3), java.util.List.of(3, 4), java.util.List.of(4, 5))) == 2);
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
