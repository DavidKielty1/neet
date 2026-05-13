/*
704. Binary Search
Difficulty: Easy
Pattern: Binary Search

Return index of target in sorted nums, or -1. O(log n).

Time: O(log n), Space: O(1)
*/
public class BinarySearchJava {
    // [0, 1, 2, 3, 4, 5, 6, 7, 8] ; target = 5
    public int search(int[] nums, int target) {
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
        // return -1;
    }
    public static void main(String[] args) {
        BinarySearchJava s = new BinarySearchJava();
        assert s.search(new int[] {-1, 0, 3, 5, 9, 12}, 9) == 4;
        assert s.search(new int[] {-1, 0, 3, 5, 9, 12}, 2) == -1;
        System.out.println("All test cases passed!");
    }

}
