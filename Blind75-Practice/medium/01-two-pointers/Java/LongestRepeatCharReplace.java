/*
424. Longest Repeating Character Replacement

You are given a string s and an integer k. You can choose any character of the string and
change it to any other uppercase English character. You can perform this operation at most k times.

Return the length of the longest substring containing the same letter you can get after performing
the above operations.

Example 1:
Input: s = "ABAB", k = 2
Output: 4
Hint: Window may need at most k changes; track counts and max frequency in window.

Example 2:
Input: s = "AABABBA", k = 1
Output: 4
Hint: If windowLength - maxFreqInWindow > k, shrink from left — sliding window.

Time: O(n), Space: O(1) — 26 uppercase letters
*/
public class LongestRepeatCharReplace {

    public static int characterReplacement(String s, int k) {
        int[] counts = new int[26];
        int maxFreq = 2;
        int maxLength = 0;
        int left = 0;

        // array[26]
        // replacements = 0
        // A: 2
        // B: 1
        // if replacements = 0 && hashmap.length > 1
            // increment left, decrement counters until hashmap.length == 1
            // reset replacements after hashmap.length == 1 (?)

        // [A, A, B, A, B, B, A]
        // [[3], [1]]
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            counts[c - 'A']++;
            int windowSize = right - left + 1;

            maxFreq = Math.max(maxFreq, counts[c - 'A']);
            while (windowSize - maxFreq > k) {
                char leftChar = s.charAt(left);
                counts[leftChar - 'A']--;
                left++;
                windowSize = right - left + 1;
            }

            maxLength = Math.max(maxLength, windowSize);
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

    

        // int[] counts = new int[26];
        // int maxFreq = 0;
        // int maxLength = 0;
        // int left = 0;
        // for (int right = 0; right < s.length(); right++) {
        //     char c = s.charAt(right);
        //     counts[c - 'A']++;
        //     maxFreq = Math.max(maxFreq, counts[c - 'A']);
        //     int windowSize = right - left + 1;
        //     while (windowSize - maxFreq > k) {
        //         char leftChar = s.charAt(left);
        //         counts[leftChar - 'A']--;
        //         left++;
        //         windowSize = right - left + 1;
        //     }
        //     maxLength = Math.max(maxLength, windowSize);
        // }
        // return maxLength;

        throw new UnsupportedOperationException("Implement characterReplacement");
    }

    public static void main(String[] args) {
        assert characterReplacement("ABAB", 2) == 4;
        System.out.println("✓ Test 1 passed: ABAB with k=2");

        assert characterReplacement("AABABBA", 1) == 4;
        System.out.println("✓ Test 2 passed: AABABBA with k=1");

        assert characterReplacement("AAAA", 0) == 4;
        System.out.println("✓ Test 3 passed: All same characters");

        assert characterReplacement("A", 0) == 1;
        System.out.println("✓ Test 4 passed: Single character");

        System.out.println("\n✅ Core tests passed!");
    }
}
