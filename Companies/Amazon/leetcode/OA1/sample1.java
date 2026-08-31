package Companies.Amazon;

import java.util.Arrays;
import java.util.List;

/*
 * Amazon OA (HackerRank) — Minimum Adjacent Swaps to Separate 0s and 1s
 * Pattern: Counting / Inversions (not two-pointers, not DFS)
 *
 * Problem:
 * You are given a list of only 0s and 1s. In one move you may swap two
 * *adjacent* elements. Return the minimum number of moves so that all 0s
 * sit on one side and all 1s on the other. Either side is allowed:
 *   000...111   or   111...000
 *
 * Signature (as on the OA):
 *   int minMoves(List<Integer> nums)
 *
 * Example 1:
 *   Input:  [0, 1, 0, 1]
 *   Output: 1
 *   [0, 1, 0, 1] -> [0, 0, 1, 1]  (one adjacent swap)
 *   Going the other way to [1, 1, 0, 0] takes 3 swaps, so min is 1.
 *
 * Example 2:
 *   Input:  [1, 1, 1, 1, 0, 1, 0, 1]
 *   Output: 3
 *   Cheapest is gathering 1s on the left (0s on the right).
 *
 * Example 3:
 *   Input:  [0, 0, 1, 1]
 *   Output: 0
 *
 * Constraints (typical OA):
 * - 1 <= n <= 10^5
 * - nums[i] is 0 or 1
 *
 * How to think about it:
 * Adjacent swaps are bubble-sort swaps. 0s never pass other 0s (same for
 * 1s), so the min swaps to send every 0 to the left is exactly the number
 * of (1, 0) inversion pairs: each 1 that sits left of a 0 must swap past
 * it once.
 *
 *   costZerosLeft  = inversions where 1 appears before 0
 *   costOnesLeft   = inversions where 0 appears before 1
 *   answer         = min of those two
 *
 * Walk the array once, keep a running count of 0s and 1s seen so far.
 * Two pointers / DFS / memoization are unnecessary: there are only two
 * target shapes, and each has a closed-form cost.
 *
 * Time:  O(n)
 * Space: O(1)
 */

public class sample1 {

    public int minMoves(List<Integer> nums) {
        int costZerosLeft = 0;
        int costOnesLeft = 0;
        int zerosSeen = 0;
        int onesSeen = 0;

        // [1, 1, 0, 1, 0, 0, 0]
        // costZerosLeft = 11
        // costOnesLeft  = 1
        // zerosSeen     = 4
        // onesSeen      = 3

        for (int x : nums) {
            if (x == 0) {
                // This 0 must pass every 1 already on its left
                // if we want 000...111.
                costZerosLeft += onesSeen;
                zerosSeen++;
            } else {
                // This 1 must pass every 0 already on its left
                // if we want 111...000.
                costOnesLeft += zerosSeen;
                onesSeen++;
            }
        }

        return Math.min(costZerosLeft, costOnesLeft);
    }

    public static void main(String[] args) {
        sample1 solution = new sample1();
        assert solution.minMoves(Arrays.asList(0, 1, 0, 1)) == 1;
        assert solution.minMoves(Arrays.asList(1, 1, 1, 1, 0, 1, 0, 1)) == 3;
        assert solution.minMoves(Arrays.asList(0, 0, 1, 1)) == 0;
        assert solution.minMoves(Arrays.asList(1, 1, 0, 0)) == 0;
        assert solution.minMoves(Arrays.asList(1, 0, 1, 0)) == 1;
        System.out.println("All test cases passed!");
    }
}
