class Solution {
  /**
   * @param {number[]} nums
   * @param {number} target
   * @return {number[]}
   */
  twoSum(nums, target) {
    const map = {}; // To store the value and its index

    for (let i = 0; i < nums.length; i++) {
      const complement = target - nums[i];

      // Check if the complement is already in the map
      if (complement in map) {
        return [map[complement], i]; // Return the indices
      }

      // Store the current number and its index in the map
      map[nums[i]] = i;
    }

    return []; // Return an empty array if no solution is found (shouldn't happen according to the problem statement)
  }
}

const sol = new Solution();
console.log(sol.twoSum([3, 4, 5, 6], 7)); // [0, 1]
console.log(sol.twoSum([4, 5, 6], 10)); // [0, 2]
console.log(sol.twoSum([5, 5], 10)); // [0, 1]

// class Solution {
//   /**
//    * @param {number[]} nums
//    * @param {number} target
//    * @return {number[]}
//    */
//   twoSum(nums, target) {
//     for (let i = 0; i < nums.length; i++) {
//       for (let j = i + 1; j < nums.length; j++) {
//         if (nums[i] + nums[j] === target) {
//           return [i, j];
//         }
//       }
//     }
//     return [];
//   }
// }

// const sol = new Solution();

// console.log(sol.twoSum([3, 4, 5, 6], 7)); // [0, 1]
// console.log(sol.twoSum([4, 5, 6], 10)); // [0, 2]
// console.log(sol.twoSum([5, 5], 10)); // [0, 1]
