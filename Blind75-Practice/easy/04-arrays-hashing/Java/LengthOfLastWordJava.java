/*
58. Length of Last Word
Difficulty: Easy
Pattern: String

Problem:
Given a string s consisting of words and spaces, return the length of the last word in the
string. A word is a maximal substring of non-space characters. Leading and trailing spaces
may appear; only the final word’s length after the last non-space content matters.

Notes:
- Walk from the end: skip trailing spaces, then count characters until the next space or start.
- If s is empty or only spaces, define behavior per your platform (often 0).

Example 1:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World", length 5.

Example 2:
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: Trailing spaces are ignored; the last word is "moon", length 4.

Example 3:
Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy", length 6.

Time: O(n), Space: O(1)
*/
public class LengthOfLastWordJava {

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

    

        // int i = s.length() - 1;
        // while (i >= 0 && s.charAt(i) == ' ') {
        //     i--;
        // }
        // int len = 0;
        // while (i >= 0 && s.charAt(i) != ' ') {
        //     len++;
        //     i--;
        // }
        // return len;

        throw new UnsupportedOperationException("Implement lengthOfLastWord");
    }

    public static void main(String[] args) {
        LengthOfLastWordJava s = new LengthOfLastWordJava();
        assert s.lengthOfLastWord("Hello World") == 5;
        assert s.lengthOfLastWord("   fly me   to   the moon  ") == 4;
        assert s.lengthOfLastWord("luffy is still joyboy") == 6;
        assert s.lengthOfLastWord("a") == 1;
        System.out.println("All test cases passed!");
    }
}
