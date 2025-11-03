// 🧠 Scenario
// Certain sequences of actions are more suspicious than others.
// For example: login → download multiple files → logout might indicate data exfiltration.
// Detect users who perform a suspicious action sequence.

// Problem:
// Identify users who performed a specific sequence of actions in order within a session.
// Actions must occur in sequence but can have other actions in between.

// Input:
// Array of user actions with userId, action type, and timestamp.
// Target sequence array (e.g., ["LOGIN", "DOWNLOAD", "DOWNLOAD", "LOGOUT"]).

// Output:
// Array of user IDs who performed the suspicious sequence.

// Example:
// Input:
//   actions = [
//     { userId: "u1", action: "LOGIN", timestamp: "2025-11-03T10:00:00Z" },
//     { userId: "u1", action: "DOWNLOAD", timestamp: "2025-11-03T10:05:00Z" },
//     { userId: "u1", action: "READ", timestamp: "2025-11-03T10:10:00Z" },
//     { userId: "u1", action: "DOWNLOAD", timestamp: "2025-11-03T10:15:00Z" },
//     { userId: "u1", action: "LOGOUT", timestamp: "2025-11-03T10:20:00Z" },
//     { userId: "u2", action: "LOGIN", timestamp: "2025-11-03T10:00:00Z" },
//     { userId: "u2", action: "READ", timestamp: "2025-11-03T10:05:00Z" },
//   ]
//   sequence = ["LOGIN", "DOWNLOAD", "DOWNLOAD", "LOGOUT"]
// Output: ["u1"]

type UserAction = {
  userId: string;
  action: "LOGIN" | "LOGOUT" | "READ" | "WRITE" | "DOWNLOAD" | "DELETE";
  timestamp: string; // ISO format
};

const actions: UserAction[] = [
  { userId: "u1", action: "LOGIN", timestamp: "2025-11-03T10:00:00Z" },
  { userId: "u1", action: "DOWNLOAD", timestamp: "2025-11-03T10:05:00Z" },
  { userId: "u1", action: "READ", timestamp: "2025-11-03T10:10:00Z" },
  { userId: "u1", action: "DOWNLOAD", timestamp: "2025-11-03T10:15:00Z" },
  { userId: "u1", action: "LOGOUT", timestamp: "2025-11-03T10:20:00Z" },
  { userId: "u2", action: "LOGIN", timestamp: "2025-11-03T10:00:00Z" },
  { userId: "u2", action: "READ", timestamp: "2025-11-03T10:05:00Z" },
];

function detectSuspiciousSequence(
  actions: UserAction[],
  targetSequence: UserAction["action"][]
): string[] {
  // TODO: Implement solution
  return [];
}

detectSuspiciousSequence(actions, ["LOGIN", "DOWNLOAD", "DOWNLOAD", "LOGOUT"]);

