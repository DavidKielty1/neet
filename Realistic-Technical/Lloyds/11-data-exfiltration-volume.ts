// 🧠 Scenario
// Insider threats often involve large data transfers before leaving the organization.
// Detect users who are downloading or uploading unusually large volumes of data.

// Problem:
// Flag users whose total data transfer (download + upload) exceeds a threshold within a time window,
// or whose transfer volume is significantly higher than their historical baseline.

// Input:
// Array of data transfer events with userId, timestamp, bytes, and direction (upload/download).
// Threshold in bytes for flagging.
// Time window in hours.

// Output:
// Array of flagged user IDs with their total transfer volume.

// Example:
// Input:
//   transfers = [
//     { userId: "u1", timestamp: "2024-01-01T09:00:00Z", bytes: 50000000, direction: "download" }, // 50MB 
//     { userId: "u1", timestamp: "2024-01-01T10:00:00Z", bytes: 150000000, direction: "download" }, // 150MB
//     { userId: "u1", timestamp: "2024-01-01T11:00:00Z", bytes: 300000000, direction: "upload" }, // 300MB
//     { userId: "u2", timestamp: "2024-01-01T09:00:00Z", bytes: 10000000, direction: "download" }, // 10MB
//   ]
//   thresholdBytes = 200000000 (200MB)
//   windowHours = 24
// Output: [{ userId: "u1", totalBytes: 500000000 }]

type DataTransfer = {
  userId: string;
  timestamp: string;
  bytes: number;
  direction: "upload" | "download";
};

type FlaggedUser = {
  userId: string;
  totalBytes: number;
};

// function - create userActivityMap

// function - window pointers function

function detectDataExfiltration(
  transfers: DataTransfer[],
  thresholdBytes: number,
  windowHours: number
): FlaggedUser[] {
  // windowHours to ms
  const windowMs = windowHours * 60 * 60 * 1000 

  // create a userActivityMap. Mapping data transfer activity by user
    const userActivityMap = new Map<string, {bytes: number, time:number}[]>()
    for (const t of transfers) {
        const time = new Date(t.timestamp).getTime();
        if (!userActivityMap.has(t.userId)) userActivityMap.set(t.userId, []);
        userActivityMap.get(t.userId)!.push({bytes: t.bytes, time})
    }

  const flaggedUsers: FlaggedUser[] = []

  // loop through each user
  for (const [userId, transfers] of userActivityMap) {
      transfers.sort((a, b) => a.time - b.time)
      let totalBytes = 0
      let left = 0

      // for loop by transfer t for user
      for (let right = 0; right < transfers.length; right++) {
          // create window with left and right pointers
          while (transfers[right].time - transfers[left].time > windowMs) {
            // while out of windowHours, increment left, decrement biteTransfer
            totalBytes -= transfers[left].bytes
            left++
          }
          // increment biteTransfer by right.bytes
          totalBytes += transfers[right].bytes
          // if over threshold, add to flaggedUsers array (t.userId, t.totalBytes)
          if (totalBytes > thresholdBytes) {
            flaggedUsers.push({userId, totalBytes})
            break;
          }
      }
  }
  
  // return flaggedUsers
  return flaggedUsers;
}

// Test case
const transfers: DataTransfer[] = [
  { userId: "u1", timestamp: "2024-01-01T09:00:00Z", bytes: 50000000, direction: "download" },
  { userId: "u1", timestamp: "2024-01-01T10:00:00Z", bytes: 150000000, direction: "download" },
  { userId: "u1", timestamp: "2024-01-01T11:00:00Z", bytes: 300000000, direction: "upload" },
  { userId: "u2", timestamp: "2024-01-01T09:00:00Z", bytes: 10000000, direction: "download" },
];

console.log(detectDataExfiltration(transfers, 200000000, 24));

export { };

