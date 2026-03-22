/*
724. Find Pivot Index
Difficulty: Easy
Pattern: Prefix Sum

Left sum equals right sum at pivot; return leftmost or -1.

Time: O(n), Space: O(1)
*/
public class FindPivotIndexJava {

    public int pivotIndex(int[] nums) {
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
