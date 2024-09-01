using System;
using System.Collections.Generic;

public class Solution
{
    public int[] TwoSum(int[] nums, int target)
    {
        // Dictionary to store the value and its index
        Dictionary<int, int> map = new Dictionary<int, int>();

        for (int i = 0; i < nums.Length; i++)
        {
            int complement = target - nums[i];

            if (map.ContainsKey(complement))
            {
                return new int[] { map[complement], i };
            }

            // Store the current number and its index in the dictionary
            map[nums[i]] = i;
        }

        return new int[0]; // Return an empty array if no solution is found
    }
}

class Program
{
    static void Main(string[] args)
    {
        Solution sol = new Solution();
        Console.WriteLine(string.Join(", ", sol.TwoSum(new int[] { 3, 4, 5, 6 }, 7)));  // Output: 0, 1
        Console.WriteLine(string.Join(", ", sol.TwoSum(new int[] { 4, 5, 6 }, 10)));   // Output: 0, 2
        Console.WriteLine(string.Join(", ", sol.TwoSum(new int[] { 5, 5 }, 10)));      // Output: 0, 1
    }
}
