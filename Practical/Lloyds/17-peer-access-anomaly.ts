// 🧠 Scenario
// Users accessing colleagues' data or resources can indicate snooping or social engineering.
// This is particularly suspicious when accessing data of peers in other departments.

// Problem:
// Detect users who access resources or data belonging to colleagues, especially:
// - Accessing data from users in different departments
// - Accessing subordinate or manager data
// - Repeated access to the same colleague's resources
// - Accessing recently terminated employees' data

// Input:
// Array of access events with userId, targetUserId (whose data is accessed), department, timestamp.
// Array of user relationships (department, manager, direct reports).

// Output:
// Array of flagged users with details of suspicious peer access.

// Example:
// Input:
//   accesses = [
//     { userId: "u1", targetUserId: "u2", resourceType: "documents", timestamp: "2024-01-01T10:00:00Z" },
//     { userId: "u1", targetUserId: "u3", resourceType: "emails", timestamp: "2024-01-01T10:30:00Z" },
//     { userId: "u1", targetUserId: "u3", resourceType: "files", timestamp: "2024-01-01T11:00:00Z" },
//   ]
//   relationships = [
//     { userId: "u1", department: "IT", managerId: null },
//     { userId: "u2", department: "HR", managerId: null },
//     { userId: "u3", department: "Finance", managerId: null },
//   ]
// Output: [{ userId: "u1", crossDepartmentAccess: 2, targetUsers: ["u2", "u3"], departments: ["HR", "Finance"] }]

type PeerAccess = {
  userId: string;
  targetUserId: string;
  resourceType: string;
  timestamp: string;
};

type UserRelationship = {
  userId: string;
  department: string;
  managerId: string | null;
  directReports?: string[];
};

type FlaggedUser = {
  userId: string;
  crossDepartmentAccess: number;
  targetUsers: string[];
  departments: string[];
  repeatedTargets: string[]; // Users accessed more than once
};

function detectPeerAccessAnomaly(
  accesses: PeerAccess[],
  relationships: UserRelationship[]
): FlaggedUser[] {
  // Your implementation here
  return [];
}

// Test case
const accesses: PeerAccess[] = [
  { userId: "u1", targetUserId: "u2", resourceType: "documents", timestamp: "2024-01-01T10:00:00Z" },
  { userId: "u1", targetUserId: "u3", resourceType: "emails", timestamp: "2024-01-01T10:30:00Z" },
  { userId: "u1", targetUserId: "u3", resourceType: "files", timestamp: "2024-01-01T11:00:00Z" },
];

const relationships: UserRelationship[] = [
  { userId: "u1", department: "IT", managerId: null },
  { userId: "u2", department: "HR", managerId: null },
  { userId: "u3", department: "Finance", managerId: null },
];

console.log(detectPeerAccessAnomaly(accesses, relationships));

export { };

