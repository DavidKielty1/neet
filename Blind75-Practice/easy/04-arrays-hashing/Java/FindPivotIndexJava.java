/*
724. Find Pivot Index
Difficulty: Easy
Pattern: Prefix Sum

Left sum equals right sum at pivot; return leftmost or -1.

Example 1:
Input: nums = [1,7,3,6,5,6]
Output: 3
Hint: Left of index 3 sums to 11, right sums to 11; total − left − pivot = right.

Example 2:
Input: nums = [1,2,3]
Output: -1
Hint: No index balances; one pass with running left sum and fixed total helps.

Time: O(n), Space: O(1)
*/
public class FindPivotIndexJava {

    // Pass 1: total. Pass 2: at pivot i, left = sum(0..i-1), right = sum(i+1..end);
    // start with left=0, right=total-nums[0]; then left+=nums[i], right-=nums[i+1].
    public int pivotIndex(int[] nums) {
        if (nums == null || nums.length == 0) return -1;

        int total = 0;
        for (int num : nums) {
            total += num;
        }

        int leftSum = 0;
        int rightSum = total - nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (leftSum == rightSum) {
                return i;
            }
            if (i < nums.length - 1) {
                leftSum += nums[i];
                rightSum -= nums[i + 1];
            }
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

    

        // int total = 0;
        // for (int num : nums) {
        //     total += num;
        // }
        // int leftSum = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     int rightSum = total - leftSum - nums[i];
        //     if (leftSum == rightSum) {
        //         return i;
        //     }
        //     leftSum += nums[i];
        // }
        // return -1;

        throw new UnsupportedOperationException("Implement pivotIndex");
    }

    public static void main(String[] args) {
        FindPivotIndexJava s = new FindPivotIndexJava();
        assert s.pivotIndex(new int[] {1, 7, 3, 6, 5, 6}) == 3;
        assert s.pivotIndex(new int[] {1, 2, 3}) == -1;
        assert s.pivotIndex(new int[] {2, 1, -1}) == 0;
        System.out.println("All test cases passed!");
    }
}
