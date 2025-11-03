I have a 1 hour long 'technical interview'coming up for a position: "Insider Risk Management Software Engineer" at Lloyds. This is a mid-level position for about 2-4 years of experience.

I want to make up some technical interview scenarios to practice for this. First I will share the job description for domain specific inspiration, then have a guide on how to make practice questions.Job description:

"
About the job

End Date

Thursday 23 October 2025

Salary Range

£47,790 - £71,685

We support flexible working – click here for more information on flexible working options

Flexible Working Options

Hybrid Working, Job Share

Job Description Summary

Job Description

JOB TITLE: Insider Risk Software Engineer

SALARY: £47,790 - £53,100

LOCATION(S): Edinburgh, Leeds

HOURS: Full-time

WORKING PATTERN: Our work style is hybrid, which involves spending at least two days per week, or 40% of our time, at one of our offices.

About This Opportunity

At Lloyds Banking Group, we’re moving to the next stages of our digital transformation, and it’s our job within the Chief Security Office (CSO) to ensure that we keep our customers, colleagues and assets safe from threat

Insider Risk Management, within the Chief Security Office, brings together insider analysts and engineers to lead the Group's Insider Strategy – designing, building and running detection controls, coordinating the Group’s insider community and leading on industry discussions.

This role offers the opportunity to

    Design and build industry leading insider tools to help detect potential events
    Embed AI and Machine learning into our detection and response capability
    Explore and evaluate other vendor solutions to improve our overall insider tool set
    Identify and implement opportunities for process improvements, using automation and sophisticated analytics to improve the efficiency of our insider risk management program using agile and customer focused tools and techniques.

Why Lloyds Banking Group

We’re on an exciting journey to transform our Group and the way we’re shaping finance for good. We’re focusing on the future, investing in our technologies, workplaces, and colleagues to make our Group a great place for everyone. Including you.

What You’ll Need

We understand no one can be an expert in every aspect of software engineering. So, if you have a strong technical background, we’d like to hear from you.

Specifically, we’re looking for:

    Experience in developing high quality, testable, re-usable and modular code with a range of programming languages, frameworks, and technologies, e.g. JavaScript, TypeScript, ReactJS, Java and related API frameworks
    Integrating RESTful APIs into dynamic and data driven front ends with ReactJS and NextJS
    Proficiency in data analysis and techniques to model use cases and detect anomalies using Data Flow and Big Query in GCP
    Container Technologies (Docker, Kubernetes) and experience with cloud platforms such as GCP

And any experience of this would be really useful:

    Understanding of the benefits and risks of AI and machine learning and appropriate control designs
    GIT source code management and running concurrent change on a large code base
    Familiarity with insider threat management frameworks and standard methodologies

About Working For Us

Our ambition is to be the leading UK business for diversity, equity and inclusion supporting our customers, colleagues and communities and we’re committed to creating an environment in which everyone can thrive, learn and develop.

We were one of the first major organisations to set goals on diversity in senior roles, create a menopause health package, and a dedicated Working with Cancer Initiative.

We offer reasonable workplace adjustments for colleagues with disabilities, including flexibility in office attendance, location and working patterns. And, as a Disability Confident Leader, we guarantee interviews for a fair and proportionate number of applicants who meet the minimum criteria for the role with a disability, long-term health or neurodivergent condition through the Disability Confident Scheme.

We provide reasonable adjustments throughout the recruitment process to reduce or remove barriers. Just let us know what you need.

We Also Offer a Wide-ranging Benefits Package, Which Includes…

    A generous pension contribution of up to 15%
    An annual bonus award, subject to Group performance
    Share schemes including free shares
    Benefits you can adapt to your lifestyle, such as discounted shopping
    28 days’ holiday, with bank holidays on top
    A range of wellbeing initiatives and generous parental leave policies

If you’re excited by the thought of becoming part of our team, get in touch. We’d love to hear from you!

At Lloyds Banking Group, we're driven by a clear purpose; to help Britain prosper. Across the Group, our colleagues are focused on making a difference to customers, businesses and communities. With us you'll have a key role to play in shaping the financial services of the future, whilst the scale and reach of our Group means you'll have many opportunities to learn, grow and develop.

We keep your data safe. So, we'll only ever ask you to provide confidential or sensitive information once you have formally been invited along to an interview or accepted a verbal offer to join us which is when we run our background checks. We'll always explain what we need and why, with any request coming from a trusted Lloyds Banking Group person.

We're focused on creating a values-led culture and are committed to building a workforce which reflects the diversity of the customers and communities we serve. Together we’re building a truly inclusive workplace where all of our colleagues have the opportunity to make a real difference.
"

A question example can also be seen at "loginBurstDetection.ts".

# Guide: Creating Low-Medium Domain-Realistic “LeetCode-style” Questions

## Purpose

This document provides guidance for designing **low-to-medium difficulty coding problems** that are:

- Realistic in a financial / insider risk / security domain.
- Solvable using **arrays, strings, hashmaps, trees**, and standard algorithms.
- Suitable for technical interviews targeting candidates in TypeScript / JavaScript.

The goal is **not to mimic complex distributed systems** but to evaluate problem-solving, algorithmic thinking, and clean code practices.

---

## 1. Identify the Domain Context

Choose a **domain scenario** that is:

- Relevant to the job description.
- Realistic enough to be believable.
- Does not require external libraries or frameworks for the core solution.

**Examples for Insider Risk / Security Domain:**

- Employee login monitoring (`login events`, suspicious bursts)
- File access events (`downloads`, `deletes`)
- Transaction monitoring (`high-value transfers`, multiple transfers in short intervals)
- API usage or request patterns (`rate-limiting`, anomaly detection)
- User behavior sequences (e.g., actions per session)

> Tip: Keep entities simple (e.g., `userId`, `timestamp`, `action`) so candidates focus on algorithmic thinking.

---

## 2. Identify Core Data Structures

Pick **1–2 primary structures** from these categories:

| Category                | Examples                                                     |
| ----------------------- | ------------------------------------------------------------ |
| Arrays / Lists          | Event logs, transaction lists, sequences of actions          |
| Hashmaps / Sets         | Count per user, flagging, de-duplication                     |
| Strings                 | User input patterns, file paths, passwords                   |
| Trees / Graphs          | Organizational hierarchies, relationships, BFS/DFS scenarios |
| Heaps / Priority Queues | Top-N users, rate-based alerts                               |

---

## 3. Choose the Algorithmic Focus

**Low-Medium questions** should be solvable using one or more of:

- **Sliding window / two pointers**  
  E.g., find bursts, detect repeated actions within a time frame.
- **Hashmaps / Sets**  
  E.g., count occurrences, check uniqueness, map users → counts.
- **Simple recursion / DFS / BFS**  
  E.g., traversing a tree of user permissions, BFS over access hierarchy.
- **Greedy approaches**  
  E.g., flagging the first user who violates a threshold.
- **Sorting + processing**  
  E.g., sort events by timestamp before applying a sliding window.

> Avoid highly complex graph algorithms or advanced data structures (segment trees, AVL trees) unless role explicitly requires them.

---

## 4. Define Inputs and Outputs

- Inputs should be **plain objects / arrays** with minimal nesting.
- Include all necessary information in the input (timestamps, user IDs, actions).
- Outputs should be simple:
  - Array of flagged users
  - Count / integer
  - Boolean or map of counts

**Example input shape:**

```typescript
type Event = {
  userId: string;
  timestamp: string; // ISO
  action: "READ" | "WRITE" | "DELETE";
};
```

## 5. Build a Realistic Scenario + Prompt

Structure the question like this:

1. **Scenario Description** – contextualize the problem in business or security terms.
2. **Problem Statement** – clearly state what to compute or detect.
3. **Input / Output** – provide type definitions or JSON examples.
4. **Example Case(s)** – include 1–2 examples with expected output.
5. **Optional Hints / Constraints** – mention expected time complexity or O(n) solution if relevant.

**Example Skeleton:**

```
Scenario:
You monitor employee login events for suspicious bursts.

Problem:
Detect users who log in more than K times within any T-minute window.

Input:
Array of login events (userId, timestamp), integers K and T.

Output:
Array of flagged user IDs.

Example:
Input: [...], K = 3, T = 15
Output: ["u1", "u3"]
```

---

## 6. Include Realistic Constraints

- **Number of events**: `n <= 10^4` or `10^5` (suitable for coding in 30–45 mins)
- **Timestamps**: ISO 8601 strings (can convert to numbers for arithmetic)
- **Simple actions**: `"READ" | "WRITE" | "DELETE"`
- **Thresholds**: integers (K) and window sizes (T in minutes)

---

## 7. Encouraged Variations

- **Sliding window / burst detection** → multiple actions in a short period
- **Sequence correlation** → e.g., login → file download → logout
- **Counting / ranking** → top N users by action frequency
- **Tree / graph traversal** → hierarchy of approvals / accesses
- **Simple anomaly detection** → unusually high access counts, repeated patterns

---

## 8. Tips for Writing Questions

- Use realistic variable names: `userId`, `timestamp`, `filePath`, `action`.
- Make the problem self-contained: no external dependencies needed.
- Ensure O(n) or O(n log n) solution is possible — avoid trivially solvable brute force with O(n²).
- Keep the example small enough to verify manually.

**Consider follow-up variations:**

- Sliding window with multiple thresholds
- Combining multiple event types (login + download)
- Counting unique vs total actions

---

## 9. What Candidates Should Demonstrate

- Correct data structure choice (array, hashmap, set, etc.)
- Ability to sort / group / aggregate events
- Proper use of sliding window / two pointers / BFS / DFS
- Writing clean, modular, testable TypeScript code
- Clear reasoning about time & space complexity
- Optional: thinking about real-time / streaming extensions

---

## 10. References for Inspiration

**LeetCode easy/medium categories:**

- Arrays / HashMaps: https://leetcode.com/problemset/all/?difficulty=Easy
