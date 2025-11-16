"""
Similar Problem 3: Prime Number of Set Bits in Binary Representation
Difficulty: Easy
Pattern: Bit Manipulation

Problem:
Given two integers left and right, return the count of numbers in the inclusive range [left, right]
having a prime number of set bits in their binary representation.

Example 1:
Input: left = 6, right = 10
Output: 4
Explanation:
6 -> 110 (2 set bits, prime)
7 -> 111 (3 set bits, prime)
8 -> 1000 (1 set bit, not prime)
9 -> 1001 (2 set bits, prime)
10 -> 1010 (2 set bits, prime)

Example 2:
Input: left = 10, right = 15
Output: 5
Explanation: All numbers from 10-15 have prime number of set bits

Constraints:
- 1 <= left <= right <= 10^6
- 0 <= right - left <= 10^4
"""


class Solution:
    def countPrimeSetBits(self, left: int, right: int) -> int:
        """
        Approach: Count bits and check if count is prime

        Strategy:
        1. For each number, count set bits
        2. Check if count is prime
        3. Max bits in 10^6 is 20, so primes <= 20: {2,3,5,7,11,13,17,19}
        4. Use set for O(1) lookup
        """

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        primes = {2, 3, 5, 7, 11, 13, 17, 19}

        def count_bits(n):
            count = 0
            while n:
                count += n & 1
                n >>= 1
            return count

        result = 0
        for num in range(left, right + 1):
            if count_bits(num) in primes:
                result += 1

        return result


# Alternative: Using built-in
class SolutionBuiltin:
    def countPrimeSetBits(self, left: int, right: int) -> int:
        primes = {2, 3, 5, 7, 11, 13, 17, 19}
        return sum(bin(num).count("1") in primes for num in range(left, right + 1))


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    assert solution.countPrimeSetBits(6, 10) == 4
    print("✓ Test case 1 passed")

    # Test case 2
    assert solution.countPrimeSetBits(10, 15) == 5
    print("✓ Test case 2 passed")

    # Test case 3
    assert solution.countPrimeSetBits(1, 1) == 0
    print("✓ Test case 3 passed")

    print("\nAll test cases passed!")
