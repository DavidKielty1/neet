/*
 * 1137. N-th Tribonacci Number
 * Difficulty: Easy
 * Pattern: Dynamic Programming
 *
 * Problem:
 * The Tribonacci sequence Tn is defined as follows: T0 = 0, T1 = 1, T2 = 1,
 * and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0. Given n, return the value of Tn.
 *
 * Example 1:
 * Input: n = 4
 * Output: 4
 * Explanation:
 * T_3 = 0 + 1 + 1 = 2
 * T_4 = 1 + 1 + 2 = 4
 *
 * Example 2:
 * Input: n = 25
 * Output: 1389537
 *
 * Constraints:
 * - 0 <= n <= 37
 * - The answer is guaranteed to fit within a 32-bit integer
 */
public class TribonacciNumber {
    // like climbing stairs -- attempt it.
    public int tribonacci(int n) {

    }
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

        // Rolling three values.

        // if (n == 0) {
        //     return 0;
        // }
        // if (n <= 2) {
        //     return 1;
        // }
        // int a = 0;
        // int b = 1;
        // int c = 1;
        // for (int i = 3; i <= n; i++) {
        //     int next = a + b + c;
        //     a = b;
        //     b = c;
        //     c = next;
        // }
        // return c;
    public static void main(String[] args) {
        TribonacciNumber s = new TribonacciNumber();
        assert s.tribonacci(4) == 4;
        System.out.println("All test cases passed!");
    }

}
