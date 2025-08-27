using System;
using System.Collections.Generic;
using System.Linq;

public class Solution {
    public int LengthOfLongestSubstring(string s) {
        // Initialize variables
        int longestString = 0;
        int left = 0;
        HashSet<char> charSet = new HashSet<char>();

        // Iterate through the string with right pointer
        for (int right = 0; right < s.Length; right++) {

            // If we find a duplicate character
            while (charSet.Contains(s[right])) {
                charSet.Remove(s[left]);
                left++;
            }
            
            // Add current character to set
            charSet.Add(s[right]);
            
            // Update longestString if current window is longer
            longestString = Math.Max(longestString, right - left + 1);
        }

        return longestString;
    }
}

// Test cases
var solution = new Solution();
Console.WriteLine(solution.LengthOfLongestSubstring("abcabcbb")); // Should output 3
Console.WriteLine(solution.LengthOfLongestSubstring("bbbbb")); // Should output 1
Console.WriteLine(solution.LengthOfLongestSubstring("pwwkew")); // Should output 3
