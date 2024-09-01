using System;
using System.Collections.Generic;

public class Solution
{
    public bool IsAnagram(string s, string t)
    {
        // Check if lengths of both strings are not equal
        if (s.Length != t.Length)
        {
            return false;
        }

        // Convert string t into a list of characters
        List<char> tList = new List<char>(t);
        Console.WriteLine("tList: " + string.Join(", ", tList));

        // Loop through each character in string s
        foreach (char c in s)
        {
            // Find the index of the current character in tList
            int index = tList.IndexOf(c);

            // If the character is found, remove it from tList
            if (index != -1)
            {
                tList.RemoveAt(index);
            }
            else
            {
                // If any character in s is not found in t, return false
                return false;
            }
        }

        // After removing all matching characters, tList should be empty
        return tList.Count == 0;
    }
}

public class Program
{
    public static void Main(string[] args)
    {
        Solution cssol = new Solution();

        Console.WriteLine(sol.IsAnagram("anagram", "nagaram")); // Output: True
        Console.WriteLine(sol.IsAnagram("rat", "car"));         // Output: False
    }
}
