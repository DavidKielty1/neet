using System;

public class Solution {
    public string LongestPalindrome(string s) {
        if (string.IsNullOrEmpty(s)) {
            return "";
        }

        int start = 0;
        int maxLength = 1;

        for (int i = 0; i < s.Length; i++) {
            // Check odd length palindromes
            ExpandAroundCenter(s, i, i, ref start, ref maxLength);
            // Check even length palindromes
            ExpandAroundCenter(s, i, i + 1, ref start, ref maxLength);
        }

        return s.Substring(start, maxLength);
    }

    private void ExpandAroundCenter(string s, int left, int right, ref int start, ref int maxLength) {
        while (left >= 0 && right < s.Length && s[left] == s[right]) {
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                start = left;
            }
            left--;
            right++;
        }
    }
}

// Test cases
var solution = new Solution();
Console.WriteLine(solution.LongestPalindrome("babad")); // Should output bab
Console.WriteLine(solution.LongestPalindrome("cbbd")); // Should output bb
