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
  // TODO: Implement solution
  return [];
}

detectRateLimitViolations(apiRequests, 3);

