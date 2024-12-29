function removeDuplicates(nums) {
  let uniqueIndex = 0; // Index to place the next unique element

  for (let i = 1; i < nums.length; i++) {
    if (nums[i] !== nums[uniqueIndex]) {
      uniqueIndex++; // Move the pointer to the next position
      nums[uniqueIndex] = nums[i]; // Place the unique value
    }
  }

  return uniqueIndex + 1; // Length of the unique elements
}

removeDuplicates([1, 1, 2]);
