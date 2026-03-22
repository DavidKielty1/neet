/**
 * Easy Version: Find All Anagrams in a String
 * Difficulty: Medium
 * Pattern: Sliding Window
 *
 * Given two strings s and p, return all start indices of p's anagrams in s.
 *
 * Time: O(n), Space: O(1) for 26 letters
 */
import java.util.List;

public class MinimumWindowSubstringEasy {

    public static List<Integer> findAnagrams(String s, String p) {
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

    

        // List<Integer> result = new ArrayList<>();
        // if (s == null || p == null || p.length() > s.length()) {
        //     return result;
        // }
        // int[] targetCount = new int[26];
        // int[] windowCount = new int[26];
        // for (int i = 0; i < p.length(); i++) {
        //     targetCount[p.charAt(i) - 'a']++;
        // }
        // int left = 0;
        // for (int right = 0; right < s.length(); right++) {
        //     windowCount[s.charAt(right) - 'a']++;
        //     if (right - left + 1 > p.length()) {
        //         windowCount[s.charAt(left) - 'a']--;
        //         left++;
        //     }
        //     if (right - left + 1 == p.length() && Arrays.equals(windowCount, targetCount)) {
        //         result.add(left);
        //     }
        // }
        // return result;

        throw new UnsupportedOperationException("Implement findAnagrams");
    }

    public static void main(String[] args) {
        String s1 = "cbaebabacd";
        String p1 = "abc";
        System.out.println("Find Anagrams: " + findAnagrams(s1, p1));

        String s2 = "abab";
        String p2 = "ab";
        System.out.println("Find Anagrams: " + findAnagrams(s2, p2));
    }
}
