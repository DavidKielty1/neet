// 🧠 Scenario
// Users accessing systems from multiple locations simultaneously may indicate credential sharing
// or account compromise. This is especially suspicious when:
// 1. Sessions overlap from different locations
// 2. Locations are geographically far apart (impossible travel)
// 3. Multiple concurrent sessions exist (>2 locations)
// 4. Sessions lack proper logout events (orphaned sessions)

// Problem:
// Detect users with suspicious concurrent session patterns:
// - Track active sessions by pairing login/logout events
// - Detect overlapping sessions from different locations
// - Calculate if travel between locations is "impossible" (within time threshold)
// - Handle missing logout events (assume timeout after 4 hours)
// - Flag users with 2+ concurrent sessions from different locations

// Input:
// Array of session events with userId, timestamp, location (city), action (login/logout), and IP address.
// Session timeout in hours (default 4 hours if no logout).
// Approximate distances between cities (in km).

// Output:
// Array of objects with userId, concurrent sessions details, and violation type.

// Example:
// Input:
//   sessions = [
//     { userId: "u1", timestamp: "2024-01-01T09:00:00Z", location: "London", action: "login", ip: "192.168.1.1" },
//     { userId: "u1", timestamp: "2024-01-01T09:15:00Z", location: "New York", action: "login", ip: "10.0.0.1" }, // Concurrent + Impossible travel!
//     { userId: "u1", timestamp: "2024-01-01T10:00:00Z", location: "London", action: "logout", ip: "192.168.1.1" },
//     { userId: "u1", timestamp: "2024-01-01T10:30:00Z", location: "New York", action: "logout", ip: "10.0.0.1" },
//     { userId: "u2", timestamp: "2024-01-01T09:00:00Z", location: "Leeds", action: "login", ip: "172.16.0.1" },
//     { userId: "u3", timestamp: "2024-01-01T09:00:00Z", location: "Paris", action: "login", ip: "10.0.0.2" },
//     { userId: "u3", timestamp: "2024-01-01T09:30:00Z", location: "Berlin", action: "login", ip: "10.0.0.3" },
//     { userId: "u3", timestamp: "2024-01-01T09:45:00Z", location: "Madrid", action: "login", ip: "10.0.0.4" }, // 3 concurrent!
//   ]
//   cityDistances = { "London-New York": 5570, "Paris-Berlin": 878, "Paris-Madrid": 1054, "Berlin-Madrid": 1871 }
//   sessionTimeoutHours = 4
// Output: [
//   { 
//     userId: "u1", 
//     violationType: "concurrent_and_impossible_travel",
//     maxConcurrentSessions: 2,
//     sessions: [
//       { location: "London", ip: "192.168.1.1", loginTime: "...", logoutTime: "..." },
//       { location: "New York", ip: "10.0.0.1", loginTime: "...", logoutTime: "..." }
//     ],
//     impossibleTravel: { from: "London", to: "New York", distanceKm: 5570, timeMinutes: 15 }
//   },
//   {
//     userId: "u3",
//     violationType: "multiple_concurrent",
//     maxConcurrentSessions: 3,
//     sessions: [...]
//   }
// ]

type Session = {
  userId: string;
  timestamp: string;
  location: string;
  action: "login" | "logout";
  ip: string;
};

type ActiveSession = {
  location: string;
  ip: string;
  loginTime: number;
  logoutTime: number | null;
};

type ImpossibleTravel = {
  from: string;
  to: string;
  distanceKm: number;
  timeMinutes: number;
};

type SuspiciousUser = {
  userId: string;
  violationType: "concurrent_sessions" | "impossible_travel" | "concurrent_and_impossible_travel" | "multiple_concurrent";
  maxConcurrentSessions: number;
  sessions: Array<{
    location: string;
    ip: string;
    loginTime: string;
    logoutTime: string | null;
  }>;
  impossibleTravel?: ImpossibleTravel;
};

type CityDistances = {
  [key: string]: number; // "City1-City2": distanceInKm
};

function detectConcurrentSessions(
  sessions: Session[],
  cityDistances: CityDistances,
  sessionTimeoutHours: number = 4
): SuspiciousUser[] {
  const SuspiciousUsers = []

  // Hints:
  // 1. Group sessions by userId
  const userActivityMap = new Map()
  for (const s of sessions) {
    const time = new Date(s.timestamp).getTime();
    if (!userActivityMap.has(s.userId)) userActivityMap.set(s.userId, {});
    userActivityMap.get(s.userId)!.push({time, location: s.location, action: s.action, ip: s.ip})
  }

  for (const [userId, activities] of userActivityMap) {
    // 2. Sort by timestamp
    activities.sort((a, b) => a.time - b.time)

  }

  // 3. Build active sessions: pair login/logout events, handle missing logouts with timeout
  // 4. Find time periods where 2+ sessions overlap from different locations
  // 5. Check for impossible travel: calculate if distance/time ratio exceeds reasonable speed (e.g., 900 km/h for plane)
  // 6. Return flagged users with detailed violation information
  
  return SuspiciousUsers;
}

// Helper function to calculate if travel is impossible
function isImpossibleTravel(
  distanceKm: number,
  timeMinutes: number,
  maxSpeedKmh: number = 900 // Max commercial flight speed
): boolean {
  const timeHours = timeMinutes / 60;
  const requiredSpeed = distanceKm / timeHours;
  return requiredSpeed > maxSpeedKmh;
}

// Helper to get distance between cities (handles both "A-B" and "B-A")
function getDistance(city1: string, city2: string, distances: CityDistances): number {
  const key1 = `${city1}-${city2}`;
  const key2 = `${city2}-${city1}`;
  return distances[key1] ?? distances[key2] ?? 0;
}

// Test case 1: Basic concurrent sessions with impossible travel
const sessions1: Session[] = [
  { userId: "u1", timestamp: "2024-01-01T09:00:00Z", location: "London", action: "login", ip: "192.168.1.1" },
  { userId: "u1", timestamp: "2024-01-01T09:15:00Z", location: "New York", action: "login", ip: "10.0.0.1" },
  { userId: "u1", timestamp: "2024-01-01T10:00:00Z", location: "London", action: "logout", ip: "192.168.1.1" },
  { userId: "u1", timestamp: "2024-01-01T10:30:00Z", location: "New York", action: "logout", ip: "10.0.0.1" },
  { userId: "u2", timestamp: "2024-01-01T09:00:00Z", location: "Leeds", action: "login", ip: "172.16.0.1" },
];

// Test case 2: Multiple concurrent sessions (3 locations)
const sessions2: Session[] = [
  { userId: "u3", timestamp: "2024-01-01T09:00:00Z", location: "Paris", action: "login", ip: "10.0.0.2" },
  { userId: "u3", timestamp: "2024-01-01T09:30:00Z", location: "Berlin", action: "login", ip: "10.0.0.3" },
  { userId: "u3", timestamp: "2024-01-01T09:45:00Z", location: "Madrid", action: "login", ip: "10.0.0.4" },
  { userId: "u3", timestamp: "2024-01-01T10:30:00Z", location: "Paris", action: "logout", ip: "10.0.0.2" },
  { userId: "u3", timestamp: "2024-01-01T11:00:00Z", location: "Berlin", action: "logout", ip: "10.0.0.3" },
  { userId: "u3", timestamp: "2024-01-01T11:30:00Z", location: "Madrid", action: "logout", ip: "10.0.0.4" },
];

// Test case 3: Missing logout (orphaned session)
const sessions3: Session[] = [
  { userId: "u4", timestamp: "2024-01-01T09:00:00Z", location: "Tokyo", action: "login", ip: "10.0.0.5" },
  { userId: "u4", timestamp: "2024-01-01T09:30:00Z", location: "Sydney", action: "login", ip: "10.0.0.6" },
  // No logout for Tokyo - should timeout after 4 hours
];

const cityDistances: CityDistances = {
  "London-New York": 5570,
  "Paris-Berlin": 878,
  "Paris-Madrid": 1054,
  "Berlin-Madrid": 1871,
  "Tokyo-Sydney": 7800,
};

console.log("Test 1 - Impossible travel:", detectConcurrentSessions(sessions1, cityDistances));
console.log("Test 2 - Multiple concurrent:", detectConcurrentSessions(sessions2, cityDistances));
console.log("Test 3 - Orphaned sessions:", detectConcurrentSessions(sessions3, cityDistances));

export { };

