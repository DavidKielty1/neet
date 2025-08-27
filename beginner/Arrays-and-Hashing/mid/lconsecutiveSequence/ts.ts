function longestConsecutive(nums: number[]): number {
    // Create a Set for O(1) lookups
    const numSet = new Set(nums);
    let output = 0;

    // Iterate through each number in the array
    for (const num of nums) {
        // Only process if this number is the start of a sequence
        if (!numSet.has(num - 1)) {
            let currentNum = num;
            let currentStreak = 1;

            // Count how long the sequence is
            while (numSet.has(currentNum + 1)) {
                currentNum++;
                currentStreak++;
            }

            // Update the longest sequence if needed
            output = Math.max(output, currentStreak);
        }
    }

    return output;
}

// Test cases
console.log(longestConsecutive([100,4,200,1,3,2])); // Should output 4
console.log(longestConsecutive([0,3,7,2,5,8,4,6,0,1])); // Should output 9
console.log(longestConsecutive([1,0,1,2])); // Should output 3