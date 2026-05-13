/*
 * 278. First Bad Version
 * Difficulty: Easy
 * Pattern: Binary Search
 *
 * Problem
 * -------
 * You have `n` versions `[1, 2, ..., n]`. A bad version breaks the build; every version
 * after the first bad one is also bad. You only have the API:
 *
 *   boolean isBadVersion(version)
 *
 * Return the **first** bad version (smallest version number that is bad).
 *
 * Example
 * -------
 * n = 5, first bad = 4 -> return 4
 *
 * Constraints
 * -----------
 * - `1 <= bad <= n <= 2^31 - 1`
 *
 * How to think about it
 * ---------------------
 * Answers are monotone: good, good, ... bad, bad, ... so you binary-search for the
 * **leftmost** bad (first `true`). Use `lo < hi`, shrink toward the boundary.
 *
 * Time: O(log n) calls to isBadVersion, Space: O(1)
 *
 * Local note
 * ----------
 * Below, `VersionControl` uses a fixed boolean table so `isBadVersion` behaves like a
 * hidden monotone array (e.g. [f,f,f,t,t] for versions 1..5). On LeetCode, the platform
 * provides this API; you normally submit only `Solution` (and may delete the local
 * `VersionControl` in your editor there).
 */

class Solution extends VersionControl {
    public int firstBadVersion(int n) {


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

        // while (lo < hi) {
        //     int mid = lo + (hi - lo) / 2;
        //     if (isBadVersion(mid)) {
        //         hi = mid;
        //     } else {
        //         lo = mid + 1;
        //     }
        // }
        // return lo;

    /** Local check against the table in `VersionControl` (run with `java -ea ...`). */
    public static void main(String[] args) {
        Solution s = new Solution();
        assert s.firstBadVersion(5) == 4;
        System.out.println("All test cases passed!");
    }
}

/**
 * Local teaching stand-in: LeetCode injects the real implementation.
 *
 * {@code IS_BAD[v]} is {@code isBadVersion(v)} for version {@code v}. Slot 0 is unused;
 * versions are 1..n per the problem. Example row for {@code n = 5}, first bad {@code 4}:
 * {@code [_, f, f, f, t, t]}.
 *
 * Change the literals to explore other monotone shapes; keep length {@code n + 1} and a
 * single transition from false to true for a valid instance.
 */
class VersionControl {
    private static final boolean[] IS_BAD = {
        false, // index 0 unused
        false,
        false,
        false,
        true,
        true,
    };

    protected boolean isBadVersion(int version) {
        return IS_BAD[version];
    }
}
