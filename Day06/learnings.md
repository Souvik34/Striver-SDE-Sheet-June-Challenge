# DSA Daily Grind - Unique Paths, Reverse Pairs & Majority Element II

## 1. Unique Paths

### Problem

Given an `m x n` grid, a robot starts at the top-left corner and can only move either right or down. Find the total number of unique paths to reach the bottom-right corner.

### Approach

* Use Dynamic Programming.
* Let `dp[i][j]` represent the number of ways to reach cell `(i, j)`.
* A cell can be reached either from the top cell or the left cell.

**Transition:**

```text
dp[i][j] = dp[i-1][j] + dp[i][j-1]
```

### Key Learning

* Classic Dynamic Programming problem.
* Understanding state transition is more important than memorizing the solution.
* Can also be solved using Combinatorics.

### Time Complexity

```text
O(m * n)
```

### Space Complexity

```text
O(n)  (Optimized DP)
```

---

## 2. Reverse Pairs

### Problem

Count pairs `(i, j)` such that:

```text
i < j
nums[i] > 2 * nums[j]
```

### Approach

* Use Merge Sort.
* Recursively sort both halves.
* Before merging, count valid reverse pairs using a two-pointer technique.
* Since both halves are sorted, counting can be done efficiently.

### Key Learning

* Extension of the Count Inversions problem.
* Demonstrates how Merge Sort can solve counting problems efficiently.
* Important to use `2L * nums[j]` to avoid integer overflow.

### Time Complexity

```text
O(n log n)
```

### Space Complexity

```text
O(n)
```

---

## 3. Majority Element II

### Problem

Find all elements that appear more than:

```text
⌊n / 3⌋ times
```

### Approach

* Use the Boyer-Moore Voting Algorithm.
* At most two elements can occur more than `n/3` times.
* Maintain two candidates and their frequencies.
* Verify the candidates in a second pass.

### Key Learning

* Generalization of the Majority Element problem.
* Candidate elimination is more powerful than frequency counting.
* Achieves optimal time and space complexity.

### Time Complexity

```text
O(n)
```

### Space Complexity

```text
O(1)
```

---

# Overall Learnings

* Dynamic Programming state transitions.
* Combinatorial thinking for grid problems.
* Merge Sort based counting techniques.
* Two-pointer optimization.
* Boyer-Moore Voting Algorithm.
* Space optimization strategies.
* Pattern recognition for coding interviews.

## Problems Solved

* Unique Paths
* Reverse Pairs
* Majority Element II

### Tech Stack

`Java` | `DSA` | `Algorithms` | `Problem Solving`

---

Consistency > Intensity. Keep solving, keep learning. 🚀
