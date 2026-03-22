/*
Reverse a Java String (e.g. "hannaH" -> "Hannah")

Unlike LeetCode 344 (char[] in-place), java.lang.String is immutable: you
cannot swap characters inside the String itself. Typical approaches:

1. Copy to char[], two-pointer swap, then new String(chars)  (shown below)
2. new StringBuilder(s).reverse().toString()  (library, same time O(n))

Time: O(n), Space: O(n) for the char[] (and the new String)
*/
public class ReverseActualStringJava {

    /** Returns a new String with characters in reverse order. */
    public static String reverse(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;
            left++;
            right--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        // Optional: pass a word on the command line, e.g. java ReverseActualStringJava hannaH
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
