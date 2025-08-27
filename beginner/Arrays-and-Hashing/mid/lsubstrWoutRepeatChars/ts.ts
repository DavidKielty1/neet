function lengthOfLongestSubstring(s: string): number {
    // Initialize variables
    let longestString = 0;
    let left = 0;
    const charSet = new Set<string>();

    // Iterate through the string with right pointer
    for (let right = 0; right < s.length; right++) {
        // If we find a duplicate character
        while (charSet.has(s[right])) {
            // Remove the leftmost character and move left pointer
            charSet.delete(s[left]);
            left++;
        }
        
        // Add current character to set
        charSet.add(s[right]);
        
        // Update longestString if current window is longer
        longestString = Math.max(longestString, right - left + 1);
    }

    return longestString;
}

// Test cases
console.log(lengthOfLongestSubstring("abcabcbb")); // Output: 3
console.log(lengthOfLongestSubstring("bbbbb"));    // Output: 1
console.log(lengthOfLongestSubstring("pwwkew"));   // Output: 3   