# Agent instructions (Cursor / AI)

## What this repo is

LeetCode and interview preparation: pattern-organized problems, learner-facing code skeletons with commented reference solutions.

## Rules precedence (Cursor)

When guidance conflicts: **Team Rules → Project Rules → User Rules**. Within this repo, project rules in `.cursor/rules/` apply.

## Practice file conventions

- **Layout, spacers, `main` vs no `main`:** `.cursor/rules/practice-file-layout.mdc`
- **LeetCode black-box API** (`guess`, `isBadVersion`, etc.): `.cursor/rules/leetcode-api-practice.mdc`
- **Always-on pointer** to use those when working in practice trees: `.cursor/rules/repo-leetcode-context.mdc`
- **Java compile/run cleanup:** after `javac` / `java`, delete generated `*.class` files (see `.cursor/rules/cleanup-java-classfiles.mdc`)

Per-pattern `README.md` files may add pattern-specific notes; they override generic layout only where they explicitly differ.

## Human-facing project guide

Commands (Python/TS), structure overview, naming: **CLAUDE.md** at the repo root.

## Skills (Cursor)

**Skills** are instructions packaged as **`SKILL.md` inside a folder** whose name is the skill identity (parent folders like `workflow/` are only for your organization).

- **Repo-wide:** `.cursor/skills/<skill-name>/SKILL.md`
- **Nested (monorepos):** `some/package/.cursor/skills/<skill-name>/SKILL.md` — Cursor scopes that skill to work under that subtree (similar to setting `paths`).

**Frontmatter (typical):**

- `name` (required) — must match the **folder** name; lowercase, hyphens.
- `description` (required) — what it does and **when** to use it (drives auto-inclusion).
- `paths` (optional) — globs (`**/*.py` or a comma-separated string) to surface the skill only when matching files are in context. Omit for always-eligible skills.
- `disable-model-invocation: true` — skill applies only when you explicitly invoke it (e.g. `/skill-name`), not from relevance alone.

**Extras:** optional `scripts/`, `references/`, `assets/` next to `SKILL.md` for runnable helpers or long docs (keeps the main file short).

**Rules vs skills in this repo:** Practice-file shape is encoded in **`.cursor/rules/*.mdc`** (always-on pointer + gated globs). Use a **skill** when you want a **multi-step playbook** (e.g. “add a new problem from LeetCode description”), optional **scripts**, or **`paths`**-style scoping without splitting into many rule files. Cursor can help migrate “apply intelligently” rules and slash commands to skills via **`/migrate-to-skills`** (review output under `.cursor/skills/`).

**Discovery:** Cursor Settings → Rules → Skills (Agent Decides). Remote install: Add Rule → Remote Rule (GitHub) if you pull skills from another repo.

## Hooks (Cursor)

**Hooks** let you run **commands** (or, in some configurations, **prompt-based** checks) when Cursor hits specific lifecycle events—separate from **rules** (static instructions) and **skills** (packaged playbooks).

**What they are good for:** auto-formatting after edits, auditing shell/MCP usage, blocking risky commands, redacting Tab reads, session telemetry, `workspaceOpen` setup. Cursor can also load **third-party** hook setups (e.g. Claude Code–style hooks); see Cursor’s “Third Party Hooks” doc for compatibility.

**Where config lives:**

| Level       | Typical path                | Notes                                                                                                                       |
| ----------- | --------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| **Project** | `<repo>/.cursor/hooks.json` | Commit for the team; **cwd** for commands is the **project root**. Reference scripts as **`.cursor/hooks/your-script.sh`**. |
| **User**    | `~/.cursor/hooks.json`      | **cwd** is **`~/.cursor/`**; use `./hooks/...` under that tree.                                                             |

When multiple levels apply, Cursor **merges** them; priority is **Enterprise → Team → Project → User** (see Cursor docs for enterprise/team paths).

**Surfaces (simplified):**

- **Agent / Chat** — e.g. `sessionStart` / `sessionEnd`, `beforeShellExecution` / `afterShellExecution`, `beforeMCPExecution` / `afterMCPExecution`, `preToolUse` / `postToolUse`, `beforeReadFile`, `afterFileEdit`, `subagentStart` / `subagentStop`, `stop`, etc.
- **Tab (inline)** — `beforeTabFileRead`, `afterTabFileEdit` (different policy from Agent is intentional).
- **App** — `workspaceOpen` (no full agent session context).

**Command hooks (usual case):** stdin is **JSON** input for the event; stdout should be **JSON** when the hook returns decisions. **Exit 0** = success; **exit 2** = **block** the action (compat with Claude Code). Other failures often **fail-open** unless you set **`failClosed: true`** on that hook entry. Optional **`matcher`** limits which tools/commands fire the hook.

**Optional for this repo:** e.g. `afterFileEdit` → run **Black** on saved `*.py` under practice trees, or a small audit script—only if you want repo-enforced automation (this repo does not ship `hooks.json` by default).

**Debugging:** Cursor **Settings → Hooks** (and the Hooks **output** channel). Config reloads on save; restart Cursor if hooks never attach.

## Subagents (Cursor)

Cursor can run **subagents**: separate agent runs with a **clean context** (no automatic access to the parent chat). The parent must put needed facts in the prompt. Built-in patterns (e.g. codebase exploration, noisy shell/browser work) are delegated automatically when appropriate.

| Prefer **subagents** when…                                | Prefer **rules / skills** when…                                   |
| --------------------------------------------------------- | ----------------------------------------------------------------- |
| You want **context isolation** (long research, huge logs) | The task is **single-purpose** and repeatable                     |
| You need **parallel** workstreams                         | One-shot edits with **project rules** already spell out the shape |
| You want an **independent check** (e.g. verifier)         | No separate context window is needed                              |

**Project custom subagents:** add markdown with YAML frontmatter under **`.cursor/agents/`** (commit these so the team shares them). User-wide: `~/.cursor/agents/`. Each file typically has `name`, `description` (this is how Agent decides to delegate—make it **specific**), optional `model`, `readonly`, `is_background`.

**Useful pattern for this repo:** a small **verifier** subagent whose description says to confirm new/edited practice files match **`.cursor/rules/practice-file-layout.mdc`** and **`leetcode-api-practice.mdc`** (spacer length, no duplicate classes, API problems use `Solution extends ApiClass` with bottom stub only, etc.) and to run compile/tests when relevant.

**Practices:** one responsibility per subagent, short prompt body, sharp `description`. Avoid dozens of vague agents. For “always do X when I type Y,” a **rule** or **skill** is often enough.

**Invocation:** mention a subagent by name in chat (e.g. “use the verifier…”) or use slash syntax if your Cursor build supports it (e.g. `/verifier`). **Foreground** subagents block until done; **background** (`is_background: true`) is for long or parallel runs—trade-off: extra token usage per parallel agent.
