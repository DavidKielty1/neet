// 🧠 Scenario
// Repeated access to the same sensitive file can indicate data collection or exfiltration attempts.
// Flag users who accessed the same file more than K times within a day.

// Problem:
// Detect users who accessed the same filePath more than K times within a 24-hour period.

// Input:
// Array of file access events with userId, filePath, and timestamp.
// Threshold K (maximum allowed accesses per file per day).

// Output:
// Map of userId -> array of filePaths that were accessed too frequently.

// Example:
// Input:
//   accesses = [
//     { userId: "u1", filePath: "/sensitive/data1.pdf", timestamp: "2025-11-03T10:00:00Z" },
//     { userId: "u1", filePath: "/sensitive/data1.pdf", timestamp: "2025-11-03T10:30:00Z" },
//     { userId: "u1", filePath: "/sensitive/data1.pdf", timestamp: "2025-11-03T11:00:00Z" },
//     { userId: "u1", filePath: "/sensitive/data1.pdf", timestamp: "2025-11-03T12:00:00Z" },
//     { userId: "u2", filePath: "/sensitive/data2.pdf", timestamp: "2025-11-03T10:00:00Z" },
//   ]
//   K = 3
// Output: { "u1": ["/sensitive/data1.pdf"] }

type FileAccess = {
  userId: string;
  filePath: string;
  timestamp: string; // ISO format
};

const fileAccesses: FileAccess[] = [
  { userId: "u1", filePath: "/sensitive/data1.pdf", timestamp: "2025-11-03T10:00:00Z" },
  { userId: "u1", filePath: "/sensitive/data1.pdf", timestamp: "2025-11-03T10:30:00Z" },
  { userId: "u1", filePath: "/sensitive/data1.pdf", timestamp: "2025-11-03T11:00:00Z" },
  { userId: "u1", filePath: "/sensitive/data1.pdf", timestamp: "2025-11-03T12:00:00Z" },
  { userId: "u2", filePath: "/sensitive/data2.pdf", timestamp: "2025-11-03T10:00:00Z" },
];

function detectDuplicateFileAccess(accesses: FileAccess[], maxAccessesPerDay: number): { [userId: string]: string[] } {
  // TODO: Implement solution
  return {};
}

detectDuplicateFileAccess(fileAccesses, 3);

