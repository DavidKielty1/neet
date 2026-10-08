/*
 * 252. Meeting Rooms
 * Difficulty: Easy
 * Pattern: Intervals / Sorting
 *
 * Problem:
 * Given an array of meeting time intervals where intervals[i] = [starti, endi],
 * determine if a person could attend all meetings. Return true if no two
 * meetings overlap, and false otherwise. Two meetings overlap when one starts
 * before the other ends.
 *
 * Example 1:
 * Input: intervals = [[0,30],[5,10],[15,20]]
 * Output: false
 *
 * Example 2:
 * Input: intervals = [[7,10],[2,4]]
 * Output: true
 *
 * Constraints:
 * - 0 <= intervals.length <= 10^4
 * - intervals[i].length == 2
 * - 0 <= starti < endi <= 10^6
 */
import java.util.Arrays;

public class MeetingRooms {
    public boolean canAttendMeetings(int[][] intervals) {
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

        // Sort by start; check non-overlap.

        // java.util.Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        // for (int i = 1; i < intervals.length; i++) {
        //     if (intervals[i][0] < intervals[i - 1][1]) {
        //         return false;
        //     }
        // }
        // return true;
        throw new UnsupportedOperationException("Implement canAttendMeetings");
    }
    public static void main(String[] args) {
        MeetingRooms s = new MeetingRooms();
        assert s.canAttendMeetings(new int[][] {{0, 30}, {5, 10}, {15, 20}}) == false;
        System.out.println("All test cases passed!");
    }

}
