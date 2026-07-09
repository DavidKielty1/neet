// 🧠 Scenario
// Security teams need to identify the most active users to prioritize monitoring efforts.
// Generate a report of the top N users by total activity count.

// Problem:
// Given activity events, return the top N users ranked by total number of activities.

// Input:
// Array of activity events with userId and action type.
// Integer N (number of top users to return).

// Output:
// Array of user IDs sorted by activity count (descending), limited to top N.

// Example:
// Input:
//   activities = [
//     { userId: "u1", action: "READ" },
//     { userId: "u1", action: "WRITE" },
//     { userId: "u1", action: "READ" },
//     { userId: "u2", action: "READ" },
//     { userId: "u3", action: "DELETE" },
//     { userId: "u3", action: "DELETE" },
//     { userId: "u3", action: "DELETE" },
//   ]
//   N = 2
// Output: ["u1", "u3"]  // u1: 3 activities, u3: 3 activities, u2: 1 activity

type Activity = {
  userId: string;
  action: "READ" | "WRITE" | "DELETE" | "DOWNLOAD";
};

const activities: Activity[] = [
  { userId: "u1", action: "READ" },
  { userId: "u1", action: "WRITE" },
  { userId: "u1", action: "READ" },
  { userId: "u2", action: "READ" },
  { userId: "u3", action: "DELETE" },
  { userId: "u3", action: "DELETE" },
  { userId: "u3", action: "DELETE" },
];

function getTopUsersByActivity(activities: Activity[], topN: number): string[] {

  // Create counter map of through all activities
  const userActivityCounter = new Map<string, number>()

  for (const a of activities) {
    userActivityCounter.set(a.userId, (userActivityCounter.get(a.userId) || 0) + 1);
  }

  // sort array from map by userId
  const sortedCountArray = Array.from(userActivityCounter.entries())
    .sort((a, b) => b[1] - a[1])

  console.log('sortedCountArray:', sortedCountArray)

  // slice, map, take first element from array elements
  const topUsers = sortedCountArray.slice(0, topN).map(([userId]) => userId);

  return topUsers;
}

getTopUsersByActivity(activities, 2);

export { };

