# Math & Geometry

## Pattern Overview

Math and Geometry problems involve mathematical concepts, formulas, and spatial reasoning. These problems often require:

- Number theory
- Arithmetic operations
- Geometric calculations
- Pattern recognition
- Mathematical properties

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

### Math

1. **Prime Numbers** - Divisible only by 1 and itself
2. **GCD/LCM** - Greatest common divisor, least common multiple
3. **Modular Arithmetic** - Operations with remainders
4. **Powers** - Exponentiation, fast power
5. **Factorials** - Combinations, permutations

### Geometry

1. **Points** - (x, y) coordinates
2. **Distance** - Euclidean distance formula
3. **Lines** - Slope, intersection
4. **Shapes** - Area, perimeter calculations
5. **Angles** - Rotation, transformations

## Problems in This Category

### Easy Level

| Problem      | LeetCode # | Type | Key Concept      |
| ------------ | ---------- | ---- | ---------------- |
| Happy Number | 202        | Math | Cycle detection  |
| Plus One     | 66         | Math | Array arithmetic |

### Medium Level (for reference)

- Pow(x, n) (50)
- Spiral Matrix (54)
- Rotate Image (48)
- Set Matrix Zeroes (73)

## Common Math Patterns

### 1. GCD (Greatest Common Divisor)

```python
def gcd(a, b):
    """Euclidean algorithm"""
    while b:
        a, b = b, a % b
    return a

# Using math module
import math
gcd = math.gcd(a, b)
```

### 2. Check Prime Number

```python
def is_prime(n):
    if n < 2:
        return False
    if n == 2:
        return True
    if n % 2 == 0:
        return False

    # Check odd divisors up to sqrt(n)
    i = 3
    while i * i <= n:
        if n % i == 0:
            return False
        i += 2

    return True
```

### 3. Fast Power (Exponentiation)

```python
def fast_power(base, exp):
    """Calculate base^exp efficiently"""
    result = 1

    while exp > 0:
        if exp % 2 == 1:
            result *= base
        base *= base
        exp //= 2

    return result

# Or use built-in
result = pow(base, exp)
result = pow(base, exp, mod)  # With modulo
```

### 4. Factorial

```python
def factorial(n):
    if n <= 1:
        return 1
    return n * factorial(n - 1)

# Or iterative
def factorial(n):
    result = 1
    for i in range(2, n + 1):
        result *= i
    return result

# Or use math module
import math
result = math.factorial(n)
```

### 5. Sum of Squares of Digits

```python
def sum_of_square_digits(n):
    total = 0
    while n > 0:
        digit = n % 10
        total += digit * digit
        n //= 10
    return total
```

## Common Geometry Patterns

### 1. Distance Between Points

```python
def distance(p1, p2):
    """Euclidean distance"""
    return ((p2[0] - p1[0])**2 + (p2[1] - p1[1])**2) ** 0.5

# Manhattan distance
def manhattan_distance(p1, p2):
    return abs(p2[0] - p1[0]) + abs(p2[1] - p1[1])
```

### 2. Area and Perimeter

```python
# Rectangle
def rectangle_area(width, height):
    return width * height

def rectangle_perimeter(width, height):
    return 2 * (width + height)

# Circle
import math
def circle_area(radius):
    return math.pi * radius ** 2

def circle_circumference(radius):
    return 2 * math.pi * radius
```

### 3. Rotation of Points

```python
def rotate_90_clockwise(x, y, n):
    """Rotate point in n×n grid 90° clockwise"""
    return y, n - 1 - x

def rotate_90_counter_clockwise(x, y, n):
    """Rotate point in n×n grid 90° counter-clockwise"""
    return n - 1 - y, x
```

### 4. Line Intersection

```python
def do_lines_intersect(p1, p2, p3, p4):
    """Check if line segments intersect"""
    def ccw(A, B, C):
        return (C[1]-A[1]) * (B[0]-A[0]) > (B[1]-A[1]) * (C[0]-A[0])

    return ccw(p1,p3,p4) != ccw(p2,p3,p4) and ccw(p1,p2,p3) != ccw(p1,p2,p4)
```

## Number Theory

### 1. Prime Factorization

```python
def prime_factors(n):
    factors = []
    d = 2
    while d * d <= n:
        while n % d == 0:
            factors.append(d)
            n //= d
        d += 1
    if n > 1:
        factors.append(n)
    return factors
```

### 2. Sieve of Eratosthenes

```python
def sieve_of_eratosthenes(n):
    """Find all primes up to n"""
    is_prime = [True] * (n + 1)
    is_prime[0] = is_prime[1] = False

    for i in range(2, int(n**0.5) + 1):
        if is_prime[i]:
            for j in range(i*i, n + 1, i):
                is_prime[j] = False

    return [i for i in range(n + 1) if is_prime[i]]
```

### 3. Modular Arithmetic

```python
# Addition
(a + b) % m == ((a % m) + (b % m)) % m

# Multiplication
(a * b) % m == ((a % m) * (b % m)) % m

# Modular inverse (when m is prime)
def mod_inverse(a, m):
    return pow(a, m - 2, m)
```

## Common Tricks

### 1. Digit Manipulation

```python
# Get digits
digits = [int(d) for d in str(n)]

# Sum of digits
digit_sum = sum(int(d) for d in str(n))

# Reverse number
reversed_n = int(str(n)[::-1])
```

### 2. Perfect Square Check

```python
def is_perfect_square(n):
    if n < 0:
        return False
    root = int(n ** 0.5)
    return root * root == n
```

### 3. Power of Two Check

```python
def is_power_of_two(n):
    return n > 0 and (n & (n - 1)) == 0
```

### 4. Fibonacci

```python
def fibonacci(n):
    if n <= 1:
        return n
    a, b = 0, 1
    for _ in range(2, n + 1):
        a, b = b, a + b
    return b
```

## Matrix Operations

### 1. Matrix Rotation (90° clockwise)

```python
def rotate_matrix(matrix):
    """Rotate n×n matrix 90° clockwise in-place"""
    n = len(matrix)

    # Transpose
    for i in range(n):
        for j in range(i, n):
            matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]

    # Reverse each row
    for i in range(n):
        matrix[i].reverse()

    return matrix
```

### 2. Spiral Matrix

```python
def spiral_order(matrix):
    """Return elements in spiral order"""
    result = []
    if not matrix:
        return result

    top, bottom = 0, len(matrix) - 1
    left, right = 0, len(matrix[0]) - 1

    while top <= bottom and left <= right:
        # Right
        for col in range(left, right + 1):
            result.append(matrix[top][col])
        top += 1

        # Down
        for row in range(top, bottom + 1):
            result.append(matrix[row][right])
        right -= 1

        # Left (if still have rows)
        if top <= bottom:
            for col in range(right, left - 1, -1):
                result.append(matrix[bottom][col])
            bottom -= 1

        # Up (if still have columns)
        if left <= right:
            for row in range(bottom, top - 1, -1):
                result.append(matrix[row][left])
            left += 1

    return result
```

## Tips & Tricks

1. **Use Math Module**: `math.sqrt()`, `math.gcd()`, `math.ceil()`, etc.
2. **Integer Division**: Use `//` for integer division
3. **Modulo for Cycles**: `index % length` for circular arrays
4. **Power of 2**: Check with `n & (n-1) == 0`
5. **Digit Operations**: Convert to string for easy manipulation
6. **Avoid Float**: Use integer arithmetic when possible

## Common Pitfalls

❌ **Float Precision**

```python
# BAD: Float comparison
if a / b == 0.5:  # May not work due to precision

# GOOD: Use integer arithmetic or epsilon
if abs(a / b - 0.5) < 1e-9:
```

❌ **Integer Overflow**

```python
# In some languages (not Python), watch for overflow
result = a * b  # May overflow
# Python handles arbitrary precision automatically
```

❌ **Division by Zero**

```python
# BAD: No check
result = a / b

# GOOD: Check first
if b != 0:
    result = a / b
```

## Time Complexity

| Operation      | Time            | Notes                 |
| -------------- | --------------- | --------------------- |
| GCD            | O(log min(a,b)) | Euclidean algorithm   |
| Check Prime    | O(√n)           | Test divisors         |
| Factorial      | O(n)            | Multiply n numbers    |
| Fast Power     | O(log n)        | Binary exponentiation |
| Sieve (primes) | O(n log log n)  | Up to n               |

## Edge Cases

- Zero and negative numbers
- Very large numbers (overflow in some languages)
- Division by zero
- Perfect squares/powers
- Prime numbers
- Single digit numbers
- Negative coordinates (geometry)

## Python Math Module

```python
import math

math.sqrt(n)        # Square root
math.ceil(x)        # Round up
math.floor(x)       # Round down
math.pow(x, y)      # Power
math.gcd(a, b)      # GCD
math.factorial(n)   # Factorial
math.pi             # Pi constant
math.e              # Euler's number
```

## Related Patterns

- **Bit Manipulation** - Often combined with math
- **Dynamic Programming** - Counting/optimization problems
- **Arrays** - Matrix operations
- **Recursion** - Mathematical recurrence relations
- **Greedy** - Optimization problems
