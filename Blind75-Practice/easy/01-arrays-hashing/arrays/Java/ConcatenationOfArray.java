/*
1929. Concatenation of Array
Difficulty: Easy
Pattern: Arrays & Hashing

Return an array of length 2n consisting of nums followed by nums again.

Time: O(n), Space: O(n) for output
*/

import java.util.Arrays;

public class ConcatenationOfArray {

    public int[] getConcatenation(int[] nums) {
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

        // int n = nums.length;
        // int[] ans = new int[2 * n];
        // System.arraycopy(nums, 0, ans, 0, n);
        // System.arraycopy(nums, 0, ans, n, n);
        // return ans;

        throw new UnsupportedOperationException("Implement getConcatenation");
    }

    public static void main(String[] args) {
        ConcatenationOfArray s = new ConcatenationOfArray();
        assert Arrays.equals(s.getConcatenation(new int[] {1, 2, 1}), new int[] {1, 2, 1, 1, 2, 1});
        assert Arrays.equals(
                s.getConcatenation(new int[] {1, 3, 2, 1}), new int[] {1, 3, 2, 1, 1, 3, 2, 1});
        System.out.println("All test cases passed!");
    }
}
