// 🧠 Scenario
// Employees who are about to leave the organization may attempt to access or download
// sensitive data before their departure. This is a critical insider risk pattern.

// Problem:
// Detect users who have significantly increased their data access or downloads in the period
// before their resignation date. Flag suspicious patterns like accessing competitor information
// or customer databases they don't normally access.

// Input:
// Array of access events with userId, resourceId, resourceType, timestamp, and accessType (view/download).
// Array of resignation notices with userId and resignationDate.
// Lookback period in days before resignation to analyze.

// Output:
// Array of flagged users with their access patterns and comparison to their baseline.

// Example:
// Input:
//   accessEvents = [
//     { userId: "u1", resourceId: "r1", resourceType: "customer_db", timestamp: "2024-01-15T10:00:00Z", accessType: "download" },
//     { userId: "u1", resourceId: "r2", resourceType: "customer_db", timestamp: "2024-01-15T10:30:00Z", accessType: "download" },
//     { userId: "u1", resourceId: "r3", resourceType: "financial", timestamp: "2024-01-15T11:00:00Z", accessType: "download" },
//     { userId: "u2", resourceId: "r4", resourceType: "public", timestamp: "2024-01-15T10:00:00Z", accessType: "view" },
//   ]
//   resignations = [
//     { userId: "u1", resignationDate: "2024-01-20T00:00:00Z", noticeGivenDate: "2024-01-10T00:00:00Z" },
//   ]
//   lookbackDays = 14
// Output: [{ userId: "u1", accessCount: 3, suspiciousResources: ["customer_db", "financial"] }]

type AccessEvent = {
  userId: string;
  resourceId: string;
  resourceType: string;
  timestamp: string;
  accessType: "view" | "download";
};

type Resignation = {
  userId: string;
  resignationDate: string;
  noticeGivenDate: string;
};

type FlaggedUser = {
  userId: string;
  accessCount: number;
  downloadCount: number;
  suspiciousResources: string[];
  daysUntilResignation: number;
};

function detectAccessBeforeResignation(
  accessEvents: AccessEvent[],
  resignations: Resignation[],
  lookbackDays: number
): FlaggedUser[] {
  // Your implementation here
  return [];
}

// Test case
const accessEvents: AccessEvent[] = [
  { userId: "u1", resourceId: "r1", resourceType: "customer_db", timestamp: "2024-01-15T10:00:00Z", accessType: "download" },
  { userId: "u1", resourceId: "r2", resourceType: "customer_db", timestamp: "2024-01-15T10:30:00Z", accessType: "download" },
  { userId: "u1", resourceId: "r3", resourceType: "financial", timestamp: "2024-01-15T11:00:00Z", accessType: "download" },
  { userId: "u2", resourceId: "r4", resourceType: "public", timestamp: "2024-01-15T10:00:00Z", accessType: "view" },
];

const resignations: Resignation[] = [
  { userId: "u1", resignationDate: "2024-01-20T00:00:00Z", noticeGivenDate: "2024-01-10T00:00:00Z" },
];

console.log(detectAccessBeforeResignation(accessEvents, resignations, 14));

export { };

