// 🧠 Scenario
// Path traversal attacks attempt to access files outside intended directories.
// Detect suspicious file access patterns that might indicate unauthorized directory navigation.

// Problem:
// Flag users who accessed files matching a suspicious path pattern (e.g., paths containing "..", "/etc/", or accessing files outside their department folder).

// Input:
// Array of file access events with userId and filePath.
// Array of suspicious patterns (strings or regex patterns).

// Output:
// Array of flagged user IDs.

// Example:
// Input:
//   accesses = [
//     { userId: "u1", filePath: "/users/u1/reports/data.pdf" },
//     { userId: "u1", filePath: "/users/u1/../../etc/passwd" }, // Suspicious
//     { userId: "u2", filePath: "/users/u2/reports/data.pdf" },
//     { userId: "u3", filePath: "/users/../admin/config.json" }, // Suspicious
//   ]
//   patterns = ["..", "/etc/", "/admin/"]
// Output: ["u1", "u3"]

type FileAccess = {
  userId: string;
  filePath: string;
};

const fileAccesses: FileAccess[] = [
  { userId: "u1", filePath: "/users/u1/reports/data.pdf" },
  { userId: "u1", filePath: "/users/u1/../../etc/passwd" },
  { userId: "u2", filePath: "/users/u2/reports/data.pdf" },
  { userId: "u3", filePath: "/users/../admin/config.json" },
];

function detectSuspiciousPaths(accesses: FileAccess[], suspiciousPatterns: string[]): string[] {
  // TODO: Implement solution
  return [];
}

detectSuspiciousPaths(fileAccesses, ["..", "/etc/", "/admin/"]);

