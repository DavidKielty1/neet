import java.util.Arrays;

/*
344. Reverse String
Difficulty: Easy
Pattern: Two Pointers

Write a function that reverses a string. The input string is given as an
array of characters s.

Contract (LeetCode 344):
- Do not return anything; modify s in-place by reversing the characters.

Example:
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Time: O(n), Space: O(1)
*/
public class ReverseStringJava {

    // ["h", "a", "n", "n", "a", "H"]
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
        }
    }

    // Test cases
    public static void main(String[] args) {
        // Test 1
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s1);
        System.out.println("Reverse String: " + Arrays.toString(s1));  // ["o","l","l","e","h"]

        // Test 2
        char[] s2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        reverseString(s2);
        System.out.println("Reverse String: " + Arrays.toString(s2));  // ["h","a","n","n","a","H"]

        // Test 3
        char[] s3 = {'A'};
        reverseString(s3);
        System.out.println("Reverse String: " + Arrays.toString(s3));  // ["A"]
    }
}

