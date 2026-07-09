// 🧠 Scenario
// Insiders may use email to exfiltrate sensitive data by sending attachments to personal
// or competitor email addresses.

// Problem:
// Detect suspicious email patterns:
// - Large attachments sent to personal email domains (gmail, yahoo, etc.)
// - Multiple emails with attachments to the same external recipient
// - Attachments with sensitive file types (.sql, .csv, .xlsx, .pdf with financial data)
// - Emails sent outside business hours with attachments

// Input:
// Array of email events with userId, timestamp, recipient, attachmentSize, attachmentType, and domain.

// Output:
// Array of flagged users with details of suspicious emails.

// Example:
// Input:
//   emails = [
//     { userId: "u1", timestamp: "2024-01-01T10:00:00Z", recipient: "user@gmail.com", attachmentSize: 5000000, attachmentType: "xlsx" },
//     { userId: "u1", timestamp: "2024-01-01T10:30:00Z", recipient: "user@gmail.com", attachmentSize: 3000000, attachmentType: "pdf" },
//     { userId: "u2", timestamp: "2024-01-01T10:00:00Z", recipient: "colleague@company.com", attachmentSize: 100000, attachmentType: "docx" },
//   ]
//   personalDomains = ["gmail.com", "yahoo.com", "hotmail.com", "outlook.com"]
//   sensitiveFileTypes = ["sql", "csv", "xlsx", "mdb"]
// Output: [{ userId: "u1", suspiciousEmails: 2, totalAttachmentSize: 8000000, externalRecipients: ["user@gmail.com"] }]

type Email = {
  userId: string;
  timestamp: string;
  recipient: string;
  attachmentSize: number; // in bytes
  attachmentType: string;
};

type FlaggedUser = {
  userId: string;
  suspiciousEmails: number;
  totalAttachmentSize: number;
  externalRecipients: string[];
  sensitiveFileTypes: string[];
};

function detectEmailExfiltration(
  emails: Email[],
  personalDomains: string[],
  sensitiveFileTypes: string[],
  sizeThreshold: number = 1000000 // 1MB
): FlaggedUser[] {
  // Your implementation here
  return [];
}

// Test case
const emails: Email[] = [
  { userId: "u1", timestamp: "2024-01-01T10:00:00Z", recipient: "user@gmail.com", attachmentSize: 5000000, attachmentType: "xlsx" },
  { userId: "u1", timestamp: "2024-01-01T10:30:00Z", recipient: "user@gmail.com", attachmentSize: 3000000, attachmentType: "pdf" },
  { userId: "u2", timestamp: "2024-01-01T10:00:00Z", recipient: "colleague@company.com", attachmentSize: 100000, attachmentType: "docx" },
];

console.log(
  detectEmailExfiltration(
    emails,
    ["gmail.com", "yahoo.com", "hotmail.com", "outlook.com"],
    ["sql", "csv", "xlsx", "mdb"]
  )
);

export { };

