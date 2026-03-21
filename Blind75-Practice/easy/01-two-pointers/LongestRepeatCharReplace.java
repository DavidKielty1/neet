/*
424. Longest Repeating Character Replacement

You are given a string s and an integer k. You can choose any character of the string and
change it to any other uppercase English character. You can perform this operation at most k times.

Return the length of the longest substring containing the same letter you can get after performing
the above operations.

Example 1:
Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.

Example 2:
Input: s = "AABABBA", k = 1
Output: 4
Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
The substring "BBBB" has the longest repeating letters, which is 4.
*/
public class LongestRepeatCharReplace {

    /*
     * Window
     * window_size = right - left + 1
     * if window_size - max_freq > k:
     * shrink
     */

    // instantiate the method
    {
        // instantiate variables

        // [AAABB]; k = 1

        // right = 0
        // count (A: 0, B: 0)
        // max_freq = 0
        // left = 0
        // window_length (right - left + 1) = 0
        // max_length = 0

        // loop through
        // // getRightChar

        // // increment counts[right]

        // // Math.max (max_freq, counts[right])

        // // window_length = right - left + 1

        // // while window_length - max_freq > k:
        {
            // get lChar at s[left]
            // decrement counts[lChar]
            // increment left
            // window_length = right - left + 1
        }

        // Math.max (max_length vs. window_length)
    }

    // return
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

    public static int characterReplacement(String s, int k) {
        int[] counts = new int[26];
        // k = 1
        int maxFreq = 0;
        int maxLength = 0;
        int left = 0;
        // right = 0
        // c = A
        // counts[(A): 0, (B): 0]
        // windowsize =

        // AABABBA, k=1
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            counts[c - 'A']++;
            maxFreq = Math.max(maxFreq, counts[c - 'A']);
            int windowSize = right - left + 1;
            while (windowSize - maxFreq > k) {
                char leftChar = s.charAt(left);
                counts[leftChar - 'A']--;
                left++;
                windowSize = right - left + 1;
            }
            maxLength = Math.max(maxLength, windowSize);
        }
        return maxLength;
    }

    // Test cases
    public static void main(String[] args) {
        // Test 1: Basic example from problem
        assert characterReplacement("ABAB", 2) == 4 : "Test 1 Failed";
        System.out.println("✓ Test 1 passed: ABAB with k=2");

        // Test 2: Basic example from problem
        assert characterReplacement("AABABBA", 1) == 4 : "Test 2 Failed";
        System.out.println("✓ Test 2 passed: AABABBA with k=1");

        // Test 3: All same characters (no replacements needed)
        assert characterReplacement("AAAA", 0) == 4 : "Test 3 Failed";
        System.out.println("✓ Test 3 passed: All same characters");

        // Test 4: Single character
        assert characterReplacement("A", 0) == 1 : "Test 4 Failed";
        System.out.println("✓ Test 4 passed: Single character");

        // Test 5: k = 0 (no replacements allowed)
        assert characterReplacement("ABCDE", 0) == 1 : "Test 5 Failed";
        System.out.println("✓ Test 5 passed: k=0 returns longest single character sequence");

        // Test 6: k larger than string length
        assert characterReplacement("ABCD", 10) == 4 : "Test 6 Failed";
        System.out.println("✓ Test 6 passed: k larger than needed");

        // Test 7: Need all k replacements
        assert characterReplacement("ABCDEF", 2) == 3 : "Test 7 Failed";
        System.out.println("✓ Test 7 passed: Using all k replacements");

        // Test 8: Alternating pattern
        assert characterReplacement("ABABAB", 2) == 5 : "Test 8 Failed";
        System.out.println("✓ Test 8 passed: Alternating pattern");

        // Test 9: Long sequence with one different character
        assert characterReplacement("AAABAAAA", 1) == 8 : "Test 9 Failed";
        System.out.println("✓ Test 9 passed: Long sequence with one replacement");

        // Test 10: Multiple clusters
        assert characterReplacement("AABBCC", 1) == 3 : "Test 10 Failed";
        System.out.println("✓ Test 10 passed: Multiple character clusters");

        // Test 11: Complex pattern
        assert characterReplacement("ABAA", 0) == 2 : "Test 11 Failed";
        System.out.println("✓ Test 11 passed: Complex pattern with k=0");

        // Test 12: Larger k than differences
        assert characterReplacement("AABA", 1) == 4 : "Test 12 Failed";
        System.out.println("✓ Test 12 passed: AABA with k=1");

        // Test 13: All different characters
        assert characterReplacement("ABCDEFGH", 3) == 4 : "Test 13 Failed";
        System.out.println("✓ Test 13 passed: All different characters");

        System.out.println("\n✅ All tests passed!");
    }
}
