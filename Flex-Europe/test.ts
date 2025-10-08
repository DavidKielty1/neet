function Main(str: string): string {
    // Parse input
    let n = parseInt(str.trim());
    
    // Edge case: check constraints
    if (isNaN(n) || n < 1 || n > 12) {
        return 'Invalid Input';
    }

    // Initialize board
    let board: number[][] = Array.from({length: n}, () => Array(n).fill(0));
    let foundSolution = false;
    let result = '';

    // Helper function to check if it's safe to place a queen
    function isSafe(row: number, col: number): boolean {
        // Check for each row above current row
        for(let r = 0; r < row; r++){
            if (board[r][col] === 1) return false;
        }

        // Check diagonally upper-left
        for(let r = row - 1, c = col - 1; r >= 0 && c >= 0; r--, c--) {
            if (board[r][c] === 1) return false; // Fixed: was checking [r][col] instead of [r][c]
        }

        // Check diagonally upper-right
        for(let r = row - 1, c = col + 1; r >= 0 && c < n; r--, c++) { // Fixed: added c < n check
            if (board[r][c] === 1) return false; // Fixed: was checking [r][col] instead of [r][c]
        }

        return true;
    }

    // Convert board to string representation
    function boardToString(): string {
        let result = '';
        for(let row = 0; row < n; row++) {
            for(let col = 0; col < n; col++) {
                result += board[row][col] + ' ';
            }
        }
        return result.trim(); // Remove trailing space
    }

    // Recursive function to solve N-Queens
    function n_queens(row: number): boolean {
        // Base case: if we've placed all queens, we have a solution
        if(row === n) {
            result = boardToString();
            foundSolution = true;
            return true;
        }

        // Try each column in the current row
        for(let col = 0; col < n; col++) {
            if(isSafe(row, col)){
                // Place queen
                board[row][col] = 1;

                // Recursively try to place queens in next rows
                if(n_queens(row + 1)) {
                    return true; // Solution found
                }

                // Backtrack: remove queen
                board[row][col] = 0;
            }
        }

        return false; // No solution found for this path
    }

    // Start recursion from the first row
    n_queens(0);

    if (foundSolution) {
        return result;
    } else {
        return 'Invalid Input';
    }
}

// Test the function
console.log("Testing with n=4:");
console.log(Main("4"));

console.log("\nTesting with n=5:");
console.log(Main("5"));
