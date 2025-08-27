function removeElement(nums: number[], val: number): number {
  let i = 0;

  while (i < nums.length) {
    if (nums[i] === val) {
      nums.splice(i, 1);
    } else {
      i++;
    }
  }

  console.log("Nums Length:", nums.length);
  return nums.length;
}

removeElement([0, 1, 2, 2, 3, 0, 4, 2], 2);
