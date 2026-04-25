/*
 * 844. Backspace String Compare
 * Difficulty: Easy
 * Pattern: Stack / Two Pointers
 *
 * Problem
 * -------
 * Given two strings `s` and `t`, return `true` if they are equal when both are typed
 * into empty text editors. The character `#` means a backspace.
 *
 * Note that backspacing an empty editor leaves it empty.
 *
 * Example 1
 * ---------
 * Input: s = "ab#c", t = "ad#c"
 * Output: true
 * Explanation: Both become "ac".
 *
 * Example 2
 * ---------
 * Input: s = "ab##", t = "c#d#"
 * Output: true
 * Explanation: Both become the empty string.
 *
 * Example 3
 * ---------
 * Input: s = "a#c", t = "b"
 * Output: false
 * Explanation: `s` becomes "c" while `t` becomes "b".
 *
 * Constraints
 * -----------
 * - 1 <= s.length, t.length <= 200
 * - `s` and `t` contain only lowercase letters and `#`.
 *
 * Follow-up
 * ---------
 * Can you solve it in O(n) time and O(1) extra space?
 *
 * How to think about it
 * ---------------------
 * The direct stack interpretation is to simulate typing: push letters and pop on `#`.
 * Build the final form of each string and compare them. The follow-up asks you to go
 * one step further and scan backward with skip counts so you avoid building the strings.
 *
 * Time: O(n + m), Space: O(n + m) with stacks, O(1) with reverse two pointers
 */

public class BackspaceStringCompareJava {
    public boolean backspaceCompare(String s, String t) {


        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        // Build stack or two-pointer from end.

        // class Solver {
        //     String build(String text) {
        //         StringBuilder sb = new StringBuilder();
        //         for (char ch : text.toCharArray()) {
        //             if (ch == "#".charAt(0)) {
        //                 if (sb.length() > 0) {
        //                     sb.deleteCharAt(sb.length() - 1);
        //                 }
        //             } else {
        //                 sb.append(ch);
        //             }
        //         }
        //         return sb.toString();
        //     }
        // }
        // Solver solver = new Solver();
        // return solver.build(s).equals(solver.build(t));
    }
    public static void main(String[] args) {
        BackspaceStringCompareJava x = new BackspaceStringCompareJava();
        assert x.backspaceCompare("ab#c", "ad#c");
        assert x.backspaceCompare("ab##", "c#d#");
        System.out.println("All test cases passed!");
    }

}
