class Solution:
    def is_anagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        t_list = list(t)  # Convert the string t into a list of characters
        print("t_list:", t_list)

        for char in s:
            # Find the index of the current character in t_list
            if char in t_list:
                t_list.remove(char)  # Remove the character if found
            else:
                # If any character in s is not found in t, return False
                return False

        # After removing all matching characters, t_list should be empty
        return len(t_list) == 0

pysol = Solution()

print(pysol.is_anagram("anagram", "nagaram"))  # Output: True
print(pysol.is_anagram("rat", "car"))          # Output: False