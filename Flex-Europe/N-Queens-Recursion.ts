/**
 * N-Queens Problem using Recursion and Backtracking
 * 
 * Problem: Place N queens on an N×N chessboard so that no two queens threaten each other.
 * A queen can move horizontally, vertically, or diagonally any number of squares.
 * 
 * Solution: Use backtracking recursion to try different placements and find all valid configurations.
 */

class NQueensSolver {
    private solutions: string[][] = [];
    private board: boolean[][];
    private n: number;

    constructor(n: number) {
        this.n = n;
        this.board = Array(n).fill(null).map(() => Array(n).fill(false));
    }

    /**
     * Main method to solve N-Queens problem
     * @returns Array of all valid board configurations as strings
     */
    solve(): string[][] {
        this.solutions = [];
        this.solveRecursive(0);
        return this.solutions;
    }

    /**
     * Recursive backtracking method to place queens
     * @param row Current row to place queen
     */
    private solveRecursive(row: number): void {
        // Base case: if we've placed all queens, we have a solution
        if (row === this.n) {
            this.solutions.push(this.boardToString());
            return;
        }

        // Try placing a queen in each column of the current row
        for (let col = 0; col < this.n; col++) {
            if (this.isValidPlacement(row, col)) {
                // Place queen
                this.board[row][col] = true;
                
                // Recursively try to place queens in next rows
                this.solveRecursive(row + 1);
                
                // Backtrack: remove queen
                this.board[row][col] = false;
            }
        }
    }

    /**
     * Check if placing a queen at (row, col) is valid
     * @param row Row position
     * @param col Column position
     * @returns True if placement is valid
     */
    private isValidPlacement(row: number, col: number): boolean {
        // Check column
        for (let r = 0; r < row; r++) {
            if (this.board[r][col]) return false;
        }

        // Check upper-left diagonal
        for (let r = row - 1, c = col - 1; r >= 0 && c >= 0; r--, c--) {
            if (this.board[r][c]) return false;
        }

        // Check upper-right diagonal
        for (let r = row - 1, c = col + 1; r >= 0 && c < this.n; r--, c++) {
            if (this.board[r][c]) return false;
        }

        return true;
    }

    /**
     * Convert board to string representation
     * @returns String representation of the board
     */
    private boardToString(): string[] {
        const result: string[] = [];
        for (let row = 0; row < this.n; row++) {
            let rowStr = '';
            for (let col = 0; col < this.n; col++) {
                rowStr += this.board[row][col] ? 'Q' : '.';
            }
            result.push(rowStr);
        }
        return result;
    }

    /**
     * Get the number of solutions found
     * @returns Number of solutions
     */
    getSolutionCount(): number {
        return this.solutions.length;
    }

    /**
     * Print all solutions in a readable format
     */
    printSolutions(): void {
        console.log(`Found ${this.solutions.length} solutions for ${this.n}-Queens problem:\n`);
        
        this.solutions.forEach((solution, index) => {
            console.log(`Solution ${index + 1}:`);
            solution.forEach(row => {
                console.log(row);
            });
            console.log('');
        });
    }
}

/**
 * CLEAR O(1) N-Queens Solver using Boolean Arrays
 * This makes the optimization concept explicit and easy to understand
 */
class ClearO1NQueensSolver {
    private solutions: string[][] = [];
    private n: number;
    private colOccupied: boolean[];        // Track occupied columns
    private diag1Occupied: boolean[];      // Track occupied diagonals (row + col)
    private diag2Occupied: boolean[];      // Track occupied diagonals (row - col + n - 1)

    constructor(n: number) {
        this.n = n;
        this.colOccupied = new Array(n).fill(false);
        this.diag1Occupied = new Array(2 * n - 1).fill(false);  // row + col can be 0 to 2n-2
        this.diag2Occupied = new Array(2 * n - 1).fill(false);  // row - col + n - 1 can be 0 to 2n-2
    }

    /**
     * Main method to solve N-Queens problem
     * @returns Array of all valid board configurations as strings
     */
    solve(): string[][] {
        this.solutions = [];
        this.solveRecursive(0);
        return this.solutions;
    }

    /**
     * Recursive backtracking method to place queens
     * @param row Current row to place queen
     */
    private solveRecursive(row: number): void {
        // Base case: if we've placed all queens, we have a solution
        if (row === this.n) {
            this.solutions.push(this.createBoardString());
            return;
        }

        // Try placing a queen in each column of the current row
        for (let col = 0; col < this.n; col++) {
            if (this.isValidPlacement(row, col)) {
                // Place queen (update tracking arrays)
                this.colOccupied[col] = true;
                this.diag1Occupied[row + col] = true;
                this.diag2Occupied[row - col + this.n - 1] = true;
                
                // Recursively try to place queens in next rows
                this.solveRecursive(row + 1);
                
                // Backtrack: remove queen (clear tracking arrays)
                this.colOccupied[col] = false;
                this.diag1Occupied[row + col] = false;
                this.diag2Occupied[row - col + this.n - 1] = false;
            }
        }
    }

    /**
     * O(1) check if placing a queen at (row, col) is valid
     * @param row Row position
     * @param col Column position
     * @returns True if placement is valid
     */
    private isValidPlacement(row: number, col: number): boolean {
        // O(1) checks using boolean arrays instead of O(n) loops!
        return !(
            this.colOccupied[col] ||                    // Column occupied?
            this.diag1Occupied[row + col] ||            // Diagonal1 occupied?
            this.diag2Occupied[row - col + this.n - 1]  // Diagonal2 occupied?
        );
    }

    /**
     * Reconstruct board string from tracking arrays
     * @returns String representation of the board
     */
    private createBoardString(): string[] {
        const result: string[] = [];
        for (let row = 0; row < this.n; row++) {
            let rowStr = '';
            for (let col = 0; col < this.n; col++) {
                // Check if there's a queen at this position
                const hasQueen = (
                    this.colOccupied[col] &&
                    this.diag1Occupied[row + col] &&
                    this.diag2Occupied[row - col + this.n - 1]
                );
                rowStr += hasQueen ? 'Q' : '.';
            }
            result.push(rowStr);
        }
        return result;
    }

    /**
     * Get the number of solutions found
     * @returns Number of solutions
     */
    getSolutionCount(): number {
        return this.solutions.length;
    }
}

/**
 * OPTIMIZED N-Queens Solver using Bit Manipulation
 * Much faster for large boards - O(1) validation checks instead of O(n)
 */
class OptimizedNQueensSolver {
    private solutions: string[][] = [];
    private n: number;
    private colMask: number = 0;        // Track occupied columns
    private diag1Mask: number = 0;      // Track occupied diagonals (top-left to bottom-right)
    private diag2Mask: number = 0;      // Track occupied diagonals (top-right to bottom-left)

    constructor(n: number) {
        this.n = n;
    }

    /**
     * Main method to solve N-Queens problem
     * @returns Array of all valid board configurations as strings
     */
    solve(): string[][] {
        this.solutions = [];
        this.colMask = 0;
        this.diag1Mask = 0;
        this.diag2Mask = 0;
        this.solveRecursive(0);
        return this.solutions;
    }

    /**
     * Recursive backtracking method to place queens
     * @param row Current row to place queen
     */
    private solveRecursive(row: number): void {
        // Base case: if we've placed all queens, we have a solution
        if (row === this.n) {
            this.solutions.push(this.createBoardString());
            return;
        }

        // Try placing a queen in each column of the current row
        for (let col = 0; col < this.n; col++) {
            if (this.isValidPlacement(row, col)) {
                // Place queen (update masks)
                this.colMask |= (1 << col);
                this.diag1Mask |= (1 << (row + col));
                this.diag2Mask |= (1 << (row - col + this.n - 1));
                
                // Recursively try to place queens in next rows
                this.solveRecursive(row + 1);
                
                // Backtrack: remove queen (clear masks)
                this.colMask &= ~(1 << col);
                this.diag1Mask &= ~(1 << (row + col));
                this.diag2Mask &= ~(1 << (row - col + this.n - 1));
            }
        }
    }

    /**
     * O(1) check if placing a queen at (row, col) is valid
     * @param row Row position
     * @param col Column position
     * @returns True if placement is valid
     */
    private isValidPlacement(row: number, col: number): boolean {
        // Check column, diagonal1, and diagonal2 using bitwise operations
        return !(
            (this.colMask & (1 << col)) ||           // Column occupied
            (this.diag1Mask & (1 << (row + col))) || // Diagonal1 occupied
            (this.diag2Mask & (1 << (row - col + this.n - 1))) // Diagonal2 occupied
        );
    }

    /**
     * Reconstruct board string from masks (for display purposes)
     * @returns String representation of the board
     */
    private createBoardString(): string[] {
        const result: string[] = [];
        for (let row = 0; row < this.n; row++) {
            let rowStr = '';
            for (let col = 0; col < this.n; col++) {
                // Check if there's a queen at this position
                const hasQueen = (
                    (this.colMask & (1 << col)) &&
                    (this.diag1Mask & (1 << (row + col))) &&
                    (this.diag2Mask & (1 << (row - col + this.n - 1)))
                );
                rowStr += hasQueen ? 'Q' : '.';
            }
            result.push(rowStr);
        }
        return result;
    }

    /**
     * Get the number of solutions found
     * @returns Number of solutions
     */
    getSolutionCount(): number {
        return this.solutions.length;
    }
}

// Example usage and testing
function main() {
    console.log("=== N-Queens Problem Solver ===\n");

    // Test with different board sizes
    const testCases = [4, 5, 6, 8, 12, 14];
    
    testCases.forEach(n => {
        console.log(`\n--- ${n}-Queens Problem ---`);
        
        // Test original solver
        const startTime1 = Date.now();
        const solver = new NQueensSolver(n);
        const solutions = solver.solve();
        const time1 = Date.now() - startTime1;
        
        // Test clear O(1) solver
        const startTime2 = Date.now();
        const clearSolver = new ClearO1NQueensSolver(n);
        const clearSolutions = clearSolver.solve();
        const time2 = Date.now() - startTime2;
        
        // Test optimized solver
        const startTime3 = Date.now();
        const optimizedSolver = new OptimizedNQueensSolver(n);
        const optimizedSolutions = optimizedSolver.solve();
        const time3 = Date.now() - startTime3;
        
        console.log(`Original solver: ${solver.getSolutionCount()} solutions in ${time1}ms`);
        console.log(`Clear O(1) solver: ${clearSolver.getSolutionCount()} solutions in ${time2}ms`);
        console.log(`Bitwise solver: ${optimizedSolver.getSolutionCount()} solutions in ${time3}ms`);
        console.log(`Clear O(1) speedup: ${(time1 / time2).toFixed(2)}x faster`);
        console.log(`Bitwise speedup: ${(time1 / time3).toFixed(2)}x faster`);
        
        if (n <= 6) { // Only print solutions for smaller boards
            solver.printSolutions();
        } else {
            console.log("Solutions not printed (too many for display)");
        }
    });
}

// Run the example
main();
