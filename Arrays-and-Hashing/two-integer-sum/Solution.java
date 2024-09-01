import java.util.HashMap;
import java.util.Map;
import java.util.Arrays; 

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }

        return new int[] {}; 
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.twoSum(new int[] { 3, 4, 5, 6 }, 7))); // [0, 1]
        System.out.println(Arrays.toString(sol.twoSum(new int[] { 4, 5, 6 }, 10)));  // [0, 2]
        System.out.println(Arrays.toString(sol.twoSum(new int[] { 5, 5 }, 10)));     // [0, 1]
    }
}