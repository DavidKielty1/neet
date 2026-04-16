/*
844. Backspace String Compare
Difficulty: Easy
Pattern: Stack / Two Pointers

# means backspace on the previous char (empty string stays empty).

Time: O(n), Space: O(1) possible with reverse iteration
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
        throw new UnsupportedOperationException("Implement backspaceCompare");
    }
    public static void main(String[] args) {
        BackspaceStringCompareJava x = new BackspaceStringCompareJava();
        assert x.backspaceCompare("ab#c", "ad#c");
        assert x.backspaceCompare("ab##", "c#d#");
        System.out.println("All test cases passed!");
    }

}
