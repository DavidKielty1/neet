// 🧠 Scenario
// You’re working on an insider risk detection tool that monitors employee logins.
// Given a list of login events, you must identify all users who logged in more than K times within any T-minute window.
// Multiple logins within a short period may suggest suspicious behavior (like automated credential testing or data scraping).

type Login = {
    userId: string;
    timestamp: string; // ISO format
  };

const logins: Login[] = [
{ userId: "u1", timestamp: "2025-11-03T10:00:00Z" },
{ userId: "u1", timestamp: "2025-11-03T10:10:00Z" },
{ userId: "u1", timestamp: "2025-11-03T10:12:00Z" },
{ userId: "u1", timestamp: "2025-11-03T10:18:00Z" },
{ userId: "u2", timestamp: "2025-11-03T11:00:00Z" },
{ userId: "u2", timestamp: "2025-11-03T11:50:00Z" },
{ userId: "u3", timestamp: "2025-11-03T10:00:00Z" },
{ userId: "u3", timestamp: "2025-11-03T10:02:00Z" },
{ userId: "u3", timestamp: "2025-11-03T10:04:00Z" },
{ userId: "u3", timestamp: "2025-11-03T10:06:00Z" },
];


function detectLoginBursts(logins: Login[], threshold: number, windowMinutes: number): string[] {
    const flaggedUsers: string[] = []
    
    // Pre-process: convert timestamps to milliseconds once
    const loginsWithTime = logins.map(login => ({
        userId: login.userId,
        timeMs: new Date(login.timestamp).getTime()
    }));

    // Sort once by timestamp
    const sortedLogins = loginsWithTime.sort((a, b) => a.timeMs - b.timeMs);

    // Map to track count of logins per userId within current window
    const userIdCountMap = new Map<string, number>();
    // Set to track users already added to flaggedUsers to avoid duplicates
    const alreadyFlagged = new Set<string>();

    const windowMs = windowMinutes * 60 * 1000;
    let start = 0;

    for (let end = 0; end < sortedLogins.length; end++) {
        // Remove logins from start that are outside the window
        while (sortedLogins[end].timeMs - sortedLogins[start].timeMs > windowMs) {
            const startUserId = sortedLogins[start].userId;
            const currentCount = userIdCountMap.get(startUserId) || 0;
            
            // Decrement count, remove from map if count reaches 0
            if (currentCount > 1) {
                userIdCountMap.set(startUserId, currentCount - 1);
            } else {
                userIdCountMap.delete(startUserId);
            }
            
            start++;
        }

        // Add current login to window (increment count)
        const currentUserId = sortedLogins[end].userId;
        const currentCount = userIdCountMap.get(currentUserId) || 0;
        userIdCountMap.set(currentUserId, currentCount + 1);

        // Check if this userId now meets threshold and hasn't been flagged yet
        if (userIdCountMap.get(currentUserId)! >= threshold && !alreadyFlagged.has(currentUserId)) {
            flaggedUsers.push(currentUserId);
            alreadyFlagged.add(currentUserId);
        }
    }

    return flaggedUsers
}


detectLoginBursts(logins, 3, 15)