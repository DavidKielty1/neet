/*
Reverse a Java String (e.g. "hannaH" -> "Hannah")

Unlike LeetCode 344 (char[] in-place), java.lang.String is immutable: you
cannot swap characters inside the String itself. Typical approaches:

1. Copy to char[], two-pointer swap, then new String(chars)  (shown below)
2. new StringBuilder(s).reverse().toString()  (library, same time O(n))

Example 1:
Input: s = "hannaH"
Output: "Hannah"
Hint: Mirror indices in a mutable char[] copy, then new String(...).

Example 2:
Input: s = "hello"
Output: "olleh"
Hint: Same two-pointer idea; odd length has a middle char that stays put.

Time: O(n), Space: O(n) for the char[] (and the new String)
*/
public class ReverseActualStringJava {

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

    

        // if (s == null || s.length() <= 1) {
        //     return s;
        // }
        // char[] chars = s.toCharArray();
        // int left = 0;
        // int right = chars.length - 1;
        // while (left < right) {
        //     char tmp = chars[left];
        //     chars[left] = chars[right];
        //     chars[right] = tmp;
        //     left++;
        //     right--;
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
