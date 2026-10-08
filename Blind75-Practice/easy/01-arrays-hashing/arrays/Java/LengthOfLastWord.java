/*
 * 58. Length of Last Word
 * Difficulty: Easy
 * Pattern: String
 *
 * Problem:
 * Given a string s consisting of words and spaces, return the length of the
 * last word in the string. A word is a maximal substring consisting of
 * non-space characters only. Leading and trailing spaces may appear; ignore
 * them when identifying the last word.
 *
 * Example 1:
 * Input: s = "Hello World"
 * Output: 5
 *
 * Example 2:
 * Input: s = "   fly me   to   the moon  "
 * Output: 4
 *
 * Example 3:
 * Input: s = "luffy is still joyboy"
 * Output: 6
 *
 * Constraints:
 * - 1 <= s.length <= 10^4
 * - s consists of only English letters and spaces ' '
 * - There will be at least one word in s
 */
public class LengthOfLastWord {
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
        // int end = i;

        // while (i >= 0 && s.charAt(i) != ' '){
        //     i--;
        // }

        // return end - i;

    }

    public static void main(String[] args) {
        LengthOfLastWord s = new LengthOfLastWord();
        assert s.lengthOfLastWord("Hello World") == 5;
        assert s.lengthOfLastWord("   fly me   to   the moon  ") == 4;
        assert s.lengthOfLastWord("luffy is still joyboy") == 6;
        assert s.lengthOfLastWord("a") == 1;
        System.out.println("All test cases passed!");
    }
}
