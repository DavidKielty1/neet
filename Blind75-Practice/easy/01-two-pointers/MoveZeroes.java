/*
283. Move Zeroes
Difficulty: Easy
Pattern: Two Pointers

Given an integer array nums, move all 0's to the end of it while maintaining
the relative order of the non-zero elements.

Contract (LeetCode 283):
- Modify nums in-place to move all zeros to the end.
- Do not return anything; mutate nums directly.

Example:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Time: O(n), Space: O(1)
*/
public class MoveZeroes {

    // e.g. array = [1, 0, 0, 2, 3, 0]
    public static void moveZeroes(int[] nums) {
        // slow, fast.
        // Fast reads, slow writes non-zero elements to the front, then the rest become zeros.

        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }

    // Test cases
    public static void main(String[] args) {
        // Test 1
        int[] nums1 = {0, 1, 0, 3, 12};
        moveZeroes(nums1);
        System.out.print("Move Zeroes: ");
        printArray(nums1);  // [1, 3, 12, 0, 0]

        // Test 2
        int[] nums2 = {0};
        moveZeroes(nums2);
        System.out.print("Move Zeroes: ");
        printArray(nums2);  // [0]

        // Test 3
        int[] nums3 = {1, 0, 0, 2, 3};
        moveZeroes(nums3);
        System.out.print("Move Zeroes: ");
        printArray(nums3);  // [1, 2, 3, 0, 0]
    }

    private static void printArray(int[] nums) {
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

