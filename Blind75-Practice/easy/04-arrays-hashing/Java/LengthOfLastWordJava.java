/*
58. Length of Last Word
Difficulty: Easy
Pattern: String

Return the length of the last word in s (words are maximal non-space substrings).

Example 1:
Input: s = "Hello World"
Output: 5
Hint: Last token is "World"; trim trailing spaces before walking backward.

Example 2:
Input: s = "   fly me   to   the moon  "
Output: 4
Hint: Multiple spaces; the last word is "moon", not a gap.

Time: O(n), Space: O(1)
*/
public class LengthOfLastWordJava {

    public int lengthOfLastWord(String s) {
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
