// 🧠 Scenario
// Monitoring database queries or search terms for sensitive keywords can help detect
// potential data theft or unauthorized investigation of confidential information.

// Problem:
// Flag users who search for or query databases using sensitive keywords (e.g., "salary", "confidential", "layoff")
// more than a threshold number of times within a time window.

// Input:
// Array of query events with userId, query string, and timestamp.
// Array of sensitive keywords to monitor.
// Threshold count and time window in hours.

// Output:
// Array of flagged users with the keywords they searched and frequency.

// Example:
// Input:
//   queries = [
//     { userId: "u1", query: "SELECT * FROM employees WHERE salary > 100000", timestamp: "2024-01-01T09:00:00Z" },
//     { userId: "u1", query: "SELECT * FROM confidential_docs", timestamp: "2024-01-01T09:10:00Z" },
//     { userId: "u1", query: "SELECT * FROM layoff_plans", timestamp: "2024-01-01T09:20:00Z" },
//     { userId: "u2", query: "SELECT * FROM public_data", timestamp: "2024-01-01T09:00:00Z" },
//   ]
//   sensitiveKeywords = ["salary", "confidential", "layoff"]
//   threshold = 2
//   windowHours = 24
// Output: [{ userId: "u1", keywordMatches: { "salary": 1, "confidential": 1, "layoff": 1 }, totalCount: 3 }]

type Query = {
  userId: string;
  query: string;
  timestamp: string;
};

type KeywordMatches = {
  [keyword: string]: number;
};

type FlaggedUser = {
  userId: string;
  keywordMatches: KeywordMatches;
  totalCount: number;
};

function detectSensitiveKeywordUsage(
  queries: Query[],
  sensitiveKeywords: string[],
  threshold: number,
  windowHours: number
): FlaggedUser[] {
  // Your implementation here
  return [];
}

// Test case
const queries: Query[] = [
  { userId: "u1", query: "SELECT * FROM employees WHERE salary > 100000", timestamp: "2024-01-01T09:00:00Z" },
  { userId: "u1", query: "SELECT * FROM confidential_docs", timestamp: "2024-01-01T09:10:00Z" },
  { userId: "u1", query: "SELECT * FROM layoff_plans", timestamp: "2024-01-01T09:20:00Z" },
  { userId: "u2", query: "SELECT * FROM public_data", timestamp: "2024-01-01T09:00:00Z" },
];

console.log(detectSensitiveKeywordUsage(queries, ["salary", "confidential", "layoff"], 2, 24));

export { };

