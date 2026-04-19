/*
35. Search Insert Position
Difficulty: Easy
Pattern: Binary Search

Return index of target if present, else index where it would be inserted.

Time: O(log n), Space: O(1)
*/
public class SearchInsertPositionJava {
    public int searchInsert(int[] nums, int target) {
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

        // Lower bound binary search.

        // int lo = 0;
        // int hi = nums.length - 1;
        // while (lo <= hi) {
        //     int mid = lo + (hi - lo) / 2;
        //     if (nums[mid] == target) {
        //         return mid;
        //     }
        //     if (nums[mid] < target) {
        //         lo = mid + 1;
        //     } else {
        //         hi = mid - 1;
        //     }
        // }
        // return lo;
        throw new UnsupportedOperationException("Implement searchInsert");
    }
    public static void main(String[] args) {
        SearchInsertPositionJava s = new SearchInsertPositionJava();
        assert s.searchInsert(new int[] {1, 3, 5, 6}, 5) == 2;
        assert s.searchInsert(new int[] {1, 3, 5, 6}, 2) == 1;
        System.out.println("All test cases passed!");
    }

}
