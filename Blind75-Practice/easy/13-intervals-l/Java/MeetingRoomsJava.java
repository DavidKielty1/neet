/*
252. Meeting Rooms
Difficulty: Easy
Pattern: Intervals / Sorting

Given intervals [start,end], can one person attend all?

Time: O(n log n), Space: O(1) excluding sort
*/
import java.util.Arrays;

public class MeetingRoomsJava {
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
        MeetingRoomsJava s = new MeetingRoomsJava();
        assert s.canAttendMeetings(new int[][] {{0, 30}, {5, 10}, {15, 20}}) == false;
        System.out.println("All test cases passed!");
    }

}
