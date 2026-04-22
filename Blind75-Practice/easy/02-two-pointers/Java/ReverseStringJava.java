import java.util.Arrays;

/*
LeetCode 344: Reverse String
Difficulty: Easy
Pattern: Two Pointers

Problem:
Write a function that reverses a string. The input string is given as an array
of characters `s`.

You must do this by modifying the input array in-place with O(1) extra memory.

Example 1:
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Explanation: Swap the leftmost and rightmost characters, then move inward.

Example 2:
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
Explanation: Keep swapping pairs until the pointers meet or cross.

Time Complexity: O(n)
Space Complexity: O(1)
*/
public class ReverseStringJava {

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while ( right > left ) {
            char temp = s[right];
            s[right] = s[left];
            s[left] = temp;
            right--;
            left++;
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

        // int left = 0;
        // int right = s.length - 1;
        // while (left < right) {
            // char tmp = s[left];
            // s[left] = s[right];
            // s[right] = tmp;
            // left++;
            // right--;
        // }

        throw new UnsupportedOperationException("Implement reverseString");
    }

    public static void main(String[] args) {
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s1);
        System.out.println("Reverse String: " + Arrays.toString(s1));

        char[] s2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        reverseString(s2);
        System.out.println("Reverse String: " + Arrays.toString(s2));

        char[] s3 = {'A'};
        reverseString(s3);
        System.out.println("Reverse String: " + Arrays.toString(s3));
    }
}
