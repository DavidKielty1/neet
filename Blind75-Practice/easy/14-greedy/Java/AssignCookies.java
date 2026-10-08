/*
 * 455. Assign Cookies
 * Difficulty: Easy
 * Pattern: Greedy
 *
 * Problem:
 * Assume you want to give your children some cookies. You should give each
 * child at most one cookie. Each child i has a greed factor g[i], which is
 * the minimum size of a cookie that the child will be content with, and each
 * cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to
 * the child i, and the child i will be content. Return the maximum number of
 * content children.
 *
 * Example 1:
 * Input: g = [1,2,3], s = [1,1]
 * Output: 1
 *
 * Example 2:
 * Input: g = [1,2], s = [1,2,3]
 * Output: 2
 *
 * Constraints:
 * - 1 <= g.length <= 3 * 10^4
 * - 0 <= s.length <= 3 * 10^4
 * - 1 <= g[i], s[j] <= 2^31 - 1
 */

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        // Sort both; two pointers.

        // java.util.Arrays.sort(g);
        // java.util.Arrays.sort(s);
        // int child = 0;
        // int cookie = 0;
        // while (child < g.length && cookie < s.length) {
        //     if (s[cookie] >= g[child]) {
        //         child++;
        //     }
        //     cookie++;
        // }
        // return child;
    }
    public static void main(String[] args) {
        AssignCookies x = new AssignCookies();
        assert x.findContentChildren(new int[] {1, 2, 3}, new int[] {1, 1}) == 1;
        System.out.println("All test cases passed!");
    }

}
