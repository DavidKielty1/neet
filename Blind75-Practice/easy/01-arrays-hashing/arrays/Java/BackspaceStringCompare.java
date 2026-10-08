/*
 * 844. Backspace String Compare
 * Difficulty: Easy
 * Pattern: Stack / Two Pointers
 *
 * Problem:
 * Given two strings s and t, return true if they are equal when both are typed
 * into empty text editors. '#' means a backspace character. Backspacing an
 * empty text leaves it empty.
 *
 * Example 1:
 * Input: s = "ab#c", t = "ad#c"
 * Output: true
 *
 * Example 2:
 * Input: s = "ab##", t = "c#d#"
 * Output: true
 *
 * Example 3:
 * Input: s = "a#c", t = "b"
 * Output: false
 *
 * Constraints:
 * - 1 <= s.length, t.length <= 200
 * - s and t only contain lowercase letters and '#' characters
 */

public class BackspaceStringCompare {
    private String build(String str) {
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
        
        //     return build(a).equals(build(b));
        // }

        // private String build (String s) {
        //     StringBuilder string = new StringBuilder();
        //     for (char ch : s.toCharArray()) {
        //         if (ch == '#') {
        //             if (string.length() > 0) {
        //                 string.deleteCharAt(string.length() - 1);
        //             }
        //         } else {
        //             string.append(ch);        
        //         }
        //     }
        //     return string.toString();
        // }

    }
    public static void main(String[] args) {
        BackspaceStringCompare x = new BackspaceStringCompare();
        assert x.backspaceCompare("ab#c", "ad#c");
        assert x.backspaceCompare("ab##", "c#d#");
        System.out.println("All test cases passed!");
    }

}
