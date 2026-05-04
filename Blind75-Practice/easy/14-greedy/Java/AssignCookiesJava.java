/*
455. Assign Cookies
Difficulty: Easy
Pattern: Greedy

Problem:
You have:
- `g`, where `g[i]` is the minimum cookie size needed to satisfy the ith child
- `s`, where `s[j]` is the size of the jth cookie

Each child can receive at most one cookie, and each cookie can be used at most once.
Return the maximum number of children that can be satisfied.

Example 1:
Input: g = [1, 2, 3], s = [1, 1]
Output: 1
Explanation:
Only one child can be satisfied because there is only one cookie large enough.

Example 2:
Input: g = [1, 2], s = [1, 2, 3]
Output: 2
Explanation:
Give cookie 1 to the child with greed 1, and cookie 2 or 3 to the child with greed 2.

Constraints:
- 1 <= g.length <= 3 * 10^4
- 0 <= s.length <= 3 * 10^4
- 1 <= g[i], s[j] <= 2^31 - 1

Why greedy works:
Sort both arrays and try to satisfy the least greedy child first using the smallest
cookie that works. This avoids wasting large cookies on children who could have been
satisfied with smaller ones.

Time: O(n log n + m log m)
Space: O(1) excluding sort
*/
import java.util.Arrays;

public class AssignCookiesJava {
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
        throw new UnsupportedOperationException("Implement findContentChildren");
    }
    public static void main(String[] args) {
        AssignCookiesJava x = new AssignCookiesJava();
        assert x.findContentChildren(new int[] {1, 2, 3}, new int[] {1, 1}) == 1;
        System.out.println("All test cases passed!");
    }

}
