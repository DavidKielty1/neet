/*
 * 69. Sqrt(x)
 * Difficulty: Easy
 * Pattern: Math / Binary Search
 *
 * Problem:
 * Given a non-negative integer x, return the square root of x rounded down
 * to the nearest integer. The returned integer should be non-negative as
 * well. You must not use any built-in exponent function or operator.
 *
 * Example 1:
 * Input: x = 4
 * Output: 2
 *
 * Example 2:
 * Input: x = 8
 * Output: 2
 *
 * Constraints:
 * - 0 <= x <= 2^31 - 1
 */
public class SqrtX {
    public int mySqrt(int x) {
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

        // Binary search on [0, x]

        // int lo = 0;
        // int hi = x;
        // int answer = 0;
        // while (lo <= hi) {
        //     int mid = lo + (hi - lo) / 2;
        //     long square = (long) mid * mid;
        //     if (square == x) {
        //         return mid;
        //     }
        //     if (square < x) {
        //         answer = mid;
        //         lo = mid + 1;
        //     } else {
        //         hi = mid - 1;
        //     }
        // }
        // return answer;
        throw new UnsupportedOperationException("Implement mySqrt");
    }
    public static void main(String[] args) {
        SqrtX s = new SqrtX();
        assert s.mySqrt(8) == 2;
        System.out.println("All test cases passed!");
    }

}
