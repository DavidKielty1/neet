/*
338. Counting Bits
Difficulty: Easy
Pattern: Bit Manipulation / DP

For each i in [0, n], count 1-bits in binary i.

Time: O(n), Space: O(n)
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
