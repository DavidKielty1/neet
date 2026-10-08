/*
 * 338. Counting Bits
 * Difficulty: Easy
 * Pattern: Bit Manipulation / DP
 *
 * Problem:
 * Given an integer n, return an array ans of length n + 1 such that for each
 * i (0 <= i <= n), ans[i] is the number of 1's in the binary representation
 * of i.
 *
 * Example 1:
 * Input: n = 2
 * Output: [0,1,1]
 *
 * Example 2:
 * Input: n = 5
 * Output: [0,1,1,2,1,2]
 *
 * Constraints:
 * - 0 <= n <= 10^5
 */
public class CountingBits {
    public int[] countBits(int n) {
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

        // ans[i] = ans[i >> 1] + (i & 1)

        // int[] ans = new int[n + 1];
        // for (int i = 1; i <= n; i++) {
        //     ans[i] = ans[i >> 1] + (i & 1);
        // }
        // return ans;
        throw new UnsupportedOperationException("Implement countBits");
    }
    public static void main(String[] args) {
        CountingBits s = new CountingBits();
        assert java.util.Arrays.equals(s.countBits(2), new int[] {0, 1, 1});
        System.out.println("All test cases passed!");
    }

}
