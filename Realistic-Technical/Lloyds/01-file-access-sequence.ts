// 🧠 Scenario
// You're monitoring file access events to detect suspicious patterns.
// A common insider risk indicator is when a user accesses multiple sensitive files in quick succession.
// Given a sequence of file access events, identify users who accessed more than K different files within any T-minute window.

// Problem:
// Detect users who accessed more than K unique files within any T-minute sliding window.

// Input:
// Array of file access events with userId, filePath, and timestamp.
// Integers K (threshold) and T (window size in minutes).

// Output:
// Array of flagged user IDs.

// Example:
// Input: 
//   events = [
//     { userId: "u1", filePath: "/docs/report1.pdf", timestamp: "2025-11-03T10:00:00Z" },
//     { userId: "u1", filePath: "/docs/report2.pdf", timestamp: "2025-11-03T10:02:00Z" },
//     { userId: "u1", filePath: "/docs/report3.pdf", timestamp: "2025-11-03T10:05:00Z" },
//     { userId: "u2", filePath: "/docs/report1.pdf", timestamp: "2025-11-03T10:00:00Z" },
//     { userId: "u2", filePath: "/docs/report1.pdf", timestamp: "2025-11-03T10:10:00Z" },
//   ]
//   K = 3, T = 10
// Output: ["u1"]

type FileAccess = {
    userId: string;
    filePath: string;
    timestamp: string; // ISO format
  };
  
const fileAccesses: FileAccess[] = [
{ userId: "u1", filePath: "/docs/report1.pdf", timestamp: "2025-11-03T10:00:00Z" },
{ userId: "u1", filePath: "/docs/report2.pdf", timestamp: "2025-11-03T10:02:00Z" },
{ userId: "u1", filePath: "/docs/report3.pdf", timestamp: "2025-11-03T10:05:00Z" },
{ userId: "u2", filePath: "/docs/report1.pdf", timestamp: "2025-11-03T10:00:00Z" },
{ userId: "u2", filePath: "/docs/report1.pdf", timestamp: "2025-11-03T10:10:00Z" },
];
  
function detectSuspiciousFileAccess(accesses: FileAccess[], threshold: number, windowMinutes: number): string[] {
    const windowMs = windowMinutes * 60 * 1000;
    const flagged = new Set<string>();
    
    // Group accesses by userId
    const userMap = new Map<string, { path: string; time: number }[]>();
    for (const a of accesses) {
        const time = new Date(a.timestamp).getTime();
        if (!userMap.has(a.userId)) userMap.set(a.userId, []);
        userMap.get(a.userId)!.push({ path: a.filePath, time });
    }
    
    // Check each user with sliding window
    for (const [userId, events] of userMap) {
        events.sort((a, b) => a.time - b.time);
        let left = 0;
        const fileCount = new Map<string, number>();
        
        for (let right = 0; right < events.length; right++) {
            fileCount.set(events[right].path, (fileCount.get(events[right].path) || 0) + 1);
            
            while (events[right].time - events[left].time > windowMs) {
                const count = fileCount.get(events[left].path)!;
                if (count === 1) fileCount.delete(events[left].path);
                else fileCount.set(events[left].path, count - 1);
                left++;
            }
            
            if (fileCount.size > threshold) {
                flagged.add(userId);
                break;
            }
        }
    }
    
    return Array.from(flagged);
}
  
detectSuspiciousFileAccess(fileAccesses, 3, 10);
  
  