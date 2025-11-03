// 🧠 Scenario
// You're building a system to monitor high-value financial transactions.
// Flag users who make transactions totaling more than £X within any T-hour window.
// This helps detect potential data exfiltration or unauthorized transfers.

// Problem:
// Given transaction events, identify users whose total transaction amount exceeds a threshold within any sliding time window.

// Input:
// Array of transactions with userId, amount, and timestamp.
// Threshold amount (maxAmount) and window size in hours (windowHours).

// Output:
// Array of flagged user IDs.

// Example:
// Input:
//   transactions = [
//     { userId: "u1", amount: 5000, timestamp: "2025-11-03T10:00:00Z" },
//     { userId: "u1", amount: 3000, timestamp: "2025-11-03T10:30:00Z" },
//     { userId: "u1", amount: 2000, timestamp: "2025-11-03T11:00:00Z" },
//     { userId: "u2", amount: 4000, timestamp: "2025-11-03T10:00:00Z" },
//   ]
//   maxAmount = 10000, windowHours = 1
// Output: ["u1"]  // u1 has 10000 total within 1 hour

type Transaction = {
  userId: string;
  amount: number;
  timestamp: string; // ISO format
};

const transactions: Transaction[] = [
  { userId: "u1", amount: 5000, timestamp: "2025-11-03T10:00:00Z" },
  { userId: "u1", amount: 3000, timestamp: "2025-11-03T10:30:00Z" },
  { userId: "u1", amount: 2000, timestamp: "2025-11-03T11:00:00Z" },
  { userId: "u2", amount: 4000, timestamp: "2025-11-03T10:00:00Z" },
];

function detectHighValueTransactions(transactions: Transaction[], maxAmount: number, windowHours: number): string[] {
  // TODO: Implement solution
  return [];
}

detectHighValueTransactions(transactions, 10000, 1);

