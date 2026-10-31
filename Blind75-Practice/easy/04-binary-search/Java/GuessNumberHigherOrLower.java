/*
 * 374. Guess Number Higher or Lower
 * Difficulty: Easy
 * Pattern: Binary Search
 *
 * Problem:
 * We are playing the Guess Game. The game is as follows: I pick a number from
 * 1 to n. You have to guess which number I picked. Every time you guess wrong,
 * I tell you whether the number is higher or lower. You call a pre-defined API
 * int guess(int num) which returns:
 * - -1: your guess is higher than the picked number (num > pick)
 * - 1: your guess is lower than the picked number (num < pick)
 * - 0: your guess is equal to the picked number (num == pick)
 * Return the picked number.
 *
 * Example 1:
 * Input: n = 10, pick = 6
 * Output: 6
 *
 * Example 2:
 * Input: n = 1, pick = 1
 * Output: 1
 *
 * Example 3:
 * Input: n = 2, pick = 1
 * Output: 1
 *
 * Constraints:
 * - 1 <= n <= 2^31 - 1
 * - 1 <= pick <= n
 */

class Solution extends GuessGame {
    public int guessNumber(int n) {
        
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

        // int lo = 1;
        // int hi = n;
        // while (lo <= hi) {
        //     int mid = lo + (hi - lo) / 2;
        //     int result = guess(mid);
        //     if (result == 0) {
        //         return mid;
        //     }
        //     if (result < 0) {
        //         hi = mid - 1;
        //     } else {
        //         lo = mid + 1;
        //     }
        // }
        // return -1;
}

// LeetCode provides this class behind the scenes. Local stub only so the file compiles
// and Solution can extend it. You do not implement it.
/**
 * Forward declaration of guess API.
 *
 * @param num your guess
 * @return -1 if num is higher than the picked number,
 *          1 if num is lower than the picked number,
 *          otherwise return 0
 * int guess(int num);
 */
class GuessGame {
    int guess(int num) {
    }
}
