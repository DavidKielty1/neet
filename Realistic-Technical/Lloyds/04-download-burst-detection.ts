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
  // threshold > 3 separate files over 15 minutes
  const flaggedUsers = new Set<string>()
  const windowMs = windowMinutes * 60 * 1000

  // create userMap with {file: str, time: number}
  const userMap = new Map<string, {file: string, time: number}[]>()
  for (const d of downloads) {
      const time = new Date(d.timestamp).getTime()
      if (!userMap.has(d.userId)) userMap.set(d.userId, []);
      userMap.get(d.userId)!.push({file: d.fileName, time});
  }

  // go over map per user
  for (const [userId, downloads] of userMap) {
      downloads.sort((a, b) => a.time - b.time);

      let left = 0
      const fileCounter = new Map<string, number>()

      for (let right = 0; right < downloads.length; right++) {
          // window - while left/right pointer times exceed windowMinutes: left++, decrement/delete file
          while (downloads[right].time - downloads[left].time > windowMs) {
              const leftFile = downloads[left].file;
              const count = fileCounter.get(leftFile) || 0

              if (count === 1) {
                  fileCounter.delete(leftFile)
              } else {
                  fileCounter.set(leftFile, count - 1)
              }
              left++
          }

          const rightFile = downloads[right].file;
          fileCounter.set(rightFile, (fileCounter.get(rightFile) || 0) + 1);
    
          if (fileCounter.size > threshold) {
              flaggedUsers.add(userId)
              break;
          }
      }
  }

  // return array from flaggedUser set
  return Array.from(flaggedUsers);
}

detectDownloadBursts(downloads, 3, 15);

