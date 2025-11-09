// 🧠 Scenario
// Unusual database queries can indicate data reconnaissance or exfiltration attempts.
// Detect queries that are abnormal based on volume, time, or pattern.

// Problem:
// Flag users whose database queries deviate from their normal patterns:
// - Query volume exceeds typical baseline by a threshold percentage
// - Queries executed during unusual hours (outside business hours)
// - Large result sets returned (potential bulk data extraction)
// - Unusual table combinations accessed together

// Input:
// Array of query events with userId, timestamp, resultSetSize, executionTime, and tables accessed.
// User baseline data with typical query count, average result size, and usual hours.

// Output:
// Array of flagged users with anomaly details.

// Example:
// Input:
//   queries = [
//     { userId: "u1", timestamp: "2024-01-01T23:00:00Z", resultSetSize: 50000, executionTime: 120, tables: ["customers", "transactions"] },
//     { userId: "u1", timestamp: "2024-01-01T23:30:00Z", resultSetSize: 45000, executionTime: 110, tables: ["accounts"] },
//     { userId: "u2", timestamp: "2024-01-01T10:00:00Z", resultSetSize: 100, executionTime: 5, tables: ["products"] },
//   ]
//   baselines = [
//     { userId: "u1", avgQueriesPerDay: 10, avgResultSize: 500, usualHoursStart: 9, usualHoursEnd: 17 },
//     { userId: "u2", avgQueriesPerDay: 5, avgResultSize: 200, usualHoursStart: 9, usualHoursEnd: 17 },
//   ]
// Output: [{ userId: "u1", anomalies: ["after_hours", "large_result_set"], totalResultSize: 95000 }]

type QueryEvent = {
  userId: string;
  timestamp: string;
  resultSetSize: number;
  executionTime: number;
  tables: string[];
};

type UserBaseline = {
  userId: string;
  avgQueriesPerDay: number;
  avgResultSize: number;
  usualHoursStart: number; // 0-23
  usualHoursEnd: number; // 0-23
};

type Anomaly = "after_hours" | "large_result_set" | "high_volume" | "unusual_tables";

type FlaggedUser = {
  userId: string;
  anomalies: Anomaly[];
  queryCount: number;
  totalResultSize: number;
};

function detectDatabaseQueryAnomalies(
  queries: QueryEvent[],
  baselines: UserBaseline[],
  resultSizeThreshold: number = 10000
): FlaggedUser[] {
  // Your implementation here
  return [];
}

// Test case
const queries: QueryEvent[] = [
  { userId: "u1", timestamp: "2024-01-01T23:00:00Z", resultSetSize: 50000, executionTime: 120, tables: ["customers", "transactions"] },
  { userId: "u1", timestamp: "2024-01-01T23:30:00Z", resultSetSize: 45000, executionTime: 110, tables: ["accounts"] },
  { userId: "u2", timestamp: "2024-01-01T10:00:00Z", resultSetSize: 100, executionTime: 5, tables: ["products"] },
];

const baselines: UserBaseline[] = [
  { userId: "u1", avgQueriesPerDay: 10, avgResultSize: 500, usualHoursStart: 9, usualHoursEnd: 17 },
  { userId: "u2", avgQueriesPerDay: 5, avgResultSize: 200, usualHoursStart: 9, usualHoursEnd: 17 },
];

console.log(detectDatabaseQueryAnomalies(queries, baselines));

export { };

