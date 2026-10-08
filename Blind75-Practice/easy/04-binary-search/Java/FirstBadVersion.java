/*
 * 278. First Bad Version
 * Difficulty: Easy
 * Pattern: Binary Search
 *
 * Problem:
 * You are a product manager and currently leading a team to develop a new
 * product. The latest version fails the quality check. Since each version is
 * developed based on the previous version, all versions after a bad version
 * are also bad. Suppose you have n versions [1, 2, ..., n] and you want to
 * find the first bad one. You are given an API bool isBadVersion(version)
 * which returns whether version is bad. Implement a function that returns the
 * first bad version. Minimize the number of calls to the API.
 *
 * Example 1:
 * Input: n = 5, bad = 4
 * Output: 4
 *
 * Example 2:
 * Input: n = 1, bad = 1
 * Output: 1
 *
 * Constraints:
 * - 1 <= bad <= n <= 2^31 - 1
 */

    // [good, good, good, bad, bad, bad, bad]
    // [false false false true true true true]

class Solution extends VersionControl {
    private int return(int n) {
        
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
