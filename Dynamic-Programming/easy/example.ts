/**
 * Problem: Calculate the nth Fibonacci number
 * 
 * The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones.
 * Sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
 * 
 * Without DP (naive recursive approach):
 * - Time Complexity: O(2^n) - exponential
 * - Space Complexity: O(n) - call stack
 * 
 * With DP (memoization):
 * - Time Complexity: O(n)
 * - Space Complexity: O(n)
 */

// Naive recursive solution (without DP)
function fibonacciNaive(n: number): number {
    if (n <= 1) return n;
    return fibonacciNaive(n - 1) + fibonacciNaive(n - 2);
}

// DP solution with memoization
function fibonacciDP(n: number): number {
    // Create a memo array to store computed values
    const memo: number[] = new Array(n + 1).fill(-1);
    
    // Base cases
    memo[0] = 0;
    memo[1] = 1;
    
    // Helper function with memoization
    function fib(n: number): number {
        // If value is already computed, return it
        if (memo[n] !== -1) return memo[n];
        
        // Compute and store the value
        memo[n] = fib(n - 1) + fib(n - 2);
        return memo[n];
    }
    
    return fib(n);
}

// DP solution with tabulation (bottom-up approach)
function fibonacciTabulation(n: number): number {
    if (n <= 1) return n;
    
    const dp: number[] = new Array(n + 1);
    dp[0] = 0;
    dp[1] = 1;
    
    for (let i = 2; i <= n; i++) {
        dp[i] = dp[i - 1] + dp[i - 2];
    }
    
    return dp[n];
}

// Example usage
console.log("Naive approach (n=10):", fibonacciNaive(10)); // 55
console.log("DP with memoization (n=10):", fibonacciDP(10)); // 55
console.log("DP with tabulation (n=10):", fibonacciTabulation(10)); // 55

// Performance comparison
console.log("\nPerformance comparison for n=40:");
console.time("Naive");
console.log(fibonacciNaive(40));
console.timeEnd("Naive");

console.time("DP Memoization");
console.log(fibonacciDP(40));
console.timeEnd("DP Memoization");

console.time("DP Tabulation");
console.log(fibonacciTabulation(40));
console.timeEnd("DP Tabulation");
