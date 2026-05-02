# Bit Manipulation

## Pattern Overview

Bit manipulation involves directly working with bits using bitwise operators. It's extremely efficient for certain problems and is essential knowledge for:

- Low-level programming
- Optimization
- Cryptography
- Interview questions

## Java Practice File Builder

When a Java practice file has only one solution method, keep the usual single spoiler spacer
block in that method.

When the solution naturally spans multiple methods, such as a helper DFS, a comparison
helper, a constructor plus `add`, or an API method plus the main solver:

1. Leave the earlier/helper method bodies unimplemented.
2. Do not add separate 40-60 line `//` spacer blocks to those helper methods.
3. Keep exactly one 40-60 line `//` spacer block in the main method the learner is meant
   to solve from.
4. Put one combined commented reference implementation under that single spacer block,
   including all related methods together.
5. Avoid duplicate commented solutions and do not add `throw new UnsupportedOperationException(...)`
   placeholders.

## Key Concepts

### Bitwise Operators

| Operator | Name        | Example  | Result | Description           |
| -------- | ----------- | -------- | ------ | --------------------- |
| `&`      | AND         | `5 & 3`  | `1`    | Both bits must be 1   |
| `\|`     | OR          | `5 \| 3` | `7`    | At least one bit is 1 |
| `^`      | XOR         | `5 ^ 3`  | `6`    | Bits are different    |
| `~`      | NOT         | `~5`     | `-6`   | Flip all bits         |
| `<<`     | Left Shift  | `5 << 1` | `10`   | Multiply by 2^n       |
| `>>`     | Right Shift | `5 >> 1` | `2`    | Divide by 2^n         |

### Important Properties

1. **XOR Properties**:

   - `a ^ a = 0` (same numbers cancel)
   - `a ^ 0 = a` (identity)
   - `a ^ b ^ a = b` (cancellation)
   - XOR is commutative and associative

2. **AND Properties**:

   - `a & 1 = 0 or 1` (check if odd/even)
   - `n & (n-1) = 0` if n is power of 2
   - `n & (n-1)` removes rightmost 1 bit

3. **OR Properties**:

   - `a | 0 = a` (identity)
   - `a | a = a` (idempotent)

4. **Shift Properties**:
   - `a << b = a * 2^b`
   - `a >> b = a / 2^b`

## Problems in This Category

### Easy Level

| Problem          | LeetCode # | Technique | Key Insight           |
| ---------------- | ---------- | --------- | --------------------- |
| Single Number    | 136        | XOR       | Pairs cancel out      |
| Number of 1 Bits | 191        | AND/Shift | Count set bits        |
| Counting Bits    | 338        | DP + Bits | Use previous results  |
| Reverse Bits     | 190        | Shift     | Build reversed number |
| Missing Number   | 268        | XOR/Math  | Pairs cancel          |

## Common Patterns

### 1. XOR to Find Single Element

```python
def find_single(nums):
    """All elements appear twice except one"""
    result = 0
    for num in nums:
        result ^= num
    return result
```

### 2. Count Set Bits (Brian Kernighan's)

```python
def count_bits(n):
    """Count number of 1 bits"""
    count = 0
    while n:
        n &= n - 1  # Remove rightmost 1 bit
        count += 1
    return count
```

### 3. Check if Power of 2

```python
def is_power_of_two(n):
    """Power of 2 has exactly one 1 bit"""
    return n > 0 and (n & (n - 1)) == 0
```

### 4. Get/Set/Clear Bit

```python
def get_bit(num, i):
    """Get bit at position i"""
    return (num >> i) & 1

def set_bit(num, i):
    """Set bit at position i to 1"""
    return num | (1 << i)

def clear_bit(num, i):
    """Clear bit at position i (set to 0)"""
    return num & ~(1 << i)

def toggle_bit(num, i):
    """Toggle bit at position i"""
    return num ^ (1 << i)
```

### 5. Reverse Bits

```python
def reverse_bits(n):
    result = 0
    for i in range(32):
        bit = (n >> i) & 1
        result |= bit << (31 - i)
    return result
```

## Common Bit Tricks

### 1. Check Even/Odd

```python
is_odd = n & 1  # 1 if odd, 0 if even
```

### 2. Multiply/Divide by 2

```python
multiply_by_2 = n << 1
divide_by_2 = n >> 1
```

### 3. Swap Two Numbers

```python
a ^= b
b ^= a
a ^= b
```

### 4. Get Rightmost 1 Bit

```python
rightmost_1 = n & (-n)
```

### 5. Remove Rightmost 1 Bit

```python
remove_rightmost_1 = n & (n - 1)
```

### 6. Check if Power of 2

```python
is_power_of_2 = n > 0 and (n & (n - 1)) == 0
```

### 7. Get Lowest Set Bit Position

```python
def lowest_bit_pos(n):
    return (n & -n).bit_length() - 1
```

### 8. Count Trailing Zeros

```python
def trailing_zeros(n):
    return (n & -n).bit_length() - 1
```

## When to Use Bit Manipulation

✅ **Use when:**

- Need O(1) space and fast operations
- Working with sets/flags
- Finding duplicates with XOR
- Checking properties (even/odd, power of 2)
- Optimizing space (bit arrays)
- Low-level programming

❌ **Don't use when:**

- Problem doesn't naturally involve bits
- Readability is important (for team code)
- Simple arithmetic works better
- Debugging is difficult with bit operations

## Binary Representation Examples

```
Decimal | Binary   | Explanation
--------|----------|-------------------
0       | 0000     | All zeros
1       | 0001     | Only rightmost bit
2       | 0010     | One left shift of 1
3       | 0011     | 1 + 2
4       | 0100     | One left shift of 2
5       | 0101     | 4 + 1
7       | 0111     | 4 + 2 + 1
8       | 1000     | One left shift of 4
15      | 1111     | All 1s (2^4 - 1)
16      | 10000    | 2^4
```

## XOR Applications

### 1. Find Single Number

```python
# All elements appear twice except one
def single_number(nums):
    result = 0
    for num in nums:
        result ^= num
    return result
```

### 2. Find Two Single Numbers

```python
def two_single_numbers(nums):
    # XOR all numbers
    xor = 0
    for num in nums:
        xor ^= num

    # Find rightmost set bit
    rightmost_bit = xor & (-xor)

    # Divide into two groups
    a = b = 0
    for num in nums:
        if num & rightmost_bit:
            a ^= num
        else:
            b ^= num

    return [a, b]
```

### 3. Missing Number

```python
def missing_number(nums):
    result = len(nums)
    for i, num in enumerate(nums):
        result ^= i ^ num
    return result
```

## Bit Masking

```python
# Create mask with k bits set
def create_mask(k):
    return (1 << k) - 1

# Check if subset
def is_subset(set1, set2):
    return (set1 & set2) == set1

# Union of sets
def union(set1, set2):
    return set1 | set2

# Intersection of sets
def intersection(set1, set2):
    return set1 & set2

# Difference of sets
def difference(set1, set2):
    return set1 & ~set2
```

## Tips & Tricks

1. **Draw It Out**: Visualize bits on paper
2. **Test with Small Numbers**: Use 4-bit examples
3. **Know Properties**: Memorize XOR, AND properties
4. **Use Binary Literals**: `0b1010` instead of 10
5. **Check Signs**: Be careful with signed integers
6. **Bit Length**: Use `num.bit_length()` in Python

## Common Pitfalls

❌ **Signed vs Unsigned**

```python
# BAD: Python has arbitrary precision integers
# Be careful with sign bit in 32-bit problems
~5  # In Python: -6, not what you expect in 32-bit
```

❌ **Operator Precedence**

```python
# BAD: Wrong precedence
if n & 1 == 0:  # Wrong! == has higher precedence

# GOOD: Use parentheses
if (n & 1) == 0:
```

❌ **Off-by-One in Shifts**

```python
# BAD: Shifting too much
1 << 32  # Undefined behavior in many languages
```

## Time & Space Complexity

| Operation    | Time  | Space | Notes                |
| ------------ | ----- | ----- | -------------------- |
| Check bit    | O(1)  | O(1)  | Single operation     |
| Count bits   | O(k)  | O(1)  | k = number of 1 bits |
| Reverse bits | O(32) | O(1)  | Fixed 32 bits        |
| XOR array    | O(n)  | O(1)  | Linear scan          |

## Python Specific

```python
# Get binary representation
bin(5)  # '0b101'

# Count 1 bits
bin(5).count('1')  # 2

# Bit length
(5).bit_length()  # 3

# Convert binary string to int
int('101', 2)  # 5

# Get individual bit
(5 >> i) & 1  # Bit at position i
```

## Edge Cases

- Zero (0)
- One (1)
- All bits set (-1 in two's complement)
- Power of 2
- Negative numbers (two's complement)
- Maximum integer (overflow)

## Related Patterns

- **Math** - Bit operations are arithmetic
- **Dynamic Programming** - Counting Bits uses DP
- **Arrays** - Many array problems can use XOR
- **Sets** - Bit masks represent sets
