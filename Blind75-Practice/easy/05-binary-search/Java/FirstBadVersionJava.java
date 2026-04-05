/*
 * 278. First Bad Version
 * Difficulty: Easy
 * Pattern: Binary Search
 *
 * What this problem is asking
 * ---------------------------
 * You have product versions numbered 1 through n in order. At some unknown version,
 * a bug was introduced. Every version from that point onward is "bad"; every version
 * before it is "good". So if version k is the first bad one:
 *
 *   - Versions 1 .. (k - 1) are good
 *   - Versions k .. n are bad
 *
 * You cannot inspect the code directly. You only have a black-box API:
 *
 *   boolean isBadVersion(version)
 *
 * It returns true if that version (or any later version) is bad, and false if that
 * version is still good. Because bad versions are contiguous at the end, the answers
 * have a "monotone" shape: false, false, ... true, true, ... That is why binary search
 * on the version number works.
 *
 * Your job: return the smallest version number that is bad (the first true), using
 * as few calls to isBadVersion as you can — aim for O(log n) time, O(1) extra space.
 *
 * Example 1
 * ---------
 * n = 5, and suppose the first bad version is 4.
 *
 *   isBadVersion(1) -> false
 *   isBadVersion(2) -> false
 *   isBadVersion(3) -> false
 *   isBadVersion(4) -> true   <- first bad
 *   isBadVersion(5) -> true
 *
 * Answer: 4
 *
 * Example 2
 * ---------
 * n = 1, first bad version is 1.
 *
 *   isBadVersion(1) -> true
 *
 * Answer: 1
 *
 * How to think about binary search here
 * -------------------------------------
 * Search space is [1, n]. You want the leftmost index where isBadVersion(i) is true.
 * Compare mid = (lo + hi) / 2 (use lo + (hi - lo) / 2 to avoid overflow). If
 * isBadVersion(mid) is true, the first bad could be mid or earlier, so move hi left.
 * If false, the first bad must be after mid, so move lo right. Stop when lo == hi.
 *
 * Time: O(log n) calls to isBadVersion, Space: O(1)
 */

public class FirstBadVersionJava extends VersionControl {
    /**
     * LeetCode provides this; you do not implement it on the platform. Locally, override
     * it in a subclass or test harness so it returns true for the first bad version and
     * every version after (e.g. {@code return version >= firstBad;}).
     */
    @Override
    protected boolean isBadVersion(int version) {
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

        throw new UnsupportedOperationException("Implement isBadVersion");
    }

    public int firstBadVersion(int n) {
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
        // while (lo < hi) { int mid = lo + (hi - lo) / 2; ... }

        throw new UnsupportedOperationException("Implement firstBadVersion");
    }

    public static void main(String[] args) {
        System.out.println(
                "On LeetCode, isBadVersion is provided. Locally, subclass FirstBadVersionJava "
                        + "and override isBadVersion, then call firstBadVersion(n).");
    }
}

abstract class VersionControl {
    protected abstract boolean isBadVersion(int version);
}
