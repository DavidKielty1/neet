/*
 * Practice Variant: Reverse a Java String
 * Difficulty: Easy
 * Pattern: Two Pointers
 *
 * Problem:
 * Given a Java String s, return a new string with the characters reversed.
 * Unlike LeetCode 344, which uses a mutable char[], Java strings are
 * immutable, so this version returns a new string instead of modifying the
 * original in-place.
 *
 * Example 1:
 * Input: s = "hannaH"
 * Output: "Hannah"
 *
 * Example 2:
 * Input: s = "hello"
 * Output: "olleh"
 *
 * Example 3:
 * Input: s = "a"
 * Output: "a"
 *
 * Constraints:
 * - 0 <= s.length <= 10^5
 * - s consists of printable ASCII characters
 */
public class ReverseActualString {
    public static String reverse(String s) {
        
    }
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

        // if (s.length() <= 1) {
            // return s;
        // }
        // char[] chars = s.toCharArray();
        // int left = 0;
        // int right = chars.length - 1;
        // while (left < right) {
            // char tmp = chars[left];
            // chars[left] = chars[right];
            // chars[right] = tmp;
            // left++;
            // right--;
        // }
        // return new String(chars);
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println(reverse(args[0]));
            return;
        }

        String s1 = "hannaH";
        System.out.println("reverse(\"" + s1 + "\") = \"" + reverse(s1) + "\"");

        String s2 = "hello";
        System.out.println("reverse(\"" + s2 + "\") = \"" + reverse(s2) + "\"");
    }
}
