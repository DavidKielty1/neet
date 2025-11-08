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

type FileAccessd = {
  userId: string;
  filePath: string;
  timestamp: string; // ISO format
};

const fileAccessesd: FileAccessd[] = [
  { userId: "u1", filePath: "/sensitive/data1.pdf", timestamp: "2025-11-03T10:00:00Z" },
  { userId: "u1", filePath: "/sensitive/data1.pdf", timestamp: "2025-11-03T10:30:00Z" },
  { userId: "u1", filePath: "/sensitive/data1.pdf", timestamp: "2025-11-03T11:00:00Z" },
  { userId: "u1", filePath: "/sensitive/data1.pdf", timestamp: "2025-11-03T12:00:00Z" },
  { userId: "u2", filePath: "/sensitive/data2.pdf", timestamp: "2025-11-03T10:00:00Z" },
];

function createUserActivityMap(accesses: FileAccessd[]): Map<string, {file: string, time: number}[]> {
  const userActivity = new Map<string, {file: string, time: number}[]>()

  for (const a of accesses) {
    const time = new Date(a.timestamp).getTime();
    if (!userActivity.has(a.userId)) {
      userActivity.set(a.userId, [])
    }
    userActivity.get(a.userId)!.push({file: a.filePath, time})
  }

  return userActivity;
}

function detectDuplicateFileAccess(accesses: FileAccessd[], maxAccessesPerDay: number): { [userId: string]: string[] } {
  const windowMs = 1 * 24 * 60 * 60 * 1000 
  const flaggedUsersActivity = new Map<string, string[]>()

  // create usermap function
  const userActivity = createUserActivityMap(accesses)

  // for userid, records[]
  for (const [userId, records] of userActivity) {


    const accessCounter = new Map<string, number>()
    records.sort((a, b) => a.time - b.time)

    let left = 0
    for (let right = 0; right < records.length; right++) {
      while (records[right].time - records[left].time > windowMs) {
        const leftFile = records[left].file
        const leftCount = accessCounter.get(leftFile) || 0;
        if (leftCount === 1) {accessCounter.delete(leftFile)}
        else accessCounter.set(leftFile, leftCount - 1);
        left++
      }

      const rightFile = records[right].file
      accessCounter.set(rightFile, (accessCounter.get(rightFile) || 0) + 1)

      if (accessCounter.get(rightFile)! > maxAccessesPerDay) {
        if (!flaggedUsersActivity.has(userId)) {
          flaggedUsersActivity.set(userId, [])
        }
        if (!flaggedUsersActivity.get(userId)!.includes(rightFile)) {
          flaggedUsersActivity.get(userId)!.push(rightFile)
        }        
      }
    }
  }

  return Object.fromEntries(flaggedUsersActivity);
}

detectDuplicateFileAccess(fileAccessesd, 3);

