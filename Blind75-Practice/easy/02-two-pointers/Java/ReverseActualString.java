/*
Practice Variant: Reverse a Java String
Related LeetCode: 344. Reverse String
Difficulty: Easy
Pattern: Two Pointers

Problem:
Given a Java `String` `s`, return a new string with the characters reversed.

Unlike LeetCode 344, which uses a mutable `char[]`, Java strings are immutable.
That means this version returns a new string instead of modifying the original
string in-place.

Example 1:
Input: s = "hannaH"
Output: "Hannah"
Explanation: Reverse the characters from both ends toward the center.

Example 2:
Input: s = "hello"
Output: "olleh"
Explanation: Copy to a mutable character array, swap inward, then build a new string.

Example 3:
Input: s = "a"
Output: "a"
Explanation: A single-character string is already reversed.

Time Complexity: O(n)
Space Complexity: O(n)
*/
public class ReverseActualString {

    public static String reverse(String s) {
        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        // if (s == null || s.length() <= 1) {
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

        throw new UnsupportedOperationException("Implement reverse");
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
