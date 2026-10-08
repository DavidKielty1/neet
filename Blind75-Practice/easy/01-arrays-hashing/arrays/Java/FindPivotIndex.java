/*
 * 724. Find Pivot Index
 * Difficulty: Easy
 * Pattern: Prefix Sum
 *
 * Problem:
 * Given an integer array nums, return the leftmost pivot index. The pivot
 * index is the index where the sum of all numbers strictly to the left equals
 * the sum of all numbers strictly to the right. The pivot element itself is
 * excluded from both sums. If the index is at an edge, the empty side has sum
 * 0. If no such index exists, return -1.
 *
 * Example 1:
 * Input: nums = [1,7,3,6,5,6]
 * Output: 3
 *
 * Example 2:
 * Input: nums = [1,2,3]
 * Output: -1
 *
 * Example 3:
 * Input: nums = [2,1,-1]
 * Output: 0
 *
 * Constraints:
 * - 1 <= nums.length <= 10^4
 * - -1000 <= nums[i] <= 1000
 */
public class FindPivotIndex {
    public int findPivot (int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }

        int left = 0;
        int right = total;

        for (int i = 0; i < nums.length; i++) {
            if (left == right - nums[i]) {
                return i;
            }

            left += nums[i];
            right -= nums[i];
        }

        return -1;



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

        // int total = 0;
        // for (int num : nums) {
            // total += num;
        // }
        // int leftSum = 0;
        // for (int i = 0; i < nums.length; i++) {
            // int rightSum = total - leftSum - nums[i];
            // if (leftSum == rightSum) {
                // return i;
            // }
            // leftSum += nums[i];
        // }
        // return -1;

        throw new UnsupportedOperationException("Implement pivotIndex");
    }

    public static void main(String[] args) {
        FindPivotIndex s = new FindPivotIndex();
        assert s.pivotIndex(new int[] {1, 7, 3, 6, 5, 6}) == 3;
        assert s.pivotIndex(new int[] {1, 2, 3}) == -1;
        assert s.pivotIndex(new int[] {2, 1, -1}) == 0;
        System.out.println("All test cases passed!");
    }
}
