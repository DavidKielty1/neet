/*
374. Guess Number Higher or Lower
Difficulty: Easy
Pattern: Binary Search

Binary search on [1, n] using guess API: negative if secret < guess, positive if secret > guess.

Time: O(log n), Space: O(1)
*/

public class GuessNumberHigherOrLowerJava {

    private final int pick;

    public GuessNumberHigherOrLowerJava(int pick) {
        this.pick = pick;
    }

    /** LeetCode-style API: -1 pick lower, 1 pick higher, 0 correct */
    private int guess(int num) {
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

        // return Integer.compare(pick, num);

        throw new UnsupportedOperationException("Implement guess");
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

        // int lo = 1, hi = n;
        // while (lo <= hi) {
        // int mid = lo + (hi - lo) / 2;
        // int g = guess(mid);
        // if (g == 0) {
        // return mid;
        // }
        // if (g < 0) {
        // hi = mid - 1;
        // } else {
        // lo = mid + 1;
        // }
        // }
        // return lo;

        throw new UnsupportedOperationException("Implement guessNumber");
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
