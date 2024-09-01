class Solution {
  twoSum(nums: number[], target: number): number[] {
    const map: Record<number, number> = {};

    for (let i = 0; i < nums.length; i++) {
      const complement = target - nums[i];

      if (complement in map) {
        return [map[complement], i];
      }

      // Store the current number and its index in the map
      map[nums[i]] = i;
    }

    return []; // Return an empty array if no solution is found
  }
}

const sol = new Solution();
console.log(sol.twoSum([3, 4, 5, 6], 7)); // [0, 1]
console.log(sol.twoSum([4, 5, 6], 10)); // [0, 2]
console.log(sol.twoSum([5, 5], 10)); // [0, 1]
