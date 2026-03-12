
/**
 * Easy Version: Find All Anagrams in a String
 * Difficulty: Medium
 * Pattern: Sliding Window
 *
 * Given two strings s and p, return an array of all the start indices of p's anagrams in s.
 *
 * Example 1:
 * Input: s = "cbaebabacd", p = "abc"
 * Output: [0,6]
 * Explanation: The substring with start index = 0 is "cba", which is an anagram of "abc".
 * The substring with start index = 6 is "bac", which is an anagram of "abc".
 *
 * Example 2:
 * Input: s = "abab", p = "ab"
 * Output: [0,1,2]
 * Explanation: The substring with start index = 0 is "ab", which is an anagram of "ab".
 * The substring with start index = 1 is "ba", which is an anagram of "ab".
 * The substring with start index = 2 is "ab", which is an anagram of "ab".
 *
 * Time: O(n), Space: O(1) - at most 26 characters
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumWindowSubstringEasy {

    /**
     * Sliding window with frequency counts for characters.
     * Uses fixed-size arrays for lowercase letters to keep O(1) space.
     */

    public static int[] findStartingIdxOfAllAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || p == null || p.length() > s.length()) {
            return new int[0];
        }

        int[] targetCount = new int[26];
        int[] windowCount = new int[26];

        for (int i = 0; i < p.length(); i++) {
            targetCount[p.charAt(i) - 'a']++;
        }

        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            windowCount[s.charAt(right) - 'a']++;

            if (right - left + 1 > p.length()) {
                windowCount[s.charAt(left) - 'a']--;
            }

            if (right - left + 1 == p.length() && Arrays.equals(windowCount, targetCount)) {
                result.add(left);
            }
        }

        int[] resArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resArray[i] = result.get(i);
        }

        return resArray;

    }

    /**
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     */
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || p == null || p.length() > s.length()) {
            return result;
        }

        int[] targetCount = new int[26];
        int[] windowCount = new int[26];

        for (int i = 0; i < p.length(); i++) {
            targetCount[p.charAt(i) - 'a']++;
        }

        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            windowCount[s.charAt(right) - 'a']++;

            if (right - left + 1 > p.length()) {
                windowCount[s.charAt(left) - 'a']--;
                left++;
            }

            if (right - left + 1 == p.length() && Arrays.equals(windowCount, targetCount)) {
                result.add(left);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s1 = "cbaebabacd";
        String p1 = "abc";
        System.out.println("Find Anagrams: " + findAnagrams(s1, p1)); // [0, 6]

        String s2 = "abab";
        String p2 = "ab";
        System.out.println("Find Anagrams: " + findAnagrams(s2, p2)); // [0, 1, 2]
    }
}
