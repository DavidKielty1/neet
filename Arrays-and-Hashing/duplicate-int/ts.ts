class dupSolution {
  hasDuplicate = (nums: number[]): boolean => {
    const uniqueNums = new Set(nums);
    return uniqueNums.size !== nums.length;
  };
}

const solution = new dupSolution();
console.log(solution.hasDuplicate([1, 2, 3, 4]));
console.log(solution.hasDuplicate([1, 2, 3, 1]));
