# Day 2 - Array Pattern Revision

## Problems Solved

### 1. Maximum Subarray

**LeetCode 53**

#### Approach

Used Kadane's Algorithm to find the maximum sum of a contiguous subarray.

#### Time Complexity

O(n)

#### Space Complexity

O(1)

#### Pattern

Kadane's Algorithm

#### Key Learning

At every index, decide whether to start a new subarray or continue the existing one.

---

### 2. Sort Colors

**LeetCode 75**

#### Approach

Used a frequency counting technique with a HashMap.

1. Count occurrences of 0, 1, and 2.
2. Rewrite the array based on their frequencies.

#### Time Complexity

O(n)

#### Space Complexity

O(1)

#### Pattern

Counting / Frequency Array

#### Key Learning

When the range of values is small and fixed, counting frequencies can provide a simple and efficient solution.

#### Note

A more optimized interview-preferred solution is the Dutch National Flag Algorithm, which sorts the array in a single pass using three pointers.

---

### 3. Best Time to Buy and Sell Stock

**LeetCode 121**

#### Approach

Tracked the minimum stock price seen so far and calculated the maximum possible profit at each step.

#### Time Complexity

O(n)

#### Space Complexity

O(1)

#### Pattern

Running Minimum

#### Key Learning

The best selling opportunity depends on the lowest buying price encountered before the current day.

---

## Patterns Revised Today

* Kadane's Algorithm
* Counting / Frequency Technique
* Running Minimum Pattern
* Array Traversal Optimization

## Progress

Day 2 Complete ✅

Focused on strengthening array fundamentals and understanding common interview patterns through consistent practice.
