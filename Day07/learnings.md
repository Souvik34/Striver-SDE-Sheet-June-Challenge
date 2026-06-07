# DSA Learnings – Hashing & Two Pointers

## Overview
This document contains key learnings from solving important array problems focusing on hashing, sorting, and two-pointer techniques.

---

## 1. Two Sum

### Problem
Find indices of two numbers in an array that add up to a target.

### Approach
- Use a HashMap to store value → index mapping
- For each element, check if (target - current) exists in map

### Key Insight
- Convert O(n²) brute force into O(n) using hashing
- Trade space for time optimization

### Complexity
- Time: O(n)  
- Space: O(n)

---

## 2. Four Sum

### Problem
Find all unique quadruplets that sum to a target value.

### Approach
- Sort the array
- Fix two pointers (i, j)
- Use two-pointer technique (l, r) for remaining two numbers
- Skip duplicates carefully

### Key Insight
- Reduce 4Sum → 2Sum using sorting + two pointers
- Duplicate handling is critical for correctness

### Complexity
- Time: O(n³)  
- Space: O(1) (excluding output)

---

## 3. Longest Consecutive Sequence

### Problem
Find the length of the longest consecutive elements sequence.

### Approach
- Insert all elements into a HashSet
- Start sequence only if (num - 1) is not present
- Expand forward using num + 1 checks

### Key Insight
- Only process sequence starting points
- Each element is visited at most once → O(n)

### Complexity
- Time: O(n)  
- Space: O(n)

---

## Key Patterns Learned

- HashMap for fast lookup and complement search
- HashSet for O(1) existence checks
- Two-pointer technique after sorting
- Duplicate handling in sorted arrays
- Reducing complex problems into simpler subproblems

---

## Summary
These problems reinforce core interview patterns:
- Hashing for optimization
- Sorting + two pointers for combination problems
- Sequence detection using set-based logic
