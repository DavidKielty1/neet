// 🧠 Scenario
// Insider threats may attempt to gain unauthorized access by escalating their privileges.
// Detect unusual permission changes or access to resources above a user's normal role.

// Problem:
// Flag users who attempt to access resources that require permissions higher than their assigned role level,
// or users whose permissions were recently elevated and then immediately access sensitive resources.

// Input:
// Array of access attempts with userId, resourceId, requiredPermissionLevel, timestamp.
// Array of user role assignments with userId, roleLevel, and timestamp of role change.

// Output:
// Array of flagged users with details of unauthorized access attempts.

// Example:
// Input:
//   accessAttempts = [
//     { userId: "u1", resourceId: "r1", requiredPermissionLevel: 3, timestamp: "2024-01-01T10:00:00Z" },
//     { userId: "u1", resourceId: "r2", requiredPermissionLevel: 5, timestamp: "2024-01-01T10:05:00Z" }, // Exceeds level 3
//     { userId: "u2", resourceId: "r3", requiredPermissionLevel: 2, timestamp: "2024-01-01T10:00:00Z" },
//   ]
//   userRoles = [
//     { userId: "u1", roleLevel: 3, changedAt: "2024-01-01T08:00:00Z" },
//     { userId: "u2", roleLevel: 4, changedAt: "2024-01-01T08:00:00Z" },
//   ]
// Output: [{ userId: "u1", unauthorizedAccess: [{ resourceId: "r2", requiredLevel: 5, userLevel: 3 }] }]

type AccessAttempt = {
  userId: string;
  resourceId: string;
  requiredPermissionLevel: number;
  timestamp: string;
};

type UserRole = {
  userId: string;
  roleLevel: number;
  changedAt: string;
};

type UnauthorizedAccess = {
  resourceId: string;
  requiredLevel: number;
  userLevel: number;
  timestamp: string;
};

type FlaggedUser = {
  userId: string;
  unauthorizedAccess: UnauthorizedAccess[];
};

function detectPrivilegeEscalation(
  accessAttempts: AccessAttempt[],
  userRoles: UserRole[]
): FlaggedUser[] {
  // Your implementation here
  return [];
}

// Test case
const accessAttempts: AccessAttempt[] = [
  { userId: "u1", resourceId: "r1", requiredPermissionLevel: 3, timestamp: "2024-01-01T10:00:00Z" },
  { userId: "u1", resourceId: "r2", requiredPermissionLevel: 5, timestamp: "2024-01-01T10:05:00Z" },
  { userId: "u2", resourceId: "r3", requiredPermissionLevel: 2, timestamp: "2024-01-01T10:00:00Z" },
];

const userRoles: UserRole[] = [
  { userId: "u1", roleLevel: 3, changedAt: "2024-01-01T08:00:00Z" },
  { userId: "u2", roleLevel: 4, changedAt: "2024-01-01T08:00:00Z" },
];

console.log(detectPrivilegeEscalation(accessAttempts, userRoles));

export { };

