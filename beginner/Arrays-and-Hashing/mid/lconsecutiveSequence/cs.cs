using System;
using System.Collections.Generic;
using System.Linq;

public class Solution {
    public int LongestConsecutive(int[] nums) {
        // Create a HashSet for O(1) lookups
        HashSet<int> numSet = new HashSet<int>(nums);
        int output = 0;

        // Iterate through each number in the array
        foreach (int num in nums) {
            // Only process if this number is the start of a sequence
            if (!numSet.Contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Count how long the sequence is
                while (numSet.Contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                // Update the longest sequence if needed
                output = Math.Max(output, currentStreak);
            }
        }

        return output;
    }
}

// Test cases (just put these at the bottom of the file)
var solution = new Solution();

Console.WriteLine(solution.LongestConsecutive(new int[] { 100, 4, 200, 1, 3, 2 })); // Should output 4
Console.WriteLine(solution.LongestConsecutive(new int[] { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 })); // Should output 9
Console.WriteLine(solution.LongestConsecutive(new int[] { 1, 0, 1, 2 })); // Should output 3
