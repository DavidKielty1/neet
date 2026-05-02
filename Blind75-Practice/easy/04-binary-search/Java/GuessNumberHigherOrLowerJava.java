/*
 * 374. Guess Number Higher or Lower
 * Difficulty: Easy
 * Pattern: Binary Search
 *
 * Problem
 * -------
 * You are playing a guessing game.
 *
 * The system picks a secret number between `1` and `n`, and you need to guess it.
 * You are given an API:
 *
 * - `guess(num) == 0` if `num` is the secret number
 * - `guess(num) == -1` if the secret number is lower than `num`
 * - `guess(num) == 1` if the secret number is higher than `num`
 *
 * Return the secret number.
 *
 * Example 1
 * ---------
 * Input: n = 10, pick = 6
 * Output: 6
 *
 * Example 2
 * ---------
 * Input: n = 1, pick = 1
 * Output: 1
 *
 * Constraints
 * -----------
 * - `1 <= n <= 2^31 - 1`
 * - `1 <= pick <= n`
 *
 * How to think about it
 * ---------------------
 * This is binary search over a number range rather than over an array.
 * Use the API result to discard half of the remaining search space each time.
 *
 * Time: O(log n), Space: O(1)
 */

public class GuessNumberHigherOrLowerJava {

    private final int pick;

    public GuessNumberHigherOrLowerJava(int pick) {
        this.pick = pick;
    }

    /** LeetCode-style API: -1 pick lower, 1 pick higher, 0 correct */
    private int guess(int num) {
    }

    public int guessNumber(int n) {
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

        // private int guess(int num) {
        //     return Integer.compare(pick, num);
        // }
        //
        // public int guessNumber(int n) {
        //     int lo = 1;
        //     int hi = n;
        //     while (lo <= hi) {
        //         int mid = lo + (hi - lo) / 2;
        //         int result = guess(mid);
        //         if (result == 0) {
        //             return mid;
        //         }
        //         if (result < 0) {
        //             hi = mid - 1;
        //         } else {
        //             lo = mid + 1;
        //         }
        //     }
        //     return -1;
        // }
    }

    public static void main(String[] args) {
        for (int n : new int[] {10, 100}) {
            for (int pick : new int[] {1, n, Math.max(1, n / 2)}) {
                GuessNumberHigherOrLowerJava g = new GuessNumberHigherOrLowerJava(pick);
                assert g.guessNumber(n) == pick;
            }
        }
        System.out.println("All test cases passed!");
    }
}
