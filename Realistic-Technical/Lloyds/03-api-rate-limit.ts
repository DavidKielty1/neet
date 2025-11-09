// 🧠 Scenario
// You're monitoring API usage to detect potential automated scraping or credential stuffing attacks.
// Flag users who exceed a rate limit (more than K requests per minute).

// Problem:
// Identify users who made more than K API requests within any 1-minute window.

// Input:
// Array of API request events with userId, endpoint, and timestamp.
// Rate limit threshold K (requests per minute).

// Output:
// Array of flagged user IDs.

// Example:
// Input:
//   requests = [
//     { userId: "u1", endpoint: "/api/data", timestamp: "2025-11-03T10:00:00Z" },
//     { userId: "u1", endpoint: "/api/data", timestamp: "2025-11-03T10:00:15Z" },
//     { userId: "u1", endpoint: "/api/data", timestamp: "2025-11-03T10:00:30Z" },
//     { userId: "u1", endpoint: "/api/data", timestamp: "2025-11-03T10:00:45Z" },
//     { userId: "u2", endpoint: "/api/data", timestamp: "2025-11-03T10:00:00Z" },
//   ]
//   K = 3
// Output: ["u1"]

type ApiRequest = {
  userId: string;
  endpoint: string;
  timestamp: string; // ISO format
};

const apiRequests: ApiRequest[] = [
  { userId: "u1", endpoint: "/api/data", timestamp: "2025-11-03T10:00:00Z" },
  { userId: "u1", endpoint: "/api/data", timestamp: "2025-11-03T10:00:15Z" },
  { userId: "u1", endpoint: "/api/data", timestamp: "2025-11-03T10:00:30Z" },
  { userId: "u1", endpoint: "/api/data", timestamp: "2025-11-03T10:00:45Z" },
  { userId: "u2", endpoint: "/api/data", timestamp: "2025-11-03T10:00:00Z" },
];

function detectRateLimitViolations(requests: ApiRequest[], maxRequestsPerMinute: number): string[] {
    const flaggedUsers = new Set<string>()
    const windowMs = 60 * 1000

    // Create a per-user map <userid: string, time: number>
    const userMap = new Map<string, number[]>()
    requests.map((r) => {
        const time = new Date(r.timestamp).getTime();
        if (!userMap.has(r.userId)) userMap.set(r.userId, []);
        userMap.get(r.userId)!.push(time);
    })

    // for each row per user
    for (const [userId, times] of userMap) {
        times.sort((a, b) => a - b)

        let left = 0
        let requests = 0
        
        for (let right = 0; right < times.length; right++) {
            while (times[right] - times[left] > windowMs) {
                requests--
                left++
            }

            requests++

            if (requests > maxRequestsPerMinute) {
                flaggedUsers.add(userId);
                break;
            }
        }
    }

    // append to return array if over threshold
    return Array.from(flaggedUsers);
}

detectRateLimitViolations(apiRequests, 3);

export { };

