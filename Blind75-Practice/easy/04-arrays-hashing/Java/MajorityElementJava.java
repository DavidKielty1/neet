/*
169. Majority Element
Difficulty: Easy
Pattern: Arrays & Hashing

Problem:
Given an array nums of length n, return the majority element: the value that appears strictly
more than floor(n/2) times. The problem guarantees such an element exists.

Notes:
- Hash map counting is straightforward; Boyer–Moore voting achieves O(1) extra space.
- The majority element always appears at least once in any split of the array.

Example 1:
Input: nums = [3,2,3]
Output: 3
Explanation: n = 3; majority requires more than 1 occurrence; 3 appears twice.

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2
Explanation: n = 7; need more than 3 occurrences; 2 appears four times.

Example 3:
Input: nums = [1]
Output: 1
Explanation: The single element is trivially the majority.

Time: O(n), Space: O(1) with Boyer–Moore (O(n) with a hash map)
*/

import java.util.HashMap;
import java.util.Map;

public class MajorityElementJava {
        // Boyer-moore
        // Take first char, store as majorNum, increment majorCounter by one
        // if next char != majorNum, decrement majorCounter
        // if majorCounter == 0, change majorNum to i, increment by 1

    public Integer getMajorityIntegerBoyerMoore (Integer[] nums) {
        Integer majorityNumber = 0;
        Integer majorityCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if(majorityCount == 0) {
                majorityNumber = nums[i];
            }

            if(nums[i] != majorityNumber) {
                majorityCount--;
            } else {
                majorityCount++;
            }
        }
    }

    public Integer getMajorityIntegerHashMap (int[] nums) {
        Map<Integer, Integer> seenCount = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (seenCount.containsKey(nums[i])) {
                seenCount.put(nums[i], seenCount.getOrDefault(nums[i], 0) + 1);
            } else {
                seenCount.put(nums[i], 1);
            }
        }

        // Go by map keys, use map.get(key) for each in map.keySet()
        int majorityBar = nums.length / 2;
        for (Integer key : seenCount.keySet()) {
            if (seenCount.get(key) > majorityBar) {
                return key;
            }
        }

        // Go by map.entries and get value for each in map.entrySet()
        int majorityBar2 = nums.length / 2;
        for (Map.Entry<Integer, Integer> entry : seenCount.entrySet()) {
            if (entry.getValue() > majorityBar2) {
                return entry.getKey();
            }
        }
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

    

        // Integer candidate = null;
        // int count = 0;
        // for (int num : nums) {
        //     if (count == 0) {
        //         candidate = num;
        //     }
        //     count += (num == candidate) ? 1 : -1;
        // }
        // return candidate;
    }

    public static void main(String[] args) {
        MajorityElementJava s = new MajorityElementJava();
        assert s.majorityElement(new int[] {3, 2, 3}) == 3;
        assert s.majorityElement(new int[] {2, 2, 1, 1, 1, 2, 2}) == 2;
        System.out.println("All test cases passed!");
    }
}
