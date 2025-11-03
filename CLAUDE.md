# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Repository Purpose

This is a LeetCode practice and technical interview preparation repository focused on the "Blind 75" curated problem set. It contains algorithmic problems organized by patterns and difficulty levels, with solutions primarily in Python and TypeScript.

## Repository Structure

The codebase is organized into several key directories:

- **`Blind75-Practice/`** - Pattern-based learning approach with problems organized by technique (two-pointers, sliding window, hash maps, dynamic programming, DFS, BFS, binary search)
- **`Blind75-Real/`** - The actual curated Blind75 problems with implementations
- **`beginner/`** - Entry-level problems organized by data structure/algorithm type
- **`Easy-Varied/`** - Collection of varied easy-level practice problems
- **`Realistic-Technical/`** - Domain-specific interview questions (e.g., Lloyds Banking Group insider risk management scenarios)

Each major directory typically contains a README.md explaining the pattern/approach and problem-solving strategies.

## Development Commands

### Running Code

**TypeScript:**
```bash
npm start path/to/file.ts
```

**Python:**
```bash
python path/to/file.py
```

### Code Quality

**Python Formatting (Black):**
```bash
black path/to/file.py
```

**Python Linting (Flake8):**
```bash
flake8 path/to/file.py
```

Configuration: Max line length 88, ignores E203, W503, E501

## Code Architecture

### Pattern-Based Organization

Problems are grouped by algorithmic pattern rather than by problem name. When working on solutions:

1. **Identify the pattern first** (two-pointers, sliding window, hash map, etc.)
2. **Reference the pattern's README** for technique explanations
3. **Follow the established file naming convention**: `##-problem-name.{py|ts}`

### Language Conventions

- **Python**: Primary language for most solutions. Follow Black formatting (88 char line length)
- **TypeScript**: Used for beginner sections and some advanced problems. ESNext target, ESM modules

### Study Guide Integration

The `Blind75.md` file contains the master study plan with:
- 8-week structured timeline
- Pattern breakdown and complexity analysis
- Daily routines and success metrics

When adding new problems, ensure they align with the patterns documented in this guide.

### Realistic Technical Interview Problems

The `Realistic-Technical/` directory contains domain-specific problems (e.g., financial services, security). These problems simulate real-world scenarios:
- Include detailed business context
- Focus on practical algorithmic applications
- Often involve time-series data, pattern detection, or optimization

Reference `_test-creation-guide.md` in subdirectories for creating new domain-realistic questions.

## Git Workflow

- **Main branch**: Not specified (working on `development`)
- **Current branch**: `development`
- Recent commits focus on sliding window, dynamic programming, and directory organization

## Configuration Files

- **`tsconfig.json`**: TypeScript compilation settings (target: ESNext, output: dist/)
- **`pyproject.toml`**: Python/Black configuration
- **`.flake8`**: Python linting rules
