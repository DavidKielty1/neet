// 🧠 Scenario
// Monitoring file download patterns is critical for detecting data exfiltration.
// Flag users who download more than K files within a short time period.

// Problem:
// Detect users who downloaded more than K files within any T-minute window.

// Input:
// Array of download events with userId, fileName, fileSize, and timestamp.
// Threshold K and window size T in minutes.

// Output:
// Array of flagged user IDs.

// Example:
// Input:
//   downloads = [
//     { userId: "u1", fileName: "file1.pdf", fileSize: 1024, timestamp: "2025-11-03T10:00:00Z" },
//     { userId: "u1", fileName: "file2.pdf", fileSize: 2048, timestamp: "2025-11-03T10:05:00Z" },
//     { userId: "u1", fileName: "file3.pdf", fileSize: 3072, timestamp: "2025-11-03T10:10:00Z" },
//     { userId: "u1", fileName: "file4.pdf", fileSize: 4096, timestamp: "2025-11-03T10:12:00Z" },
//     { userId: "u2", fileName: "file1.pdf", fileSize: 1024, timestamp: "2025-11-03T10:00:00Z" },
//   ]
//   K = 3, T = 15
// Output: ["u1"]

type Download = {
  userId: string;
  fileName: string;
  fileSize: number;
  timestamp: string; // ISO format
};

const downloads: Download[] = [
  { userId: "u1", fileName: "file1.pdf", fileSize: 1024, timestamp: "2025-11-03T10:00:00Z" },
  { userId: "u1", fileName: "file2.pdf", fileSize: 2048, timestamp: "2025-11-03T10:05:00Z" },
  { userId: "u1", fileName: "file3.pdf", fileSize: 3072, timestamp: "2025-11-03T10:10:00Z" },
  { userId: "u1", fileName: "file4.pdf", fileSize: 4096, timestamp: "2025-11-03T10:12:00Z" },
  { userId: "u2", fileName: "file1.pdf", fileSize: 1024, timestamp: "2025-11-03T10:00:00Z" },
];

function detectDownloadBursts(downloads: Download[], threshold: number, windowMinutes: number): string[] {
  // TODO: Implement solution
  return [];
}

detectDownloadBursts(downloads, 3, 15);

