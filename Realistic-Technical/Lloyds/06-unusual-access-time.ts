// 🧠 Scenario
// Unusual access times (e.g., after hours, weekends) can indicate suspicious activity.
// Flag users who access resources during non-business hours more than K times.

// Problem:
// Identify users who accessed resources outside business hours (e.g., before 9 AM, after 5 PM, or on weekends) more than K times.

// Input:
// Array of access events with userId, resource, and timestamp.
// Business hours (startHour, endHour) and threshold K.

// Output:
// Array of flagged user IDs.

// Example:
// Input:
//   accesses = [
//     { userId: "u1", resource: "/data/reports", timestamp: "2025-11-03T08:00:00Z" }, // Before 9 AM
//     { userId: "u1", resource: "/data/reports", timestamp: "2025-11-03T18:00:00Z" }, // After 5 PM
//     { userId: "u1", resource: "/data/reports", timestamp: "2025-11-04T20:00:00Z" }, // After hours
//     { userId: "u2", resource: "/data/reports", timestamp: "2025-11-03T10:00:00Z" }, // Normal hours
//   ]
//   startHour = 9, endHour = 17, K = 2
// Output: ["u1"]

type AccessEvent = {
  userId: string;
  resource: string;
  timestamp: string; // ISO format
};

const accesses: AccessEvent[] = [
  { userId: "u1", resource: "/data/reports", timestamp: "2025-11-03T08:00:00Z" },
  { userId: "u1", resource: "/data/reports", timestamp: "2025-11-03T18:00:00Z" },
  { userId: "u1", resource: "/data/reports", timestamp: "2025-11-04T20:00:00Z" },
  { userId: "u2", resource: "/data/reports", timestamp: "2025-11-03T10:00:00Z" },
];

function detectUnusualAccessTimes(
  accesses: AccessEvent[],
  startHour: number,
  endHour: number,
  threshold: number
): string[] {
  // TODO: Implement solution
  return [];
}

detectUnusualAccessTimes(accesses, 9, 17, 2);

