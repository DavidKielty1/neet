/*
724. Find Pivot Index
Difficulty: Easy
Pattern: Prefix Sum

Problem:
Given an integer array nums, return the pivot index i such that the sum of all elements
strictly to the left of i equals the sum of all elements strictly to the right of i.
If several indices satisfy this, return the smallest (leftmost) i. If none exist, return -1.

Formal condition at index i:
    sum(nums[0..i-1]) == sum(nums[i+1..n-1])
where n = nums.length. The element nums[i] is excluded from both sides.

Edge cases:
- i == 0: left sum is 0 (no elements to the left).
- i == n - 1: right sum is 0 (no elements to the right).

Example 1:
Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation: Left of index 3: 1+7+3 = 11. Right of index 3: 5+6 = 11.

Example 2:
Input: nums = [1,2,3]
Output: -1
Explanation: No index balances left and right sums.

Example 3:
Input: nums = [2,1,-1]
Output: 0
Explanation: Left of index 0 is empty (sum 0); right of index 0 is 1 + (-1) = 0.

Time: O(n), Space: O(1)
*/
public class FindPivotIndexJava {

    // Pass 1: total. Pass 2: at pivot i, left = sum(0..i-1), right = sum(i+1..end);
    // start with left=0, right=total-nums[0]; then left+=nums[i], right-=nums[i+1].
    public int pivotIndex(int[] nums) {

        //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

    

        // int total = 0;
        // for (int num : nums) {
        //     total += num;
        // }
        // int leftSum = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     int rightSum = total - leftSum - nums[i];
        //     if (leftSum == rightSum) {
        //         return i;
        //     }
        //     leftSum += nums[i];
        // }
        // return -1;

        throw new UnsupportedOperationException("Implement pivotIndex");
    }

    public static void main(String[] args) {
        FindPivotIndexJava s = new FindPivotIndexJava();
        assert s.pivotIndex(new int[] {1, 7, 3, 6, 5, 6}) == 3;
        assert s.pivotIndex(new int[] {1, 2, 3}) == -1;
        assert s.pivotIndex(new int[] {2, 1, -1}) == 0;
        System.out.println("All test cases passed!");
    }
}
