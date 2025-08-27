function merge(nums1: number[], m: number, nums2: number[], n: number): void {
  let i = m - 1; // Pointer for the last element in the "real" part of nums1
  let j = n - 1; // Pointer for the last element in nums2
  let k = m + n - 1; // Pointer for the end of nums1 array

  while (j >= 0) {
    if (i >= 0 && nums1[i] > nums2[j]) {
      nums1[k] = nums1[i]; // Place the larger element from nums1
      i--;
    } else {
      nums1[k] = nums2[j]; // Place the larger element from nums2
      j--;
    }
    k--; // Move the pointer in nums1
  }
}
