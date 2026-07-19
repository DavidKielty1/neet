/*
 * Ported from: 05-binary-search/analogue-questions/Python/binary-search-similar1.py
 * --- Original description ---
Similar Problem 1: First Bad Version
Difficulty: Easy
Pattern: Binary Search

Problem:
You are a product manager and currently leading a team to develop a new product.
Unfortunately, the latest version of your product fails the quality check.
Since each version is developed based on the previous version, all the versions
after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one,
which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which returns whether version is bad.

Example 1:
Input: n = 5, bad = 4
Output: 4
Explanation: call isBadVersion(3) -> false; ca ll isBadVersion(5) -> true;
call isBadVersion(4) -> true; Then 4 is the first bad version.

Example 2:
Input: n = 1, bad = 1
Output: 1

Constraints:
- 1 <= bad <= n <= 2^31 - 1
 */

public class BinarySearchSimilar1 {
    static int BAD_VERSION = 0;




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

    // left, right = (1, n)
    // while left < right:
    // mid = left + (right - left) // 2
    // if isBadVersion(mid):
    // right = mid
    // else:
    // left = mid + 1
    // return left

        throw new UnsupportedOperationException("Implement firstBadVersion");
    }

    

    public static void main(String[] args) {
        BinarySearchSimilar1 sol = new BinarySearchSimilar1();
        BinarySearchSimilar1.BAD_VERSION = 4;
        assert (sol.firstBadVersion(5) == 4);
        System.out.println("✓ Test case 1 passed");
        BinarySearchSimilar1.BAD_VERSION = 1;
        assert (sol.firstBadVersion(1) == 1);
        System.out.println("✓ Test case 2 passed");
        BinarySearchSimilar1.BAD_VERSION = 1;
        assert (sol.firstBadVersion(10) == 1);
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
