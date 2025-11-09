// 🧠 Scenario
// USB and removable media can be used to exfiltrate data physically.
// Many organizations restrict or monitor USB device usage for insider risk management.

// Problem:
// Detect suspicious USB device activity:
// - Unauthorized device usage (devices not on whitelist)
// - Large file transfers to USB devices
// - USB usage during unusual hours or by users who don't typically use them
// - Multiple USB devices used in short time period

// Input:
// Array of USB events with userId, deviceId, timestamp, bytesTransferred, and action (connected/disconnected/transfer).
// Array of authorized devices per user.

// Output:
// Array of flagged users with suspicious USB activity.

// Example:
// Input:
//   usbEvents = [
//     { userId: "u1", deviceId: "dev1", timestamp: "2024-01-01T10:00:00Z", bytesTransferred: 0, action: "connected" },
//     { userId: "u1", deviceId: "dev1", timestamp: "2024-01-01T10:05:00Z", bytesTransferred: 500000000, action: "transfer" }, // 500MB
//     { userId: "u1", deviceId: "dev1", timestamp: "2024-01-01T10:30:00Z", bytesTransferred: 0, action: "disconnected" },
//     { userId: "u2", deviceId: "dev2", timestamp: "2024-01-01T10:00:00Z", bytesTransferred: 0, action: "connected" },
//   ]
//   authorizedDevices = [
//     { userId: "u1", authorizedDeviceIds: [] }, // No authorized devices
//     { userId: "u2", authorizedDeviceIds: ["dev2"] },
//   ]
//   transferThreshold = 100000000 (100MB)
// Output: [{ userId: "u1", unauthorizedDevices: ["dev1"], totalTransferred: 500000000, deviceCount: 1 }]

type USBEvent = {
  userId: string;
  deviceId: string;
  timestamp: string;
  bytesTransferred: number;
  action: "connected" | "disconnected" | "transfer";
};

type AuthorizedDevices = {
  userId: string;
  authorizedDeviceIds: string[];
};

type FlaggedUser = {
  userId: string;
  unauthorizedDevices: string[];
  totalTransferred: number;
  deviceCount: number;
  largeTransfers: number;
};

function detectUSBDeviceAbuse(
  usbEvents: USBEvent[],
  authorizedDevices: AuthorizedDevices[],
  transferThreshold: number
): FlaggedUser[] {
  // Your implementation here
  return [];
}

// Test case
const usbEvents: USBEvent[] = [
  { userId: "u1", deviceId: "dev1", timestamp: "2024-01-01T10:00:00Z", bytesTransferred: 0, action: "connected" },
  { userId: "u1", deviceId: "dev1", timestamp: "2024-01-01T10:05:00Z", bytesTransferred: 500000000, action: "transfer" },
  { userId: "u1", deviceId: "dev1", timestamp: "2024-01-01T10:30:00Z", bytesTransferred: 0, action: "disconnected" },
  { userId: "u2", deviceId: "dev2", timestamp: "2024-01-01T10:00:00Z", bytesTransferred: 0, action: "connected" },
];

const authorizedDevices: AuthorizedDevices[] = [
  { userId: "u1", authorizedDeviceIds: [] },
  { userId: "u2", authorizedDeviceIds: ["dev2"] },
];

console.log(detectUSBDeviceAbuse(usbEvents, authorizedDevices, 100000000));

export { };

