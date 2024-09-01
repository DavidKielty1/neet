using System;
using System.Collections.Generic;

public class DupSolution
{
    public bool HasDuplicate(int[] nums)
    {
        HashSet<int> uniqueNums = new HashSet<int>(nums);
        return uniqueNums.Count != nums.Length;
    }
}

public class Program
{
    public static void Main()
    {
        DupSolution solution = new DupSolution();
        Console.WriteLine(solution.HasDuplicate(new int[] { 1, 2, 3, 4 }));  // Output: False
        Console.WriteLine(solution.HasDuplicate(new int[] { 1, 2, 3, 1 }));  // Output: True
    }
}
