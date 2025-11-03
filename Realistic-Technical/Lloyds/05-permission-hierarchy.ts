// 🧠 Scenario
// You need to check if a user has access to a resource based on their position in the organizational hierarchy.
// Access is granted if the user or any of their managers (up to the root) have the required permission.

// Problem:
// Given a tree structure representing the organizational hierarchy and a map of user permissions,
// determine if a user has access to a specific resource.

// Input:
// - Root node of hierarchy tree (each node has userId, managerId, children)
// - Map of userId -> array of resource permissions
// - Target userId and required resource

// Output:
// Boolean indicating if the user has access (directly or through any manager).

// Example:
// Input:
//   hierarchy (root = CEO):
//     CEO (userId: "ceo")
//       ├─ Manager1 (userId: "m1", managerId: "ceo")
//       │   └─ Employee1 (userId: "e1", managerId: "m1")
//       └─ Manager2 (userId: "m2", managerId: "ceo")
//
//   permissions = {
//     "ceo": ["resource1", "resource2"],
//     "m1": ["resource3"],
//     "e1": ["resource4"],
//   }
//   userId = "e1", resource = "resource1"
// Output: true (e1's manager m1 doesn't have it, but CEO does)

type HierarchyNode = {
  userId: string;
  managerId: string | null;
  children?: HierarchyNode[];
};

type Permissions = {
  [userId: string]: string[];
};

const hierarchy: HierarchyNode = {
  userId: "ceo",
  managerId: null,
  children: [
    {
      userId: "m1",
      managerId: "ceo",
      children: [
        { userId: "e1", managerId: "m1" }
      ]
    },
    {
      userId: "m2",
      managerId: "ceo"
    }
  ]
};

const permissions: Permissions = {
  "ceo": ["resource1", "resource2"],
  "m1": ["resource3"],
  "e1": ["resource4"],
};

function hasAccess(root: HierarchyNode, permissions: Permissions, userId: string, resource: string): boolean {
  // TODO: Implement solution
  return false;
}

hasAccess(hierarchy, permissions, "e1", "resource1");

