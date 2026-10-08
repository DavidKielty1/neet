/*
 * 169. Majority Element
 * Difficulty: Easy
 * Pattern: Arrays & Hashing
 *
 * Problem:
 * Given an array nums of size n, return the majority element. The majority
 * element is the element that appears more than floor(n / 2) times. You may
 * assume that the majority element always exists in the array.
 *
 * Example 1:
 * Input: nums = [3,2,3]
 * Output: 3
 *
 * Example 2:
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 *
 * Constraints:
 * - n == nums.length
 * - 1 <= n <= 5 * 10^4
 * - -10^9 <= nums[i] <= 10^9
 */

public class MajorityElement {
    public Integer getMajorityIntegerBoyerMoore (Integer[] nums) {

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

        //

        //

        //

        //

        // int candidate = nums[0];
        // int voteCount = 0;

        // for (int i = 0; i < nums.length; i++) {
        //     if (voteCount == 0) candidate = nums[i];

        //     if(nums[i] == candidate) {
        //         voteCount++;
        //     } else {
        //         voteCount--;
        //     }
        // }
        // return candidate;
    }

    public Integer getMajorityIntegerHashMap(int[] nums) {
    }


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

        //

        //

        //

        //

        //

        // Map<Integer, Integer> count = new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
                // count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        // }
        // int half = nums.length / 2;

        // By map.keySet()
        // for (Integer key : count.keySet()) {
            // if (count.get(key) > half) {
                // return key;
            // }
        // }
        // By map.entrySet()
        // for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            // if (entry.getValue() > half) {
                // return entry.getKey();
            // }
        // }

        throw new UnsupportedOperationException("Implement getMajorityIntegerHashMap");
    }

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

    /
        //

    public int majorityElement(int[] nums) {
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
        //
        //
        //
        //
        //
        // int candidate = nums[0];
        // int count = 0;
        // for (int num : nums) {
        //     if (count == 0) {
        //         candidate = num;
        //     }
        //     count += (num == candidate) ? 1 : -1;
        // }
        // return candidate;

        throw new UnsupportedOperationException("Implement majorityElement");
    }

    public static void main(String[] args) {
        MajorityElement s = new MajorityElement();
        assert s.majorityElement(new int[] {3, 2, 3}) == 3;
        assert s.majorityElement(new int[] {2, 2, 1, 1, 1, 2, 2}) == 2;
        System.out.println("All test cases passed!");
    }
}
