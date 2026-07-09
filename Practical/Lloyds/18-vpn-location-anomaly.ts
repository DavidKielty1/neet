// 🧠 Scenario
// Unusual VPN usage patterns or geographic anomalies can indicate account compromise
// or unauthorized access attempts.

// Problem:
// Detect suspicious VPN connection patterns:
// - Connections from unusual countries/regions for the user
// - Rapid location changes (impossible travel)
// - VPN connections from high-risk countries
// - First-time location access without prior travel notification

// Input:
// Array of VPN connection events with userId, timestamp, country, city, IP address.
// Array of user's typical locations (baseline).
// List of high-risk countries.

// Output:
// Array of flagged users with suspicious location patterns.

// Example:
// Input:
//   connections = [
//     { userId: "u1", timestamp: "2024-01-01T09:00:00Z", country: "UK", city: "London", ip: "192.168.1.1" },
//     { userId: "u1", timestamp: "2024-01-01T09:30:00Z", country: "Russia", city: "Moscow", ip: "10.0.0.1" }, // Suspicious!
//     { userId: "u2", timestamp: "2024-01-01T10:00:00Z", country: "UK", city: "Leeds", ip: "172.16.0.1" },
//   ]
//   userBaselines = [
//     { userId: "u1", typicalCountries: ["UK", "France"], typicalCities: ["London", "Paris"] },
//     { userId: "u2", typicalCountries: ["UK"], typicalCities: ["Leeds", "Edinburgh"] },
//   ]
//   highRiskCountries = ["Russia", "North Korea", "Iran"]
// Output: [{ userId: "u1", suspiciousConnections: [{ country: "Russia", reason: "high_risk_country" }] }]

type VPNConnection = {
  userId: string;
  timestamp: string;
  country: string;
  city: string;
  ip: string;
};

type UserBaseline = {
  userId: string;
  typicalCountries: string[];
  typicalCities: string[];
};

type SuspiciousConnection = {
  country: string;
  city: string;
  timestamp: string;
  reason: "high_risk_country" | "unusual_location" | "impossible_travel";
};

type FlaggedUser = {
  userId: string;
  suspiciousConnections: SuspiciousConnection[];
};

function detectVPNLocationAnomaly(
  connections: VPNConnection[],
  userBaselines: UserBaseline[],
  highRiskCountries: string[]
): FlaggedUser[] {
  // Your implementation here
  return [];
}

// Test case
const connections: VPNConnection[] = [
  { userId: "u1", timestamp: "2024-01-01T09:00:00Z", country: "UK", city: "London", ip: "192.168.1.1" },
  { userId: "u1", timestamp: "2024-01-01T09:30:00Z", country: "Russia", city: "Moscow", ip: "10.0.0.1" },
  { userId: "u2", timestamp: "2024-01-01T10:00:00Z", country: "UK", city: "Leeds", ip: "172.16.0.1" },
];

const userBaselines: UserBaseline[] = [
  { userId: "u1", typicalCountries: ["UK", "France"], typicalCities: ["London", "Paris"] },
  { userId: "u2", typicalCountries: ["UK"], typicalCities: ["Leeds", "Edinburgh"] },
];

console.log(detectVPNLocationAnomaly(connections, userBaselines, ["Russia", "North Korea", "Iran"]));

export { };

